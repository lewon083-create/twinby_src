package f2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f16571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f16572b;

    public e(float f10, float f11) {
        g.c(f10, "width");
        this.f16571a = f10;
        g.c(f11, "height");
        this.f16572b = f11;
    }

    public float a() {
        return this.f16572b;
    }

    public float b() {
        return this.f16571a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f16571a == this.f16571a && eVar.f16572b == this.f16572b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f16571a) ^ Float.floatToIntBits(this.f16572b);
    }

    public String toString() {
        return this.f16571a + "x" + this.f16572b;
    }
}
