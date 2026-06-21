package d8;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nc.e f15646f;

    public l(JSONObject jSONObject) throws JSONException {
        this.f15641a = jSONObject.optString("formattedPrice");
        this.f15642b = jSONObject.optLong("priceAmountMicros");
        this.f15643c = jSONObject.optString("priceCurrencyCode");
        String strOptString = jSONObject.optString("offerIdToken");
        nc.e eVar = null;
        this.f15644d = true == strOptString.isEmpty() ? null : strOptString;
        jSONObject.optString("offerId").getClass();
        jSONObject.optString("purchaseOptionId").getClass();
        jSONObject.optInt("offerType");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
        }
        com.google.android.gms.internal.play_billing.c0.r(arrayList);
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.getInt("percentageDiscount");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getLong("startTimeMillis");
            jSONObjectOptJSONObject2.getLong("endTimeMillis");
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.getInt("maximumQuantity");
            jSONObjectOptJSONObject3.getInt("remainingQuantity");
        }
        this.f15645e = jSONObject.optString("serializedDocid");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
            jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
        if (jSONObjectOptJSONObject5 != null) {
            jSONObjectOptJSONObject5.getString("rentalPeriod");
            jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
        if (jSONObjectOptJSONObject6 != null) {
            eVar = new nc.e();
            jSONObjectOptJSONObject6.getString("type");
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("balanceThresholds");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray2 != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                    arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.getInt(i10)));
                }
            }
            JSONArray jSONArray = jSONObjectOptJSONObject6.getJSONArray("pricingPhases");
            ArrayList arrayList3 = new ArrayList();
            if (jSONArray != null) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject7 = jSONArray.optJSONObject(i11);
                    if (jSONObjectOptJSONObject7 != null) {
                        arrayList3.add(new m(jSONObjectOptJSONObject7));
                    }
                }
            }
        }
        this.f15646f = eVar;
    }
}
