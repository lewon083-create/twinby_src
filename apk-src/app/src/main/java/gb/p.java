package gb;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f20100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f20101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f20102f;

    public p(q qVar, int i, int i10) {
        this.f20102f = qVar;
        this.f20100d = i;
        this.f20101e = i10;
    }

    @Override // gb.n
    public final Object[] a() {
        return this.f20102f.a();
    }

    @Override // gb.n
    public final int c() {
        return this.f20102f.c() + this.f20100d;
    }

    @Override // gb.n
    public final int e() {
        return this.f20102f.c() + this.f20100d + this.f20101e;
    }

    @Override // gb.n
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hl.d.K(i, this.f20101e);
        return this.f20102f.get(i + this.f20100d);
    }

    @Override // gb.q, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final q subList(int i, int i10) {
        hl.d.M(i, i10, this.f20101e);
        int i11 = this.f20100d;
        return this.f20102f.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20101e;
    }
}
