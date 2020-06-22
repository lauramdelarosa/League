package com.delarosa.team.di


import com.delarosa.data.repository.TeamRepository
import com.delarosa.team.team.TeamViewModel
import com.delarosa.usecases.GetTeams
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers


@Module
class TeamModule(private val leagueCode: String) {

    @Provides
    fun leagueViewModelProvider(
        leagueCode: String,
        getTeams: GetTeams,
        coroutineDispatcher: CoroutineDispatcher
    ) = TeamViewModel(leagueCode, getTeams, coroutineDispatcher)

    @Provides
    fun getDispatcher(): CoroutineDispatcher = Dispatchers.Main

    @Provides
    fun getTeamsRepository(teamRepository: TeamRepository) =
        GetTeams(teamRepository)
}
