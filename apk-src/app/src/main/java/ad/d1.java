package ad;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient g1 f781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f783g;

    public d1(g1 g1Var, Object[] objArr, int i) {
        this.f781e = g1Var;
        this.f782f = objArr;
        this.f783g = i;
    }

    @Override // ad.f0
    public final int c(int i, Object[] objArr) {
        return a().c(i, objArr);
    }

    @Override // ad.f0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f781e.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // ad.f0
    public final boolean n() {
        return true;
    }

    @Override // ad.f0
    /* JADX INFO: renamed from: o */
    public final q1 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f783g;
    }

    @Override // ad.o0
    public final j0 t() {
        return new c1(this);
    }
}
