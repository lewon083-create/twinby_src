package z;

import g0.u0;
import j0.i;
import j1.h;
import k0.j;
import t.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f45769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f45770d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f45773g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45767a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45768b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f45771e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s.a f45772f = new s.a();

    public c(o oVar, i iVar) {
        this.f45769c = oVar;
        this.f45770d = iVar;
    }

    public final ed.d a(g gVar) {
        synchronized (this.f45771e) {
            s.a aVar = this.f45772f;
            aVar.getClass();
            u0 u0Var = u0.f19775e;
            for (g0.g gVar2 : gVar.d()) {
                aVar.f32367b.x(gVar2, u0Var, gVar.a(gVar2));
            }
        }
        return j.f(i0.o.w(new a(this, 1)));
    }
}
