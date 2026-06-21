package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rj3 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f42614e;

    public rj3(int i, int i10, int i11, float f10) {
        this.f42611b = i;
        this.f42612c = i10;
        this.f42613d = i11;
        this.f42614e = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rj3) {
            rj3 rj3Var = (rj3) obj;
            if (this.f42611b == rj3Var.f42611b && this.f42612c == rj3Var.f42612c && this.f42613d == rj3Var.f42613d && this.f42614e == rj3Var.f42614e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f42614e) + ((((((this.f42611b + 217) * 31) + this.f42612c) * 31) + this.f42613d) * 31);
    }
}
