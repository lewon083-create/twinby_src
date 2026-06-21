package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i53 implements xv {
    public final l53 a(Looper looper, Handler.Callback callback) {
        return new l53(new Handler(looper, callback));
    }
}
