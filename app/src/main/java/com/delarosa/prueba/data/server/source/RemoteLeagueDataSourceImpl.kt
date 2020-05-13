package com.delarosa.prueba.data.server.source

import com.delarosa.data.ResultData
import com.delarosa.data.datasource.RemoteLeagueDataSource
import com.delarosa.domain.League
import com.delarosa.prueba.data.callServices
import com.delarosa.prueba.data.mappers.toDomainLeague
import com.delarosa.prueba.data.safeApiCall
import com.delarosa.prueba.data.server.endpoints.LeagueService
import com.delarosa.prueba.data.server.response.LeagueResponse
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