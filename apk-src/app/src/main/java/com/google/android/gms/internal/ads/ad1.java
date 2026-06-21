package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ad1 extends o91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zd1 f2872a;

    public ad1(zd1 zd1Var) {
        this.f2872a = zd1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return ((mh1) this.f2872a.f12972d).B() != ei1.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ad1)) {
            return false;
        }
        zd1 zd1Var = ((ad1) obj).f2872a;
        zd1 zd1Var2 = this.f2872a;
        mh1 mh1Var = (mh1) zd1Var2.f12972d;
        mh1 mh1Var2 = (mh1) zd1Var2.f12972d;
        ei1 ei1VarB = mh1Var.B();
        mh1 mh1Var3 = (mh1) zd1Var.f12972d;
        mh1 mh1Var4 = (mh1) zd1Var.f12972d;
        return ei1VarB.equals(mh1Var3.B()) && mh1Var2.z().equals(mh1Var4.z()) && mh1Var2.A().equals(mh1Var4.A());
    }

    public final int hashCode() {
        zd1 zd1Var = this.f2872a;
        return Objects.hash((mh1) zd1Var.f12972d, (sl1) zd1Var.f12971c);
    }

    public final String toString() {
        zd1 zd1Var = this.f2872a;
        String strZ = ((mh1) zd1Var.f12972d).z();
        int iOrdinal = ((mh1) zd1Var.f12972d).B().ordinal();
        return t.z.f("(typeUrl=", strZ, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
