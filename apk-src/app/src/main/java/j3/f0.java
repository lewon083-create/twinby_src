package j3;

import com.google.android.gms.internal.measurement.h5;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f26236d = new f0(1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26239c;

    static {
        m3.z.G(0);
        m3.z.G(1);
    }

    public f0(float f10) {
        this(f10, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class == obj.getClass()) {
            f0 f0Var = (f0) obj;
            if (this.f26237a == f0Var.f26237a && this.f26238b == f0Var.f26238b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f26238b) + ((Float.floatToRawIntBits(this.f26237a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f26237a), Float.valueOf(this.f26238b)};
        String str = m3.z.f28608a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public f0(float f10, float f11) {
        h5.h(f10 > 0.0f);
        h5.h(f11 > 0.0f);
        this.f26237a = f10;
        this.f26238b = f11;
        this.f26239c = Math.round(f10 * 1000.0f);
    }
}
