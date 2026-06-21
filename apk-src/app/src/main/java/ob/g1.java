package ob;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1 f30127e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, Runnable runnable, boolean z5, String str) {
        super(runnable, null);
        this.f30127e = i1Var;
        long andIncrement = i1.f30180l.getAndIncrement();
        this.f30124b = andIncrement;
        this.f30126d = str;
        this.f30125c = z5;
        if (andIncrement == Long.MAX_VALUE) {
            s0 s0Var = ((l1) i1Var.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30411g.f("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g1 g1Var = (g1) obj;
        boolean z5 = g1Var.f30125c;
        boolean z10 = this.f30125c;
        if (z10 != z5) {
            return !z10 ? 1 : -1;
        }
        long j10 = g1Var.f30124b;
        long j11 = this.f30124b;
        if (j11 < j10) {
            return -1;
        }
        if (j11 > j10) {
            return 1;
        }
        s0 s0Var = ((l1) this.f30127e.f15951b).f30265g;
        l1.k(s0Var);
        s0Var.f30412h.g(Long.valueOf(j11), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        s0 s0Var = ((l1) this.f30127e.f15951b).f30265g;
        l1.k(s0Var);
        s0Var.f30411g.g(th2, this.f30126d);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, Callable callable, boolean z5) {
        super(callable);
        this.f30127e = i1Var;
        long andIncrement = i1.f30180l.getAndIncrement();
        this.f30124b = andIncrement;
        this.f30126d = "Task exception on worker thread";
        this.f30125c = z5;
        if (andIncrement == Long.MAX_VALUE) {
            s0 s0Var = ((l1) i1Var.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30411g.f("Tasks index overflow");
        }
    }
}
