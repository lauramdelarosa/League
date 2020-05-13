package com.delarosa.usecases

import com.delarosa.data.ResultData
import com.delarosa.data.repository.LeagueRepository
import com.delarosa.domain.League

class GetLeagues(private val leagueRepository: LeagueRepository) {
    suspend fun invoke(): ResultData<List<League>> {
        leagueRepository.getLeague("4497")
        leagueRepository.getLeague("4335")
        val list = leagueRepository.getLeague("4328")
        return list
    }
}