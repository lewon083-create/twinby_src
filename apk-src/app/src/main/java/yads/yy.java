package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ yy f45188a = new yy();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f45189b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile cz f45190c;

    public static zy a(Context context) {
        if (f45190c == null) {
            synchronized (f45189b) {
                try {
                    if (f45190c == null) {
                        f45190c = new cz(wg1.a(context, "YadPreferenceFile"), new en0(), new u7(), new s33());
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        cz czVar = f45190c;
        if (czVar != null) {
            return czVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
