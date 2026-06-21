package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z3 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12857a;

    public z3(long j10) {
        this.f12857a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z3.class == obj.getClass() && this.f12857a == ((z3) obj).f12857a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12857a) + 527;
    }

    public final String toString() {
        long j10 = this.f12857a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 38);
        sb2.append("ThumbnailMetadata: presentationTimeUs=");
        sb2.append(j10);
        return sb2.toString();
    }
}
