package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u4 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10814b;

    public u4(float f10, int i) {
        this.f10813a = f10;
        this.f10814b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u4.class == obj.getClass()) {
            u4 u4Var = (u4) obj;
            if (this.f10813a == u4Var.f10813a && this.f10814b == u4Var.f10814b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return l7.o.b(this.f10813a, 527, 31) + this.f10814b;
    }

    public final String toString() {
        float f10 = this.f10813a;
        int length = String.valueOf(f10).length();
        int i = this.f10814b;
        StringBuilder sb2 = new StringBuilder(length + 47 + String.valueOf(i).length());
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i);
        return sb2.toString();
    }
}
