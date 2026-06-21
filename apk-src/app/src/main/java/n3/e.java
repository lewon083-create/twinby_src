package n3;

import com.google.android.gms.internal.measurement.h5;
import j3.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f29045b;

    public e(float f10, float f11) {
        h5.g("Invalid latitude or longitude", f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f29044a = f10;
        this.f29045b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f29044a == eVar.f29044a && this.f29045b == eVar.f29045b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f29045b) + l7.o.b(this.f29044a, 527, 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f29044a + ", longitude=" + this.f29045b;
    }
}
