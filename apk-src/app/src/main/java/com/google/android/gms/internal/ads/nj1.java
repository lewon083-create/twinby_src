package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nj1 extends lk1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pj1 f8322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xo0 f8323e;

    public nj1(pj1 pj1Var, xo0 xo0Var) {
        super(15);
        this.f8322d = pj1Var;
        this.f8323e = xo0Var;
    }

    public static nj1 i0(pj1 pj1Var, xo0 xo0Var) throws GeneralSecurityException {
        sl1 sl1Var = (sl1) xo0Var.f12221c;
        if (sl1Var.f10334a.length != 32) {
            int length = sl1Var.f10334a.length;
            throw new GeneralSecurityException(l7.o.j(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (Arrays.equals(pj1Var.f9077e.b(), pn1.j(pn1.q(sl1Var.b())))) {
            return new nj1(pj1Var, xo0Var);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // com.google.android.gms.internal.ads.lk1
    public final /* synthetic */ mk1 h0() {
        return this.f8322d;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final o91 q() {
        return this.f8322d.f9076d;
    }
}
