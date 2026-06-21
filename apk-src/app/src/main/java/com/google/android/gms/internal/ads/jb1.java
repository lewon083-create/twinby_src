package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 extends v91 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb1 f6806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xo0 f6807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sl1 f6808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f6809g;

    public jb1(lb1 lb1Var, xo0 xo0Var, sl1 sl1Var, Integer num) {
        super(15);
        this.f6806d = lb1Var;
        this.f6807e = xo0Var;
        this.f6808f = sl1Var;
        this.f6809g = num;
    }

    public static jb1 i0(ja1 ja1Var, xo0 xo0Var, Integer num) throws GeneralSecurityException {
        sl1 sl1VarB;
        String str = ja1Var.f6802b;
        sl1 sl1Var = (sl1) xo0Var.f12221c;
        ja1 ja1Var2 = ja1.f6796j;
        if (ja1Var != ja1Var2 && num == null) {
            throw new GeneralSecurityException(t.z.g(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (ja1Var == ja1Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (sl1Var.f10334a.length != 32) {
            int length = sl1Var.f10334a.length;
            throw new GeneralSecurityException(l7.o.j(length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 75)));
        }
        lb1 lb1Var = new lb1(ja1Var);
        if (ja1Var == ja1Var2) {
            sl1VarB = kd1.f7203a;
        } else if (ja1Var == ja1.i) {
            sl1VarB = kd1.a(num.intValue());
        } else {
            if (ja1Var != ja1.f6795h) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            sl1VarB = kd1.b(num.intValue());
        }
        return new jb1(lb1Var, xo0Var, sl1VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final Integer B() {
        return this.f6809g;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final sl1 h0() {
        return this.f6808f;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final /* synthetic */ o91 q() {
        return this.f6806d;
    }
}
