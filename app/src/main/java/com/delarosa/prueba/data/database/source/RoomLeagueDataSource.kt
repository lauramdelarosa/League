package com.delarosa.prueba.data.database.source


import com.delarosa.data.datasource.LocalLeagueDataSource
import com.delarosa.domain.League
import com.delarosa.prueba.data.database.PruebaDataBase
import com.delarosa.prueba.data.mappers.toDomainLeague
import com.delarosa.prueba.data.mappers.toRoomLeague
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RoomLeagueDataSource(db: PruebaDataBase) : LocalLeagueDataSource {

    private val leagueDao = db.leagueDao()

    override suspend fun isComplete(): Boolean =
        withContext(Dispatchers.IO) { leagueDao.leagueCount() <= 2 }

    override suspend fun saveLeague(league: List<League>) {
        withContext(Dispatchers.IO) { leagueDao.insertLeague(league.map { it.toRoomLeague() }) }
    }

    override suspend fun getLeagues(): List<League> =
        withContext(Dispatchers.IO) {
            leagueDao.getAll().map { it.toDomainLeague() }
        }
}