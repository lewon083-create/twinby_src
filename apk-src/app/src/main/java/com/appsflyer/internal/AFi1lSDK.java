package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFi1lSDK implements AFi1oSDK {
    private String getCurrencyIso4217Code;

    private static String AFAdRevenueData(Activity activity) {
        Uri uriK_ = AFb1qSDK.k_(activity != null ? activity.getIntent() : null);
        String string = uriK_ != null ? uriK_.toString() : null;
        if (string == null) {
            string = "";
        }
        if (getMediationNetwork(string)) {
            return null;
        }
        return string;
    }

    private static boolean getMediationNetwork(String str) {
        return a0.n(str, "android-app://", false);
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final void getMonetizationNetwork(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getCurrencyIso4217Code;
        if (str == null || str.length() == 0) {
            this.getCurrencyIso4217Code = AFAdRevenueData(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final String getRevenue(Activity activity) {
        String str = this.getCurrencyIso4217Code;
        this.getCurrencyIso4217Code = null;
        return (str == null || str.length() == 0) ? AFAdRevenueData(activity) : str;
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final String getMediationNetwork(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        return string == null ? "" : string;
    }
}
