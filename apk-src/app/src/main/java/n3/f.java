package n3;

import j3.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f29048c;

    public f(long j10, long j11, long j12) {
        this.f29046a = j10;
        this.f29047b = j11;
        this.f29048c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f29046a == fVar.f29046a && this.f29047b == fVar.f29047b && this.f29048c == fVar.f29048c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29048c) + l7.o.d(this.f29047b, l7.o.d(this.f29046a, 527, 31), 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f29046a + ", modification time=" + this.f29047b + ", timescale=" + this.f29048c;
    }
}
