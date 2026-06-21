package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFh1qSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final Intent getMonetizationNetwork;

    public AFh1qSDK(Activity activity, AFi1oSDK aFi1oSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1oSDK, "");
        this.getMonetizationNetwork = activity.getIntent();
        this.getCurrencyIso4217Code = aFi1oSDK.getMediationNetwork(activity);
        this.AFAdRevenueData = aFi1oSDK.getRevenue(activity);
    }
}
