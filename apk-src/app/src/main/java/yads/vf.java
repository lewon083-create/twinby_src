package yads;

import android.os.Looper;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vf {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f44013j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile vf f44014k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f44017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hk.a0 f44018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jf f44019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pf f44020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g63 f44021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x10 f44022h = new x10();
    public final AtomicBoolean i = new AtomicBoolean(false);

    public vf(long j10, long j11, Set set, hk.a0 a0Var, jf jfVar, pf pfVar, g63 g63Var) {
        this.f44015a = j10;
        this.f44016b = j11;
        this.f44017c = set;
        this.f44018d = a0Var;
        this.f44019e = jfVar;
        this.f44020f = pfVar;
        this.f44021g = g63Var;
    }

    public static final void a(vf vfVar) {
        vfVar.f44021g.getClass();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        StackTraceElement[] stackTraceElementArr = allStackTraces.get(Looper.getMainLooper().getThread());
        if (stackTraceElementArr != null) {
            Set set = k33.f40059a;
            if (k33.a(stackTraceElementArr, vfVar.f44017c)) {
                vfVar.f44020f.f41919a.reportAnr(allStackTraces);
            }
        }
    }
}
