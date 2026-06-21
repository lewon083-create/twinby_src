package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFb1cSDK implements AFb1hSDK {
    private final AFc1eSDK AFAdRevenueData;
    private final AFf1eSDK getCurrencyIso4217Code;
    private final AFc1hSDK getMonetizationNetwork;

    public AFb1cSDK(AFc1eSDK aFc1eSDK, AFc1hSDK aFc1hSDK, AFf1eSDK aFf1eSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        this.AFAdRevenueData = aFc1eSDK;
        this.getMonetizationNetwork = aFc1hSDK;
        this.getCurrencyIso4217Code = aFf1eSDK;
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final boolean AFAdRevenueData() {
        return !this.getCurrencyIso4217Code.getCurrencyIso4217Code() && !this.AFAdRevenueData.getMediationNetwork() && AFj1kSDK.getMediationNetwork(this.getMonetizationNetwork.getMonetizationNetwork) && AFj1kSDK.getMonetizationNetwork(this.getMonetizationNetwork.getMonetizationNetwork);
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final void getMonetizationNetwork() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context != null) {
            try {
                Task taskB = new a1.e(context).b();
                sb.m mVar = (sb.m) taskB;
                mVar.d(sb.h.f32859a, new c(this));
                Intrinsics.checkNotNullExpressionValue(mVar, "");
            } catch (Throwable th2) {
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th2, false, false, false, false, 120, null);
                Unit unit = Unit.f27471a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1cSDK aFb1cSDK, ga.b bVar) {
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        AFc1eSDK aFc1eSDK = aFb1cSDK.AFAdRevenueData;
        int i = bVar.f20060b;
        String str = bVar.f20059a;
        Intrinsics.checkNotNullExpressionValue(str, "");
        aFc1eSDK.copydefault = new AFb1gSDK(i, str);
    }
}
