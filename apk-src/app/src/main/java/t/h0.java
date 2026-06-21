package t;

import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f33059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x.a f33060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33062d = false;

    public h0(o oVar, int i, x.a aVar) {
        this.f33059a = oVar;
        this.f33061c = i;
        this.f33060b = aVar;
    }

    @Override // t.n0
    public final ed.d a(TotalCaptureResult totalCaptureResult) {
        if (!g0.r0.i(this.f33061c, totalCaptureResult)) {
            return k0.j.e(Boolean.FALSE);
        }
        com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "Trigger AE");
        this.f33062d = true;
        k0.d dVarB = k0.d.b(i0.o.w(new s3.q(4, this)));
        qg.a aVar = new qg.a(20);
        return k0.j.j(dVarB, new v7.f(25, aVar), hl.d.j());
    }

    @Override // t.n0
    public final boolean b() {
        return this.f33061c == 0;
    }

    @Override // t.n0
    public final void c() {
        if (this.f33062d) {
            com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "cancel TriggerAePreCapture");
            this.f33059a.f33178h.a(false, true);
            this.f33060b.f35494b = false;
        }
    }
}
