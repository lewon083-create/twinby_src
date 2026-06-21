package r0;

import a0.g0;
import a0.i0;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import com.google.android.gms.internal.ads.y50;
import f2.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import q0.n;
import s0.h;
import s0.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends y50 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32142o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f32143p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f32144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g0 f32145r;

    public c(g0 g0Var, g0 g0Var2) {
        this.f32144q = g0Var;
        this.f32145r = g0Var2;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final s0.a f(i0 i0Var) {
        Map map = Collections.EMPTY_MAP;
        s0.a aVarF = super.f(i0Var);
        this.f32142o = i.h();
        this.f32143p = i.h();
        return aVarF;
    }

    public final void p(long j10, Surface surface, n nVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        i.d(true, (AtomicBoolean) this.f12502c);
        i.c((Thread) this.f12504e);
        HashMap map = (HashMap) this.f12503d;
        g.h("The surface is not registered.", map.containsKey(surface));
        s0.c cVarC = (s0.c) map.get(surface);
        Objects.requireNonNull(cVarC);
        if (cVarC == i.f32414j) {
            cVarC = c(surface);
            if (cVarC == null) {
                return;
            } else {
                map.put(surface, cVarC);
            }
        }
        s0.c cVar = cVarC;
        EGLSurface eGLSurface = cVar.f32391a;
        if (surface != ((Surface) this.f12509k)) {
            g(eGLSurface);
            this.f12509k = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        q(cVar, nVar, surfaceTexture, this.f32144q, this.f32142o, true);
        q(cVar, nVar, surfaceTexture2, this.f32145r, this.f32143p, false);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f12505f, eGLSurface, j10);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f12505f, eGLSurface)) {
            return;
        }
        com.google.android.gms.internal.auth.g.O("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        j(surface, false);
    }

    public final void q(s0.c cVar, n nVar, SurfaceTexture surfaceTexture, g0 g0Var, int i, boolean z5) {
        m(i);
        int i10 = cVar.f32392b;
        int i11 = cVar.f32393c;
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glScissor(0, 0, i10, i11);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, z5 ? nVar.f31612f : nVar.f31613g, 0);
        s0.g gVar = (s0.g) this.f12511m;
        gVar.getClass();
        if (gVar instanceof h) {
            GLES20.glUniformMatrix4fv(((h) gVar).f32404f, 1, false, fArr2, 0);
            i.b("glUniformMatrix4fv");
        }
        f2.b bVar = (f2.b) g0Var.f88d;
        Size size = new Size((int) (((Float) bVar.f16566a).floatValue() * i10), (int) (((Float) bVar.f16567b).floatValue() * i11));
        Size size2 = new Size(i10, i11);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        f2.b bVar2 = (f2.b) g0Var.f87c;
        if (((Float) bVar.f16566a).floatValue() != 0.0f || ((Float) bVar.f16567b).floatValue() != 0.0f) {
            Matrix.translateM(fArr4, 0, ((Float) bVar2.f16566a).floatValue() / ((Float) bVar.f16566a).floatValue(), ((Float) bVar2.f16567b).floatValue() / ((Float) bVar.f16567b).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(gVar.f32400b, 1, false, fArr5, 0);
        i.b("glUniformMatrix4fv");
        GLES20.glUniform1f(gVar.f32401c, 1.0f);
        i.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        i.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
