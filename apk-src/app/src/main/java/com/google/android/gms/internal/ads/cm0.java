package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cm0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4263h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4265k;

    public cm0(int i, boolean z5, boolean z10, int i10, int i11, int i12, int i13, int i14, float f10, boolean z11, boolean z12) {
        this.f4256a = i;
        this.f4257b = z5;
        this.f4258c = z10;
        this.f4259d = i10;
        this.f4260e = i11;
        this.f4261f = i12;
        this.f4262g = i13;
        this.f4263h = i14;
        this.i = f10;
        this.f4264j = z11;
        this.f4265k = z12;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        Bundle bundle = ((w50) obj).f11646a;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.jc)).booleanValue()) {
            bundle.putInt("muv_min", this.f4260e);
            bundle.putInt("muv_max", this.f4261f);
        }
        bundle.putFloat("android_app_volume", this.i);
        bundle.putBoolean("android_app_muted", this.f4264j);
        if (this.f4265k) {
            return;
        }
        bundle.putInt("am", this.f4256a);
        bundle.putBoolean("ma", this.f4257b);
        bundle.putBoolean("sp", this.f4258c);
        bundle.putInt("muv", this.f4259d);
        bundle.putInt("rm", this.f4262g);
        bundle.putInt("riv", this.f4263h);
    }
}
