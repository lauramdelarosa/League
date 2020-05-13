package com.delarosa.prueba.data.server.endpoints

import com.delarosa.prueba.data.server.response.LeagueResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LeagueService {
    @GET("lookupleague.php/")
    suspend fun getLeagues(@Query("id") id: String): Response<LeagueResponse>
}