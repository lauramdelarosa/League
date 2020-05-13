package com.delarosa.usecases

import com.delarosa.data.ResultData
import com.delarosa.data.repository.LeagueRepository
import com.delarosa.domain.League

class GetLeagues(private val leagueRepository: LeagueRepository) {
    suspend fun invoke(): ResultData<List<League>> {
        leagueRepository.getLeague(League1)
        leagueRepository.getLeague(League2)
        return leagueRepository.getLeague(League3)
    }

    companion object {
        val League1 = "4497"
        val League2 = "4335"
        val League3 = "4328"
    }
}