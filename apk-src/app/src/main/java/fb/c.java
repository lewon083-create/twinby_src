package fb;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient e f16731d;

    public c(e eVar) {
        this.f16731d = eVar;
    }

    @Override // fb.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f16731d.contains(obj);
    }

    @Override // fb.e
    public final e g() {
        return this.f16731d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        e eVar = this.f16731d;
        j0.g.k0(i, eVar.size());
        return eVar.get((eVar.size() - 1) - i);
    }

    @Override // fb.e, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f16731d.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // fb.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f16731d.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // fb.e, java.util.List
    /* JADX INFO: renamed from: n */
    public final e subList(int i, int i10) {
        e eVar = this.f16731d;
        j0.g.n0(i, i10, eVar.size());
        return eVar.subList(eVar.size() - i10, eVar.size() - i).g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16731d.size();
    }
}
