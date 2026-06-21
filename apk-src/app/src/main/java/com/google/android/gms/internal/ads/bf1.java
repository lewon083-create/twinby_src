package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bf1 extends gr {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cf1 f3774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xo0 f3775e;

    public bf1(cf1 cf1Var, xo0 xo0Var) {
        super(15);
        this.f3774d = cf1Var;
        this.f3775e = xo0Var;
    }

    public static bf1 h0(cf1 cf1Var, xo0 xo0Var) throws GeneralSecurityException {
        if (cf1Var.f4198a == ((sl1) xo0Var.f12221c).f10334a.length) {
            return new bf1(cf1Var, xo0Var);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final Integer B() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final /* synthetic */ o91 q() {
        return this.f3774d;
    }
}
