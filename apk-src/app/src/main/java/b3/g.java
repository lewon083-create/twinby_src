package b3;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f1853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float[] f1854h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1860f;

    static {
        float[] fArr = new float[16];
        f1853g = fArr;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = new float[16];
        f1854h = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 1.0f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
    }

    public static void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbK = pe.a.k(str, ": glError 0x");
        sbK.append(Integer.toHexString(iGlGetError));
        String string = sbK.toString();
        Log.e("Texture2dProgram", string);
        throw new RuntimeException(string);
    }

    public static void b(int i, String str) {
        if (i < 0) {
            throw new RuntimeException(pe.a.f("Unable to locate '", str, "' in program"));
        }
    }

    public static int c(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.e("Texture2dProgram", "Could not compile shader " + i + StringUtils.PROCESS_POSTFIX_DELIMITER);
        StringBuilder sb2 = new StringBuilder(" ");
        sb2.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        Log.e("Texture2dProgram", sb2.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }
}
