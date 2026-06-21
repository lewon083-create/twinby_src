package l4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27810b;

    public a(long j10, long j11) {
        this.f27809a = j10;
        this.f27810b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f27809a == aVar.f27809a && this.f27810b == aVar.f27810b;
    }

    public final int hashCode() {
        return (((int) this.f27809a) * 31) + ((int) this.f27810b);
    }
}
