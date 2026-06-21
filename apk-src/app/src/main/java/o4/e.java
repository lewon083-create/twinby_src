package o4;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import j3.y0;
import s3.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f29610b;

    public e(i iVar) {
        this.f29610b = iVar;
    }

    @Override // o4.x
    public final void a() {
        i iVar = this.f29610b;
        Surface surface = iVar.f29627a1;
        if (surface != null) {
            v vVar = iVar.L0;
            Handler handler = vVar.f29700a;
            if (handler != null) {
                handler.post(new io.sentry.android.core.n(vVar, surface, SystemClock.elapsedRealtime(), 2));
            }
            iVar.f29632d1 = true;
        }
    }

    @Override // o4.x
    public final void b() {
        i iVar = this.f29610b;
        if (iVar.f29627a1 != null) {
            iVar.P0(0, 1);
        }
    }

    @Override // o4.x
    public final void c() {
        a0 a0Var = this.f29610b.K;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    @Override // o4.x
    public final void onVideoSizeChanged(y0 y0Var) {
    }
}
