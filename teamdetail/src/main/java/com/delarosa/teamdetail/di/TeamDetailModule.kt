package com.delarosa.teamdetail.di


import com.delarosa.data.repository.EventRepository
import com.delarosa.data.repository.LeagueRepository
import com.delarosa.data.repository.TeamRepository
import com.delarosa.teamdetail.teamdetail.TeamDetailViewModel
import com.delarosa.usecases.GetEvents
import com.delarosa.usecases.GetLeagues
import com.delarosa.usecases.GetTeam
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers


@Module
class TeamDetailModule(private val teamCode: String) {

    @Provides
    fun teamDetailViewModelProvider(
        teamCode: String,
        getTeam: GetTeam,
        getEvents: GetEvents,
        dispatcher: CoroutineDispatcher
    ) =
        TeamDetailViewModel(teamCode, getTeam, getEvents, dispatcher)

    @Provides
    fun getDispatcher(): CoroutineDispatcher = Dispatchers.Main

    @Provides
    fun getTeamRepository(teamRepository: TeamRepository) =
        GetTeam(teamRepository)

    @Provides
    fun getEventRepository(eventRepository: EventRepository) =
        GetEvents(eventRepository)
}
