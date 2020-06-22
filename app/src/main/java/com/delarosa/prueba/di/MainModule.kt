package com.delarosa.prueba.di

import android.app.Application
import com.delarosa.data.repository.EventRepository
import com.delarosa.data.repository.LeagueRepository
import com.delarosa.data.repository.TeamRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

fun Application.initDI() {
    startKoin {
        androidLogger()
        androidContext(this@initDI)
        modules(listOf(presentationModule, dataModule, appModule))
    }
}

val presentationModule = module {

}

val dataModule = module {
    factory { LeagueRepository(localLeagueDataSource = get(), remoteLeagueDataSource = get()) }
    factory { TeamRepository(localTeamDataSource = get(), remoteTeamDataSource = get()) }
    factory { EventRepository(localEventDataSource = get(), remoteEventDataSource = get()) }
}

val appModule = module {
    single<CoroutineDispatcher> { Dispatchers.Main }
}