package com.delarosa.league.data.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.delarosa.league.data.database.entities.League;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class LeagueDao_Impl implements LeagueDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfLeague;

  public LeagueDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLeague = new EntityInsertionAdapter<League>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `League`(`id`,`title`,`image`,`code`,`country`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, League value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getCode() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCode());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCountry());
        }
      }
    };
  }

  @Override
  public void insertLeague(List<League> league) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfLeague.insert(league);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<League> getAll() {
    final String _sql = "SELECT * FROM League";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfImage = _cursor.getColumnIndexOrThrow("image");
      final int _cursorIndexOfCode = _cursor.getColumnIndexOrThrow("code");
      final int _cursorIndexOfCountry = _cursor.getColumnIndexOrThrow("country");
      final List<League> _result = new ArrayList<League>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final League _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        final String _tmpCountry;
        _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
        _item = new League(_tmpId,_tmpTitle,_tmpImage,_tmpCode,_tmpCountry);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public League findById(int id) {
    final String _sql = "SELECT * FROM League WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfImage = _cursor.getColumnIndexOrThrow("image");
      final int _cursorIndexOfCode = _cursor.getColumnIndexOrThrow("code");
      final int _cursorIndexOfCountry = _cursor.getColumnIndexOrThrow("country");
      final League _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        final String _tmpCountry;
        _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
        _result = new League(_tmpId,_tmpTitle,_tmpImage,_tmpCode,_tmpCountry);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int leagueCount() {
    final String _sql = "SELECT COUNT(id) FROM League";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
