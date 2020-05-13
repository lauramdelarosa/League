package com.delarosa.data.datasource

import com.delarosa.data.ResultData
import com.delarosa.domain.League

interface RemoteLeagueDataSource {
    suspend fun getLeague(id: String): ResultData<List<League>>
}