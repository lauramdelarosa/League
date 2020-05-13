package com.delarosa.usecases

import com.delarosa.data.ResultData
import com.delarosa.data.repository.LeagueRepository
import com.delarosa.testshared.mockedLeague
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetLeaguesTest {

    @Mock
    lateinit var leagueRepository: LeagueRepository

    lateinit var getLeagues: GetLeagues


    @Before
    fun setUp() {
        getLeagues = GetLeagues(leagueRepository)
    }

    @Test
    fun `invoke calls league repository`() {
        runBlocking {
            val league = listOf(mockedLeague.copy())

            whenever(leagueRepository.getLeague(GetLeagues.League1)).thenReturn(ResultData.Success(league))
            when (val result = getLeagues.invoke()) {
                is ResultData.Success -> {
                    Assert.assertEquals(league, result.data)
                }
            }
        }
    }
}