package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ii0 extends kotlin.jvm.internal.r implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ji0 f39549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f39550c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii0(ji0 ji0Var, ArrayList arrayList) {
        super(2);
        this.f39549b = ji0Var;
        this.f39550c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        yh0 yh0Var = (yh0) obj2;
        this.f39549b.getClass();
        String str = null;
        if (jSONObject.has("view_name")) {
            try {
                obj3 = jSONObject.get("view_name");
            } catch (JSONException unused) {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str = (String) obj3;
            }
        }
        if (str != null) {
            this.f39550c.add(new xh0(yh0Var, str));
        }
        return Unit.f27471a;
    }
}
