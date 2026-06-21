package yads;

import java.net.URI;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ab3 {
    public static String a(String str) {
        Object objS;
        String str2;
        try {
            ij.k kVar = ij.m.f21341c;
            boolean zY = StringsKt.y(str, "://", false);
            if (!zY) {
                str = b(str);
            }
            URI uri = new URI(str);
            if (zY) {
                str2 = uri.getScheme() + "://";
            } else {
                str2 = "";
            }
            objS = str2 + uri.getHost();
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = "bad_url";
        }
        return (String) objS;
    }

    public static String b(String str) {
        return com.google.android.gms.internal.ads.om1.k("stub://", str);
    }
}
