package com.delarosa.domain

data class Event(
    val id: Int,
    val homeText: String,
    val awayText: String,
    val date: String,
    val idTeam: String
)