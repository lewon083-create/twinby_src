package z4;

import j3.a0;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46195e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f46191a = j10;
        this.f46192b = j11;
        this.f46193c = j12;
        this.f46194d = j13;
        this.f46195e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f46191a == bVar.f46191a && this.f46192b == bVar.f46192b && this.f46193c == bVar.f46193c && this.f46194d == bVar.f46194d && this.f46195e == bVar.f46195e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f46195e) + o.d(this.f46194d, o.d(this.f46193c, o.d(this.f46192b, o.d(this.f46191a, 527, 31), 31), 31), 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f46191a + ", photoSize=" + this.f46192b + ", photoPresentationTimestampUs=" + this.f46193c + ", videoStartPosition=" + this.f46194d + ", videoSize=" + this.f46195e;
    }
}
