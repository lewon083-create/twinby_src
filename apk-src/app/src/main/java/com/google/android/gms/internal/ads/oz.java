package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oz extends sx {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dy f8858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public gk0 f8859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public vx f8860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8862h;

    public oz(Context context, dy dyVar) {
        super(context);
        this.f8862h = 1;
        this.f8861g = false;
        this.f8858d = dyVar;
        dyVar.a(this);
    }

    public final boolean D() {
        int i = this.f8862h;
        return (i == 1 || i == 2 || this.f8859e == null) ? false : true;
    }

    public final void E(int i) {
        fy fyVar = this.f10425c;
        dy dyVar = this.f8858d;
        if (i == 4) {
            dyVar.d();
            fyVar.f5503d = true;
            fyVar.a();
        } else if (this.f8862h == 4) {
            dyVar.f4735m = false;
            fyVar.f5503d = false;
            fyVar.a();
        }
        this.f8862h = i;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String d() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void e(vx vxVar) {
        this.f8860f = vxVar;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void f(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.f8859e = new gk0(12);
            E(3);
            t9.g0.f33596l.post(new mz(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void g() {
        t9.c0.m("AdImmersivePlayerView stop");
        gk0 gk0Var = this.f8859e;
        if (gk0Var != null) {
            ((AtomicBoolean) gk0Var.f5837c).set(false);
            this.f8859e = null;
            E(1);
        }
        this.f8858d.b();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void h() {
        t9.c0.m("AdImmersivePlayerView play");
        if (D()) {
            ((AtomicBoolean) this.f8859e.f5837c).set(true);
            E(4);
            this.f10424b.f12369c = true;
            t9.g0.f33596l.post(new mz(this, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void i() {
        t9.c0.m("AdImmersivePlayerView pause");
        if (D() && ((AtomicBoolean) this.f8859e.f5837c).get()) {
            ((AtomicBoolean) this.f8859e.f5837c).set(false);
            E(5);
            t9.g0.f33596l.post(new mz(this, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int j() {
        return D() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void l(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27);
        sb2.append("AdImmersivePlayerView seek ");
        sb2.append(i);
        t9.c0.m(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void o() {
        if (this.f8859e != null) {
            this.f10425c.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int p() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final long q() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final long r() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final long s() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int t() {
        return D() ? 0 : -1;
    }

    @Override // android.view.View
    public final String toString() {
        String name = oz.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return t.z.g(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void m(float f10, float f11) {
    }
}
