package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class is implements ks {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f39622e = {"id", "key", "metadata"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w30 f39623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f39624b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39626d;

    public is(kn0 kn0Var) {
        this.f39623a = kn0Var;
    }

    @Override // yads.ks
    public final boolean a() {
        SQLiteDatabase readableDatabase = this.f39623a.getReadableDatabase();
        String str = this.f39625c;
        str.getClass();
        return td3.a(readableDatabase, 1, str) != -1;
    }

    @Override // yads.ks
    public final void b() throws v30 {
        w30 w30Var = this.f39623a;
        String str = this.f39625c;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = w30Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = td3.f43289a;
                try {
                    if (lb3.a(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e3) {
                    throw new v30(e3);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e7) {
            throw new v30(e7);
        }
    }

    @Override // yads.ks
    public final void a(long j10) {
        String hexString = Long.toHexString(j10);
        this.f39625c = hexString;
        this.f39626d = com.google.android.gms.internal.ads.om1.k("ExoPlayerCacheIndex", hexString);
    }

    @Override // yads.ks
    public final void a(HashMap map, SparseArray sparseArray) throws v30 {
        if (this.f39624b.size() == 0) {
            try {
                SQLiteDatabase readableDatabase = this.f39623a.getReadableDatabase();
                String str = this.f39625c;
                str.getClass();
                if (td3.a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = this.f39623a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        String str2 = this.f39625c;
                        str2.getClass();
                        td3.a(writableDatabase, 1, str2, 1);
                        String str3 = this.f39626d;
                        str3.getClass();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str3));
                        writableDatabase.execSQL("CREATE TABLE " + this.f39626d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                SQLiteDatabase readableDatabase2 = this.f39623a.getReadableDatabase();
                String str4 = this.f39626d;
                str4.getClass();
                Cursor cursorQuery = readableDatabase2.query(str4, f39622e, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        int i = cursorQuery.getInt(0);
                        String string = cursorQuery.getString(1);
                        string.getClass();
                        map.put(string, new hs(i, string, ls.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                        sparseArray.put(i, string);
                    } finally {
                    }
                }
                cursorQuery.close();
                return;
            } catch (SQLiteException e3) {
                map.clear();
                sparseArray.clear();
                throw new v30(e3);
            }
        }
        throw new IllegalStateException();
    }

    @Override // yads.ks
    public final void b(HashMap map) throws v30 {
        try {
            SQLiteDatabase writableDatabase = this.f39623a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                String str = this.f39625c;
                str.getClass();
                td3.a(writableDatabase, 1, str, 1);
                String str2 = this.f39626d;
                str2.getClass();
                writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
                writableDatabase.execSQL("CREATE TABLE " + this.f39626d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                for (hs hsVar : map.values()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    jc0 jc0Var = hsVar.f39301e;
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    Set<Map.Entry> setEntrySet = jc0Var.f39822b.entrySet();
                    dataOutputStream.writeInt(setEntrySet.size());
                    for (Map.Entry entry : setEntrySet) {
                        dataOutputStream.writeUTF((String) entry.getKey());
                        byte[] bArr = (byte[]) entry.getValue();
                        dataOutputStream.writeInt(bArr.length);
                        dataOutputStream.write(bArr);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", Integer.valueOf(hsVar.f39297a));
                    contentValues.put("key", hsVar.f39298b);
                    contentValues.put("metadata", byteArray);
                    String str3 = this.f39626d;
                    str3.getClass();
                    writableDatabase.replaceOrThrow(str3, null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                this.f39624b.clear();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e3) {
            throw new v30(e3);
        }
    }

    @Override // yads.ks
    public final void a(hs hsVar, boolean z5) {
        if (z5) {
            this.f39624b.delete(hsVar.f39297a);
        } else {
            this.f39624b.put(hsVar.f39297a, null);
        }
    }

    @Override // yads.ks
    public final void a(hs hsVar) {
        this.f39624b.put(hsVar.f39297a, hsVar);
    }

    @Override // yads.ks
    public final void a(HashMap map) throws v30 {
        if (this.f39624b.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f39623a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < this.f39624b.size(); i++) {
                try {
                    hs hsVar = (hs) this.f39624b.valueAt(i);
                    if (hsVar == null) {
                        int iKeyAt = this.f39624b.keyAt(i);
                        String str = this.f39626d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        jc0 jc0Var = hsVar.f39301e;
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        Set<Map.Entry> setEntrySet = jc0Var.f39822b.entrySet();
                        dataOutputStream.writeInt(setEntrySet.size());
                        for (Map.Entry entry : setEntrySet) {
                            dataOutputStream.writeUTF((String) entry.getKey());
                            byte[] bArr = (byte[]) entry.getValue();
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.write(bArr);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("id", Integer.valueOf(hsVar.f39297a));
                        contentValues.put("key", hsVar.f39298b);
                        contentValues.put("metadata", byteArray);
                        String str2 = this.f39626d;
                        str2.getClass();
                        writableDatabase.replaceOrThrow(str2, null, contentValues);
                    }
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.f39624b.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e3) {
            throw new v30(e3);
        }
    }
}
