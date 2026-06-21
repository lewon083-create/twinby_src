package ii;

import t.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f21317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f21319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0 f21320d;

    public q(f fVar, String str) {
        this(fVar, str, x.f21321b, null);
    }

    public final void a(String str, Object obj, p pVar) {
        this.f21317a.g(this.f21318b, this.f21319c.f(new n(str, obj)), pVar == null ? null : new a(1, this, pVar));
    }

    public final void b(o oVar) {
        String str = this.f21318b;
        f fVar = this.f21317a;
        t0 t0Var = this.f21320d;
        if (t0Var != null) {
            fVar.b(str, oVar != null ? new h3.e(17, (Object) this, (Object) oVar, false) : null, t0Var);
        } else {
            fVar.d(str, oVar != null ? new h3.e(17, (Object) this, (Object) oVar, false) : null);
        }
    }

    public q(f fVar, String str, r rVar, t0 t0Var) {
        this.f21317a = fVar;
        this.f21318b = str;
        this.f21319c = rVar;
        this.f21320d = t0Var;
    }
}
