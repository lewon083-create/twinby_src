package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile vz0 f44532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f44533b = new Object();

    public static final vz0 a(Context context) {
        if (f44532a == null) {
            synchronized (f44533b) {
                try {
                    if (f44532a == null) {
                        f44532a = new vz0(wg1.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        vz0 vz0Var = f44532a;
        if (vz0Var != null) {
            return vz0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
