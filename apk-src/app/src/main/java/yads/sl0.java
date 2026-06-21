package yads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sl0 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f42962h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f42963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f42964c = new int[1];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLDisplay f42965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLContext f42966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EGLSurface f42967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceTexture f42968g;

    public sl0(Handler handler) {
        this.f42963b = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f42968g;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    public final void b() {
        this.f42963b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f42968g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f42964c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f42965d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f42965d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f42967f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f42965d, this.f42967f);
            }
            EGLContext eGLContext = this.f42966e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f42965d, eGLContext);
            }
            if (lb3.f40466a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f42965d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f42965d);
            }
            this.f42965d = null;
            this.f42966e = null;
            this.f42967f = null;
            this.f42968g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f42963b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f42968g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public final void a(int i) {
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay != null) {
            int[] iArr3 = new int[2];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr3, 0, iArr3, 1)) {
                this.f42965d = eGLDisplayEglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr4 = new int[1];
                boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f42962h, 0, eGLConfigArr, 0, 1, iArr4, 0);
                if (zEglChooseConfig && iArr4[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLDisplay eGLDisplay = this.f42965d;
                    if (i == 0) {
                        iArr = new int[]{12440, 2, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    }
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eGLContextEglCreateContext != null) {
                        this.f42966e = eGLContextEglCreateContext;
                        EGLDisplay eGLDisplay2 = this.f42965d;
                        if (i == 1) {
                            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            if (i == 2) {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                            } else {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                            }
                            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                            if (eGLSurfaceEglCreatePbufferSurface == null) {
                                throw new rl0("eglCreatePbufferSurface failed");
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                            this.f42967f = eGLSurfaceEglCreatePbufferSurface;
                            GLES20.glGenTextures(1, this.f42964c, 0);
                            tz0.a();
                            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f42964c[0]);
                            this.f42968g = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(this);
                            return;
                        }
                        throw new rl0("eglMakeCurrent failed");
                    }
                    throw new rl0("eglCreateContext failed");
                }
                Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]};
                int i10 = lb3.f40466a;
                throw new rl0(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
            }
            throw new rl0("eglInitialize failed");
        }
        throw new rl0("eglGetDisplay failed");
    }
}
