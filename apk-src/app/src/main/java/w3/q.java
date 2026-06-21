package w3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35091b;

    public q(long j10, long j11) {
        this.f35090a = j10;
        this.f35091b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f35090a == qVar.f35090a && this.f35091b == qVar.f35091b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f35090a) * 31) + ((int) this.f35091b);
    }
}
