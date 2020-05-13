package com.delarosa.data.repository

import com.delarosa.data.ResultData
import com.delarosa.data.datasource.LocalTeamDataSource
import com.delarosa.data.datasource.RemoteTeamDataSource
import com.delarosa.domain.Team

class TeamRepository(
    private val remoteTeamDataSource: RemoteTeamDataSource,
    private val localTeamDataSource: LocalTeamDataSource
) {
    suspend fun getTeams(id: String): ResultData<List<Team>> {
        when (val result = remoteTeamDataSource.getTeams(id)) {
            is ResultData.Success -> localTeamDataSource.saveTeams(result.data)
            is ResultData.Error -> return result
        }
        return ResultData.Success(localTeamDataSource.getTeams(id))
    }

    suspend fun findById(code: String): Team = localTeamDataSource.findById(code)

}

