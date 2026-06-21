package ad;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class k0 extends o implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient g1 f821e;

    public k0(g1 g1Var, int i) {
        this.f821e = g1Var;
    }

    @Override // ad.n
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // ad.n
    public final Map c() {
        throw new AssertionError("should never be called");
    }

    @Override // ad.n
    public final Set d() {
        throw new AssertionError("unreachable");
    }

    @Override // ad.n
    public final Set e() {
        return this.f821e.keySet();
    }

    @Override // ad.n
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g1 a() {
        return this.f821e;
    }

    public final j0 g(Object obj) {
        j0 j0Var = (j0) this.f821e.get(obj);
        if (j0Var != null) {
            return j0Var;
        }
        h0 h0Var = j0.f818c;
        return b1.f768f;
    }
}
