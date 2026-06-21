package w0;

import androidx.lifecycle.f0;
import androidx.lifecycle.n;
import androidx.lifecycle.t;
import androidx.lifecycle.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f34949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f34950c;

    public d(u uVar, e eVar) {
        this.f34950c = uVar;
        this.f34949b = eVar;
    }

    @f0(n.ON_DESTROY)
    public void onDestroy(u uVar) {
        this.f34949b.m(uVar);
    }

    @f0(n.ON_START)
    public void onStart(u uVar) {
        this.f34949b.g(uVar);
    }

    @f0(n.ON_STOP)
    public void onStop(u uVar) {
        this.f34949b.h(uVar);
    }
}
