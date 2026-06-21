package t;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f33153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f33154k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f33156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f33157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f33158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.a f33159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f33160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f33161g = f33153j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f33162h = new ArrayList();
    public final k0 i = new k0(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f33153j = timeUnit.toNanos(1L);
        f33154k = timeUnit.toNanos(5L);
    }

    public m0(int i, j0.i iVar, j0.d dVar, o oVar, boolean z5, x.a aVar) {
        this.f33155a = i;
        this.f33156b = iVar;
        this.f33157c = dVar;
        this.f33158d = oVar;
        this.f33160f = z5;
        this.f33159e = aVar;
    }

    public final ed.d a(int i) {
        boolean zIsEmpty = this.f33162h.isEmpty();
        ed.d dVar = k0.l.f26777d;
        if (zIsEmpty) {
            return dVar;
        }
        if (this.i.b()) {
            o0 o0Var = new o0(null);
            o oVar = this.f33158d;
            oVar.a(o0Var);
            m3.c0 c0Var = new m3.c0(29, oVar, o0Var);
            j0.i iVar = oVar.f33173c;
            j1.k kVar = o0Var.f33197b;
            kVar.f26173c.a(c0Var, iVar);
            dVar = kVar;
        }
        k0.d dVarB = k0.d.b(dVar);
        oc.a aVar = new oc.a(this, i, 3);
        Executor executor = this.f33156b;
        return k0.j.j(k0.j.j(dVarB, aVar, executor), new s3.q(7, this), executor);
    }
}
