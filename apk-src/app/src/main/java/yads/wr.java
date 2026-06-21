package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.sentry.SentryEnvelopeItemHeader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f44453c = {"name", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w30 f44454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44455b;

    public wr(kn0 kn0Var) {
        this.f44454a = kn0Var;
    }

    public final HashMap a() throws v30 {
        try {
            this.f44455b.getClass();
            Cursor cursorQuery = this.f44454a.getReadableDatabase().query(this.f44455b, f44453c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new vr(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public final void a(long j10) throws v30 {
        try {
            String hexString = Long.toHexString(j10);
            this.f44455b = "ExoPlayerCacheFileMetadata" + hexString;
            if (td3.a(this.f44454a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f44454a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    td3.a(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f44455b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f44455b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public final void a(Set set) throws v30 {
        this.f44455b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f44454a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f44455b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            throw new v30(th3);
        }
    }

    public final void a(String str, long j10, long j11) throws v30 {
        this.f44455b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f44454a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(SentryEnvelopeItemHeader.JsonKeys.LENGTH, Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f44455b, null, contentValues);
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }
}
