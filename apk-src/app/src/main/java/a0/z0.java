package a0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 implements g0.j1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f292d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f296h;
    public e2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageWriter f297j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ByteBuffer f303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ByteBuffer f305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ByteBuffer f306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ByteBuffer f307t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f293e = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f298k = new Rect();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect f299l = new Rect();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Matrix f300m = new Matrix();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Matrix f301n = new Matrix();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f308u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f309v = true;

    @Override // g0.j1
    public final void a(g0.k1 k1Var) {
        try {
            r1 r1VarB = b(k1Var);
            if (r1VarB != null) {
                f(r1VarB);
            }
        } catch (IllegalStateException e3) {
            com.google.android.gms.internal.auth.g.l("ImageAnalysisAnalyzer", "Failed to acquire image.", e3);
        }
    }

    public abstract r1 b(g0.k1 k1Var);

    public final ed.d c(final r1 r1Var) throws Throwable {
        Object obj;
        final Executor executor;
        final r0 r0Var;
        boolean z5;
        e2 e2Var;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        e1 e1VarJ;
        e1 e1Var;
        int i = this.f294f ? this.f291c : 0;
        Object obj2 = this.f308u;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f296h;
                    r0Var = this.f290b;
                    z5 = this.f294f && i != this.f292d;
                    if (z5) {
                        h(r1Var, i);
                    }
                    if (this.f294f || this.f293e == 3) {
                        e(r1Var);
                    }
                    try {
                        e2Var = this.i;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
                try {
                    imageWriter = this.f297j;
                    byteBuffer = this.f302o;
                    byteBuffer2 = this.f303p;
                    byteBuffer3 = this.f304q;
                    byteBuffer4 = this.f305r;
                    byteBuffer5 = this.f306s;
                    byteBuffer6 = this.f307t;
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (r0Var == null || executor == null || !this.f309v) {
            return new k0.l(1, new c2.i("No analyzer or executor currently set."));
        }
        if (e2Var != null) {
            if (this.f293e == 2) {
                e1VarJ = ImageProcessingUtil.d(r1Var, e2Var, byteBuffer, i, this.f295g);
            } else {
                if (this.f293e == 1) {
                    if (this.f295g) {
                        ImageProcessingUtil.a(r1Var);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        e1VarJ = ImageProcessingUtil.i(r1Var, e2Var, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                e1Var = null;
            }
            e1Var = e1VarJ;
        } else {
            if (this.f293e == 3) {
                if (this.f295g) {
                    ImageProcessingUtil.a(r1Var);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    e1VarJ = ImageProcessingUtil.j(r1Var, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i);
                    e1Var = e1VarJ;
                }
            }
            e1Var = null;
        }
        boolean z10 = e1Var == null;
        final r1 r1Var2 = z10 ? r1Var : e1Var;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f308u) {
            if (z5 && !z10) {
                try {
                    g(r1Var.getWidth(), r1Var.getHeight(), r1Var2.getWidth(), r1Var2.getHeight());
                } finally {
                }
            }
            this.f292d = i;
            rect.set(this.f299l);
            matrix.set(this.f301n);
        }
        return i0.o.w(new j1.i() { // from class: a0.x0
            @Override // j1.i
            public final Object m(final j1.h hVar) {
                final z0 z0Var = this.f262b;
                final r1 r1Var3 = r1Var;
                final Matrix matrix2 = matrix;
                final r1 r1Var4 = r1Var2;
                final Rect rect2 = rect;
                final r0 r0Var2 = r0Var;
                executor.execute(new Runnable() { // from class: a0.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        z0 z0Var2 = z0Var;
                        r1 r1Var5 = r1Var3;
                        Matrix matrix3 = matrix2;
                        r1 r1Var6 = r1Var4;
                        Rect rect3 = rect2;
                        r0 r0Var3 = r0Var2;
                        j1.h hVar2 = hVar;
                        if (!z0Var2.f309v) {
                            hVar2.d(new c2.i("ImageAnalysis is detached"));
                            return;
                        }
                        g2 g2Var = new g2(r1Var6, null, new h(r1Var5.x().c(), r1Var5.x().getTimestamp(), z0Var2.f294f ? 0 : z0Var2.f291c, matrix3, r1Var5.x().d()));
                        if (!rect3.isEmpty()) {
                            g2Var.b(rect3);
                        }
                        r0Var3.a(g2Var);
                        hVar2.b(null);
                    }
                });
                return "analyzeImage";
            }
        });
    }

    public abstract void d();

    public final void e(r1 r1Var) {
        if (this.f293e != 1 && this.f293e != 3) {
            if (this.f293e == 2 && this.f302o == null) {
                this.f302o = ByteBuffer.allocateDirect(r1Var.getHeight() * r1Var.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.f303p == null) {
            this.f303p = ByteBuffer.allocateDirect(r1Var.getHeight() * r1Var.getWidth());
        }
        this.f303p.position(0);
        if (this.f304q == null) {
            this.f304q = ByteBuffer.allocateDirect((r1Var.getHeight() * r1Var.getWidth()) / 4);
        }
        this.f304q.position(0);
        if (this.f305r == null) {
            this.f305r = ByteBuffer.allocateDirect((r1Var.getHeight() * r1Var.getWidth()) / 4);
        }
        this.f305r.position(0);
        if (this.f293e == 3) {
            if (this.f306s == null) {
                this.f306s = ByteBuffer.allocateDirect(r1Var.getHeight() * r1Var.getWidth());
            }
            this.f306s.position(0);
            if (this.f307t == null) {
                this.f307t = ByteBuffer.allocateDirect((r1Var.getHeight() * r1Var.getWidth()) / 2);
            }
            this.f307t.position(0);
        }
    }

    public abstract void f(r1 r1Var);

    public final void g(int i, int i10, int i11, int i12) {
        int i13 = this.f291c;
        Matrix matrix = new Matrix();
        if (i13 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i10);
            RectF rectF2 = i0.q.f20812a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i13);
            RectF rectF3 = new RectF(0.0f, 0.0f, i11, i12);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f298k);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f299l = rect;
        this.f301n.setConcat(this.f300m, matrix);
    }

    public final void h(r1 r1Var, int i) {
        e2 e2Var = this.i;
        if (e2Var == null) {
            return;
        }
        e2Var.a();
        int width = r1Var.getWidth();
        int height = r1Var.getHeight();
        int iE = this.i.e();
        int iQ = this.i.q();
        boolean z5 = i == 90 || i == 270;
        int i10 = z5 ? height : width;
        if (!z5) {
            width = height;
        }
        this.i = new e2(e.e(i10, width, iE, iQ));
        if (this.f293e == 1) {
            ImageWriter imageWriter = this.f297j;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.f297j = ImageWriter.newInstance(this.i.getSurface(), this.i.q());
        }
    }

    public final void i(Executor executor, r0 r0Var) {
        if (r0Var == null) {
            d();
        }
        synchronized (this.f308u) {
            this.f290b = r0Var;
            this.f296h = executor;
        }
    }

    public final void j(Matrix matrix) {
        synchronized (this.f308u) {
            this.f300m = matrix;
            this.f301n = new Matrix(this.f300m);
        }
    }

    public final void k(Rect rect) {
        synchronized (this.f308u) {
            this.f298k = rect;
            this.f299l = new Rect(this.f298k);
        }
    }
}
