package com.delarosa.team.data.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.delarosa.team.data.database.dao.TeamDao;
import com.delarosa.team.data.database.dao.TeamDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class PruebaDataBase_Impl extends PruebaDataBase {
  private volatile TeamDao _teamDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Team` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `code` TEXT NOT NULL, `idLeague` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `foundationYear` TEXT NOT NULL, `teamBadge` TEXT NOT NULL, `teamJersey` TEXT NOT NULL, `stadium` TEXT NOT NULL, `website` TEXT NOT NULL, `facebook` TEXT NOT NULL, `youtube` TEXT NOT NULL, `twitter` TEXT NOT NULL, `instagram` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"d76ba9da65f52221eb7819ad04b970c6\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Team`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTeam = new HashMap<String, TableInfo.Column>(14);
        _columnsTeam.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsTeam.put("code", new TableInfo.Column("code", "TEXT", true, 0));
        _columnsTeam.put("idLeague", new TableInfo.Column("idLeague", "TEXT", true, 0));
        _columnsTeam.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsTeam.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        _columnsTeam.put("foundationYear", new TableInfo.Column("foundationYear", "TEXT", true, 0));
        _columnsTeam.put("teamBadge", new TableInfo.Column("teamBadge", "TEXT", true, 0));
        _columnsTeam.put("teamJersey", new TableInfo.Column("teamJersey", "TEXT", true, 0));
        _columnsTeam.put("stadium", new TableInfo.Column("stadium", "TEXT", true, 0));
        _columnsTeam.put("website", new TableInfo.Column("website", "TEXT", true, 0));
        _columnsTeam.put("facebook", new TableInfo.Column("facebook", "TEXT", true, 0));
        _columnsTeam.put("youtube", new TableInfo.Column("youtube", "TEXT", true, 0));
        _columnsTeam.put("twitter", new TableInfo.Column("twitter", "TEXT", true, 0));
        _columnsTeam.put("instagram", new TableInfo.Column("instagram", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTeam = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTeam = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTeam = new TableInfo("Team", _columnsTeam, _foreignKeysTeam, _indicesTeam);
        final TableInfo _existingTeam = TableInfo.read(_db, "Team");
        if (! _infoTeam.equals(_existingTeam)) {
          throw new IllegalStateException("Migration didn't properly handle Team(com.delarosa.team.data.database.entities.Team).\n"
                  + " Expected:\n" + _infoTeam + "\n"
                  + " Found:\n" + _existingTeam);
        }
      }
    }, "d76ba9da65f52221eb7819ad04b970c6", "37b43dd2f01fc59660c3a0f6ee5aaa78");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Team");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Team`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public TeamDao teamDao() {
    if (_teamDao != null) {
      return _teamDao;
    } else {
      synchronized(this) {
        if(_teamDao == null) {
          _teamDao = new TeamDao_Impl(this);
        }
        return _teamDao;
      }
    }
  }
}
