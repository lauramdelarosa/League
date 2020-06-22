package com.delarosa.team.team;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0010R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006!"}, d2 = {"Lcom/delarosa/team/team/TeamViewModel;", "Lcom/delarosa/common/common/ScopedViewModel;", "leagueCode", "", "getTeams", "Lcom/delarosa/usecases/GetTeams;", "uiDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Ljava/lang/String;Lcom/delarosa/usecases/GetTeams;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_navigation", "Landroidx/lifecycle/MutableLiveData;", "Lcom/delarosa/common/common/Event;", "getLeagueCode", "()Ljava/lang/String;", "list", "", "Lcom/delarosa/domain/Team;", "getList", "()Landroidx/lifecycle/MutableLiveData;", "loadingProgressBar", "", "getLoadingProgressBar", "navigation", "Landroidx/lifecycle/LiveData;", "getNavigation", "()Landroidx/lifecycle/LiveData;", "getUiDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "initServiceCall", "", "onItemClicked", "team", "Companion", "team_debug"})
public final class TeamViewModel extends com.delarosa.common.common.ScopedViewModel {
    private final androidx.lifecycle.MutableLiveData<com.delarosa.common.common.Event<java.lang.String>> _navigation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.delarosa.common.common.Event<java.lang.String>> navigation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.delarosa.domain.Team>> list = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingProgressBar = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String leagueCode = null;
    private final com.delarosa.usecases.GetTeams getTeams = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineDispatcher uiDispatcher = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LEAGUE_CODE = "league_code";
    public static final com.delarosa.team.team.TeamViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.delarosa.common.common.Event<java.lang.String>> getNavigation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.delarosa.domain.Team>> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingProgressBar() {
        return null;
    }
    
    private final void initServiceCall() {
    }
    
    public final void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.delarosa.domain.Team team) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLeagueCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.CoroutineDispatcher getUiDispatcher() {
        return null;
    }
    
    public TeamViewModel(@org.jetbrains.annotations.NotNull()
    java.lang.String leagueCode, @org.jetbrains.annotations.NotNull()
    com.delarosa.usecases.GetTeams getTeams, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher uiDispatcher) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/delarosa/team/team/TeamViewModel$Companion;", "", "()V", "LEAGUE_CODE", "", "getLEAGUE_CODE", "()Ljava/lang/String;", "team_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLEAGUE_CODE() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}