package com.delarosa.team.data.server.response;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u00c0\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00fd\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u0003\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u0010?\u001a\u00020\u0003\u0012\u0006\u0010@\u001a\u00020\u0003\u0012\u0006\u0010A\u001a\u00020\u0003\u00a2\u0006\u0002\u0010BJ\n\u0010\u0083\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00aa\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ac\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ae\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00af\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b1\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b3\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b4\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b9\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ba\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bb\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bd\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00be\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bf\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c1\u0001\u001a\u00020\u0003H\u00c6\u0003J\u0080\u0005\u0010\u00c2\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00032\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u0003H\u00c6\u0001J\u000b\u0010\u00c3\u0001\u001a\u00030\u00c4\u0001H\u00d6\u0001J\u0017\u0010\u00c5\u0001\u001a\u00030\u00c6\u00012\n\u0010\u00c7\u0001\u001a\u0005\u0018\u00010\u00c8\u0001H\u00d6\u0003J\u000b\u0010\u00c9\u0001\u001a\u00030\u00c4\u0001H\u00d6\u0001J\n\u0010\u00ca\u0001\u001a\u00020\u0003H\u00d6\u0001J\u001f\u0010\u00cb\u0001\u001a\u00030\u00cc\u00012\b\u0010\u00cd\u0001\u001a\u00030\u00ce\u00012\b\u0010\u00cf\u0001\u001a\u00030\u00c4\u0001H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010DR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010DR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010DR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010DR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010DR\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010DR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010DR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010DR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010DR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010DR\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010DR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010DR\u0011\u00107\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010DR\u0011\u0010*\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010DR\u0011\u0010(\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010DR\u0011\u0010\'\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010DR\u0011\u0010.\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010DR\u0011\u0010)\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010DR\u0011\u00102\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010DR\u0011\u00104\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010DR\u0011\u0010+\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010DR\u0011\u0010,\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010DR\u0011\u00101\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010DR\u0011\u00103\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010DR\u0011\u00105\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010DR\u0011\u0010/\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010DR\u0011\u0010-\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010DR\u0011\u00100\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010DR\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010DR\u0011\u0010$\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010DR\u0011\u00106\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010DR\u0011\u0010&\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010DR\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010DR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010DR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010DR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010DR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010DR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010DR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010DR\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010DR\u0011\u0010A\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010DR\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010DR\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010DR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010DR\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010DR\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010DR\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010DR\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010DR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010DR\u0011\u00108\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010DR\u0011\u0010?\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010DR\u0011\u0010;\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010DR\u0011\u0010<\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010DR\u0011\u0010=\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010DR\u0011\u0010>\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010DR\u0011\u00109\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010DR\u0011\u0010:\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010DR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010DR\u0012\u0010%\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010DR\u0012\u0010#\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010DR\u0012\u0010@\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010D\u00a8\u0006\u00d0\u0001"}, d2 = {"Lcom/delarosa/team/data/server/response/Team;", "Landroid/os/Parcelable;", "idTeam", "", "idSoccerXML", "idAPIfootball", "intLoved", "strTeam", "strTeamShort", "strAlternate", "intFormedYear", "strSport", "strLeague", "idLeague", "strLeague2", "idLeague2", "strLeague3", "idLeague3", "strLeague4", "idLeague4", "strLeague5", "idLeague5", "strLeague6", "idLeague6", "strLeague7", "idLeague7", "strDivision", "strManager", "strStadium", "strKeywords", "strRSS", "strStadiumThumb", "strStadiumDescription", "strStadiumLocation", "intStadiumCapacity", "strWebsite", "strFacebook", "strTwitter", "strInstagram", "strDescriptionEN", "strDescriptionDE", "strDescriptionFR", "strDescriptionCN", "strDescriptionIT", "strDescriptionJP", "strDescriptionRU", "strDescriptionES", "strDescriptionPT", "strDescriptionSE", "strDescriptionNL", "strDescriptionHU", "strDescriptionNO", "strDescriptionIL", "strDescriptionPL", "strGender", "strCountry", "strTeamBadge", "strTeamJersey", "strTeamLogo", "strTeamFanart1", "strTeamFanart2", "strTeamFanart3", "strTeamFanart4", "strTeamBanner", "strYoutube", "strLocked", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdAPIfootball", "()Ljava/lang/String;", "getIdLeague", "getIdLeague2", "getIdLeague3", "getIdLeague4", "getIdLeague5", "getIdLeague6", "getIdLeague7", "getIdSoccerXML", "getIdTeam", "getIntFormedYear", "getIntLoved", "getIntStadiumCapacity", "getStrAlternate", "getStrCountry", "getStrDescriptionCN", "getStrDescriptionDE", "getStrDescriptionEN", "getStrDescriptionES", "getStrDescriptionFR", "getStrDescriptionHU", "getStrDescriptionIL", "getStrDescriptionIT", "getStrDescriptionJP", "getStrDescriptionNL", "getStrDescriptionNO", "getStrDescriptionPL", "getStrDescriptionPT", "getStrDescriptionRU", "getStrDescriptionSE", "getStrDivision", "getStrFacebook", "getStrGender", "getStrInstagram", "getStrKeywords", "getStrLeague", "getStrLeague2", "getStrLeague3", "getStrLeague4", "getStrLeague5", "getStrLeague6", "getStrLeague7", "getStrLocked", "getStrManager", "getStrRSS", "getStrSport", "getStrStadium", "getStrStadiumDescription", "getStrStadiumLocation", "getStrStadiumThumb", "getStrTeam", "getStrTeamBadge", "getStrTeamBanner", "getStrTeamFanart1", "getStrTeamFanart2", "getStrTeamFanart3", "getStrTeamFanart4", "getStrTeamJersey", "getStrTeamLogo", "getStrTeamShort", "getStrTwitter", "getStrWebsite", "getStrYoutube", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "team_debug"})
public final class Team implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idTeam = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idSoccerXML = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idAPIfootball = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String intLoved = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTeam = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTeamShort = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strAlternate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String intFormedYear = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strSport = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLeague = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idLeague = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLeague2 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idLeague2 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLeague3 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idLeague3 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLeague4 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idLeague4 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLeague5 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idLeague5 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLeague6 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idLeague6 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLeague7 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idLeague7 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDivision = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strManager = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strStadium = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strKeywords = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strRSS = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strStadiumThumb = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strStadiumDescription = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strStadiumLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String intStadiumCapacity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strWebsite = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strFacebook = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTwitter = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strInstagram = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionEN = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionDE = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionFR = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionCN = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionIT = null;
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
    private final java.lang.String strDescriptionIL = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionPL = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strGender = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strCountry = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTeamBadge = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTeamJersey = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTeamLogo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTeamFanart1 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTeamFanart2 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTeamFanart3 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTeamFanart4 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTeamBanner = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strYoutube = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLocked = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdTeam() {
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
    public final java.lang.String getIntLoved() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTeamShort() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAlternate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIntFormedYear() {
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
    public final java.lang.String getIdLeague() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLeague2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdLeague2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLeague3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdLeague3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLeague4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdLeague4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLeague5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdLeague5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLeague6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdLeague6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLeague7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdLeague7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDivision() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrStadium() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrKeywords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrRSS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrStadiumThumb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrStadiumDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrStadiumLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIntStadiumCapacity() {
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
    public final java.lang.String getStrInstagram() {
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
    public final java.lang.String getStrDescriptionCN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionIT() {
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
    public final java.lang.String getStrDescriptionIL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionPL() {
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
    public final java.lang.String getStrTeamBadge() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTeamJersey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTeamLogo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTeamFanart1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTeamFanart2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTeamFanart3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTeamFanart4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTeamBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrYoutube() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLocked() {
        return null;
    }
    
    public Team(@org.jetbrains.annotations.NotNull()
    java.lang.String idTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String idSoccerXML, @org.jetbrains.annotations.NotNull()
    java.lang.String idAPIfootball, @org.jetbrains.annotations.NotNull()
    java.lang.String intLoved, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamShort, @org.jetbrains.annotations.NotNull()
    java.lang.String strAlternate, @org.jetbrains.annotations.NotNull()
    java.lang.String intFormedYear, @org.jetbrains.annotations.NotNull()
    java.lang.String strSport, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague2, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague2, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague3, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague3, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague4, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague4, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague5, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague5, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague6, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague6, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague7, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague7, @org.jetbrains.annotations.NotNull()
    java.lang.String strDivision, @org.jetbrains.annotations.NotNull()
    java.lang.String strManager, @org.jetbrains.annotations.NotNull()
    java.lang.String strStadium, @org.jetbrains.annotations.NotNull()
    java.lang.String strKeywords, @org.jetbrains.annotations.NotNull()
    java.lang.String strRSS, @org.jetbrains.annotations.NotNull()
    java.lang.String strStadiumThumb, @org.jetbrains.annotations.NotNull()
    java.lang.String strStadiumDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String strStadiumLocation, @org.jetbrains.annotations.NotNull()
    java.lang.String intStadiumCapacity, @org.jetbrains.annotations.NotNull()
    java.lang.String strWebsite, @org.jetbrains.annotations.NotNull()
    java.lang.String strFacebook, @org.jetbrains.annotations.NotNull()
    java.lang.String strTwitter, @org.jetbrains.annotations.NotNull()
    java.lang.String strInstagram, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionEN, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionDE, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionFR, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionCN, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionIT, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionJP, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionRU, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionES, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionPT, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionSE, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionNL, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionHU, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionNO, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionIL, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionPL, @org.jetbrains.annotations.NotNull()
    java.lang.String strGender, @org.jetbrains.annotations.NotNull()
    java.lang.String strCountry, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamBadge, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamJersey, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamLogo, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamFanart1, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamFanart2, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamFanart3, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamFanart4, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamBanner, @org.jetbrains.annotations.NotNull()
    java.lang.String strYoutube, @org.jetbrains.annotations.NotNull()
    java.lang.String strLocked) {
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
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component48() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component49() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component50() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component51() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component52() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component53() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component54() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component55() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component56() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component57() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component58() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component59() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component60() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component61() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component62() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component63() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.delarosa.team.data.server.response.Team copy(@org.jetbrains.annotations.NotNull()
    java.lang.String idTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String idSoccerXML, @org.jetbrains.annotations.NotNull()
    java.lang.String idAPIfootball, @org.jetbrains.annotations.NotNull()
    java.lang.String intLoved, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamShort, @org.jetbrains.annotations.NotNull()
    java.lang.String strAlternate, @org.jetbrains.annotations.NotNull()
    java.lang.String intFormedYear, @org.jetbrains.annotations.NotNull()
    java.lang.String strSport, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague2, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague2, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague3, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague3, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague4, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague4, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague5, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague5, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague6, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague6, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague7, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague7, @org.jetbrains.annotations.NotNull()
    java.lang.String strDivision, @org.jetbrains.annotations.NotNull()
    java.lang.String strManager, @org.jetbrains.annotations.NotNull()
    java.lang.String strStadium, @org.jetbrains.annotations.NotNull()
    java.lang.String strKeywords, @org.jetbrains.annotations.NotNull()
    java.lang.String strRSS, @org.jetbrains.annotations.NotNull()
    java.lang.String strStadiumThumb, @org.jetbrains.annotations.NotNull()
    java.lang.String strStadiumDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String strStadiumLocation, @org.jetbrains.annotations.NotNull()
    java.lang.String intStadiumCapacity, @org.jetbrains.annotations.NotNull()
    java.lang.String strWebsite, @org.jetbrains.annotations.NotNull()
    java.lang.String strFacebook, @org.jetbrains.annotations.NotNull()
    java.lang.String strTwitter, @org.jetbrains.annotations.NotNull()
    java.lang.String strInstagram, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionEN, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionDE, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionFR, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionCN, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionIT, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionJP, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionRU, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionES, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionPT, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionSE, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionNL, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionHU, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionNO, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionIL, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionPL, @org.jetbrains.annotations.NotNull()
    java.lang.String strGender, @org.jetbrains.annotations.NotNull()
    java.lang.String strCountry, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamBadge, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamJersey, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamLogo, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamFanart1, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamFanart2, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamFanart3, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamFanart4, @org.jetbrains.annotations.NotNull()
    java.lang.String strTeamBanner, @org.jetbrains.annotations.NotNull()
    java.lang.String strYoutube, @org.jetbrains.annotations.NotNull()
    java.lang.String strLocked) {
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