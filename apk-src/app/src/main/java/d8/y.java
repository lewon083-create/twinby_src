package d8;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.o1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends ResultReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi.f0 f15714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f15715c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(e eVar, Handler handler, yi.f0 f0Var) {
        super(handler);
        this.f15714b = f0Var;
        this.f15715c = eVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        i iVarA = j.a();
        iVarA.f15634b = i;
        yi.f0 f0Var = this.f15714b;
        if (i != 0) {
            e eVar = this.f15715c;
            if (bundle == null) {
                eVar.G(f0Var, n0.i, 73, null);
                return;
            } else {
                iVarA.f15635c = o1.e(bundle, "BillingClient");
                int i10 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                eVar.r(l0.c(i10 != 0 ? d3.n(i10) : 23, 16, iVarA.a(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        ((jh.b) f0Var.f45657c).e(ya.e.h(iVarA.a()));
    }
}
