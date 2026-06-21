package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
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
public final class AFe1aSDK extends AFe1fSDK<String> {
    public AFh1iSDK component2;
    private final AFc1oSDK copy;
    private final AFc1hSDK equals;
    private final AFi1hSDK hashCode;
    private final AFg1nSDK toString;

    public /* synthetic */ AFe1aSDK(AFi1hSDK aFi1hSDK, AFc1oSDK aFc1oSDK, AFd1zSDK aFd1zSDK, AFg1nSDK aFg1nSDK, AFc1hSDK aFc1hSDK, AFh1iSDK aFh1iSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1hSDK, aFc1oSDK, aFd1zSDK, aFg1nSDK, aFc1hSDK, (i & 32) != 0 ? new AFh1iSDK() : aFh1iSDK);
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return TimeUnit.MINUTES.toMillis(1L);
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AppsFlyerRequestListener component2() {
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

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AFd1hSDK<String> AFAdRevenueData(String str) throws JSONException {
        AFd1bSDK aFd1bSDK;
        String str2;
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(str, "");
        AFh1iSDK aFh1iSDK = this.component2;
        Map<String, Object> map = aFh1iSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put(CommonUrlParts.APP_ID, this.copy.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName());
        map.put("sdk_version", AFc1oSDK.getMonetizationNetwork());
        map.put(CommonUrlParts.APP_VERSION, this.copy.n_().versionName);
        this.toString.AFAdRevenueData(map);
        try {
            AFi1jSDK mediationNetwork = this.hashCode.getMediationNetwork();
            if (mediationNetwork != null) {
                linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("pia_timestamp", Long.valueOf(mediationNetwork.getMediationNetwork));
                linkedHashMap2.put("ttr_millis", Long.valueOf(mediationNetwork.getCurrencyIso4217Code));
                String str3 = mediationNetwork.getRevenue;
                if (str3 != null) {
                    linkedHashMap2.put("pia_token", str3);
                }
                String str4 = mediationNetwork.AFAdRevenueData;
                if (str4 != null) {
                    linkedHashMap2.put(VKApiCodes.PARAM_ERROR_CODE, str4);
                }
                linkedHashMap.put("pia", linkedHashMap2);
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                aFh1iSDK.AFAdRevenueData(linkedHashMap);
            }
            if (!this.hashCode.AFAdRevenueData()) {
                Map<String, Object> map2 = aFh1iSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map2, "");
                AFj1aSDK.AFAdRevenueData(map2).put("pia_disabled", Boolean.TRUE);
            }
        } catch (Throwable th2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th2, true, false, false, false, 96, null);
        }
        AFd1hSDK<String> currencyIso4217Code = ((AFe1fSDK) this).component4.getCurrencyIso4217Code(this.component2, ((AFe1fSDK) this).component1.getMediationNetwork(), this.equals);
        Map<String, Object> map3 = this.component2.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        if (currencyIso4217Code != null && (aFd1bSDK = currencyIso4217Code.getMonetizationNetwork) != null && (str2 = aFd1bSDK.getMediationNetwork) != null) {
            JSONObject jSONObject = new JSONObject(map3);
            if (jSONObject.has("pia")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("pia");
                if (jSONObject2.has("pia_token")) {
                    jSONObject2.put("pia_token", AFg1aSDK.getCurrencyIso4217Code(jSONObject2.getString("pia_token")));
                }
            }
            AFg1aSDK.getRevenue(toString() + ": preparing data: ", jSONObject);
            AFd1oSDK aFd1oSDK = this.component3;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            aFd1oSDK.getRevenue(str2, string);
        }
        return currencyIso4217Code;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private AFe1aSDK(AFi1hSDK aFi1hSDK, AFc1oSDK aFc1oSDK, AFd1zSDK aFd1zSDK, AFg1nSDK aFg1nSDK, AFc1hSDK aFc1hSDK, AFh1iSDK aFh1iSDK) {
        Intrinsics.checkNotNullParameter(aFi1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFh1iSDK, "");
        AFe1pSDK aFe1pSDK = AFe1pSDK.PLAY_INTEGRITY_API;
        AFe1pSDK aFe1pSDK2 = AFe1pSDK.CONVERSION;
        super(aFe1pSDK, new AFe1pSDK[]{aFe1pSDK2}, aFd1zSDK, "PIA");
        this.hashCode = aFi1hSDK;
        this.copy = aFc1oSDK;
        this.toString = aFg1nSDK;
        this.equals = aFc1hSDK;
        this.component2 = aFh1iSDK;
        this.AFAdRevenueData.add(aFe1pSDK2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1aSDK(AFi1hSDK aFi1hSDK, AFc1oSDK aFc1oSDK, AFd1zSDK aFd1zSDK, AFg1nSDK aFg1nSDK, AFc1hSDK aFc1hSDK) {
        this(aFi1hSDK, aFc1oSDK, aFd1zSDK, aFg1nSDK, aFc1hSDK, null, 32, null);
        Intrinsics.checkNotNullParameter(aFi1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
    }
}
