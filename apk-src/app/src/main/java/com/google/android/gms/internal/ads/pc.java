package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pc f9009d = new pc(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9012c;

    static {
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public pc(float f10, float f11) {
        ix.o(f10 > 0.0f);
        ix.o(f11 > 0.0f);
        this.f9010a = f10;
        this.f9011b = f11;
        this.f9012c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pc.class == obj.getClass()) {
            pc pcVar = (pc) obj;
            if (this.f9010a == pcVar.f9010a && this.f9011b == pcVar.f9011b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f9011b) + ((Float.floatToRawIntBits(this.f9010a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f9010a), Float.valueOf(this.f9011b)};
        String str = cq0.f4293a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
