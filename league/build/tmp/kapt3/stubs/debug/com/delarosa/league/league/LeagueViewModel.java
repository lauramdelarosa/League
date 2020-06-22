package com.delarosa.league.league;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\rR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001e"}, d2 = {"Lcom/delarosa/league/league/LeagueViewModel;", "Lcom/delarosa/common/common/ScopedViewModel;", "getLeagues", "Lcom/delarosa/usecases/GetLeagues;", "uiDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/delarosa/usecases/GetLeagues;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_navigation", "Landroidx/lifecycle/MutableLiveData;", "Lcom/delarosa/common/common/Event;", "", "list", "", "Lcom/delarosa/domain/League;", "getList", "()Landroidx/lifecycle/MutableLiveData;", "loadingProgressBar", "", "getLoadingProgressBar", "navigation", "Landroidx/lifecycle/LiveData;", "getNavigation", "()Landroidx/lifecycle/LiveData;", "getUiDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "initServiceCall", "", "onCleared", "onItemClicked", "league", "league_debug"})
public final class LeagueViewModel extends com.delarosa.common.common.ScopedViewModel {
    private final androidx.lifecycle.MutableLiveData<com.delarosa.common.common.Event<java.lang.String>> _navigation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.delarosa.common.common.Event<java.lang.String>> navigation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.delarosa.domain.League>> list = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingProgressBar = null;
    private final com.delarosa.usecases.GetLeagues getLeagues = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineDispatcher uiDispatcher = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.delarosa.common.common.Event<java.lang.String>> getNavigation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.delarosa.domain.League>> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingProgressBar() {
        return null;
    }
    
    private final void initServiceCall() {
    }
    
    public final void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.delarosa.domain.League league) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.CoroutineDispatcher getUiDispatcher() {
        return null;
    }
    
    public LeagueViewModel(@org.jetbrains.annotations.NotNull()
    com.delarosa.usecases.GetLeagues getLeagues, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher uiDispatcher) {
        super(null);
    }
}