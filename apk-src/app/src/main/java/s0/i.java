package s0;

import a0.i0;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f32406a = {12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f32407b = {12445, 13632, 12344};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f32408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f32409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f32410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f32411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f32412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FloatBuffer f32413h;
    public static final FloatBuffer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f32414j;

    static {
        Locale locale = Locale.US;
        f32408c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f32409d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f32410e = new d(0);
        f32411f = new d(1);
        f32412g = new d(2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f32413h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        i = floatBufferAsFloatBuffer2;
        f32414j = new c(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbK = pe.a.k(str, ": EGL error: 0x");
        sbK.append(Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sbK.toString());
    }

    public static void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbK = pe.a.k(str, ": GL error 0x");
        sbK.append(Integer.toHexString(iGlGetError));
        throw new IllegalStateException(sbK.toString());
    }

    public static void c(Thread thread) {
        f2.g.h("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void d(boolean z5, AtomicBoolean atomicBoolean) {
        f2.g.h(z5 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z5 == atomicBoolean.get());
    }

    public static void e(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalStateException(pe.a.f("Unable to locate '", str, "' in program"));
        }
    }

    public static int[] f(String str, i0 i0Var) {
        int i10 = i0Var.f117a;
        int[] iArr = f32406a;
        if (i10 == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return f32407b;
            }
            com.google.android.gms.internal.auth.g.O("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static HashMap g(i0 i0Var) {
        Object hVar;
        f fVar;
        Map map = Collections.EMPTY_MAP;
        HashMap map2 = new HashMap();
        f[] fVarArrValues = f.values();
        int length = fVarArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            f fVar2 = fVarArrValues[i10];
            d dVar = (d) map.get(fVar2);
            if (dVar != null) {
                hVar = new h(i0Var, dVar);
            } else if (fVar2 == f.f32397d || fVar2 == (fVar = f.f32396c)) {
                hVar = new h(i0Var, fVar2);
            } else {
                f2.g.h("Unhandled input format: " + fVar2, fVar2 == f.f32395b);
                if (i0Var.a()) {
                    hVar = new e("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    d dVar2 = (d) map.get(fVar);
                    hVar = dVar2 != null ? new h(i0Var, dVar2) : new h(i0Var, fVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + fVar2 + " created: " + hVar);
            map2.put(fVar2, hVar);
        }
        return map2;
    }

    public static int h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        b("glBindTexture " + i10);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i10;
    }

    public static EGLSurface i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static String j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return gf.a.k(strGroup, ".", strGroup2);
    }

    public static int k(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        b("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        com.google.android.gms.internal.auth.g.O("GLUtils", "Could not compile shader: " + str);
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i10 + StringUtils.PROCESS_POSTFIX_DELIMITER + strGlGetShaderInfoLog);
    }
}
