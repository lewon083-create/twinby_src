package t;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f33105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33106b = false;

    public i0(o oVar) {
        this.f33105a = oVar;
    }

    @Override // t.n0
    public final ed.d a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        int iIntValue;
        k0.l lVarE = k0.j.e(Boolean.TRUE);
        if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
            com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "TriggerAf? AF mode auto");
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null && num2.intValue() == 0) {
                com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "Trigger AF");
                this.f33106b = true;
                this.f33105a.f33178h.f(false);
            }
        }
        return lVarE;
    }

    @Override // t.n0
    public final boolean b() {
        return true;
    }

    @Override // t.n0
    public final void c() {
        if (this.f33106b) {
            com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "cancel TriggerAF");
            this.f33105a.f33178h.a(true, false);
        }
    }
}
