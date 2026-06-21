package yads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ge2 implements xq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ge2 f38744e = new ge2(1.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f38746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38747d;

    public ge2(float f10, float f11) {
        ni.a(f10 > 0.0f);
        ni.a(f11 > 0.0f);
        this.f38745b = f10;
        this.f38746c = f11;
        this.f38747d = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ge2.class == obj.getClass()) {
            ge2 ge2Var = (ge2) obj;
            if (this.f38745b == ge2Var.f38745b && this.f38746c == ge2Var.f38746c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f38746c) + ((Float.floatToRawIntBits(this.f38745b) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f38745b), Float.valueOf(this.f38746c)};
        int i = lb3.f40466a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
