package g0;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface f0 extends a0.n, a0.p2 {
    @Override // a0.n
    default c0 a() {
        return g();
    }

    @Override // a0.n
    default d0 b() {
        return p();
    }

    default boolean f() {
        return b().l() == 0;
    }

    c0 g();

    default w i() {
        return z.f19810a;
    }

    void k(Collection collection);

    void l(ArrayList arrayList);

    default boolean n() {
        return true;
    }

    d0 p();

    ed.d release();

    default void m() {
    }

    default void j(boolean z5) {
    }

    default void o(boolean z5) {
    }

    default void q(w wVar) {
    }
}
