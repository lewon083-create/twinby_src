package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pk0 extends q9.k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q9.y f9081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iq0 f9082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x30 f9083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f9084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sd0 f9085g;

    public pk0(Context context, q9.y yVar, iq0 iq0Var, x30 x30Var, sd0 sd0Var) {
        this.f9080b = context;
        this.f9081c = yVar;
        this.f9082d = iq0Var;
        this.f9083e = x30Var;
        this.f9085g = sd0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = x30Var.f11995m;
        t9.g0 g0Var = p9.k.C.f31297c;
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(q().f31877d);
        frameLayout.setMinimumWidth(q().f31880g);
        this.f9084f = frameLayout;
    }

    @Override // q9.l0
    public final String A() {
        return this.f9082d.f6575g;
    }

    @Override // q9.l0
    public final q9.y1 B() {
        return this.f9083e.f9701f;
    }

    @Override // q9.l0
    public final void B2(q9.s1 s1Var) {
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.Mc)).booleanValue()) {
            u9.i.g("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        uk0 uk0Var = this.f9082d.f6571c;
        if (uk0Var != null) {
            try {
                if (!s1Var.c()) {
                    this.f9085g.b();
                }
            } catch (RemoteException e3) {
                u9.i.d("Error in making CSI ping for reporting paid event callback", e3);
            }
            uk0Var.f10956d.set(s1Var);
        }
    }

    @Override // q9.l0
    public final q9.b2 C() {
        x30 x30Var = this.f9083e;
        x30Var.getClass();
        try {
            return x30Var.f11998p.mo3h();
        } catch (kq0 unused) {
            return null;
        }
    }

    @Override // q9.l0
    public final void F1() {
        u9.i.g("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q9.l0
    public final void I3(q9.y0 y0Var) {
        u9.i.g("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q9.l0
    public final boolean J() {
        return false;
    }

    @Override // q9.l0
    public final boolean P() {
        x30 x30Var = this.f9083e;
        return x30Var != null && x30Var.f9697b.f12257q0;
    }

    @Override // q9.l0
    public final void S2(boolean z5) {
        u9.i.g("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q9.l0
    public final void V3(q9.v vVar) {
        u9.i.g("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q9.l0
    public final boolean X(q9.d3 d3Var) {
        u9.i.g("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // q9.l0
    public final void a2(q9.b3 b3Var) {
        u9.i.g("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q9.l0
    public final q9.y b0() {
        return this.f9081c;
    }

    @Override // q9.l0
    public final void c() {
        pa.c0.e("destroy must be called on the main UI thread.");
        u60 u60Var = this.f9083e.f9698c;
        u60Var.getClass();
        u60Var.A1(new ku0(null, 2));
    }

    @Override // q9.l0
    public final void e1(long j10) {
        r50 r50Var = this.f9083e.f9704j;
        if (r50Var != null) {
            r50Var.a(j10);
        }
    }

    @Override // q9.l0
    public final boolean g() {
        return false;
    }

    @Override // q9.l0
    public final long g0() {
        r50 r50Var;
        x30 x30Var = this.f9083e;
        if (x30Var == null || (r50Var = x30Var.f9704j) == null) {
            return 0L;
        }
        return r50Var.f9712a.get();
    }

    @Override // q9.l0
    public final void h() {
        pa.c0.e("destroy must be called on the main UI thread.");
        u60 u60Var = this.f9083e.f9698c;
        u60Var.getClass();
        u60Var.A1(new zk(null, 2));
    }

    @Override // q9.l0
    public final xa.a j() {
        return new xa.b(this.f9084f);
    }

    @Override // q9.l0
    public final void j3(q9.y yVar) {
        u9.i.g("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q9.l0
    public final void j4(gl glVar) {
        u9.i.g("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q9.l0
    public final void k() {
        pa.c0.e("destroy must be called on the main UI thread.");
        u60 u60Var = this.f9083e.f9698c;
        u60Var.getClass();
        u60Var.A1(new uk(null, false));
    }

    @Override // q9.l0
    public final Bundle n() {
        u9.i.g("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // q9.l0
    public final void p() {
        w80 w80Var = this.f9083e.f12000r;
        synchronized (w80Var) {
            w80Var.A1(l80.i);
        }
    }

    @Override // q9.l0
    public final q9.g3 q() {
        pa.c0.e("getAdSize must be called on the main UI thread.");
        return fs1.h(this.f9080b, Collections.singletonList(this.f9083e.c()));
    }

    @Override // q9.l0
    public final q9.v0 u() {
        return this.f9082d.f6582o;
    }

    @Override // q9.l0
    public final String v() {
        e60 e60Var = this.f9083e.f9701f;
        if (e60Var != null) {
            return e60Var.f4843b;
        }
        return null;
    }

    @Override // q9.l0
    public final void v1(q9.v0 v0Var) {
        uk0 uk0Var = this.f9082d.f6571c;
        if (uk0Var != null) {
            uk0Var.g(v0Var);
        }
    }

    @Override // q9.l0
    public final String x() {
        e60 e60Var = this.f9083e.f9701f;
        if (e60Var != null) {
            return e60Var.f4843b;
        }
        return null;
    }

    @Override // q9.l0
    public final void y2(q9.g3 g3Var) {
        FrameLayout frameLayout;
        sz szVar;
        pa.c0.e("setAdSize must be called on the main UI thread.");
        x30 x30Var = this.f9083e;
        if (x30Var == null || (frameLayout = this.f9084f) == null || (szVar = x30Var.f11996n) == null) {
            return;
        }
        szVar.W0(j0.a(g3Var));
        frameLayout.setMinimumHeight(g3Var.f31877d);
        frameLayout.setMinimumWidth(g3Var.f31880g);
        x30Var.f12003u = g3Var;
    }

    @Override // q9.l0
    public final void N() {
    }

    @Override // q9.l0
    public final void e() {
    }

    @Override // q9.l0
    public final void i0() {
    }

    @Override // q9.l0
    public final void o() {
    }

    @Override // q9.l0
    public final void s() {
    }

    @Override // q9.l0
    public final void C0(xa.a aVar) {
    }

    @Override // q9.l0
    public final void C1(q9.j3 j3Var) {
    }

    @Override // q9.l0
    public final void J1(di diVar) {
    }

    @Override // q9.l0
    public final void b3(String str) {
    }

    @Override // q9.l0
    public final void f1(boolean z5) {
    }

    @Override // q9.l0
    public final void k2(uu uuVar) {
    }

    @Override // q9.l0
    public final void o3(q9.a1 a1Var) {
    }

    @Override // q9.l0
    public final void R3(q9.d3 d3Var, q9.b0 b0Var) {
    }
}
