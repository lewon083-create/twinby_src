package ob;

import java.lang.Thread;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f30108c;

    public f1(i1 i1Var, String str) {
        this.f30108c = i1Var;
        this.f30107b = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        s0 s0Var = ((l1) this.f30108c.f15951b).f30265g;
        l1.k(s0Var);
        s0Var.f30411g.g(th2, this.f30107b);
    }
}
