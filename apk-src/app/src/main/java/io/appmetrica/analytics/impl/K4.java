package io.appmetrica.analytics.impl;

import android.database.Cursor;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class K4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22549a = "sessions";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22550b = VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22551c = "id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22552d = "start_time";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22553e = "report_request_parameters";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22554f = "server_time_offset";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22555g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22556h = "obtained_before_first_sync";
    public final C0528u7 i = new C0528u7(null, 1, 0 == true ? 1 : 0);

    public final C0503t7 a(Cursor cursor) {
        try {
            Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f22551c)));
            int i = cursor.getInt(cursor.getColumnIndexOrThrow(this.f22555g));
            Uk uk2 = Uk.FOREGROUND;
            boolean z5 = true;
            if (i != 0) {
                uk2 = Uk.BACKGROUND;
                if (i != 1) {
                    uk2 = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f22553e));
            Long lValueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f22552d)));
            Long lValueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f22554f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f22556h)) != 1) {
                z5 = false;
            }
            return new C0503t7(lValueOf, uk2, string, new C0478s7(lValueOf2, lValueOf3, Boolean.valueOf(z5)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void runScript(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r3 = r11.f22549a     // Catch: java.lang.Throwable -> L5a
            int r2 = r11.f22550b     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5b
        L19:
            boolean r3 = r12.moveToNext()     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L5e
            io.appmetrica.analytics.impl.t7 r3 = r11.a(r12)     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L19
            java.lang.Long r4 = r3.f24757a     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5c
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L19
            io.appmetrica.analytics.impl.Uk r4 = r3.f24758b     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            java.lang.String r4 = r3.f24759c     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L5c
            if (r4 != 0) goto L42
            goto L19
        L42:
            io.appmetrica.analytics.impl.s7 r4 = r3.f24760d     // Catch: java.lang.Throwable -> L5c
            java.lang.Long r4 = r4.f24730a     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5c
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L19
            io.appmetrica.analytics.impl.u7 r4 = r11.i     // Catch: java.lang.Throwable -> L5c
            android.content.ContentValues r3 = r4.fromModel(r3)     // Catch: java.lang.Throwable -> L5c
            r0.add(r3)     // Catch: java.lang.Throwable -> L5c
            goto L19
        L5a:
            r2 = r12
        L5b:
            r12 = r1
        L5c:
            if (r12 == 0) goto L61
        L5e:
            r12.close()
        L61:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r3 = "DROP TABLE IF EXISTS "
            r12.<init>(r3)
            java.lang.String r3 = r11.f22549a
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r2.execSQL(r12)
            java.lang.String r12 = "CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )"
            r2.execSQL(r12)
            java.util.Iterator r12 = r0.iterator()
        L7d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r12.next()
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            java.lang.String r3 = "sessions"
            r2.insertOrThrow(r3, r1, r0)     // Catch: java.lang.Throwable -> L7d
            goto L7d
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.K4.runScript(android.database.sqlite.SQLiteDatabase):void");
    }
}
