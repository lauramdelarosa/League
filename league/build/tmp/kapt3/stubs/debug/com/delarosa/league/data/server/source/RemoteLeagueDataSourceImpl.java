package com.delarosa.league.data.server.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\"\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/delarosa/league/data/server/source/RemoteLeagueDataSourceImpl;", "Lcom/delarosa/data/datasource/RemoteLeagueDataSource;", "leagueService", "Lcom/delarosa/league/data/server/endpoints/LeagueService;", "(Lcom/delarosa/league/data/server/endpoints/LeagueService;)V", "getLeague", "Lcom/delarosa/data/ResultData;", "", "Lcom/delarosa/domain/League;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "renderData", "resultData", "Lcom/delarosa/league/data/server/response/LeagueResponse;", "league_debug"})
public final class RemoteLeagueDataSourceImpl implements com.delarosa.data.datasource.RemoteLeagueDataSource {
    private final com.delarosa.league.data.server.endpoints.LeagueService leagueService = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getLeague(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.delarosa.data.ResultData<? extends java.util.List<com.delarosa.domain.League>>> p1) {
        return null;
    }
    
    private final com.delarosa.data.ResultData<java.util.List<com.delarosa.domain.League>> renderData(com.delarosa.data.ResultData<com.delarosa.league.data.server.response.LeagueResponse> resultData) {
        return null;
    }
    
    public RemoteLeagueDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.delarosa.league.data.server.endpoints.LeagueService leagueService) {
        super();
    }
}