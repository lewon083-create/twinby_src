package yads;

import com.appsflyer.AdRevenueScheme;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e12 implements hp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9 f37959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9 f37960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i12 f37961c;

    public /* synthetic */ e12() {
        this(new w42(), new i12());
    }

    @Override // yads.hp2
    public final go2 a(Object obj) {
        d4 d4Var = (d4) obj;
        ho2 ho2Var = new ho2(new HashMap(), 2);
        g9 g9Var = d4Var.f37617e;
        if (g9Var != null) {
            ho2Var = io2.a(ho2Var, this.f37959a.a(g9Var));
        }
        ho2Var.b(d4Var.f37615c.f39118a, "ad_unit_id");
        ho2Var.b(d4Var.f37613a.f37950b, AdRevenueScheme.AD_TYPE);
        d03 d03Var = d4Var.f37616d.f37951a;
        if (d03Var != null) {
            ho2Var.b(d03Var.b().f37246b, "size_type");
            ho2Var.b(Integer.valueOf(d03Var.getWidth()), "width");
            ho2Var.b(Integer.valueOf(d03Var.getHeight()), "height");
            fn fnVarA = d03Var.a();
            ho2Var.a(fnVarA != null ? fnVarA.f38492b : null, "banner_size_calculation_type");
        }
        ho2Var.b(Boolean.valueOf(d4Var.f37619g == ta3.f43254c), "is_passback");
        ho2Var.b(Boolean.valueOf(d4Var.f37624m), "image_loading_automatically");
        List list = d4Var.f37614b.f42416c;
        if (!list.isEmpty()) {
            ho2Var.b(list, "image_sizes");
        }
        eo2 eo2Var = eo2.f38194c;
        return new go2("ad_request", kotlin.collections.j0.m(ho2Var.f39286a), ho2Var.f39287b);
    }

    public e12(w42 w42Var, i12 i12Var) {
        this.f37959a = new n9();
        this.f37960b = new x9(w42Var);
        this.f37961c = i12Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    @Override // yads.hp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.go2 a(yads.xp2 r5, int r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.e12.a(yads.xp2, int, java.lang.Object):yads.go2");
    }
}
