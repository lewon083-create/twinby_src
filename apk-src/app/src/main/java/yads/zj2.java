package yads;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import zl.c1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zj2 implements sj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f45435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u30 f45436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rr f45437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bs f45438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rj0 f45439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile yj2 f45440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f45441g;

    public zj2(hm1 hm1Var, qr qrVar, Executor executor) {
        this.f45435a = (Executor) ni.a(executor);
        ni.a(hm1Var.f39245c);
        u30 u30VarA = new t30().a(hm1Var.f39245c.f37092a).a(hm1Var.f39245c.f37096e).a(4).a();
        this.f45436b = u30VarA;
        rr rrVarA = qrVar.a();
        this.f45437c = rrVarA;
        this.f45438d = new bs(rrVarA, u30VarA, null, new yi.f0(21, this));
    }

    @Override // yads.sj0
    public final void a(rj0 rj0Var) {
        this.f45439e = rj0Var;
        this.f45440f = new yj2(this);
        try {
            if (!this.f45441g) {
                this.f45435a.execute(this.f45440f);
                try {
                    yj2 yj2Var = this.f45440f;
                    yj2Var.f37485c.a();
                    yj2Var.c();
                } catch (ExecutionException e3) {
                    Throwable cause = e3.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i = lb3.f40466a;
                    throw cause;
                }
            }
        } finally {
            this.f45440f.f37485c.b();
        }
    }

    @Override // yads.sj0
    public final void cancel() {
        this.f45441g = true;
        yj2 yj2Var = this.f45440f;
        if (yj2Var != null) {
            yj2Var.cancel(true);
        }
    }

    @Override // yads.sj0
    public final void remove() {
        rr rrVar = this.f45437c;
        nr nrVar = rrVar.f42702a;
        yr yrVar = rrVar.f42706e;
        u30 u30Var = this.f45436b;
        ((c1) yrVar).getClass();
        ((yy2) nrVar).c(yr.b(u30Var));
    }

    public final void a(long j10, long j11, long j12) {
        rj0 rj0Var = this.f45439e;
        if (rj0Var == null) {
            return;
        }
        ((mj0) rj0Var).a(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10);
    }
}
