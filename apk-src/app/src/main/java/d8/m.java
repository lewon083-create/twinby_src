package d8;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15653f;

    public m(JSONObject jSONObject) {
        this.f15651d = jSONObject.optString("billingPeriod");
        this.f15650c = jSONObject.optString("priceCurrencyCode");
        this.f15648a = jSONObject.optString("formattedPrice");
        this.f15649b = jSONObject.optLong("priceAmountMicros");
        this.f15653f = jSONObject.optInt("recurrenceMode");
        this.f15652e = jSONObject.optInt("billingCycleCount");
    }
}
