package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class iw0 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6631c;

    public iw0(long j10, long j11, long j12) {
        this.f6629a = j10;
        this.f6630b = j11;
        this.f6631c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw0)) {
            return false;
        }
        iw0 iw0Var = (iw0) obj;
        return this.f6629a == iw0Var.f6629a && this.f6630b == iw0Var.f6630b && this.f6631c == iw0Var.f6631c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6631c) + ((Long.hashCode(this.f6630b) + ((Long.hashCode(this.f6629a) + 527) * 31)) * 31);
    }

    public final String toString() {
        long j10 = this.f6629a;
        int length = String.valueOf(j10).length();
        long j11 = this.f6630b;
        int length2 = String.valueOf(j11).length();
        long j12 = this.f6631c;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j12).length());
        pe.a.s(sb2, "Mp4Timestamp: creation time=", j10, ", modification time=");
        sb2.append(j11);
        sb2.append(", timescale=");
        sb2.append(j12);
        return sb2.toString();
    }
}
