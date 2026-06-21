package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i90 implements z60, s9.l, r60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sz f6435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xp0 f6436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u9.a f6437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vh0 f6438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public wh0 f6439g;

    public i90(Context context, sz szVar, xp0 xp0Var, u9.a aVar, vh0 vh0Var) {
        this.f6434b = context;
        this.f6435c = szVar;
        this.f6436d = xp0Var;
        this.f6437e = aVar;
        this.f6438f = vh0Var;
    }

    @Override // s9.l
    public final void E0(int i) {
        this.f6439g = null;
    }

    public final boolean a() {
        yt0 yt0Var;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f2969d6)).booleanValue()) {
            return false;
        }
        vh0 vh0Var = this.f6438f;
        synchronized (vh0Var) {
            yt0Var = vh0Var.f11386f;
        }
        return yt0Var != null;
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void k() {
        sz szVar;
        xp0 xp0Var = this.f6436d;
        if (!xp0Var.T || (szVar = this.f6435c) == null) {
            return;
        }
        p9.k kVar = p9.k.C;
        l80 l80Var = kVar.f31317x;
        l80 l80Var2 = kVar.f31317x;
        l80Var.getClass();
        if (l80.e(this.f6434b)) {
            if (a()) {
                this.f6438f.b();
                return;
            }
            u9.a aVar = this.f6437e;
            int i = aVar.f34366c;
            int i10 = aVar.f34367d;
            int i11 = 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i10).length());
            sb2.append(i);
            sb2.append(".");
            sb2.append(i10);
            String string = sb2.toString();
            kx0 kx0Var = xp0Var.V;
            String str = kx0Var.J() + (-1) != 1 ? "javascript" : null;
            int i12 = 2;
            if (kx0Var.J() == 1) {
                i11 = 3;
            } else {
                i12 = xp0Var.Y == 2 ? 4 : 1;
            }
            int i13 = i12;
            int i14 = i11;
            String str2 = xp0Var.f12248l0;
            WebView webViewU = szVar.u();
            l80Var2.getClass();
            wh0 wh0VarJ = l80.j(i13, i14, webViewU, string, str, str2);
            this.f6439g = wh0VarJ;
            if (wh0VarJ != null) {
                ut0 ut0Var = wh0VarJ.f11811a;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f2955c6)).booleanValue()) {
                    WebView webViewU2 = szVar.u();
                    l80Var2.getClass();
                    l80.m(ut0Var, webViewU2);
                    for (View view : szVar.C()) {
                        p9.k.C.f31317x.getClass();
                        l80.s(new sh0(ut0Var, view, 0));
                    }
                } else {
                    View viewI0 = szVar.i0();
                    l80Var2.getClass();
                    l80.m(ut0Var, viewI0);
                }
                szVar.x0(this.f6439g);
                p9.k.C.f31317x.getClass();
                l80.l(ut0Var);
                szVar.c("onSdkLoaded", new h1.e(0));
            }
        }
    }

    @Override // s9.l
    public final void m() {
        sz szVar;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3016g6)).booleanValue() || (szVar = this.f6435c) == null) {
            return;
        }
        if (this.f6439g != null || a()) {
            if (this.f6439g != null) {
                szVar.c("onSdkImpression", new h1.e(0));
            } else {
                this.f6438f.c();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void z() {
        sz szVar;
        if (a()) {
            this.f6438f.c();
        } else {
            if (this.f6439g == null || (szVar = this.f6435c) == null) {
                return;
            }
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3016g6)).booleanValue()) {
                szVar.c("onSdkImpression", new h1.e(0));
            }
        }
    }

    @Override // s9.l
    public final void A2() {
    }

    @Override // s9.l
    public final void D0() {
    }

    @Override // s9.l
    public final void L1() {
    }

    @Override // s9.l
    public final void T0() {
    }

    @Override // s9.l
    public final void X1() {
    }

    @Override // s9.l
    public final void d3() {
    }

    @Override // s9.l
    public final void i2() {
    }

    @Override // s9.l
    public final void p1() {
    }

    @Override // s9.l
    public final void w1() {
    }
}
