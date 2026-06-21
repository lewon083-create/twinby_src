package com.appsflyer;

import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1oSDK;
import com.appsflyer.internal.AFj1dSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class PurchaseHandler {
    public final AFd1zSDK AFAdRevenueData;
    public final AFe1oSDK getCurrencyIso4217Code;
    private final AFc1oSDK getMonetizationNetwork;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface PurchaseValidationCallback {
        void onFailure(Throwable th2);

        void onResponse(ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(AFd1zSDK aFd1zSDK) {
        this.AFAdRevenueData = aFd1zSDK;
        this.getMonetizationNetwork = aFd1zSDK.AFAdRevenueData();
        this.getCurrencyIso4217Code = aFd1zSDK.copydefault();
    }

    public final boolean getRevenue(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean currencyIso4217Code = AFj1dSDK.getCurrencyIso4217Code(map, strArr, this.getMonetizationNetwork);
        if (!currencyIso4217Code && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return currencyIso4217Code;
    }
}
