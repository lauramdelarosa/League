package com.delarosa.league.data.server.response;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u008a\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ed\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u00a2\u0006\u0002\u00100J\t\u0010_\u001a\u00020\u0003H\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u0003H\u00c6\u0003J\t\u0010h\u001a\u00020\u0003H\u00c6\u0003J\t\u0010i\u001a\u00020\u0003H\u00c6\u0003J\t\u0010j\u001a\u00020\u0003H\u00c6\u0003J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\t\u0010l\u001a\u00020\u0003H\u00c6\u0003J\t\u0010m\u001a\u00020\u0003H\u00c6\u0003J\t\u0010n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010o\u001a\u00020\u0003H\u00c6\u0003J\t\u0010p\u001a\u00020\u0003H\u00c6\u0003J\t\u0010q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010s\u001a\u00020\u0003H\u00c6\u0003J\t\u0010t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010u\u001a\u00020\u0003H\u00c6\u0003J\t\u0010v\u001a\u00020\u0003H\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\t\u0010x\u001a\u00020\u0003H\u00c6\u0003J\t\u0010y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010{\u001a\u00020\u0003H\u00c6\u0003J\t\u0010|\u001a\u00020\u0003H\u00c6\u0003J\t\u0010}\u001a\u00020\u0003H\u00c6\u0003J\t\u0010~\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003H\u00c6\u0003J\u00cc\u0003\u0010\u008c\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u0003H\u00c6\u0001J\u000b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u00d6\u0001J\u0017\u0010\u008f\u0001\u001a\u00030\u0090\u00012\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001H\u00d6\u0003J\u000b\u0010\u0093\u0001\u001a\u00030\u008e\u0001H\u00d6\u0001J\n\u0010\u0094\u0001\u001a\u00020\u0003H\u00d6\u0001J\u001f\u0010\u0095\u0001\u001a\u00030\u0096\u00012\b\u0010\u0097\u0001\u001a\u00030\u0098\u00012\b\u0010\u0099\u0001\u001a\u00030\u008e\u0001H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00102R\u0011\u0010)\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0011\u0010(\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00102R\u0011\u0010.\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00102R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00102R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00102R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00102R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00102R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00102R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00102R\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00102R\u0011\u0010#\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00102R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00102R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00102R\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00102R\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00102R\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00102R\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00102R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00102R\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00102R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00102R\u0011\u0010$\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00102R\u0011\u0010%\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0011\u0010&\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00102R\u0011\u0010\'\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00102R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00102R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00102R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00102R\u0011\u0010/\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00102R\u0011\u0010*\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00102R\u0011\u0010-\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00102R\u0011\u0010+\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00102R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00102R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00102R\u0011\u0010,\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00102R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u00102R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u00102R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u00102\u00a8\u0006\u009a\u0001"}, d2 = {"Lcom/delarosa/league/data/server/response/League;", "Landroid/os/Parcelable;", "idLeague", "", "idSoccerXML", "idAPIfootball", "strSport", "strLeague", "strLeagueAlternate", "strDivision", "idCup", "strCurrentSeason", "intFormedYear", "dateFirstEvent", "strGender", "strCountry", "strWebsite", "strFacebook", "strTwitter", "strYoutube", "strRSS", "strDescriptionEN", "strDescriptionDE", "strDescriptionFR", "strDescriptionIT", "strDescriptionCN", "strDescriptionJP", "strDescriptionRU", "strDescriptionES", "strDescriptionPT", "strDescriptionSE", "strDescriptionNL", "strDescriptionHU", "strDescriptionNO", "strDescriptionPL", "strDescriptionIL", "strFanart1", "strFanart2", "strFanart3", "strFanart4", "strBanner", "strBadge", "strLogo", "strPoster", "strTrophy", "strNaming", "strComplete", "strLocke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateFirstEvent", "()Ljava/lang/String;", "getIdAPIfootball", "getIdCup", "getIdLeague", "getIdSoccerXML", "getIntFormedYear", "getStrBadge", "getStrBanner", "getStrComplete", "getStrCountry", "getStrCurrentSeason", "getStrDescriptionCN", "getStrDescriptionDE", "getStrDescriptionEN", "getStrDescriptionES", "getStrDescriptionFR", "getStrDescriptionHU", "getStrDescriptionIL", "getStrDescriptionIT", "getStrDescriptionJP", "getStrDescriptionNL", "getStrDescriptionNO", "getStrDescriptionPL", "getStrDescriptionPT", "getStrDescriptionRU", "getStrDescriptionSE", "getStrDivision", "getStrFacebook", "getStrFanart1", "getStrFanart2", "getStrFanart3", "getStrFanart4", "getStrGender", "getStrLeague", "getStrLeagueAlternate", "getStrLocke", "getStrLogo", "getStrNaming", "getStrPoster", "getStrRSS", "getStrSport", "getStrTrophy", "getStrTwitter", "getStrWebsite", "getStrYoutube", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "league_debug"})
public final class League implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idLeague = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idSoccerXML = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idAPIfootball = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strSport = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLeague = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLeagueAlternate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDivision = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idCup = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strCurrentSeason = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String intFormedYear = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dateFirstEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strGender = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strCountry = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strWebsite = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strFacebook = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTwitter = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strYoutube = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strRSS = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionEN = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionDE = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionFR = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionIT = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionCN = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionJP = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionRU = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionES = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionPT = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionSE = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionNL = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionHU = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionNO = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionPL = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionIL = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strFanart1 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strFanart2 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strFanart3 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strFanart4 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strBanner = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strBadge = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLogo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strPoster = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTrophy = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strNaming = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strComplete = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLocke = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdLeague() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdSoccerXML() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdAPIfootball() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrSport() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLeague() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLeagueAlternate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDivision() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdCup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrCurrentSeason() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIntFormedYear() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateFirstEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrWebsite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrFacebook() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTwitter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrYoutube() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrRSS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionEN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionDE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionFR() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionIT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionCN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionJP() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionRU() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionES() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionPT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionSE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionNL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionHU() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionNO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionPL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionIL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrFanart1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrFanart2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrFanart3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrFanart4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrBadge() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLogo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrPoster() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTrophy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrNaming() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrComplete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLocke() {
        return null;
    }
    
    public League(@org.jetbrains.annotations.NotNull()
    java.lang.String idLeague, @org.jetbrains.annotations.NotNull()
    java.lang.String idSoccerXML, @org.jetbrains.annotations.NotNull()
    java.lang.String idAPIfootball, @org.jetbrains.annotations.NotNull()
    java.lang.String strSport, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeagueAlternate, @org.jetbrains.annotations.NotNull()
    java.lang.String strDivision, @org.jetbrains.annotations.NotNull()
    java.lang.String idCup, @org.jetbrains.annotations.NotNull()
    java.lang.String strCurrentSeason, @org.jetbrains.annotations.NotNull()
    java.lang.String intFormedYear, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFirstEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String strGender, @org.jetbrains.annotations.NotNull()
    java.lang.String strCountry, @org.jetbrains.annotations.NotNull()
    java.lang.String strWebsite, @org.jetbrains.annotations.NotNull()
    java.lang.String strFacebook, @org.jetbrains.annotations.NotNull()
    java.lang.String strTwitter, @org.jetbrains.annotations.NotNull()
    java.lang.String strYoutube, @org.jetbrains.annotations.NotNull()
    java.lang.String strRSS, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionEN, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionDE, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionFR, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionIT, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionCN, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionJP, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionRU, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionES, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionPT, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionSE, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionNL, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionHU, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionNO, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionPL, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionIL, @org.jetbrains.annotations.NotNull()
    java.lang.String strFanart1, @org.jetbrains.annotations.NotNull()
    java.lang.String strFanart2, @org.jetbrains.annotations.NotNull()
    java.lang.String strFanart3, @org.jetbrains.annotations.NotNull()
    java.lang.String strFanart4, @org.jetbrains.annotations.NotNull()
    java.lang.String strBanner, @org.jetbrains.annotations.NotNull()
    java.lang.String strBadge, @org.jetbrains.annotations.NotNull()
    java.lang.String strLogo, @org.jetbrains.annotations.NotNull()
    java.lang.String strPoster, @org.jetbrains.annotations.NotNull()
    java.lang.String strTrophy, @org.jetbrains.annotations.NotNull()
    java.lang.String strNaming, @org.jetbrains.annotations.NotNull()
    java.lang.String strComplete, @org.jetbrains.annotations.NotNull()
    java.lang.String strLocke) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.delarosa.league.data.server.response.League copy(@org.jetbrains.annotations.NotNull()
    java.lang.String idLeague, @org.jetbrains.annotations.NotNull()
    java.lang.String idSoccerXML, @org.jetbrains.annotations.NotNull()
    java.lang.String idAPIfootball, @org.jetbrains.annotations.NotNull()
    java.lang.String strSport, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeagueAlternate, @org.jetbrains.annotations.NotNull()
    java.lang.String strDivision, @org.jetbrains.annotations.NotNull()
    java.lang.String idCup, @org.jetbrains.annotations.NotNull()
    java.lang.String strCurrentSeason, @org.jetbrains.annotations.NotNull()
    java.lang.String intFormedYear, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFirstEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String strGender, @org.jetbrains.annotations.NotNull()
    java.lang.String strCountry, @org.jetbrains.annotations.NotNull()
    java.lang.String strWebsite, @org.jetbrains.annotations.NotNull()
    java.lang.String strFacebook, @org.jetbrains.annotations.NotNull()
    java.lang.String strTwitter, @org.jetbrains.annotations.NotNull()
    java.lang.String strYoutube, @org.jetbrains.annotations.NotNull()
    java.lang.String strRSS, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionEN, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionDE, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionFR, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionIT, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionCN, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionJP, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionRU, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionES, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionPT, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionSE, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionNL, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionHU, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionNO, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionPL, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionIL, @org.jetbrains.annotations.NotNull()
    java.lang.String strFanart1, @org.jetbrains.annotations.NotNull()
    java.lang.String strFanart2, @org.jetbrains.annotations.NotNull()
    java.lang.String strFanart3, @org.jetbrains.annotations.NotNull()
    java.lang.String strFanart4, @org.jetbrains.annotations.NotNull()
    java.lang.String strBanner, @org.jetbrains.annotations.NotNull()
    java.lang.String strBadge, @org.jetbrains.annotations.NotNull()
    java.lang.String strLogo, @org.jetbrains.annotations.NotNull()
    java.lang.String strPoster, @org.jetbrains.annotations.NotNull()
    java.lang.String strTrophy, @org.jetbrains.annotations.NotNull()
    java.lang.String strNaming, @org.jetbrains.annotations.NotNull()
    java.lang.String strComplete, @org.jetbrains.annotations.NotNull()
    java.lang.String strLocke) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}