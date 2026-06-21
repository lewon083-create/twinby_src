package ad;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient g1 f789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient f1 f790f;

    public e1(g1 g1Var, f1 f1Var) {
        this.f789e = g1Var;
        this.f790f = f1Var;
    }

    @Override // ad.o0, ad.f0
    public final j0 a() {
        return this.f790f;
    }

    @Override // ad.f0
    public final int c(int i, Object[] objArr) {
        return this.f790f.c(i, objArr);
    }

    @Override // ad.f0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f789e.get(obj) != null;
    }

    @Override // ad.f0
    public final boolean n() {
        return true;
    }

    @Override // ad.f0
    /* JADX INFO: renamed from: o */
    public final q1 iterator() {
        return this.f790f.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f789e.f802g;
    }
}
