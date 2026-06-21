package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ka1 extends w91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ja1 f7168c;

    public ka1(int i, int i10, ja1 ja1Var) {
        this.f7166a = i;
        this.f7167b = i10;
        this.f7168c = ja1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f7168c != ja1.f6792e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ka1)) {
            return false;
        }
        ka1 ka1Var = (ka1) obj;
        return ka1Var.f7166a == this.f7166a && ka1Var.f7167b == this.f7167b && ka1Var.f7168c == this.f7168c;
    }

    public final int hashCode() {
        return Objects.hash(ka1.class, Integer.valueOf(this.f7166a), Integer.valueOf(this.f7167b), 16, this.f7168c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7168c);
        int length = strValueOf.length();
        int i = this.f7167b;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i10 = this.f7166a;
        StringBuilder sb2 = new StringBuilder(l7.o.v(length + 30 + length2 + 10 + length3, 15, String.valueOf(i10).length(), 10));
        sb2.append("AesEax Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i);
        return l7.o.l(sb2, "-byte IV, 16-byte tag, and ", i10, "-byte key)");
    }
}
