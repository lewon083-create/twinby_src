package q3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import io.sentry.SentryEnvelopeItemHeader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f31653c = {"name", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f31655b;

    public g() {
        this.f31654a = new HashMap();
        this.f31655b = new ArrayList();
    }

    public void a(Object obj, String str) {
        HashMap map = (HashMap) this.f31654a;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.f31655b).remove(str);
    }

    public HashMap b() throws androidx.datastore.preferences.protobuf.m {
        try {
            ((String) this.f31655b).getClass();
            Cursor cursorQuery = ((o3.a) this.f31654a).getReadableDatabase().query((String) this.f31655b, f31653c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new f(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (SQLException e3) {
            throw new androidx.datastore.preferences.protobuf.m(e3);
        }
    }

    public void c(long j10) throws androidx.datastore.preferences.protobuf.m {
        o3.a aVar = (o3.a) this.f31654a;
        try {
            String hexString = Long.toHexString(j10);
            this.f31655b = "ExoPlayerCacheFileMetadata" + hexString;
            if (o3.b.a(aVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o3.b.b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.f31655b));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.f31655b) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e3) {
            throw new androidx.datastore.preferences.protobuf.m(e3);
        }
    }

    public void d(Set set) throws androidx.datastore.preferences.protobuf.m {
        ((String) this.f31655b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((o3.a) this.f31654a).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.f31655b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e3) {
            throw new androidx.datastore.preferences.protobuf.m(e3);
        }
    }

    public void e(long j10, long j11, String str) throws androidx.datastore.preferences.protobuf.m {
        ((String) this.f31655b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((o3.a) this.f31654a).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(SentryEnvelopeItemHeader.JsonKeys.LENGTH, Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow((String) this.f31655b, null, contentValues);
        } catch (SQLException e3) {
            throw new androidx.datastore.preferences.protobuf.m(e3);
        }
    }

    public g(o3.a aVar) {
        this.f31654a = aVar;
    }
}
