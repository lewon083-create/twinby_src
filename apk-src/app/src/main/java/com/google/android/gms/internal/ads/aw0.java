package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class aw0 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3444b;

    public aw0(float f10, float f11) {
        boolean z5 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z5 = true;
        }
        ix.A("Invalid latitude or longitude", z5);
        this.f3443a = f10;
        this.f3444b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aw0.class == obj.getClass()) {
            aw0 aw0Var = (aw0) obj;
            if (this.f3443a == aw0Var.f3443a && this.f3444b == aw0Var.f3444b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3444b) + ((Float.hashCode(this.f3443a) + 527) * 31);
    }

    public final String toString() {
        float f10 = this.f3443a;
        int length = String.valueOf(f10).length();
        float f11 = this.f3444b;
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(f11).length());
        sb2.append("xyz: latitude=");
        sb2.append(f10);
        sb2.append(", longitude=");
        sb2.append(f11);
        return sb2.toString();
    }
}
