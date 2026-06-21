package yads;

import android.app.Activity;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ka2 {
    public static ha2 a(Activity activity, w1 w1Var) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            objS = Build.VERSION.SDK_INT >= 33 ? new ja2(activity, w1Var) : new ia2();
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (ij.m.a(objS) != null) {
            objS = new ia2();
        }
        return (ha2) objS;
    }
}
