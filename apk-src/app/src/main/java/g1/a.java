package g1;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import g0.a2;
import g0.b1;
import g0.c1;
import g0.d0;
import java.util.HashMap;
import x0.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f19819e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f19820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f19821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f19822d;

    static {
        HashMap map = new HashMap();
        f19819e = map;
        map.put(1, g.f35588j);
        map.put(8, g.f35587h);
        map.put(6, g.f35586g);
        map.put(5, g.f35585f);
        map.put(4, g.f35584e);
        map.put(0, g.i);
    }

    public a(d0 d0Var, b1 b1Var, a2 a2Var) {
        this.f19820b = b1Var;
        this.f19821c = d0Var;
        this.f19822d = a2Var;
    }

    @Override // g0.b1
    public final boolean k(int i) {
        if (!this.f19820b.k(i)) {
            return false;
        }
        g gVar = (g) f19819e.get(Integer.valueOf(i));
        if (gVar == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.f19822d.j(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.c(this.f19821c, gVar) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).a())) {
                return false;
            }
        }
        return true;
    }

    @Override // g0.b1
    public final c1 u(int i) {
        if (k(i)) {
            return this.f19820b.u(i);
        }
        return null;
    }
}
