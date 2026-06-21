package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class je0 implements fe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xk0 f6835b;

    public je0(long j10, Context context, gk0 gk0Var, n10 n10Var, String str) {
        this.f6834a = j10;
        n10 n10Var2 = n10Var.f8104b;
        q9.g3 g3Var = new q9.g3();
        str.getClass();
        xk0 xk0Var = (xk0) new x10(n10Var2, context, str, g3Var).f11972a.j();
        this.f6835b = xk0Var;
        xk0Var.j3(new ie0(this, gk0Var));
    }

    @Override // com.google.android.gms.internal.ads.fe0
    public final void a(q9.d3 d3Var) {
        this.f6835b.X(d3Var);
    }

    @Override // com.google.android.gms.internal.ads.fe0
    public final void j() {
        this.f6835b.C0(new xa.b(null));
    }

    @Override // com.google.android.gms.internal.ads.fe0
    public final void l() {
        this.f6835b.h();
    }
}
