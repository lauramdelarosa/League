package com.delarosa.prueba.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.delarosa.prueba.data.database.entities.Event

@Dao
interface EventDao {

    @Query("SELECT * FROM Event ORDER BY date ASC")
    fun getAll(): List<Event>

    @Query("SELECT COUNT(id) FROM Event WHERE idTeam = :code")
    fun eventCount(code: String): Int

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertEvents(events: List<Event>)

}