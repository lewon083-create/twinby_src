package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class oh3 implements zh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f41539a = new Handler(Looper.getMainLooper());

    public final void a() {
        this.f41539a.post(new t.a0(26, this));
    }

    public static final void a(oh3 oh3Var) {
        oh3Var.getClass();
    }
}
