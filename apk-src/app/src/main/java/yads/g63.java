package yads;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g63 {
    public static boolean a() {
        return Intrinsics.a(Thread.currentThread(), Looper.getMainLooper().getThread());
    }
}
