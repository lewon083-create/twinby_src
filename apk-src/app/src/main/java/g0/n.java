package g0;

import android.util.Range;
import android.util.Size;
import m.h3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Range f19676h = new Range(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f19677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f19678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0.i0 f19679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Range f19681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v0 f19682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19683g;

    public n(Size size, Size size2, a0.i0 i0Var, int i, Range range, v0 v0Var, boolean z5) {
        this.f19677a = size;
        this.f19678b = size2;
        this.f19679c = i0Var;
        this.f19680d = i;
        this.f19681e = range;
        this.f19682f = v0Var;
        this.f19683g = z5;
    }

    public static h3 a(Size size) {
        h3 h3Var = new h3();
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        h3Var.f28250b = size;
        h3Var.f28251c = size;
        h3Var.f28253e = 0;
        Range range = f19676h;
        if (range == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        h3Var.f28254f = range;
        h3Var.f28252d = a0.i0.f112d;
        h3Var.f28256h = Boolean.FALSE;
        return h3Var;
    }

    public final h3 b() {
        h3 h3Var = new h3();
        h3Var.f28250b = this.f19677a;
        h3Var.f28251c = this.f19678b;
        h3Var.f28252d = this.f19679c;
        h3Var.f28253e = Integer.valueOf(this.f19680d);
        h3Var.f28254f = this.f19681e;
        h3Var.f28255g = this.f19682f;
        h3Var.f28256h = Boolean.valueOf(this.f19683g);
        return h3Var;
    }

    public final boolean equals(Object obj) {
        v0 v0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            v0 v0Var2 = nVar.f19682f;
            if (this.f19677a.equals(nVar.f19677a) && this.f19678b.equals(nVar.f19678b) && this.f19679c.equals(nVar.f19679c) && this.f19680d == nVar.f19680d && this.f19681e.equals(nVar.f19681e) && ((v0Var = this.f19682f) != null ? v0Var.equals(v0Var2) : v0Var2 == null) && this.f19683g == nVar.f19683g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f19677a.hashCode() ^ 1000003) * 1000003) ^ this.f19678b.hashCode()) * 1000003) ^ this.f19679c.hashCode()) * 1000003) ^ this.f19680d) * 1000003) ^ this.f19681e.hashCode()) * 1000003;
        v0 v0Var = this.f19682f;
        return ((iHashCode ^ (v0Var == null ? 0 : v0Var.hashCode())) * 1000003) ^ (this.f19683g ? 1231 : 1237);
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.f19677a + ", originalConfiguredResolution=" + this.f19678b + ", dynamicRange=" + this.f19679c + ", sessionType=" + this.f19680d + ", expectedFrameRateRange=" + this.f19681e + ", implementationOptions=" + this.f19682f + ", zslDisabled=" + this.f19683g + "}";
    }
}
