package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFi1rSDK {
    public final String getCurrencyIso4217Code;
    private final boolean getMediationNetwork;
    public final String getMonetizationNetwork;
    public final String getRevenue;

    public AFi1rSDK(String str, String str2, String str3, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code = str;
        this.getRevenue = str2;
        this.getMonetizationNetwork = str3;
        this.getMediationNetwork = z5;
    }

    public final boolean getMediationNetwork() {
        return this.getMediationNetwork;
    }
}
