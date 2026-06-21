package d8;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f15686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15692h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f15693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f15694k;

    public o(String str) {
        this.f15685a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f15686b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f15687c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f15688d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f15689e = jSONObject.optString("title");
        this.f15690f = jSONObject.optString("name");
        this.f15691g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f15692h = jSONObject.optString("skuDetailsToken");
        this.i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new n(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.f15693j = arrayList;
        } else {
            this.f15693j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f15686b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f15686b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                arrayList2.add(new l(jSONArrayOptJSONArray2.getJSONObject(i10)));
            }
            this.f15694k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f15694k = null;
        } else {
            arrayList2.add(new l(jSONObjectOptJSONObject));
            this.f15694k = arrayList2;
        }
    }

    public final l a() {
        ArrayList arrayList = this.f15694k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (l) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return TextUtils.equals(this.f15685a, ((o) obj).f15685a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15685a.hashCode();
    }

    public final String toString() {
        String string = this.f15686b.toString();
        String strValueOf = String.valueOf(this.f15693j);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        l7.o.t(sb2, this.f15685a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f15687c);
        sb2.append("', productType='");
        sb2.append(this.f15688d);
        sb2.append("', title='");
        sb2.append(this.f15689e);
        sb2.append("', productDetailsToken='");
        return om1.n(sb2, this.f15692h, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
