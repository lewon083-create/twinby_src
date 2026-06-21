package t;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements j1.i, k0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f33216c;

    public /* synthetic */ p0(q0 q0Var, int i) {
        this.f33215b = i;
        this.f33216c = q0Var;
    }

    @Override // k0.a
    public ed.d apply(Object obj) {
        switch (this.f33215b) {
            case 1:
                return this.f33216c.f33234a.f33178h.c(true);
            case 2:
                return i0.o.w(new p0(this.f33216c, 0));
            case 3:
                r1 r1Var = this.f33216c.f33234a.f33178h;
                r1Var.getClass();
                return i0.o.w(new n1(r1Var, 1));
            default:
                long j10 = q0.f33232f;
                q0 q0Var = this.f33216c;
                ScheduledExecutorService scheduledExecutorService = q0Var.f33236c;
                o oVar = q0Var.f33234a;
                qg.a aVar = new qg.a(24);
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
        q0 q0Var = this.f33216c;
        if (!q0Var.f33238e.k()) {
            hVar.b(null);
            return "EnableTorchInternal";
        }
        com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
        q0Var.f33234a.t(2);
        hVar.b(null);
        return "EnableTorchInternal";
    }
}
