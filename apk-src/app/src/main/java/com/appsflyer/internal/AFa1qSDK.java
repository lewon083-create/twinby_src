package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFa1qSDK {
    public static JSONObject getMonetizationNetwork(String str) {
        JSONObject jSONObjectAFAdRevenueData = AFg1eSDK.AFAdRevenueData(str);
        if (jSONObjectAFAdRevenueData != null) {
            try {
                if (jSONObjectAFAdRevenueData.has("ol_id")) {
                    String strOptString = jSONObjectAFAdRevenueData.optString("ol_scheme", null);
                    String strOptString2 = jSONObjectAFAdRevenueData.optString("ol_domain", null);
                    String strOptString3 = jSONObjectAFAdRevenueData.optString("ol_ver", null);
                    if (strOptString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, strOptString);
                    }
                    if (strOptString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, strOptString2);
                    }
                    if (strOptString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, strOptString3);
                        return jSONObjectAFAdRevenueData;
                    }
                }
            } catch (Throwable th2) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb2 = new StringBuilder("Error in handleResponse: ");
                sb2.append(th2.getMessage());
                aFLogger.e(aFg1cSDK, sb2.toString(), th2, false, false, true);
                AFa1ySDK.getRevenue().getMonetizationNetwork().copy().getRevenue();
                AFa1ySDK.getRevenue().getMonetizationNetwork().copy().getMediationNetwork();
            }
        }
        return jSONObjectAFAdRevenueData;
    }
}
