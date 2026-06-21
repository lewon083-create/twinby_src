package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class re1 extends ue1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qe1 f9927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pe1 f9928d;

    public re1(int i, int i10, qe1 qe1Var, pe1 pe1Var) {
        this.f9925a = i;
        this.f9926b = i10;
        this.f9927c = qe1Var;
        this.f9928d = pe1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f9927c != qe1.f9473e;
    }

    public final int b() {
        qe1 qe1Var = qe1.f9473e;
        int i = this.f9926b;
        qe1 qe1Var2 = this.f9927c;
        if (qe1Var2 == qe1Var) {
            return i;
        }
        if (qe1Var2 == qe1.f9470b || qe1Var2 == qe1.f9471c || qe1Var2 == qe1.f9472d) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof re1)) {
            return false;
        }
        re1 re1Var = (re1) obj;
        return re1Var.f9925a == this.f9925a && re1Var.b() == b() && re1Var.f9927c == this.f9927c && re1Var.f9928d == this.f9928d;
    }

    public final int hashCode() {
        return Objects.hash(re1.class, Integer.valueOf(this.f9925a), Integer.valueOf(this.f9926b), this.f9927c, this.f9928d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f9927c);
        String strValueOf2 = String.valueOf(this.f9928d);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.f9926b;
        int length3 = String.valueOf(i).length();
        int i10 = this.f9925a;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i10).length() + 10);
        l7.o.t(sb2, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        om1.u(sb2, ", ", i, "-byte tags, and ", i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
