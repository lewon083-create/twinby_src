package g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements x2, i1, l0.l {
    public static final g M = new g("camerax.core.imageAnalysis.backpressureStrategy", a0.s0.class, null);
    public static final g N = new g("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE, null);
    public static final g O = new g("camerax.core.imageAnalysis.imageReaderProxyProvider", a0.s1.class, null);
    public static final g P = new g("camerax.core.imageAnalysis.outputImageFormat", a0.v0.class, null);
    public static final g Q = new g("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class, null);
    public static final g R = new g("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class, null);
    public final u1 L;

    public f1(u1 u1Var) {
        this.L = u1Var;
    }

    @Override // g0.b2
    public final v0 getConfig() {
        return this.L;
    }

    @Override // g0.h1
    public final int k() {
        return 35;
    }
}
