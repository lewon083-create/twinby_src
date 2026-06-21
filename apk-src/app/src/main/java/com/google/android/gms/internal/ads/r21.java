package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9687c;

    public r21(int i, String str, int i10) {
        this.f9685a = i;
        this.f9686b = str;
        this.f9687c = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r21) {
            r21 r21Var = (r21) obj;
            String str2 = r21Var.f9686b;
            if (this.f9685a == r21Var.f9685a && ((str = this.f9686b) != null ? str.equals(str2) : str2 == null) && this.f9687c == r21Var.f9687c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9686b;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.f9685a ^ 1000003) * 1000003)) * 1000003) ^ this.f9687c;
    }

    public final String toString() {
        int i = this.f9685a;
        int length = String.valueOf(i).length();
        String str = this.f9686b;
        int length2 = String.valueOf(str).length();
        int i10 = this.f9687c;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i10).length() + 1);
        sb2.append("OverlayDisplayState{statusCode=");
        sb2.append(i);
        sb2.append(", sessionToken=");
        sb2.append(str);
        return l7.o.l(sb2, ", uiMode=", i10, "}");
    }
}
