package com.delarosa.prueba.data.mappers

import com.delarosa.domain.Event
import com.delarosa.prueba.data.database.entities.Event as RoomEvent
import com.delarosa.prueba.data.server.response.Event as ServerEvent

fun ServerEvent.toDomainEvent(): Event = Event(
    homeImage = idHomeTeam,
    awayImage = idAwayTeam,
    homeText = strHomeTeam,
    awayText = strAwayTeam,
    date = dateEvent
)

fun Event.toRoomEvent(): RoomEvent = RoomEvent(
    id = 0,
    homeText = homeText,
    awayText = awayText,
    awayImage = awayImage,
    homeImage = homeImage,
    date = date
)

fun RoomEvent.toDomainEvent(): Event = Event(
    homeText = homeText,
    awayText = awayText,
    awayImage = awayImage,
    homeImage = homeImage,
    date = date
)