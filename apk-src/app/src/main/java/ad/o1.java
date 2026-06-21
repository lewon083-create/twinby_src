package ad;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object f848e;

    public o1(Object obj) {
        obj.getClass();
        this.f848e = obj;
    }

    @Override // ad.o0, ad.f0
    public final j0 a() {
        return j0.w(this.f848e);
    }

    @Override // ad.f0
    public final int c(int i, Object[] objArr) {
        objArr[i] = this.f848e;
        return i + 1;
    }

    @Override // ad.f0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f848e.equals(obj);
    }

    @Override // ad.o0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f848e.hashCode();
    }

    @Override // ad.f0
    public final boolean n() {
        return false;
    }

    @Override // ad.f0
    /* JADX INFO: renamed from: o */
    public final q1 iterator() {
        return new r0(this.f848e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f848e.toString() + ']';
    }
}
