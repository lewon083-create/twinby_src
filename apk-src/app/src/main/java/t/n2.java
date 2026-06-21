package t;

import a0.r2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f33168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f33169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f33170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f33171d;

    public n2(float f10, float f11) {
        this.f33169b = f10;
        this.f33170c = f11;
    }

    @Override // a0.r2
    public final float a() {
        return this.f33169b;
    }

    @Override // a0.r2
    public final float b() {
        return this.f33170c;
    }

    @Override // a0.r2
    public final float c() {
        return this.f33168a;
    }

    @Override // a0.r2
    public final float d() {
        return this.f33171d;
    }

    public final void e(float f10) {
        float f11 = this.f33169b;
        float f12 = this.f33170c;
        if (f10 > f11 || f10 < f12) {
            throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + f12 + " , " + f11 + "]");
        }
        this.f33168a = f10;
        float f13 = 0.0f;
        if (f11 != f12) {
            if (f10 == f11) {
                f13 = 1.0f;
            } else if (f10 != f12) {
                float f14 = 1.0f / f12;
                f13 = ((1.0f / f10) - f14) / ((1.0f / f11) - f14);
            }
        }
        this.f33171d = f13;
    }
}
