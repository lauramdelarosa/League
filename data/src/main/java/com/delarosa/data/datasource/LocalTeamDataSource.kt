package com.delarosa.data.datasource

import com.delarosa.domain.Team

interface LocalTeamDataSource {
    suspend fun isEmpty(code: String): Boolean
    suspend fun saveTeams(teams: List<Team>)
    suspend fun getTeams(code: String): List<Team>
    suspend fun findById(code: String): Team
}