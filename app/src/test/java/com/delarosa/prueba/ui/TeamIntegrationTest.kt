package com.delarosa.prueba.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.delarosa.data.datasource.LocalTeamDataSource
import com.delarosa.data.datasource.RemoteTeamDataSource
import com.delarosa.domain.Team
import com.delarosa.prueba.datasources.FakeLocalTeamDataSource
import com.delarosa.prueba.datasources.FakeRemoteTeamDataSource
import com.delarosa.prueba.fakeTeamList
import com.delarosa.prueba.initMockedDi
import com.delarosa.prueba.ui.team.TeamViewModel
import com.delarosa.testshared.mockedTeam
import com.delarosa.usecases.GetTeams
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.core.parameter.parametersOf
import org.koin.dsl.module
import org.koin.test.AutoCloseKoinTest
import org.koin.test.get
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TeamIntegrationTest : AutoCloseKoinTest() {
    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Mock
    lateinit var observer: Observer<List<Team>>

    private lateinit var vm: TeamViewModel
    private lateinit var remoteTeamDatasource: FakeRemoteTeamDataSource
    private lateinit var localTeamDataSource: FakeLocalTeamDataSource

    @Before
    fun setUp() {
        val vmModule = module {
            factory { (id: String) -> TeamViewModel(id, get(), get()) }
            factory { GetTeams(get()) }
        }

        initMockedDi(vmModule)
        vm = get { parametersOf("123") }

        remoteTeamDatasource = get<RemoteTeamDataSource>() as FakeRemoteTeamDataSource
        localTeamDataSource = get<LocalTeamDataSource>() as FakeLocalTeamDataSource
    }

    @Test
    fun `team data is loaded from local`() {
        val fakeTeam = listOf(mockedTeam.copy(10), mockedTeam.copy(11))
        localTeamDataSource.team = fakeTeam

        vm.list.observeForever(observer)
        verify(observer).onChanged(fakeTeamList)
    }
}