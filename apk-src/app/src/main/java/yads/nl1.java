package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41287c;

    public nl1(int i, int i10, int i11) {
        this.f41285a = i;
        this.f41286b = i10;
        this.f41287c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl1)) {
            return false;
        }
        nl1 nl1Var = (nl1) obj;
        return this.f41285a == nl1Var.f41285a && this.f41286b == nl1Var.f41286b && this.f41287c == nl1Var.f41287c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41287c) + qd3.a(this.f41286b, Integer.hashCode(this.f41285a) * 31, 31);
    }

    public final String toString() {
        return t.z.d(this.f41287c, ")", t.z.i("MediaFileInfo(width=", this.f41285a, ", height=", this.f41286b, ", bitrate="));
    }
}
