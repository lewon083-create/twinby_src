package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12490d;

    public /* synthetic */ y4(long j10, long j11, long j12) {
        this.f12488b = j10;
        this.f12489c = j11;
        this.f12490d = j12;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f12488b, ((y4) obj).f12488b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return this.f12488b == y4Var.f12488b && this.f12489c == y4Var.f12489c && this.f12490d == y4Var.f12490d;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12488b), Long.valueOf(this.f12489c), Long.valueOf(this.f12490d));
    }
}
