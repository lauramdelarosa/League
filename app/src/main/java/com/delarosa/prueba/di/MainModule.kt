package com.delarosa.prueba.di

import android.app.Application
import com.delarosa.data.datasource.*
import com.delarosa.data.repository.EventRepository
import com.delarosa.data.repository.LeagueRepository
import com.delarosa.data.repository.TeamRepository
import com.delarosa.prueba.BuildConfig
import com.delarosa.prueba.data.RetrofitBuild
import com.delarosa.prueba.data.database.PruebaDataBase
import com.delarosa.prueba.data.database.source.RoomEventDataSource
import com.delarosa.prueba.data.database.source.RoomLeagueDataSource
import com.delarosa.prueba.data.database.source.RoomTeamDataSource
import com.delarosa.prueba.data.server.endpoints.EventService
import com.delarosa.prueba.data.server.endpoints.LeagueService
import com.delarosa.prueba.data.server.endpoints.TeamService
import com.delarosa.prueba.data.server.source.RemoteEventDataSourceImpl
import com.delarosa.prueba.data.server.source.RemoteLeagueDataSourceImpl
import com.delarosa.prueba.data.server.source.RemoteTeamDataSourceImpl
import com.delarosa.prueba.ui.league.LeagueFragment
import com.delarosa.prueba.ui.league.LeagueViewModel
import com.delarosa.prueba.ui.team.TeamFragment
import com.delarosa.prueba.ui.team.TeamViewModel
import com.delarosa.prueba.ui.teamdetail.TeamDetailFragment
import com.delarosa.prueba.ui.teamdetail.TeamDetailViewModel
import com.delarosa.usecases.GetEvents
import com.delarosa.usecases.GetLeagues
import com.delarosa.usecases.GetTeam
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
    scope(named<LeagueFragment>()) {
        viewModel {
            LeagueViewModel(getLeagues = get(), uiDispatcher = get())
        }
        scoped { GetLeagues(leagueRepository = get()) }
    }
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
    single { get<RetrofitBuild>().retrofit.create(LeagueService::class.java) }
    single { get<RetrofitBuild>().retrofit.create(TeamService::class.java) }
    single { get<RetrofitBuild>().retrofit.create(EventService::class.java) }
    single<CoroutineDispatcher> { Dispatchers.Main }
    factory<RemoteTeamDataSource> { RemoteTeamDataSourceImpl(teamService = get()) }
    factory<RemoteEventDataSource> { RemoteEventDataSourceImpl(eventService = get()) }
    factory<RemoteLeagueDataSource> { RemoteLeagueDataSourceImpl(leagueService = get()) }
    factory<LocalTeamDataSource> { RoomTeamDataSource(db = get()) }
    factory<LocalLeagueDataSource> { RoomLeagueDataSource(db = get()) }
    factory<LocalEventDataSource> { RoomEventDataSource(db = get()) }
}