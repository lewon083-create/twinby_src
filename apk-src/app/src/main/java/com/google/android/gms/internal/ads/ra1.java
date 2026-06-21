package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ra1 extends w91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ea1 f9785b;

    public ra1(int i, ea1 ea1Var) {
        this.f9784a = i;
        this.f9785b = ea1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f9785b != ea1.f4901k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ra1)) {
            return false;
        }
        ra1 ra1Var = (ra1) obj;
        return ra1Var.f9784a == this.f9784a && ra1Var.f9785b == this.f9785b;
    }

    public final int hashCode() {
        return Objects.hash(ra1.class, Integer.valueOf(this.f9784a), this.f9785b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f9785b);
        int length = strValueOf.length();
        int i = this.f9784a;
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb2.append("AesGcmSiv Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
