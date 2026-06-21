package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ay extends Thread implements SurfaceTexture.OnFrameAvailableListener {
    public static final float[] C = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public volatile boolean A;
    public volatile boolean B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zx f3454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f3455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f3456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f3457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f3458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f3459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f3460h;
    public final float[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f3462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SurfaceTexture f3466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SurfaceTexture f3467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3470s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FloatBuffer f3471t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CountDownLatch f3472u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f3473v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EGL10 f3474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public EGLDisplay f3475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EGLContext f3476y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public EGLSurface f3477z;

    public ay(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f3471t = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(C).position(0);
        this.f3455c = new float[9];
        this.f3456d = new float[9];
        this.f3457e = new float[9];
        this.f3458f = new float[9];
        this.f3459g = new float[9];
        this.f3460h = new float[9];
        this.i = new float[9];
        this.f3461j = Float.NaN;
        zx zxVar = new zx(context);
        this.f3454b = zxVar;
        zxVar.f13147h = this;
        this.f3472u = new CountDownLatch(1);
        this.f3473v = new Object();
    }

    public static final void e(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sb2 = new StringBuilder(str.length() + 10 + String.valueOf(iGlGetError).length());
            sb2.append(str);
            sb2.append(": glError ");
            sb2.append(iGlGetError);
            Log.e("SphericalVideoRenderer", sb2.toString());
        }
    }

    public static final void f(float[] fArr, float[] fArr2, float[] fArr3) {
        float f10 = fArr2[0] * fArr3[0];
        float f11 = fArr2[1];
        float f12 = fArr3[3];
        float f13 = fArr2[2];
        float f14 = fArr3[6];
        fArr[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = fArr2[0];
        float f16 = fArr3[1] * f15;
        float f17 = fArr3[4];
        float f18 = fArr3[7];
        fArr[1] = f16 + (f11 * f17) + (f13 * f18);
        float f19 = f15 * fArr3[2];
        float f20 = fArr2[1];
        float f21 = fArr3[5];
        float f22 = fArr3[8];
        fArr[2] = f19 + (f20 * f21) + (f13 * f22);
        float f23 = fArr2[3];
        float f24 = fArr3[0];
        float f25 = fArr2[4];
        float f26 = fArr2[5];
        fArr[3] = (f23 * f24) + (f12 * f25) + (f26 * f14);
        float f27 = fArr2[3];
        float f28 = fArr3[1];
        fArr[4] = (f27 * f28) + (f25 * f17) + (f26 * f18);
        float f29 = fArr3[2];
        fArr[5] = (f27 * f29) + (fArr2[4] * f21) + (f26 * f22);
        float f30 = fArr2[6] * f24;
        float f31 = fArr2[7];
        float f32 = fArr3[3] * f31;
        float f33 = fArr2[8];
        fArr[6] = f30 + f32 + (f14 * f33);
        float f34 = fArr2[6];
        float f35 = f18 * f33;
        fArr[7] = f35 + (f31 * fArr3[4]) + (f28 * f34);
        fArr[8] = (f34 * f29) + (fArr2[7] * fArr3[5]) + (f33 * f22);
    }

    public static final void g(float[] fArr, float f10) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d10 = f10;
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = (float) (-Math.sin(d10));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d10);
        fArr[8] = (float) Math.cos(d10);
    }

    public static final void h(float[] fArr, float f10) {
        double d10 = f10;
        fArr[0] = (float) Math.cos(d10);
        fArr[1] = (float) (-Math.sin(d10));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d10);
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int i(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        e("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            e("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            e("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            e("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 26);
                sb2.append("Could not compile shader ");
                sb2.append(i);
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                Log.e("SphericalVideoRenderer", sb2.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                e("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public final void a(int i, int i10) {
        Object obj = this.f3473v;
        synchronized (obj) {
            this.f3465n = i;
            this.f3464m = i10;
            this.A = true;
            obj.notifyAll();
        }
    }

    public final void b() {
        Object obj = this.f3473v;
        synchronized (obj) {
            this.B = true;
            this.f3467p = null;
            obj.notifyAll();
        }
    }

    public final void c(float f10, float f11) {
        int i = this.f3465n;
        int i10 = this.f3464m;
        if (i <= i10) {
            i = i10;
        }
        float f12 = i;
        this.f3462k -= (f10 * 1.7453293f) / f12;
        float f13 = this.f3463l - ((f11 * 1.7453293f) / f12);
        this.f3463l = f13;
        if (f13 < -1.5707964f) {
            this.f3463l = -1.5707964f;
            f13 = -1.5707964f;
        }
        if (f13 > 1.5707964f) {
            this.f3463l = 1.5707964f;
        }
    }

    public final void d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f3477z;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.f3474w.eglMakeCurrent(this.f3475x, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f3474w.eglDestroySurface(this.f3475x, this.f3477z);
            this.f3477z = null;
        }
        EGLContext eGLContext = this.f3476y;
        if (eGLContext != null) {
            this.f3474w.eglDestroyContext(this.f3475x, eGLContext);
            this.f3476y = null;
        }
        EGLDisplay eGLDisplay = this.f3475x;
        if (eGLDisplay != null) {
            this.f3474w.eglTerminate(eGLDisplay);
            this.f3475x = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f3470s++;
        Object obj = this.f3473v;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ay.run():void");
    }
}
