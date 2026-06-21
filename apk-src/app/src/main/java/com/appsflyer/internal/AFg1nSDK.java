package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface AFg1nSDK {
    void AFAdRevenueData(AFh1mSDK aFh1mSDK);

    void AFAdRevenueData(Map<String, Object> map);

    long getCurrencyIso4217Code();

    void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK);

    void getCurrencyIso4217Code(Map<String, Object> map);

    void getCurrencyIso4217Code(Map<String, Object> map, int i, int i10);

    void getMediationNetwork(AFh1mSDK aFh1mSDK);

    void getMediationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK);

    Long getMonetizationNetwork();

    void getMonetizationNetwork(AFh1mSDK aFh1mSDK);

    void getMonetizationNetwork(Map<String, Object> map);

    void getRevenue(AFh1mSDK aFh1mSDK);

    void getRevenue(Map<String, Object> map);
}
