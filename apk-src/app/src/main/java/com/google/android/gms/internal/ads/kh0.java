package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kh0 extends hw0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r81 f7232c;

    public kh0(Context context, r81 r81Var) {
        super(context, "AdMobOfflineBufferedPings.db", ((Integer) q9.s.f31967e.f31970c.a(al.f3257w9)).intValue());
        this.f7231b = context;
        this.f7232c = r81Var;
    }

    public static void d(SQLiteDatabase sQLiteDatabase, u9.l lVar) {
        SQLiteDatabase sQLiteDatabase2;
        String[] strArr;
        String string;
        String string2;
        sQLiteDatabase.beginTransaction();
        try {
            strArr = new String[]{"timestamp", "url"};
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("event_state = 1");
            string = sb2.toString();
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", strArr, string, null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr2 = new String[count];
            int i = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("timestamp");
                int columnIndex2 = cursorQuery.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j10 = cursorQuery.getLong(columnIndex);
                    String string3 = cursorQuery.getString(columnIndex2);
                    if (string3 == null) {
                        string2 = "";
                    } else {
                        Uri uri = Uri.parse(string3);
                        p9.k.C.f31304k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
                        String encodedQuery = uri.getEncodedQuery();
                        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                        builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                        String strValueOf = String.valueOf(builderClearQuery.build());
                        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length());
                        sb3.append(strValueOf);
                        sb3.append("&");
                        sb3.append(encodedQuery);
                        string2 = sb3.toString();
                    }
                    strArr2[i] = string2;
                }
                i++;
            }
            cursorQuery.close();
            sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase2.setTransactionSuccessful();
            sQLiteDatabase2.endTransaction();
            for (int i10 = 0; i10 < count; i10++) {
                lVar.a(strArr2[i10], null);
            }
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            sQLiteDatabase2.endTransaction();
            throw th4;
        }
    }

    public final void a(jr0 jr0Var) {
        ze zeVar = new ze(6, this);
        gx gxVar = (gx) this.f7232c;
        ed.d dVarB = gxVar.b(zeVar);
        dVarB.a(new l81(0, dVarB, new gk0(25, this, jr0Var)), gxVar);
    }

    public final void b(String str) {
        a(new h91(str, 7));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
