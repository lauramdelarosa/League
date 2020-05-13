package com.delarosa.usecases

import com.delarosa.data.ResultData
import com.delarosa.data.repository.TeamRepository
import com.delarosa.domain.Team

class GetTeam(private val teamRepository: TeamRepository) {
    suspend fun invoke(code: String): Team = teamRepository.findById(code)
}