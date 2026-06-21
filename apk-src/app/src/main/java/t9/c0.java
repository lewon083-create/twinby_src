package t9;

import android.util.Log;
import com.google.android.gms.internal.ads.dm;
import com.google.android.gms.internal.ads.m31;
import com.google.android.gms.internal.ads.n31;
import com.google.android.gms.internal.ads.xo0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends u9.i {
    public static void m(String str) {
        if (!o()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        xo0 xo0Var = u9.i.f34392a;
        Iterator itE = ((n31) xo0Var.f12221c).e(xo0Var, str);
        boolean z5 = true;
        while (true) {
            m31 m31Var = (m31) itE;
            if (!m31Var.hasNext()) {
                return;
            }
            String str2 = (String) m31Var.next();
            if (z5) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z5 = false;
        }
    }

    public static void n(String str, Throwable th2) {
        if (o()) {
            Log.v("Ads", str, th2);
        }
    }

    public static boolean o() {
        return u9.i.l(2) && ((Boolean) dm.f4602a.r()).booleanValue();
    }
}
