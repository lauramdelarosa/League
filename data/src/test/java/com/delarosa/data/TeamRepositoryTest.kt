package com.delarosa.data

import com.delarosa.data.datasource.LocalTeamDataSource
import com.delarosa.data.datasource.RemoteTeamDataSource
import com.delarosa.data.repository.TeamRepository
import com.delarosa.testshared.mockedLeague
import com.delarosa.testshared.mockedTeam
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TeamRepositoryTest {

    @Mock
    lateinit var remoteTeamDataSource: RemoteTeamDataSource

    @Mock
    lateinit var localTeamDataSource: LocalTeamDataSource

    lateinit var teamRepository: TeamRepository

    @Before
    fun setUp() {
        teamRepository = TeamRepository(remoteTeamDataSource, localTeamDataSource)
    }

    @Test
    fun `remote team calls remoteTeamDataSource `() {
        runBlocking {
            val remoteTeam = listOf(mockedTeam.copy())
            val league= mockedLeague.copy()
            whenever(localTeamDataSource.isEmpty(league.code)).thenReturn(true)
            whenever(remoteTeamDataSource.getTeams(league.code)).thenReturn(
                ResultData.Success(
                    remoteTeam
                )
            )
            whenever(localTeamDataSource.getTeams(league.code)).thenReturn(remoteTeam)
            when (val result = teamRepository.getTeams(league.code)) {
                is ResultData.Success -> assertEquals(remoteTeam, result.data)
            }
        }
    }

}