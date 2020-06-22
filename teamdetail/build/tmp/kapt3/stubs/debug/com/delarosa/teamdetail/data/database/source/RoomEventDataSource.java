package com.delarosa.teamdetail.data.database.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/delarosa/teamdetail/data/database/source/RoomEventDataSource;", "Lcom/delarosa/data/datasource/LocalEventDataSource;", "db", "Lcom/delarosa/teamdetail/data/database/PruebaDataBase;", "(Lcom/delarosa/teamdetail/data/database/PruebaDataBase;)V", "eventDao", "Lcom/delarosa/teamdetail/data/database/dao/EventDao;", "getEvents", "", "Lcom/delarosa/domain/Event;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEmpty", "", "code", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveEvents", "", "events", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "teamdetail_debug"})
public final class RoomEventDataSource implements com.delarosa.data.datasource.LocalEventDataSource {
    private final com.delarosa.teamdetail.data.database.dao.EventDao eventDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isEmpty(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveEvents(@org.jetbrains.annotations.NotNull()
    java.util.List<com.delarosa.domain.Event> events, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getEvents(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.delarosa.domain.Event>> p0) {
        return null;
    }
    
    public RoomEventDataSource(@org.jetbrains.annotations.NotNull()
    com.delarosa.teamdetail.data.database.PruebaDataBase db) {
        super();
    }
}