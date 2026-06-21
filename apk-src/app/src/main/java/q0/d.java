package q0;

import g0.r0;
import m3.c0;
import t.j0;
import yads.af;
import yads.of1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements j1.i, k0.a, of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31561d;

    public /* synthetic */ d(Object obj, int i, int i10) {
        this.f31561d = obj;
        this.f31559b = i;
        this.f31560c = i10;
    }

    @Override // k0.a
    public ed.d apply(Object obj) {
        r0 r0Var = ((t.o) this.f31561d).f33184o;
        int i = this.f31559b;
        int i10 = this.f31560c;
        return k0.j.e(new j0(r0Var.f(i, i10, 1), (j0.i) r0Var.f19732g, i10));
    }

    @Override // yads.of1
    public void invoke(Object obj) {
        int i = this.f31560c;
        int i10 = this.f31559b;
        ((af) obj).getClass();
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        f fVar = (f) this.f31561d;
        fVar.b(new c0(14, fVar, new a(this.f31559b, this.f31560c, hVar)), new k0.e(1, hVar));
        return "DefaultSurfaceProcessor#snapshot";
    }
}
