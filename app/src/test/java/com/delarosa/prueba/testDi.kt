package com.delarosa.prueba

import com.delarosa.data.datasource.LocalTeamDataSource
import com.delarosa.data.datasource.RemoteTeamDataSource
import com.delarosa.prueba.datasources.FakeLocalTeamDataSource
import com.delarosa.prueba.datasources.FakeRemoteTeamDataSource
import com.delarosa.prueba.di.dataModule
import com.delarosa.testshared.mockedTeam
import kotlinx.coroutines.Dispatchers
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module


fun initMockedDi(vararg modules: Module) {
    startKoin {
        modules(listOf(mockedAppModule, dataModule) + modules)
    }
}

private val mockedAppModule = module {
    single<RemoteTeamDataSource> { FakeRemoteTeamDataSource() }
    single<LocalTeamDataSource> { FakeLocalTeamDataSource() }
    single { Dispatchers.Unconfined }
}

val fakeTeamList = listOf(
    mockedTeam.copy(name = "Team2"),
    mockedTeam.copy(name = "Team3"),
    mockedTeam.copy(name = "Team4"),
    mockedTeam.copy(name = "Team5")
)



