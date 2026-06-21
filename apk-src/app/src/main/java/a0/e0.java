package a0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements l0.k {
    public static final g0.g M = new g0.g("camerax.core.appConfig.cameraFactoryProvider", r.a.class, null);
    public static final g0.g N = new g0.g("camerax.core.appConfig.deviceSurfaceManagerProvider", r.b.class, null);
    public static final g0.g O = new g0.g("camerax.core.appConfig.useCaseConfigFactoryProvider", r.c.class, null);
    public static final g0.g P = new g0.g("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final g0.g Q = new g0.g("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final g0.g R;
    public static final g0.g S;
    public static final g0.g T;
    public static final g0.g U;
    public static final g0.g V;
    public static final g0.g W;
    public static final g0.g X;
    public final g0.u1 L;

    static {
        Class cls = Integer.TYPE;
        R = new g0.g("camerax.core.appConfig.minimumLoggingLevel", cls, null);
        S = new g0.g("camerax.core.appConfig.availableCamerasLimiter", w.class, null);
        T = new g0.g("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
        U = new g0.g("camerax.core.appConfig.cameraProviderInitRetryPolicy", d2.class, null);
        V = new g0.g("camerax.core.appConfig.quirksSettings", g0.x1.class, null);
        W = new g0.g("camerax.core.appConfig.configImplType", cls, null);
        X = new g0.g("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    }

    public e0(g0.u1 u1Var) {
        this.L = u1Var;
    }

    @Override // g0.b2
    public final g0.v0 getConfig() {
        return this.L;
    }

    public final w u() {
        return (w) this.L.g(S, null);
    }

    public final r.a v() {
        return (r.a) this.L.g(M, null);
    }

    public final long w() {
        return ((Long) this.L.g(T, -1L)).longValue();
    }

    public final r.b x() {
        return (r.b) this.L.g(N, null);
    }

    public final r.c y() {
        return (r.c) this.L.g(O, null);
    }
}
