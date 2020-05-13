package com.delarosa.data.datasource

import com.delarosa.domain.League

interface LocalLeagueDataSource {
    suspend fun isComplete(): Boolean
    suspend fun saveLeague(league: List<League>)
    suspend fun getLeagues(): List<League>
}