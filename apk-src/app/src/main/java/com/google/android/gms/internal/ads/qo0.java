package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qo0 extends q9.k0 implements s9.l, uh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n10 f9562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f9563c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final no0 f9566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mo0 f9567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u9.a f9568h;
    public final sd0 i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s30 f9570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t30 f9571l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AtomicBoolean f9564d = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f9569j = -1;

    public qo0(n10 n10Var, Context context, String str, no0 no0Var, mo0 mo0Var, u9.a aVar, sd0 sd0Var) {
        this.f9562b = n10Var;
        this.f9563c = context;
        this.f9565e = str;
        this.f9566f = no0Var;
        this.f9567g = mo0Var;
        this.f9568h = aVar;
        this.i = sd0Var;
        mo0Var.f7961g.set(this);
    }

    @Override // q9.l0
    public final synchronized String A() {
        return this.f9565e;
    }

    @Override // q9.l0
    public final synchronized q9.y1 B() {
        return null;
    }

    @Override // q9.l0
    public final synchronized q9.b2 C() {
        return null;
    }

    @Override // q9.l0
    public final void C1(q9.j3 j3Var) {
        this.f9566f.i.i = j3Var;
    }

    @Override // s9.l
    public final void E0(int i) {
        if (i == 0) {
            throw null;
        }
        int i10 = i - 1;
        if (i10 == 0) {
            l4(2);
            return;
        }
        if (i10 == 1) {
            l4(4);
        } else if (i10 != 2) {
            l4(6);
        } else {
            l4(3);
        }
    }

    @Override // q9.l0
    public final synchronized void I3(q9.y0 y0Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    @Override // q9.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean J() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.no0 r0 = r1.f9566f     // Catch: java.lang.Throwable -> L12
            ed.d r0 = r0.f8397j     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lf
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qo0.J():boolean");
    }

    @Override // q9.l0
    public final void J1(di diVar) {
        this.f9567g.f7957c.set(diVar);
    }

    @Override // q9.l0
    public final synchronized boolean P() {
        return false;
    }

    @Override // q9.l0
    public final synchronized void S2(boolean z5) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // q9.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean X(q9.d3 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.c()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.ya r0 = com.google.android.gms.internal.ads.zl.f13028d     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.r()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.wk r0 = com.google.android.gms.internal.ads.al.f3216tc     // Catch: java.lang.Throwable -> L2d
            q9.s r2 = q9.s.f31967e     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.yk r2 = r2.f31970c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2f
        L2b:
            r0 = r1
            goto L2f
        L2d:
            r6 = move-exception
            goto L95
        L2f:
            u9.a r2 = r5.f9568h     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.f34367d     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.wk r3 = com.google.android.gms.internal.ads.al.f3231uc     // Catch: java.lang.Throwable -> L2d
            q9.s r4 = q9.s.f31967e     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.yk r4 = r4.f31970c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L47
            if (r0 != 0) goto L4c
        L47:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            pa.c0.e(r0)     // Catch: java.lang.Throwable -> L2d
        L4c:
            p9.k r0 = p9.k.C     // Catch: java.lang.Throwable -> L2d
            t9.g0 r0 = r0.f31297c     // Catch: java.lang.Throwable -> L2d
            android.content.Context r0 = r5.f9563c     // Catch: java.lang.Throwable -> L2d
            boolean r0 = t9.g0.i(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6f
            q9.o0 r0 = r6.f31818t     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L5d
            goto L6f
        L5d:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            u9.i.e(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.mo0 r6 = r5.f9567g     // Catch: java.lang.Throwable -> L2d
            r0 = 4
            r2 = 0
            q9.x1 r0 = com.google.android.gms.internal.ads.vv.C(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.K(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r1
        L6f:
            boolean r0 = r5.J()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L77
            monitor-exit(r5)
            return r1
        L77:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r5.f9564d = r0     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.oo0 r0 = new com.google.android.gms.internal.ads.oo0     // Catch: java.lang.Throwable -> L2d
            r1 = 3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.no0 r1 = r5.f9566f     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.f9565e     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.gk0 r3 = new com.google.android.gms.internal.ads.gk0     // Catch: java.lang.Throwable -> L2d
            r4 = 29
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r1.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L95:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qo0.X(q9.d3):boolean");
    }

    @Override // q9.l0
    public final synchronized void a2(q9.b3 b3Var) {
    }

    @Override // q9.l0
    public final q9.y b0() {
        return null;
    }

    @Override // q9.l0
    public final synchronized void c() {
        pa.c0.e("pause must be called on the main UI thread.");
    }

    @Override // s9.l
    public final synchronized void d3() {
        t30 t30Var = this.f9571l;
        if (t30Var != null) {
            p9.k.C.f31304k.getClass();
            t30Var.e(1, SystemClock.elapsedRealtime() - this.f9569j);
        }
    }

    @Override // q9.l0
    public final synchronized void e() {
    }

    @Override // q9.l0
    public final boolean g() {
        return false;
    }

    @Override // q9.l0
    public final long g0() {
        return 0L;
    }

    @Override // q9.l0
    public final synchronized void h() {
        pa.c0.e("destroy must be called on the main UI thread.");
        t30 t30Var = this.f9571l;
        if (t30Var != null) {
            t30Var.d();
        }
    }

    @Override // q9.l0
    public final xa.a j() {
        return null;
    }

    @Override // q9.l0
    public final synchronized void j4(gl glVar) {
    }

    @Override // q9.l0
    public final synchronized void k() {
        pa.c0.e("resume must be called on the main UI thread.");
    }

    public final synchronized void l4(int i) {
        try {
            if (this.f9564d.compareAndSet(false, true)) {
                this.f9567g.g();
                s30 s30Var = this.f9570k;
                if (s30Var != null) {
                    p9.k.C.f31301g.x(s30Var);
                }
                if (this.f9571l != null) {
                    long jElapsedRealtime = -1;
                    if (this.f9569j != -1) {
                        p9.k.C.f31304k.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9569j;
                    }
                    this.f9571l.e(i, jElapsedRealtime);
                }
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // s9.l
    public final synchronized void m() {
        if (this.f9571l != null) {
            p9.k kVar = p9.k.C;
            kVar.f31304k.getClass();
            this.f9569j = SystemClock.elapsedRealtime();
            int i = this.f9571l.f10475m;
            if (i > 0) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f9562b.f8108d.j();
                ua.a aVar = kVar.f31304k;
                s30 s30Var = new s30(scheduledExecutorService, aVar);
                this.f9570k = s30Var;
                po0 po0Var = new po0(this, 0);
                synchronized (s30Var) {
                    s30Var.f10164g = po0Var;
                    aVar.getClass();
                    long j10 = i;
                    s30Var.f10162e = SystemClock.elapsedRealtime() + j10;
                    s30Var.f10161d = scheduledExecutorService.schedule(po0Var, j10, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // q9.l0
    public final Bundle n() {
        return new Bundle();
    }

    @Override // q9.l0
    public final synchronized void p() {
    }

    @Override // q9.l0
    public final synchronized q9.g3 q() {
        return null;
    }

    @Override // q9.l0
    public final q9.v0 u() {
        return null;
    }

    @Override // q9.l0
    public final synchronized String v() {
        return null;
    }

    @Override // q9.l0
    public final synchronized String x() {
        return null;
    }

    @Override // q9.l0
    public final synchronized void y2(q9.g3 g3Var) {
        pa.c0.e("setAdSize must be called on the main UI thread.");
    }

    @Override // s9.l
    public final void A2() {
    }

    @Override // s9.l
    public final void D0() {
    }

    @Override // q9.l0
    public final void F1() {
    }

    @Override // s9.l
    public final void L1() {
    }

    @Override // q9.l0
    public final void N() {
    }

    @Override // s9.l
    public final void T0() {
    }

    @Override // s9.l
    public final void X1() {
    }

    @Override // q9.l0
    public final void i0() {
    }

    @Override // s9.l
    public final void i2() {
    }

    @Override // q9.l0
    public final void o() {
    }

    @Override // s9.l
    public final void p1() {
    }

    @Override // q9.l0
    public final void s() {
    }

    @Override // s9.l
    public final void w1() {
    }

    @Override // q9.l0
    public final void B2(q9.s1 s1Var) {
    }

    @Override // q9.l0
    public final void C0(xa.a aVar) {
    }

    @Override // q9.l0
    public final void V3(q9.v vVar) {
    }

    @Override // q9.l0
    public final void b3(String str) {
    }

    @Override // q9.l0
    public final void e1(long j10) {
    }

    @Override // q9.l0
    public final void f1(boolean z5) {
    }

    @Override // q9.l0
    public final void j3(q9.y yVar) {
    }

    @Override // q9.l0
    public final void k2(uu uuVar) {
    }

    @Override // q9.l0
    public final void o3(q9.a1 a1Var) {
    }

    @Override // q9.l0
    public final void v1(q9.v0 v0Var) {
    }

    @Override // q9.l0
    public final void R3(q9.d3 d3Var, q9.b0 b0Var) {
    }
}
