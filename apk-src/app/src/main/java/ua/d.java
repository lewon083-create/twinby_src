package ua;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import io.sentry.rrweb.RRWebVideoEvent;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f34412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f34413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f34414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f34415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f34416e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f34412a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f34413b = method2;
        try {
            method3 = WorkSource.class.getMethod(RRWebVideoEvent.JsonKeys.SIZE, null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f34414c = method3;
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e3) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e3);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e7) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e7);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method4.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                method4 = null;
            }
        } else {
            method4 = null;
        }
        f34415d = method4;
        f34416e = null;
    }

    public static void a(WorkSource workSource, int i, String str) {
        Method method = f34413b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                return;
            }
        }
        Method method2 = f34412a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e7) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
            }
        }
    }
}
