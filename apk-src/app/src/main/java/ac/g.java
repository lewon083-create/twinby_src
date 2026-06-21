package ac;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import d8.k;
import d8.o0;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import oa.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f749c;

    public /* synthetic */ g(int i, Object obj) {
        this.f748b = i;
        this.f749c = obj;
    }

    private final void b() {
        ReentrantReadWriteLock.ReadLock lock = ((l6.d) this.f749c).f27950c.f27974h.readLock();
        HashSet hashSetA = null;
        try {
            try {
                lock.lock();
            } catch (SQLiteException e3) {
                e = e3;
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            } catch (IllegalStateException e7) {
                e = e7;
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
            if (!((l6.d) this.f749c).a()) {
                lock.unlock();
                return;
            }
            if (!((l6.d) this.f749c).f27951d.compareAndSet(true, false)) {
                lock.unlock();
                return;
            }
            if (((SQLiteDatabase) ((l6.d) this.f749c).f27950c.f27969c.getWritableDatabase().f32252c).inTransaction()) {
                lock.unlock();
                return;
            }
            WorkDatabase_Impl workDatabase_Impl = ((l6.d) this.f749c).f27950c;
            if (workDatabase_Impl.f27972f) {
                r6.b writableDatabase = workDatabase_Impl.f27969c.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    hashSetA = a();
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            } else {
                hashSetA = a();
            }
            lock.unlock();
            if (hashSetA == null || hashSetA.isEmpty()) {
                return;
            }
            synchronized (((l6.d) this.f749c).f27955h) {
                try {
                    o.b bVar = (o.b) ((l6.d) this.f749c).f27955h.iterator();
                    if (bVar.hasNext()) {
                        ((l6.c) ((Map.Entry) bVar.next()).getValue()).getClass();
                        throw null;
                    }
                } finally {
                }
            }
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }

    public HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor cursorG = ((l6.d) this.f749c).f27950c.g(new k("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 2));
        while (cursorG.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(cursorG.getInt(0)));
            } catch (Throwable th2) {
                cursorG.close();
                throw th2;
            }
        }
        cursorG.close();
        if (!hashSet.isEmpty()) {
            ((l6.d) this.f749c).f27953f.k();
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        com.google.android.gms.internal.auth.g.l("SequentialExecutor", "Exception while executing runnable " + r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f749c     // Catch: java.lang.Throwable -> L4f
            j0.i r2 = (j0.i) r2     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r2 = r2.f26139b     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f749c     // Catch: java.lang.Throwable -> L20
            j0.i r0 = (j0.i) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f26142e     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L44
        L20:
            r0 = move-exception
            goto L69
        L22:
            long r6 = r0.f26143f     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f26143f = r6     // Catch: java.lang.Throwable -> L20
            r0.f26142e = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f749c     // Catch: java.lang.Throwable -> L20
            j0.i r4 = (j0.i) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f26139b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L45
            java.lang.Object r0 = r10.f749c     // Catch: java.lang.Throwable -> L20
            j0.i r0 = (j0.i) r0     // Catch: java.lang.Throwable -> L20
            r0.f26142e = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
            goto L18
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            goto L2
        L4f:
            r0 = move-exception
            goto L6b
        L51:
            r2 = move-exception
            java.lang.String r3 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            r5.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.auth.g.l(r3, r4, r2)     // Catch: java.lang.Throwable -> L4f
            goto L2
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L4f
        L6b:
            if (r1 == 0) goto L74
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L74:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.g.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01a6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.g.run():void");
    }

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.f748b = i;
        this.f749c = obj;
    }

    public g(o0 o0Var, boolean z5) {
        this.f748b = 25;
        this.f749c = o0Var;
    }

    public g(x xVar) {
        this.f748b = 24;
        Objects.requireNonNull(xVar);
        this.f749c = xVar;
    }
}
