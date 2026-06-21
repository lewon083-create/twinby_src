package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 extends l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6361d;

    public i4(String str, String str2, String str3) {
        super("COMM");
        this.f6359b = str;
        this.f6360c = str2;
        this.f6361d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i4.class == obj.getClass()) {
            i4 i4Var = (i4) obj;
            if (Objects.equals(this.f6360c, i4Var.f6360c) && Objects.equals(this.f6359b, i4Var.f6359b) && Objects.equals(this.f6361d, i4Var.f6361d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6360c.hashCode() + ((this.f6359b.hashCode() + 527) * 31);
        String str = this.f6361d;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final String toString() {
        String str = this.f7384a;
        int length = String.valueOf(str).length();
        String str2 = this.f6361d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f6359b;
        int length3 = str3.length() + length + 11 + 14;
        String str4 = this.f6360c;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 7 + length2);
        l7.o.t(sb2, str, ": language=", str3, ", description=");
        return t.z.g(sb2, str4, ", text=", str2);
    }
}
