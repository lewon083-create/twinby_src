package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f7354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Error f7355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RuntimeException f7356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f7357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Surface f7358g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(String str, int i) {
        super(str);
        this.f7353b = i;
    }

    public void a(int i) throws m3.i {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        ((m3.h) this.f7357f).getClass();
        m3.h hVar = (m3.h) this.f7357f;
        int[] iArr = hVar.f28565c;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        m3.b.c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        m3.b.c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        hVar.f28566d = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, m3.h.f28563h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z5 = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = m3.z.f28608a;
        m3.b.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z5);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(hVar.f28566d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        m3.b.c("eglCreateContext failed", eGLContextEglCreateContext != null);
        hVar.f28567e = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = hVar.f28566d;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            m3.b.c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        m3.b.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        hVar.f28568f = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        m3.b.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        hVar.f28569g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(hVar);
        SurfaceTexture surfaceTexture2 = ((m3.h) this.f7357f).f28569g;
        surfaceTexture2.getClass();
        this.f7358g = new o4.j(this, surfaceTexture2, i != 0);
    }

    public void b() {
        ((m3.h) this.f7357f).getClass();
        m3.h hVar = (m3.h) this.f7357f;
        hVar.f28564b.removeCallbacks(hVar);
        try {
            SurfaceTexture surfaceTexture = hVar.f28569g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, hVar.f28565c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = hVar.f28566d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = hVar.f28566d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = hVar.f28568f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(hVar.f28566d, hVar.f28568f);
            }
            EGLContext eGLContext = hVar.f28567e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(hVar.f28566d, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = hVar.f28566d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(hVar.f28566d);
            }
            hVar.f28566d = null;
            hVar.f28567e = null;
            hVar.f28568f = null;
            hVar.f28569g = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        gc0 gc0Var;
        switch (this.f7353b) {
            case 0:
                int i = message.what;
                try {
                    if (i != 1) {
                        if (i == 2) {
                            try {
                                gc0Var = (gc0) this.f7357f;
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            if (gc0Var == null) {
                                throw null;
                            }
                            gc0Var.b();
                        }
                        break;
                    } else {
                        try {
                            try {
                                int i10 = message.arg1;
                                gc0 gc0Var2 = (gc0) this.f7357f;
                                if (gc0Var2 == null) {
                                    throw null;
                                }
                                gc0Var2.a(i10);
                                SurfaceTexture surfaceTexture = ((gc0) this.f7357f).f5778g;
                                surfaceTexture.getClass();
                                this.f7358g = new m0(this, surfaceTexture, i10 != 0);
                                synchronized (this) {
                                    notify();
                                }
                            } catch (Error e3) {
                                rs.H("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                                this.f7355d = e3;
                                synchronized (this) {
                                    notify();
                                }
                            } catch (RuntimeException e7) {
                                rs.H("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                                this.f7356e = e7;
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (rc0 e10) {
                            rs.H("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                            this.f7356e = new IllegalStateException(e10);
                            synchronized (this) {
                                notify();
                            }
                        }
                        break;
                    }
                    return true;
                } catch (Throwable th2) {
                    synchronized (this) {
                        notify();
                        throw th2;
                    }
                }
            default:
                int i11 = message.what;
                try {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            try {
                                b();
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                        break;
                    } else {
                        try {
                            try {
                                a(message.arg1);
                                synchronized (this) {
                                    notify();
                                }
                            } catch (RuntimeException e11) {
                                m3.b.f("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                                this.f7356e = e11;
                                synchronized (this) {
                                    notify();
                                }
                            } catch (m3.i e12) {
                                m3.b.f("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                                this.f7356e = new IllegalStateException(e12);
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (Error e13) {
                            m3.b.f("PlaceholderSurface", "Failed to initialize placeholder surface", e13);
                            this.f7355d = e13;
                            synchronized (this) {
                                notify();
                            }
                        }
                        break;
                    }
                    return true;
                } catch (Throwable th3) {
                    synchronized (this) {
                        notify();
                        throw th3;
                    }
                }
        }
    }
}
