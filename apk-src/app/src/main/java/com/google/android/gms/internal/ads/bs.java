package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bs {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bs f3859d = new bs(1.0f, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3862c;

    static {
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public bs(float f10, int i, int i10) {
        this.f3860a = i;
        this.f3861b = i10;
        this.f3862c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bs) {
            bs bsVar = (bs) obj;
            if (this.f3860a == bsVar.f3860a && this.f3861b == bsVar.f3861b && this.f3862c == bsVar.f3862c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3862c) + ((((this.f3860a + 217) * 31) + this.f3861b) * 31);
    }
}
