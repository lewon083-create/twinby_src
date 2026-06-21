package q3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import m3.z;
import t.x1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f31670e = {"id", "key", "metadata"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3.a f31671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f31672b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31674d;

    public l(o3.a aVar) {
        this.f31671a = aVar;
    }

    @Override // q3.m
    public final void a(k kVar, boolean z5) {
        int i = kVar.f31665a;
        SparseArray sparseArray = this.f31672b;
        if (z5) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    @Override // q3.m
    public final void b(HashMap map) throws androidx.datastore.preferences.protobuf.m {
        try {
            SQLiteDatabase writableDatabase = this.f31671a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                i(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    h(writableDatabase, (k) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.f31672b.clear();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e3) {
            throw new androidx.datastore.preferences.protobuf.m(e3);
        }
    }

    @Override // q3.m
    public final boolean c() throws androidx.datastore.preferences.protobuf.m {
        try {
            SQLiteDatabase readableDatabase = this.f31671a.getReadableDatabase();
            String str = this.f31673c;
            str.getClass();
            return o3.b.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e3) {
            throw new androidx.datastore.preferences.protobuf.m(e3);
        }
    }

    @Override // q3.m
    public final void d(HashMap map) throws androidx.datastore.preferences.protobuf.m {
        SparseArray sparseArray = this.f31672b;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f31671a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    k kVar = (k) sparseArray.valueAt(i);
                    if (kVar == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = this.f31674d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        h(writableDatabase, kVar);
                    }
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e3) {
            throw new androidx.datastore.preferences.protobuf.m(e3);
        }
    }

    @Override // q3.m
    public final void delete() throws androidx.datastore.preferences.protobuf.m {
        o3.a aVar = this.f31671a;
        String str = this.f31673c;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = o3.b.f29598a;
                try {
                    String str2 = z.f28608a;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e3) {
                    throw new androidx.datastore.preferences.protobuf.m(e3);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e7) {
            throw new androidx.datastore.preferences.protobuf.m(e7);
        }
    }

    @Override // q3.m
    public final void e(long j10) {
        String hexString = Long.toHexString(j10);
        this.f31673c = hexString;
        this.f31674d = om1.k("ExoPlayerCacheIndex", hexString);
    }

    @Override // q3.m
    public final void f(k kVar) {
        this.f31672b.put(kVar.f31665a, kVar);
    }

    @Override // q3.m
    public final void g(HashMap map, SparseArray sparseArray) throws androidx.datastore.preferences.protobuf.m {
        o3.a aVar = this.f31671a;
        h5.r(this.f31672b.size() == 0);
        try {
            SQLiteDatabase readableDatabase = aVar.getReadableDatabase();
            String str = this.f31673c;
            str.getClass();
            if (o3.b.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    i(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            SQLiteDatabase readableDatabase2 = aVar.getReadableDatabase();
            String str2 = this.f31674d;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, f31670e, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new k(i, string, x1.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, string);
                } finally {
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e3) {
            map.clear();
            sparseArray.clear();
            throw new androidx.datastore.preferences.protobuf.m(e3);
        }
    }

    public final void h(SQLiteDatabase sQLiteDatabase, k kVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        x1.b(kVar.f31669e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(kVar.f31665a));
        contentValues.put("key", kVar.f31666b);
        contentValues.put("metadata", byteArray);
        String str = this.f31674d;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public final void i(SQLiteDatabase sQLiteDatabase) throws androidx.datastore.preferences.protobuf.m {
        String str = this.f31673c;
        str.getClass();
        o3.b.b(sQLiteDatabase, 1, str);
        String str2 = this.f31674d;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f31674d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }
}
