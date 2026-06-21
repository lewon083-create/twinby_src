package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oa1 extends w91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h91 f8653b;

    public oa1(int i, h91 h91Var) {
        this.f8652a = i;
        this.f8653b = h91Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f8653b != h91.i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oa1)) {
            return false;
        }
        oa1 oa1Var = (oa1) obj;
        return oa1Var.f8652a == this.f8652a && oa1Var.f8653b == this.f8653b;
    }

    public final int hashCode() {
        return Objects.hash(oa1.class, Integer.valueOf(this.f8652a), 12, 16, this.f8653b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8653b);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.f8652a;
        StringBuilder sb2 = new StringBuilder(l7.o.v(length + 30 + length2 + 10 + length3, 15, String.valueOf(i).length(), 10));
        sb2.append("AesGcm Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", 12-byte IV, 16-byte tag, and ");
        sb2.append(i);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
