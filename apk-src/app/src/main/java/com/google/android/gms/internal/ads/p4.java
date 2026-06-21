package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p4 extends l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f8923c;

    public p4(String str, byte[] bArr) {
        super("PRIV");
        this.f8922b = str;
        this.f8923c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p4.class == obj.getClass()) {
            p4 p4Var = (p4) obj;
            if (Objects.equals(this.f8922b, p4Var.f8922b) && Arrays.equals(this.f8923c, p4Var.f8923c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8923c) + ((this.f8922b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final String toString() {
        String str = this.f7384a;
        int length = String.valueOf(str).length() + 8;
        String str2 = this.f8922b;
        return t.z.g(new StringBuilder(str2.length() + length), str, ": owner=", str2);
    }
}
