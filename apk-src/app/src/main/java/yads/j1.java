package yads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f39694a = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static k1 f39695b;

    public static final void a(Context context) {
        synchronized (f39694a) {
            try {
                if (f39695b == null) {
                    Context applicationContext = context.getApplicationContext();
                    Activity activity = null;
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application != null) {
                        Activity activity2 = context instanceof Activity ? (Activity) context : null;
                        if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                            activity = activity2;
                        }
                        k1 k1Var = new k1(new o1(activity));
                        f39695b = k1Var;
                        application.registerActivityLifecycleCallbacks(k1Var);
                    }
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final Activity a() {
        Activity activityA;
        synchronized (f39694a) {
            k1 k1Var = f39695b;
            activityA = k1Var != null ? k1Var.a() : null;
        }
        return activityA;
    }
}
