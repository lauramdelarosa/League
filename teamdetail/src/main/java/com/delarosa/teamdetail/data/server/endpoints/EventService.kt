package com.delarosa.teamdetail.data.server.endpoints

import com.delarosa.teamdetail.data.server.response.EventResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface EventService {
    @GET("eventsnext.php/")
    suspend fun getEvents(@Query("id") teamId: String): Response<EventResponse>
}