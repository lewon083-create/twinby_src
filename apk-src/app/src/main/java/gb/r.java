package gb;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f20104f = new r(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f20105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f20106e;

    public r(int i, Object[] objArr) {
        this.f20105d = objArr;
        this.f20106e = i;
    }

    @Override // gb.n
    public final Object[] a() {
        return this.f20105d;
    }

    @Override // gb.n
    public final int c() {
        return 0;
    }

    @Override // gb.n
    public final int e() {
        return this.f20106e;
    }

    @Override // gb.n
    public final boolean f() {
        return false;
    }

    @Override // gb.q, gb.n
    public final int g(Object[] objArr) {
        Object[] objArr2 = this.f20105d;
        int i = this.f20106e;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hl.d.K(i, this.f20106e);
        Object obj = this.f20105d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20106e;
    }
}
