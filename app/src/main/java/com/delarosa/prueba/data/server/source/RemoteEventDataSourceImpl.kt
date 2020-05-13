package com.delarosa.prueba.data.server.source

import com.delarosa.data.ResultData
import com.delarosa.data.datasource.RemoteEventDataSource
import com.delarosa.domain.Event
import com.delarosa.prueba.data.callServices
import com.delarosa.prueba.data.mappers.toDomainEvent
import com.delarosa.prueba.data.safeApiCall
import com.delarosa.prueba.data.server.endpoints.EventService
import com.delarosa.prueba.data.server.response.EventResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RemoteEventDataSourceImpl(private val eventService: EventService) :
    RemoteEventDataSource {
    override suspend fun getEvents(id: String): ResultData<List<Event>> =
        withContext(Dispatchers.IO) {
            safeApiCall(
                call = {
                    renderData(
                        eventService.getEvents(id).callServices()
                    )
                },
                errorMessage = " something failed calling service '../team'"
            )
        }

    private fun renderData(resultData: ResultData<EventResponse>): ResultData<List<Event>> =
        when (resultData) {
            is ResultData.Success -> ResultData.Success(resultData.data.events.map { it.toDomainEvent() })
            is ResultData.Error -> resultData
        }

}