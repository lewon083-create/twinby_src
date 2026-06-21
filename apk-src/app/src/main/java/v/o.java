package v;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    @Override // v.n, v.l, v.j
    public final Object c() {
        Object obj = this.f34624a;
        f2.g.b(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // v.n, v.l, v.j
    public final void g(long j10) {
        ((OutputConfiguration) c()).setDynamicRangeProfile(j10);
    }

    @Override // v.j
    public final void h(int i) {
        ((OutputConfiguration) c()).setMirrorMode(i);
    }

    @Override // v.j
    public final void j(long j10) {
        if (j10 == -1) {
            return;
        }
        ((OutputConfiguration) c()).setStreamUseCase(j10);
    }
}
