package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h71 extends p71 {
    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(ed.d dVar) {
        Object obj;
        Throwable thB;
        if (dVar instanceof f71) {
            Object a71Var = ((h71) dVar).f8952b;
            if (a71Var instanceof a71) {
                a71 a71Var2 = (a71) a71Var;
                if (a71Var2.f2797a) {
                    Throwable th2 = a71Var2.f2798b;
                    a71Var = th2 != null ? new a71(th2, false) : a71.f2796d;
                }
            }
            Objects.requireNonNull(a71Var);
            return a71Var;
        }
        if ((dVar instanceof d91) && (thB = ((d91) dVar).b()) != null) {
            return new d71(thB);
        }
        boolean zIsCancelled = dVar.isCancelled();
        boolean z5 = true;
        if ((!p71.f8950g) && zIsCancelled) {
            a71 a71Var3 = a71.f2796d;
            Objects.requireNonNull(a71Var3);
            return a71Var3;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = dVar.get();
                        break;
                    } catch (Error | Exception e3) {
                        e = e3;
                        return new d71(e);
                    } catch (CancellationException e7) {
                        return !zIsCancelled ? new d71(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(dVar)), e7)) : new a71(e7, false);
                    } catch (ExecutionException e10) {
                        return zIsCancelled ? new a71(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(dVar)), e10), false) : new d71(e10.getCause());
                    }
                } catch (InterruptedException unused) {
                    z10 = z5;
                } catch (Throwable th3) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            } catch (Error e11) {
                e = e11;
                return new d71(e);
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? p71.f8948e : obj;
        }
        String strValueOf = String.valueOf(dVar);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 84);
        sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb2.append(strValueOf);
        return new a71(new IllegalArgumentException(sb2.toString()), false);
    }

    public static Object j(Object obj) throws ExecutionException {
        if (obj instanceof a71) {
            Throwable th2 = ((a71) obj).f2798b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof d71) {
            throw new ExecutionException(((d71) obj).f4479a);
        }
        if (obj == p71.f8948e) {
            return null;
        }
        return obj;
    }

    public static boolean k(Object obj) {
        return !(obj instanceof b71);
    }

    public static void p(h71 h71Var, boolean z5) {
        e71 e71Var = null;
        while (true) {
            for (o71 o71VarX = p71.f8951h.X(h71Var); o71VarX != null; o71VarX = o71VarX.f8629b) {
                Thread thread = o71VarX.f8628a;
                if (thread != null) {
                    o71VarX.f8628a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z5) {
                h71Var.l();
            }
            h71Var.g();
            e71 e71Var2 = e71Var;
            e71 e71VarD0 = p71.f8951h.d0(h71Var);
            e71 e71Var3 = e71Var2;
            while (e71VarD0 != null) {
                e71 e71Var4 = e71VarD0.f4870c;
                e71VarD0.f4870c = e71Var3;
                e71Var3 = e71VarD0;
                e71VarD0 = e71Var4;
            }
            while (e71Var3 != null) {
                Runnable runnable = e71Var3.f4868a;
                e71Var = e71Var3.f4870c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof b71) {
                    b71 b71Var = (b71) runnable;
                    h71Var = b71Var.f3661b;
                    if (h71Var.f8952b == b71Var) {
                        if (p71.f8951h.h0(h71Var, b71Var, i(b71Var.f3662c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = e71Var3.f4869b;
                    Objects.requireNonNull(executor);
                    r(runnable, executor);
                }
                e71Var3 = e71Var;
            }
            return;
            z5 = false;
        }
    }

    public static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e3) {
            Logger loggerA = p71.f8949f.a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", om1.n(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e3);
        }
    }

    @Override // ed.d
    public void a(Runnable runnable, Executor executor) {
        e71 e71Var;
        e71 e71Var2 = e71.f4867d;
        ix.m0(runnable, "Runnable was null.");
        ix.m0(executor, "Executor was null.");
        if (!isDone() && (e71Var = this.f8953c) != e71Var2) {
            e71 e71Var3 = new e71(runnable, executor);
            do {
                e71Var3.f4870c = e71Var;
                if (p71.f8951h.V(this, e71Var, e71Var3)) {
                    return;
                } else {
                    e71Var = this.f8953c;
                }
            } while (e71Var != e71Var2);
        }
        r(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.d91
    public final Throwable b() {
        if (!(this instanceof f71)) {
            return null;
        }
        Object obj = this.f8952b;
        if (obj instanceof d71) {
            return ((d71) obj).f4479a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f8952b
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.b71
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L61
            boolean r1 = com.google.android.gms.internal.ads.p71.f8950g
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.a71 r1 = new com.google.android.gms.internal.ads.a71
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r4, r8)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.a71 r1 = com.google.android.gms.internal.ads.a71.f2795c
            goto L26
        L24:
            com.google.android.gms.internal.ads.a71 r1 = com.google.android.gms.internal.ads.a71.f2796d
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.ix r6 = com.google.android.gms.internal.ads.p71.f8951h
            boolean r6 = r6.h0(r4, r0, r1)
            if (r6 == 0) goto L58
            p(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.b71
            if (r4 == 0) goto L57
            com.google.android.gms.internal.ads.b71 r0 = (com.google.android.gms.internal.ads.b71) r0
            ed.d r0 = r0.f3662c
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.f71
            if (r4 == 0) goto L54
            r4 = r0
            com.google.android.gms.internal.ads.h71 r4 = (com.google.android.gms.internal.ads.h71) r4
            java.lang.Object r0 = r4.f8952b
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.b71
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r3
            goto L2b
        L53:
            return r3
        L54:
            r0.cancel(r8)
        L57:
            return r3
        L58:
            java.lang.Object r0 = r4.f8952b
            boolean r6 = k(r0)
            if (r6 == 0) goto L2b
            return r5
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h71.cancel(boolean):boolean");
    }

    public boolean e(Object obj) {
        if (obj == null) {
            obj = p71.f8948e;
        }
        if (!p71.f8951h.h0(this, null, obj)) {
            return false;
        }
        p(this, false);
        return true;
    }

    public boolean f(Throwable th2) {
        th2.getClass();
        if (!p71.f8951h.h0(this, null, new d71(th2))) {
            return false;
        }
        p(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        o71 o71Var = o71.f8627c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f8952b;
        if ((obj2 != null) && k(obj2)) {
            return j(obj2);
        }
        o71 o71Var2 = this.f8954d;
        if (o71Var2 != o71Var) {
            o71 o71Var3 = new o71();
            do {
                ix ixVar = p71.f8951h;
                ixVar.y(o71Var3, o71Var2);
                if (ixVar.P(this, o71Var2, o71Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            d(o71Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f8952b;
                    } while (!((obj != null) & k(obj)));
                    return j(obj);
                }
                o71Var2 = this.f8954d;
            } while (o71Var2 != o71Var);
        }
        Object obj3 = this.f8952b;
        Objects.requireNonNull(obj3);
        return j(obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + 21);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f8952b instanceof a71;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f8952b;
        return (obj != null) & k(obj);
    }

    public final boolean m() {
        Object obj = this.f8952b;
        return (obj instanceof a71) && ((a71) obj).f2797a;
    }

    public final void n(ed.d dVar) {
        d71 d71Var;
        dVar.getClass();
        Object obj = this.f8952b;
        if (obj == null) {
            if (dVar.isDone()) {
                if (p71.f8951h.h0(this, null, i(dVar))) {
                    p(this, false);
                    return;
                }
                return;
            }
            b71 b71Var = new b71(this, dVar);
            if (p71.f8951h.h0(this, null, b71Var)) {
                try {
                    dVar.a(b71Var, f81.f5272b);
                    return;
                } catch (Throwable th2) {
                    try {
                        d71Var = new d71(th2);
                    } catch (Error | Exception unused) {
                        d71Var = d71.f4478b;
                    }
                    p71.f8951h.h0(this, b71Var, d71Var);
                    return;
                }
            }
            obj = this.f8952b;
        }
        if (obj instanceof a71) {
            dVar.cancel(((a71) obj).f2797a);
        }
    }

    public final void o(Future future) {
        if ((future != null) && (this.f8952b instanceof a71)) {
            future.cancel(m());
        }
    }

    public final void q(StringBuilder sb2) {
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

    public String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            q(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f8952b;
            if (obj instanceof b71) {
                sb2.append(", setFuture=[");
                ed.d dVar = ((b71) obj).f3662c;
                try {
                    if (dVar == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(dVar);
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strConcat = h();
                    if (fs1.n(strConcat)) {
                        strConcat = null;
                    }
                } catch (Throwable th3) {
                    if ((th3 instanceof Error) && !(th3 instanceof StackOverflowError)) {
                        throw th3;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th3.getClass()));
                }
                if (strConcat != null) {
                    sb2.append(", info=[");
                    sb2.append(strConcat);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                q(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j11;
        boolean z5;
        o71 o71Var = o71.f8627c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f8952b;
            if ((obj != null) & k(obj)) {
                return j(obj);
            }
            long j12 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                o71 o71Var2 = this.f8954d;
                if (o71Var2 != o71Var) {
                    o71 o71Var3 = new o71();
                    z5 = true;
                    while (true) {
                        ix ixVar = p71.f8951h;
                        ixVar.y(o71Var3, o71Var2);
                        if (ixVar.P(this, o71Var2, o71Var3)) {
                            j11 = j12;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f8952b;
                                    if ((obj2 != null) & k(obj2)) {
                                        return j(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    d(o71Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            d(o71Var3);
                        } else {
                            long j13 = j12;
                            o71Var2 = this.f8954d;
                            if (o71Var2 == o71Var) {
                                break;
                            }
                            j12 = j13;
                        }
                    }
                }
                Object obj3 = this.f8952b;
                Objects.requireNonNull(obj3);
                return j(obj3);
            }
            j11 = 0;
            z5 = true;
            while (nanos > j11) {
                Object obj4 = this.f8952b;
                if ((obj4 != null ? z5 : false) & k(obj4)) {
                    return j(obj4);
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
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 8 + String.valueOf(lowerCase2).length());
            pe.a.s(sb2, "Waited ", j10, " ");
            sb2.append(lowerCase2);
            String string3 = sb2.toString();
            if (nanos + 1000 < j11) {
                String strConcat = string3.concat(" (plus ");
                long j14 = -nanos;
                long jConvert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
                long nanos2 = j14 - timeUnit.toNanos(jConvert);
                boolean z10 = (jConvert == j11 || nanos2 > 1000) ? z5 : false;
                if (jConvert > j11) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                    pe.a.s(sb3, strConcat, jConvert, " ");
                    sb3.append(lowerCase);
                    String string4 = sb3.toString();
                    if (z10) {
                        string4 = string4.concat(StringUtils.COMMA);
                    }
                    strConcat = string4.concat(" ");
                }
                if (z10) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                    sb4.append(strConcat);
                    sb4.append(nanos2);
                    sb4.append(" nanoseconds ");
                    strConcat = sb4.toString();
                }
                string3 = strConcat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(t.z.g(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
        }
        throw new InterruptedException();
    }

    public void g() {
    }

    public void l() {
    }
}
