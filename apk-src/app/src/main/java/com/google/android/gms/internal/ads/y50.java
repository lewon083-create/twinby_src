package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class y50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f12506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f12507h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f12508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f12509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f12510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f12511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f12512n;

    public y50(rr0 rr0Var, u9.a aVar, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, js1 js1Var, t9.e0 e0Var, String str2, sn0 sn0Var, iq0 iq0Var, b80 b80Var, int i) {
        this.f12500a = 0;
        this.f12502c = rr0Var;
        this.f12503d = aVar;
        this.f12504e = applicationInfo;
        this.f12505f = str;
        this.f12507h = arrayList;
        this.i = packageInfo;
        this.f12508j = js1Var;
        this.f12506g = str2;
        this.f12509k = sn0Var;
        this.f12510l = e0Var;
        this.f12511m = iq0Var;
        this.f12512n = b80Var;
        this.f12501b = i;
    }

    public void a() {
        int iM = t.z.m(this.f12501b);
        if (iM == 0 || iM == 1) {
            l();
            return;
        }
        if (iM == 2 || iM == 3) {
            com.google.android.gms.internal.auth.g.e("VideoEncoderSession", "closeInternal in " + pe.a.y(this.f12501b) + " state");
            this.f12501b = 3;
            return;
        }
        if (iM == 4) {
            com.google.android.gms.internal.auth.g.e("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + pe.a.y(this.f12501b) + " is not handled");
    }

    public void b(a0.i0 i0Var, s7.g gVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f12505f = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.f12505f, iArr, 0, iArr, 1)) {
            this.f12505f = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (gVar != null) {
            String str = iArr[0] + "." + iArr[1];
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            gVar.f32796c = str;
        }
        int i = i0Var.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f12505f, new int[]{12324, i, 12323, i, 12322, i, 12321, i0Var.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, i0Var.a() ? 64 : 4, 12610, i0Var.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f12505f, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i0Var.a() ? 3 : 2, 12344}, 0);
        s0.i.a("eglCreateContext");
        this.i = eGLConfig;
        this.f12506g = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext((EGLDisplay) this.f12505f, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public s0.c c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f12505f;
            EGLConfig eGLConfig = (EGLConfig) this.i;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceI = s0.i.i(eGLDisplay, eGLConfig, surface, (int[]) this.f12507h);
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.f12505f;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return new s0.c(eGLSurfaceI, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e3) {
            com.google.android.gms.internal.auth.g.P("OpenGlRenderer", "Failed to create EGL surface: " + e3.getMessage(), e3);
            return null;
        }
    }

    public void d() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f12505f;
        EGLConfig eGLConfig = (EGLConfig) this.i;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = s0.i.f32406a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        s0.i.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.f12508j = eGLSurfaceEglCreatePbufferSurface;
    }

    public f2.b e(a0.i0 i0Var) {
        s0.i.d(false, (AtomicBoolean) this.f12502c);
        try {
            b(i0Var, null);
            d();
            g((EGLSurface) this.f12508j);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.f12505f, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new f2.b(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e3) {
            com.google.android.gms.internal.auth.g.P("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e3.getMessage(), e3);
            return new f2.b("", "");
        } finally {
            i();
        }
    }

    public s0.a f(a0.i0 i0Var) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f12502c;
        s0.i.d(false, atomicBoolean);
        s7.g gVar = new s7.g();
        gVar.f32795b = "0.0";
        gVar.f32796c = "0.0";
        gVar.f32797d = "";
        gVar.f32798e = "";
        try {
            if (i0Var.a()) {
                f2.b bVarE = e(i0Var);
                String str = (String) bVarE.f16566a;
                str.getClass();
                String str2 = (String) bVarE.f16567b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    com.google.android.gms.internal.auth.g.O("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    i0Var = a0.i0.f112d;
                }
                this.f12507h = s0.i.f(str2, i0Var);
                gVar.f32797d = str;
                gVar.f32798e = str2;
            }
            b(i0Var, gVar);
            d();
            g((EGLSurface) this.f12508j);
            String strJ = s0.i.j();
            if (strJ == null) {
                throw new NullPointerException("Null glVersion");
            }
            gVar.f32795b = strJ;
            this.f12510l = s0.i.g(i0Var);
            int iH = s0.i.h();
            this.f12501b = iH;
            m(iH);
            this.f12504e = Thread.currentThread();
            atomicBoolean.set(true);
            String strX = ((String) gVar.f32795b) == null ? " glVersion" : "";
            if (((String) gVar.f32796c) == null) {
                strX = strX.concat(" eglVersion");
            }
            if (((String) gVar.f32797d) == null) {
                strX = om1.x(strX, " glExtensions");
            }
            if (((String) gVar.f32798e) == null) {
                strX = om1.x(strX, " eglExtensions");
            }
            if (strX.isEmpty()) {
                return new s0.a((String) gVar.f32795b, (String) gVar.f32796c, (String) gVar.f32797d, (String) gVar.f32798e);
            }
            throw new IllegalStateException("Missing required properties:".concat(strX));
        } catch (IllegalArgumentException e3) {
            e = e3;
            i();
            throw e;
        } catch (IllegalStateException e7) {
            e = e7;
            i();
            throw e;
        }
    }

    public void g(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f12505f).getClass();
        ((EGLContext) this.f12506g).getClass();
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f12505f, eGLSurface, eGLSurface, (EGLContext) this.f12506g)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void h(Surface surface) {
        s0.i.d(true, (AtomicBoolean) this.f12502c);
        s0.i.c((Thread) this.f12504e);
        HashMap map = (HashMap) this.f12503d;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, s0.i.f32414j);
    }

    public void i() {
        HashMap map = (HashMap) this.f12503d;
        Iterator it = ((Map) this.f12510l).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((s0.g) it.next()).f32399a);
        }
        this.f12510l = Collections.EMPTY_MAP;
        this.f12511m = null;
        if (!Objects.equals((EGLDisplay) this.f12505f, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f12505f;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (s0.c cVar : map.values()) {
                if (!Objects.equals(cVar.f32391a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f12505f, cVar.f32391a)) {
                    try {
                        s0.i.a("eglDestroySurface");
                    } catch (IllegalStateException e3) {
                        com.google.android.gms.internal.auth.g.l("GLUtils", e3.toString(), e3);
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.f12508j, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f12505f, (EGLSurface) this.f12508j);
                this.f12508j = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.f12506g, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f12505f, (EGLContext) this.f12506g);
                this.f12506g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f12505f);
            this.f12505f = EGL14.EGL_NO_DISPLAY;
        }
        this.i = null;
        this.f12501b = -1;
        this.f12512n = s0.f.f32395b;
        this.f12509k = null;
        this.f12504e = null;
    }

    public void j(Surface surface, boolean z5) {
        HashMap map = (HashMap) this.f12503d;
        if (((Surface) this.f12509k) == surface) {
            this.f12509k = null;
            g((EGLSurface) this.f12508j);
        }
        s0.c cVar = z5 ? (s0.c) map.remove(surface) : (s0.c) map.put(surface, s0.i.f32414j);
        if (cVar == null || cVar == s0.i.f32414j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.f12505f, cVar.f32391a);
        } catch (RuntimeException e3) {
            com.google.android.gms.internal.auth.g.P("OpenGlRenderer", "Failed to destroy EGL surface: " + e3.getMessage(), e3);
        }
    }

    public void k(long j10, float[] fArr, Surface surface) {
        s0.i.d(true, (AtomicBoolean) this.f12502c);
        s0.i.c((Thread) this.f12504e);
        HashMap map = (HashMap) this.f12503d;
        f2.g.h("The surface is not registered.", map.containsKey(surface));
        s0.c cVarC = (s0.c) map.get(surface);
        Objects.requireNonNull(cVarC);
        if (cVarC == s0.i.f32414j) {
            cVarC = c(surface);
            if (cVarC == null) {
                return;
            } else {
                map.put(surface, cVarC);
            }
        }
        int i = cVarC.f32393c;
        int i10 = cVarC.f32392b;
        EGLSurface eGLSurface = cVarC.f32391a;
        if (surface != ((Surface) this.f12509k)) {
            g(eGLSurface);
            this.f12509k = surface;
            GLES20.glViewport(0, 0, i10, i);
            GLES20.glScissor(0, 0, i10, i);
        }
        s0.g gVar = (s0.g) this.f12511m;
        gVar.getClass();
        if (gVar instanceof s0.h) {
            GLES20.glUniformMatrix4fv(((s0.h) gVar).f32404f, 1, false, fArr, 0);
            s0.i.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        s0.i.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f12505f, eGLSurface, j10);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f12505f, eGLSurface)) {
            return;
        }
        com.google.android.gms.internal.auth.g.O("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        j(surface, false);
    }

    public void l() {
        int iM = t.z.m(this.f12501b);
        if (iM == 0) {
            this.f12501b = 5;
            return;
        }
        if (iM != 1 && iM != 2 && iM != 3) {
            if (iM != 4) {
                throw new IllegalStateException("State " + pe.a.y(this.f12501b) + " is not handled");
            }
            com.google.android.gms.internal.auth.g.e("VideoEncoderSession", "terminateNow in " + pe.a.y(this.f12501b) + ", No-op");
            return;
        }
        this.f12501b = 5;
        ((j1.h) this.f12512n).b((e1.c0) this.f12505f);
        this.f12507h = null;
        if (((e1.c0) this.f12505f) == null) {
            com.google.android.gms.internal.auth.g.O("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            ((j1.h) this.f12510l).b(null);
            return;
        }
        com.google.android.gms.internal.auth.g.e("VideoEncoderSession", "VideoEncoder is releasing: " + ((e1.c0) this.f12505f));
        e1.c0 c0Var = (e1.c0) this.f12505f;
        c0Var.i.execute(new e1.p(c0Var, 4));
        ((e1.c0) this.f12505f).f15925j.a(new t.a0(14, this), (Executor) this.f12503d);
        this.f12505f = null;
    }

    public void m(int i) {
        s0.g gVar = (s0.g) ((Map) this.f12510l).get((s0.f) this.f12512n);
        if (gVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + ((s0.f) this.f12512n));
        }
        if (((s0.g) this.f12511m) != gVar) {
            this.f12511m = gVar;
            gVar.b();
            Log.d("OpenGlRenderer", "Using program for input format " + ((s0.f) this.f12512n) + ": " + ((s0.g) this.f12511m));
        }
        GLES20.glActiveTexture(33984);
        s0.i.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        s0.i.b("glBindTexture");
    }

    public or0 n(Bundle bundle) {
        ((b80) this.f12512n).a();
        rr0 rr0Var = (rr0) this.f12502c;
        Objects.requireNonNull(rr0Var);
        return new hi(rr0Var, pr0.SIGNALS, null, rr0.f10029d, Collections.EMPTY_LIST, ((sn0) this.f12509k).f(new w50(new Bundle(), new Bundle()), bundle, this.f12501b == 2)).r();
    }

    public or0 o() {
        Bundle bundle = new Bundle();
        int i = 0;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.B2)).booleanValue()) {
            Bundle bundle2 = ((iq0) this.f12511m).f6587t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        or0 or0VarN = n(bundle);
        rr0 rr0Var = (rr0) this.f12502c;
        ed.d[] dVarArr = {or0VarN, (ed.d) ((js1) this.f12508j).j()};
        rr0Var.getClass();
        List listAsList = Arrays.asList(dVarArr);
        x50 x50Var = new x50(this, or0VarN, bundle, i);
        v41 v41Var = x41.f12018c;
        listAsList.getClass();
        x41 x41VarV = x41.v(listAsList);
        tk tkVar = tk.f10635g;
        gx gxVar = hx.f6285g;
        e81 e81Var = new e81(x41VarV, true, false);
        e81Var.f4874q = new d81(e81Var, tkVar, gxVar);
        e81Var.w();
        r81 r81Var = rr0Var.f10030a;
        e81 e81Var2 = new e81(x41VarV, true, false);
        e81Var2.f4874q = new d81(e81Var2, x50Var, r81Var);
        e81Var2.w();
        return new hi(rr0Var, pr0.REQUEST_PARCEL, null, e81Var, listAsList, e81Var2).r();
    }

    public String toString() {
        switch (this.f12500a) {
            case 2:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((a0.o2) this.f12507h, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }

    public y50() {
        this.f12500a = 1;
        this.f12502c = new AtomicBoolean(false);
        this.f12503d = new HashMap();
        this.f12505f = EGL14.EGL_NO_DISPLAY;
        this.f12506g = EGL14.EGL_NO_CONTEXT;
        this.f12507h = s0.i.f32406a;
        this.f12508j = EGL14.EGL_NO_SURFACE;
        this.f12510l = Collections.EMPTY_MAP;
        this.f12511m = null;
        this.f12512n = s0.f.f32395b;
        this.f12501b = -1;
    }

    public y50(wf.b bVar, j0.i iVar, Executor executor) {
        this.f12500a = 2;
        this.f12505f = null;
        this.f12506g = null;
        this.f12507h = null;
        this.i = null;
        this.f12508j = null;
        this.f12501b = 1;
        this.f12509k = new k0.l(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.f12510l = null;
        this.f12511m = new k0.l(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.f12512n = null;
        this.f12502c = executor;
        this.f12503d = iVar;
        this.f12504e = bVar;
    }
}
