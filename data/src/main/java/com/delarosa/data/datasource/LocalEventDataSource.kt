package com.delarosa.data.datasource

import com.delarosa.domain.Event

interface LocalEventDataSource {
    suspend fun isEmpty(): Boolean
    suspend fun saveEvents(events: List<Event>)
    suspend fun getEvents(): List<Event>
}