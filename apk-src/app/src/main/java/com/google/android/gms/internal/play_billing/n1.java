package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.q81;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.Objects;
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
public abstract class n1 extends i2 implements x1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f14248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q81 f14249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d3 f14250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f14251h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f14252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile f1 f14253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile m1 f14254d;

    static {
        boolean z5;
        d3 i1Var;
        Throwable th2;
        Throwable th3;
        try {
            z5 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z5 = false;
        }
        f14248e = z5;
        f14249f = new q81(1, n1.class);
        int i = 7;
        Throwable th4 = null;
        try {
            i1Var = new l1(i);
            th3 = null;
            th2 = null;
        } catch (Error | Exception e3) {
            try {
                th2 = e3;
                i1Var = new g1(AtomicReferenceFieldUpdater.newUpdater(m1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(m1.class, m1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n1.class, m1.class, "d"), AtomicReferenceFieldUpdater.newUpdater(n1.class, f1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "b"));
            } catch (Error | Exception e7) {
                th4 = e7;
                i1Var = new i1(i);
                th2 = e3;
            }
            th3 = th4;
        }
        f14250g = i1Var;
        if (th3 != null) {
            q81 q81Var = f14249f;
            Logger loggerA = q81Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            q81Var.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f14251h = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object f(com.google.android.gms.internal.play_billing.x1 r6) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.n1.f(com.google.android.gms.internal.play_billing.x1):java.lang.Object");
    }

    public static void h(n1 n1Var) {
        f1 f1Var;
        f1 f1Var2 = null;
        while (true) {
            for (m1 m1VarP = f14250g.p(n1Var); m1VarP != null; m1VarP = m1VarP.f14243b) {
                Thread thread = m1VarP.f14242a;
                if (thread != null) {
                    m1VarP.f14242a = null;
                    LockSupport.unpark(thread);
                }
            }
            n1Var.d();
            f1 f1Var3 = f1Var2;
            f1 f1VarE = f14250g.e(n1Var);
            f1 f1Var4 = f1Var3;
            while (f1VarE != null) {
                f1 f1Var5 = f1VarE.f14181c;
                f1VarE.f14181c = f1Var4;
                f1Var4 = f1VarE;
                f1VarE = f1Var5;
            }
            while (f1Var4 != null) {
                Runnable runnable = f1Var4.f14179a;
                f1Var = f1Var4.f14181c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof h1) {
                    h1 h1Var = (h1) runnable;
                    n1Var = h1Var.f14202b;
                    if (n1Var.f14252b == h1Var) {
                        if (f14250g.E(n1Var, h1Var, f(h1Var.f14203c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = f1Var4.f14180b;
                    Objects.requireNonNull(executor);
                    i(runnable, executor);
                }
                f1Var4 = f1Var;
            }
            return;
            f1Var2 = f1Var;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e3) {
            f14249f.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", t.z.e("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e3);
        }
    }

    public static final Object k(Object obj) throws ExecutionException {
        if (obj instanceof c1) {
            Throwable th2 = ((c1) obj).f14150b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof e1) {
            throw new ExecutionException(((e1) obj).f14167a);
        }
        if (obj == f14251h) {
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
        f1 f1Var;
        f1 f1Var2 = f1.f14178d;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (f1Var = this.f14253c) != f1Var2) {
            f1 f1Var3 = new f1(runnable, executor);
            do {
                f1Var3.f14181c = f1Var;
                if (f14250g.A(this, f1Var, f1Var3)) {
                    return;
                } else {
                    f1Var = this.f14253c;
                }
            } while (f1Var != f1Var2);
        }
        i(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        c1 c1Var;
        Object obj = this.f14252b;
        if (!(obj instanceof h1) && !(obj == null)) {
            return false;
        }
        if (f14248e) {
            c1Var = new c1(new CancellationException("Future.cancel() was called."), z5);
        } else {
            c1Var = z5 ? c1.f14147c : c1.f14148d;
            Objects.requireNonNull(c1Var);
        }
        n1 n1Var = this;
        boolean z10 = false;
        while (true) {
            if (f14250g.E(n1Var, obj, c1Var)) {
                h(n1Var);
                if (!(obj instanceof h1)) {
                    break;
                }
                x1 x1Var = ((h1) obj).f14203c;
                if (!(x1Var instanceof j1)) {
                    x1Var.cancel(z5);
                    break;
                }
                n1Var = (n1) x1Var;
                obj = n1Var.f14252b;
                if (!(obj == null) && !(obj instanceof h1)) {
                    break;
                }
                z10 = true;
            } else {
                obj = n1Var.f14252b;
                if (!(obj instanceof h1)) {
                    return z10;
                }
            }
        }
        return true;
    }

    public final void e(Throwable th2) {
        if (f14250g.E(this, null, new e1(th2))) {
            h(this);
        }
    }

    public final void g(StringBuilder sb2) {
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
                } catch (ExecutionException e3) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e3.getCause());
                    sb2.append("]");
                    return;
                } catch (Exception e7) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e7.getClass());
                    sb2.append(" thrown from get()]");
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
        if (obj == null) {
            sb2.append("null");
        } else if (obj == this) {
            sb2.append("this future");
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        m1 m1Var = m1.f14241c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f14252b;
        if ((obj2 != null) && (!(obj2 instanceof h1))) {
            return k(obj2);
        }
        m1 m1Var2 = this.f14254d;
        if (m1Var2 != m1Var) {
            m1 m1Var3 = new m1();
            do {
                d3 d3Var = f14250g;
                d3Var.t(m1Var3, m1Var2);
                if (d3Var.G(this, m1Var2, m1Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(m1Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f14252b;
                    } while (!((obj != null) & (!(obj instanceof h1))));
                    return k(obj);
                }
                m1Var2 = this.f14254d;
            } while (m1Var2 != m1Var);
        }
        Object obj3 = this.f14252b;
        Objects.requireNonNull(obj3);
        return k(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14252b instanceof c1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f14252b != null) & (!(r0 instanceof h1));
    }

    public final void j(m1 m1Var) {
        m1Var.f14242a = null;
        while (true) {
            m1 m1Var2 = this.f14254d;
            if (m1Var2 != m1.f14241c) {
                m1 m1Var3 = null;
                while (m1Var2 != null) {
                    m1 m1Var4 = m1Var2.f14243b;
                    if (m1Var2.f14242a != null) {
                        m1Var3 = m1Var2;
                    } else if (m1Var3 != null) {
                        m1Var3.f14243b = m1Var4;
                        if (m1Var3.f14242a == null) {
                            break;
                        }
                    } else if (!f14250g.G(this, m1Var2, m1Var4)) {
                        break;
                    }
                    m1Var2 = m1Var4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.n1.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z5;
        long j11;
        m1 m1Var = m1.f14241c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f14252b;
            if ((obj != null) & (!(obj instanceof h1))) {
                return k(obj);
            }
            long j12 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                m1 m1Var2 = this.f14254d;
                if (m1Var2 != m1Var) {
                    m1 m1Var3 = new m1();
                    z5 = true;
                    while (true) {
                        d3 d3Var = f14250g;
                        d3Var.t(m1Var3, m1Var2);
                        if (d3Var.G(this, m1Var2, m1Var3)) {
                            j11 = j12;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f14252b;
                                    if ((obj2 != null) & (!(obj2 instanceof h1))) {
                                        return k(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    j(m1Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            j(m1Var3);
                        } else {
                            long j13 = j12;
                            m1Var2 = this.f14254d;
                            if (m1Var2 == m1Var) {
                                break;
                            }
                            j12 = j13;
                        }
                    }
                }
                Object obj3 = this.f14252b;
                Objects.requireNonNull(obj3);
                return k(obj3);
            }
            z5 = true;
            j11 = 0;
            while (nanos > j11) {
                Object obj4 = this.f14252b;
                if ((obj4 != null ? z5 : false) & (!(obj4 instanceof h1))) {
                    return k(obj4);
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
            if (nanos + 1000 < j11) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j14 = -nanos;
                long jConvert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
                long nanos2 = j14 - timeUnit.toNanos(jConvert);
                if (jConvert != j11 && nanos2 <= 1000) {
                    z5 = false;
                }
                if (jConvert > j11) {
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

    public void d() {
    }
}
