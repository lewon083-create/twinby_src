package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFi1vSDK {
    public final String AFAdRevenueData;
    private final boolean getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final AFi1zSDK getMonetizationNetwork;
    public final AFh1dSDK getRevenue;

    public AFi1vSDK(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.AFAdRevenueData = string;
            this.getCurrencyIso4217Code = jSONObject.optBoolean("test_mode");
            this.getMediationNetwork = str;
            this.getRevenue = string.startsWith("default") ? AFh1dSDK.DEFAULT : AFh1dSDK.CUSTOM;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
            this.getMonetizationNetwork = jSONObjectOptJSONObject != null ? new AFi1zSDK(jSONObjectOptJSONObject) : null;
        } catch (JSONException e3) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e3);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFi1vSDK.class != obj.getClass()) {
            return false;
        }
        AFi1vSDK aFi1vSDK = (AFi1vSDK) obj;
        if (this.getCurrencyIso4217Code == aFi1vSDK.getCurrencyIso4217Code && this.AFAdRevenueData.equals(aFi1vSDK.AFAdRevenueData)) {
            return this.getMediationNetwork.equals(aFi1vSDK.getMediationNetwork);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.getMediationNetwork.hashCode() + ((this.AFAdRevenueData.hashCode() + ((this.getCurrencyIso4217Code ? 1 : 0) * 31)) * 31);
        AFi1zSDK aFi1zSDK = this.getMonetizationNetwork;
        if (aFi1zSDK == null) {
            return iHashCode;
        }
        return aFi1zSDK.hashCode() + (iHashCode * 31);
    }
}
