package yads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hn0 implements dq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fn0 f39250a;

    public hn0(Handler handler) {
        this.f39250a = new fn0(handler);
    }

    public final void a(ro2 ro2Var, xp2 xp2Var, sr srVar) {
        synchronized (ro2Var.f42662f) {
            ro2Var.f42667l = true;
        }
        ro2Var.a("post-response");
        fn0 fn0Var = this.f39250a;
        fn0Var.f38493a.post(new gn0(ro2Var, xp2Var, srVar));
    }
}
