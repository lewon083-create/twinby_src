package fd;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16747c;

    public a(long j10, long j11, long j12) {
        this.f16745a = j10;
        this.f16746b = j11;
        this.f16747c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f16745a == aVar.f16745a && this.f16746b == aVar.f16746b && this.f16747c == aVar.f16747c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f16745a;
        long j11 = this.f16746b;
        int i = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f16747c;
        return i ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f16745a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f16746b);
        sb2.append(", uptimeMillis=");
        return pe.a.h(sb2, this.f16747c, "}");
    }
}
