package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j4 extends l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f6704e;

    public j4(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f6701b = str;
        this.f6702c = str2;
        this.f6703d = str3;
        this.f6704e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j4.class == obj.getClass()) {
            j4 j4Var = (j4) obj;
            if (Objects.equals(this.f6701b, j4Var.f6701b) && Objects.equals(this.f6702c, j4Var.f6702c) && Objects.equals(this.f6703d, j4Var.f6703d) && Arrays.equals(this.f6704e, j4Var.f6704e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6701b;
        return Arrays.hashCode(this.f6704e) + ((this.f6703d.hashCode() + ((this.f6702c.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final String toString() {
        String str = this.f7384a;
        int length = String.valueOf(str).length();
        String str2 = this.f6701b;
        int iV = l7.o.v(length, 11, String.valueOf(str2).length(), 11);
        String str3 = this.f6702c;
        int length2 = str3.length() + iV + 14;
        String str4 = this.f6703d;
        StringBuilder sb2 = new StringBuilder(str4.length() + length2);
        l7.o.t(sb2, str, ": mimeType=", str2, ", filename=");
        return t.z.g(sb2, str3, ", description=", str4);
    }
}
