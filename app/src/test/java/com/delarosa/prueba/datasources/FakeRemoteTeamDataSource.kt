package com.delarosa.prueba.datasources

import com.delarosa.data.ResultData
import com.delarosa.data.datasource.RemoteTeamDataSource
import com.delarosa.domain.Team
import com.delarosa.prueba.fakeTeamList


class FakeRemoteTeamDataSource : RemoteTeamDataSource {

    var remoteResponse = fakeTeamList

    override suspend fun getTeams(id: String): ResultData<List<Team>> =
        ResultData.Success(remoteResponse)

}


