package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gy2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile iy2 f38945b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ gy2 f38944a = new gy2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f38946c = new Object();

    public static hy2 a(Context context) {
        if (f38945b == null) {
            synchronized (f38946c) {
                try {
                    if (f38945b == null) {
                        f38945b = new iy2(wg1.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        iy2 iy2Var = f38945b;
        if (iy2Var != null) {
            return iy2Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
