package t;

import g0.x2;
import g0.z2;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements x2 {
    public final g0.q1 L;

    public w1() {
        g0.q1 q1VarV = g0.q1.v();
        q1VarV.y(x2.f19799u, new x0());
        q1VarV.y(g0.h1.f19579f, 34);
        q1VarV.y(l0.k.J, x1.class);
        q1VarV.y(l0.k.I, x1.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.L = q1VarV;
    }

    @Override // g0.b2
    public final g0.v0 getConfig() {
        return this.L;
    }

    @Override // g0.x2
    public final z2 n() {
        return z2.f19817g;
    }
}
