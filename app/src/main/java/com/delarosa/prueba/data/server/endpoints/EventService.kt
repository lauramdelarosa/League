package com.delarosa.prueba.data.server.endpoints

import com.delarosa.prueba.data.server.response.EventResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface EventService {
    @GET("eventsnext.php/")
    suspend fun getEvents(@Query("id") teamId: String): Response<EventResponse>
}