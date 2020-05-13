package com.delarosa.data.datasource

import com.delarosa.data.ResultData
import com.delarosa.domain.Event

interface RemoteEventDataSource {
    suspend fun getEvents(id: String): ResultData<List<Event>>
}