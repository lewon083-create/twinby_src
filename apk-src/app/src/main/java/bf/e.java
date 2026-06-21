package bf;

import a0.d1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.measurement.b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Boolean f2095n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f2100e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f2103h;
    public SQLiteDatabase i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f2106l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2101f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f2102g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2104j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2105k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2107m = 0;

    public e(Context context, String str, int i, boolean z5, int i10) {
        this.f2100e = context;
        this.f2097b = str;
        this.f2096a = z5;
        this.f2098c = i;
        this.f2099d = i10;
    }

    public static void a(SQLiteStatement sQLiteStatement, Object[] objArr) {
        int i = 0;
        while (i < objArr.length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                sQLiteStatement.bindNull(i);
            } else if (obj instanceof byte[]) {
                sQLiteStatement.bindBlob(i, (byte[]) obj);
            } else if ((obj instanceof Double) || (obj instanceof Float)) {
                sQLiteStatement.bindDouble(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Number) {
                sQLiteStatement.bindLong(i, ((Number) obj).longValue());
            } else if (obj instanceof Boolean) {
                sQLiteStatement.bindLong(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                sQLiteStatement.bindString(i, obj.toString());
            }
        }
    }

    public static HashMap d(Cursor cursor, Integer num) {
        HashMap map = null;
        ArrayList arrayList = null;
        int columnCount = 0;
        while (cursor.moveToNext()) {
            if (map == null) {
                arrayList = new ArrayList();
                map = new HashMap();
                columnCount = cursor.getColumnCount();
                map.put("columns", Arrays.asList(cursor.getColumnNames()));
                map.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(columnCount);
            for (int i = 0; i < columnCount; i++) {
                int type = cursor.getType(i);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i) : cursor.getString(i) : Double.valueOf(cursor.getDouble(i)) : Long.valueOf(cursor.getLong(i)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    public final void b() {
        HashMap map = this.f2102g;
        if (!map.isEmpty() && this.f2099d >= 1) {
            Log.d("Sqflite", i() + map.size() + " cursor(s) are left opened");
        }
        this.i.close();
    }

    public final void c(j jVar) {
        try {
            int i = jVar.f2123a;
            if (a.a(this.f2099d)) {
                Log.d("Sqflite", i() + "closing cursor " + i);
            }
            this.f2102g.remove(Integer.valueOf(i));
            jVar.f2125c.close();
        } catch (Exception unused) {
        }
    }

    public final boolean e(b4 b4Var) {
        n nVarA = b4Var.A();
        if (this.f2099d >= 1) {
            Log.d("Sqflite", i() + nVarA);
        }
        try {
            SQLiteStatement sQLiteStatementCompileStatement = this.i.compileStatement(nVarA.f2148a);
            a(sQLiteStatementCompileStatement, nVarA.a());
            long jExecuteInsert = sQLiteStatementCompileStatement.executeInsert();
            if (b4Var.y()) {
                b4Var.success(null);
                return true;
            }
            b4Var.success(Long.valueOf(jExecuteInsert));
            return true;
        } catch (Exception e3) {
            j(e3, b4Var);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [bf.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.measurement.b4] */
    public final boolean f(b4 b4Var) throws Throwable {
        Integer num = (Integer) b4Var.t("cursorPageSize");
        final ?? A = b4Var.A();
        if (this.f2099d >= 1) {
            Log.d("Sqflite", i() + A);
        }
        j jVar = null;
        try {
            try {
                A = this.i.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: bf.c
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        List list = A.f2149b;
                        if (list != null) {
                            int size = list.size();
                            int i = 0;
                            while (i < size) {
                                Object objB = n.b(list.get(i));
                                int i10 = i + 1;
                                if (objB == null) {
                                    sQLiteQuery.bindNull(i10);
                                } else if (objB instanceof byte[]) {
                                    sQLiteQuery.bindBlob(i10, (byte[]) objB);
                                } else if (objB instanceof Double) {
                                    sQLiteQuery.bindDouble(i10, ((Double) objB).doubleValue());
                                } else if (objB instanceof Integer) {
                                    sQLiteQuery.bindLong(i10, ((Integer) objB).intValue());
                                } else if (objB instanceof Long) {
                                    sQLiteQuery.bindLong(i10, ((Long) objB).longValue());
                                } else if (objB instanceof String) {
                                    sQLiteQuery.bindString(i10, (String) objB);
                                } else {
                                    if (!(objB instanceof Boolean)) {
                                        throw new IllegalArgumentException("Could not bind " + objB + " from index " + i + ": Supported types are null, byte[], double, long, boolean and String");
                                    }
                                    sQLiteQuery.bindLong(i10, ((Boolean) objB).booleanValue() ? 1L : 0L);
                                }
                                i = i10;
                            }
                        }
                        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
                    }
                }, A.f2148a, a.f2090a, null);
                try {
                    HashMap mapD = d(A, num);
                    if (num != null && !A.isLast() && !A.isAfterLast()) {
                        int i = this.f2107m + 1;
                        this.f2107m = i;
                        mapD.put("cursorId", Integer.valueOf(i));
                        j jVar2 = new j(i, num.intValue(), A);
                        try {
                            this.f2102g.put(Integer.valueOf(i), jVar2);
                            jVar = jVar2;
                        } catch (Exception e3) {
                            e = e3;
                            jVar = jVar2;
                            j(e, b4Var);
                            if (jVar != null) {
                                c(jVar);
                            }
                            if (jVar != null || A == 0) {
                                return false;
                            }
                            A.close();
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            jVar = jVar2;
                            if (jVar == null && A != 0) {
                                A.close();
                            }
                            throw th;
                        }
                    }
                    b4Var.success(mapD);
                    if (jVar == null) {
                        A.close();
                    }
                    return true;
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Exception e10) {
                e = e10;
                A = 0;
            } catch (Throwable th3) {
                th = th3;
                A = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final boolean g(b4 b4Var) {
        n nVarA = b4Var.A();
        if (this.f2099d >= 1) {
            Log.d("Sqflite", i() + nVarA);
        }
        try {
            SQLiteStatement sQLiteStatementCompileStatement = this.i.compileStatement(nVarA.f2148a);
            a(sQLiteStatementCompileStatement, nVarA.a());
            int iExecuteUpdateDelete = sQLiteStatementCompileStatement.executeUpdateDelete();
            if (b4Var.y()) {
                b4Var.success(null);
                return true;
            }
            b4Var.success(Integer.valueOf(iExecuteUpdateDelete));
            return true;
        } catch (Exception e3) {
            j(e3, b4Var);
            return false;
        }
    }

    public final boolean h(b4 b4Var) {
        n nVarA = b4Var.A();
        if (this.f2099d >= 1) {
            Log.d("Sqflite", i() + nVarA);
        }
        Object objT = b4Var.t("inTransaction");
        Boolean bool = objT instanceof Boolean ? (Boolean) objT : null;
        try {
            this.i.execSQL(nVarA.f2148a, nVarA.a());
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.f2104j++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.f2104j--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        } catch (Exception e3) {
            j(e3, b4Var);
            return false;
        }
    }

    public final String i() {
        StringBuilder sb2 = new StringBuilder("[");
        Thread threadCurrentThread = Thread.currentThread();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f2098c);
        sb3.append(StringUtils.COMMA);
        sb3.append(threadCurrentThread.getName());
        sb3.append("(");
        sb3.append(Build.VERSION.SDK_INT >= 36 ? threadCurrentThread.threadId() : threadCurrentThread.getId());
        sb3.append(")");
        sb2.append(sb3.toString());
        sb2.append("] ");
        return sb2.toString();
    }

    public final void j(Exception exc, b4 b4Var) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            b4Var.n(null, "open_failed " + this.f2097b);
        } else {
            if (exc instanceof SQLException) {
                String message = exc.getMessage();
                n nVarA = b4Var.A();
                HashMap map = new HashMap();
                map.put("sql", nVarA.f2148a);
                map.put("arguments", nVarA.f2149b);
                b4Var.n(map, message);
                return;
            }
            String message2 = exc.getMessage();
            n nVarA2 = b4Var.A();
            HashMap map2 = new HashMap();
            map2.put("sql", nVarA2.f2148a);
            map2.put("arguments", nVarA2.f2149b);
            b4Var.n(map2, message2);
        }
    }

    public final synchronized boolean k() {
        return this.f2104j > 0;
    }

    public final void l() {
        if (f2095n == null) {
            Context context = this.f2100e;
            boolean z5 = false;
            try {
                String packageName = context.getPackageName();
                if ((Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(packageName, 128)).metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z5 = true;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            f2095n = Boolean.valueOf(z5);
            if (z5 && a.a(this.f2099d)) {
                Log.d("Sqflite", i() + "[sqflite] WAL enabled");
            }
        }
        this.i = SQLiteDatabase.openDatabase(this.f2097b, null, f2095n.booleanValue() ? 805306368 : 268435456);
    }

    public final void m(cf.b bVar, Runnable runnable) {
        Integer num = (Integer) bVar.t("transactionId");
        Integer num2 = this.f2106l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f2101f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new cf.d(runnable));
            return;
        }
        runnable.run();
        if (this.f2106l != null || arrayList.isEmpty()) {
            return;
        }
        this.f2103h.a(this, new d1(7, this));
    }
}
