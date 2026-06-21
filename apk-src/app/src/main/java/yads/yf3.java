package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kf3 f45044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uf3 f45045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f45046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45047d;

    public /* synthetic */ yf3(kf3 kf3Var, uf3 uf3Var) {
        this(kf3Var, uf3Var, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        if (this.f45047d) {
            this.f45045b.b();
            this.f45046c.removeCallbacksAndMessages(null);
            this.f45047d = false;
        }
    }

    public yf3(kf3 kf3Var, uf3 uf3Var, Handler handler) {
        this.f45044a = kf3Var;
        this.f45045b = uf3Var;
        this.f45046c = handler;
    }
}
