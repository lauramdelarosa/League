package com.delarosa.usecases

import com.delarosa.data.ResultData
import com.delarosa.data.repository.TeamRepository
import com.delarosa.testshared.mockedLeague
import com.delarosa.testshared.mockedTeam
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetTeamsTest {

    @Mock
    lateinit var teamRepository: TeamRepository

    lateinit var getTeams: GetTeams


    @Before
    fun setUp() {
        getTeams = GetTeams(teamRepository)
    }

    @Test
    fun `invoke calls team repository`() {
        runBlocking {
            val team = listOf(mockedTeam.copy())
            val league = mockedLeague
            whenever(teamRepository.getTeams(league.code)).thenReturn(ResultData.Success(team))
            when (val result = getTeams.invoke(league.code)) {
                is ResultData.Success -> {
                    Assert.assertEquals(team, result.data)
                }
            }
        }
    }
}