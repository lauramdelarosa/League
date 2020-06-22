package com.delarosa.league.data.server.source

import com.delarosa.common.common.callServices
import com.delarosa.common.common.safeApiCall
import com.delarosa.data.ResultData
import com.delarosa.data.datasource.RemoteLeagueDataSource
import com.delarosa.domain.League
import com.delarosa.league.data.mappers.toDomainLeague
import com.delarosa.league.data.server.endpoints.LeagueService
import com.delarosa.league.data.server.response.LeagueResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RemoteLeagueDataSourceImpl(private val leagueService: LeagueService) :
    RemoteLeagueDataSource {
    override suspend fun getLeague(id: String): ResultData<List<League>> =
        withContext(Dispatchers.IO) {
            safeApiCall(
                call = {
                    renderData(
                        leagueService.getLeagues(id).callServices()
                    )
                },
                errorMessage = " something failed calling service '../league'"
            )
        }

    private fun renderData(resultData: ResultData<LeagueResponse>): ResultData<List<League>> =
        when (resultData) {
            is ResultData.Success -> ResultData.Success(resultData.data.leagues.map { it.toDomainLeague() })
            is ResultData.Error -> resultData
        }

}