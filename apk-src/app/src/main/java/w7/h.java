package w7;

import a0.u;
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
public abstract class h implements ed.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f35192e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f35193f = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wa.a f35194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f35195h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f35196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f35197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile g f35198d;

    static {
        wa.a fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "d"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            fVar = new f();
        }
        f35194g = fVar;
        if (th != null) {
            f35193f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f35195h = new Object();
    }

    public static void d(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f35198d;
            if (f35194g.e(hVar, gVar, g.f35189c)) {
                while (gVar != null) {
                    Thread thread = gVar.f35190a;
                    if (thread != null) {
                        gVar.f35190a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f35191b;
                }
                do {
                    cVar = hVar.f35197c;
                } while (!f35194g.c(hVar, cVar, c.f35178d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f35181c;
                    cVar3.f35181c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f35181c;
                    Runnable runnable = cVar2.f35179a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f35187b;
                        if (hVar.f35196b == eVar) {
                            if (f35194g.d(hVar, eVar, g(eVar.f35188c))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        e(runnable, cVar2.f35180b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f35193f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f35175b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f35177a);
        }
        if (obj == f35195h) {
            return null;
        }
        return obj;
    }

    public static Object g(ed.d dVar) {
        Object obj;
        if (dVar instanceof h) {
            Object obj2 = ((h) dVar).f35196b;
            if (!(obj2 instanceof a)) {
                return obj2;
            }
            a aVar = (a) obj2;
            return aVar.f35174a ? aVar.f35175b != null ? new a(aVar.f35175b, false) : a.f35173d : obj2;
        }
        boolean zIsCancelled = dVar.isCancelled();
        boolean z5 = true;
        if ((!f35192e) && zIsCancelled) {
            return a.f35173d;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = dVar.get();
                    break;
                } catch (CancellationException e3) {
                    if (zIsCancelled) {
                        return new a(e3, false);
                    }
                    return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e3));
                } catch (ExecutionException e7) {
                    return new b(e7.getCause());
                } catch (Throwable th2) {
                    return new b(th2);
                }
            } catch (InterruptedException unused) {
                z10 = z5;
            } catch (Throwable th3) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f35195h : obj;
    }

    @Override // ed.d
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f35197c;
        c cVar2 = c.f35178d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f35181c = cVar;
                if (f35194g.c(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f35197c;
                }
            } while (cVar != cVar2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb2.append("CANCELLED");
                    return;
                } catch (RuntimeException e3) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e3.getClass());
                    sb2.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e7) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e7.getCause());
                    sb2.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f35196b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof w7.e
            r3 = r3 | r4
            if (r3 == 0) goto L5b
            boolean r3 = w7.h.f35192e
            if (r3 == 0) goto L1f
            w7.a r3 = new w7.a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r4, r8)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            w7.a r3 = w7.a.f35172c
            goto L26
        L24:
            w7.a r3 = w7.a.f35173d
        L26:
            r4 = r7
            r5 = r2
        L28:
            wa.a r6 = w7.h.f35194g
            boolean r6 = r6.d(r4, r0, r3)
            if (r6 == 0) goto L54
            d(r4)
            boolean r4 = r0 instanceof w7.e
            if (r4 == 0) goto L53
            w7.e r0 = (w7.e) r0
            ed.d r0 = r0.f35188c
            boolean r4 = r0 instanceof w7.h
            if (r4 == 0) goto L50
            r4 = r0
            w7.h r4 = (w7.h) r4
            java.lang.Object r0 = r4.f35196b
            if (r0 != 0) goto L48
            r5 = r1
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof w7.e
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r1
            goto L28
        L50:
            r0.cancel(r8)
        L53:
            return r1
        L54:
            java.lang.Object r0 = r4.f35196b
            boolean r6 = r0 instanceof w7.e
            if (r6 != 0) goto L28
            return r5
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.h.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z5;
        g gVar = g.f35189c;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f35196b;
        if ((obj != null) && (!(obj instanceof e))) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f35198d;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                z5 = true;
                do {
                    wa.a aVar = f35194g;
                    aVar.u(gVar3, gVar2);
                    if (aVar.e(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f35196b;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(gVar3);
                    } else {
                        gVar2 = this.f35198d;
                    }
                } while (gVar2 != gVar);
            }
            return f(this.f35196b);
        }
        z5 = true;
        while (nanos > 0) {
            Object obj3 = this.f35196b;
            if ((obj3 != null ? z5 : false) && (!(obj3 instanceof e))) {
                return f(obj3);
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
            boolean z10 = (jConvert == 0 || nanos2 > 1000) ? z5 : false;
            if (jConvert > 0) {
                String strX2 = strX + jConvert + " " + lowerCase;
                if (z10) {
                    strX2 = om1.x(strX2, StringUtils.COMMA);
                }
                strX = om1.x(strX2, " ");
            }
            if (z10) {
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
    public final String h() {
        Object obj = this.f35196b;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ed.d dVar = ((e) obj).f35188c;
            return u.o(sb2, dVar == this ? "this future" : String.valueOf(dVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(g gVar) {
        gVar.f35190a = null;
        while (true) {
            g gVar2 = this.f35198d;
            if (gVar2 == g.f35189c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f35191b;
                if (gVar2.f35190a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f35191b = gVar4;
                    if (gVar3.f35190a == null) {
                        break;
                    }
                } else if (!f35194g.e(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f35196b instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f35196b != null);
    }

    public final String toString() {
        String strH;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f35196b instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e3) {
                strH = "Exception thrown from implementation: " + e3.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strH);
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

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        g gVar = g.f35189c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f35196b;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return f(obj2);
            }
            g gVar2 = this.f35198d;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    wa.a aVar = f35194g;
                    aVar.u(gVar3, gVar2);
                    if (aVar.e(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f35196b;
                            } else {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return f(obj);
                    }
                    gVar2 = this.f35198d;
                } while (gVar2 != gVar);
            }
            return f(this.f35196b);
        }
        throw new InterruptedException();
    }
}
