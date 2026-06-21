package f9;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y8.j f16703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y8.i f16704c;

    public b(long j10, y8.j jVar, y8.i iVar) {
        this.f16702a = j10;
        this.f16703b = jVar;
        this.f16704c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f16702a == bVar.f16702a && this.f16703b.equals(bVar.f16703b) && this.f16704c.equals(bVar.f16704c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f16702a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f16703b.hashCode()) * 1000003) ^ this.f16704c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f16702a + ", transportContext=" + this.f16703b + ", event=" + this.f16704c + "}";
    }
}
