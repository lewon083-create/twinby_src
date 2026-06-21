package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1tSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFf1xSDK extends AFe1fSDK<AFa1oSDK> {
    private int AFInAppEventParameterName;
    private final CountDownLatch AFInAppEventType;
    private int AFKeystoreWrapper;
    private final List<AFj1tSDK> AFLogger;
    private final AFa1rSDK component2;
    private final AFh1xSDK copy;
    private final AFc1oSDK copydefault;
    private final AFj1sSDK equals;
    private final AFa1mSDK hashCode;
    private int registerClient;
    private final AFc1eSDK toString;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1uSDK.values().length];
            try {
                iArr[AFe1uSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1uSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
            int[] iArr2 = new int[AFj1tSDK.AFa1tSDK.values().length];
            try {
                iArr2[AFj1tSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1tSDK.AFa1tSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            getMonetizationNetwork = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1xSDK(AFa1rSDK aFa1rSDK, AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.DLSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.component2 = aFa1rSDK;
        this.AFInAppEventType = new CountDownLatch(1);
        this.AFLogger = new ArrayList();
        AFc1oSDK aFc1oSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(aFc1oSDKAFAdRevenueData, "");
        this.copydefault = aFc1oSDKAFAdRevenueData;
        AFc1eSDK aFc1eSDKForce = aFd1zSDK.force();
        Intrinsics.checkNotNullExpressionValue(aFc1eSDKForce, "");
        this.toString = aFc1eSDKForce;
        AFa1mSDK aFa1mSDKI = aFd1zSDK.i();
        Intrinsics.checkNotNullExpressionValue(aFa1mSDKI, "");
        this.hashCode = aFa1mSDKI;
        AFh1xSDK aFh1xSDKAreAllFieldsValid = aFd1zSDK.areAllFieldsValid();
        Intrinsics.checkNotNullExpressionValue(aFh1xSDKAreAllFieldsValid, "");
        this.copy = aFh1xSDKAreAllFieldsValid;
        AFj1sSDK aFj1sSDKAFLogger = aFd1zSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFj1sSDKAFLogger, "");
        this.equals = aFj1sSDKAFLogger;
        AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) aFj1sSDKAFLogger.getRevenue.toArray(new AFj1tSDK[0]);
        Intrinsics.checkNotNullExpressionValue(aFj1tSDKArr, "");
        ArrayList<AFj1tSDK> arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : aFj1tSDKArr) {
            if (aFj1tSDK != null && aFj1tSDK.component4 != AFj1tSDK.AFa1tSDK.NOT_STARTED) {
                arrayList.add(aFj1tSDK);
            }
        }
        this.AFInAppEventParameterName = arrayList.size();
        for (final AFj1tSDK aFj1tSDK2 : arrayList) {
            AFj1tSDK.AFa1tSDK aFa1tSDK = aFj1tSDK2.component4;
            int i = aFa1tSDK == null ? -1 : AFa1uSDK.getMonetizationNetwork[aFa1tSDK.ordinal()];
            if (i == 1) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK2.getMediationNetwork.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1tSDK2, "");
                getCurrencyIso4217Code(aFj1tSDK2);
            } else if (i == 2) {
                aFj1tSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.i
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1xSDK.getRevenue(aFj1tSDK2, this, observable, obj);
                    }
                });
            }
        }
    }

    private final boolean equals() {
        Object obj = this.component2.AFAdRevenueData.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFInAppEventParameterName && !this.component2.AFAdRevenueData.containsKey("referrers");
    }

    private final void getCurrencyIso4217Code(AFj1tSDK aFj1tSDK) {
        if (getRevenue(aFj1tSDK)) {
            this.AFLogger.add(aFj1tSDK);
            this.AFInAppEventType.countDown();
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic ".concat(aFj1tSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i = this.AFKeystoreWrapper + 1;
            this.AFKeystoreWrapper = i;
            if (i == this.AFInAppEventParameterName) {
                this.AFInAppEventType.countDown();
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return this.hashCode.component2;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() {
        AFe1uSDK revenue;
        AFe1uSDK aFe1uSDK = AFe1uSDK.FAILURE;
        try {
            revenue = super.getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
        } catch (Exception e3) {
            e = e3;
        }
        try {
            AFh1xSDK aFh1xSDK = this.copy;
            int i = this.registerClient;
            if (i <= 0 || i > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
            } else {
                int i10 = i - 1;
                aFh1xSDK.component2[i10] = System.currentTimeMillis();
                long j10 = aFh1xSDK.component3[i10];
                if (j10 != 0) {
                    long[] jArr = aFh1xSDK.component1;
                    jArr[i10] = aFh1xSDK.component2[i10] - j10;
                    aFh1xSDK.getMediationNetwork.put("net", jArr);
                } else {
                    StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                    sb2.append(i10);
                    sb2.append("] ts is missing");
                    AFLogger.afInfoLog(sb2.toString());
                }
            }
            int i11 = AFa1uSDK.getRevenue[revenue.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    return revenue;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
                AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                this.copy.getCurrencyIso4217Code(deepLinkResult, this.hashCode.component2);
                this.hashCode.getRevenue(deepLinkResult);
                return revenue;
            }
            ResponseNetwork responseNetwork2 = ((AFe1fSDK) this).areAllFieldsValid;
            Intrinsics.b(responseNetwork2);
            Object body = responseNetwork2.getBody();
            Intrinsics.checkNotNullExpressionValue(body, "");
            AFa1oSDK aFa1oSDK = (AFa1oSDK) body;
            DeepLink deepLink = aFa1oSDK.getMonetizationNetwork;
            if (deepLink != null) {
                DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                this.copy.getCurrencyIso4217Code(deepLinkResult2, this.hashCode.component2);
                this.hashCode.getRevenue(deepLinkResult2);
                return revenue;
            }
            if (this.registerClient > 1 || !aFa1oSDK.AFAdRevenueData() || !equals()) {
                DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                this.copy.getCurrencyIso4217Code(deepLinkResult3, this.hashCode.component2);
                this.hashCode.getRevenue(deepLinkResult3);
                return revenue;
            }
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
            this.AFInAppEventType.await();
            AFh1xSDK aFh1xSDK2 = this.copy;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = aFh1xSDK2.component2[0];
            if (j11 != 0) {
                aFh1xSDK2.getMediationNetwork.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j11));
            } else {
                AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
            }
            if (this.AFKeystoreWrapper != this.AFInAppEventParameterName) {
                return getRevenue();
            }
            DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
            this.copy.getCurrencyIso4217Code(deepLinkResult4, this.hashCode.component2);
            this.hashCode.getRevenue(deepLinkResult4);
            return AFe1uSDK.SUCCESS;
        } catch (Exception e7) {
            e = e7;
            aFe1uSDK = revenue;
            Throwable cause = e.getCause();
            if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.registerClient + " attempt(s) within " + this.hashCode.component2 + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.copy.getCurrencyIso4217Code(deepLinkResult5, this.hashCode.component2);
                this.hashCode.getRevenue(deepLinkResult5);
                return AFe1uSDK.TIMEOUT;
            }
            if (cause instanceof IOException) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                this.copy.getCurrencyIso4217Code(deepLinkResult6, this.hashCode.component2);
                this.hashCode.getRevenue(deepLinkResult6);
                return aFe1uSDK;
            }
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
            DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            this.copy.getCurrencyIso4217Code(deepLinkResult7, this.hashCode.component2);
            this.hashCode.getRevenue(deepLinkResult7);
            return aFe1uSDK;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0147  */
    @Override // com.appsflyer.internal.AFe1fSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFd1hSDK<com.appsflyer.internal.AFa1oSDK> AFAdRevenueData(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1xSDK.AFAdRevenueData(java.lang.String):com.appsflyer.internal.AFd1hSDK");
    }

    private static Map<String, String> getCurrencyIso4217Code(AFb1jSDK aFb1jSDK) {
        String str;
        if (aFb1jSDK == null || (str = aFb1jSDK.getRevenue) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1jSDK.getCurrencyIso4217Code;
        if (bool == null || !bool.booleanValue()) {
            return j0.g(new Pair("type", "unhashed"), new Pair("value", str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFj1tSDK aFj1tSDK, AFf1xSDK aFf1xSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1xSDK, "");
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK.getMediationNetwork.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.c(observable, "");
        aFf1xSDK.getCurrencyIso4217Code((AFj1tSDK) observable);
    }

    private static boolean getRevenue(AFj1tSDK aFj1tSDK) {
        Object obj = aFj1tSDK.getMediationNetwork.get("click_ts");
        Long l10 = obj instanceof Long ? (Long) obj : null;
        if (l10 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l10.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }
}
