package com.delarosa.team.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/delarosa/team/data/database/dao/TeamDao;", "", "findById", "Lcom/delarosa/team/data/database/entities/Team;", "code", "", "getAll", "", "insertTeam", "", "teams", "teamCount", "", "team_debug"})
public abstract interface TeamDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Team WHERE idLeague = :code")
    public abstract java.util.List<com.delarosa.team.data.database.entities.Team> getAll(@org.jetbrains.annotations.NotNull()
    java.lang.String code);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Team WHERE code = :code")
    public abstract com.delarosa.team.data.database.entities.Team findById(@org.jetbrains.annotations.NotNull()
    java.lang.String code);
    
    @androidx.room.Query(value = "SELECT COUNT(id) FROM Team WHERE idLeague = :code")
    public abstract int teamCount(@org.jetbrains.annotations.NotNull()
    java.lang.String code);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insertTeam(@org.jetbrains.annotations.NotNull()
    java.util.List<com.delarosa.team.data.database.entities.Team> teams);
}