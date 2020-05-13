package com.delarosa.usecases

import com.delarosa.data.ResultData
import com.delarosa.data.repository.TeamRepository
import com.delarosa.domain.Team

class GetTeams(private val teamRepository: TeamRepository) {
    suspend fun invoke(id: String): ResultData<List<Team>> = teamRepository.getTeams(id)
}