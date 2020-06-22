package com.delarosa.teamdetail.di

import android.app.Application
import com.delarosa.common.BuildConfig
import com.delarosa.common.common.RetrofitBuild
import com.delarosa.data.datasource.*
import com.delarosa.data.repository.EventRepository
import com.delarosa.data.repository.LeagueRepository
import com.delarosa.data.repository.TeamRepository
import com.delarosa.teamdetail.data.database.PruebaDataBase
import com.delarosa.teamdetail.data.database.source.RoomEventDataSource
import com.delarosa.teamdetail.data.server.endpoints.EventService
import com.delarosa.teamdetail.data.server.source.RemoteEventDataSourceImpl


import com.delarosa.teamdetail.teamdetail.TeamDetailFragment
import com.delarosa.teamdetail.teamdetail.TeamDetailViewModel
import com.delarosa.usecases.GetEvents
import com.delarosa.usecases.GetTeam
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.qualifier.named
import org.koin.dsl.module

fun Application.initDI() {
    startKoin {
        androidLogger()
        androidContext(this@initDI)
        modules(listOf(presentationModule, dataModule, appModule))
    }
}

val presentationModule = module {

    scope(named<TeamDetailFragment>()) {
        viewModel { (id: String) ->
            TeamDetailViewModel(
                teamCode = id,
                getEvents = get(),
                getTeam = get(),
                uiDispatcher = get()
            )
        }
        scoped { GetEvents(eventRepository = get()) }
        scoped { GetTeam(teamRepository = get()) }
    }
}

val dataModule = module {
    factory { LeagueRepository(localLeagueDataSource = get(), remoteLeagueDataSource = get()) }
    factory { TeamRepository(localTeamDataSource = get(), remoteTeamDataSource = get()) }
    factory { EventRepository(localEventDataSource = get(), remoteEventDataSource = get()) }
}

val appModule = module {
    single { PruebaDataBase.build(get()) }
    single { RetrofitBuild(baseUrl = BuildConfig.BASE_URL) }
    single { get<RetrofitBuild>().retrofit.create(EventService::class.java) }
    single<CoroutineDispatcher> { Dispatchers.Main }
    factory<RemoteEventDataSource> { RemoteEventDataSourceImpl(eventService = get()) }
    factory<LocalEventDataSource> { RoomEventDataSource(db = get()) }
}