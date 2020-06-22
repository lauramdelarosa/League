package com.delarosa.league.data.database.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/delarosa/league/data/database/source/RoomLeagueDataSource;", "Lcom/delarosa/data/datasource/LocalLeagueDataSource;", "db", "Lcom/delarosa/league/data/database/PruebaDataBase;", "(Lcom/delarosa/league/data/database/PruebaDataBase;)V", "leagueDao", "Lcom/delarosa/league/data/database/dao/LeagueDao;", "getLeagues", "", "Lcom/delarosa/domain/League;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isNotComplete", "", "saveLeague", "", "league", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "league_debug"})
public final class RoomLeagueDataSource implements com.delarosa.data.datasource.LocalLeagueDataSource {
    private final com.delarosa.league.data.database.dao.LeagueDao leagueDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isNotComplete(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveLeague(@org.jetbrains.annotations.NotNull()
    java.util.List<com.delarosa.domain.League> league, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getLeagues(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.delarosa.domain.League>> p0) {
        return null;
    }
    
    public RoomLeagueDataSource(@org.jetbrains.annotations.NotNull()
    com.delarosa.league.data.database.PruebaDataBase db) {
        super();
    }
}