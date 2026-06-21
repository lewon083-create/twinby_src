package ob;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import io.sentry.protocol.App;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f30308f = {App.JsonKeys.APP_VERSION, "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f30309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30310e;

    public n0(l1 l1Var) {
        super(l1Var);
        this.f30309d = new m(this, ((l1) this.f15951b).f30260b);
    }

    @Override // ob.f0
    public final boolean F() {
        return false;
    }

    public final void G() {
        int iDelete;
        l1 l1Var = (l1) this.f15951b;
        C();
        try {
            SQLiteDatabase sQLiteDatabaseI = I();
            if (sQLiteDatabaseI == null || (iDelete = sQLiteDatabaseI.delete("messages", null, null)) <= 0) {
                return;
            }
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30418o.g(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e3) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30411g.g(e3, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[PHI: r5
      0x0070: PHI (r5v4 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:32:0x0081, B:28:0x006e, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H() {
        /*
            r11 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            java.lang.Object r1 = r11.f15951b
            ob.l1 r1 = (ob.l1) r1
            r11.C()
            boolean r2 = r11.f30310e
            r3 = 0
            if (r2 == 0) goto L10
            goto L99
        L10:
            android.content.Context r2 = r1.f30260b
            java.lang.String r4 = "google_app_measurement_local.db"
            java.io.File r2 = r2.getDatabasePath(r4)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L99
            r2 = 5
            r5 = r2
            r4 = r3
        L21:
            if (r4 >= r2) goto L8d
            r6 = 0
            r7 = 1
            android.database.sqlite.SQLiteDatabase r6 = r11.I()     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            if (r6 != 0) goto L2e
            r11.f30310e = r7     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            goto L99
        L2e:
            r6.beginTransaction()     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            java.lang.String r8 = "messages"
            java.lang.String r9 = "type == ?"
            r10 = 3
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            r6.delete(r8, r9, r10)     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            r6.endTransaction()     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            r6.close()
            return r7
        L4b:
            r0 = move-exception
            goto L87
        L4d:
            r8 = move-exception
            if (r6 == 0) goto L59
            boolean r9 = r6.inTransaction()     // Catch: java.lang.Throwable -> L4b
            if (r9 == 0) goto L59
            r6.endTransaction()     // Catch: java.lang.Throwable -> L4b
        L59:
            ob.s0 r9 = r1.f30265g     // Catch: java.lang.Throwable -> L4b
            ob.l1.k(r9)     // Catch: java.lang.Throwable -> L4b
            com.google.android.gms.internal.ads.ur r9 = r9.f30411g     // Catch: java.lang.Throwable -> L4b
            r9.g(r8, r0)     // Catch: java.lang.Throwable -> L4b
            r11.f30310e = r7     // Catch: java.lang.Throwable -> L4b
            if (r6 == 0) goto L84
            goto L70
        L68:
            long r7 = (long) r5     // Catch: java.lang.Throwable -> L4b
            android.os.SystemClock.sleep(r7)     // Catch: java.lang.Throwable -> L4b
            int r5 = r5 + 20
            if (r6 == 0) goto L84
        L70:
            r6.close()
            goto L84
        L74:
            r8 = move-exception
            ob.s0 r9 = r1.f30265g     // Catch: java.lang.Throwable -> L4b
            ob.l1.k(r9)     // Catch: java.lang.Throwable -> L4b
            com.google.android.gms.internal.ads.ur r9 = r9.f30411g     // Catch: java.lang.Throwable -> L4b
            r9.g(r8, r0)     // Catch: java.lang.Throwable -> L4b
            r11.f30310e = r7     // Catch: java.lang.Throwable -> L4b
            if (r6 == 0) goto L84
            goto L70
        L84:
            int r4 = r4 + 1
            goto L21
        L87:
            if (r6 == 0) goto L8c
            r6.close()
        L8c:
            throw r0
        L8d:
            ob.s0 r0 = r1.f30265g
            ob.l1.k(r0)
            com.google.android.gms.internal.ads.ur r0 = r0.f30413j
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.f(r1)
        L99:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n0.H():boolean");
    }

    public final SQLiteDatabase I() {
        if (this.f30310e) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f30309d.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f30310e = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[Catch: SQLiteException -> 0x0093, SQLiteDatabaseLockedException -> 0x009a, SQLiteFullException -> 0x009e, all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0150 A[PHI: r8 r10 r17
      0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
      (r10v5 android.database.sqlite.SQLiteDatabase)
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J(int r19, byte[] r20) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n0.J(int, byte[]):boolean");
    }
}
