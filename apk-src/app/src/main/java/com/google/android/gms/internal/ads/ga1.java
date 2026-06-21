package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ga1 extends w91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fa1 f5749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ea1 f5750f;

    public ga1(int i, int i10, int i11, int i12, fa1 fa1Var, ea1 ea1Var) {
        this.f5745a = i;
        this.f5746b = i10;
        this.f5747c = i11;
        this.f5748d = i12;
        this.f5749e = fa1Var;
        this.f5750f = ea1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f5749e != fa1.f5296e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ga1)) {
            return false;
        }
        ga1 ga1Var = (ga1) obj;
        return ga1Var.f5745a == this.f5745a && ga1Var.f5746b == this.f5746b && ga1Var.f5747c == this.f5747c && ga1Var.f5748d == this.f5748d && ga1Var.f5749e == this.f5749e && ga1Var.f5750f == this.f5750f;
    }

    public final int hashCode() {
        return Objects.hash(ga1.class, Integer.valueOf(this.f5745a), Integer.valueOf(this.f5746b), Integer.valueOf(this.f5747c), Integer.valueOf(this.f5748d), this.f5749e, this.f5750f);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f5749e);
        String strValueOf2 = String.valueOf(this.f5750f);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.f5747c;
        int length3 = String.valueOf(i).length();
        int i10 = this.f5748d;
        int length4 = String.valueOf(i10).length();
        int i11 = this.f5745a;
        int length5 = String.valueOf(i11).length();
        int i12 = this.f5746b;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i12).length() + 15);
        l7.o.t(sb2, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        om1.u(sb2, ", ", i, "-byte IV, and ", i10);
        om1.u(sb2, "-byte tags, and ", i11, "-byte AES key, and ", i12);
        sb2.append("-byte HMAC key)");
        return sb2.toString();
    }
}
