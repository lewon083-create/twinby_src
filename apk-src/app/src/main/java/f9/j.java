package f9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.firebase.messaging.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements d, g9.c, c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v8.c f16712g = new v8.c("proto");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f16713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9.a f16714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h9.a f16715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f16716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hj.a f16717f;

    public j(h9.a aVar, h9.a aVar2, a aVar3, m mVar, hj.a aVar4) {
        this.f16713b = mVar;
        this.f16714c = aVar;
        this.f16715d = aVar2;
        this.f16716e = aVar3;
        this.f16717f = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, y8.j jVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f36552a, String.valueOf(i9.a.a(jVar.f36554c))));
        byte[] bArr = jVar.f36553b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = cursorQuery;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String k(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f16702a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object l(Cursor cursor, h hVar) {
        try {
            return hVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        m mVar = this.f16713b;
        Objects.requireNonNull(mVar);
        h9.a aVar = this.f16715d;
        long jB = aVar.b();
        while (true) {
            try {
                return mVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e3) {
                if (aVar.b() >= ((long) this.f16716e.f16699c) + jB) {
                    throw new g9.a("Timed out while trying to open db.", e3);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16713b.close();
    }

    public final Object d(h hVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = hVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final ArrayList h(SQLiteDatabase sQLiteDatabase, y8.j jVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lB = b(sQLiteDatabase, jVar);
        if (lB == null) {
            return arrayList;
        }
        l(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lB.toString()}, null, null, null, String.valueOf(i)), new o(this, arrayList, jVar, 3));
        return arrayList;
    }

    public final void i(long j10, b9.c cVar, String str) {
        d(new e9.g(str, cVar, j10, 1));
    }

    public final Object j(g9.b bVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        h9.a aVar = this.f16715d;
        long jB = aVar.b();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objExecute = bVar.execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e3) {
                if (aVar.b() >= ((long) this.f16716e.f16699c) + jB) {
                    throw new g9.a("Timed out while trying to acquire the lock.", e3);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
