package com.appsflyer.internal;

import com.google.android.gms.internal.measurement.h5;
import io.sentry.metrics.MetricsUnit;
import java.util.ArrayList;
import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFi1zSDK {
    public final AFh1aSDK getCurrencyIso4217Code;
    public AFi1xSDK getMediationNetwork;
    public final AFi1uSDK getMonetizationNetwork;

    public AFi1zSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getMediationNetwork = AFAdRevenueData(jSONObject);
        this.getCurrencyIso4217Code = getMediationNetwork(jSONObject);
        this.getMonetizationNetwork = getRevenue(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.b0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    private static AFi1xSDK AFAdRevenueData(JSONObject jSONObject) {
        Object objS;
        ?? arrayList;
        try {
            ij.k kVar = ij.m.f21341c;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (jSONObjectAFAdRevenueData != null) {
                long j10 = jSONObjectAFAdRevenueData.getLong("ttl");
                int i = jSONObjectAFAdRevenueData.getInt("counter");
                String strOptString = jSONObjectAFAdRevenueData.optString("app_ver", "");
                String strOptString2 = jSONObjectAFAdRevenueData.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectAFAdRevenueData.optDouble(MetricsUnit.Fraction.RATIO, 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectAFAdRevenueData.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "");
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = jSONArrayOptJSONArray.getString(i10);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                } else {
                    arrayList = b0.f27475b;
                }
                ?? r72 = arrayList;
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                objS = new AFi1xSDK(j10, fOptDouble, r72, i, strOptString, strOptString2);
            } else {
                objS = null;
            }
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = h5.s(th2);
        }
        ij.k kVar3 = ij.m.f21341c;
        return (AFi1xSDK) (objS instanceof ij.l ? null : objS);
    }

    private static AFh1aSDK getMediationNetwork(JSONObject jSONObject) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            objS = jSONObjectAFAdRevenueData != null ? new AFh1aSDK(jSONObjectAFAdRevenueData.getString("sdk_ver"), jSONObjectAFAdRevenueData.optInt("min", -1), jSONObjectAFAdRevenueData.optInt("expire", -1), jSONObjectAFAdRevenueData.optLong("ttl", -1L)) : null;
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = h5.s(th2);
        }
        return (AFh1aSDK) (objS instanceof ij.l ? null : objS);
    }

    private static AFi1uSDK getRevenue(JSONObject jSONObject) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            objS = jSONObjectAFAdRevenueData != null ? new AFi1uSDK(jSONObjectAFAdRevenueData.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = h5.s(th2);
        }
        return (AFi1uSDK) (objS instanceof ij.l ? null : objS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFi1zSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "");
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        return Intrinsics.a(this.getCurrencyIso4217Code, aFi1zSDK.getCurrencyIso4217Code) && Intrinsics.a(this.getMonetizationNetwork, aFi1zSDK.getMonetizationNetwork) && Intrinsics.a(this.getMediationNetwork, aFi1zSDK.getMediationNetwork);
    }

    public final int hashCode() {
        AFh1aSDK aFh1aSDK = this.getCurrencyIso4217Code;
        int iHashCode = (aFh1aSDK != null ? aFh1aSDK.hashCode() : 0) * 31;
        AFi1uSDK aFi1uSDK = this.getMonetizationNetwork;
        int iHashCode2 = (iHashCode + (aFi1uSDK != null ? aFi1uSDK.hashCode() : 0)) * 31;
        AFi1xSDK aFi1xSDK = this.getMediationNetwork;
        return iHashCode2 + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
