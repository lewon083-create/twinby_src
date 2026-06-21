package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ka3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f40134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f40135b = new Object();

    public static void a(Context context, ct1 ct1Var) {
        pt2 pt2VarA;
        if (f40134a) {
            return;
        }
        synchronized (f40135b) {
            try {
                if (!f40134a && (pt2VarA = fw2.a().a(context)) != null && pt2VarA.f42025d0) {
                    Thread.setDefaultUncaughtExceptionHandler(new ja3(ct1Var, Thread.getDefaultUncaughtExceptionHandler(), pt2VarA));
                    f40134a = true;
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
