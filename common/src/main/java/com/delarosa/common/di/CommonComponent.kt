package com.delarosa.common.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class])
interface CommonComponent {

    fun plus(module: LeagueModule): LeagueComponent
    fun plus(module: TeamModule): TeamComponent
    fun plus(module: TeamDetailModule): TeamDetailComponent

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): CommonComponent
    }
}