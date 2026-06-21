package yads;

import android.content.Context;
import io.sentry.clientreport.DiscardedEvent;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v9 f38030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f38031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j5 f38032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ko2 f38033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pt2 f38034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sx f38035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final we f38036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k22 f38037h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e61(Context context, v9 v9Var, d4 d4Var, nu2 nu2Var, j5 j5Var) {
        lu3 lu3Var = (lu3) nu2Var;
        lu3Var.d();
        su3 su3Var = su3.f43085a;
        this(v9Var, d4Var, j5Var, cf.a(context, lu3Var.b()), fw2.a().a(context), new sx(), new we(context));
    }

    public final ho2 a(tb3 tb3Var) {
        ho2 ho2VarA = a();
        ho2VarA.b(tb3Var.f43260a.f42891b, DiscardedEvent.JsonKeys.REASON);
        String str = tb3Var.f43261b;
        if (str != null && str.length() > 0) {
            ho2VarA.b(str, "asset_name");
        }
        String str2 = tb3Var.f43262c;
        if (str2 != null && str2.length() > 0) {
            ho2VarA.b(str2, "description");
        }
        return ho2VarA;
    }

    public e61(v9 v9Var, d4 d4Var, j5 j5Var, ko2 ko2Var, pt2 pt2Var, sx sxVar, we weVar) {
        this.f38030a = v9Var;
        this.f38031b = d4Var;
        this.f38032c = j5Var;
        this.f38033d = ko2Var;
        this.f38034e = pt2Var;
        this.f38035f = sxVar;
        this.f38036g = weVar;
    }

    public final ho2 a() {
        ho2 ho2VarA = this.f38035f.a(this.f38030a, this.f38031b);
        ho2VarA.b(do2.f37869a, "adapter");
        d03 d03Var = this.f38031b.f37616d.f37951a;
        if (d03Var != null) {
            ho2VarA.b(d03Var.b().f37246b, "size_type");
            ho2VarA.b(Integer.valueOf(d03Var.getWidth()), "width");
            ho2VarA.b(Integer.valueOf(d03Var.getHeight()), "height");
        }
        pt2 pt2Var = this.f38034e;
        if (pt2Var != null) {
            ho2VarA.b(pt2Var.O, "banner_size_calculation_type");
        }
        k22 k22Var = this.f38037h;
        return k22Var != null ? io2.a(ho2VarA, k22Var.a()) : ho2VarA;
    }

    public final void a(eo2 eo2Var, ho2 ho2Var) {
        Map map = ho2Var.f39286a;
        c cVar = ho2Var.f39287b;
        String str = eo2Var.f38217b;
        LinkedHashMap linkedHashMapM = kotlin.collections.j0.m(map);
        this.f38033d.a(new go2(str, linkedHashMapM, cVar));
        this.f38036g.a(eo2Var, linkedHashMapM, do2.f37869a, this.f38032c);
    }
}
