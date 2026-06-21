package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ab1 extends v91 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bb1 f2834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sl1 f2835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f2836f;

    public ab1(bb1 bb1Var, sl1 sl1Var, Integer num) {
        super(15);
        this.f2834d = bb1Var;
        this.f2835e = sl1Var;
        this.f2836f = num;
    }

    public static ab1 i0(bb1 bb1Var, Integer num) throws GeneralSecurityException {
        sl1 sl1VarB;
        ea1 ea1Var = bb1Var.f3715a;
        if (ea1Var == ea1.f4903m) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            sl1VarB = kd1.f7203a;
        } else {
            if (ea1Var != ea1.f4902l) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(ea1Var)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            sl1VarB = kd1.b(num.intValue());
        }
        return new ab1(bb1Var, sl1VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final Integer B() {
        return this.f2836f;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final sl1 h0() {
        return this.f2835e;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final /* synthetic */ o91 q() {
        return this.f2834d;
    }
}
