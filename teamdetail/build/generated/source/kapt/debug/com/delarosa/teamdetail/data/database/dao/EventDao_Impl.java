package com.delarosa.teamdetail.data.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.delarosa.teamdetail.data.database.entities.Event;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class EventDao_Impl implements EventDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfEvent;

  public EventDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEvent = new EntityInsertionAdapter<Event>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Event`(`id`,`homeText`,`awayText`,`date`,`idTeam`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Event value) {
        stmt.bindLong(1, value.getId());
        if (value.getHomeText() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHomeText());
        }
        if (value.getAwayText() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAwayText());
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        if (value.getIdTeam() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIdTeam());
        }
      }
    };
  }

  @Override
  public void insertEvents(List<Event> events) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfEvent.insert(events);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Event> getAll() {
    final String _sql = "SELECT * FROM Event ORDER BY date ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfHomeText = _cursor.getColumnIndexOrThrow("homeText");
      final int _cursorIndexOfAwayText = _cursor.getColumnIndexOrThrow("awayText");
      final int _cursorIndexOfDate = _cursor.getColumnIndexOrThrow("date");
      final int _cursorIndexOfIdTeam = _cursor.getColumnIndexOrThrow("idTeam");
      final List<Event> _result = new ArrayList<Event>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Event _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpHomeText;
        _tmpHomeText = _cursor.getString(_cursorIndexOfHomeText);
        final String _tmpAwayText;
        _tmpAwayText = _cursor.getString(_cursorIndexOfAwayText);
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        final String _tmpIdTeam;
        _tmpIdTeam = _cursor.getString(_cursorIndexOfIdTeam);
        _item = new Event(_tmpId,_tmpHomeText,_tmpAwayText,_tmpDate,_tmpIdTeam);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int eventCount(String code) {
    final String _sql = "SELECT COUNT(id) FROM Event WHERE idTeam = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (code == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, code);
    }
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
