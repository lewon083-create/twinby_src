package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g60 f12109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u80 f12110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w60 f12111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c70 f12112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f70 f12113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x70 f12114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f12115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t80 f12116h;
    public final n30 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p9.a f12117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wv f12118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xe f12119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t70 f12120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kh0 f12121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bt0 f12122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sd0 f12123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w20 f12124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bd0 f12125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final de0 f12126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v50 f12127t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r50 f12128u;

    public xc0(g60 g60Var, w60 w60Var, c70 c70Var, f70 f70Var, x70 x70Var, Executor executor, t80 t80Var, n30 n30Var, p9.a aVar, wv wvVar, xe xeVar, t70 t70Var, kh0 kh0Var, bt0 bt0Var, sd0 sd0Var, u80 u80Var, w20 w20Var, bd0 bd0Var, de0 de0Var, v50 v50Var, r50 r50Var) {
        this.f12109a = g60Var;
        this.f12111c = w60Var;
        this.f12112d = c70Var;
        this.f12113e = f70Var;
        this.f12114f = x70Var;
        this.f12115g = executor;
        this.f12116h = t80Var;
        this.i = n30Var;
        this.f12117j = aVar;
        this.f12118k = wvVar;
        this.f12119l = xeVar;
        this.f12120m = t70Var;
        this.f12121n = kh0Var;
        this.f12122o = bt0Var;
        this.f12123p = sd0Var;
        this.f12110b = u80Var;
        this.f12124q = w20Var;
        this.f12125r = bd0Var;
        this.f12126s = de0Var;
        this.f12127t = v50Var;
        this.f12128u = r50Var;
    }

    public static final jx b(sz szVar, String str, String str2, Bundle bundle, as0 as0Var) {
        wk wkVar = al.E2;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            a0.u.u(p9.k.C.f31304k, bundle, "rendering-webview-load-html-start");
        }
        jx jxVar = new jx();
        if (((Boolean) sVar.f31970c.a(al.f2942ba)).booleanValue()) {
            xr0 xr0VarK = xr0.k(szVar.getContext(), 112);
            xr0VarK.h();
            fs1.R(jxVar, as0Var, xr0VarK, false);
        }
        szVar.q0().f7062h = new n90(11, bundle, jxVar);
        szVar.K0(str, str2);
        return jxVar;
    }

    public final void a(sz szVar, boolean z5, xo xoVar, Bundle bundle) {
        ve veVar;
        wk wkVar = al.E2;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            a0.u.u(p9.k.C.f31304k, bundle, "rendering-configure-webview-start");
        }
        szVar.q0().k(new q9.a() { // from class: com.google.android.gms.internal.ads.wc0
            @Override // q9.a
            public final /* synthetic */ void onAdClicked() {
                this.f11743b.f12109a.onAdClicked();
            }
        }, this.f12112d, this.f12113e, new mo() { // from class: com.google.android.gms.internal.ads.uc0
            @Override // com.google.android.gms.internal.ads.mo
            public final /* synthetic */ void r0(String str, String str2) {
                this.f10908b.f12114f.r0(str, str2);
            }
        }, new hc0(2, this), z5, xoVar, this.f12117j, new ox0(22, this), this.f12118k, this.f12121n, this.f12122o, this.f12123p, null, this.f12110b, null, null, null, this.f12124q, this.f12126s, this.f12127t, this.f12128u);
        szVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.vc0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                xc0 xc0Var = this.f11359b;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3111mb)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    xc0Var.f12125r.f3763a = motionEvent;
                }
                xc0Var.f12117j.f31256b = true;
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        szVar.setOnClickListener(new xs(this));
        if (((Boolean) ykVar2.a(al.f3028h3)).booleanValue() && (veVar = this.f12119l.f12136b) != null) {
            veVar.g(szVar.i0());
        }
        t80 t80Var = this.f12116h;
        Executor executor = this.f12115g;
        t80Var.x1(szVar, executor);
        t80Var.x1(new tb0(szVar, 2), executor);
        t80Var.F1(szVar.i0());
        szVar.u0("/trackActiveViewUnit", new so(5, this, szVar));
        n30 n30Var = this.i;
        n30Var.getClass();
        n30Var.f8174k = new WeakReference(szVar);
        if (((Boolean) ykVar2.a(wkVar)).booleanValue()) {
            a0.u.u(p9.k.C.f31304k, bundle, "rendering-configure-webview-end");
        }
    }
}
