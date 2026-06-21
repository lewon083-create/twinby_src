package yads;

import com.appsflyer.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq2 f37476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i12 f37477b;

    public /* synthetic */ cq2() {
        this(new iq2(), new i12());
    }

    public final ho2 a(v9 v9Var, d4 d4Var) {
        String str;
        String str2;
        String str3;
        Map map;
        e00 e00Var;
        ho2 ho2Var = new ho2(new LinkedHashMap(), 2);
        if (v9Var == null || !v9Var.f43953y) {
            ho2Var.b(v9Var != null ? v9Var.f43931b : null, "ad_type_format");
            ho2Var.b(v9Var != null ? v9Var.f43933d : null, "product_type");
        }
        if (v9Var == null || (str = v9Var.f43934e) == null) {
            str = d4Var.f37615c.f39118a;
        }
        ho2Var.b(str, "ad_unit_id");
        ho2Var.b(v9Var != null ? v9Var.f43940l : null, "ad_source");
        if (v9Var == null || (e00Var = v9Var.f43930a) == null || (str2 = e00Var.f37950b) == null) {
            str2 = d4Var.f37613a.f37950b;
        }
        ho2Var.b(str2, AdRevenueScheme.AD_TYPE);
        ho2Var.a(v9Var != null ? v9Var.f43939k : null, "design");
        List list = v9Var != null ? v9Var.f43937h : null;
        if (list != null && (!list.isEmpty())) {
            ho2Var.f39286a.put("active_experiments", list);
        }
        ho2Var.a(v9Var != null ? v9Var.f43943o : null, "server_log_id");
        this.f37476a.getClass();
        if ((v9Var != null ? v9Var.f43945q : null) != null) {
            str3 = "mediation";
        } else {
            str3 = (v9Var != null ? v9Var.f43948t : null) != null ? "ad" : "empty";
        }
        ho2Var.b(str3, "response_type");
        if (v9Var != null && (map = v9Var.f43949u) != null) {
            ho2Var.f39286a.putAll(map);
        }
        ho2Var.f39287b = v9Var != null ? v9Var.i : null;
        return ho2Var;
    }

    public final ho2 b(v9 v9Var, d4 d4Var) {
        List listB;
        ho2 ho2VarA = a(v9Var, d4Var);
        f12 f12Var = v9Var != null ? (f12) v9Var.f43948t : null;
        if (f12Var != null) {
            this.f37477b.getClass();
            listB = i12.b(f12Var);
        } else {
            listB = kotlin.collections.b0.f27475b;
        }
        ho2VarA.b(CollectionsKt.firstOrNull(listB), "ad_id");
        ho2VarA.b(listB.isEmpty() ? null : listB, "ad_ids");
        return ho2VarA;
    }

    public cq2(iq2 iq2Var, i12 i12Var) {
        this.f37476a = iq2Var;
        this.f37477b = i12Var;
    }
}
