package vl;

import wl.b0;
import wl.d0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0 f34936j;

    public n(d0 d0Var, String str, b bVar) {
        super(d0Var, str, bVar);
        this.f34936j = new b0();
    }

    @Override // vl.p
    public final void s(p pVar) {
        super.s(pVar);
        this.f34936j.remove(pVar);
    }
}
