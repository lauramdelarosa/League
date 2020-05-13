package com.delarosa.data.repository

import com.delarosa.data.ResultData
import com.delarosa.data.datasource.LocalEventDataSource
import com.delarosa.data.datasource.RemoteEventDataSource
import com.delarosa.domain.Event

class EventRepository(
    private val remoteEventDataSource: RemoteEventDataSource,
    private val localEventDataSource: LocalEventDataSource
) {
    suspend fun getEvents(id: String): ResultData<List<Event>> {
        if (localEventDataSource.isEmpty(id)) {
            when (val result = remoteEventDataSource.getEvents(id)) {
                is ResultData.Success -> localEventDataSource.saveEvents(result.data)
                is ResultData.Error -> return result
            }
        }
        return ResultData.Success(localEventDataSource.getEvents())
    }
}

