package yads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class kh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f40202a = new Object();

    public static String a(String str, Throwable th2) {
        String strReplace;
        synchronized (f40202a) {
            try {
                if (th2 != null) {
                    Throwable cause = th2;
                    while (true) {
                        if (cause == null) {
                            strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    }
                } else {
                    strReplace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbK = pe.a.k(str, "\n  ");
        sbK.append(strReplace.replace("\n", "\n  "));
        sbK.append('\n');
        return sbK.toString();
    }

    public static void b(String str, String str2) {
        synchronized (f40202a) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2) {
        synchronized (f40202a) {
            Log.i(str, str2);
        }
    }

    public static void d(String str, String str2) {
        synchronized (f40202a) {
            Log.w(str, str2);
        }
    }

    public static void a(String str, String str2, IllegalArgumentException illegalArgumentException) {
        b(str, a(str2, illegalArgumentException));
    }

    public static void a(String str, String str2) {
        synchronized (f40202a) {
            Log.d(str, str2);
        }
    }

    public static void a(RuntimeException runtimeException) {
        d("StreamVolumeManager", a("Error registering stream volume receiver", runtimeException));
    }
}
