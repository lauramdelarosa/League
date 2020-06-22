package com.delarosa.team.data.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.delarosa.team.data.database.entities.Team;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class TeamDao_Impl implements TeamDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTeam;

  public TeamDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTeam = new EntityInsertionAdapter<Team>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Team`(`id`,`code`,`idLeague`,`name`,`description`,`foundationYear`,`teamBadge`,`teamJersey`,`stadium`,`website`,`facebook`,`youtube`,`twitter`,`instagram`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Team value) {
        stmt.bindLong(1, value.getId());
        if (value.getCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCode());
        }
        if (value.getIdLeague() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIdLeague());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getFoundationYear() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFoundationYear());
        }
        if (value.getTeamBadge() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTeamBadge());
        }
        if (value.getTeamJersey() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTeamJersey());
        }
        if (value.getStadium() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getStadium());
        }
        if (value.getWebsite() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getWebsite());
        }
        if (value.getFacebook() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getFacebook());
        }
        if (value.getYoutube() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getYoutube());
        }
        if (value.getTwitter() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getTwitter());
        }
        if (value.getInstagram() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getInstagram());
        }
      }
    };
  }

  @Override
  public void insertTeam(List<Team> teams) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTeam.insert(teams);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Team> getAll(String code) {
    final String _sql = "SELECT * FROM Team WHERE idLeague = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (code == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, code);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfCode = _cursor.getColumnIndexOrThrow("code");
      final int _cursorIndexOfIdLeague = _cursor.getColumnIndexOrThrow("idLeague");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfFoundationYear = _cursor.getColumnIndexOrThrow("foundationYear");
      final int _cursorIndexOfTeamBadge = _cursor.getColumnIndexOrThrow("teamBadge");
      final int _cursorIndexOfTeamJersey = _cursor.getColumnIndexOrThrow("teamJersey");
      final int _cursorIndexOfStadium = _cursor.getColumnIndexOrThrow("stadium");
      final int _cursorIndexOfWebsite = _cursor.getColumnIndexOrThrow("website");
      final int _cursorIndexOfFacebook = _cursor.getColumnIndexOrThrow("facebook");
      final int _cursorIndexOfYoutube = _cursor.getColumnIndexOrThrow("youtube");
      final int _cursorIndexOfTwitter = _cursor.getColumnIndexOrThrow("twitter");
      final int _cursorIndexOfInstagram = _cursor.getColumnIndexOrThrow("instagram");
      final List<Team> _result = new ArrayList<Team>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Team _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        final String _tmpIdLeague;
        _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpFoundationYear;
        _tmpFoundationYear = _cursor.getString(_cursorIndexOfFoundationYear);
        final String _tmpTeamBadge;
        _tmpTeamBadge = _cursor.getString(_cursorIndexOfTeamBadge);
        final String _tmpTeamJersey;
        _tmpTeamJersey = _cursor.getString(_cursorIndexOfTeamJersey);
        final String _tmpStadium;
        _tmpStadium = _cursor.getString(_cursorIndexOfStadium);
        final String _tmpWebsite;
        _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
        final String _tmpFacebook;
        _tmpFacebook = _cursor.getString(_cursorIndexOfFacebook);
        final String _tmpYoutube;
        _tmpYoutube = _cursor.getString(_cursorIndexOfYoutube);
        final String _tmpTwitter;
        _tmpTwitter = _cursor.getString(_cursorIndexOfTwitter);
        final String _tmpInstagram;
        _tmpInstagram = _cursor.getString(_cursorIndexOfInstagram);
        _item = new Team(_tmpId,_tmpCode,_tmpIdLeague,_tmpName,_tmpDescription,_tmpFoundationYear,_tmpTeamBadge,_tmpTeamJersey,_tmpStadium,_tmpWebsite,_tmpFacebook,_tmpYoutube,_tmpTwitter,_tmpInstagram);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Team findById(String code) {
    final String _sql = "SELECT * FROM Team WHERE code = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (code == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, code);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfCode = _cursor.getColumnIndexOrThrow("code");
      final int _cursorIndexOfIdLeague = _cursor.getColumnIndexOrThrow("idLeague");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfFoundationYear = _cursor.getColumnIndexOrThrow("foundationYear");
      final int _cursorIndexOfTeamBadge = _cursor.getColumnIndexOrThrow("teamBadge");
      final int _cursorIndexOfTeamJersey = _cursor.getColumnIndexOrThrow("teamJersey");
      final int _cursorIndexOfStadium = _cursor.getColumnIndexOrThrow("stadium");
      final int _cursorIndexOfWebsite = _cursor.getColumnIndexOrThrow("website");
      final int _cursorIndexOfFacebook = _cursor.getColumnIndexOrThrow("facebook");
      final int _cursorIndexOfYoutube = _cursor.getColumnIndexOrThrow("youtube");
      final int _cursorIndexOfTwitter = _cursor.getColumnIndexOrThrow("twitter");
      final int _cursorIndexOfInstagram = _cursor.getColumnIndexOrThrow("instagram");
      final Team _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        final String _tmpIdLeague;
        _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpFoundationYear;
        _tmpFoundationYear = _cursor.getString(_cursorIndexOfFoundationYear);
        final String _tmpTeamBadge;
        _tmpTeamBadge = _cursor.getString(_cursorIndexOfTeamBadge);
        final String _tmpTeamJersey;
        _tmpTeamJersey = _cursor.getString(_cursorIndexOfTeamJersey);
        final String _tmpStadium;
        _tmpStadium = _cursor.getString(_cursorIndexOfStadium);
        final String _tmpWebsite;
        _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
        final String _tmpFacebook;
        _tmpFacebook = _cursor.getString(_cursorIndexOfFacebook);
        final String _tmpYoutube;
        _tmpYoutube = _cursor.getString(_cursorIndexOfYoutube);
        final String _tmpTwitter;
        _tmpTwitter = _cursor.getString(_cursorIndexOfTwitter);
        final String _tmpInstagram;
        _tmpInstagram = _cursor.getString(_cursorIndexOfInstagram);
        _result = new Team(_tmpId,_tmpCode,_tmpIdLeague,_tmpName,_tmpDescription,_tmpFoundationYear,_tmpTeamBadge,_tmpTeamJersey,_tmpStadium,_tmpWebsite,_tmpFacebook,_tmpYoutube,_tmpTwitter,_tmpInstagram);
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
  public int teamCount(String code) {
    final String _sql = "SELECT COUNT(id) FROM Team WHERE idLeague = ?";
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
