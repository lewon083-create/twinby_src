package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vi1 extends qx0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f44057f = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f44058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f44059e;

    public vi1(v63 v63Var, Object obj, Object obj2) {
        super(v63Var);
        this.f44058d = obj;
        this.f44059e = obj2;
    }

    @Override // yads.qx0, yads.v63
    public final int a(Object obj) {
        Object obj2;
        v63 v63Var = this.f42417c;
        if (f44057f.equals(obj) && (obj2 = this.f44059e) != null) {
            obj = obj2;
        }
        return v63Var.a(obj);
    }

    @Override // yads.v63
    public final s63 a(int i, s63 s63Var, boolean z5) {
        this.f42417c.a(i, s63Var, z5);
        if (lb3.a(s63Var.f42824c, this.f44059e) && z5) {
            s63Var.f42824c = f44057f;
        }
        return s63Var;
    }

    @Override // yads.qx0, yads.v63
    public final Object a(int i) {
        Object objA = this.f42417c.a(i);
        return lb3.a(objA, this.f44059e) ? f44057f : objA;
    }

    @Override // yads.qx0, yads.v63
    public final u63 a(int i, u63 u63Var, long j10) {
        this.f42417c.a(i, u63Var, j10);
        if (lb3.a(u63Var.f43579b, this.f44058d)) {
            u63Var.f43579b = u63.f43575s;
        }
        return u63Var;
    }

    public static vi1 a(hm1 hm1Var) {
        return new vi1(new wi1(hm1Var), u63.f43575s, f44057f);
    }
}
