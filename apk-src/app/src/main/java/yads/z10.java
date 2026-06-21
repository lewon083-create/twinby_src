package yads;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z10 {
    public static hk.a0 a(sm0 sm0Var) {
        CoroutineContext y10Var = sm0Var != null ? new y10(sm0Var) : new x10();
        hk.s1 s1Var = new hk.s1();
        ok.e eVar = hk.k0.f20682a;
        return hk.c0.a(kotlin.coroutines.e.d(s1Var, ok.d.f30722d).plus(y10Var));
    }

    public static hk.a0 b(sm0 sm0Var) {
        CoroutineContext y10Var = sm0Var != null ? new y10(sm0Var) : new x10();
        hk.s1 s1Var = new hk.s1();
        ok.e eVar = hk.k0.f20682a;
        return hk.c0.a(kotlin.coroutines.e.d(s1Var, mk.n.f28934a.f21368f).plus(y10Var));
    }

    public static hk.a0 a(ct1 ct1Var) {
        return hk.c0.a(kotlin.coroutines.e.d(new hk.s1(), hk.k0.f20682a).plus(new y10(ct1Var)));
    }
}
