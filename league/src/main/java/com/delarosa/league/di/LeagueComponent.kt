package com.delarosa.league.di


import com.delarosa.league.league.LeagueViewModel
import dagger.Subcomponent


@Subcomponent(modules = [(LeagueModule::class)])
interface LeagueComponent {
    val leagueViewModel: LeagueViewModel
}