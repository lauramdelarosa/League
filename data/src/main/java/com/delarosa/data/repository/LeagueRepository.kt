package com.delarosa.data.repository

import com.delarosa.data.ResultData
import com.delarosa.data.datasource.LocalLeagueDataSource
import com.delarosa.data.datasource.RemoteLeagueDataSource
import com.delarosa.domain.League

class LeagueRepository(
    private val remoteLeagueDataSource: RemoteLeagueDataSource,
    private val localLeagueDataSource: LocalLeagueDataSource
) {
    suspend fun getLeague(id: String): ResultData<List<League>> {
        if (localLeagueDataSource.isComplete()) {
            when (val result = remoteLeagueDataSource.getLeague(id)) {
                is ResultData.Success -> localLeagueDataSource.saveLeague(result.data)
                is ResultData.Error -> return result
            }
        }
        return ResultData.Success(localLeagueDataSource.getLeagues())
    }
}

