package yads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z83 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = a93.i;
        if (handler != null) {
            handler.post(a93.f36659j);
            a93.i.postDelayed(a93.f36660k, 200L);
        }
    }
}
