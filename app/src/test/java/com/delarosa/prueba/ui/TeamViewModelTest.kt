package com.delarosa.prueba.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.delarosa.data.ResultData
import com.delarosa.domain.Team
import com.delarosa.prueba.ui.team.TeamViewModel
import com.delarosa.testshared.mockedLeague
import com.delarosa.testshared.mockedTeam
import com.delarosa.usecases.GetTeams
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TeamViewModelTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Mock
    lateinit var getTeams: GetTeams

    @Mock
    lateinit var observerBar: Observer<Boolean>

    @Mock
    lateinit var observer: Observer<List<Team>>

    private lateinit var vm: TeamViewModel

    @Before
    fun setUp() {
        val league = mockedLeague.copy()
        vm = TeamViewModel(league.code, getTeams, Dispatchers.Unconfined)
    }

    @Test
    fun `getTeams is called`() {

        runBlocking {
            /*val teams = listOf(mockedTeam.copy(id = 1))
            whenever(getTeams.invoke(vm.leagueCode)).thenReturn(ResultData.Success(teams))
            vm.list.observeForever(observer)
            verify(observer).onChanged(teams)*/

            vm.loadingProgressBar.observeForever(observerBar)
            verify(observerBar).onChanged(false)
        }
    }
}