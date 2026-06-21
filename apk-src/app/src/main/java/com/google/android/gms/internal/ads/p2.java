package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2 f8886c = new p2(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8888b;

    public p2(long j10, long j11) {
        this.f8887a = j10;
        this.f8888b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p2.class == obj.getClass()) {
            p2 p2Var = (p2) obj;
            if (this.f8887a == p2Var.f8887a && this.f8888b == p2Var.f8888b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f8887a) * 31) + ((int) this.f8888b);
    }

    public final String toString() {
        long j10 = this.f8887a;
        int length = String.valueOf(j10).length();
        long j11 = this.f8888b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(j11).length() + 1);
        pe.a.s(sb2, "[timeUs=", j10, ", position=");
        return pe.a.h(sb2, j11, "]");
    }
}
