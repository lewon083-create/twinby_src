package yads;

import android.net.Uri;
import android.webkit.URLUtil;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class bb3 {
    public static String a(String str) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            objS = Uri.parse(b(str)).getHost();
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        return (String) objS;
    }

    public static String b(String str) {
        return (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) ? str : com.google.android.gms.internal.ads.om1.k("https://", str);
    }
}
