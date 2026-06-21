package com.google.gson.internal.bind;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import me.w;
import me.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final l A;
    public static final x B;
    public static final x C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f14987a = new TypeAdapters$32(Class.class, new m(new l(10), 3));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f14988b = new TypeAdapters$32(BitSet.class, new m(new l(20), 3));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f14989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f14990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f14991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f14992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x f14993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f14994h;
    public static final x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f14995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f14996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x f14997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x f14998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l f14999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l f15000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final x f15001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final x f15002q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x f15003r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final x f15004s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final x f15005t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final x f15006u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x f15007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final x f15008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final x f15009x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final x f15010y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final x f15011z;

    static {
        l lVar = new l(21);
        f14989c = new l(22);
        f14990d = new TypeAdapters$33(Boolean.TYPE, Boolean.class, lVar);
        f14991e = new TypeAdapters$33(Byte.TYPE, Byte.class, new l(23));
        f14992f = new TypeAdapters$33(Short.TYPE, Short.class, new l(24));
        f14993g = new TypeAdapters$33(Integer.TYPE, Integer.class, new l(25));
        f14994h = new TypeAdapters$32(AtomicInteger.class, new m(new l(26), 3));
        i = new TypeAdapters$32(AtomicBoolean.class, new m(new l(27), 3));
        f14995j = new TypeAdapters$32(AtomicIntegerArray.class, new m(new l(0), 3));
        f14996k = new l(1);
        f14997l = new TypeAdapters$32(Number.class, new l(4));
        f14998m = new TypeAdapters$33(Character.TYPE, Character.class, new l(5));
        l lVar2 = new l(6);
        f14999n = new l(7);
        f15000o = new l(8);
        f15001p = new TypeAdapters$32(String.class, lVar2);
        f15002q = new TypeAdapters$32(StringBuilder.class, new l(9));
        f15003r = new TypeAdapters$32(StringBuffer.class, new l(11));
        f15004s = new TypeAdapters$32(URL.class, new l(12));
        f15005t = new TypeAdapters$32(URI.class, new l(13));
        f15006u = new TypeAdapters$35(InetAddress.class, new l(14));
        f15007v = new TypeAdapters$32(UUID.class, new l(15));
        f15008w = new TypeAdapters$32(Currency.class, new m(new l(16), 3));
        f15009x = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            @Override // me.x
            public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
                if (aVar.getRawType() != Timestamp.class) {
                    return null;
                }
                return new m(kVar.d(com.google.gson.reflect.a.get(Date.class)), 0);
            }
        };
        final l lVar3 = new l(17);
        f15010y = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$34
            @Override // me.x
            public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return lVar3;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + lVar3 + "]";
            }
        };
        f15011z = new TypeAdapters$32(Locale.class, new l(18));
        l lVar4 = new l(19);
        A = lVar4;
        B = new TypeAdapters$35(me.p.class, lVar4);
        C = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$30
            @Override // me.x
            public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
                Class rawType = aVar.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new n(rawType);
            }
        };
    }

    public static x a(final com.google.gson.reflect.a aVar, final w wVar) {
        return new x() { // from class: com.google.gson.internal.bind.TypeAdapters$31
            @Override // me.x
            public final w a(me.k kVar, com.google.gson.reflect.a aVar2) {
                if (aVar2.equals(aVar)) {
                    return wVar;
                }
                return null;
            }
        };
    }

    public static x b(Class cls, Class cls2, w wVar) {
        return new TypeAdapters$33(cls, cls2, wVar);
    }

    public static x c(Class cls, w wVar) {
        return new TypeAdapters$32(cls, wVar);
    }
}
