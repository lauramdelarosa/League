package com.delarosa.teamdetail.di


import com.delarosa.teamdetail.teamdetail.TeamDetailViewModel
import dagger.Subcomponent


@Subcomponent(modules = [(TeamDetailModule::class)])
interface TeamDetailComponent {
    val teamDetailViewModel: TeamDetailViewModel
}