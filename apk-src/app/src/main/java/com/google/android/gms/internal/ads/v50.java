package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v50 implements s9.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eq0 f11240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xp0 f11241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ua.a f11242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sd0 f11243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f11244g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11239b = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ps0 f11245h = qs0.z();
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11246j = false;

    public v50(eq0 eq0Var, xp0 xp0Var, ua.a aVar, sd0 sd0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f11240c = eq0Var;
        this.f11241d = xp0Var;
        this.f11242e = aVar;
        this.f11243f = sd0Var;
        this.f11244g = scheduledExecutorService;
    }

    @Override // s9.l
    public final void D0() {
        b(4);
    }

    @Override // s9.l
    public final void L1() {
        b(8);
    }

    @Override // s9.l
    public final void T0() {
        b(9);
    }

    @Override // s9.l
    public final void X1() {
        b(5);
    }

    public final void a() {
        synchronized (this.f11239b) {
            try {
                sd0 sd0Var = this.f11243f;
                String str = ((zp0) this.f11240c.f5033b.f4348d).f13056b;
                String strEncodeToString = Base64.encodeToString(((qs0) this.f11245h.d()).b(), 1);
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f2977de)).booleanValue()) {
                    zd1 zd1VarA = sd0Var.a();
                    zd1VarA.v("action", "pclma");
                    zd1VarA.v("pclmd", strEncodeToString);
                    zd1VarA.v("gqi", str);
                    zd1VarA.y();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(int i) {
        synchronized (this.f11239b) {
            try {
                if (!this.f11246j && this.i) {
                    ps0 ps0Var = this.f11245h;
                    vr0 vr0VarZ = wr0.z();
                    vr0VarZ.b();
                    ((wr0) vr0VarZ.f9560c).B(i);
                    this.f11242e.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    vr0VarZ.b();
                    ((wr0) vr0VarZ.f9560c).A(jCurrentTimeMillis);
                    wr0 wr0Var = (wr0) vr0VarZ.d();
                    ps0Var.b();
                    ((qs0) ps0Var.f9560c).A(wr0Var);
                    if (i == 10) {
                        a();
                        this.f11246j = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // s9.l
    public final void d3() {
        b(7);
    }

    @Override // s9.l
    public final void i2() {
        b(6);
    }

    @Override // s9.l
    public final void p1() {
        b(10);
    }

    @Override // s9.l
    public final void w1() {
        b(3);
    }

    @Override // s9.l
    public final void A2() {
    }

    @Override // s9.l
    public final void m() {
    }

    @Override // s9.l
    public final void E0(int i) {
    }
}
