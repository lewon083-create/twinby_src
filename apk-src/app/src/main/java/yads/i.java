package yads;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends a0 {
    public i(Map map) {
        super(map);
    }

    @Override // yads.e0
    public final n a() {
        n nVar = this.f37940e;
        if (nVar != null) {
            return nVar;
        }
        n nVarB = ((ux1) this).b();
        this.f37940e = nVarB;
        return nVarB;
    }

    @Override // yads.e0
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f36593f.get(obj);
        if (collection == null) {
            List list = (List) ((ux1) this).f43805h.get();
            if (list.add(obj2)) {
                this.f36594g++;
                this.f36593f.put(obj, list);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.f36594g++;
        return true;
    }
}
