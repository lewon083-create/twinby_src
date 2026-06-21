package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFh1xSDK {
    public long copydefault;
    public final AFc1oSDK getCurrencyIso4217Code;
    public final AFc1qSDK getMonetizationNetwork;
    public final Map<String, Object> AFAdRevenueData = new ConcurrentHashMap();
    public final Map<String, Object> getMediationNetwork = new ConcurrentHashMap();
    public final Map<String, Object> getRevenue = new ConcurrentHashMap();
    public long areAllFieldsValid = 0;
    public long component4 = 0;
    public final long[] component3 = new long[2];
    public final long[] component2 = new long[2];
    public final long[] component1 = new long[2];
    public long copy = 0;
    public long toString = 0;

    public AFh1xSDK(AFc1qSDK aFc1qSDK, AFc1oSDK aFc1oSDK) {
        this.getMonetizationNetwork = aFc1qSDK;
        this.getCurrencyIso4217Code = aFc1oSDK;
    }

    public final boolean AFAdRevenueData() {
        return this.getCurrencyIso4217Code.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 0;
    }

    public final void getCurrencyIso4217Code(DeepLinkResult deepLinkResult, long j10) {
        this.getMediationNetwork.put("status", deepLinkResult.getStatus().toString());
        this.getMediationNetwork.put("timeout_value", Long.valueOf(j10));
    }

    public final void getMonetizationNetwork() {
        this.component4 = System.currentTimeMillis();
        if (AFAdRevenueData()) {
            long j10 = this.areAllFieldsValid;
            if (j10 == 0) {
                AFLogger.afInfoLog("Metrics: init ts is missing");
                return;
            }
            this.AFAdRevenueData.put("init_to_fg", Long.valueOf(this.component4 - j10));
            this.getMonetizationNetwork.getRevenue("first_launch", new JSONObject(this.AFAdRevenueData).toString());
        }
    }

    public final void getRevenue(AFh1vSDK aFh1vSDK) {
        if (AFAdRevenueData()) {
            this.AFAdRevenueData.put("start_with", aFh1vSDK.toString());
            this.getMonetizationNetwork.getRevenue("first_launch", new JSONObject(this.AFAdRevenueData).toString());
        }
    }

    public final Map<String, Object> getCurrencyIso4217Code(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String monetizationNetwork = this.getMonetizationNetwork.getMonetizationNetwork(str, (String) null);
        if (monetizationNetwork != null) {
            try {
                return AFg1eSDK.getRevenue(new JSONObject(monetizationNetwork));
            } catch (Exception e3) {
                AFLogger.afErrorLog("Error while parsing cached json data", e3, true);
            }
        }
        return map;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 1;
    }

    public final void getMonetizationNetwork(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.toString;
        if (j10 != 0) {
            this.getRevenue.put("net", Long.valueOf(jCurrentTimeMillis - j10));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.getRevenue.put("retries", Integer.valueOf(i));
        this.getMonetizationNetwork.getRevenue("gcd", new JSONObject(this.getRevenue).toString());
    }
}
