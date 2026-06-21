package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4642a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledFuture f4644c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f4647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kx0 f4648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ua.a f4649h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f4643b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4645d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f4646e = new AtomicBoolean(false);

    public dt0(int i, ScheduledExecutorService scheduledExecutorService, kx0 kx0Var, ua.a aVar) {
        this.f4642a = i;
        this.f4647f = scheduledExecutorService;
        this.f4648g = kx0Var;
        this.f4649h = aVar;
    }

    public static String g(String str, k9.a aVar) {
        return str + StringUtils.PROCESS_POSTFIX_DELIMITER + aVar;
    }

    public final void a(ht0 ht0Var) {
        int i = 1;
        if (ht0Var.q() <= 0 && !ht0Var.f6252m.get()) {
            i = 0;
        }
        c(ht0Var, i);
    }

    public final synchronized void b(ht0 ht0Var) {
        try {
            if (h(ht0Var)) {
                return;
            }
            long jH = ht0Var.h();
            if (jH < 0) {
                jH = ((Long) q9.s.f31967e.f31970c.a(al.P)).longValue();
            }
            if (jH <= 0) {
                a(ht0Var);
                return;
            }
            if (ht0Var.q() > 0 || ht0Var.f6252m.get()) {
                m(ht0Var, 1);
            }
            this.f4643b.set(true);
            ScheduledFuture scheduledFuture = this.f4644c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f4644c = null;
            this.f4646e.set(true);
            this.f4644c = this.f4647f.schedule(new ct0(this, 4), jH, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(ht0 ht0Var, int i) {
        if (h(ht0Var)) {
            return;
        }
        if (i > 0) {
            m(ht0Var, i);
        }
        if (!n(ht0Var)) {
            j(0L);
        } else {
            j(((Long) q9.s.f31967e.f31970c.a(al.U)).longValue());
        }
    }

    public final void d(String str, k9.a aVar, ht0 ht0Var) {
        LinkedHashMap linkedHashMap = this.f4645d;
        String strG = g(str, aVar);
        synchronized (linkedHashMap) {
            try {
                if (!linkedHashMap.containsKey(strG)) {
                    linkedHashMap.put(strG, ht0Var);
                    n(ht0Var);
                    j(((Long) q9.s.f31967e.f31970c.a(al.U)).longValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(String str, k9.a aVar) {
        ht0 ht0Var;
        LinkedHashMap linkedHashMap = this.f4645d;
        String strG = g(str, aVar);
        synchronized (linkedHashMap) {
            ht0Var = (ht0) linkedHashMap.remove(strG);
        }
        if (ht0Var == null) {
            return;
        }
        int iQ = ht0Var.q();
        int i = iQ - 1;
        if (!ht0Var.f6252m.get()) {
            iQ = i;
        }
        int iMax = Math.max(iQ, 0);
        if (iMax > 0) {
            m(ht0Var, iMax);
        }
        if (ht0Var.q() > 0 || ht0Var.f6252m.get()) {
            j(0L);
        }
    }

    public final int f() {
        int iMax;
        LinkedHashMap linkedHashMap = this.f4645d;
        synchronized (linkedHashMap) {
            try {
                iMax = 0;
                for (ht0 ht0Var : linkedHashMap.values()) {
                    int iQ = ht0Var.q();
                    int i = iQ - 1;
                    if (!ht0Var.f6252m.get()) {
                        iQ = i;
                    }
                    iMax += Math.max(iQ, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iMax;
    }

    public final boolean h(ht0 ht0Var) {
        k9.a aVarP = ht0Var.p();
        if (aVarP == null) {
            return true;
        }
        LinkedHashMap linkedHashMap = this.f4645d;
        synchronized (linkedHashMap) {
            try {
                return !linkedHashMap.containsKey(g(ht0Var.f6251l, aVarP));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i() {
        LinkedHashMap linkedHashMap = this.f4645d;
        synchronized (linkedHashMap) {
            try {
                for (ht0 ht0Var : linkedHashMap.values()) {
                    if (ht0Var.q() == 0 && ht0Var.r()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void j(long j10) {
        if (this.f4646e.compareAndSet(false, true)) {
            if (j10 > 0) {
                this.f4644c = this.f4647f.schedule(new ct0(this, 1), j10, TimeUnit.MILLISECONDS);
            } else {
                this.f4647f.execute(new ct0(this, 0));
            }
        }
    }

    public final synchronized void k() {
        x41 x41VarV;
        try {
            if (this.f4643b.get()) {
                return;
            }
            ht0 ht0Var = null;
            this.f4644c = null;
            if (f() < this.f4642a || i()) {
                LinkedHashMap linkedHashMap = this.f4645d;
                synchronized (linkedHashMap) {
                    x41VarV = x41.v(linkedHashMap.values());
                }
                int size = x41VarV.size();
                double d10 = Double.MAX_VALUE;
                for (int i = 0; i < size; i++) {
                    ht0 ht0Var2 = (ht0) x41VarV.get(i);
                    if (ht0Var2.r()) {
                        double dQ = ((double) ht0Var2.q()) / ((double) ht0Var2.f6245e.f31984e);
                        if (dQ < d10) {
                            d10 = dQ;
                        }
                        if (dQ < d10) {
                            ht0Var = ht0Var2;
                        }
                    }
                }
                if (ht0Var != null) {
                    ht0Var.j();
                    if (ht0Var.q() > 0) {
                        kx0 kx0Var = this.f4648g;
                        this.f4649h.getClass();
                        kx0Var.Q("acmpa", System.currentTimeMillis(), ht0Var.f6251l, ht0Var.f6245e.f31981b, ht0Var.p(), ht0Var.f6245e.f31984e, ht0Var.q(), 0, f(), this.f4642a);
                    }
                }
                int iF = f();
                int i10 = this.f4642a;
                if (iF >= i10) {
                    l();
                }
                if (f() >= i10) {
                    if (i()) {
                    }
                }
                if (i()) {
                    this.f4647f.execute(new ct0(this, 3));
                    return;
                }
                this.f4644c = this.f4647f.schedule(new ct0(this, 2), ((Long) q9.s.f31967e.f31970c.a(al.V)).longValue(), TimeUnit.MILLISECONDS);
                return;
            }
            l();
            this.f4646e.set(false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void l() {
        int size;
        LinkedHashMap linkedHashMap = this.f4645d;
        synchronized (linkedHashMap) {
            size = linkedHashMap.size();
        }
        kx0 kx0Var = this.f4648g;
        ua.a aVar = this.f4649h;
        int i = this.f4642a;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zd1 zd1VarA = ((sd0) kx0Var.f7326c).a();
        zd1VarA.v("action", "acmlr");
        zd1VarA.v("pat", Long.toString(jCurrentTimeMillis));
        zd1VarA.v("mpl", Integer.toString(i));
        zd1VarA.v("pas", Integer.toString(size));
        zd1VarA.w();
    }

    public final void m(ht0 ht0Var, int i) {
        this.f4649h.getClass();
        this.f4648g.Q("acmpr", System.currentTimeMillis(), ht0Var.f6251l, ht0Var.f6245e.f31981b, ht0Var.p(), ht0Var.f6245e.f31984e, ht0Var.q(), i, f(), this.f4642a);
    }

    public final synchronized boolean n(ht0 ht0Var) {
        if (!this.f4643b.get() && ht0Var.q() == 0 && ht0Var.r()) {
            ht0Var.j();
            return true;
        }
        return false;
    }
}
