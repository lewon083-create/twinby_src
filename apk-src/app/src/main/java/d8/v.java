package d8;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15705c;

    public v(JSONObject jSONObject) {
        this.f15703a = jSONObject.optString("productId");
        this.f15704b = jSONObject.optString("productType");
        String strOptString = jSONObject.optString("offerToken");
        this.f15705c = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f15703a.equals(vVar.f15703a) && this.f15704b.equals(vVar.f15704b) && Objects.equals(this.f15705c, vVar.f15705c);
    }

    public final int hashCode() {
        return Objects.hash(this.f15703a, this.f15704b, this.f15705c);
    }

    public final String toString() {
        return a0.u.o(t.z.j("{id: ", this.f15703a, ", type: ", this.f15704b, ", offer token: "), this.f15705c, "}");
    }
}
