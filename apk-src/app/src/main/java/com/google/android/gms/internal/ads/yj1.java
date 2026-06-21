package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yj1 extends ue1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f12635e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f12637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xj1 f12638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wj1 f12639d;

    public yj1(int i, BigInteger bigInteger, xj1 xj1Var, wj1 wj1Var) {
        this.f12636a = i;
        this.f12637b = bigInteger;
        this.f12638c = xj1Var;
        this.f12639d = wj1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f12638c != xj1.f12173e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yj1)) {
            return false;
        }
        yj1 yj1Var = (yj1) obj;
        return yj1Var.f12636a == this.f12636a && Objects.equals(yj1Var.f12637b, this.f12637b) && yj1Var.f12638c == this.f12638c && yj1Var.f12639d == this.f12639d;
    }

    public final int hashCode() {
        return Objects.hash(yj1.class, Integer.valueOf(this.f12636a), this.f12637b, this.f12638c, this.f12639d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12638c);
        String strValueOf2 = String.valueOf(this.f12639d);
        String strValueOf3 = String.valueOf(this.f12637b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.f12636a;
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        l7.o.t(sb2, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf3);
        sb2.append(", and ");
        sb2.append(i);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }
}
