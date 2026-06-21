package d8;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15627c;

    public /* synthetic */ g0(JSONObject jSONObject) {
        this.f15625a = jSONObject.optString("productId");
        this.f15626b = jSONObject.optString("productType");
        String strOptString = jSONObject.optString("offerToken");
        this.f15627c = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f15625a.equals(g0Var.f15625a) && this.f15626b.equals(g0Var.f15626b) && Objects.equals(this.f15627c, g0Var.f15627c);
    }

    public final int hashCode() {
        return Objects.hash(this.f15625a, this.f15626b, this.f15627c);
    }

    public final String toString() {
        return a0.u.o(t.z.j("{id: ", this.f15625a, ", type: ", this.f15626b, ", offer token: "), this.f15627c, "}");
    }
}
