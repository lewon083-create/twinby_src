package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xm2 extends w51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient u51 f44769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient r51 f44770e;

    public xm2(u51 u51Var, ym2 ym2Var) {
        this.f44769d = u51Var;
        this.f44770e = ym2Var;
    }

    @Override // yads.w51, yads.l51
    public final r51 a() {
        return this.f44770e;
    }

    @Override // yads.l51, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f44769d.get(obj) != null;
    }

    @Override // yads.l51
    public final boolean e() {
        return true;
    }

    @Override // yads.l51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final ma3 iterator() {
        return this.f44770e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((zm2) this.f44769d).f45465g;
    }

    @Override // yads.l51
    public final int a(int i, Object[] objArr) {
        return this.f44770e.a(i, objArr);
    }
}
