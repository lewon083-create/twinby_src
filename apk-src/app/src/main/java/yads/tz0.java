package yads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class tz0 {
    public static void a() {
        int i = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            kh1.b("GlUtil", "glError: " + GLU.gluErrorString(iGlGetError));
            i = iGlGetError;
        }
        if (i != 0) {
            kh1.b("GlUtil", "glError: " + GLU.gluErrorString(i));
        }
    }

    public static boolean c() {
        String strEglQueryString;
        return lb3.f40466a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static boolean a(Context context) {
        String strEglQueryString;
        int i = lb3.f40466a;
        if (i < 24) {
            return false;
        }
        if (i < 26) {
            byte[] bArrDecode = Base64.decode("c2Ftc3VuZw==", 0);
            Charset charset = Charsets.UTF_8;
            if (new String(bArrDecode, charset).equals(lb3.f40468c) || new String(Base64.decode("WFQxNjUw", 0), charset).equals(lb3.f40469d)) {
                return false;
            }
        }
        return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
    }
}
