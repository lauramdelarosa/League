package com.delarosa.data

import com.delarosa.data.datasource.LocalEventDataSource
import com.delarosa.data.datasource.RemoteEventDataSource
import com.delarosa.data.repository.EventRepository
import com.delarosa.testshared.mockedEvent
import com.delarosa.testshared.mockedTeam
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class EventRepositoryTest {

    @Mock
    lateinit var remoteEventDataSource: RemoteEventDataSource

    @Mock
    lateinit var localEventDataSource: LocalEventDataSource

    lateinit var eventRepository: EventRepository

    @Before
    fun setUp() {
        eventRepository = EventRepository(remoteEventDataSource, localEventDataSource)
    }

    @Test
    fun `remote event calls remoteEventeDataSource `() {
        runBlocking {
            val remoteEvents = listOf(mockedEvent.copy())
            val team = mockedTeam.copy(id = 1)
            whenever(localEventDataSource.isEmpty(team.code)).thenReturn(true)
            whenever(remoteEventDataSource.getEvents(team.code)).thenReturn(
                ResultData.Success(remoteEvents)
            )
            whenever(localEventDataSource.getEvents()).thenReturn(remoteEvents)
            when (val result = eventRepository.getEvents(team.code)) {
                is ResultData.Success -> assertEquals(remoteEvents, result.data)
            }
        }
    }

}