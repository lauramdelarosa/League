package com.delarosa.testshared

import com.delarosa.domain.Event
import com.delarosa.domain.League
import com.delarosa.domain.Team

val mockedTeam = Team(
    0,
    "12345",
    "123",
    "Equipo1",
    "Este es el mejor equipo del mundo cariño",
    "1997",
    "--",
    "--",
    "Atanasio Giradot",
    "link1",
    "link2",
    "link3",
    "link4",
    "link5"
)

val mockedLeague = League(
    "123",
    "--",
    "Liga Paisa",
    "Colombia"
)

val mockedEvent = Event(
    0,
    "Medellín",
    "Bogotá",
    "13/05/2020",
    "12345"
)