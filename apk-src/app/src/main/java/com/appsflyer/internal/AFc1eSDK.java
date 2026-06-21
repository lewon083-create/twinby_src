package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFc1eSDK {
    public AFb1rSDK AFAdRevenueData;
    public boolean areAllFieldsValid;
    public AppsFlyerConsent component1;
    public boolean component2;
    public AFh1rSDK component3;
    public AFd1aSDK component4;
    public AFb1gSDK copydefault;
    public String getCurrencyIso4217Code;
    public String getMediationNetwork;
    public String getMonetizationNetwork;
    public AFb1tSDK getRevenue;

    public final boolean AFAdRevenueData() {
        return this.component2;
    }

    public final synchronized void getMediationNetwork(AFd1aSDK aFd1aSDK) {
        this.component4 = aFd1aSDK;
    }

    public final boolean getMediationNetwork() {
        return this.areAllFieldsValid;
    }
}
