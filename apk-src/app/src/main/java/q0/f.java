package q0;

import a0.i0;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import com.google.android.gms.internal.ads.y50;
import i0.q;
import io.appmetrica.analytics.impl.lp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y50 f31566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f31567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0.d f31568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f31569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f31570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f31571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f31572h;
    public final LinkedHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f31574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f31575l;

    public f(i0 i0Var) {
        Map map = Collections.EMPTY_MAP;
        this.f31570f = new AtomicBoolean(false);
        this.f31571g = new float[16];
        this.f31572h = new float[16];
        this.i = new LinkedHashMap();
        this.f31573j = 0;
        this.f31574k = false;
        this.f31575l = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f31567c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f31569e = handler;
        this.f31568d = new j0.d(handler);
        this.f31566b = new y50();
        try {
            try {
                i0.o.w(new oi.i(this, i0Var)).get();
            } catch (InterruptedException | ExecutionException e3) {
                e = e3;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e7) {
            e();
            throw e7;
        }
    }

    public final void a() {
        if (this.f31574k && this.f31573j == 0) {
            LinkedHashMap linkedHashMap = this.i;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((n) it.next()).close();
            }
            Iterator it2 = this.f31575l.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).f31548c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            y50 y50Var = this.f31566b;
            if (((AtomicBoolean) y50Var.f12502c).getAndSet(false)) {
                s0.i.c((Thread) y50Var.f12504e);
                y50Var.i();
            }
            this.f31567c.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.f31568d.execute(new a1.c(this, runnable2, runnable, 29));
        } catch (RejectedExecutionException e3) {
            com.google.android.gms.internal.auth.g.P("DefaultSurfaceProcessor", "Unable to executor runnable", e3);
            runnable2.run();
        }
    }

    public final void c(Exception exc) {
        ArrayList arrayList = this.f31575l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).f31548c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap d(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        com.google.android.gms.internal.auth.m.q(fArr2, i);
        com.google.android.gms.internal.auth.m.r(fArr2);
        Size sizeI = q.i(size, i);
        y50 y50Var = this.f31566b;
        y50Var.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeI.getHeight() * sizeI.getWidth() * 4);
        f2.g.a("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeI.getHeight() * sizeI.getWidth()) * 4);
        f2.g.a("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = s0.i.f32406a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        s0.i.b("glGenTextures");
        int i10 = iArr2[0];
        GLES20.glActiveTexture(33985);
        s0.i.b("glActiveTexture");
        GLES20.glBindTexture(3553, i10);
        s0.i.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeI.getWidth(), sizeI.getHeight(), 0, 6407, 5121, null);
        s0.i.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        s0.i.b("glGenFramebuffers");
        int i11 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i11);
        s0.i.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i10, 0);
        s0.i.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        s0.i.b("glActiveTexture");
        GLES20.glBindTexture(36197, y50Var.f12501b);
        s0.i.b("glBindTexture");
        y50Var.f12509k = null;
        GLES20.glViewport(0, 0, sizeI.getWidth(), sizeI.getHeight());
        GLES20.glScissor(0, 0, sizeI.getWidth(), sizeI.getHeight());
        s0.g gVar = (s0.g) y50Var.f12511m;
        gVar.getClass();
        if (gVar instanceof s0.h) {
            GLES20.glUniformMatrix4fv(((s0.h) gVar).f32404f, 1, false, fArr2, 0);
            s0.i.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        s0.i.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeI.getWidth(), sizeI.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        s0.i.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        s0.i.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i11}, 0);
        s0.i.b("glDeleteFramebuffers");
        int i12 = y50Var.f12501b;
        GLES20.glActiveTexture(33984);
        s0.i.b("glActiveTexture");
        GLES20.glBindTexture(36197, i12);
        s0.i.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeI.getWidth(), sizeI.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.f(bitmapCreateBitmap, byteBufferAllocateDirect, sizeI.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void e() {
        if (this.f31570f.getAndSet(true)) {
            return;
        }
        b(new lp(20, this), new com.appsflyer.internal.m(6));
    }

    public final void f(ij.q qVar) {
        ArrayList arrayList = this.f31575l;
        if (arrayList.isEmpty()) {
            return;
        }
        if (qVar == null) {
            c(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i = -1;
                int i10 = -1;
                Bitmap bitmapD = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    int i11 = aVar.f31547b;
                    int i12 = aVar.f31546a;
                    if (i != i11 || bitmapD == null) {
                        if (bitmapD != null) {
                            bitmapD.recycle();
                        }
                        bitmapD = d((Size) qVar.f21351c, (float[]) qVar.f21352d, i11);
                        i10 = -1;
                        i = i11;
                    }
                    if (i10 != i12) {
                        byteArrayOutputStream.reset();
                        bitmapD.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i10 = i12;
                    }
                    Surface surface = (Surface) qVar.f21350b;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.k(byteArray, surface);
                    aVar.f31548c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e3) {
            c(e3);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f31570f.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f31571g;
        surfaceTexture.getTransformMatrix(fArr);
        ij.q qVar = null;
        for (Map.Entry entry : this.i.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            n nVar = (n) entry.getKey();
            float[] fArr2 = nVar.f31612f;
            float[] fArr3 = this.f31572h;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            int i = nVar.f31610d;
            if (i == 34) {
                try {
                    this.f31566b.k(surfaceTexture.getTimestamp(), fArr3, surface);
                } catch (RuntimeException e3) {
                    com.google.android.gms.internal.auth.g.l("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e3);
                }
            } else {
                f2.g.h("Unsupported format: " + i, i == 256);
                f2.g.h("Only one JPEG output is supported.", qVar == null);
                qVar = new ij.q(surface, nVar.f31611e, (float[]) fArr3.clone());
            }
        }
        try {
            f(qVar);
        } catch (RuntimeException e7) {
            c(e7);
        }
    }
}
