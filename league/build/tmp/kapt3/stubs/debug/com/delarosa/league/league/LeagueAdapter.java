package com.delarosa.league.league;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/delarosa/league/league/LeagueAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/delarosa/league/league/LeagueAdapter$ViewHolder;", "listener", "Lkotlin/Function1;", "Lcom/delarosa/domain/League;", "", "(Lkotlin/jvm/functions/Function1;)V", "<set-?>", "", "leagueList", "getLeagueList", "()Ljava/util/List;", "setLeagueList", "(Ljava/util/List;)V", "leagueList$delegate", "Lkotlin/properties/ReadWriteProperty;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "league_debug"})
public final class LeagueAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.delarosa.league.league.LeagueAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty leagueList$delegate = null;
    private final kotlin.jvm.functions.Function1<com.delarosa.domain.League, kotlin.Unit> listener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.delarosa.domain.League> getLeagueList() {
        return null;
    }
    
    public final void setLeagueList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.delarosa.domain.League> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.delarosa.league.league.LeagueAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.delarosa.league.league.LeagueAdapter.ViewHolder holder, int position) {
    }
    
    public LeagueAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.delarosa.domain.League, kotlin.Unit> listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/delarosa/league/league/LeagueAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "league", "Lcom/delarosa/domain/League;", "league_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.delarosa.domain.League league) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}