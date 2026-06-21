package x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f35614c;

    public i(long j10, long j11, b bVar) {
        this.f35612a = j10;
        this.f35613b = j11;
        this.f35614c = bVar;
    }

    public static i a(long j10, long j11, b bVar) {
        f2.g.a("duration must be positive value.", j10 >= 0);
        f2.g.a("bytes must be positive value.", j11 >= 0);
        return new i(j10, j11, bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f35612a == iVar.f35612a && this.f35613b == iVar.f35613b && this.f35614c.equals(iVar.f35614c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f35612a;
        int i = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f35613b;
        return ((i ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f35614c.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f35612a + ", numBytesRecorded=" + this.f35613b + ", audioStats=" + this.f35614c + "}";
    }
}
