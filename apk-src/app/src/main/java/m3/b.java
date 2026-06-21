package m3;

import ad.b1;
import ad.e0;
import ad.h0;
import ad.j0;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ExecutorService f28542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f28543b = new Object();

    public static String a(String str, Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (f28543b) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbK = pe.a.k(str, "\n  ");
        sbK.append(strReplace.replace("\n", "\n  "));
        sbK.append('\n');
        return sbK.toString();
    }

    public static void b() throws i {
        StringBuilder sb2 = new StringBuilder();
        ad.q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z5 = false;
        int i = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z5) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i10 = i + 1;
            int iF = e0.f(objArrCopyOf.length, i10);
            if (iF > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
            }
            objArrCopyOf[i] = numValueOf;
            z5 = true;
            i = i10;
        }
        if (z5) {
            throw new i(sb2.toString(), j0.p(i, objArrCopyOf));
        }
    }

    public static void c(String str, boolean z5) throws i {
        if (z5) {
            return;
        }
        h0 h0Var = j0.f818c;
        throw new i(str, b1.f768f);
    }

    public static void d(String str, String str2) {
        synchronized (f28543b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void e(String str, String str2) {
        synchronized (f28543b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void f(String str, String str2, Throwable th2) {
        synchronized (f28543b) {
            Log.e(str, a(str2, th2));
        }
    }

    public static synchronized Executor g() {
        try {
            if (f28542a == null) {
                String str = z.f28608a;
                f28542a = Executors.newSingleThreadExecutor(new x("ExoPlayer:BackgroundExecutor", 0));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f28542a;
    }

    public static String h(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static int[] i(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void j(String str, String str2) {
        synchronized (f28543b) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean k(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean l(String str) throws i {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        c("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        c("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        b();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean m(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void n(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static String o(StringBuilder sb2, int i, int i10) {
        int i11;
        int iLastIndexOf;
        if (i >= i10) {
            return sb2.toString();
        }
        if (sb2.charAt(i) == '/') {
            i++;
        }
        int i12 = i;
        int i13 = i12;
        while (i12 <= i10) {
            if (i12 == i10) {
                i11 = i12;
            } else if (sb2.charAt(i12) == '/') {
                i11 = i12 + 1;
            } else {
                i12++;
            }
            int i14 = i13 + 1;
            if (i12 == i14 && sb2.charAt(i13) == '.') {
                sb2.delete(i13, i11);
                i10 -= i11 - i13;
            } else {
                if (i12 == i13 + 2 && sb2.charAt(i13) == '.' && sb2.charAt(i14) == '.') {
                    iLastIndexOf = sb2.lastIndexOf("/", i13 - 2) + 1;
                    int i15 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb2.delete(i15, i11);
                    i10 -= i11 - i15;
                } else {
                    iLastIndexOf = i12 + 1;
                }
                i13 = iLastIndexOf;
            }
            i12 = i13;
        }
        return sb2.toString();
    }

    public static String p(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrI = i(str2);
        if (iArrI[0] != -1) {
            sb2.append(str2);
            o(sb2, iArrI[1], iArrI[2]);
            return sb2.toString();
        }
        int[] iArrI2 = i(str);
        if (iArrI[3] == 0) {
            sb2.append((CharSequence) str, 0, iArrI2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (iArrI[2] == 0) {
            sb2.append((CharSequence) str, 0, iArrI2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i = iArrI[1];
        if (i != 0) {
            int i10 = iArrI2[0] + 1;
            sb2.append((CharSequence) str, 0, i10);
            sb2.append(str2);
            return o(sb2, iArrI[1] + i10, i10 + iArrI[2]);
        }
        if (str2.charAt(i) == '/') {
            sb2.append((CharSequence) str, 0, iArrI2[1]);
            sb2.append(str2);
            int i11 = iArrI2[1];
            return o(sb2, i11, iArrI[2] + i11);
        }
        int i12 = iArrI2[0] + 2;
        int i13 = iArrI2[1];
        if (i12 >= i13 || i13 != iArrI2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrI2[2] - 1);
            int i14 = iLastIndexOf == -1 ? iArrI2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i14);
            sb2.append(str2);
            return o(sb2, iArrI2[1], i14 + iArrI[2]);
        }
        sb2.append((CharSequence) str, 0, i13);
        sb2.append('/');
        sb2.append(str2);
        int i15 = iArrI2[1];
        return o(sb2, i15, iArrI[2] + i15 + 1);
    }

    public static Uri q(String str, String str2) {
        return Uri.parse(p(str, str2));
    }

    public static void r(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(l7.o.i(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void s(String str, String str2) {
        synchronized (f28543b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void t(String str, String str2, Throwable th2) {
        synchronized (f28543b) {
            Log.w(str, a(str2, th2));
        }
    }
}
