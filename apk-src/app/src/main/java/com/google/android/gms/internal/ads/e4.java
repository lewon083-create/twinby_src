package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e4 extends l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4829e;

    public e4(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f4826b = str;
        this.f4827c = str2;
        this.f4828d = i;
        this.f4829e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.k8
    public final void a(w6 w6Var) {
        w6Var.b(this.f4828d, this.f4829e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e4.class == obj.getClass()) {
            e4 e4Var = (e4) obj;
            if (this.f4828d == e4Var.f4828d && Objects.equals(this.f4826b, e4Var.f4826b) && Objects.equals(this.f4827c, e4Var.f4827c) && Arrays.equals(this.f4829e, e4Var.f4829e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4826b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f4827c;
        return Arrays.hashCode(this.f4829e) + ((((((this.f4828d + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final String toString() {
        String str = this.f7384a;
        int length = String.valueOf(str).length();
        String str2 = this.f4826b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f4827c;
        StringBuilder sb2 = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        l7.o.t(sb2, str, ": mimeType=", str2, ", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
