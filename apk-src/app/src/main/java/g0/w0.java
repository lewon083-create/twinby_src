package g0;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w0 f19788c = new w0(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0.l f19789b;

    public w0(Object obj) {
        this.f19789b = k0.j.e(obj);
    }

    @Override // g0.t1
    public final ed.d A() {
        return this.f19789b;
    }

    @Override // g0.t1
    public final void J(Executor executor, s1 s1Var) {
        this.f19789b.a(new e1.y(19, this, s1Var), executor);
    }

    @Override // g0.t1
    public final void v(s1 s1Var) {
    }
}
