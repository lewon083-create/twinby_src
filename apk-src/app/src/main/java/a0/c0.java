package a0;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0.q1 f50a;

    public c0(int i) {
        switch (i) {
            case 1:
                this.f50a = g0.q1.v();
                return;
            default:
                g0.q1 q1VarV = g0.q1.v();
                this.f50a = q1VarV;
                g0.g gVar = l0.k.J;
                Class cls = (Class) q1VarV.g(gVar, null);
                if (cls != null && !cls.equals(b0.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                q1VarV.y(gVar, b0.class);
                g0.g gVar2 = l0.k.I;
                if (q1VarV.g(gVar2, null) == null) {
                    q1VarV.y(gVar2, b0.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    public static c0 d(g0.v0 v0Var) {
        c0 c0Var = new c0(1);
        v0Var.f(new oi.i(27, c0Var, v0Var));
        return c0Var;
    }

    @Override // a0.j0
    public g0.q1 a() {
        return this.f50a;
    }

    public z.g c() {
        return new z.g(g0.u1.u(this.f50a));
    }
}
