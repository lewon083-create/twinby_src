package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4450f;

    public d4(int i, String str, String str2, String str3, boolean z5, int i10) {
        boolean z10 = true;
        if (i10 != -1 && i10 <= 0) {
            z10 = false;
        }
        ix.o(z10);
        this.f4445a = i;
        this.f4446b = str;
        this.f4447c = str2;
        this.f4448d = str3;
        this.f4449e = z5;
        this.f4450f = i10;
    }

    @Override // com.google.android.gms.internal.ads.k8
    public final void a(w6 w6Var) {
        String str = this.f4447c;
        if (str != null) {
            w6Var.f11677x = str;
        }
        String str2 = this.f4446b;
        if (str2 != null) {
            w6Var.f11676w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d4.class == obj.getClass()) {
            d4 d4Var = (d4) obj;
            if (this.f4445a == d4Var.f4445a && Objects.equals(this.f4446b, d4Var.f4446b) && Objects.equals(this.f4447c, d4Var.f4447c) && Objects.equals(this.f4448d, d4Var.f4448d) && this.f4449e == d4Var.f4449e && this.f4450f == d4Var.f4450f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4446b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f4447c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = ((this.f4445a + 527) * 31) + iHashCode;
        String str3 = this.f4448d;
        return (((((((i * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f4449e ? 1 : 0)) * 31) + this.f4450f;
    }

    public final String toString() {
        String str = this.f4447c;
        int length = String.valueOf(str).length();
        String str2 = this.f4446b;
        int length2 = String.valueOf(str2).length();
        int i = this.f4445a;
        int length3 = String.valueOf(i).length();
        int i10 = this.f4450f;
        StringBuilder sb2 = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i10).length());
        l7.o.t(sb2, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return pe.a.g(sb2, i, "\", bitrate=", i10, ", metadataInterval=");
    }
}
