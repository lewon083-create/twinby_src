package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zc1 extends gr {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yd1 f12968d;

    public zc1(yd1 yd1Var) {
        super(15);
        int i = xc1.f12130b[t.z.m(yd1Var.f12599b)];
        this.f12968d = yd1Var;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final Integer B() {
        return (Integer) this.f12968d.f12604g;
    }

    public final sl1 h0() throws GeneralSecurityException {
        yd1 yd1Var = this.f12968d;
        ei1 ei1Var = (ei1) yd1Var.f12603f;
        Integer num = (Integer) yd1Var.f12604g;
        ei1 ei1Var2 = (ei1) yd1Var.f12603f;
        if (ei1Var.equals(ei1.RAW)) {
            return sl1.a(new byte[0]);
        }
        if (ei1Var2.equals(ei1.TINK)) {
            return kd1.b(num.intValue());
        }
        if (ei1Var2.equals(ei1.LEGACY) || ei1Var2.equals(ei1.CRUNCHY)) {
            return kd1.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final o91 q() {
        yd1 yd1Var = this.f12968d;
        return new yc1((String) yd1Var.f12600c, (ei1) yd1Var.f12603f);
    }
}
