package ok;

import java.util.concurrent.TimeUnit;
import mk.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f30731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f30732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f30733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f30734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f30735f;

    static {
        String property;
        int i = t.f28940a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f30730a = property;
        f30731b = mk.a.h("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = t.f28940a;
        if (i10 < 2) {
            i10 = 2;
        }
        f30732c = mk.a.i(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f30733d = mk.a.i(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f30734e = TimeUnit.SECONDS.toNanos(mk.a.h("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f30735f = g.f30725a;
    }
}
