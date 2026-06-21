package com.appsflyer.internal;

import android.content.pm.PackageManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface AFd1oSDK {
    void AFAdRevenueData(String str, int i, String str2);

    boolean AFAdRevenueData();

    boolean areAllFieldsValid();

    void getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMonetizationNetwork();

    void getMonetizationNetwork(String str, String str2);

    void getRevenue();

    void getRevenue(String str, String str2);

    void getRevenue(String str, String... strArr);

    void getRevenue(Throwable th2);

    void q_(String str, PackageManager packageManager);
}
