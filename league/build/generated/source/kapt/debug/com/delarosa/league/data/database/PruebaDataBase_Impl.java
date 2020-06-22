package com.delarosa.league.data.database;

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
import com.delarosa.league.data.database.dao.LeagueDao;
import com.delarosa.league.data.database.dao.LeagueDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class PruebaDataBase_Impl extends PruebaDataBase {
  private volatile LeagueDao _leagueDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `League` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `image` TEXT NOT NULL, `code` TEXT NOT NULL, `country` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"ca0b82fa7e56a4e03d04edd6b43c8c49\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `League`");
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
        final HashMap<String, TableInfo.Column> _columnsLeague = new HashMap<String, TableInfo.Column>(5);
        _columnsLeague.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsLeague.put("title", new TableInfo.Column("title", "TEXT", true, 0));
        _columnsLeague.put("image", new TableInfo.Column("image", "TEXT", true, 0));
        _columnsLeague.put("code", new TableInfo.Column("code", "TEXT", true, 0));
        _columnsLeague.put("country", new TableInfo.Column("country", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLeague = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLeague = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLeague = new TableInfo("League", _columnsLeague, _foreignKeysLeague, _indicesLeague);
        final TableInfo _existingLeague = TableInfo.read(_db, "League");
        if (! _infoLeague.equals(_existingLeague)) {
          throw new IllegalStateException("Migration didn't properly handle League(com.delarosa.league.data.database.entities.League).\n"
                  + " Expected:\n" + _infoLeague + "\n"
                  + " Found:\n" + _existingLeague);
        }
      }
    }, "ca0b82fa7e56a4e03d04edd6b43c8c49", "a060f48d7f8725ea8d2bee78d0defc78");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "League");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `League`");
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
  public LeagueDao leagueDao() {
    if (_leagueDao != null) {
      return _leagueDao;
    } else {
      synchronized(this) {
        if(_leagueDao == null) {
          _leagueDao = new LeagueDao_Impl(this);
        }
        return _leagueDao;
      }
    }
  }
}
