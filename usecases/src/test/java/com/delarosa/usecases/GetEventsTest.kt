package com.delarosa.usecases

import com.delarosa.data.ResultData
import com.delarosa.data.repository.EventRepository
import com.delarosa.testshared.mockedEvent
import com.delarosa.testshared.mockedTeam
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetEventsTest {

    @Mock
    lateinit var eventRepository: EventRepository

    lateinit var getEvents: GetEvents


    @Before
    fun setUp() {
        getEvents = GetEvents(eventRepository)
    }

    @Test
    fun `invoke calls league repository`() {
        runBlocking {
            val events = listOf(mockedEvent.copy())
            val team = mockedTeam.copy(id = 1)
            whenever(eventRepository.getEvents(team.code)).thenReturn(ResultData.Success(events))
            when (val result = getEvents.invoke(team.code)) {
                is ResultData.Success -> {
                    Assert.assertEquals(events, result.data)
                }
            }
        }
    }
}