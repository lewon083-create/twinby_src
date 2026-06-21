package yads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f37423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl f37424b;

    public cl(Handler handler, xn0 xn0Var) {
        this.f37423a = (Handler) ni.a(handler);
        this.f37424b = xn0Var;
    }

    public final void a(Exception exc) {
        Handler handler = this.f37423a;
        if (handler != null) {
            handler.post(new zl.d(this, exc, 1));
        }
    }

    public final void b(Exception exc) {
        Handler handler = this.f37423a;
        if (handler != null) {
            handler.post(new zl.d(this, exc, 0));
        }
    }

    public final void c(Exception exc) {
        dl dlVar = this.f37424b;
        int i = lb3.f40466a;
        ((kb0) ((xn0) dlVar).f44771a.f36809o).a(exc);
    }

    public final void d(Exception exc) {
        dl dlVar = this.f37424b;
        int i = lb3.f40466a;
        ((kb0) ((xn0) dlVar).f44771a.f36809o).b(exc);
    }

    public final void a(String str, long j10, long j11) {
        Handler handler = this.f37423a;
        if (handler != null) {
            handler.post(new zl.f(this, str, j10, j11, 0));
        }
    }

    public final void b(pa0 pa0Var) {
        Handler handler = this.f37423a;
        if (handler != null) {
            handler.post(new zl.e(this, pa0Var, 1));
        }
    }

    public final void a(String str) {
        Handler handler = this.f37423a;
        if (handler != null) {
            handler.post(new t.v0(22, this, str));
        }
    }

    public final void b(String str, long j10, long j11) {
        dl dlVar = this.f37424b;
        int i = lb3.f40466a;
        ((kb0) ((xn0) dlVar).f44771a.f36809o).a(str, j10, j11);
    }

    public final void c(pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        dl dlVar = this.f37424b;
        int i = lb3.f40466a;
        xn0 xn0Var = (xn0) dlVar;
        ((kb0) xn0Var.f44771a.f36809o).a(pa0Var);
        xn0Var.f44771a.getClass();
        xn0Var.f44771a.getClass();
    }

    public final void d(pa0 pa0Var) {
        dl dlVar = this.f37424b;
        int i = lb3.f40466a;
        xn0 xn0Var = (xn0) dlVar;
        xn0Var.f44771a.getClass();
        ((kb0) xn0Var.f44771a.f36809o).b(pa0Var);
    }

    public final void a(pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        Handler handler = this.f37423a;
        if (handler != null) {
            handler.post(new zl.e(this, pa0Var, 0));
        }
    }

    public final void b(String str) {
        dl dlVar = this.f37424b;
        int i = lb3.f40466a;
        ((kb0) ((xn0) dlVar).f44771a.f36809o).a(str);
    }

    public final void a(nx0 nx0Var, va0 va0Var) {
        Handler handler = this.f37423a;
        if (handler != null) {
            handler.post(new q0.o(this, nx0Var, va0Var, 16));
        }
    }

    public final void a(long j10) {
        dl dlVar = this.f37424b;
        int i = lb3.f40466a;
        ((kb0) ((xn0) dlVar).f44771a.f36809o).a(j10);
    }

    public final void b(nx0 nx0Var, va0 va0Var) {
        dl dlVar = this.f37424b;
        int i = lb3.f40466a;
        dlVar.getClass();
        xn0 xn0Var = (xn0) this.f37424b;
        xn0Var.f44771a.getClass();
        ((kb0) xn0Var.f44771a.f36809o).a(nx0Var, va0Var);
    }

    public final void a(boolean z5) {
        dl dlVar = this.f37424b;
        int i = lb3.f40466a;
        ((xn0) dlVar).a(z5);
    }

    public final void a(int i, long j10, long j11) {
        dl dlVar = this.f37424b;
        int i10 = lb3.f40466a;
        ((kb0) ((xn0) dlVar).f44771a.f36809o).a(i, j10, j11);
    }

    public final void b(long j10) {
        Handler handler = this.f37423a;
        if (handler != null) {
            handler.post(new e1.q(this, j10, 2));
        }
    }

    public final void b(boolean z5) {
        Handler handler = this.f37423a;
        if (handler != null) {
            handler.post(new a1.b(7, this, z5));
        }
    }

    public final void b(int i, long j10, long j11) {
        Handler handler = this.f37423a;
        if (handler != null) {
            handler.post(new m4.b(this, i, j10, j11, 1));
        }
    }
}
