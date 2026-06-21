package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y3 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12475e;

    public y3(long j10, long j11, long j12, long j13, long j14) {
        this.f12471a = j10;
        this.f12472b = j11;
        this.f12473c = j12;
        this.f12474d = j13;
        this.f12475e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y3.class == obj.getClass()) {
            y3 y3Var = (y3) obj;
            if (this.f12471a == y3Var.f12471a && this.f12472b == y3Var.f12472b && this.f12473c == y3Var.f12473c && this.f12474d == y3Var.f12474d && this.f12475e == y3Var.f12475e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12475e) + ((Long.hashCode(this.f12474d) + ((Long.hashCode(this.f12473c) + ((Long.hashCode(this.f12472b) + ((Long.hashCode(this.f12471a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        long j10 = this.f12471a;
        int length = String.valueOf(j10).length();
        long j11 = this.f12472b;
        int length2 = String.valueOf(j11).length();
        long j12 = this.f12473c;
        int length3 = String.valueOf(j12).length();
        long j13 = this.f12474d;
        int length4 = String.valueOf(j13).length();
        long j14 = this.f12475e;
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j14).length());
        pe.a.s(sb2, "Motion photo metadata: photoStartPosition=", j10, ", photoSize=");
        sb2.append(j11);
        pe.a.s(sb2, ", photoPresentationTimestampUs=", j12, ", videoStartPosition=");
        sb2.append(j13);
        sb2.append(", videoSize=");
        sb2.append(j14);
        return sb2.toString();
    }
}
