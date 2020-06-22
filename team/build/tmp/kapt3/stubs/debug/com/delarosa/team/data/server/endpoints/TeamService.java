package com.delarosa.team.data.server.endpoints;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/delarosa/team/data/server/endpoints/TeamService;", "", "getTeams", "Lretrofit2/Response;", "Lcom/delarosa/team/data/server/response/TeamResponse;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "team_debug"})
public abstract interface TeamService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "lookup_all_teams.php/")
    public abstract java.lang.Object getTeams(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delarosa.team.data.server.response.TeamResponse>> p1);
}