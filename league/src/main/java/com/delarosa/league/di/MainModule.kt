package com.delarosa.league.di

import android.app.Application
import com.delarosa.data.datasource.*
import com.delarosa.data.repository.EventRepository
import com.delarosa.data.repository.LeagueRepository
import com.delarosa.data.repository.TeamRepository
import com.delarosa.common.common.RetrofitBuild
import com.delarosa.league.data.database.PruebaDataBase
import com.delarosa.league.data.database.source.RoomLeagueDataSource
import com.delarosa.league.league.LeagueFragment
import com.delarosa.league.league.LeagueViewModel
import com.delarosa.common.BuildConfig
import com.delarosa.league.data.server.endpoints.LeagueService
import com.delarosa.league.data.server.source.RemoteLeagueDataSourceImpl
import com.delarosa.usecases.GetLeagues
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
    scope(named<LeagueFragment>()) {
        viewModel {
            LeagueViewModel(getLeagues = get(), uiDispatcher = get())
        }
        scoped { GetLeagues(leagueRepository = get()) }
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
    single { get<RetrofitBuild>().retrofit.create(LeagueService::class.java) }
    single<CoroutineDispatcher> { Dispatchers.Main }

    factory<RemoteLeagueDataSource> { RemoteLeagueDataSourceImpl(leagueService = get()) }

    factory<LocalLeagueDataSource> { RoomLeagueDataSource(db = get()) }
}