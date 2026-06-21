package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i40 implements z60, r60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sz f6363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xp0 f6364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u9.a f6365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public wh0 f6366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vh0 f6368h;

    public i40(Context context, sz szVar, xp0 xp0Var, u9.a aVar, vh0 vh0Var) {
        this.f6362b = context;
        this.f6363c = szVar;
        this.f6364d = xp0Var;
        this.f6365e = aVar;
        this.f6368h = vh0Var;
    }

    public final synchronized void a() {
        sz szVar;
        int i;
        int i10;
        try {
            xp0 xp0Var = this.f6364d;
            if (xp0Var.T && (szVar = this.f6363c) != null) {
                Context context = this.f6362b;
                p9.k kVar = p9.k.C;
                kVar.f31317x.getClass();
                if (l80.e(context)) {
                    u9.a aVar = this.f6365e;
                    int i11 = aVar.f34366c;
                    int i12 = aVar.f34367d;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 1 + String.valueOf(i12).length());
                    sb2.append(i11);
                    sb2.append(".");
                    sb2.append(i12);
                    String string = sb2.toString();
                    kx0 kx0Var = xp0Var.V;
                    String str = kx0Var.J() + (-1) != 1 ? "javascript" : null;
                    if (kx0Var.J() == 1) {
                        i = 2;
                        i10 = 3;
                    } else if (xp0Var.f12235e == 1) {
                        i = 3;
                        i10 = 1;
                    } else {
                        i = 1;
                        i10 = 1;
                    }
                    String str2 = xp0Var.f12248l0;
                    l80 l80Var = kVar.f31317x;
                    WebView webViewU = szVar.u();
                    l80Var.getClass();
                    wh0 wh0VarJ = l80.j(i, i10, webViewU, string, str, str2);
                    this.f6366f = wh0VarJ;
                    if (wh0VarJ != null) {
                        ut0 ut0Var = wh0VarJ.f11811a;
                        if (((Boolean) q9.s.f31967e.f31970c.a(al.f2955c6)).booleanValue()) {
                            l80 l80Var2 = kVar.f31317x;
                            WebView webViewU2 = szVar.u();
                            l80Var2.getClass();
                            l80.m(ut0Var, webViewU2);
                            for (View view : szVar.C()) {
                                p9.k.C.f31317x.getClass();
                                l80.s(new sh0(ut0Var, view, 0));
                            }
                        } else {
                            View viewI0 = szVar.i0();
                            kVar.f31317x.getClass();
                            l80.m(ut0Var, viewI0);
                        }
                        szVar.x0(this.f6366f);
                        p9.k.C.f31317x.getClass();
                        l80.l(ut0Var);
                        this.f6367g = true;
                        szVar.c("onSdkLoaded", new h1.e(0));
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final synchronized void k() {
        boolean z5;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f2969d6)).booleanValue()) {
            vh0 vh0Var = this.f6368h;
            synchronized (vh0Var) {
                z5 = vh0Var.f11386f != null;
            }
        }
        if (z5) {
            this.f6368h.b();
        } else {
            if (this.f6367g) {
                return;
            }
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final synchronized void z() {
        boolean z5;
        sz szVar;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f2969d6)).booleanValue()) {
            vh0 vh0Var = this.f6368h;
            synchronized (vh0Var) {
                z5 = vh0Var.f11386f != null;
            }
        }
        if (z5) {
            this.f6368h.c();
            return;
        }
        if (!this.f6367g) {
            a();
        }
        if (!this.f6364d.T || this.f6366f == null || (szVar = this.f6363c) == null) {
            return;
        }
        szVar.c("onSdkImpression", new h1.e(0));
    }
}
