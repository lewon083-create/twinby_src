package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pj1 extends mk1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mj1 f9076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sl1 f9077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sl1 f9078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f9079g;

    public pj1(mj1 mj1Var, sl1 sl1Var, sl1 sl1Var2, Integer num) {
        super(15);
        this.f9076d = mj1Var;
        this.f9077e = sl1Var;
        this.f9078f = sl1Var2;
        this.f9079g = num;
    }

    public static pj1 i0(lj1 lj1Var, sl1 sl1Var, Integer num) throws GeneralSecurityException {
        sl1 sl1VarA;
        String str = lj1Var.f7550a;
        byte[] bArr = sl1Var.f10334a;
        mj1 mj1Var = new mj1(lj1Var);
        lj1 lj1Var2 = lj1.f7549e;
        if (!lj1Var.equals(lj1Var2) && num == null) {
            throw new GeneralSecurityException(t.z.g(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (lj1Var.equals(lj1Var2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(l7.o.j(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (lj1Var == lj1Var2) {
            sl1VarA = kd1.f7203a;
        } else if (lj1Var == lj1.f7547c || lj1Var == lj1.f7548d) {
            sl1VarA = kd1.a(num.intValue());
        } else {
            if (lj1Var != lj1.f7546b) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            sl1VarA = kd1.b(num.intValue());
        }
        return new pj1(mj1Var, sl1Var, sl1VarA, num);
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final Integer B() {
        return this.f9079g;
    }

    @Override // com.google.android.gms.internal.ads.mk1
    public final sl1 h0() {
        return this.f9078f;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final /* synthetic */ o91 q() {
        return this.f9076d;
    }
}
