package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ot2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f41722a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f41723b;

    public static boolean a(Context context) {
        boolean zBooleanValue;
        Boolean bool = f41723b;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (f41722a) {
            try {
                Boolean bool2 = f41723b;
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    pt2 pt2VarA = fw2.a().a(context);
                    zBooleanValue = pt2VarA != null && pt2VarA.I0;
                    f41723b = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }
}
