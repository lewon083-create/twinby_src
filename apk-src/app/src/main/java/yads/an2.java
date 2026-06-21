package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class an2 extends w51 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final an2 f36787j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f36788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f36789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f36790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f36791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f36792h;

    static {
        Object[] objArr = new Object[0];
        f36787j = new an2(objArr, 0, objArr, 0, 0);
    }

    public an2(Object[] objArr, int i, Object[] objArr2, int i10, int i11) {
        this.f36788d = objArr;
        this.f36789e = i;
        this.f36790f = objArr2;
        this.f36791g = i10;
        this.f36792h = i11;
    }

    @Override // yads.l51
    public final int a(int i, Object[] objArr) {
        System.arraycopy(this.f36788d, 0, objArr, i, this.f36792h);
        return i + this.f36792h;
    }

    @Override // yads.l51
    public final Object[] b() {
        return this.f36788d;
    }

    @Override // yads.l51
    public final int c() {
        return this.f36792h;
    }

    @Override // yads.l51, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f36790f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA = q01.a(obj.hashCode());
        while (true) {
            int i = iA & this.f36791g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i + 1;
        }
    }

    @Override // yads.l51
    public final int d() {
        return 0;
    }

    @Override // yads.l51
    public final boolean e() {
        return false;
    }

    @Override // yads.w51
    public final r51 f() {
        return r51.b(this.f36792h, this.f36788d);
    }

    @Override // yads.w51, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f36789e;
    }

    @Override // yads.l51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final ma3 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f36792h;
    }
}
