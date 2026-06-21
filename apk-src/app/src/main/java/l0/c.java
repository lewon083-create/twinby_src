package l0;

import a0.m1;
import g0.r2;
import g0.v;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f27718a;

    public c(v vVar) {
        this.f27718a = vVar;
    }

    @Override // a0.m1
    public final void a(i0.k kVar) {
        this.f27718a.a(kVar);
    }

    @Override // a0.m1
    public final r2 c() {
        return this.f27718a.c();
    }

    @Override // a0.m1
    public final int d() {
        int iM = z.m(this.f27718a.d());
        if (iM == 1) {
            return 2;
        }
        if (iM != 2) {
            return iM != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // a0.m1
    public final long getTimestamp() {
        return this.f27718a.getTimestamp();
    }
}
