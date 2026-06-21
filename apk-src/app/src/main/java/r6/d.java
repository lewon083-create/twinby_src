package r6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import l6.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b[] f32255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f32256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, b[] bVarArr, i iVar) {
        super(context, str, null, 12, new c(iVar, bVarArr));
        iVar.getClass();
        this.f32256c = iVar;
        this.f32255b = bVarArr;
    }

    public static b a(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
        b bVar = bVarArr[0];
        if (bVar == null || ((SQLiteDatabase) bVar.f32252c) != sQLiteDatabase) {
            bVarArr[0] = new b(sQLiteDatabase, 0);
        }
        return bVarArr[0];
    }

    public final synchronized b b() {
        this.f32257d = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f32257d) {
            return a(this.f32255b, writableDatabase);
        }
        close();
        return b();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f32255b[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(this.f32255b, sQLiteDatabase);
        this.f32256c.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r6) {
        /*
            r5 = this;
            r6.b[] r0 = r5.f32255b
            r6.b r6 = a(r0, r6)
            l6.i r0 = r5.f32256c
            java.lang.Object r1 = r0.f27979d
            k6.t0 r1 = (k6.t0) r1
            java.lang.String r2 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r2 = r6.i(r2)
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L21
            r4 = 0
            if (r3 == 0) goto L23
            int r3 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            r3 = 1
            goto L24
        L21:
            r6 = move-exception
            goto L6d
        L23:
            r3 = r4
        L24:
            r2.close()
            k6.t0.c(r6)
            if (r3 != 0) goto L4b
            l6.h r2 = k6.t0.n(r6)
            boolean r3 = r2.f27976b
            if (r3 == 0) goto L35
            goto L4b
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            java.lang.String r1 = r2.f27975a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L4b:
            r0.l(r6)
            java.lang.Object r6 = r1.f27180c
            androidx.work.impl.WorkDatabase_Impl r6 = (androidx.work.impl.WorkDatabase_Impl) r6
            int r0 = androidx.work.impl.WorkDatabase_Impl.f1767s
            java.util.List r0 = r6.f27973g
            if (r0 == 0) goto L6c
            int r0 = r0.size()
        L5c:
            if (r4 >= r0) goto L6c
            java.util.List r1 = r6.f27973g
            java.lang.Object r1 = r1.get(r4)
            m7.g r1 = (m7.g) r1
            r1.getClass()
            int r4 = r4 + 1
            goto L5c
        L6c:
            return
        L6d:
            r2.close()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.d.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        this.f32257d = true;
        this.f32256c.h(a(this.f32255b, sQLiteDatabase), i, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r11) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.d.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        this.f32257d = true;
        this.f32256c.h(a(this.f32255b, sQLiteDatabase), i, i10);
    }
}
