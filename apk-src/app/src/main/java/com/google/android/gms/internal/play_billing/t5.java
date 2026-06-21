package com.google.android.gms.internal.play_billing;

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
public class t5 implements x1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f14316e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f14317f = Logger.getLogger(t5.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d3 f14318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f14319h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f14320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile h4 f14321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile s5 f14322d;

    static {
        d3 r5Var;
        try {
            r5Var = new f5(AtomicReferenceFieldUpdater.newUpdater(s5.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(s5.class, s5.class, "b"), AtomicReferenceFieldUpdater.newUpdater(t5.class, s5.class, "d"), AtomicReferenceFieldUpdater.newUpdater(t5.class, h4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(t5.class, Object.class, "b"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            r5Var = new r5(9);
        }
        Throwable th3 = th;
        f14318g = r5Var;
        if (th3 != null) {
            f14317f.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f14319h = new Object();
    }

    public static void d(t5 t5Var) {
        s5 s5Var;
        h4 h4Var;
        h4 h4Var2;
        h4 h4Var3;
        do {
            s5Var = t5Var.f14322d;
        } while (!f14318g.B(t5Var, s5Var, s5.f14300c));
        while (true) {
            h4Var = null;
            if (s5Var == null) {
                break;
            }
            Thread thread = s5Var.f14301a;
            if (thread != null) {
                s5Var.f14301a = null;
                LockSupport.unpark(thread);
            }
            s5Var = s5Var.f14302b;
        }
        do {
            h4Var2 = t5Var.f14321c;
        } while (!f14318g.u(t5Var, h4Var2, h4.f14208d));
        while (true) {
            h4Var3 = h4Var;
            h4Var = h4Var2;
            if (h4Var == null) {
                break;
            }
            h4Var2 = h4Var.f14211c;
            h4Var.f14211c = h4Var3;
        }
        while (h4Var3 != null) {
            Runnable runnable = h4Var3.f14209a;
            h4 h4Var4 = h4Var3.f14211c;
            f(runnable, h4Var3.f14210b);
            h4Var3 = h4Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f14317f.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", t.z.e("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e3);
        }
    }

    public static final Object h(Object obj) throws ExecutionException {
        if (obj instanceof t2) {
            Throwable th2 = ((t2) obj).f14313a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof q3) {
            throw new ExecutionException(((q3) obj).f14287a);
        }
        if (obj == f14319h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        h4 h4Var = this.f14321c;
        h4 h4Var2 = h4.f14208d;
        if (h4Var != h4Var2) {
            h4 h4Var3 = new h4(runnable, executor);
            do {
                h4Var3.f14211c = h4Var;
                if (f14318g.u(this, h4Var, h4Var3)) {
                    return;
                } else {
                    h4Var = this.f14321c;
                }
            } while (h4Var != h4Var2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f14320b;
        if (obj != null) {
            return false;
        }
        if (!f14318g.w(this, obj, f14316e ? new t2(new CancellationException("Future.cancel() was called.")) : z5 ? t2.f14311b : t2.f14312c)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb2) {
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

    public final void g(s5 s5Var) {
        s5Var.f14301a = null;
        while (true) {
            s5 s5Var2 = this.f14322d;
            if (s5Var2 != s5.f14300c) {
                s5 s5Var3 = null;
                while (s5Var2 != null) {
                    s5 s5Var4 = s5Var2.f14302b;
                    if (s5Var2.f14301a != null) {
                        s5Var3 = s5Var2;
                    } else if (s5Var3 != null) {
                        s5Var3.f14302b = s5Var4;
                        if (s5Var3.f14301a == null) {
                            break;
                        }
                    } else if (!f14318g.B(this, s5Var2, s5Var4)) {
                        break;
                    }
                    s5Var2 = s5Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        s5 s5Var = s5.f14300c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f14320b;
        if (obj2 != null) {
            return h(obj2);
        }
        s5 s5Var2 = this.f14322d;
        if (s5Var2 != s5Var) {
            s5 s5Var3 = new s5();
            do {
                d3 d3Var = f14318g;
                d3Var.j(s5Var3, s5Var2);
                if (d3Var.B(this, s5Var2, s5Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(s5Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f14320b;
                    } while (obj == null);
                    return h(obj);
                }
                s5Var2 = this.f14322d;
            } while (s5Var2 != s5Var);
        }
        return h(this.f14320b);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14320b instanceof t2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14320b != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f14320b instanceof t2) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            e(sb2);
        } else {
            try {
                strConcat = b();
            } catch (RuntimeException e3) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e3.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strConcat);
                sb2.append("]");
            } else if (isDone()) {
                e(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        s5 s5Var = s5.f14300c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f14320b;
            if (obj != null) {
                return h(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                s5 s5Var2 = this.f14322d;
                if (s5Var2 != s5Var) {
                    s5 s5Var3 = new s5();
                    do {
                        d3 d3Var = f14318g;
                        d3Var.j(s5Var3, s5Var2);
                        if (d3Var.B(this, s5Var2, s5Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f14320b;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    g(s5Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(s5Var3);
                        } else {
                            s5Var2 = this.f14322d;
                        }
                    } while (s5Var2 != s5Var);
                }
                return h(this.f14320b);
            }
            while (nanos > 0) {
                Object obj3 = this.f14320b;
                if (obj3 != null) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j11 = -nanos;
                long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(jConvert);
                boolean z5 = true;
                if (jConvert != 0 && nanos2 <= 1000) {
                    z5 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z5) {
                        strConcat3 = strConcat3.concat(StringUtils.COMMA);
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z5) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(gf.a.k(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }
}
