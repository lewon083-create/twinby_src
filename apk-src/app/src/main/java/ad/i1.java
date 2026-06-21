package ad;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends o0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object[] f811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i1 f812k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient Object[] f815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f816h;
    public final transient int i;

    static {
        Object[] objArr = new Object[0];
        f811j = objArr;
        f812k = new i1(objArr, 0, objArr, 0, 0);
    }

    public i1(Object[] objArr, int i, Object[] objArr2, int i10, int i11) {
        this.f813e = objArr;
        this.f814f = i;
        this.f815g = objArr2;
        this.f816h = i10;
        this.i = i11;
    }

    @Override // ad.f0
    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.f813e;
        int i10 = this.i;
        System.arraycopy(objArr2, 0, objArr, i, i10);
        return i + i10;
    }

    @Override // ad.f0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f815g;
            if (objArr.length != 0) {
                int iR = q.r(obj);
                while (true) {
                    int i = iR & this.f816h;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iR = i + 1;
                }
            }
        }
        return false;
    }

    @Override // ad.f0
    public final Object[] e() {
        return this.f813e;
    }

    @Override // ad.f0
    public final int f() {
        return this.i;
    }

    @Override // ad.f0
    public final int g() {
        return 0;
    }

    @Override // ad.o0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f814f;
    }

    @Override // ad.f0
    public final boolean n() {
        return false;
    }

    @Override // ad.f0
    /* JADX INFO: renamed from: o */
    public final q1 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i;
    }

    @Override // ad.o0
    public final j0 t() {
        return j0.p(this.i, this.f813e);
    }
}
