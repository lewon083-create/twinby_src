package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xb2 {
    public static bc2 a(boolean z5) {
        return new bc2(z5, new Handler(Looper.getMainLooper()));
    }
}
