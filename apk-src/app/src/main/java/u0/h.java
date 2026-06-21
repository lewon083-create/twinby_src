package u0;

import g0.d0;
import g0.e1;
import i0.q;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34022c;

    public h(d0 d0Var) {
        super(d0Var);
        this.f34021b = "virtual-" + d0Var.e() + "-" + UUID.randomUUID().toString();
    }

    @Override // g0.e1, g0.d0
    public final int c() {
        return n(0);
    }

    @Override // g0.e1, g0.d0
    public final String e() {
        return this.f34021b;
    }

    @Override // g0.e1, g0.d0
    public final int n(int i) {
        return q.k(this.f19556a.n(i) - this.f34022c);
    }
}
