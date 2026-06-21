package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tp0 extends dv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rp0 f10684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final np0 f10685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fq0 f10687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f10688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u9.a f10689h;
    public final xe i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sd0 f10690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public qc0 f10691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10692l = ((Boolean) q9.s.f31967e.f31970c.a(al.f2934b1)).booleanValue();

    public tp0(String str, rp0 rp0Var, Context context, np0 np0Var, fq0 fq0Var, u9.a aVar, xe xeVar, sd0 sd0Var) {
        this.f10686e = str;
        this.f10684c = rp0Var;
        this.f10685d = np0Var;
        this.f10687f = fq0Var;
        this.f10688g = context;
        this.f10689h = aVar;
        this.i = xeVar;
        this.f10690j = sd0Var;
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final synchronized void K2(xa.a aVar, boolean z5) {
        pa.c0.e("#008 Must be called on the main UI thread.");
        if (this.f10691k == null) {
            u9.i.h("Rewarded can not be shown before loaded");
            this.f10685d.j(vv.C(9, null, null));
            return;
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3192s3)).booleanValue()) {
            this.i.f12136b.e(new Throwable().getStackTrace());
        }
        this.f10691k.c((Activity) xa.b.X1(aVar), z5);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final synchronized void R0(q9.d3 d3Var, lv lvVar) {
        l4(d3Var, lvVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final synchronized void T2(long j10) {
        r50 r50Var;
        qc0 qc0Var = this.f10691k;
        if (qc0Var == null || (r50Var = qc0Var.f9704j) == null) {
            return;
        }
        r50Var.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void U1(mv mvVar) {
        pa.c0.e("#008 Must be called on the main UI thread.");
        this.f10685d.f8416g.set(mvVar);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final synchronized void X0(pv pvVar) {
        pa.c0.e("#008 Must be called on the main UI thread.");
        fq0 fq0Var = this.f10687f;
        fq0Var.f5421a = pvVar.f9190b;
        fq0Var.f5422b = pvVar.f9191c;
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void X2(hv hvVar) {
        pa.c0.e("#008 Must be called on the main UI thread.");
        this.f10685d.f8414e.set(hvVar);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final synchronized void c1(xa.a aVar) {
        K2(aVar, this.f10692l);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void c2(q9.s1 s1Var) {
        pa.c0.e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!s1Var.c()) {
                this.f10690j.b();
            }
        } catch (RemoteException e3) {
            u9.i.d("Error in making CSI ping for reporting paid event callback", e3);
        }
        this.f10685d.i.set(s1Var);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final synchronized String d() {
        e60 e60Var;
        qc0 qc0Var = this.f10691k;
        if (qc0Var == null || (e60Var = qc0Var.f9701f) == null) {
            return null;
        }
        return e60Var.f4843b;
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final bv e() {
        pa.c0.e("#008 Must be called on the main UI thread.");
        qc0 qc0Var = this.f10691k;
        if (qc0Var != null) {
            return qc0Var.f9449s;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final boolean f() {
        pa.c0.e("#008 Must be called on the main UI thread.");
        qc0 qc0Var = this.f10691k;
        return (qc0Var == null || qc0Var.f9453w) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final synchronized void i4(boolean z5) {
        pa.c0.e("setImmersiveMode must be called on the main UI thread.");
        this.f10692l = z5;
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final Bundle k() {
        Bundle bundle;
        pa.c0.e("#008 Must be called on the main UI thread.");
        qc0 qc0Var = this.f10691k;
        if (qc0Var == null) {
            return new Bundle();
        }
        c70 c70Var = qc0Var.f9447q;
        synchronized (c70Var) {
            bundle = new Bundle(c70Var.f4067d);
        }
        return bundle;
    }

    public final synchronized void l4(q9.d3 d3Var, lv lvVar, int i) {
        try {
            if (!d3Var.c()) {
                boolean z5 = false;
                if (((Boolean) zl.f13034k.r()).booleanValue()) {
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.f3216tc)).booleanValue()) {
                        z5 = true;
                    }
                }
                if (this.f10689h.f34367d < ((Integer) q9.s.f31967e.f31970c.a(al.f3231uc)).intValue() || !z5) {
                    pa.c0.e("#008 Must be called on the main UI thread.");
                }
            }
            np0 np0Var = this.f10685d;
            np0Var.f8413d.set(lvVar);
            t9.g0 g0Var = p9.k.C.f31297c;
            if (t9.g0.i(this.f10688g) && d3Var.f31818t == null) {
                u9.i.e("Failed to load the ad because app ID is missing.");
                np0Var.K(vv.C(4, null, null));
                return;
            }
            if (this.f10691k != null) {
                return;
            }
            op0 op0Var = new op0(3);
            rp0 rp0Var = this.f10684c;
            rp0Var.f10016h.f6225o.f28052c = i;
            rp0Var.a(d3Var, this.f10686e, op0Var, new kx0(26, this));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final synchronized void n1(q9.d3 d3Var, lv lvVar) {
        l4(d3Var, lvVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final synchronized long o() {
        r50 r50Var;
        qc0 qc0Var = this.f10691k;
        if (qc0Var == null || (r50Var = qc0Var.f9704j) == null) {
            return 0L;
        }
        return r50Var.f9712a.get();
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final q9.y1 p() {
        qc0 qc0Var;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3271x7)).booleanValue() && (qc0Var = this.f10691k) != null) {
            return qc0Var.f9701f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final String q() {
        return this.f10686e;
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void u3(q9.q1 q1Var) {
        np0 np0Var = this.f10685d;
        if (q1Var == null) {
            np0Var.f8412c.set(null);
        } else {
            np0Var.f8412c.set(new sp0(this, q1Var, 0));
        }
    }
}
