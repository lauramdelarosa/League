package com.delarosa.team.di

import android.app.Application
import com.delarosa.common.BuildConfig
import com.delarosa.data.datasource.*
import com.delarosa.data.repository.EventRepository
import com.delarosa.data.repository.LeagueRepository
import com.delarosa.data.repository.TeamRepository
import com.delarosa.team.data.RetrofitBuild
import com.delarosa.team.data.database.PruebaDataBase
import com.delarosa.team.data.database.source.RoomTeamDataSource
import com.delarosa.team.data.server.endpoints.TeamService
import com.delarosa.team.data.server.source.RemoteTeamDataSourceImpl
import com.delarosa.team.team.TeamFragment
import com.delarosa.team.team.TeamViewModel
import com.delarosa.usecases.GetTeams
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

    scope(named<TeamFragment>()) {
        viewModel { (id: String) ->
            TeamViewModel(
                leagueCode = id,
                getTeams = get(),
                uiDispatcher = get()
            )
        }

        scoped { GetTeams(teamRepository = get()) }
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
    single { get<RetrofitBuild>().retrofit.create(TeamService::class.java) }
    single<CoroutineDispatcher> { Dispatchers.Main }
    factory<RemoteTeamDataSource> { RemoteTeamDataSourceImpl(teamService = get()) }
    factory<LocalTeamDataSource> { RoomTeamDataSource(db = get()) }
}