package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10158b;

    public s21(String str, String str2) {
        this.f10157a = str;
        this.f10158b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s21) {
            s21 s21Var = (s21) obj;
            String str = s21Var.f10158b;
            String str2 = s21Var.f10157a;
            String str3 = this.f10157a;
            if (str3 != null ? str3.equals(str2) : str2 == null) {
                String str4 = this.f10158b;
                if (str4 != null ? str4.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10157a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f10158b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f10157a;
        int length = String.valueOf(str).length();
        String str2 = this.f10158b;
        StringBuilder sb2 = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        l7.o.t(sb2, "OverlayDisplayUpdateRequest{sessionToken=", str, ", appId=", str2);
        sb2.append("}");
        return sb2.toString();
    }
}
