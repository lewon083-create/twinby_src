package xc;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36078a;

    public j(long j10) {
        this.f36078a = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof j) && this.f36078a == ((j) obj).f36078a;
    }

    public final int hashCode() {
        long j10 = this.f36078a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ (-724379968);
    }

    public final String toString() {
        return pe.a.h(new StringBuilder("EventRecord{eventType=3, eventTimestamp="), this.f36078a, "}");
    }
}
