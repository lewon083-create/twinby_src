package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gk1 extends ue1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f5838g = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f5840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk1 f5841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ek1 f5842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ek1 f5843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5844f;

    public gk1(int i, BigInteger bigInteger, fk1 fk1Var, ek1 ek1Var, ek1 ek1Var2, int i10) {
        this.f5839a = i;
        this.f5840b = bigInteger;
        this.f5841c = fk1Var;
        this.f5842d = ek1Var;
        this.f5843e = ek1Var2;
        this.f5844f = i10;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f5841c != fk1.f5377e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gk1)) {
            return false;
        }
        gk1 gk1Var = (gk1) obj;
        return gk1Var.f5839a == this.f5839a && Objects.equals(gk1Var.f5840b, this.f5840b) && Objects.equals(gk1Var.f5841c, this.f5841c) && Objects.equals(gk1Var.f5842d, this.f5842d) && Objects.equals(gk1Var.f5843e, this.f5843e) && gk1Var.f5844f == this.f5844f;
    }

    public final int hashCode() {
        return Objects.hash(gk1.class, Integer.valueOf(this.f5839a), this.f5840b, this.f5841c, this.f5842d, this.f5843e, Integer.valueOf(this.f5844f));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f5841c);
        String strValueOf2 = String.valueOf(this.f5842d);
        String strValueOf3 = String.valueOf(this.f5843e);
        String strValueOf4 = String.valueOf(this.f5840b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.f5844f;
        int length4 = String.valueOf(i).length();
        int length5 = strValueOf4.length();
        int i10 = this.f5839a;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i10).length() + 13);
        l7.o.t(sb2, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        sb2.append(", mgf1 hashType: ");
        sb2.append(strValueOf3);
        sb2.append(", saltLengthBytes: ");
        sb2.append(i);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf4);
        sb2.append(", and ");
        sb2.append(i10);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }
}
