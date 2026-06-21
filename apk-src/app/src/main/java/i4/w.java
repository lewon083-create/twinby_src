package i4;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f21050e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21052d;

    public w(j3.o0 o0Var, Object obj, Object obj2) {
        super(o0Var);
        this.f21051c = obj;
        this.f21052d = obj2;
    }

    @Override // i4.s, j3.o0
    public final int b(Object obj) {
        Object obj2;
        if (f21050e.equals(obj) && (obj2 = this.f21052d) != null) {
            obj = obj2;
        }
        return this.f20995b.b(obj);
    }

    @Override // i4.s, j3.o0
    public final j3.m0 f(int i, j3.m0 m0Var, boolean z5) {
        this.f20995b.f(i, m0Var, z5);
        if (Objects.equals(m0Var.f26275b, this.f21052d) && z5) {
            m0Var.f26275b = f21050e;
        }
        return m0Var;
    }

    @Override // i4.s, j3.o0
    public final Object l(int i) {
        Object objL = this.f20995b.l(i);
        return Objects.equals(objL, this.f21052d) ? f21050e : objL;
    }

    @Override // i4.s, j3.o0
    public final j3.n0 m(int i, j3.n0 n0Var, long j10) {
        this.f20995b.m(i, n0Var, j10);
        if (Objects.equals(n0Var.f26308a, this.f21051c)) {
            n0Var.f26308a = j3.n0.f26306q;
        }
        return n0Var;
    }
}
