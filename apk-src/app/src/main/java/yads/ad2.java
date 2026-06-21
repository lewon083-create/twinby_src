package yads;

import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ad2 {
    public static final String a(Context context) {
        try {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            Intrinsics.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            return activeNetworkInfo.getType() == 0 ? activeNetworkInfo.getSubtypeName() : activeNetworkInfo.getTypeName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Point b(Context context) {
        Object systemService = context.getSystemService("window");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean c(android.content.Context r1) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            kotlin.jvm.internal.Intrinsics.c(r1, r0)     // Catch: java.lang.Throwable -> L26
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Throwable -> L26
            android.net.Network r0 = r1.getActiveNetwork()     // Catch: java.lang.Throwable -> L26
            android.net.NetworkCapabilities r1 = r1.getNetworkCapabilities(r0)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L20
            r0 = 4
            boolean r1 = r1.hasTransport(r0)     // Catch: java.lang.Throwable -> L26
            r0 = 1
            if (r1 != r0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L26
            return r1
        L26:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ad2.c(android.content.Context):java.lang.Boolean");
    }
}
