package yads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f38463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gj3 f38464b;

    public fj3(Handler handler, xn0 xn0Var) {
        this.f38463a = (Handler) ni.a(handler);
        this.f38464b = xn0Var;
    }

    public final void a(String str, long j10, long j11) {
        Handler handler = this.f38463a;
        if (handler != null) {
            handler.post(new zl.f(this, str, j10, j11, 1));
        }
    }

    public final void b(pa0 pa0Var) {
        Handler handler = this.f38463a;
        if (handler != null) {
            handler.post(new zl.m(this, pa0Var, 1));
        }
    }

    public final void c(pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        gj3 gj3Var = this.f38464b;
        int i = lb3.f40466a;
        xn0 xn0Var = (xn0) gj3Var;
        ((kb0) xn0Var.f44771a.f36809o).c(pa0Var);
        xn0Var.f44771a.getClass();
        xn0Var.f44771a.getClass();
    }

    public final void d(pa0 pa0Var) {
        gj3 gj3Var = this.f38464b;
        int i = lb3.f40466a;
        xn0 xn0Var = (xn0) gj3Var;
        xn0Var.f44771a.getClass();
        ((kb0) xn0Var.f44771a.f36809o).d(pa0Var);
    }

    public final void a(String str) {
        Handler handler = this.f38463a;
        if (handler != null) {
            handler.post(new zl.n(0, this, str));
        }
    }

    public final void b(String str, long j10, long j11) {
        gj3 gj3Var = this.f38464b;
        int i = lb3.f40466a;
        ((kb0) ((xn0) gj3Var).f44771a.f36809o).b(str, j10, j11);
    }

    public final void a(pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        Handler handler = this.f38463a;
        if (handler != null) {
            handler.post(new zl.m(this, pa0Var, 0));
        }
    }

    public final void b(String str) {
        gj3 gj3Var = this.f38464b;
        int i = lb3.f40466a;
        ((kb0) ((xn0) gj3Var).f44771a.f36809o).b(str);
    }

    public final void a(int i, long j10) {
        Handler handler = this.f38463a;
        if (handler != null) {
            handler.post(new zl.l(this, i, j10));
        }
    }

    public final void c(int i, long j10) {
        Handler handler = this.f38463a;
        if (handler != null) {
            handler.post(new zl.l(this, i, 1, j10));
        }
    }

    public final void a(nx0 nx0Var, va0 va0Var) {
        Handler handler = this.f38463a;
        if (handler != null) {
            handler.post(new q0.o(this, nx0Var, va0Var, 20));
        }
    }

    public final void b(int i, long j10) {
        gj3 gj3Var = this.f38464b;
        int i10 = lb3.f40466a;
        ((kb0) ((xn0) gj3Var).f44771a.f36809o).a(i, j10);
    }

    public final void a(Object obj, long j10) {
        gj3 gj3Var = this.f38464b;
        int i = lb3.f40466a;
        ((xn0) gj3Var).a(obj, j10);
    }

    public final void a(long j10, int i) {
        gj3 gj3Var = this.f38464b;
        int i10 = lb3.f40466a;
        ((kb0) ((xn0) gj3Var).f44771a.f36809o).b(i, j10);
    }

    public final void b(nx0 nx0Var, va0 va0Var) {
        gj3 gj3Var = this.f38464b;
        int i = lb3.f40466a;
        gj3Var.getClass();
        xn0 xn0Var = (xn0) this.f38464b;
        xn0Var.f44771a.getClass();
        ((kb0) xn0Var.f44771a.f36809o).b(nx0Var, va0Var);
    }

    public final void a(Exception exc) {
        gj3 gj3Var = this.f38464b;
        int i = lb3.f40466a;
        ((kb0) ((xn0) gj3Var).f44771a.f36809o).c(exc);
    }

    public final void b(Exception exc) {
        Handler handler = this.f38463a;
        if (handler != null) {
            handler.post(new zl.n(1, this, exc));
        }
    }

    public final void a(rj3 rj3Var) {
        gj3 gj3Var = this.f38464b;
        int i = lb3.f40466a;
        ((xn0) gj3Var).a(rj3Var);
    }

    public final void b(rj3 rj3Var) {
        Handler handler = this.f38463a;
        if (handler != null) {
            handler.post(new t.v0(29, this, rj3Var));
        }
    }

    public final void a(Surface surface) {
        if (this.f38463a != null) {
            this.f38463a.post(new io.sentry.android.core.n(this, surface, SystemClock.elapsedRealtime(), 4));
        }
    }
}
