package g0;

import android.util.Range;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface x2 extends l0.k, h1 {
    public static final g A;
    public static final g B;
    public static final g C;
    public static final g D;
    public static final g E;
    public static final g F;
    public static final g G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f19797s = new g("camerax.core.useCase.defaultSessionConfig", h2.class, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f19798t = new g("camerax.core.useCase.defaultCaptureConfig", s0.class, null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g f19799u = new g("camerax.core.useCase.sessionConfigUnpacker", t.x0.class, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f19800v = new g("camerax.core.useCase.captureConfigUnpacker", t.g0.class, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g f19801w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f19802x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final g f19803y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final g f19804z;

    static {
        Class cls = Integer.TYPE;
        f19801w = new g("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        f19802x = new g("camerax.core.useCase.sessionType", cls, null);
        f19803y = new g("camerax.core.useCase.targetFrameRate", Range.class, null);
        f19804z = new g("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        Class cls2 = Boolean.TYPE;
        A = new g("camerax.core.useCase.zslDisabled", cls2, null);
        B = new g("camerax.core.useCase.highResolutionDisabled", cls2, null);
        C = new g("camerax.core.useCase.captureType", z2.class, null);
        D = new g("camerax.core.useCase.previewStabilizationMode", cls, null);
        E = new g("camerax.core.useCase.videoStabilizationMode", cls, null);
        F = new g("camerax.core.useCase.takePictureManagerProvider", v2.class, null);
        G = new g("camerax.core.useCase.streamUseCase", k2.class, null);
    }

    default k2 m() {
        k2 k2Var = (k2) g(G, k2.f19634c);
        Objects.requireNonNull(k2Var);
        return k2Var;
    }

    default z2 n() {
        return (z2) a(C);
    }

    default int o() {
        return ((Integer) g(E, 0)).intValue();
    }

    default int q() {
        return ((Integer) g(D, 0)).intValue();
    }
}
