package com.delarosa.prueba.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.delarosa.prueba.data.database.entities.Event

@Dao
interface EventDao {

    @Query("SELECT * FROM Event")
    fun getAll(): List<Event>

    @Query("SELECT COUNT(id) FROM Event")
    fun eventCount(): Int

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertEvents(events: List<Event>)

}