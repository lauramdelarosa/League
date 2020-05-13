package com.delarosa.data

import com.delarosa.data.datasource.RemoteTeamDataSource
import com.delarosa.data.repository.LeagueRepository
import com.delarosa.testshared.mockedIceCream
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class LeagueRepositoryTest {

   /* @Mock
    lateinit var remoteTeamDataSource: RemoteTeamDataSource
    lateinit var leagueRepository: LeagueRepository

    @Before
    fun setUp() {
        leagueRepository = LeagueRepository(remoteTeamDataSource)
    }

    @Test
    fun `remote iceCream calls remoteIceCreamsDataSource `() {
        runBlocking {
            val remoteIceCream = listOf(mockedIceCream.copy())
            whenever(remoteTeamDataSource.getTeams()).thenReturn(
                ResultData.Success(remoteIceCream)
            )
            when (val result = leagueRepository.getIceCreams()) {
                is ResultData.Success -> assertEquals(remoteIceCream, result.data)
            }
        }
    }*/

}