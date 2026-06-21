package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFPurchaseType;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFf1ySDK extends AFe1jSDK {
    private final AppsFlyerProperties component2;
    private final AFj1iSDK copydefault;
    private final AppsFlyerInAppPurchaseValidationCallback equals;
    private final Map<String, String> hashCode;
    private final AFPurchaseDetails toString;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class AFa1tSDK extends RuntimeException {
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFPurchaseType.values().length];
            try {
                iArr[AFPurchaseType.SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFPurchaseType.ONE_TIME_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
        }
    }

    public /* synthetic */ AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1iSDK aFj1iSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i & 32) != 0 ? new AFj1hSDK() : aFj1iSDK);
    }

    private final void getMediationNetwork(String str, int i) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.equals;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(j0.g(new Pair(VKApiCodes.PARAM_ERROR_CODE, Integer.valueOf(i)), new Pair("error_message", str)));
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        Object objS;
        super.getCurrencyIso4217Code();
        Throwable thComponent1 = component1();
        if (thComponent1 != null && !(thComponent1 instanceof AFe1iSDK)) {
            if (thComponent1 instanceof AFe1nSDK) {
                getMediationNetwork("No dev key", -1);
            } else if (thComponent1 instanceof AFa1tSDK) {
                getMediationNetwork("One or more of provided arguments is empty", -1);
            } else {
                getMediationNetwork("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.equals;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(j0.g(new Pair(VKApiCodes.PARAM_ERROR_CODE, Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                ij.k kVar = ij.m.f21341c;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.equals;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1bSDK.getMonetizationNetwork(new JSONObject((String) responseNetwork.getBody())));
                    objS = Unit.f27471a;
                } else {
                    objS = null;
                }
            } catch (Throwable th2) {
                ij.k kVar2 = ij.m.f21341c;
                objS = h5.s(th2);
            }
            if (ij.m.a(objS) != null) {
                getMediationNetwork("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final void getMonetizationNetwork(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        super.getMonetizationNetwork(map, str);
        List listF = s.f(this.toString.getPurchaseToken(), this.toString.getProductId());
        if (!(listF instanceof Collection) || !listF.isEmpty()) {
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1tSDK();
                }
            }
        }
        map.put("purchase_token", this.toString.getPurchaseToken());
        map.put("product_id", this.toString.getProductId());
        map.put("purchase_type", this.toString.getPurchaseType().getValue());
        Map<String, String> map2 = this.hashCode;
        if (map2 != null && !map2.isEmpty()) {
            map.put("purchase_additional_details", this.hashCode);
        }
        String string = this.component2.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        map.put("custom_data", (string == null || string.length() == 0) ? j0.d() : AFj1bSDK.getMonetizationNetwork(new JSONObject(string)));
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final AFd1hSDK<String> getRevenue(Map<String, Object> map, String str, String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i = AFa1ySDK.getRevenue[this.toString.getPurchaseType().ordinal()];
        if (i == 1) {
            return ((AFe1fSDK) this).component4.getCurrencyIso4217Code(map, str);
        }
        if (i == 2) {
            return ((AFe1fSDK) this).component4.getMonetizationNetwork(map, str);
        }
        throw new ij.j();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1iSDK aFj1iSDK) {
        super(AFe1pSDK.MANUAL_PURCHASE_VALIDATION, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, null, j0.d());
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1iSDK, "");
        this.component2 = appsFlyerProperties;
        this.toString = aFPurchaseDetails;
        this.hashCode = map;
        this.equals = appsFlyerInAppPurchaseValidationCallback;
        this.copydefault = aFj1iSDK;
        this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final String getCurrencyIso4217Code(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return this.copydefault.getMediationNetwork();
    }
}
