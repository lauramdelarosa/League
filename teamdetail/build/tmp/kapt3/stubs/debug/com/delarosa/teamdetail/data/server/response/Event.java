package com.delarosa.teamdetail.data.server.response;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u00b7\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00e5\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u0003\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003\u00a2\u0006\u0002\u0010?J\t\u0010}\u001a\u00020\u0003H\u00c6\u0003J\t\u0010~\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00aa\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ac\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ae\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00af\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b1\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b3\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b4\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\u0003H\u00c6\u0003J\u00e2\u0004\u0010\u00b9\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u0003H\u00c6\u0001J\u000b\u0010\u00ba\u0001\u001a\u00030\u00bb\u0001H\u00d6\u0001J\u0017\u0010\u00bc\u0001\u001a\u00030\u00bd\u00012\n\u0010\u00be\u0001\u001a\u0005\u0018\u00010\u00bf\u0001H\u00d6\u0003J\u000b\u0010\u00c0\u0001\u001a\u00030\u00bb\u0001H\u00d6\u0001J\n\u0010\u00c1\u0001\u001a\u00020\u0003H\u00d6\u0001J\u001f\u0010\u00c2\u0001\u001a\u00030\u00c3\u00012\b\u0010\u00c4\u0001\u001a\u00030\u00c5\u00012\b\u0010\u00c6\u0001\u001a\u00030\u00bb\u0001H\u00d6\u0001R\u0011\u0010(\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010)\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010AR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010AR\u0011\u0010/\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010AR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010AR\u0011\u0010.\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010AR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010AR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010AR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010AR\u0011\u0010\'\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010AR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010AR\u0011\u0010&\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010AR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010AR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010AR\u0011\u0010%\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010AR\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010AR\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010AR\u0011\u0010#\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010AR\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010AR\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010AR\u0011\u0010$\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010AR\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010AR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010AR\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010AR\u0011\u00107\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010AR\u0011\u00101\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010AR\u0011\u00103\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010AR\u0011\u00102\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010AR\u0011\u0010*\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010AR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010AR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010AR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010AR\u0011\u00105\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010AR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010AR\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010AR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010AR\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010AR\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010AR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010AR\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010AR\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010AR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010AR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010AR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010AR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010AR\u0011\u0010>\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010AR\u0011\u00108\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010AR\u0011\u00104\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010AR\u0011\u0010=\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010AR\u0011\u00100\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010AR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010AR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010AR\u0011\u0010-\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010AR\u0011\u00106\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010AR\u0011\u0010+\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010AR\u0011\u0010,\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010AR\u0011\u00109\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010AR\u0011\u0010:\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010AR\u0011\u0010;\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010AR\u0011\u0010<\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010A\u00a8\u0006\u00c7\u0001"}, d2 = {"Lcom/delarosa/teamdetail/data/server/response/Event;", "Landroid/os/Parcelable;", "idEvent", "", "idSoccerXML", "idAPIfootball", "strEvent", "strEventAlternate", "strFilename", "strSport", "idLeague", "strLeague", "strSeason", "strDescriptionEN", "strHomeTeam", "strAwayTeam", "intHomeScore", "intRound", "intAwayScore", "intSpectators", "strHomeGoalDetails", "strHomeRedCards", "strHomeYellowCards", "strHomeLineupGoalkeeper", "strHomeLineupDefense", "strHomeLineupMidfield", "strHomeLineupForward", "strHomeLineupSubstitutes", "strHomeFormation", "strAwayRedCards", "strAwayYellowCards", "strAwayGoalDetails", "strAwayLineupGoalkeeper", "strAwayLineupDefense", "strAwayLineupMidfield", "strAwayLineupForward", "strAwayLineupSubstitutes", "strAwayFormation", "intHomeShots", "intAwayShots", "dateEvent", "dateEventLocal", "strDate", "strTime", "strTimeLocal", "strTVStation", "idHomeTeam", "idAwayTeam", "strResult", "strCircuit", "strCountry", "strCity", "strPoster", "strFanart", "strThumb", "strBanner", "strMap", "strTweet1", "strTweet2", "strTweet3", "strVideo", "strPostponed", "strLocked", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateEvent", "()Ljava/lang/String;", "getDateEventLocal", "getIdAPIfootball", "getIdAwayTeam", "getIdEvent", "getIdHomeTeam", "getIdLeague", "getIdSoccerXML", "getIntAwayScore", "getIntAwayShots", "getIntHomeScore", "getIntHomeShots", "getIntRound", "getIntSpectators", "getStrAwayFormation", "getStrAwayGoalDetails", "getStrAwayLineupDefense", "getStrAwayLineupForward", "getStrAwayLineupGoalkeeper", "getStrAwayLineupMidfield", "getStrAwayLineupSubstitutes", "getStrAwayRedCards", "getStrAwayTeam", "getStrAwayYellowCards", "getStrBanner", "getStrCircuit", "getStrCity", "getStrCountry", "getStrDate", "getStrDescriptionEN", "getStrEvent", "getStrEventAlternate", "getStrFanart", "getStrFilename", "getStrHomeFormation", "getStrHomeGoalDetails", "getStrHomeLineupDefense", "getStrHomeLineupForward", "getStrHomeLineupGoalkeeper", "getStrHomeLineupMidfield", "getStrHomeLineupSubstitutes", "getStrHomeRedCards", "getStrHomeTeam", "getStrHomeYellowCards", "getStrLeague", "getStrLocked", "getStrMap", "getStrPoster", "getStrPostponed", "getStrResult", "getStrSeason", "getStrSport", "getStrTVStation", "getStrThumb", "getStrTime", "getStrTimeLocal", "getStrTweet1", "getStrTweet2", "getStrTweet3", "getStrVideo", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "teamdetail_debug"})
public final class Event implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idSoccerXML = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idAPIfootball = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strEventAlternate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strFilename = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strSport = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idLeague = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLeague = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strSeason = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDescriptionEN = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strHomeTeam = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strAwayTeam = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String intHomeScore = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String intRound = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String intAwayScore = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String intSpectators = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strHomeGoalDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strHomeRedCards = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strHomeYellowCards = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strHomeLineupGoalkeeper = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strHomeLineupDefense = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strHomeLineupMidfield = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strHomeLineupForward = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strHomeLineupSubstitutes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strHomeFormation = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strAwayRedCards = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strAwayYellowCards = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strAwayGoalDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strAwayLineupGoalkeeper = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strAwayLineupDefense = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strAwayLineupMidfield = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strAwayLineupForward = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strAwayLineupSubstitutes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strAwayFormation = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String intHomeShots = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String intAwayShots = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dateEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dateEventLocal = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTimeLocal = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTVStation = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idHomeTeam = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idAwayTeam = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strResult = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strCircuit = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strCountry = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strCity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strPoster = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strFanart = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strThumb = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strBanner = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strMap = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTweet1 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTweet2 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strTweet3 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strVideo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strPostponed = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String strLocked = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdEvent() {
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
    public final java.lang.String getStrEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrEventAlternate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrFilename() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrSport() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdLeague() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLeague() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrSeason() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDescriptionEN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrHomeTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAwayTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIntHomeScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIntRound() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIntAwayScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIntSpectators() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrHomeGoalDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrHomeRedCards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrHomeYellowCards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrHomeLineupGoalkeeper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrHomeLineupDefense() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrHomeLineupMidfield() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrHomeLineupForward() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrHomeLineupSubstitutes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrHomeFormation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAwayRedCards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAwayYellowCards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAwayGoalDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAwayLineupGoalkeeper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAwayLineupDefense() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAwayLineupMidfield() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAwayLineupForward() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAwayLineupSubstitutes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAwayFormation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIntHomeShots() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIntAwayShots() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateEventLocal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTimeLocal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTVStation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdHomeTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdAwayTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrCircuit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrPoster() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrFanart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrThumb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTweet1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTweet2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrTweet3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrVideo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrPostponed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLocked() {
        return null;
    }
    
