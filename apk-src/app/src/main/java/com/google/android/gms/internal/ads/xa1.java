package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xa1 extends v91 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ya1 f12095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sl1 f12096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f12097f;

    public xa1(ya1 ya1Var, sl1 sl1Var, Integer num) {
        super(15);
        this.f12095d = ya1Var;
        this.f12096e = sl1Var;
        this.f12097f = num;
    }

    public static xa1 i0(ya1 ya1Var, Integer num) throws GeneralSecurityException {
        sl1 sl1VarA;
        ja1 ja1Var = ya1Var.f12561b;
        if (ja1Var == ja1.f6793f) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            sl1VarA = sl1.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (ja1Var != ja1.f6794g) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(ja1Var.f6802b));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            sl1VarA = sl1.a(new byte[0]);
        }
        return new xa1(ya1Var, sl1VarA, num);
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final Integer B() {
        return this.f12097f;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final sl1 h0() {
        return this.f12096e;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final /* synthetic */ o91 q() {
        return this.f12095d;
    }
}
