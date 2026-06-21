package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ig0 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39537d;

    public ig0(int i, int i10, int i11) {
        this.f39535b = i;
        this.f39536c = i10;
        this.f39537d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig0)) {
            return false;
        }
        ig0 ig0Var = (ig0) obj;
        return this.f39535b == ig0Var.f39535b && this.f39536c == ig0Var.f39536c && this.f39537d == ig0Var.f39537d;
    }

    public final int hashCode() {
        return ((((this.f39535b + 527) * 31) + this.f39536c) * 31) + this.f39537d;
    }
}
