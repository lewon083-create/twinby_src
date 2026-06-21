package g0;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f19539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f19541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0.i0 f19542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f19543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v0 f19544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Range f19546h;
    public final boolean i;

    public e(p2 p2Var, int i, Size size, a0.i0 i0Var, List list, v0 v0Var, int i10, Range range, boolean z5) {
        this.f19539a = p2Var;
        this.f19540b = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f19541c = size;
        if (i0Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f19542d = i0Var;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f19543e = list;
        this.f19544f = v0Var;
        this.f19545g = i10;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.f19546h = range;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        v0 v0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            v0 v0Var2 = eVar.f19544f;
            if (this.f19539a.equals(eVar.f19539a) && this.f19540b == eVar.f19540b && this.f19541c.equals(eVar.f19541c) && this.f19542d.equals(eVar.f19542d) && this.f19543e.equals(eVar.f19543e) && ((v0Var = this.f19544f) != null ? v0Var.equals(v0Var2) : v0Var2 == null) && this.f19545g == eVar.f19545g && this.f19546h.equals(eVar.f19546h) && this.i == eVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f19539a.hashCode() ^ 1000003) * 1000003) ^ this.f19540b) * 1000003) ^ this.f19541c.hashCode()) * 1000003) ^ this.f19542d.hashCode()) * 1000003) ^ this.f19543e.hashCode()) * 1000003;
        v0 v0Var = this.f19544f;
        return ((((((iHashCode ^ (v0Var == null ? 0 : v0Var.hashCode())) * 1000003) ^ this.f19545g) * 1000003) ^ this.f19546h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f19539a + ", imageFormat=" + this.f19540b + ", size=" + this.f19541c + ", dynamicRange=" + this.f19542d + ", captureTypes=" + this.f19543e + ", implementationOptions=" + this.f19544f + ", sessionType=" + this.f19545g + ", targetFrameRate=" + this.f19546h + ", strictFrameRateRequired=" + this.i + "}";
    }
}
