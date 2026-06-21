package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hj1 extends ue1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa1 f6161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gj1 f6162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ea1 f6163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ja1 f6164d;

    public hj1(fa1 fa1Var, gj1 gj1Var, ea1 ea1Var, ja1 ja1Var) {
        this.f6161a = fa1Var;
        this.f6162b = gj1Var;
        this.f6163c = ea1Var;
        this.f6164d = ja1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f6164d != ja1.f6800n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hj1)) {
            return false;
        }
        hj1 hj1Var = (hj1) obj;
        return hj1Var.f6161a == this.f6161a && hj1Var.f6162b == this.f6162b && hj1Var.f6163c == this.f6163c && hj1Var.f6164d == this.f6164d;
    }

    public final int hashCode() {
        return Objects.hash(hj1.class, this.f6161a, this.f6162b, this.f6163c, this.f6164d);
    }

    public final String toString() {
        String str = this.f6164d.f6802b;
        int length = str.length();
        String str2 = this.f6163c.f4908c;
        int length2 = str2.length();
        String str3 = this.f6161a.f5304b;
        int length3 = str3.length();
        String str4 = this.f6162b.f5832a;
        StringBuilder sb2 = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        l7.o.t(sb2, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        l7.o.t(sb2, ", encoding: ", str3, ", curve: ", str4);
        sb2.append(")");
        return sb2.toString();
    }
}
