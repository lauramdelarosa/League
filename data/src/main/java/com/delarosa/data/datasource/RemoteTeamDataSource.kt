package com.delarosa.data.datasource

import com.delarosa.data.ResultData
import com.delarosa.domain.Team

interface RemoteTeamDataSource {
    suspend fun getTeams(id: String): ResultData<List<Team>>
}