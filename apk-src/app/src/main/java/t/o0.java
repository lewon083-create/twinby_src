package t;

import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j1.h f33196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.k f33197b = i0.o.w(new s3.q(8, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qg.a f33198c;

    public o0(qg.a aVar) {
        this.f33198c = aVar;
    }

    @Override // t.n
    public final boolean b(TotalCaptureResult totalCaptureResult) {
        boolean zH;
        qg.a aVar = this.f33198c;
        if (aVar != null) {
            switch (aVar.f32109b) {
                case 22:
                    zH = g0.r0.h(totalCaptureResult, false);
                    break;
                case 23:
                default:
                    zH = g0.r0.h(totalCaptureResult, true);
                    break;
                case 24:
                    zH = g0.r0.h(totalCaptureResult, false);
                    break;
            }
            if (!zH) {
                return false;
            }
        }
        this.f33196a.b(totalCaptureResult);
        return true;
    }
}
