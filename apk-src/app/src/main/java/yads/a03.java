package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a03 extends w51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f36604d;

    public a03(Object obj) {
        this.f36604d = pg2.a(obj);
    }

    @Override // yads.w51, yads.l51
    public final r51 a() {
        return r51.a(this.f36604d);
    }

    @Override // yads.l51, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f36604d.equals(obj);
    }

    @Override // yads.l51
    public final boolean e() {
        return false;
    }

    @Override // yads.w51, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f36604d.hashCode();
    }

    @Override // yads.l51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final ma3 iterator() {
        return new zd1(this.f36604d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f36604d.toString() + ']';
    }

    @Override // yads.l51
    public final int a(int i, Object[] objArr) {
        objArr[i] = this.f36604d;
        return i + 1;
    }
}
