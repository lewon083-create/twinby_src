package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u71 extends x71 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q81 f10864p = new q81(0, u71.class);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t41 f10865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f10866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f10867o;

    public u71(t41 t41Var, boolean z5, boolean z10) {
        int size = t41Var.size();
        this.i = null;
        this.f12065j = size;
        this.f10865m = t41Var;
        this.f10866n = z5;
        this.f10867o = z10;
    }

    @Override // com.google.android.gms.internal.ads.h71
    public final void g() {
        t41 t41Var = this.f10865m;
        s(1);
        if ((t41Var != null) && (this.f8952b instanceof a71)) {
            boolean zM = m();
            d61 d61VarA = t41Var.a();
            while (d61VarA.hasNext()) {
                ((Future) d61VarA.next()).cancel(zM);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h71
    public final String h() {
        t41 t41Var = this.f10865m;
        return t41Var != null ? "futures=".concat(t41Var.toString()) : super.h();
    }

    public abstract void s(int i);

    public final void t(int i, ed.d dVar) {
        try {
            if (dVar.isCancelled()) {
                this.f10865m = null;
                cancel(false);
            } else {
                try {
                    x(i, ix.d(dVar));
                } catch (ExecutionException e3) {
                    u(e3.getCause());
                } catch (Throwable th2) {
                    u(th2);
                }
            }
        } finally {
            v(null);
        }
    }

    public final void u(Throwable th2) {
        th2.getClass();
        if (this.f10866n && !f(th2)) {
            Set set = this.i;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f8952b instanceof a71)) {
                    Throwable thB = b();
                    Objects.requireNonNull(thB);
                    while (thB != null && setNewSetFromMap.add(thB)) {
                        thB = thB.getCause();
                    }
                }
                x71.f12063k.u(this, setNewSetFromMap);
                Set set2 = this.i;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            f10864p.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
            return;
        }
        boolean z5 = th2 instanceof Error;
        if (z5) {
            f10864p.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z5 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
        }
    }

    public final void v(t41 t41Var) {
        int iA = x71.f12063k.A(this);
        int i = 0;
        ix.l0("Less than 0 remaining futures", iA >= 0);
        if (iA == 0) {
            if (t41Var != null) {
                d61 d61VarA = t41Var.a();
                while (d61VarA.hasNext()) {
                    Future future = (Future) d61VarA.next();
                    if (!future.isCancelled()) {
                        try {
                            x(i, ix.d(future));
                        } catch (ExecutionException e3) {
                            u(e3.getCause());
                        } catch (Throwable th2) {
                            u(th2);
                        }
                    }
                    i++;
                }
            }
            this.i = null;
            y();
            s(2);
        }
    }

    public final void w() {
        Objects.requireNonNull(this.f10865m);
        if (this.f10865m.isEmpty()) {
            y();
            return;
        }
        boolean z5 = this.f10866n;
        f81 f81Var = f81.f5272b;
        if (z5) {
            d61 d61VarA = this.f10865m.a();
            int i = 0;
            while (d61VarA.hasNext()) {
                ed.d dVar = (ed.d) d61VarA.next();
                int i10 = i + 1;
                if (dVar.isDone()) {
                    t(i, dVar);
                } else {
                    dVar.a(new af0(this, i, dVar, 1), f81Var);
                }
                i = i10;
            }
            return;
        }
        t41 t41Var = this.f10865m;
        t41 t41Var2 = true != this.f10867o ? null : t41Var;
        th0 th0Var = new th0(17, this, t41Var2);
        d61 d61VarA2 = t41Var.a();
        while (d61VarA2.hasNext()) {
            ed.d dVar2 = (ed.d) d61VarA2.next();
            if (dVar2.isDone()) {
                v(t41Var2);
            } else {
                dVar2.a(th0Var, f81Var);
            }
        }
    }

    public abstract void x(int i, Object obj);

    public abstract void y();
}
