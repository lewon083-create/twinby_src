package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f45216a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile yy0 f45217b;

    public static final yy0 a(Context context) {
        if (f45217b == null) {
            synchronized (f45216a) {
                try {
                    if (f45217b == null) {
                        f45217b = new yy0(context, "com.huawei.hms.location.LocationServices");
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        yy0 yy0Var = f45217b;
        if (yy0Var != null) {
            return yy0Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
