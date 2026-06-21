package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ya1 extends w91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja1 f12561b;

    public ya1(String str, ja1 ja1Var) {
        this.f12560a = str;
        this.f12561b = ja1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f12561b != ja1.f6794g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ya1)) {
            return false;
        }
        ya1 ya1Var = (ya1) obj;
        return ya1Var.f12560a.equals(this.f12560a) && ya1Var.f12561b.equals(this.f12561b);
    }

    public final int hashCode() {
        return Objects.hash(ya1.class, this.f12560a, this.f12561b);
    }

    public final String toString() {
        String str = this.f12561b.f6802b;
        String str2 = this.f12560a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        l7.o.t(sb2, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb2.append(")");
        return sb2.toString();
    }
}
