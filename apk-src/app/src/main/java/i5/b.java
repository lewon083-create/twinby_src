package i5;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21085d;

    public b(long j10, long j11, long j12) {
        this.f21083b = j10;
        this.f21084c = j11;
        this.f21085d = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f21083b, ((b) obj).f21083b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21083b == bVar.f21083b && this.f21084c == bVar.f21084c && this.f21085d == bVar.f21085d;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f21083b), Long.valueOf(this.f21084c), Long.valueOf(this.f21085d));
    }
}
