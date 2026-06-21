package mk;

import com.google.android.gms.internal.ads.om1;
import hk.e0;
import hk.h0;
import hk.m0;
import hk.w1;
import hk.x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends x implements h0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f28916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f28917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f28919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f28920h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(x xVar, int i10) {
        h0 h0Var = xVar instanceof h0 ? (h0) xVar : null;
        this.f28916d = h0Var == null ? e0.f20657a : h0Var;
        this.f28917e = xVar;
        this.f28918f = i10;
        this.f28919g = new k();
        this.f28920h = new Object();
    }

    @Override // hk.h0
    public final m0 h(long j10, w1 w1Var, CoroutineContext coroutineContext) {
        return this.f28916d.h(j10, w1Var, coroutineContext);
    }

    @Override // hk.h0
    public final void i(long j10, hk.l lVar) {
        this.f28916d.i(j10, lVar);
    }

    @Override // hk.x
    public final void j(CoroutineContext coroutineContext, Runnable runnable) {
        this.f28919g.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
        if (atomicIntegerFieldUpdater.get(this) < this.f28918f) {
            synchronized (this.f28920h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f28918f) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM = m();
                if (runnableM == null) {
                    return;
                }
                this.f28917e.j(this, new ed.c(18, this, runnableM, false));
            }
        }
    }

    public final Runnable m() {
        while (true) {
            Runnable runnable = (Runnable) this.f28919g.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f28920h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f28919g.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // hk.x
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f28917e);
        sb2.append(".limitedParallelism(");
        return om1.l(sb2, this.f28918f, ')');
    }
}
