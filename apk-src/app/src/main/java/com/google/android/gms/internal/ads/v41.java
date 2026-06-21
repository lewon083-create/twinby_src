package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v41 extends u31 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x41 f11235e;

    public v41(x41 x41Var, int i) {
        super(x41Var.size(), i);
        this.f11235e = x41Var;
    }

    @Override // com.google.android.gms.internal.ads.u31
    public final Object b(int i) {
        return this.f11235e.get(i);
    }
}
