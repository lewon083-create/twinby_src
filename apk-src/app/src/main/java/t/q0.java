package t;

import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements n0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f33232f = TimeUnit.SECONDS.toNanos(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f33233g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f33234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f33235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f33236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0.i f33237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m4.d f33238e;

    public q0(o oVar, j0.i iVar, j0.d dVar, m4.d dVar2) {
        this.f33234a = oVar;
        this.f33235b = iVar;
        this.f33236c = dVar;
        this.f33238e = dVar2;
        l0.i iVar2 = oVar.f33187r;
        Objects.requireNonNull(iVar2);
        this.f33237d = iVar2;
    }

    @Override // t.n0
    public final ed.d a(TotalCaptureResult totalCaptureResult) {
        com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
        AtomicReference atomicReference = new AtomicReference();
        j1.k kVarW = i0.o.w(new e1.f(atomicReference, 5));
        k0.d dVarB = k0.d.b(i0.o.w(new oi.i(14, this, atomicReference)));
        p0 p0Var = new p0(this, 1);
        Executor executor = this.f33235b;
        k0.b bVarJ = k0.j.j(k0.j.j(k0.j.j(k0.j.j(k0.j.j(dVarB, p0Var, executor), new p0(this, 2), executor), new oi.i(15, this, kVarW), executor), new p0(this, 3), executor), new p0(this, 4), executor);
        qg.a aVar = new qg.a(25);
        return k0.j.j(bVarJ, new v7.f(25, aVar), hl.d.j());
    }

    @Override // t.n0
    public final boolean b() {
        return false;
    }

    @Override // t.n0
    public final void c() {
        o oVar = this.f33234a;
        r1 r1Var = oVar.f33178h;
        com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
        if (this.f33238e.k()) {
            oVar.t(0);
        }
        r1Var.c(false).a(new com.appsflyer.internal.m(7), this.f33235b);
        r1Var.a(false, true);
        j0.d dVarS = hl.d.s();
        l0.i iVar = this.f33237d;
        Objects.requireNonNull(iVar);
        dVarS.execute(new a0(2, iVar));
    }
}
