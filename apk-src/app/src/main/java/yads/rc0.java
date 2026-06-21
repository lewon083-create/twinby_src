package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rc0 implements qp3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f42542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f42543f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w30 f42545b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42547d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42544a = "ExoPlayerDownloads";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42546c = new Object();

    static {
        int[] iArr = {3, 4};
        StringBuilder sb2 = new StringBuilder("state IN (");
        for (int i = 0; i < 2; i++) {
            if (i > 0) {
                sb2.append(',');
            }
            sb2.append(iArr[i]);
        }
        sb2.append(')');
        f42542e = sb2.toString();
        f42543f = new String[]{"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", SentryThread.JsonKeys.STATE, "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public rc0(l33 l33Var, int i) {
        this.f42545b = l33Var;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            int i = lb3.f40466a;
            for (String str2 : str.split(StringUtils.COMMA, -1)) {
                String[] strArrSplit = str2.split("\\.", -1);
                if (strArrSplit.length != 3) {
                    throw new IllegalStateException();
                }
                arrayList.add(new y33(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
            }
        }
        return arrayList;
    }

    public final hj0 b(String str) throws v30 {
        a();
        try {
            Cursor cursorA = a("id = ?", new String[]{str});
            try {
                if (cursorA.getCount() == 0) {
                    cursorA.close();
                    return null;
                }
                cursorA.moveToNext();
                hj0 hj0VarA = a(cursorA);
                cursorA.close();
                return hj0VarA;
            } finally {
            }
        } catch (SQLiteException e3) {
            throw new v30(e3);
        }
        throw new v30(e3);
    }

    public final void c() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(SentryThread.JsonKeys.STATE, (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f42545b.getWritableDatabase().update(this.f42544a, contentValues, null, null);
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public static hj0 b(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else if ("ss".equals(string3)) {
            str = "application/vnd.ms-sstr+xml";
        } else {
            str = "video/x-unknown";
        }
        qj0 qj0Var = new qj0(string, uri, str, a(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5));
        oj0 oj0Var = new oj0();
        oj0Var.f41549a = cursor.getLong(13);
        oj0Var.f41550b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new hj0(qj0Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, oj0Var);
    }

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f42546c) {
            if (this.f42547d) {
                return;
            }
            try {
                int iA = td3.a(this.f42545b.getReadableDatabase(), 0, "");
                if (iA != 3) {
                    SQLiteDatabase writableDatabase = this.f42545b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        td3.a(writableDatabase, 0, "", 3);
                        if (iA == 2) {
                            arrayList = a(writableDatabase);
                        } else {
                            arrayList = new ArrayList();
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f42544a);
                        writableDatabase.execSQL("CREATE TABLE " + this.f42544a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            a((hj0) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                this.f42547d = true;
            } catch (Throwable th3) {
                throw new v30(th3);
            }
        }
    }

    public final Cursor a(String str, String[] strArr) {
        try {
            return this.f42545b.getReadableDatabase().query(this.f42544a, f42543f, str, strArr, null, null, "start_time_ms ASC");
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public final void b() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(SentryThread.JsonKeys.STATE, (Integer) 0);
            this.f42545b.getWritableDatabase().update(this.f42544a, contentValues, "state = 2", null);
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public static hj0 a(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String string3 = cursor.getString(1);
        ArrayList arrayListA = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        qj0 qj0Var = new qj0(string, uri, string3, arrayListA, blob, cursor.getString(4), cursor.getBlob(5));
        oj0 oj0Var = new oj0();
        oj0Var.f41549a = cursor.getLong(13);
        oj0Var.f41550b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new hj0(qj0Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, oj0Var);
    }

    public final ArrayList a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!lb3.a(sQLiteDatabase, this.f42544a)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.f42544a, new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", SentryThread.JsonKeys.STATE, "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(b(cursorQuery));
            } finally {
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void a(hj0 hj0Var) {
        a();
        try {
            a(hj0Var, this.f42545b.getWritableDatabase());
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public final void a(hj0 hj0Var, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = hj0Var.f39211a.f42320f;
        if (bArr == null) {
            bArr = lb3.f40471f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", hj0Var.f39211a.f42316b);
        contentValues.put("mime_type", hj0Var.f39211a.f42318d);
        contentValues.put("uri", hj0Var.f39211a.f42317c.toString());
        List list = hj0Var.f39211a.f42319e;
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            y33 y33Var = (y33) list.get(i);
            sb2.append(y33Var.f44912b);
            sb2.append('.');
            sb2.append(y33Var.f44913c);
            sb2.append('.');
            sb2.append(y33Var.f44914d);
            sb2.append(',');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        contentValues.put("stream_keys", sb2.toString());
        contentValues.put("custom_cache_key", hj0Var.f39211a.f42321g);
        contentValues.put("data", hj0Var.f39211a.f42322h);
        contentValues.put(SentryThread.JsonKeys.STATE, Integer.valueOf(hj0Var.f39212b));
        contentValues.put("start_time_ms", Long.valueOf(hj0Var.f39213c));
        contentValues.put("update_time_ms", Long.valueOf(hj0Var.f39214d));
        contentValues.put("content_length", Long.valueOf(hj0Var.f39215e));
        contentValues.put("stop_reason", Integer.valueOf(hj0Var.f39216f));
        contentValues.put("failure_reason", Integer.valueOf(hj0Var.f39217g));
        contentValues.put("percent_downloaded", Float.valueOf(hj0Var.f39218h.f41550b));
        contentValues.put("bytes_downloaded", Long.valueOf(hj0Var.f39218h.f41549a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f42544a, null, contentValues);
    }

    public final void a(int i, String str) {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.f42545b.getWritableDatabase().update(this.f42544a, contentValues, f42542e + " AND id = ?", new String[]{str});
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }
}
