package d;

import a0.u1;
import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.android.gms.internal.ads.i0;
import com.yandex.varioqub.config.impl.B;
import fh.of;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t.j1;
import t.j2;
import t.k1;
import yads.of1;
import yads.pk0;
import yads.qk0;
import yads.rf1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15457e;

    public /* synthetic */ l(Object obj, int i, Object obj2, int i10) {
        this.f15454b = i10;
        this.f15455c = obj;
        this.f15456d = i;
        this.f15457e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15454b) {
            case 0:
                m mVar = (m) this.f15455c;
                int i = this.f15456d;
                Object obj = ((g.a) this.f15457e).f19496a;
                String str = (String) mVar.f16461a.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                f.e eVar = (f.e) mVar.f16465e.get(str);
                if ((eVar != null ? eVar.f16453a : null) == null) {
                    mVar.f16467g.remove(str);
                    mVar.f16466f.put(str, obj);
                    return;
                }
                f.b bVar = eVar.f16453a;
                Intrinsics.c(bVar, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                if (mVar.f16464d.remove(str)) {
                    bVar.e(obj);
                    return;
                }
                return;
            case 1:
                ((m) this.f15455c).a(this.f15456d, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f15457e));
                return;
            case 2:
                B.a((B) this.f15455c, this.f15456d, (Function0) this.f15457e);
                return;
            case 3:
                ((i6.b) ((u1) this.f15455c).f228d).g(this.f15456d, this.f15457e);
                return;
            case 4:
                CopyOnWriteArraySet<m3.m> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f15455c;
                int i10 = this.f15456d;
                m3.k kVar = (m3.k) this.f15457e;
                for (m3.m mVar2 : copyOnWriteArraySet) {
                    if (!mVar2.f28575d) {
                        if (i10 != -1) {
                            mVar2.f28573b.a(i10);
                        }
                        mVar2.f28574c = true;
                        kVar.invoke(mVar2.f28572a);
                    }
                }
                return;
            case 5:
                ((g0.p) this.f15455c).c(this.f15456d, (of) this.f15457e);
                return;
            case 6:
                ((g0.p) this.f15455c).b(this.f15456d, (g0.v) this.f15457e);
                return;
            case 7:
                i0 i0Var = (i0) this.f15455c;
                final j1.h hVar = (j1.h) this.f15457e;
                final int i11 = this.f15456d;
                t.o oVar = (t.o) i0Var.f6313c;
                if (!i0Var.f6312b) {
                    k1 k1Var = (k1) i0Var.f6314d;
                    synchronized (k1Var.f33137a) {
                        k1Var.f33139c = 0;
                        break;
                    }
                    hVar.d(new a0.o("Camera is not active."));
                    return;
                }
                i0Var.b();
                f2.g.h("mRunningCompleter should be null when starting set a new exposure compensation value", ((j1.h) i0Var.f6316f) == null);
                f2.g.h("mRunningCaptureResultListener should be null when starting set a new exposure compensation value", ((j1) i0Var.f6317g) == null);
                t.n nVar = new t.n() { // from class: t.j1
                    @Override // t.n
                    public final boolean b(TotalCaptureResult totalCaptureResult) {
                        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
                        int i12 = i11;
                        j1.h hVar2 = hVar;
                        if (num == null || num2 == null) {
                            if (num2 == null || num2.intValue() != i12) {
                                return false;
                            }
                            hVar2.b(Integer.valueOf(i12));
                            return true;
                        }
                        int iIntValue = num.intValue();
                        if ((iIntValue != 2 && iIntValue != 3 && iIntValue != 4) || num2.intValue() != i12) {
                            return false;
                        }
                        hVar2.b(Integer.valueOf(i12));
                        return true;
                    }
                };
                i0Var.f6317g = nVar;
                i0Var.f6316f = hVar;
                oVar.a(nVar);
                oVar.F();
                return;
            case 8:
                ((j2) this.f15455c).a(this.f15456d, (j1.h) this.f15457e);
                return;
            case 9:
                ((CameraCaptureSession.CaptureCallback) ((t.m) this.f15455c).f33151b).onCaptureSequenceAborted((CameraCaptureSession) this.f15457e, this.f15456d);
                return;
            case 10:
                ((CameraDevice.StateCallback) ((t.v) this.f15455c).f33304b).onError((CameraDevice) this.f15457e, this.f15456d);
                return;
            case 11:
                ((pk0) this.f15455c).a((qk0) this.f15457e, this.f15456d);
                return;
            default:
                rf1.a((CopyOnWriteArraySet) this.f15455c, this.f15456d, (of1) this.f15457e);
                return;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, int i, int i10) {
        this.f15454b = i10;
        this.f15455c = obj;
        this.f15457e = obj2;
        this.f15456d = i;
    }
}
