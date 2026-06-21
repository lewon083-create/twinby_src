package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.sentry.ProfilingTraceData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class J4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22491a = 2000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22492b = "number";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22493c = "global_number";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22494d = "number_of_type";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22495e = "name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22496f = "value";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22497g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22498h = "time";
    public final String i = "session_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f22499j = "error_environment";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f22500k = "session_type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f22501l = "app_environment";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f22502m = "app_environment_revision";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f22503n = "truncated";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f22504o = "custom_type";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f22505p = "encrypting_mode";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f22506q = ProfilingTraceData.JsonKeys.PROFILE_ID;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f22507r = "first_occurrence_status";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f22508s = "source";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f22509t = "attribution_id_changed";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f22510u = "open_id";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f22511v = "extras";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f22512w = "reports";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0177g7 f22513x = new C0177g7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C0151f7 c0151f7) {
        Long l10;
        EnumC0078cb enumC0078cb;
        Long l11;
        Long l12;
        Long l13 = c0151f7.f23834a;
        if (l13 == null || l13.longValue() < 10000000000L || c0151f7.f23835b == null || (l10 = c0151f7.f23836c) == null || l10.longValue() < 0 || (enumC0078cb = c0151f7.f23837d) == null || enumC0078cb == EnumC0078cb.EVENT_TYPE_UNDEFINED || (l11 = c0151f7.f23838e) == null || l11.longValue() < 0 || (l12 = c0151f7.f23839f) == null || l12.longValue() < 0) {
            return false;
        }
        Long l14 = c0151f7.f23840g.f23735d;
        if (l14 != null && l14.longValue() < 0) {
            return false;
        }
        Integer num = c0151f7.f23840g.i;
        return num == null || num.intValue() >= 0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorQuery;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor = null;
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                cursorQuery = sQLiteDatabase2.query(this.f22512w, null, null, null, null, null, null, String.valueOf(this.f22491a));
                while (cursorQuery.moveToNext()) {
                    try {
                        C0151f7 c0151f7A = a(cursorQuery);
                        if (c0151f7A != null && a(c0151f7A)) {
                            try {
                                sQLiteDatabase2.insertOrThrow("events", null, this.f22513x.fromModel(c0151f7A));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursorQuery = cursor;
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f22512w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursorQuery.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f22512w);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0115 A[PHI: r4
      0x0115: PHI (r4v8 io.appmetrica.analytics.impl.n9) = (r4v7 io.appmetrica.analytics.impl.n9), (r4v9 io.appmetrica.analytics.impl.n9), (r4v10 io.appmetrica.analytics.impl.n9) binds: [B:38:0x0120, B:32:0x0113, B:35:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C0151f7 a(android.database.Cursor r32) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.J4.a(android.database.Cursor):io.appmetrica.analytics.impl.f7");
    }
}
