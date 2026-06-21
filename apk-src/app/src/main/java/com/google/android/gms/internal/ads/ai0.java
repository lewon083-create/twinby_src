package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ai0 implements zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh0 f2905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c31 f2906b;

    public ai0(zh0 zh0Var, c31 c31Var) {
        this.f2905a = zh0Var;
        this.f2906b = c31Var;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(eq0 eq0Var, xp0 xp0Var) {
        return this.f2905a.a(eq0Var, xp0Var);
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final ed.d b(eq0 eq0Var, xp0 xp0Var) {
        return vv.K(this.f2905a.b(eq0Var, xp0Var), this.f2906b, hx.f6279a);
    }
}
