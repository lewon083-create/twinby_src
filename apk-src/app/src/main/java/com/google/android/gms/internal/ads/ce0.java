package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ce0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4191b;

    public ce0(long j10, int i) {
        this.f4190a = j10;
        this.f4191b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ce0) {
            ce0 ce0Var = (ce0) obj;
            if (this.f4190a == ce0Var.f4190a && this.f4191b == ce0Var.f4191b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f4190a;
        return ((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f4191b;
    }

    public final String toString() {
        long j10 = this.f4190a;
        int length = String.valueOf(j10).length();
        int i = this.f4191b;
        StringBuilder sb2 = new StringBuilder(length + 34 + String.valueOf(i).length() + 1);
        pe.a.s(sb2, "OnDeviceStorageKey{id=", j10, ", eventType=");
        return t.z.d(i, "}", sb2);
    }
}
