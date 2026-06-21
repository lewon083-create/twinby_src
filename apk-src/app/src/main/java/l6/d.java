package l6;

import a0.u;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.tr0;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f27947j = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f27949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase_Impl f27950c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile r6.f f27953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tr0 f27954g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f27951d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f27952e = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o.f f27955h = new o.f();
    public final ac.g i = new ac.g(17, this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f27948a = new HashMap();

    public d(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        this.f27950c = workDatabase_Impl;
        this.f27954g = new tr0(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f27949b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f27948a.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) map.get(strArr[i]);
            if (str2 != null) {
                this.f27949b[i] = str2.toLowerCase(locale);
            } else {
                this.f27949b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f27948a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.f27948a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        r6.b bVar = this.f27950c.f27967a;
        if (bVar == null || !((SQLiteDatabase) bVar.f32252c).isOpen()) {
            return false;
        }
        if (!this.f27952e) {
            this.f27950c.f27969c.getWritableDatabase();
        }
        if (this.f27952e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(r6.b bVar, int i) {
        bVar.execSQL(u.k(i, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)"));
        String str = this.f27949b[i];
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            String str2 = f27947j[i10];
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append("`");
            sb2.append("room_table_modification_trigger_");
            o.t(sb2, str, "_", str2, "`");
            o.t(sb2, " AFTER ", str2, " ON `", str);
            o.t(sb2, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            o.t(sb2, " = 1", " WHERE ", "table_id", " = ");
            gf.a.q(i, " AND ", "invalidated", " = 0", sb2);
            sb2.append("; END");
            bVar.execSQL(sb2.toString());
        }
    }

    public final void c(r6.b bVar) {
        if (((SQLiteDatabase) bVar.f32252c).inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.f27950c.f27974h.readLock();
                lock.lock();
                try {
                    int[] iArrA = this.f27954g.a();
                    if (iArrA == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    bVar.beginTransaction();
                    for (int i = 0; i < length; i++) {
                        try {
                            int i10 = iArrA[i];
                            if (i10 == 1) {
                                b(bVar, i);
                            } else if (i10 == 2) {
                                String str = this.f27949b[i];
                                StringBuilder sb2 = new StringBuilder();
                                String[] strArr = f27947j;
                                for (int i11 = 0; i11 < 3; i11++) {
                                    String str2 = strArr[i11];
                                    sb2.setLength(0);
                                    sb2.append("DROP TRIGGER IF EXISTS ");
                                    sb2.append("`");
                                    sb2.append("room_table_modification_trigger_");
                                    sb2.append(str);
                                    sb2.append("_");
                                    sb2.append(str2);
                                    sb2.append("`");
                                    bVar.execSQL(sb2.toString());
                                }
                            }
                        } catch (Throwable th2) {
                            bVar.endTransaction();
                            throw th2;
                        }
                    }
                    bVar.setTransactionSuccessful();
                    bVar.endTransaction();
                    tr0 tr0Var = this.f27954g;
                    synchronized (tr0Var) {
                        tr0Var.f10702c = false;
                    }
                    lock.unlock();
                } catch (Throwable th3) {
                    lock.unlock();
                    throw th3;
                }
            } catch (SQLiteException | IllegalStateException e3) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
                return;
            }
        }
    }
}
