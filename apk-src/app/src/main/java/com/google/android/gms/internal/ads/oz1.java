package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8865b;

    public oz1(long j10, long j11) {
        this.f8864a = j10;
        this.f8865b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz1)) {
            return false;
        }
        oz1 oz1Var = (oz1) obj;
        return this.f8864a == oz1Var.f8864a && this.f8865b == oz1Var.f8865b;
    }

    public final int hashCode() {
        return (((int) this.f8864a) * 31) + ((int) this.f8865b);
    }
}
