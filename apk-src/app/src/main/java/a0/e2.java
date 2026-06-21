package a0;

import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements g0.k1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0.k1 f71e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Surface f72f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n0 f73g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f68b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f70d = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c1 f74h = new c1(1, this);

    public e2(g0.k1 k1Var) {
        this.f71e = k1Var;
        this.f72f = k1Var.getSurface();
    }

    public final void a() {
        synchronized (this.f68b) {
            try {
                this.f70d = true;
                this.f71e.h();
                if (this.f69c == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.k1
    public final r1 acquireLatestImage() {
        e1 e1Var;
        synchronized (this.f68b) {
            r1 r1VarAcquireLatestImage = this.f71e.acquireLatestImage();
            if (r1VarAcquireLatestImage != null) {
                this.f69c++;
                e1Var = new e1(r1VarAcquireLatestImage);
                e1Var.a(this.f74h);
            } else {
                e1Var = null;
            }
        }
        return e1Var;
    }

    @Override // g0.k1
    public final void c(g0.j1 j1Var, Executor executor) {
        synchronized (this.f68b) {
            this.f71e.c(new y(1, this, j1Var), executor);
        }
    }

    @Override // g0.k1
    public final void close() {
        synchronized (this.f68b) {
            try {
                Surface surface = this.f72f;
                if (surface != null) {
                    surface.release();
                }
                this.f71e.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.k1
    public final int e() {
        int iE;
        synchronized (this.f68b) {
            iE = this.f71e.e();
        }
        return iE;
    }

    @Override // g0.k1
    public final int getHeight() {
        int height;
        synchronized (this.f68b) {
            height = this.f71e.getHeight();
        }
        return height;
    }

    @Override // g0.k1
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f68b) {
            surface = this.f71e.getSurface();
        }
        return surface;
    }

    @Override // g0.k1
    public final int getWidth() {
        int width;
        synchronized (this.f68b) {
            width = this.f71e.getWidth();
        }
        return width;
    }

    @Override // g0.k1
    public final void h() {
        synchronized (this.f68b) {
            this.f71e.h();
        }
    }

    @Override // g0.k1
    public final int q() {
        int iQ;
        synchronized (this.f68b) {
            iQ = this.f71e.q();
        }
        return iQ;
    }

    @Override // g0.k1
    public final r1 r() {
        e1 e1Var;
        synchronized (this.f68b) {
            r1 r1VarR = this.f71e.r();
            if (r1VarR != null) {
                this.f69c++;
                e1Var = new e1(r1VarR);
                e1Var.a(this.f74h);
            } else {
                e1Var = null;
            }
        }
        return e1Var;
    }
}
