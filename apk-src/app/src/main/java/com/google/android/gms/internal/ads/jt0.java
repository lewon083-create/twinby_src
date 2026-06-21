package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jt0 extends q9.a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y81 f6934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xk0 f6935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0 f6936d;

    public jt0(ht0 ht0Var, y81 y81Var, xk0 xk0Var) {
        this.f6934b = y81Var;
        this.f6935c = xk0Var;
        this.f6936d = ht0Var;
    }

    @Override // q9.b0
    public final void p0(q9.x1 x1Var) {
        String string = x1Var.e().toString();
        ht0 ht0Var = this.f6936d;
        String str = ht0Var.f6245e.f31981b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 57 + String.valueOf(str).length());
        sb2.append("Failed to load interstitial ad with error: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        u9.i.h(sb2.toString());
        ht0Var.a(x1Var);
    }

    @Override // q9.b0
    public final void z() {
        Objects.requireNonNull(this.f6936d);
        this.f6934b.e(this.f6935c);
    }
}
