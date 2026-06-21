package q4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f31763c = new u(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31765b;

    public u(long j10, long j11) {
        this.f31764a = j10;
        this.f31765b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f31764a == uVar.f31764a && this.f31765b == uVar.f31765b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f31764a) * 31) + ((int) this.f31765b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f31764a);
        sb2.append(", position=");
        return pe.a.h(sb2, this.f31765b, "]");
    }
}
