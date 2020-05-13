package com.delarosa.data

import com.delarosa.data.datasource.LocalLeagueDataSource
import com.delarosa.data.datasource.RemoteLeagueDataSource
import com.delarosa.data.repository.LeagueRepository
import com.delarosa.testshared.mockedLeague
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

    @Mock
    lateinit var remoteLeagueDataSource: RemoteLeagueDataSource

    @Mock
    lateinit var localLeagueDataSource: LocalLeagueDataSource

    lateinit var leagueRepository: LeagueRepository

    @Before
    fun setUp() {
        leagueRepository = LeagueRepository(
            remoteLeagueDataSource = remoteLeagueDataSource,
            localLeagueDataSource = localLeagueDataSource
        )
    }

    @Test
    fun `remote league calls remoteLeagueDataSource `() {
        runBlocking {
            val remoteLeagues = listOf(mockedLeague.copy())
            whenever(localLeagueDataSource.isNotComplete()).thenReturn(true)
            whenever(remoteLeagueDataSource.getLeague("123")).thenReturn(ResultData.Success(remoteLeagues))
            whenever(localLeagueDataSource.getLeagues()).thenReturn(remoteLeagues)
            when (val result = leagueRepository.getLeague("123")) {
                is ResultData.Success -> assertEquals(remoteLeagues, result.data)
            }
        }
    }

}