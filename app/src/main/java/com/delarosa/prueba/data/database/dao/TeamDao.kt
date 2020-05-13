package com.delarosa.prueba.data.database.dao

import androidx.room.*
import com.delarosa.prueba.data.database.entities.Team

@Dao
interface TeamDao {

    @Query("SELECT * FROM Team WHERE idLeague = :code")
    fun getAll(code: String): List<Team>

    @Query("SELECT * FROM Team WHERE code = :code")
    fun findById(code: String): Team

    @Query("SELECT COUNT(id) FROM Team")
    fun teamCount(): Int

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertTeam(teams: List<Team>)

}