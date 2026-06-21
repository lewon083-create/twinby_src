package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sk0 extends q9.k0 implements l70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final so0 f10315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uk0 f10317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q9.g3 f10318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hq0 f10319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u9.a f10320h;
    public final sd0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x30 f10321j;

    public sk0(Context context, q9.g3 g3Var, String str, so0 so0Var, uk0 uk0Var, u9.a aVar, sd0 sd0Var) {
        this.f10314b = context;
        this.f10315c = so0Var;
        this.f10318f = g3Var;
        this.f10316d = str;
        this.f10317e = uk0Var;
        this.f10319g = so0Var.f10364k;
        this.f10320h = aVar;
        this.i = sd0Var;
        so0Var.f10362h.x1(this, so0Var.f10356b);
    }

    @Override // q9.l0
    public final synchronized String A() {
        return this.f10316d;
    }

    @Override // q9.l0
    public final synchronized q9.y1 B() {
        x30 x30Var;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3271x7)).booleanValue() && (x30Var = this.f10321j) != null) {
            return x30Var.f9701f;
        }
        return null;
    }

    @Override // q9.l0
    public final void B2(q9.s1 s1Var) {
        if (m4()) {
            pa.c0.e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!s1Var.c()) {
                this.i.b();
            }
        } catch (RemoteException e3) {
            u9.i.d("Error in making CSI ping for reporting paid event callback", e3);
        }
        this.f10317e.f10956d.set(s1Var);
    }

    @Override // q9.l0
    public final synchronized q9.b2 C() {
        pa.c0.e("getVideoController must be called from the main thread.");
        x30 x30Var = this.f10321j;
        q9.b2 b2VarMo3h = null;
        if (x30Var == null) {
            return null;
        }
        try {
            b2VarMo3h = x30Var.f11998p.mo3h();
        } catch (kq0 unused) {
        }
        return b2VarMo3h;
    }

    @Override // q9.l0
    public final void F1() {
        pa.c0.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // q9.l0
    public final synchronized void I3(q9.y0 y0Var) {
        pa.c0.e("setCorrelationIdProvider must be called on the main UI thread");
        this.f10319g.f6233w = y0Var;
    }

    @Override // q9.l0
    public final synchronized boolean J() {
        return this.f10315c.b();
    }

    @Override // q9.l0
    public final synchronized boolean P() {
        x30 x30Var = this.f10321j;
        if (x30Var != null) {
            if (x30Var.f9697b.f12257q0) {
                return true;
            }
        }
        return false;
    }

    @Override // q9.l0
    public final synchronized void S2(boolean z5) {
        try {
            if (m4()) {
                pa.c0.e("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f10319g.f6216e = z5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // q9.l0
    public final void V3(q9.v vVar) {
        if (m4()) {
            pa.c0.e("setAdListener must be called on the main UI thread.");
        }
        wk0 wk0Var = this.f10315c.f10359e;
        synchronized (wk0Var) {
            wk0Var.f11827b = vVar;
        }
    }

    @Override // q9.l0
    public final synchronized boolean X(q9.d3 d3Var) {
        q9.g3 g3Var = this.f10318f;
        synchronized (this) {
            hq0 hq0Var = this.f10319g;
            hq0Var.f6213b = g3Var;
            hq0Var.f6227q = this.f10318f.f31887o;
        }
        return l4(d3Var);
        return l4(d3Var);
    }

    @Override // q9.l0
    public final synchronized void a2(q9.b3 b3Var) {
        try {
            if (m4()) {
                pa.c0.e("setVideoOptions must be called on the main UI thread.");
            }
            this.f10319g.f6215d = b3Var;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // q9.l0
    public final q9.y b0() {
        return this.f10317e.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // q9.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.ya r0 = com.google.android.gms.internal.ads.zl.f13031g     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.r()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.wk r0 = com.google.android.gms.internal.ads.al.f3185rc     // Catch: java.lang.Throwable -> L36
            q9.s r1 = q9.s.f31967e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.yk r2 = r1.f31970c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            u9.a r0 = r4.f10320h     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f34367d     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.internal.ads.al.f3244vc     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.yk r1 = r1.f31970c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "pause must be called on the main UI thread."
            pa.c0.e(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.x30 r0 = r4.f10321j     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.u60 r0 = r0.f9698c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.ku0 r1 = new com.google.android.gms.internal.ads.ku0     // Catch: java.lang.Throwable -> L36
            r2 = 2
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.A1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sk0.c():void");
    }

    @Override // q9.l0
    public final synchronized void e1(long j10) {
        r50 r50Var;
        this.f10319g.f6231u.set(j10);
        x30 x30Var = this.f10321j;
        if (x30Var == null || (r50Var = x30Var.f9704j) == null) {
            return;
        }
        r50Var.a(j10);
    }

    @Override // q9.l0
    public final boolean g() {
        return false;
    }

    @Override // q9.l0
    public final synchronized long g0() {
        r50 r50Var;
        x30 x30Var = this.f10321j;
        return (x30Var == null || (r50Var = x30Var.f9704j) == null) ? this.f10319g.f6231u.get() : r50Var.f9712a.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // q9.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.ya r0 = com.google.android.gms.internal.ads.zl.f13029e     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.r()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.wk r0 = com.google.android.gms.internal.ads.al.f3171qc     // Catch: java.lang.Throwable -> L36
            q9.s r1 = q9.s.f31967e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.yk r2 = r1.f31970c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            u9.a r0 = r4.f10320h     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f34367d     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.internal.ads.al.f3244vc     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.yk r1 = r1.f31970c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            pa.c0.e(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.x30 r0 = r4.f10321j     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.u60 r0 = r0.f9698c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zk r1 = new com.google.android.gms.internal.ads.zk     // Catch: java.lang.Throwable -> L36
            r2 = 2
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.A1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sk0.h():void");
    }

    @Override // q9.l0
    public final xa.a j() {
        if (m4()) {
            pa.c0.e("getAdFrame must be called on the main UI thread.");
        }
        return new xa.b(this.f10315c.f10360f);
    }

    @Override // q9.l0
    public final void j3(q9.y yVar) {
        if (m4()) {
            pa.c0.e("setAdListener must be called on the main UI thread.");
        }
        this.f10317e.f10954b.set(yVar);
    }

    @Override // q9.l0
    public final synchronized void j4(gl glVar) {
        pa.c0.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f10315c.f10361g = glVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // q9.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void k() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.ya r0 = com.google.android.gms.internal.ads.zl.f13032h     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.r()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.wk r0 = com.google.android.gms.internal.ads.al.f3156pc     // Catch: java.lang.Throwable -> L36
            q9.s r1 = q9.s.f31967e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.yk r2 = r1.f31970c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            u9.a r0 = r4.f10320h     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f34367d     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.internal.ads.al.f3244vc     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.yk r1 = r1.f31970c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "resume must be called on the main UI thread."
            pa.c0.e(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.x30 r0 = r4.f10321j     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.u60 r0 = r0.f9698c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.uk r1 = new com.google.android.gms.internal.ads.uk     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.A1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sk0.k():void");
    }

    public final synchronized boolean l4(q9.d3 d3Var) {
        try {
            if (m4()) {
                pa.c0.e("loadAd must be called on the main UI thread.");
            }
            t9.g0 g0Var = p9.k.C.f31297c;
            Context context = this.f10314b;
            if (!t9.g0.i(context) || d3Var.f31818t != null) {
                gr.E(context, d3Var.f31806g);
                return this.f10315c.a(d3Var, this.f10316d, null, new cf(28, this));
            }
            u9.i.e("Failed to load the ad because app ID is missing.");
            uk0 uk0Var = this.f10317e;
            if (uk0Var != null) {
                uk0Var.K(vv.C(4, null, null));
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.ya r0 = com.google.android.gms.internal.ads.zl.f13030f
            java.lang.Object r0 = r0.r()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.wk r0 = com.google.android.gms.internal.ads.al.f3216tc
            q9.s r3 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r3 = r3.f31970c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            u9.a r3 = r6.f10320h
            int r3 = r3.f34367d
            com.google.android.gms.internal.ads.wk r4 = com.google.android.gms.internal.ads.al.f3231uc
            q9.s r5 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r5 = r5.f31970c
            java.lang.Object r4 = r5.a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sk0.m4():boolean");
    }

    @Override // q9.l0
    public final Bundle n() {
        pa.c0.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // q9.l0
    public final synchronized void p() {
        pa.c0.e("recordManualImpression must be called on the main UI thread.");
        x30 x30Var = this.f10321j;
        if (x30Var != null) {
            w80 w80Var = x30Var.f12000r;
            synchronized (w80Var) {
                w80Var.A1(l80.i);
            }
        }
    }

    @Override // q9.l0
    public final synchronized q9.g3 q() {
        pa.c0.e("getAdSize must be called on the main UI thread.");
        x30 x30Var = this.f10321j;
        if (x30Var != null) {
            return fs1.h(this.f10314b, Collections.singletonList(x30Var.c()));
        }
        return this.f10319g.f6213b;
    }

    @Override // q9.l0
    public final q9.v0 u() {
        q9.v0 v0Var;
        uk0 uk0Var = this.f10317e;
        synchronized (uk0Var) {
            v0Var = (q9.v0) uk0Var.f10955c.get();
        }
        return v0Var;
    }

    @Override // q9.l0
    public final synchronized String v() {
        e60 e60Var;
        x30 x30Var = this.f10321j;
        if (x30Var == null || (e60Var = x30Var.f9701f) == null) {
            return null;
        }
        return e60Var.f4843b;
    }

    @Override // q9.l0
    public final void v1(q9.v0 v0Var) {
        if (m4()) {
            pa.c0.e("setAppEventListener must be called on the main UI thread.");
        }
        this.f10317e.g(v0Var);
    }

    @Override // q9.l0
    public final synchronized String x() {
        e60 e60Var;
        x30 x30Var = this.f10321j;
        if (x30Var == null || (e60Var = x30Var.f9701f) == null) {
            return null;
        }
        return e60Var.f4843b;
    }

    @Override // q9.l0
    public final synchronized void y2(q9.g3 g3Var) {
        sz szVar;
        pa.c0.e("setAdSize must be called on the main UI thread.");
        this.f10319g.f6213b = g3Var;
        this.f10318f = g3Var;
        x30 x30Var = this.f10321j;
        if (x30Var != null) {
            FrameLayout frameLayout = this.f10315c.f10360f;
            if (frameLayout != null && (szVar = x30Var.f11996n) != null) {
                szVar.W0(j0.a(g3Var));
                frameLayout.setMinimumHeight(g3Var.f31877d);
                frameLayout.setMinimumWidth(g3Var.f31880g);
                x30Var.f12003u = g3Var;
            }
        }
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
