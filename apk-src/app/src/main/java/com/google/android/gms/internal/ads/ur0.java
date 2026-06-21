package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ur0 implements m80, p60, o80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final as0 f11054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xr0 f11055c;

    public ur0(Context context, as0 as0Var) {
        this.f11054b = as0Var;
        this.f11055c = xr0.k(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.o80
    public final void a() {
        if (((Boolean) vl.f11415d.r()).booleanValue()) {
            xr0 xr0Var = this.f11055c;
            xr0Var.a(true);
            this.f11054b.a(xr0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void j(q9.x1 x1Var) {
        if (((Boolean) vl.f11415d.r()).booleanValue()) {
            String string = x1Var.c().toString();
            xr0 xr0Var = this.f11055c;
            xr0Var.f(string);
            xr0Var.a(false);
            this.f11054b.a(xr0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void m() {
        if (((Boolean) vl.f11415d.r()).booleanValue()) {
            this.f11055c.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.o80
    public final void z() {
    }
}
