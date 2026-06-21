package q0;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import g0.f0;
import i0.q;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import m3.c0;
import ni.x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Surface f31609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f31611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f31612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f31613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f2.a f31614h;
    public Executor i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j1.k f31617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j1.h f31618m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f31608b = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31615j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f31616k = false;

    public n(Surface surface, int i, Size size, a0.j jVar, a0.j jVar2) {
        float[] fArr = new float[16];
        this.f31612f = fArr;
        float[] fArr2 = new float[16];
        this.f31613g = fArr2;
        this.f31609c = surface;
        this.f31610d = i;
        this.f31611e = size;
        a(fArr, new float[16], jVar);
        a(fArr2, new float[16], jVar2);
        this.f31617l = i0.o.w(new x0(25, this));
    }

    public static void a(float[] fArr, float[] fArr2, a0.j jVar) {
        Matrix.setIdentityM(fArr, 0);
        if (jVar == null) {
            return;
        }
        Size size = jVar.f127a;
        boolean z5 = jVar.f131e;
        int i = jVar.f130d;
        com.google.android.gms.internal.auth.m.r(fArr);
        com.google.android.gms.internal.auth.m.q(fArr, i);
        if (z5) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        android.graphics.Matrix matrixA = q.a(q.j(size), q.j(q.i(size, i)), i, z5);
        RectF rectF = new RectF(jVar.f128b);
        matrixA.mapRect(rectF);
        float width = rectF.left / r7.getWidth();
        float height = ((r7.getHeight() - rectF.height()) - rectF.top) / r7.getHeight();
        float fWidth = rectF.width() / r7.getWidth();
        float fHeight = rectF.height() / r7.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        f0 f0Var = jVar.f129c;
        Matrix.setIdentityM(fArr2, 0);
        com.google.android.gms.internal.auth.m.r(fArr2);
        if (f0Var != null) {
            f2.g.h("Camera has no transform.", f0Var.n());
            com.google.android.gms.internal.auth.m.q(fArr2, f0Var.b().c());
            if (f0Var.f()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public final Surface b(j0.d dVar, f2.a aVar) {
        boolean z5;
        synchronized (this.f31608b) {
            this.i = dVar;
            this.f31614h = aVar;
            z5 = this.f31615j;
        }
        if (z5) {
            d();
        }
        return this.f31609c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f31608b) {
            try {
                if (!this.f31616k) {
                    this.f31616k = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f31618m.b(null);
    }

    public final void d() {
        Executor executor;
        f2.a aVar;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f31608b) {
            try {
                if (this.i == null || (aVar = this.f31614h) == null) {
                    this.f31615j = true;
                } else if (!this.f31616k) {
                    atomicReference.set(aVar);
                    executor = this.i;
                    this.f31615j = false;
                }
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new c0(17, this, atomicReference));
            } catch (RejectedExecutionException e3) {
                com.google.android.gms.internal.auth.g.f("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e3);
            }
        }
    }
}
