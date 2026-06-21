package t;

import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements n0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f33276g = TimeUnit.SECONDS.toNanos(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f33277h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f33278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33280c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f33281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f33282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f33283f;

    public s0(o oVar, int i, j0.i iVar, j0.d dVar, boolean z5) {
        this.f33278a = oVar;
        this.f33279b = i;
        this.f33281d = iVar;
        this.f33282e = dVar;
        this.f33283f = z5;
    }

    @Override // t.n0
    public final ed.d a(TotalCaptureResult totalCaptureResult) {
        com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + g0.r0.i(this.f33279b, totalCaptureResult));
        if (g0.r0.i(this.f33279b, totalCaptureResult)) {
            if (this.f33278a.f33188s == 0) {
                com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "Turn on torch");
                this.f33280c = true;
                return k0.j.j(k0.j.j(k0.j.j(k0.d.b(i0.o.w(new r0(this, 0))), new r0(this, 1), this.f33281d), new r0(this, 2), this.f33281d), new v7.f(25, new qg.a(26)), hl.d.j());
            }
            com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "Torch already on, not turn on");
        }
        return k0.j.e(Boolean.FALSE);
    }

    @Override // t.n0
    public final boolean b() {
        return this.f33279b == 0;
    }

    @Override // t.n0
    public final void c() {
        if (this.f33280c) {
            o oVar = this.f33278a;
            oVar.f33179j.a(0, null);
            com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "Turning off torch");
            if (this.f33283f) {
                oVar.f33178h.a(false, true);
            }
        }
    }
}
