package a0;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.f0 f129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f131e;

    public j(Size size, Rect rect, g0.f0 f0Var, int i, boolean z5) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f127a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f128b = rect;
        this.f129c = f0Var;
        this.f130d = i;
        this.f131e = z5;
    }

    public final boolean equals(Object obj) {
        g0.f0 f0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            g0.f0 f0Var2 = jVar.f129c;
            if (this.f127a.equals(jVar.f127a) && this.f128b.equals(jVar.f128b) && ((f0Var = this.f129c) != null ? f0Var.equals(f0Var2) : f0Var2 == null) && this.f130d == jVar.f130d && this.f131e == jVar.f131e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f127a.hashCode() ^ 1000003) * 1000003) ^ this.f128b.hashCode()) * 1000003;
        g0.f0 f0Var = this.f129c;
        return ((((iHashCode ^ (f0Var == null ? 0 : f0Var.hashCode())) * 1000003) ^ this.f130d) * 1000003) ^ (this.f131e ? 1231 : 1237);
    }

    public final String toString() {
        return "CameraInputInfo{inputSize=" + this.f127a + ", inputCropRect=" + this.f128b + ", cameraInternal=" + this.f129c + ", rotationDegrees=" + this.f130d + ", mirroring=" + this.f131e + "}";
    }
}
