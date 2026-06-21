package a0;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends z0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Executor f78w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f79x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r1 f80y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e1 f81z;

    public f1(Executor executor) {
        this.f78w = executor;
    }

    @Override // a0.z0
    public final r1 b(g0.k1 k1Var) {
        return k1Var.acquireLatestImage();
    }

    @Override // a0.z0
    public final void d() {
        synchronized (this.f79x) {
            try {
                r1 r1Var = this.f80y;
                if (r1Var != null) {
                    r1Var.close();
                    this.f80y = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a0.z0
    public final void f(r1 r1Var) {
        synchronized (this.f79x) {
            try {
                if (!this.f309v) {
                    r1Var.close();
                    return;
                }
                if (this.f81z == null) {
                    e1 e1Var = new e1(r1Var, this);
                    this.f81z = e1Var;
                    k0.j.a(c(e1Var), new b1(0, e1Var), hl.d.j());
                } else {
                    if (r1Var.x().getTimestamp() <= this.f81z.f172c.x().getTimestamp()) {
                        r1Var.close();
                    } else {
                        r1 r1Var2 = this.f80y;
                        if (r1Var2 != null) {
                            r1Var2.close();
                        }
                        this.f80y = r1Var;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
