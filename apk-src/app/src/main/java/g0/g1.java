package g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements x2, i1, l0.g {
    public static final g M;
    public static final g N;
    public static final g O;
    public static final g P;
    public static final g Q;
    public static final g R;
    public static final g S;
    public static final g T;
    public static final g U;
    public static final g V;
    public static final g W;
    public final u1 L;

    static {
        Class cls = Integer.TYPE;
        M = new g("camerax.core.imageCapture.captureMode", cls, null);
        N = new g("camerax.core.imageCapture.flashMode", cls, null);
        O = new g("camerax.core.imageCapture.captureBundle", a0.f0.class, null);
        P = new g("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        Q = new g("camerax.core.imageCapture.outputFormat", Integer.class, null);
        R = new g("camerax.core.imageCapture.imageReaderProxyProvider", a0.s1.class, null);
        S = new g("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        T = new g("camerax.core.imageCapture.flashType", cls, null);
        U = new g("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
        V = new g("camerax.core.imageCapture.screenFlash", l0.i.class, null);
        W = new g("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public g1(u1 u1Var) {
        this.L = u1Var;
    }

    @Override // g0.b2
    public final v0 getConfig() {
        return this.L;
    }

    @Override // g0.h1
    public final int k() {
        return ((Integer) a(h1.f19579f)).intValue();
    }
}
