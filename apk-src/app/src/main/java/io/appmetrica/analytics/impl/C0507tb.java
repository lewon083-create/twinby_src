package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0507tb implements Ia, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f24764a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f24765b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24766c = "preferences";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0482sb f24767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f24768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0652z6 f24769f;

    public C0507tb(InterfaceC0652z6 interfaceC0652z6) {
        this.f24769f = interfaceC0652z6;
        Locale locale = Locale.US;
        C0482sb c0482sb = new C0482sb(this, l7.o.i(ThreadFactoryC0659zd.a(), "IAA-DW-"));
        this.f24767d = c0482sb;
        c0482sb.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(io.appmetrica.analytics.impl.C0507tb r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            io.appmetrica.analytics.impl.z6 r4 = r13.f24769f     // Catch: java.lang.Throwable -> L84
            android.database.sqlite.SQLiteDatabase r5 = r4.a()     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L85
            java.lang.String r6 = r13.f24766c     // Catch: java.lang.Throwable -> L85
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Throwable -> L85
            r11 = 0
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L85
        L21:
            boolean r6 = r4.moveToNext()     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L82
            int r6 = r4.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L82
            int r7 = r4.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = r4.getString(r7)     // Catch: java.lang.Throwable -> L82
            int r8 = r4.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L82
            int r8 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L82
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L82
            if (r9 != 0) goto L21
            r9 = 1
            if (r8 == r9) goto L65
            r9 = 2
            if (r8 == r9) goto L60
            r9 = 3
            if (r8 == r9) goto L5b
            r9 = 4
            if (r8 == r9) goto L7a
            r9 = 5
            if (r8 == r9) goto L56
        L54:
            r7 = r3
            goto L7a
        L56:
            java.lang.Float r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseFloat(r7)     // Catch: java.lang.Throwable -> L82
            goto L7a
        L5b:
            java.lang.Long r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(r7)     // Catch: java.lang.Throwable -> L82
            goto L7a
        L60:
            java.lang.Integer r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseInt(r7)     // Catch: java.lang.Throwable -> L82
            goto L7a
        L65:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch: java.lang.Throwable -> L82
            if (r8 == 0) goto L70
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L82
            goto L7a
        L70:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L82
            if (r7 == 0) goto L54
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L82
        L7a:
            if (r7 == 0) goto L21
            java.util.HashMap r8 = r13.f24764a     // Catch: java.lang.Throwable -> L82
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L82
            goto L21
        L82:
            r3 = r4
            goto L85
        L84:
            r5 = r3
        L85:
            io.appmetrica.analytics.impl.ko.a(r3)
            io.appmetrica.analytics.impl.z6 r13 = r13.f24769f
            r13.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0507tb.a(io.appmetrica.analytics.impl.tb):void");
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b() {
        synchronized (this.f24767d) {
            this.f24767d.notifyAll();
        }
    }

    public final void c() {
        if (this.f24768e) {
            return;
        }
        try {
            this.f24764a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f24767d.isRunning()) {
            this.f24767d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean getBoolean(String str, boolean z5) {
        Object objB = b(str);
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z5;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final int getInt(String str, int i) {
        Object objB = b(str);
        return objB instanceof Integer ? ((Integer) objB).intValue() : i;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final long getLong(String str, long j10) {
        Object objB = b(str);
        return objB instanceof Long ? ((Long) objB).longValue() : j10;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final String getString(String str, String str2) {
        Object objB = b(str);
        return objB instanceof String ? (String) objB : str2;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia remove(String str) {
        synchronized (this.f24764a) {
            c();
            this.f24764a.remove(str);
        }
        synchronized (this.f24767d) {
            this.f24765b.put(str, this);
            this.f24767d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f24764a) {
            c();
            obj = this.f24764a.get(str);
        }
        return obj;
    }

    public static void a(C0507tb c0507tb, HashMap map) {
        SQLiteDatabase sQLiteDatabaseA;
        c0507tb.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c0507tb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i] = contentValues;
            i++;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = c0507tb.f24769f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    for (int i10 = 0; i10 < size; i10++) {
                        ContentValues contentValues2 = contentValuesArr[i10];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabaseA.delete(c0507tb.f24766c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabaseA.insertWithOnConflict(c0507tb.f24766c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabaseA = sQLiteDatabase;
                }
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c0507tb.f24769f.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final synchronized Ia a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final synchronized Ia a(int i, String str) {
        a(str, Integer.valueOf(i));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, boolean z5) {
        a(str, Boolean.valueOf(z5));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean a(String str) {
        boolean zContainsKey;
        synchronized (this.f24764a) {
            c();
            zContainsKey = this.f24764a.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f24764a) {
            hashSet = new HashSet(this.f24764a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f24764a) {
            c();
            this.f24764a.put(str, obj);
        }
        synchronized (this.f24767d) {
            this.f24765b.put(str, obj);
            this.f24767d.notifyAll();
        }
    }
}
