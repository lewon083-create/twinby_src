package l0;

import a0.r2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f27707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f27708d;

    public a(float f10, float f11, float f12, float f13) {
        this.f27705a = f10;
        this.f27706b = f11;
        this.f27707c = f12;
        this.f27708d = f13;
    }

    public static a e(r2 r2Var) {
        return new a(r2Var.c(), r2Var.a(), r2Var.b(), r2Var.d());
    }

    @Override // a0.r2
    public final float a() {
        return this.f27706b;
    }

    @Override // a0.r2
    public final float b() {
        return this.f27707c;
    }

    @Override // a0.r2
    public final float c() {
        return this.f27705a;
    }

    @Override // a0.r2
    public final float d() {
        return this.f27708d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Float.floatToIntBits(this.f27705a) == Float.floatToIntBits(aVar.f27705a) && Float.floatToIntBits(this.f27706b) == Float.floatToIntBits(aVar.f27706b) && Float.floatToIntBits(this.f27707c) == Float.floatToIntBits(aVar.f27707c) && Float.floatToIntBits(this.f27708d) == Float.floatToIntBits(aVar.f27708d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f27705a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f27706b)) * 1000003) ^ Float.floatToIntBits(this.f27707c)) * 1000003) ^ Float.floatToIntBits(this.f27708d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f27705a + ", maxZoomRatio=" + this.f27706b + ", minZoomRatio=" + this.f27707c + ", linearZoom=" + this.f27708d + "}";
    }
}
