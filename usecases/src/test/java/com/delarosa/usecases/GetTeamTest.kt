package com.delarosa.usecases

import com.delarosa.data.repository.TeamRepository
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
class GetTeamTest {

    @Mock
    lateinit var teamRepository: TeamRepository

    lateinit var getTeam: GetTeam


    @Before
    fun setUp() {
        getTeam = GetTeam(teamRepository)
    }

    @Test
    fun `invoke calls team repository`() {
        runBlocking {
            val team = mockedTeam.copy()
            whenever(teamRepository.findById(team.code)).thenReturn(team)
            Assert.assertEquals(team, getTeam.invoke(team.code))
        }
    }
}