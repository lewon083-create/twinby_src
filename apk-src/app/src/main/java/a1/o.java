package a1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f374b;

    public o(int i, long j10) {
        this.f373a = i;
        this.f374b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f373a == oVar.f373a && this.f374b == oVar.f374b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f373a ^ 1000003) * 1000003;
        long j10 = this.f374b;
        return i ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PacketInfo{sizeInBytes=");
        sb2.append(this.f373a);
        sb2.append(", timestampNs=");
        return pe.a.h(sb2, this.f374b, "}");
    }
}
