package com.appsflyer.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface AFc1cSDK {
    String AFAdRevenueData(Throwable th2, String str);

    void getCurrencyIso4217Code(int i, int i10);

    boolean getCurrencyIso4217Code();

    int getMediationNetwork();

    boolean getMonetizationNetwork(String... strArr);

    List<AFc1aSDK> getRevenue();
}
