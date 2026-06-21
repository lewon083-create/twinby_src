package com.appsflyer.appsflyersdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFPurchaseType;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.MediationNetwork;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.appsflyer.share.CrossPromotionHelper;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.ShareInviteHelper;
import ii.f;
import ii.i;
import ii.n;
import ii.o;
import ii.p;
import ii.q;
import ii.t;
import io.sentry.protocol.Message;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m.h3;
import org.json.JSONException;
import org.json.JSONObject;
import t.z;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class AppsflyerSdkPlugin implements o, ei.b, fi.a {
    private static DeepLinkResult cachedDeepLinkResult;
    private static Map<String, String> cachedOnAppOpenAttribution;
    private static String cachedOnAttributionFailure;
    private static String cachedOnConversionDataFail;
    private static Map<String, Object> cachedOnConversionDataSuccess;
    private static boolean saveCallbacks;
    private Activity activity;
    private final AppsFlyerConversionListener afConversionListener;
    private final DeepLinkListener afDeepLinkListener;
    private final o callbacksHandler;
    private Boolean gcdCallback;
    private Boolean isFacebookDeferredApplinksEnabled;
    private Boolean isSetDisableAdvertisingIdentifiersEnable;
    private Application mApplication;
    private q mCallbackChannel;
    private Map<String, Map<String, Object>> mCallbacks;
    private Context mContext;
    private i mEventChannel;
    private q mMethodChannel;
    private Boolean oaoaCallback;
    t onNewIntentListener;
    private Boolean udlCallback;
    final Handler uiThreadHandler = new Handler(Looper.getMainLooper());
    private Boolean validatePurchaseCallback;

    /* JADX INFO: renamed from: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public class AnonymousClass5 implements AppsFlyerRequestListener {
        public AnonymousClass5() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onError$1(int i, String str) {
            if (AppsflyerSdkPlugin.this.mMethodChannel == null) {
                Log.e("AppsFlyer_FlutterPlugin", "mMethodChannel is null, cannot invoke the callback - SDK failed to start: " + str);
            } else {
                HashMap map = new HashMap();
                map.put("errorCode", Integer.valueOf(i));
                map.put("errorMessage", str);
                AppsflyerSdkPlugin.this.mMethodChannel.a("onError", map, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onSuccess$0() {
            if (AppsflyerSdkPlugin.this.mMethodChannel != null) {
                AppsflyerSdkPlugin.this.mMethodChannel.a("onSuccess", null, null);
            } else {
                Log.e("AppsFlyer_FlutterPlugin", "mMethodChannel is null, cannot invoke the callback - SDK started successfully but callback `onSuccess` failed");
            }
        }

        @Override // com.appsflyer.attribution.AppsFlyerRequestListener
        public void onError(final int i, final String str) {
            AppsflyerSdkPlugin.this.uiThreadHandler.post(new Runnable() { // from class: com.appsflyer.appsflyersdk.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2434b.lambda$onError$1(i, str);
                }
            });
        }

        @Override // com.appsflyer.attribution.AppsFlyerRequestListener
        public void onSuccess() {
            AppsflyerSdkPlugin.this.uiThreadHandler.post(new Runnable() { // from class: com.appsflyer.appsflyersdk.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2433b.lambda$onSuccess$0();
                }
            });
        }
    }

    public AppsflyerSdkPlugin() {
        Boolean bool = Boolean.FALSE;
        this.gcdCallback = bool;
        this.oaoaCallback = bool;
        this.udlCallback = bool;
        this.validatePurchaseCallback = bool;
        this.isFacebookDeferredApplinksEnabled = bool;
        this.isSetDisableAdvertisingIdentifiersEnable = bool;
        this.mCallbacks = new HashMap();
        this.onNewIntentListener = new t() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.1
            @Override // ii.t
            public boolean onNewIntent(Intent intent) {
                AppsflyerSdkPlugin.this.activity.setIntent(intent);
                return false;
            }
        };
        this.afConversionListener = new AppsFlyerConversionListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.2
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> map) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    AppsflyerSdkPlugin.cachedOnAppOpenAttribution = map;
                } else if (AppsflyerSdkPlugin.this.oaoaCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(map)), "onAppOpenAttribution", "success");
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String str) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    AppsflyerSdkPlugin.cachedOnAttributionFailure = str;
                } else if (AppsflyerSdkPlugin.this.oaoaCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(AppsflyerSdkPlugin.i(AppsflyerSdkPlugin.this, str), "onAppOpenAttribution", "failure");
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String str) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    AppsflyerSdkPlugin.cachedOnConversionDataFail = str;
                } else if (AppsflyerSdkPlugin.this.gcdCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(AppsflyerSdkPlugin.i(AppsflyerSdkPlugin.this, str), "onInstallConversionData", "failure");
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> map) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    AppsflyerSdkPlugin.cachedOnConversionDataSuccess = map;
                } else if (AppsflyerSdkPlugin.this.gcdCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(map)), "onInstallConversionData", "success");
                }
            }
        };
        this.afDeepLinkListener = new DeepLinkListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.3
            @Override // com.appsflyer.deeplink.DeepLinkListener
            public void onDeepLinking(DeepLinkResult deepLinkResult) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    AppsflyerSdkPlugin.cachedDeepLinkResult = deepLinkResult;
                } else if (AppsflyerSdkPlugin.this.udlCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(deepLinkResult, "onDeepLinking", "success");
                }
            }
        };
        this.callbacksHandler = new o() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.4
            @Override // ii.o
            public void onMethodCall(n nVar, p pVar) {
                if ("startListening".equals(nVar.f21315a)) {
                    AppsflyerSdkPlugin.this.startListening(nVar.f21316b, pVar);
                } else {
                    pVar.a();
                }
            }
        };
    }

    private void addPushNotificationDeepLinkPath(n nVar, p pVar) {
        Object obj = nVar.f21316b;
        if (obj != null) {
            ArrayList arrayList = (ArrayList) obj;
            AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        pVar.success(null);
    }

    private void anonymizeUser(n nVar, p pVar) {
        AppsFlyerLib.getInstance().anonymizeUser(((Boolean) nVar.a("shouldAnonymize")).booleanValue());
        pVar.success(null);
    }

    private JSONObject buildJsonResponse(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", str);
            jSONObject.put("data", obj.toString());
            return jSONObject;
        } catch (JSONException e3) {
            e3.printStackTrace();
            return jSONObject;
        }
    }

    private void disableAppSetId(n nVar, p pVar) {
        AppsFlyerLib.getInstance().disableAppSetId();
        pVar.success(null);
    }

    private void enableFacebookDeferredApplinks(n nVar, p pVar) {
        Boolean bool = (Boolean) nVar.a("isFacebookDeferredApplinksEnabled");
        bool.booleanValue();
        this.isFacebookDeferredApplinksEnabled = bool;
        if (bool.booleanValue()) {
            AppsFlyerLib.getInstance().enableFacebookDeferredApplinks(true);
        } else {
            AppsFlyerLib.getInstance().enableFacebookDeferredApplinks(false);
        }
        pVar.success(null);
    }

    private void enableTCFDataCollection(n nVar, p pVar) {
        AppsFlyerLib.getInstance().enableTCFDataCollection(((Boolean) nVar.a("shouldCollect")).booleanValue());
        pVar.success(null);
    }

    private void generateInviteLink(n nVar, p pVar) {
        String str = (String) nVar.a(AppsFlyerProperties.CHANNEL);
        String str2 = (String) nVar.a("customerID");
        String str3 = (String) nVar.a("campaign");
        String str4 = (String) nVar.a("referrerName");
        String str5 = (String) nVar.a("referrerImageUrl");
        String str6 = (String) nVar.a("baseDeeplink");
        String str7 = (String) nVar.a("brandDomain");
        Map<String, String> map = (Map) nVar.a("customParams");
        LinkGenerator linkGeneratorGenerateInviteUrl = ShareInviteHelper.generateInviteUrl(this.mContext);
        if (str != null && !str.equals("")) {
            linkGeneratorGenerateInviteUrl.setChannel(str);
        }
        if (str3 != null && !str3.equals("")) {
            linkGeneratorGenerateInviteUrl.setCampaign(str3);
        }
        if (str4 != null && !str4.equals("")) {
            linkGeneratorGenerateInviteUrl.setReferrerName(str4);
        }
        if (str5 != null && !str5.equals("")) {
            linkGeneratorGenerateInviteUrl.setReferrerImageURL(str5);
        }
        if (str2 != null && !str2.equals("")) {
            linkGeneratorGenerateInviteUrl.setReferrerCustomerId(str2);
        }
        if (str6 != null && !str6.equals("")) {
            linkGeneratorGenerateInviteUrl.setBaseDeeplink(str6);
        }
        if (str7 != null && !str7.equals("")) {
            linkGeneratorGenerateInviteUrl.setBrandDomain(str7);
        }
        if (map != null && !map.equals("")) {
            linkGeneratorGenerateInviteUrl.addParameters(map);
        }
        linkGeneratorGenerateInviteUrl.generateLink(this.mContext, new LinkGenerator.ResponseListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.6
            final JSONObject obj = new JSONObject();

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public void onResponse(String str8) {
                if (AppsflyerSdkPlugin.this.mCallbacks.containsKey("generateInviteLinkSuccess")) {
                    try {
                        this.obj.put("userInviteURL", str8);
                        AppsflyerSdkPlugin.this.runOnUIThread(this.obj, "generateInviteLinkSuccess", "success");
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public void onResponseError(String str8) {
                if (AppsflyerSdkPlugin.this.mCallbacks.containsKey("generateInviteLinkFailure")) {
                    try {
                        this.obj.put("error", str8);
                        AppsflyerSdkPlugin.this.runOnUIThread(str8, "generateInviteLinkFailure", "failure");
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        });
        pVar.success(null);
    }

    private AppsFlyerConsent getAppsFlyerConsentFromCall(n nVar) {
        Map map = (Map) nVar.f21316b;
        return new AppsFlyerConsent((Boolean) map.get("isUserSubjectToGDPR"), (Boolean) map.get("consentForDataUsage"), (Boolean) map.get("consentForAdsPersonalization"), (Boolean) map.get("hasConsentForAdStorage"));
    }

    private void getAppsFlyerUID(p pVar) {
        pVar.success(AppsFlyerLib.getInstance().getAppsFlyerUID(this.mContext));
    }

    private void getHostName(p pVar) {
        pVar.success(AppsFlyerLib.getInstance().getHostName());
    }

    private void getHostPrefix(p pVar) {
        pVar.success(AppsFlyerLib.getInstance().getHostPrefix());
    }

    private void getOutOfStore(p pVar) {
        pVar.success(AppsFlyerLib.getInstance().getOutOfStore(this.mContext));
    }

    private void getSdkVersion(p pVar) {
        pVar.success(AppsFlyerLib.getInstance().getSdkVersion());
    }

    public static /* bridge */ /* synthetic */ JSONObject i(AppsflyerSdkPlugin appsflyerSdkPlugin, String str) {
        return appsflyerSdkPlugin.buildJsonResponse(str, "failure");
    }

    private void initSdk(n nVar, p pVar) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        boolean zBooleanValue = ((Boolean) nVar.a("manualStart")).booleanValue();
        String str = (String) nVar.a("afDevKey");
        if (str == null || str.equals("")) {
            Log.e("AppsFlyer_FlutterPlugin", LogMessages.AF_DEV_KEY_IS_EMPTY);
            pVar.b("INIT_ERROR", LogMessages.AF_DEV_KEY_IS_EMPTY, null);
            return;
        }
        if (((Boolean) nVar.a("disableAdvertisingIdentifier")).booleanValue()) {
            appsFlyerLib.setDisableAdvertisingIdentifiers(true);
        }
        AppsFlyerConversionListener appsFlyerConversionListener = ((Boolean) nVar.a("GCD")).booleanValue() ? this.afConversionListener : null;
        if (((Boolean) nVar.a("UDL")).booleanValue()) {
            appsFlyerLib.subscribeForDeepLink(this.afDeepLinkListener);
        }
        if (((Boolean) nVar.a("isDebug")).booleanValue()) {
            appsFlyerLib.setLogLevel(AFLogger.LogLevel.DEBUG);
            appsFlyerLib.setDebugLog(true);
        } else {
            appsFlyerLib.setDebugLog(false);
        }
        appsFlyerLib.setPluginInfo(new PluginInfo(Plugin.FLUTTER, "6.17.9"));
        appsFlyerLib.init(str, appsFlyerConversionListener, this.mContext);
        String str2 = (String) nVar.a("appInviteOneLink");
        if (str2 != null) {
            appsFlyerLib.setAppInviteOneLink(str2);
        }
        if (!zBooleanValue) {
            appsFlyerLib.start(this.activity);
        }
        if (saveCallbacks) {
            saveCallbacks = false;
            sendCachedCallbacksToDart();
        }
        pVar.success("success");
    }

    private static Bundle jsonToBundle(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            bundle.putString(next, jSONObject.getString(next));
        }
        return bundle;
    }

    private void logAdRevenue(n nVar, p pVar) {
        try {
            String str = (String) requireNonNullArgument(nVar, "monetizationNetwork");
            String str2 = (String) requireNonNullArgument(nVar, "currencyIso4217Code");
            double dDoubleValue = ((Double) requireNonNullArgument(nVar, "revenue")).doubleValue();
            MediationNetwork mediationNetworkValueOf = MediationNetwork.valueOf(((String) requireNonNullArgument(nVar, "mediationNetwork")).toUpperCase(Locale.ENGLISH));
            AppsFlyerLib.getInstance().logAdRevenue(new AFAdRevenueData(str, mediationNetworkValueOf, str2, dDoubleValue), (Map) nVar.a("additionalParameters"));
            pVar.success(Boolean.TRUE);
        } catch (IllegalArgumentException e3) {
            pVar.b("INVALID_ARGUMENT_PROVIDED", e3.getMessage(), null);
        } catch (Throwable th2) {
            pVar.b("UNEXPECTED_ERROR", "[logAdRevenue]: An unexpected error occurred: " + th2.getMessage(), null);
            Log.e("AppsFlyer_FlutterPlugin", "Unexpected exception occurred: [logAdRevenue]", th2);
        }
    }

    private void logCrossPromotionAndOpenStore(n nVar, p pVar) {
        String str = (String) nVar.a("appId");
        String str2 = (String) nVar.a("campaign");
        Map map = (Map) nVar.a(Message.JsonKeys.PARAMS);
        if (str != null && !str.equals("")) {
            CrossPromotionHelper.logAndOpenStore(this.mContext, str, str2, map);
        }
        pVar.success(null);
    }

    private void logCrossPromotionImpression(n nVar, p pVar) {
        String str = (String) nVar.a("appId");
        String str2 = (String) nVar.a("campaign");
        Map map = (Map) nVar.a("data");
        if (str != null && !str.equals("")) {
            CrossPromotionHelper.logCrossPromoteImpression(this.mContext, str, str2, map);
        }
        pVar.success(null);
    }

    private void logEvent(n nVar, p pVar) {
        AppsFlyerLib.getInstance().logEvent(this.mContext, (String) nVar.a("eventName"), (Map) nVar.a("eventValues"));
        pVar.success(Boolean.TRUE);
    }

    private AFPurchaseType mapPurchaseType(String str) {
        str.getClass();
        if (str.equals("one_time_purchase")) {
            return AFPurchaseType.ONE_TIME_PURCHASE;
        }
        if (str.equals("subscription")) {
            return AFPurchaseType.SUBSCRIPTION;
        }
        return null;
    }

    private void performOnDeepLinking(n nVar, p pVar) {
        Activity activity = this.activity;
        if (activity == null) {
            Log.d("AppsFlyer_FlutterPlugin", "performOnDeepLinking: activity is null!");
            pVar.b("NO_ACTIVITY", "The current activity is null", null);
            return;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            AppsFlyerLib.getInstance().performOnDeepLinking(intent, this.mApplication);
            pVar.success(null);
        } else {
            Log.d("AppsFlyer_FlutterPlugin", "performOnDeepLinking: intent is null!");
            pVar.b("NO_INTENT", "The intent is null", null);
        }
    }

    private void registerValidatorListener() {
        AppsFlyerLib.getInstance().registerValidatorListener(this.mContext, new AppsFlyerInAppPurchaseValidatorListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.9
            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInApp() {
                if (AppsflyerSdkPlugin.this.validatePurchaseCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(), "validatePurchase", "success");
                }
            }

            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInAppFailure(String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", str);
                    if (AppsflyerSdkPlugin.this.validatePurchaseCallback.booleanValue()) {
                        AppsflyerSdkPlugin.this.runOnUIThread(jSONObject, "validatePurchase", "failure");
                    }
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> replaceNullValues(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            map2.put(next.getKey(), next.getValue() == null ? JSONObject.NULL : next.getValue());
            it.remove();
        }
        return map2;
    }

    private <T> T requireNonNullArgument(n nVar, String str) {
        T t10 = (T) nVar.a(str);
        String str2 = nVar.f21315a;
        if (t10 != null) {
            return t10;
        }
        Log.e("AppsFlyer_FlutterPlugin", z.f("Exception occurred when trying to: ", str2, "->", str, " must not be null"));
        throw new IllegalArgumentException(z.f("[", str2, "]: ", str, " must not be null"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnUIThread(final Object obj, final String str, final String str2) {
        this.uiThreadHandler.post(new Runnable() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.7
            @Override // java.lang.Runnable
            public void run() {
                if (AppsflyerSdkPlugin.this.mCallbackChannel == null) {
                    Log.e("AppsFlyer_FlutterPlugin", "CallbackChannel is null, cannot invoke method: " + str);
                    return;
                }
                Log.d("AppsFlyer_FlutterPlugin", "Calling invokeMethod with: " + obj);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    if (str.equals("onDeepLinking")) {
                        DeepLinkResult deepLinkResult = (DeepLinkResult) obj;
                        jSONObject.put("deepLinkStatus", deepLinkResult.getStatus().toString());
                        if (deepLinkResult.getError() != null) {
                            jSONObject.put("deepLinkError", deepLinkResult.getError().toString());
                        }
                        if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND) {
                            jSONObject.put("deepLinkObj", deepLinkResult.getDeepLink().getClickEvent());
                        }
                    } else {
                        jSONObject.put("status", str2);
                        jSONObject.put("data", obj.toString());
                    }
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                AppsflyerSdkPlugin.this.mCallbackChannel.a("callListener", jSONObject.toString(), null);
            }
        });
    }

    private void sendCachedCallbacksToDart() {
        DeepLinkResult deepLinkResult = cachedDeepLinkResult;
        if (deepLinkResult != null) {
            this.afDeepLinkListener.onDeepLinking(deepLinkResult);
            cachedDeepLinkResult = null;
        }
        Map<String, Object> map = cachedOnConversionDataSuccess;
        if (map != null) {
            this.afConversionListener.onConversionDataSuccess(map);
            cachedOnConversionDataSuccess = null;
        }
        Map<String, String> map2 = cachedOnAppOpenAttribution;
        if (map2 != null) {
            this.afConversionListener.onAppOpenAttribution(map2);
            cachedOnAppOpenAttribution = null;
        }
        String str = cachedOnAttributionFailure;
        if (str != null) {
            this.afConversionListener.onAttributionFailure(str);
            cachedOnAttributionFailure = null;
        }
        String str2 = cachedOnConversionDataFail;
        if (str2 != null) {
            this.afConversionListener.onConversionDataFail(str2);
            cachedOnConversionDataFail = null;
        }
    }

    private void sendPushNotificationData(n nVar, p pVar) {
        String str;
        Map map = (Map) nVar.f21316b;
        if (map == null) {
            Log.d("AppsFlyer_FlutterPlugin", "Push payload is null");
            return;
        }
        try {
            Bundle bundleJsonToBundle = jsonToBundle(new JSONObject(map));
            Activity activity = this.activity;
            if (activity != null) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    intent.putExtras(bundleJsonToBundle);
                    this.activity.setIntent(intent);
                    AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
                    str = null;
                } else {
                    str = "The intent is null. Push payload has not been sent!";
                }
            } else {
                str = "The activity is null. Push payload has not been sent!";
            }
            if (str != null) {
                Log.d("AppsFlyer_FlutterPlugin", str);
            } else {
                pVar.success(null);
            }
        } catch (JSONException unused) {
            Log.d("AppsFlyer_FlutterPlugin", "Can't parse pushPayload to bundle");
        }
    }

    private void setAdditionalData(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setAdditionalData((HashMap) nVar.a("customData"));
        pVar.success(null);
    }

    private void setAndroidIdData(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setAndroidIdData((String) nVar.a("androidId"));
        pVar.success(null);
    }

    private void setAppInivteOneLinkID(n nVar, p pVar) {
        String str = (String) nVar.a("oneLinkID");
        if (str == null || str.length() == 0) {
            pVar.success(null);
            return;
        }
        AppsFlyerLib.getInstance().setAppInviteOneLink(str);
        if (this.mCallbacks.containsKey("setAppInviteOneLinkIDCallback")) {
            runOnUIThread(buildJsonResponse("success", "success"), "setAppInviteOneLinkIDCallback", "success");
        }
    }

    private void setCollectAndroidId(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setCollectAndroidID(((Boolean) nVar.a("isCollect")).booleanValue());
        pVar.success(null);
    }

    private void setCollectIMEI(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setCollectIMEI(((Boolean) nVar.a("isCollect")).booleanValue());
        pVar.success(null);
    }

    private void setCurrencyCode(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setCurrencyCode((String) nVar.a(AppsFlyerProperties.CURRENCY_CODE));
        pVar.success(null);
    }

    private void setCustomerIdAndLogSession(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setCustomerIdAndLogSession((String) nVar.a("id"), this.mContext);
        pVar.success(null);
    }

    private void setCustomerUserId(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setCustomerUserId((String) nVar.a("id"));
        pVar.success(null);
    }

    private void setDisableAdvertisingIdentifiers(n nVar, p pVar) {
        Boolean bool = (Boolean) nVar.f21316b;
        bool.booleanValue();
        this.isSetDisableAdvertisingIdentifiersEnable = bool;
        if (bool.booleanValue()) {
            AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(true);
        } else {
            AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(false);
        }
        pVar.success(null);
    }

    private void setDisableNetworkData(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setDisableNetworkData(((Boolean) nVar.f21316b).booleanValue());
        pVar.success(null);
    }

    private void setHost(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setHost((String) nVar.a("hostPrefix"), (String) nVar.a("hostName"));
    }

    private void setImeiData(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setImeiData((String) nVar.a("imei"));
        pVar.success(null);
    }

    private void setIsUpdate(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setIsUpdate(((Boolean) nVar.a("isUpdate")).booleanValue());
        pVar.success(null);
    }

    private void setMinTimeBetweenSessions(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setMinTimeBetweenSessions(((Integer) nVar.a("seconds")).intValue());
        pVar.success(null);
    }

    private void setOneLinkCustomDomain(n nVar, p pVar) {
        ArrayList arrayList = (ArrayList) nVar.f21316b;
        AppsFlyerLib.getInstance().setOneLinkCustomDomain((String[]) arrayList.toArray(new String[arrayList.size()]));
        pVar.success(null);
    }

    private void setOutOfStore(n nVar, p pVar) {
        String str = (String) nVar.f21316b;
        if (str != null) {
            AppsFlyerLib.getInstance().setOutOfStore(str);
        }
        pVar.success(null);
    }

    private void setPartnerData(n nVar, p pVar) {
        String str = (String) nVar.a("partnerId");
        HashMap map = (HashMap) nVar.a("partnersData");
        if (map != null) {
            AppsFlyerLib.getInstance().setPartnerData(str, map);
        }
        pVar.success(null);
    }

    private void setPushNotification(n nVar, p pVar) {
        AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
        pVar.success(null);
    }

    private void setResolveDeepLinkURLs(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setResolveDeepLinkURLs((String[]) ((ArrayList) nVar.f21316b).toArray(new String[0]));
        pVar.success(null);
    }

    private void setSharingFilter(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setSharingFilter(new String[0]);
        pVar.success(null);
    }

    private void setSharingFilterForAllPartners(p pVar) {
        AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
        pVar.success(null);
    }

    private void setSharingFilterForPartners(n nVar, p pVar) {
        Object obj = nVar.f21316b;
        if (obj != null) {
            ArrayList arrayList = (ArrayList) obj;
            AppsFlyerLib.getInstance().setSharingFilterForPartners((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        pVar.success(null);
    }

    private void setUserEmails(n nVar, p pVar) {
        AppsFlyerProperties.EmailsCryptType emailsCryptType;
        List list = (List) nVar.a("emails");
        int iIntValue = ((Integer) nVar.a("cryptType")).intValue();
        if (iIntValue == 0) {
            emailsCryptType = AppsFlyerProperties.EmailsCryptType.NONE;
        } else {
            if (iIntValue != 1) {
                throw new InvalidParameterException("You can use only NONE or SHA256 for EmailsCryptType on android");
            }
            emailsCryptType = AppsFlyerProperties.EmailsCryptType.SHA256;
        }
        if (list != null) {
            AppsFlyerLib.getInstance().setUserEmails(emailsCryptType, (String[]) list.toArray(new String[0]));
        }
        pVar.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startListening(Object obj, p pVar) {
        String str = (String) obj;
        if (str.equals("onInstallConversionData")) {
            this.gcdCallback = Boolean.TRUE;
        }
        if (str.equals("onAppOpenAttribution")) {
            this.oaoaCallback = Boolean.TRUE;
        }
        if (str.equals("onDeepLinking")) {
            this.udlCallback = Boolean.TRUE;
        }
        if (str.equals("validatePurchase")) {
            this.validatePurchaseCallback = Boolean.TRUE;
        }
        HashMap map = new HashMap();
        map.put("id", str);
        this.mCallbacks.put(str, map);
        pVar.success(null);
    }

    private void startSDK(n nVar, p pVar) {
        AppsFlyerLib.getInstance().start(this.activity);
        pVar.success(null);
    }

    private void startSDKwithHandler(n nVar, p pVar) {
        try {
            AppsFlyerLib.getInstance().start(this.activity, null, new AnonymousClass5());
            pVar.success(null);
        } catch (Throwable th2) {
            pVar.b("UNEXPECTED_ERROR", th2.getMessage(), null);
        }
    }

    private void stop(n nVar, p pVar) {
        AppsFlyerLib.getInstance().stop(((Boolean) nVar.a("isStopped")).booleanValue(), this.mContext);
        pVar.success(null);
    }

    private void updateServerUninstallToken(n nVar, p pVar) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(this.mContext, (String) nVar.a("token"));
        pVar.success(null);
    }

    private void validateAndLogInAppPurchase(n nVar, p pVar) {
        registerValidatorListener();
        AppsFlyerLib.getInstance().validateAndLogInAppPurchase(this.mContext, (String) nVar.a("publicKey"), (String) nVar.a("signature"), (String) nVar.a("purchaseData"), (String) nVar.a("price"), (String) nVar.a("currency"), (Map) nVar.a("additionalParameters"));
        pVar.success(null);
    }

    private void validateAndLogInAppPurchaseV2(n nVar, final p pVar) {
        try {
            Map map = (Map) nVar.a("purchaseDetails");
            Map<String, String> map2 = (Map) nVar.a("additionalParameters");
            if (map == null) {
                pVar.b("INVALID_ARGUMENTS", "Purchase details cannot be null", null);
                return;
            }
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            String str = (String) map.get("purchaseType");
            String str2 = (String) map.get("purchaseToken");
            String str3 = (String) map.get("productId");
            if (str != null && str2 != null && str3 != null) {
                AFPurchaseType aFPurchaseTypeMapPurchaseType = mapPurchaseType(str);
                if (aFPurchaseTypeMapPurchaseType == null) {
                    pVar.b("INVALID_PURCHASE_TYPE", "Invalid purchase type: " + str + ". Expected: 'subscription' or 'one_time_purchase'", null);
                    return;
                }
                AFPurchaseDetails aFPurchaseDetails = new AFPurchaseDetails(aFPurchaseTypeMapPurchaseType, str2, str3);
                Log.d("AppsFlyer_FlutterPlugin", "validateAndLogInAppPurchaseV2 called with " + map);
                AppsFlyerLib.getInstance().validateAndLogInAppPurchase(aFPurchaseDetails, map2, new AppsFlyerInAppPurchaseValidationCallback() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.8
                    @Override // com.appsflyer.AppsFlyerInAppPurchaseValidationCallback
                    public void onInAppPurchaseValidationError(Map<String, ?> map3) {
                        Log.d("AppsFlyer_FlutterPlugin", "Purchase validation V2 returned error");
                        String str4 = map3.containsKey("error_message") ? (String) map3.get("error_message") : "Purchase validation failed";
                        HashMap map4 = new HashMap();
                        for (Map.Entry<String, ?> entry : map3.entrySet()) {
                            map4.put(entry.getKey(), entry.getValue());
                        }
                        pVar.b("VALIDATION_ERROR", str4, map4);
                    }

                    @Override // com.appsflyer.AppsFlyerInAppPurchaseValidationCallback
                    public void onInAppPurchaseValidationFinished(Map<String, ?> map3) {
                        Log.d("AppsFlyer_FlutterPlugin", "Purchase validation V2 response arrived");
                        HashMap map4 = new HashMap();
                        for (Map.Entry<String, ?> entry : map3.entrySet()) {
                            map4.put(entry.getKey(), entry.getValue());
                        }
                        pVar.success(map4);
                    }
                });
                return;
            }
            pVar.b("INVALID_ARGUMENTS", "Purchase details must contain purchaseType, purchaseToken, and productId", null);
        } catch (Exception e3) {
            Log.e("AppsFlyer_FlutterPlugin", "Error in validateAndLogInAppPurchaseV2: " + e3.getMessage(), e3);
            pVar.b("VALIDATION_ERROR", "Purchase validation failed: " + e3.getMessage(), null);
        }
    }

    private void waitForCustomerUserId(n nVar, p pVar) {
        AppsFlyerLib.getInstance().waitForCustomerUserId(((Boolean) nVar.a("wait")).booleanValue());
        pVar.success(null);
    }

    @Override // fi.a
    public void onAttachedToActivity(fi.b bVar) {
        h3 h3Var = (h3) bVar;
        w wVar = (w) h3Var.f28250b;
        this.activity = wVar;
        this.mApplication = wVar.getApplication();
        ((HashSet) h3Var.f28254f).add(this.onNewIntentListener);
    }

    @Override // ei.b
    public void onAttachedToEngine(ei.a aVar) {
        onAttachedToEngine(aVar.f16381a, aVar.f16383c);
        AppsFlyerPurchaseConnector.INSTANCE.onAttachedToEngine(aVar);
    }

    @Override // fi.a
    public void onDetachedFromActivity() {
        this.activity = null;
        saveCallbacks = true;
        AppsFlyerLib.getInstance().unregisterConversionListener();
    }

    @Override // fi.a
    public void onDetachedFromActivityForConfigChanges() {
        this.activity = null;
    }

    @Override // ei.b
    public void onDetachedFromEngine(ei.a aVar) {
        this.mMethodChannel.b(null);
        this.mMethodChannel = null;
        this.mEventChannel.a(null);
        this.mEventChannel = null;
        AppsFlyerPurchaseConnector.INSTANCE.onDetachedFromEngine(aVar);
        this.mContext = null;
        this.mApplication = null;
    }

    @Override // ii.o
    public void onMethodCall(n nVar, p pVar) {
        if (this.activity == null) {
            Log.d("AppsFlyer_FlutterPlugin", LogMessages.ACTIVITY_NOT_ATTACHED_TO_ENGINE);
            pVar.b("NO_ACTIVITY", "The current activity is null", null);
        }
        String str = nVar.f21315a;
        str.getClass();
        switch (str) {
            case "setAppInviteOneLinkID":
                setAppInivteOneLinkID(nVar, pVar);
                break;
            case "validateAndLogInAppAndroidPurchase":
                validateAndLogInAppPurchase(nVar, pVar);
                break;
            case "setSharingFilterForPartners":
                setSharingFilterForPartners(nVar, pVar);
                break;
            case "setPushNotification":
                setPushNotification(nVar, pVar);
                break;
            case "disableAppSetId":
                disableAppSetId(nVar, pVar);
                break;
            case "getHostPrefix":
                getHostPrefix(pVar);
                break;
            case "setPartnerData":
                setPartnerData(nVar, pVar);
                break;
            case "setOneLinkCustomDomain":
                setOneLinkCustomDomain(nVar, pVar);
                break;
            case "getOutOfStore":
                getOutOfStore(pVar);
                break;
            case "enableFacebookDeferredApplinks":
                enableFacebookDeferredApplinks(nVar, pVar);
                break;
            case "setCurrencyCode":
                setCurrencyCode(nVar, pVar);
                break;
            case "sendPushNotificationData":
                sendPushNotificationData(nVar, pVar);
                break;
            case "setCollectIMEI":
                setCollectIMEI(nVar, pVar);
                break;
            case "logCrossPromotionAndOpenStore":
                logCrossPromotionAndOpenStore(nVar, pVar);
                break;
            case "setOutOfStore":
                setOutOfStore(nVar, pVar);
                break;
            case "setConsentData":
                setConsentData(nVar, pVar);
                break;
            case "getSDKVersion":
                getSdkVersion(pVar);
                break;
            case "logAdRevenue":
                logAdRevenue(nVar, pVar);
                break;
            case "logCrossPromotionImpression":
                logCrossPromotionImpression(nVar, pVar);
                break;
            case "setDisableNetworkData":
                setDisableNetworkData(nVar, pVar);
                break;
            case "stop":
                stop(nVar, pVar);
                break;
            case "setDisableAdvertisingIdentifiers":
                setDisableAdvertisingIdentifiers(nVar, pVar);
                break;
            case "setAndroidIdData":
                setAndroidIdData(nVar, pVar);
                break;
            case "setSharingFilter":
                setSharingFilter(nVar, pVar);
                break;
            case "anonymizeUser":
                anonymizeUser(nVar, pVar);
                break;
            case "updateServerUninstallToken":
                updateServerUninstallToken(nVar, pVar);
                break;
            case "setMinTimeBetweenSessions":
                setMinTimeBetweenSessions(nVar, pVar);
                break;
            case "waitForCustomerUserId":
                waitForCustomerUserId(nVar, pVar);
                break;
            case "setSharingFilterForAllPartners":
                setSharingFilterForAllPartners(pVar);
                break;
            case "setCustomerIdAndLogSession":
                setCustomerIdAndLogSession(nVar, pVar);
                break;
            case "setCustomerUserId":
                setCustomerUserId(nVar, pVar);
                break;
            case "setConsentDataV2":
                setConsentDataV2(nVar, pVar);
                break;
            case "generateInviteLink":
                generateInviteLink(nVar, pVar);
                break;
            case "enableTCFDataCollection":
                enableTCFDataCollection(nVar, pVar);
                break;
            case "setResolveDeepLinkURLs":
                setResolveDeepLinkURLs(nVar, pVar);
                break;
            case "setImeiData":
                setImeiData(nVar, pVar);
                break;
            case "startSDK":
                startSDK(nVar, pVar);
                break;
            case "performOnDeepLinking":
                performOnDeepLinking(nVar, pVar);
                break;
            case "startSDKwithHandler":
                startSDKwithHandler(nVar, pVar);
                break;
            case "setUserEmails":
                setUserEmails(nVar, pVar);
                break;
            case "getHostName":
                getHostName(pVar);
                break;
            case "addPushNotificationDeepLinkPath":
                addPushNotificationDeepLinkPath(nVar, pVar);
                break;
            case "setIsUpdate":
                setIsUpdate(nVar, pVar);
                break;
            case "setCollectAndroidId":
                setCollectAndroidId(nVar, pVar);
                break;
            case "initSdk":
                initSdk(nVar, pVar);
                break;
            case "setHost":
                setHost(nVar, pVar);
                break;
            case "logEvent":
                logEvent(nVar, pVar);
                break;
            case "getAppsFlyerUID":
                getAppsFlyerUID(pVar);
                break;
            case "validateAndLogInAppPurchaseV2":
                validateAndLogInAppPurchaseV2(nVar, pVar);
                break;
            case "setAdditionalData":
                setAdditionalData(nVar, pVar);
                break;
            default:
                pVar.a();
                break;
        }
    }

    @Override // fi.a
    public void onReattachedToActivityForConfigChanges(fi.b bVar) {
        sendCachedCallbacksToDart();
        h3 h3Var = (h3) bVar;
        ((HashSet) h3Var.f28254f).add(this.onNewIntentListener);
        this.activity = (w) h3Var.f28250b;
    }

    @Deprecated
    public void setConsentData(n nVar, p pVar) {
        Map map = (Map) ((Map) nVar.f21316b).get("consentData");
        boolean zBooleanValue = ((Boolean) map.get("isUserSubjectToGDPR")).booleanValue();
        Boolean bool = (Boolean) map.get("hasConsentForDataUsage");
        Boolean bool2 = (Boolean) map.get("hasConsentForAdsPersonalization");
        AppsFlyerLib.getInstance().setConsentData((!zBooleanValue || bool == null || bool2 == null) ? AppsFlyerConsent.forNonGDPRUser() : AppsFlyerConsent.forGDPRUser(bool.booleanValue(), bool2.booleanValue()));
        pVar.success(null);
    }

    public void setConsentDataV2(n nVar, p pVar) {
        try {
            AppsFlyerLib.getInstance().setConsentData(getAppsFlyerConsentFromCall(nVar));
            pVar.success(null);
        } catch (Exception e3) {
            Log.e("AppsFlyer_FlutterPlugin", LogMessages.ERROR_WHILE_SETTING_CONSENT + e3.getMessage(), e3);
            pVar.b("CONSENT_ERROR", LogMessages.ERROR_WHILE_SETTING_CONSENT + e3.getMessage(), null);
        }
    }

    private void onAttachedToEngine(Context context, f fVar) {
        this.mContext = context;
        this.mEventChannel = new i(fVar, "af-events");
        q qVar = new q(fVar, "af-api");
        this.mMethodChannel = qVar;
        qVar.b(this);
        q qVar2 = new q(fVar, "callbacks");
        this.mCallbackChannel = qVar2;
        qVar2.b(this.callbacksHandler);
    }
}
