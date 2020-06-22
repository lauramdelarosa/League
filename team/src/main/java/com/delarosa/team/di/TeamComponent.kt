package com.delarosa.team.di


import com.delarosa.team.team.TeamViewModel
import dagger.Subcomponent


@Subcomponent(modules = [(TeamModule::class)])
interface TeamComponent {
    val teamViewModel: TeamViewModel
}