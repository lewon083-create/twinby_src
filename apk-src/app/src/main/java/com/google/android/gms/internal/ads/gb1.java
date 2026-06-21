package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gb1 extends v91 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ib1 f5765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xo0 f5766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sl1 f5767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f5768g;

    public gb1(ib1 ib1Var, xo0 xo0Var, sl1 sl1Var, Integer num) {
        super(15);
        this.f5765d = ib1Var;
        this.f5766e = xo0Var;
        this.f5767f = sl1Var;
        this.f5768g = num;
    }

    public static gb1 i0(ib1 ib1Var, xo0 xo0Var, Integer num) throws GeneralSecurityException {
        sl1 sl1VarB;
        sl1 sl1Var = (sl1) xo0Var.f12221c;
        fa1 fa1Var = ib1Var.f6452a;
        String str = fa1Var.f5304b;
        fa1 fa1Var2 = fa1.f5300j;
        if (fa1Var != fa1Var2 && num == null) {
            throw new GeneralSecurityException(t.z.g(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (fa1Var == fa1Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (sl1Var.f10334a.length != 32) {
            int length = sl1Var.f10334a.length;
            throw new GeneralSecurityException(l7.o.j(length, "XAesGcmKey key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 68)));
        }
        if (fa1Var == fa1Var2) {
            sl1VarB = kd1.f7203a;
        } else {
            if (fa1Var != fa1.i) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            sl1VarB = kd1.b(num.intValue());
        }
        return new gb1(ib1Var, xo0Var, sl1VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final Integer B() {
        return this.f5768g;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final sl1 h0() {
        return this.f5767f;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final /* synthetic */ o91 q() {
        return this.f5765d;
    }
}
