package t;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements j1.i, k0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f33250c;

    public /* synthetic */ r0(s0 s0Var, int i) {
        this.f33249b = i;
        this.f33250c = s0Var;
    }

    @Override // k0.a
    public ed.d apply(Object obj) {
        switch (this.f33249b) {
            case 1:
                s0 s0Var = this.f33250c;
                if (!s0Var.f33283f) {
                    return k0.l.f26777d;
                }
                r1 r1Var = s0Var.f33278a.f33178h;
                r1Var.getClass();
                return i0.o.w(new n1(r1Var, 1));
            default:
                long j10 = s0.f33276g;
                s0 s0Var2 = this.f33250c;
                ScheduledExecutorService scheduledExecutorService = s0Var2.f33282e;
                o oVar = s0Var2.f33278a;
                qg.a aVar = new qg.a(27);
                long millis = TimeUnit.NANOSECONDS.toMillis(j10);
                o0 o0Var = new o0(aVar);
                oVar.a(o0Var);
                m3.c0 c0Var = new m3.c0(29, oVar, o0Var);
                j0.i iVar = oVar.f33173c;
                j1.k kVar = o0Var.f33197b;
                kVar.f26173c.a(c0Var, iVar);
                return i0.o.w(new e9.g(kVar, scheduledExecutorService, millis, 4));
        }
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        this.f33250c.f33278a.f33179j.a(2, hVar);
        return "TorchOn";
    }
}
