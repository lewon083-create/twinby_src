package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8583b;

    public o21(String str, String str2) {
        this.f8582a = str;
        this.f8583b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o21) {
            o21 o21Var = (o21) obj;
            String str = o21Var.f8583b;
            String str2 = o21Var.f8582a;
            String str3 = this.f8582a;
            if (str3 != null ? str3.equals(str2) : str2 == null) {
                String str4 = this.f8583b;
                if (str4 != null ? str4.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8582a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f8583b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f8582a;
        int length = String.valueOf(str).length();
        String str2 = this.f8583b;
        StringBuilder sb2 = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        l7.o.t(sb2, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb2.append("}");
        return sb2.toString();
    }
}
