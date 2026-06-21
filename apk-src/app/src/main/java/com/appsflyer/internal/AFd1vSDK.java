package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFd1vSDK implements AFd1uSDK {
    private final AFc1cSDK getMonetizationNetwork;

    public AFd1vSDK(AFc1cSDK aFc1cSDK) {
        Intrinsics.checkNotNullParameter(aFc1cSDK, "");
        this.getMonetizationNetwork = aFc1cSDK;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void getMonetizationNetwork(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1tSDK(bArr, map, 2000).AFAdRevenueData()) {
            this.getMonetizationNetwork.getCurrencyIso4217Code();
        }
    }
}
