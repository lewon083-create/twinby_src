package u9;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.m31;
import com.google.android.gms.internal.ads.mp0;
import com.google.android.gms.internal.ads.n31;
import com.google.android.gms.internal.ads.xo0;
import java.lang.reflect.Array;
import java.util.Iterator;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xo0 f34392a;

    static {
        int i = 7;
        f34392a = new xo0(i, new mp0(i, (byte) 0));
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !a((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i = 0; i < length; i++) {
                        if (!c0.m(Array.get(obj, i), Array.get(obj2, i))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }

    public static ya.d b(Context context) throws j {
        try {
            return ya.d.c(context, ya.d.f36573b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e3) {
            throw new j(e3);
        }
    }

    public static void c(String str) {
        if (!l(3)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        xo0 xo0Var = f34392a;
        Iterator itE = ((n31) xo0Var.f12221c).e(xo0Var, str);
        boolean z5 = true;
        while (true) {
            m31 m31Var = (m31) itE;
            if (!m31Var.hasNext()) {
                return;
            }
            String str2 = (String) m31Var.next();
            if (z5) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z5 = false;
        }
    }

    public static void d(String str, Throwable th2) {
        if (l(3)) {
            Log.d("Ads", str, th2);
        }
    }

    public static void e(String str) {
        if (!l(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        xo0 xo0Var = f34392a;
        Iterator itE = ((n31) xo0Var.f12221c).e(xo0Var, str);
        boolean z5 = true;
        while (true) {
            m31 m31Var = (m31) itE;
            if (!m31Var.hasNext()) {
                return;
            }
            String str2 = (String) m31Var.next();
            if (z5) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z5 = false;
        }
    }

    public static void f(String str, Throwable th2) {
        if (l(6)) {
            Log.e("Ads", str, th2);
        }
    }

    public static void g(String str) {
        if (!l(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        xo0 xo0Var = f34392a;
        Iterator itE = ((n31) xo0Var.f12221c).e(xo0Var, str);
        boolean z5 = true;
        while (true) {
            m31 m31Var = (m31) itE;
            if (!m31Var.hasNext()) {
                return;
            }
            String str2 = (String) m31Var.next();
            if (z5) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z5 = false;
        }
    }

    public static void h(String str) {
        if (!l(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        xo0 xo0Var = f34392a;
        Iterator itE = ((n31) xo0Var.f12221c).e(xo0Var, str);
        boolean z5 = true;
        while (true) {
            m31 m31Var = (m31) itE;
            if (!m31Var.hasNext()) {
                return;
            }
            String str2 = (String) m31Var.next();
            if (z5) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z5 = false;
        }
    }

    public static void i(String str, Throwable th2) {
        if (l(5)) {
            Log.w("Ads", str, th2);
        }
    }

    public static String j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb2.append(str);
        sb2.append(" @");
        sb2.append(lineNumber);
        return sb2.toString();
    }

    public static void k(String str, Exception exc) {
        if (l(5)) {
            if (exc != null) {
                i(j(str), exc);
            } else {
                h(j(str));
            }
        }
    }

    public static boolean l(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
