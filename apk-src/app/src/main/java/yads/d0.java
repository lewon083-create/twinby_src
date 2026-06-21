package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f37582b;

    public d0(ux1 ux1Var) {
        this.f37582b = ux1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        a0 a0Var = (a0) this.f37582b;
        Iterator it = a0Var.f36593f.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        a0Var.f36593f.clear();
        a0Var.f36594g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = ((si1) this.f37582b.a().values()).iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        a0 a0Var = (a0) this.f37582b;
        a0Var.getClass();
        return new j(a0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((a0) this.f37582b).f36594g;
    }
}
