package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wg0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wg0 f44386g = new wg0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f44387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f44388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f44389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f44390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f44391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f44392f;

    public wg0(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f44387a = f10;
        this.f44388b = f11;
        this.f44389c = f12;
        this.f44390d = f13;
        this.f44391e = f14;
        this.f44392f = f15;
    }

    public final float a() {
        return this.f44390d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg0)) {
            return false;
        }
        wg0 wg0Var = (wg0) obj;
        return Float.compare(this.f44387a, wg0Var.f44387a) == 0 && Float.compare(this.f44388b, wg0Var.f44388b) == 0 && Float.compare(this.f44389c, wg0Var.f44389c) == 0 && Float.compare(this.f44390d, wg0Var.f44390d) == 0 && Float.compare(this.f44391e, wg0Var.f44391e) == 0 && Float.compare(this.f44392f, wg0Var.f44392f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f44392f) + l7.o.b(this.f44391e, l7.o.b(this.f44390d, l7.o.b(this.f44389c, l7.o.b(this.f44388b, Float.hashCode(this.f44387a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "DisplayInsetsF(left=" + this.f44387a + ", top=" + this.f44388b + ", right=" + this.f44389c + ", bottom=" + this.f44390d + ", cutoutTop=" + this.f44391e + ", cutoutBottom=" + this.f44392f + ")";
    }
}
