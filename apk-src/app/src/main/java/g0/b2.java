package g0;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface b2 extends v0 {
    @Override // g0.v0
    default Object a(g gVar) {
        return getConfig().a(gVar);
    }

    @Override // g0.v0
    default Object b(g gVar, u0 u0Var) {
        return getConfig().b(gVar, u0Var);
    }

    @Override // g0.v0
    default u0 c(g gVar) {
        return getConfig().c(gVar);
    }

    @Override // g0.v0
    default Set d() {
        return getConfig().d();
    }

    @Override // g0.v0
    default Set e(g gVar) {
        return getConfig().e(gVar);
    }

    @Override // g0.v0
    default void f(oi.i iVar) {
        getConfig().f(iVar);
    }

    @Override // g0.v0
    default Object g(g gVar, Object obj) {
        return getConfig().g(gVar, obj);
    }

    v0 getConfig();

    @Override // g0.v0
    default boolean h(g gVar) {
        return getConfig().h(gVar);
    }
}
