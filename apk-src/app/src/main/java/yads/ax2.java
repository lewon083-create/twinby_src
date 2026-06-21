package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ax2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ax2 f36874c = new ax2(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36876b;

    public ax2(long j10, long j11) {
        this.f36875a = j10;
        this.f36876b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ax2.class == obj.getClass()) {
            ax2 ax2Var = (ax2) obj;
            if (this.f36875a == ax2Var.f36875a && this.f36876b == ax2Var.f36876b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f36875a) * 31) + ((int) this.f36876b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f36875a);
        sb2.append(", position=");
        return pe.a.h(sb2, this.f36876b, "]");
    }
}
