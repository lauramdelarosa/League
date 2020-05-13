package com.delarosa.usecases

import com.delarosa.data.ResultData
import com.delarosa.data.repository.EventRepository
import com.delarosa.domain.Event

class GetEvents(private val eventRepository: EventRepository) {
    suspend fun invoke(code: String): ResultData<List<Event>> = eventRepository.getEvents(code)
}