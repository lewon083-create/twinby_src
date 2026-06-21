package yads;

import android.content.Context;
import com.appsflyer.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f37141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nu2 f37142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9 f37143c;

    public bt2(d4 d4Var, nu2 nu2Var) {
        n9 n9Var = new n9();
        new cq2();
        new n9();
        new wy();
        this(d4Var, nu2Var, n9Var);
    }

    public final void a(Context context, v9 v9Var, eo2 eo2Var, ho2 ho2Var) {
        hy1 hy1Var;
        eq2 eq2Var;
        ho2 ho2VarA = this.f37143c.a(this.f37141a.f37617e);
        ho2VarA.b(v9Var.f43934e, "ad_unit_id");
        String str = do2.f37869a;
        ho2VarA.b(str, "adapter");
        e00 e00Var = v9Var.f43930a;
        ho2VarA.b(e00Var != null ? e00Var.f37950b : null, AdRevenueScheme.AD_TYPE);
        f12 f12Var = (f12) v9Var.f43948t;
        if (f12Var != null) {
            List list = f12Var.f38323a;
            String str2 = (list == null || (hy1Var = (hy1) CollectionsKt.firstOrNull(list)) == null || (eq2Var = hy1Var.f39363a) == null) ? null : eq2Var.f38240b;
            if (str2 == null) {
                str2 = "";
            }
            ho2VarA.b(str2, "native_ad_type");
        }
        ho2VarA.b(v9Var.f43940l, "ad_source");
        ho2 ho2VarA2 = io2.a(ho2VarA, ho2Var);
        Map map = ho2VarA2.f39286a;
        c cVar = ho2VarA2.f39287b;
        String str3 = eo2Var.f38217b;
        LinkedHashMap linkedHashMapM = kotlin.collections.j0.m(map);
        go2 go2Var = new go2(str3, linkedHashMapM, cVar);
        ((lu3) this.f37142b).getClass();
        su3 su3Var = su3.f43085a;
        cf.a(context, new fq3(((lu3) this.f37142b).f40688a)).a(go2Var);
        new we(context).a(eo2Var, linkedHashMapM, str, null);
    }

    public bt2(d4 d4Var, nu2 nu2Var, n9 n9Var) {
        this.f37141a = d4Var;
        this.f37142b = nu2Var;
        this.f37143c = n9Var;
    }

    public final void a(Context context, v9 v9Var, f22 f22Var) {
        Map mapD;
        ho2 ho2Var = new ho2((Map) null, 3);
        if (f22Var != null) {
            List list = f22Var.f38338a.f37614b.f42416c;
            List list2 = list.isEmpty() ? null : list;
            if (list2 == null || (mapD = kotlin.collections.i0.c(new Pair("image_sizes", CollectionsKt.R(list2)))) == null) {
                mapD = kotlin.collections.j0.d();
            }
            ho2Var.f39286a.putAll(mapD);
        }
        a(context, v9Var, eo2.f38198g, ho2Var);
    }
}
