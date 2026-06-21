package l6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile r6.b f27967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f27968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q6.b f27969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f27970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f27973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f27974h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public g() {
        new ConcurrentHashMap();
        this.f27970d = d();
    }

    public final void a() {
        if (!this.f27971e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((SQLiteDatabase) this.f27969c.getWritableDatabase().f32252c).inTransaction() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        r6.b writableDatabase = this.f27969c.getWritableDatabase();
        this.f27970d.c(writableDatabase);
        writableDatabase.beginTransaction();
    }

    public abstract d d();

    public abstract q6.b e(a aVar);

    public final void f() {
        this.f27969c.getWritableDatabase().endTransaction();
        if (((SQLiteDatabase) this.f27969c.getWritableDatabase().f32252c).inTransaction()) {
            return;
        }
        d dVar = this.f27970d;
        if (dVar.f27951d.compareAndSet(false, true)) {
            dVar.f27950c.f27968b.execute(dVar.i);
        }
    }

    public final Cursor g(q6.c cVar) {
        a();
        b();
        return this.f27969c.getWritableDatabase().j(cVar);
    }

    public final void h() {
        this.f27969c.getWritableDatabase().setTransactionSuccessful();
    }
}
