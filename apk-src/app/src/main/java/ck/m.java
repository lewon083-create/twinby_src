package ck;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final l f2393f = new l(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f2394g = new m(1, 0);

    public m(long j10, long j11) {
        super(j10, j11, 1L);
    }

    @Override // ck.j
    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (isEmpty() && ((m) obj).isEmpty()) {
            return true;
        }
        m mVar = (m) obj;
        return this.f2386b == mVar.f2386b && this.f2387c == mVar.f2387c;
    }

    @Override // ck.j
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f2386b;
        long j11 = ((long) 31) * (j10 ^ (j10 >>> 32));
        long j12 = this.f2387c;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    @Override // ck.j
    public final boolean isEmpty() {
        return this.f2386b > this.f2387c;
    }

    @Override // ck.j
    public final String toString() {
        return this.f2386b + ".." + this.f2387c;
    }
}
