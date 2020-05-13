package com.delarosa.domain

data class Event(
    val id: Int,
    val homeText: String,
    val awayText: String,
    val homeImage: String,
    val awayImage: String,
    val date: String
)