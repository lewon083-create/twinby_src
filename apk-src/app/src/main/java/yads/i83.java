package yads;

import android.content.Context;
import com.appsflyer.AdRevenueScheme;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f39463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ko2 f39464b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i83(Context context, d4 d4Var, nu2 nu2Var) {
        lu3 lu3Var = (lu3) nu2Var;
        lu3Var.d();
        su3 su3Var = su3.f43085a;
        this(d4Var, cf.a(context, lu3Var.b()));
    }

    public final void a(Map map, pt2 pt2Var) {
        eo2 eo2Var = eo2.f38194c;
        if (pt2Var == null || !pt2Var.f42060w0) {
            return;
        }
        d4 d4Var = this.f39463a;
        Pair pair = new Pair(AdRevenueScheme.AD_TYPE, d4Var.f37613a.f37950b);
        String str = d4Var.f37615c.f39118a;
        if (str == null) {
            str = "";
        }
        this.f39464b.a(new go2("tracking_event", kotlin.collections.j0.m(kotlin.collections.j0.i(kotlin.collections.j0.g(pair, new Pair("ad_unit_id", str)), map)), null));
    }

    public i83(d4 d4Var, ko2 ko2Var) {
        this.f39463a = d4Var;
        this.f39464b = ko2Var;
    }
}
