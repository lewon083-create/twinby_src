package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sa1 extends v91 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ua1 f10228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xo0 f10229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sl1 f10230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f10231g;

    public sa1(ua1 ua1Var, xo0 xo0Var, sl1 sl1Var, Integer num) {
        super(15);
        this.f10228d = ua1Var;
        this.f10229e = xo0Var;
        this.f10230f = sl1Var;
        this.f10231g = num;
    }

    public static sa1 i0(fa1 fa1Var, xo0 xo0Var, Integer num) throws GeneralSecurityException {
        sl1 sl1VarB;
        String str = fa1Var.f5304b;
        sl1 sl1Var = (sl1) xo0Var.f12221c;
        fa1 fa1Var2 = fa1.f5299h;
        if (fa1Var != fa1Var2 && num == null) {
            throw new GeneralSecurityException(t.z.g(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (fa1Var == fa1Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (sl1Var.f10334a.length != 32) {
            int length = sl1Var.f10334a.length;
            throw new GeneralSecurityException(l7.o.j(length, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 74)));
        }
        ua1 ua1Var = new ua1(fa1Var);
        if (fa1Var == fa1Var2) {
            sl1VarB = kd1.f7203a;
        } else if (fa1Var == fa1.f5298g) {
            sl1VarB = kd1.a(num.intValue());
        } else {
            if (fa1Var != fa1.f5297f) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            sl1VarB = kd1.b(num.intValue());
        }
        return new sa1(ua1Var, xo0Var, sl1VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final Integer B() {
        return this.f10231g;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final sl1 h0() {
        return this.f10230f;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final /* synthetic */ o91 q() {
        return this.f10228d;
    }
}
