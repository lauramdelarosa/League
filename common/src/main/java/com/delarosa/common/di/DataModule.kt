package com.delarosa.common.di


import com.delarosa.data.datasource.*
import com.delarosa.data.repository.EventRepository
import com.delarosa.data.repository.LeagueRepository
import com.delarosa.data.repository.TeamRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class DataModule {

    @Provides
    fun teamRepositoryProvider(
        remoteTeamDataSource: RemoteTeamDataSource,
        localTeamDataSource: LocalTeamDataSource
    ) = TeamRepository(remoteTeamDataSource, localTeamDataSource)

    @Provides
    fun leagueRepositoryProvider(
        remoteLeagueDataSource: RemoteLeagueDataSource,
        localLeagueDataSource: LocalLeagueDataSource
    ) = LeagueRepository(remoteLeagueDataSource, localLeagueDataSource)


    @Provides
    fun eventRepositoryProvider(
        remoteEventDataSource: RemoteEventDataSource,
        localEventDataSource: LocalEventDataSource
    ) = EventRepository(remoteEventDataSource, localEventDataSource)

}