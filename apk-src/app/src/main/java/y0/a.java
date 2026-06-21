package y0;

import e1.i0;
import g0.g;
import g0.i1;
import g0.u1;
import g0.v0;
import g0.x2;
import l0.l;
import x0.m0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements x2, i1, l {
    public static final g M = new g("camerax.video.VideoCapture.videoOutput", m0.class, null);
    public static final g N = new g("camerax.video.VideoCapture.videoEncoderInfoFinder", i0.class, null);
    public static final g O = new g("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class, null);
    public final u1 L;

    public a(u1 u1Var) {
        f2.g.b(u1Var.L.containsKey(M));
        this.L = u1Var;
    }

    @Override // g0.b2
    public final v0 getConfig() {
        return this.L;
    }

    @Override // g0.h1
    public final int k() {
        return 34;
    }
}
