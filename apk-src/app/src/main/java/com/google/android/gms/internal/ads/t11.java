package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t11 implements n11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a11 f10464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f10465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j21 f10466c;

    public t11(a11 a11Var, ExecutorService executorService, j21 j21Var) {
        this.f10464a = a11Var;
        this.f10465b = executorService;
        this.f10466c = j21Var;
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final ed.d a(bz0 bz0Var, byte[] bArr, byte[] bArr2) {
        c91 c91VarB = vv.B(new lb0(this, bz0Var, bArr, bArr2, 6), this.f10465b);
        this.f10466c.e(15321, c91VarB);
        return c91VarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.m11
    public final ed.d b(bz0 bz0Var, byte[] bArr) {
        c91 c91VarB = vv.B(new x50(this, bz0Var, bArr, 3), this.f10465b);
        this.f10466c.e(15305, c91VarB);
        return c91VarB;
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final ed.d h() {
        return vv.d(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.n11
    public final ed.d i() {
        c91 c91VarB = vv.B(new s11(this, 0), this.f10465b);
        this.f10466c.e(15314, c91VarB);
        return c91VarB;
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final c91 j() {
        c91 c91VarB = vv.B(new s11(this, 1), this.f10465b);
        this.f10466c.e(15302, c91VarB);
        return c91VarB;
    }
}
