package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1tSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFf1rSDK extends AFf1sSDK {
    private final AFf1kSDK AFInAppEventType;
    private final AFa1lSDK AFKeystoreWrapper;
    private final AppsFlyerProperties AFLogger;
    private final AFc1qSDK copy;
    private final AFj1sSDK copydefault;
    private final AFh1xSDK equals;
    public Map<String, Object> hashCode;
    private final AFh1pSDK registerClient;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1rSDK$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFj1tSDK.AFa1tSDK.values().length];
            getMonetizationNetwork = iArr;
            try {
                iArr[AFj1tSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMonetizationNetwork[AFj1tSDK.AFa1tSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1rSDK(AFh1mSDK aFh1mSDK, AFd1zSDK aFd1zSDK) {
        super(aFh1mSDK, aFd1zSDK);
        this.copydefault = aFd1zSDK.AFLogger();
        this.copy = aFd1zSDK.component4();
        this.equals = aFd1zSDK.areAllFieldsValid();
        this.AFInAppEventType = aFd1zSDK.component1();
        this.AFLogger = AppsFlyerProperties.getInstance();
        this.AFKeystoreWrapper = aFd1zSDK.afVerboseLog();
        this.registerClient = aFd1zSDK.afWarnLog();
        this.getCurrencyIso4217Code.add(AFe1pSDK.RESOLVE_ESP);
        this.getCurrencyIso4217Code.add(AFe1pSDK.DLSDK);
    }

    private boolean copy() {
        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
        boolean z5 = this.getMonetizationNetwork == AFe1uSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1pSDK aFe1pSDK = this.getRevenue;
        return z5 && (aFe1pSDK == AFe1pSDK.CONVERSION || aFe1pSDK == AFe1pSDK.ATTR);
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        AFh1pSDK aFh1pSDK;
        AFh1pSDK aFh1pSDK2;
        super.AFAdRevenueData(aFh1mSDK);
        int i = aFh1mSDK.component4;
        AFh1xSDK aFh1xSDK = this.equals;
        if (aFh1xSDK.getCurrencyIso4217Code()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            aFh1xSDK.copy = jCurrentTimeMillis;
            long j10 = aFh1xSDK.component4;
            if (j10 != 0) {
                aFh1xSDK.AFAdRevenueData.put("from_fg", Long.valueOf(jCurrentTimeMillis - j10));
                aFh1xSDK.getMonetizationNetwork.getRevenue("first_launch", new JSONObject(aFh1xSDK.AFAdRevenueData).toString());
            } else {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
            }
        }
        Map map = (Map) aFh1mSDK.AFAdRevenueData.get(Mechanism.JsonKeys.META);
        if (map == null) {
            map = new HashMap();
            aFh1mSDK.AFAdRevenueData.put(Mechanism.JsonKeys.META, map);
        }
        if (!aFh1mSDK.AFAdRevenueData.containsKey("af_deeplink")) {
            aFh1mSDK.AFAdRevenueData(this.AFKeystoreWrapper.getRevenue());
        }
        AFi1wSDK currencyIso4217Code = this.AFInAppEventType.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", currencyIso4217Code.getMonetizationNetwork);
            String str = currencyIso4217Code.AFAdRevenueData;
            if (str != null) {
                map2.put("c_ver", str);
            }
            long j11 = currencyIso4217Code.getCurrencyIso4217Code;
            if (j11 > 0) {
                map2.put("latency", Long.valueOf(j11));
            }
            long j12 = currencyIso4217Code.getRevenue;
            if (j12 > 0) {
                map2.put("delay", Long.valueOf(j12));
            }
            int i10 = currencyIso4217Code.getMediationNetwork;
            if (i10 > 0) {
                map2.put("res_code", Integer.valueOf(i10));
            }
            if (currencyIso4217Code.component1 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(currencyIso4217Code.component1.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(currencyIso4217Code.component1.getMessage());
                map2.put("error", sb2.toString());
            }
            AFi1ySDK aFi1ySDK = currencyIso4217Code.areAllFieldsValid;
            if (aFi1ySDK != null) {
                map2.put("sig", aFi1ySDK.toString());
            }
            String str2 = currencyIso4217Code.component2;
            if (str2 != null) {
                map2.put("cdn_cache_status", str2);
            }
            map.put("rc", map2);
        }
        this.toString.getCurrencyIso4217Code(aFh1mSDK.AFAdRevenueData);
        if (i == 1) {
            if (this.AFLogger.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFh1mSDK.AFAdRevenueData.put("wait_cid", Boolean.toString(true));
            }
            AFh1xSDK aFh1xSDK2 = this.equals;
            HashMap map3 = new HashMap(aFh1xSDK2.getMediationNetwork);
            aFh1xSDK2.getMediationNetwork.clear();
            if (!map3.isEmpty()) {
                map.put("ddl", map3);
            }
            HashMap map4 = new HashMap(this.equals.AFAdRevenueData);
            if (!map4.isEmpty()) {
                map.put("first_launch", map4);
            }
            AFh1pSDK aFh1pSDK3 = this.registerClient;
            if (aFh1pSDK3 != null) {
                aFh1pSDK3.getCurrencyIso4217Code(aFh1mSDK);
            }
        } else if (i == 2) {
            AFh1xSDK aFh1xSDK3 = this.equals;
            aFh1xSDK3.getMonetizationNetwork.AFAdRevenueData("first_launch");
            HashMap map5 = new HashMap(aFh1xSDK3.AFAdRevenueData);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
            if ((aFh1mSDK instanceof AFh1kSDK) && (aFh1pSDK2 = this.registerClient) != null && !aFh1pSDK2.getRevenue()) {
                this.registerClient.getMediationNetwork(aFh1mSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1mSDK.AFAdRevenueData.remove(Mechanism.JsonKeys.META);
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1tSDK aFj1tSDK : (AFj1tSDK[]) this.copydefault.getRevenue.toArray(new AFj1tSDK[0])) {
                boolean z5 = aFj1tSDK instanceof AFi1aSDK;
                int i11 = AnonymousClass4.getMonetizationNetwork[aFj1tSDK.component4.ordinal()];
                if (i11 == 1) {
                    if (z5) {
                        aFh1mSDK.getMonetizationNetwork("rfr", ((AFi1aSDK) aFj1tSDK).getMonetizationNetwork);
                        this.copy.AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1tSDK.getMediationNetwork);
                } else if (i11 == 2 && i == 2 && !z5) {
                    HashMap map6 = new HashMap();
                    map6.put("source", aFj1tSDK.component3);
                    map6.put(Response.TYPE, "TIMEOUT");
                    map6.put("type", aFj1tSDK.areAllFieldsValid);
                    arrayList.add(map6);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1mSDK.getMonetizationNetwork("referrers", arrayList);
            }
            Object obj = this.hashCode;
            if (obj != null) {
                aFh1mSDK.getMonetizationNetwork("fb_ddl", obj);
            }
        }
        if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.LAUNCH && (aFh1pSDK = this.registerClient) != null && aFh1pSDK.getMonetizationNetwork()) {
            this.registerClient.getMonetizationNetwork(aFh1mSDK);
        }
        this.toString.getMonetizationNetwork(aFh1mSDK);
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFh1xSDK aFh1xSDK = this.equals;
        if (aFh1xSDK.getCurrencyIso4217Code()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = aFh1xSDK.copy;
            if (j10 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1xSDK.AFAdRevenueData.put("net", Long.valueOf(jCurrentTimeMillis - j10));
            aFh1xSDK.getMonetizationNetwork.getRevenue("first_launch", new JSONObject(aFh1xSDK.AFAdRevenueData).toString());
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return super.getMonetizationNetwork() || copy();
    }
}
