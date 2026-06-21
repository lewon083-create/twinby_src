package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xk0 extends q9.k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q9.g3 f12176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kp0 f12178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u9.a f12180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uk0 f12181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final np0 f12182h;
    public final xe i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sd0 f12183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d90 f12184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12185l = ((Boolean) q9.s.f31967e.f31970c.a(al.f2934b1)).booleanValue();

    public xk0(Context context, q9.g3 g3Var, String str, kp0 kp0Var, uk0 uk0Var, np0 np0Var, u9.a aVar, xe xeVar, sd0 sd0Var) {
        this.f12176b = g3Var;
        this.f12179e = str;
        this.f12177c = context;
        this.f12178d = kp0Var;
        this.f12181g = uk0Var;
        this.f12182h = np0Var;
        this.f12180f = aVar;
        this.i = xeVar;
        this.f12183j = sd0Var;
    }

    @Override // q9.l0
    public final synchronized String A() {
        return this.f12179e;
    }

    @Override // q9.l0
    public final synchronized q9.y1 B() {
        d90 d90Var;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3271x7)).booleanValue() && (d90Var = this.f12184k) != null) {
            return d90Var.f9701f;
        }
        return null;
    }

    @Override // q9.l0
    public final void B2(q9.s1 s1Var) {
        pa.c0.e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!s1Var.c()) {
                this.f12183j.b();
            }
        } catch (RemoteException e3) {
            u9.i.d("Error in making CSI ping for reporting paid event callback", e3);
        }
        this.f12181g.f10956d.set(s1Var);
    }

    @Override // q9.l0
    public final q9.b2 C() {
        return null;
    }

    @Override // q9.l0
    public final synchronized void C0(xa.a aVar) {
        if (this.f12184k == null) {
            u9.i.h("Interstitial can not be shown before loaded.");
            this.f12181g.j(vv.C(9, null, null));
            return;
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3192s3)).booleanValue()) {
            this.i.f12136b.e(new Throwable().getStackTrace());
        }
        this.f12184k.c((Activity) xa.b.X1(aVar), this.f12185l);
    }

    @Override // q9.l0
    public final void F1() {
        pa.c0.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // q9.l0
    public final synchronized boolean J() {
        return this.f12178d.b();
    }

    @Override // q9.l0
    public final synchronized boolean P() {
        return false;
    }

    @Override // q9.l0
    public final void R3(q9.d3 d3Var, q9.b0 b0Var) {
        this.f12181g.f10957e.set(b0Var);
        X(d3Var);
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
            com.google.android.gms.internal.ads.ya r0 = com.google.android.gms.internal.ads.zl.i     // Catch: java.lang.Throwable -> L2d
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
            goto L96
        L2f:
            u9.a r2 = r5.f12180f     // Catch: java.lang.Throwable -> L2d
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
            android.content.Context r0 = r5.f12177c     // Catch: java.lang.Throwable -> L2d
            boolean r2 = t9.g0.i(r0)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            if (r2 == 0) goto L6f
            q9.o0 r2 = r6.f31818t     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L6f
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            u9.i.e(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.uk0 r6 = r5.f12181g     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L94
            r0 = 4
            q9.x1 r0 = com.google.android.gms.internal.ads.vv.C(r0, r3, r3)     // Catch: java.lang.Throwable -> L2d
            r6.K(r0)     // Catch: java.lang.Throwable -> L2d
            goto L94
        L6f:
            boolean r2 = r5.l4()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L94
            boolean r1 = r6.f31806g     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.gr.E(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r5.f12184k = r3     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.kp0 r0 = r5.f12178d     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r5.f12179e     // Catch: java.lang.Throwable -> L2d
            q9.g3 r2 = r5.f12176b     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.hp0 r3 = new com.google.android.gms.internal.ads.hp0     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.gk0 r2 = new com.google.android.gms.internal.ads.gk0     // Catch: java.lang.Throwable -> L2d
            r4 = 28
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r0.a(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L94:
            monitor-exit(r5)
            return r1
        L96:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xk0.X(q9.d3):boolean");
    }

    @Override // q9.l0
    public final q9.y b0() {
        return this.f12181g.b();
    }

    @Override // q9.l0
    public final synchronized void c() {
        pa.c0.e("pause must be called on the main UI thread.");
        d90 d90Var = this.f12184k;
        if (d90Var != null) {
            u60 u60Var = d90Var.f9698c;
            u60Var.getClass();
            u60Var.A1(new ku0(null, 2));
        }
    }

    @Override // q9.l0
    public final synchronized void e() {
        pa.c0.e("showInterstitial must be called on the main UI thread.");
        if (this.f12184k == null) {
            u9.i.h("Interstitial can not be shown before loaded.");
            this.f12181g.j(vv.C(9, null, null));
        } else {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3192s3)).booleanValue()) {
                this.i.f12136b.e(new Throwable().getStackTrace());
            }
            this.f12184k.c(null, this.f12185l);
        }
    }

    @Override // q9.l0
    public final synchronized void e1(long j10) {
        r50 r50Var;
        d90 d90Var = this.f12184k;
        if (d90Var == null || (r50Var = d90Var.f9704j) == null) {
            return;
        }
        r50Var.a(j10);
    }

    @Override // q9.l0
    public final synchronized void f1(boolean z5) {
        pa.c0.e("setImmersiveMode must be called on the main UI thread.");
        this.f12185l = z5;
    }

    @Override // q9.l0
    public final synchronized boolean g() {
        pa.c0.e("isLoaded must be called on the main UI thread.");
        return l4();
    }

    @Override // q9.l0
    public final synchronized long g0() {
        r50 r50Var;
        d90 d90Var = this.f12184k;
        if (d90Var == null || (r50Var = d90Var.f9704j) == null) {
            return 0L;
        }
        return r50Var.f9712a.get();
    }

    @Override // q9.l0
    public final synchronized void h() {
        pa.c0.e("destroy must be called on the main UI thread.");
        d90 d90Var = this.f12184k;
        if (d90Var != null) {
            u60 u60Var = d90Var.f9698c;
            u60Var.getClass();
            u60Var.A1(new zk(null, 2));
        }
    }

    @Override // q9.l0
    public final xa.a j() {
        return null;
    }

    @Override // q9.l0
    public final void j3(q9.y yVar) {
        pa.c0.e("setAdListener must be called on the main UI thread.");
        this.f12181g.f10954b.set(yVar);
    }

    @Override // q9.l0
    public final synchronized void j4(gl glVar) {
        pa.c0.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f12178d.f7282f = glVar;
    }

    @Override // q9.l0
    public final synchronized void k() {
        pa.c0.e("resume must be called on the main UI thread.");
        d90 d90Var = this.f12184k;
        if (d90Var != null) {
            u60 u60Var = d90Var.f9698c;
            u60Var.getClass();
            u60Var.A1(new uk(null, false));
        }
    }

    @Override // q9.l0
    public final void k2(uu uuVar) {
        this.f12182h.f8415f.set(uuVar);
    }

    public final synchronized boolean l4() {
        d90 d90Var = this.f12184k;
        if (d90Var != null) {
            if (!d90Var.f4524p.f2776c.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // q9.l0
    public final Bundle n() {
        pa.c0.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // q9.l0
    public final void o3(q9.a1 a1Var) {
        this.f12181g.f10958f.set(a1Var);
    }

    @Override // q9.l0
    public final q9.g3 q() {
        return null;
    }

    @Override // q9.l0
    public final q9.v0 u() {
        q9.v0 v0Var;
        uk0 uk0Var = this.f12181g;
        synchronized (uk0Var) {
            v0Var = (q9.v0) uk0Var.f10955c.get();
        }
        return v0Var;
    }

    @Override // q9.l0
    public final synchronized String v() {
        e60 e60Var;
        d90 d90Var = this.f12184k;
        if (d90Var == null || (e60Var = d90Var.f9701f) == null) {
            return null;
        }
        return e60Var.f4843b;
    }

    @Override // q9.l0
    public final void v1(q9.v0 v0Var) {
        pa.c0.e("setAppEventListener must be called on the main UI thread.");
        this.f12181g.g(v0Var);
    }

    @Override // q9.l0
    public final synchronized String x() {
        e60 e60Var;
        d90 d90Var = this.f12184k;
        if (d90Var == null || (e60Var = d90Var.f9701f) == null) {
            return null;
        }
        return e60Var.f4843b;
    }

    @Override // q9.l0
    public final void N() {
    }

    @Override // q9.l0
    public final void i0() {
    }

    @Override // q9.l0
    public final void o() {
    }

    @Override // q9.l0
    public final void p() {
    }

    @Override // q9.l0
    public final void s() {
    }

    @Override // q9.l0
    public final void C1(q9.j3 j3Var) {
    }

    @Override // q9.l0
    public final void I3(q9.y0 y0Var) {
    }

    @Override // q9.l0
    public final void J1(di diVar) {
    }

    @Override // q9.l0
    public final void S2(boolean z5) {
    }

    @Override // q9.l0
    public final void V3(q9.v vVar) {
    }

    @Override // q9.l0
    public final void a2(q9.b3 b3Var) {
    }

    @Override // q9.l0
    public final void b3(String str) {
    }

    @Override // q9.l0
    public final void y2(q9.g3 g3Var) {
    }
}
