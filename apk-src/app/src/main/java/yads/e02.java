package yads;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e02 {
    public static f02 a() {
        if (f02.f38311d == null) {
            synchronized (f02.f38310c) {
                try {
                    if (f02.f38311d == null) {
                        f02.f38311d = new f02(new Handler(Looper.getMainLooper()));
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        f02 f02Var = f02.f38311d;
        if (f02Var != null) {
            return f02Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
