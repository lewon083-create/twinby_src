package yads;

import java.net.URI;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class eb3 {
    public static boolean a(String str) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            new URI(str);
            objS = Boolean.valueOf((str == null || str.length() == 0) ? false : true);
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        Object obj = Boolean.FALSE;
        if (objS instanceof ij.l) {
            objS = obj;
        }
        return ((Boolean) objS).booleanValue();
    }
}
