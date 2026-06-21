package fb;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f16732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f16733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f16734f;

    public d(e eVar, int i, int i10) {
        this.f16734f = eVar;
        this.f16732d = i;
        this.f16733e = i10;
    }

    @Override // fb.a
    public final Object[] a() {
        return this.f16734f.a();
    }

    @Override // fb.a
    public final int c() {
        return this.f16734f.c() + this.f16732d;
    }

    @Override // fb.a
    public final int e() {
        return this.f16734f.c() + this.f16732d + this.f16733e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        j0.g.k0(i, this.f16733e);
        return this.f16734f.get(i + this.f16732d);
    }

    @Override // fb.e, java.util.List
    /* JADX INFO: renamed from: n */
    public final e subList(int i, int i10) {
        j0.g.n0(i, i10, this.f16733e);
        int i11 = this.f16732d;
        return this.f16734f.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16733e;
    }
}
