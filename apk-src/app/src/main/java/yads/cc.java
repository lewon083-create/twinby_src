package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37333b;

    public cc(long j10, long j11) {
        this.f37332a = j10;
        this.f37333b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        return this.f37332a == ccVar.f37332a && this.f37333b == ccVar.f37333b;
    }

    public final int hashCode() {
        return (((int) this.f37332a) * 31) + ((int) this.f37333b);
    }
}
