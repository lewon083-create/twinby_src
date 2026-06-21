package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFh1uSDK implements AFg1bSDK {
    private final AFd1zSDK AFAdRevenueData;
    private AFg1hSDK getCurrencyIso4217Code;
    private AFh1zSDK getMediationNetwork;
    private AFh1wSDK getRevenue;

    public AFh1uSDK(AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.AFAdRevenueData = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void AFAdRevenueData() {
        AFh1zSDK aFh1zSDK = this.getMediationNetwork;
        if (aFh1zSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK.v$default(aFLogger, AFg1cSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1zSDK);
            this.getMediationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void areAllFieldsValid() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getCurrencyIso4217Code == null) {
            this.getCurrencyIso4217Code = new AFg1hSDK();
        }
        AFg1hSDK aFg1hSDK = this.getCurrencyIso4217Code;
        Intrinsics.b(aFg1hSDK);
        aFLogger.registerClient(aFg1hSDK);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getCurrencyIso4217Code() {
        AFh1wSDK aFh1wSDK = this.getRevenue;
        if (aFh1wSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1wSDK);
            this.getRevenue = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getMediationNetwork() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getMediationNetwork == null) {
            this.getMediationNetwork = new AFh1zSDK(this.AFAdRevenueData);
        }
        AFh1zSDK aFh1zSDK = this.getMediationNetwork;
        Intrinsics.b(aFh1zSDK);
        aFLogger.registerClient(aFh1zSDK);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getMonetizationNetwork() {
        AFg1hSDK aFg1hSDK = this.getCurrencyIso4217Code;
        if (aFg1hSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1hSDK);
            this.getCurrencyIso4217Code = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getRevenue() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getRevenue == null) {
            this.getRevenue = new AFh1wSDK(this.AFAdRevenueData);
        }
        AFh1wSDK aFh1wSDK = this.getRevenue;
        Intrinsics.b(aFh1wSDK);
        aFLogger.registerClient(aFh1wSDK);
    }
}
