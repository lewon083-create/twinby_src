package q0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import g0.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.g f31550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f31552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f31553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f31555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f31556h;

    public b(Object obj, i0.g gVar, int i, Size size, Rect rect, int i10, Matrix matrix, v vVar) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f31549a = obj;
        this.f31550b = gVar;
        this.f31551c = i;
        this.f31552d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f31553e = rect;
        this.f31554f = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f31555g = matrix;
        if (vVar == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f31556h = vVar;
    }

    public final boolean equals(Object obj) {
        i0.g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            i0.g gVar2 = bVar.f31550b;
            if (this.f31549a.equals(bVar.f31549a) && ((gVar = this.f31550b) != null ? gVar.equals(gVar2) : gVar2 == null) && this.f31551c == bVar.f31551c && this.f31552d.equals(bVar.f31552d) && this.f31553e.equals(bVar.f31553e) && this.f31554f == bVar.f31554f && this.f31555g.equals(bVar.f31555g) && this.f31556h.equals(bVar.f31556h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f31549a.hashCode() ^ 1000003) * 1000003;
        i0.g gVar = this.f31550b;
        return ((((((((((((iHashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003) ^ this.f31551c) * 1000003) ^ this.f31552d.hashCode()) * 1000003) ^ this.f31553e.hashCode()) * 1000003) ^ this.f31554f) * 1000003) ^ this.f31555g.hashCode()) * 1000003) ^ this.f31556h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.f31549a + ", exif=" + this.f31550b + ", format=" + this.f31551c + ", size=" + this.f31552d + ", cropRect=" + this.f31553e + ", rotationDegrees=" + this.f31554f + ", sensorToBufferTransform=" + this.f31555g + ", cameraCaptureResult=" + this.f31556h + "}";
    }
}