    public Event(@org.jetbrains.annotations.NotNull()
    java.lang.String idEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String idSoccerXML, @org.jetbrains.annotations.NotNull()
    java.lang.String idAPIfootball, @org.jetbrains.annotations.NotNull()
    java.lang.String strEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String strEventAlternate, @org.jetbrains.annotations.NotNull()
    java.lang.String strFilename, @org.jetbrains.annotations.NotNull()
    java.lang.String strSport, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague, @org.jetbrains.annotations.NotNull()
    java.lang.String strSeason, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionEN, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String intHomeScore, @org.jetbrains.annotations.NotNull()
    java.lang.String intRound, @org.jetbrains.annotations.NotNull()
    java.lang.String intAwayScore, @org.jetbrains.annotations.NotNull()
    java.lang.String intSpectators, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeGoalDetails, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeRedCards, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeYellowCards, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeLineupGoalkeeper, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeLineupDefense, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeLineupMidfield, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeLineupForward, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeLineupSubstitutes, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeFormation, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayRedCards, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayYellowCards, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayGoalDetails, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayLineupGoalkeeper, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayLineupDefense, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayLineupMidfield, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayLineupForward, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayLineupSubstitutes, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayFormation, @org.jetbrains.annotations.NotNull()
    java.lang.String intHomeShots, @org.jetbrains.annotations.NotNull()
    java.lang.String intAwayShots, @org.jetbrains.annotations.NotNull()
    java.lang.String dateEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String dateEventLocal, @org.jetbrains.annotations.NotNull()
    java.lang.String strDate, @org.jetbrains.annotations.NotNull()
    java.lang.String strTime, @org.jetbrains.annotations.NotNull()
    java.lang.String strTimeLocal, @org.jetbrains.annotations.NotNull()
    java.lang.String strTVStation, @org.jetbrains.annotations.NotNull()
    java.lang.String idHomeTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String idAwayTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String strResult, @org.jetbrains.annotations.NotNull()
    java.lang.String strCircuit, @org.jetbrains.annotations.NotNull()
    java.lang.String strCountry, @org.jetbrains.annotations.NotNull()
    java.lang.String strCity, @org.jetbrains.annotations.NotNull()
    java.lang.String strPoster, @org.jetbrains.annotations.NotNull()
    java.lang.String strFanart, @org.jetbrains.annotations.NotNull()
    java.lang.String strThumb, @org.jetbrains.annotations.NotNull()
    java.lang.String strBanner, @org.jetbrains.annotations.NotNull()
    java.lang.String strMap, @org.jetbrains.annotations.NotNull()
    java.lang.String strTweet1, @org.jetbrains.annotations.NotNull()
    java.lang.String strTweet2, @org.jetbrains.annotations.NotNull()
    java.lang.String strTweet3, @org.jetbrains.annotations.NotNull()
    java.lang.String strVideo, @org.jetbrains.annotations.NotNull()
    java.lang.String strPostponed, @org.jetbrains.annotations.NotNull()
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
    public final com.delarosa.teamdetail.data.server.response.Event copy(@org.jetbrains.annotations.NotNull()
    java.lang.String idEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String idSoccerXML, @org.jetbrains.annotations.NotNull()
    java.lang.String idAPIfootball, @org.jetbrains.annotations.NotNull()
    java.lang.String strEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String strEventAlternate, @org.jetbrains.annotations.NotNull()
    java.lang.String strFilename, @org.jetbrains.annotations.NotNull()
    java.lang.String strSport, @org.jetbrains.annotations.NotNull()
    java.lang.String idLeague, @org.jetbrains.annotations.NotNull()
    java.lang.String strLeague, @org.jetbrains.annotations.NotNull()
    java.lang.String strSeason, @org.jetbrains.annotations.NotNull()
    java.lang.String strDescriptionEN, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String intHomeScore, @org.jetbrains.annotations.NotNull()
    java.lang.String intRound, @org.jetbrains.annotations.NotNull()
    java.lang.String intAwayScore, @org.jetbrains.annotations.NotNull()
    java.lang.String intSpectators, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeGoalDetails, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeRedCards, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeYellowCards, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeLineupGoalkeeper, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeLineupDefense, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeLineupMidfield, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeLineupForward, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeLineupSubstitutes, @org.jetbrains.annotations.NotNull()
    java.lang.String strHomeFormation, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayRedCards, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayYellowCards, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayGoalDetails, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayLineupGoalkeeper, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayLineupDefense, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayLineupMidfield, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayLineupForward, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayLineupSubstitutes, @org.jetbrains.annotations.NotNull()
    java.lang.String strAwayFormation, @org.jetbrains.annotations.NotNull()
    java.lang.String intHomeShots, @org.jetbrains.annotations.NotNull()
    java.lang.String intAwayShots, @org.jetbrains.annotations.NotNull()
    java.lang.String dateEvent, @org.jetbrains.annotations.NotNull()
    java.lang.String dateEventLocal, @org.jetbrains.annotations.NotNull()
    java.lang.String strDate, @org.jetbrains.annotations.NotNull()
    java.lang.String strTime, @org.jetbrains.annotations.NotNull()
    java.lang.String strTimeLocal, @org.jetbrains.annotations.NotNull()
    java.lang.String strTVStation, @org.jetbrains.annotations.NotNull()
    java.lang.String idHomeTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String idAwayTeam, @org.jetbrains.annotations.NotNull()
    java.lang.String strResult, @org.jetbrains.annotations.NotNull()
    java.lang.String strCircuit, @org.jetbrains.annotations.NotNull()
    java.lang.String strCountry, @org.jetbrains.annotations.NotNull()
    java.lang.String strCity, @org.jetbrains.annotations.NotNull()
    java.lang.String strPoster, @org.jetbrains.annotations.NotNull()
    java.lang.String strFanart, @org.jetbrains.annotations.NotNull()
    java.lang.String strThumb, @org.jetbrains.annotations.NotNull()
    java.lang.String strBanner, @org.jetbrains.annotations.NotNull()
    java.lang.String strMap, @org.jetbrains.annotations.NotNull()
    java.lang.String strTweet1, @org.jetbrains.annotations.NotNull()
    java.lang.String strTweet2, @org.jetbrains.annotations.NotNull()
    java.lang.String strTweet3, @org.jetbrains.annotations.NotNull()
    java.lang.String strVideo, @org.jetbrains.annotations.NotNull()
    java.lang.String strPostponed, @org.jetbrains.annotations.NotNull()
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