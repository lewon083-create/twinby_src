package j1;

import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements ed.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f26161e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f26162f = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final hl.l f26163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f26164h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f26165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f26166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile f f26167d;

    static {
        hl.l eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "d"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "b"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            eVar = new e();
        }
        f26163g = eVar;
        if (th != null) {
            f26162f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f26164h = new Object();
    }

    public static void e(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f26167d;
        } while (!f26163g.f(gVar, fVar, f.f26158c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f26159a;
            if (thread != null) {
                fVar.f26159a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f26160b;
        }
        gVar.d();
        do {
            cVar2 = gVar.f26166c;
        } while (!f26163g.d(gVar, cVar2, c.f26149d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f26152c;
            cVar.f26152c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f26152c;
            f(cVar3.f26150a, cVar3.f26151b);
            cVar3 = cVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f26162f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f26147b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f26148a);
        }
        if (obj == f26164h) {
            return null;
        }
        return obj;
    }

    public static Object h(g gVar) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th2) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // ed.d
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f26166c;
        c cVar2 = c.f26149d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f26152c = cVar;
                if (f26163g.d(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f26166c;
                }
            } while (cVar != cVar2);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        try {
            Object objH = h(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objH == this ? "this future" : String.valueOf(objH));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e3.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e7) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e7.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f26165b;
        if (obj == null) {
            if (f26163g.e(this, obj, f26161e ? new a(new CancellationException("Future.cancel() was called."), z5) : z5 ? a.f26144c : a.f26145d)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        f fVar = f.f26158c;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f26165b;
        if (obj != null) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f26167d;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    hl.l lVar = f26163g;
                    lVar.n(fVar3, fVar2);
                    if (lVar.f(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f26165b;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(fVar3);
                    } else {
                        fVar2 = this.f26167d;
                    }
                } while (fVar2 != fVar);
            }
            return g(this.f26165b);
        }
        while (nanos > 0) {
            Object obj3 = this.f26165b;
            if (obj3 != null) {
                return g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbN = gf.a.n("Waited ", " ", j10);
        sbN.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbN.toString();
        if (nanos + 1000 < 0) {
            String strX = om1.x(string3, " (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z5 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strX2 = strX + jConvert + " " + lowerCase;
                if (z5) {
                    strX2 = om1.x(strX2, StringUtils.COMMA);
                }
                strX = om1.x(strX2, " ");
            }
            if (z5) {
                strX = strX + nanos2 + " nanoseconds ";
            }
            string3 = om1.x(strX, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(om1.x(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(gf.a.k(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26165b instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26165b != null;
    }

    public final void j(f fVar) {
        fVar.f26159a = null;
        while (true) {
            f fVar2 = this.f26167d;
            if (fVar2 == f.f26158c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f26160b;
                if (fVar2.f26159a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f26160b = fVar4;
                    if (fVar3.f26159a == null) {
                        break;
                    }
                } else if (!f26163g.f(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = f26164h;
        }
        if (!f26163g.e(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean l(Throwable th2) {
        th2.getClass();
        if (!f26163g.e(this, null, new b(th2))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String strI;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f26165b instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                strI = i();
            } catch (RuntimeException e3) {
                strI = "Exception thrown from implementation: " + e3.getClass();
            }
            if (strI != null && !strI.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strI);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        f fVar = f.f26158c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f26165b;
            if (obj2 != null) {
                return g(obj2);
            }
            f fVar2 = this.f26167d;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    hl.l lVar = f26163g;
                    lVar.n(fVar3, fVar2);
                    if (lVar.f(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f26165b;
                            } else {
                                j(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    fVar2 = this.f26167d;
                } while (fVar2 != fVar);
            }
            return g(this.f26165b);
        }
        throw new InterruptedException();
    }
}
