package yads;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.protocol.Device;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9 f38821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ko2 f38822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final za2 f38823c;

    public /* synthetic */ gl3(Context context, nu2 nu2Var) {
        n9 n9Var = new n9();
        lu3 lu3Var = (lu3) nu2Var;
        lu3Var.d();
        su3 su3Var = su3.f43085a;
        this(n9Var, cf.a(context, lu3Var.b()), new za2());
    }

    public final void a(el3 el3Var, d4 d4Var) {
        c03 c03VarB;
        g9 g9Var = d4Var.f37617e;
        ho2 ho2VarA = g9Var != null ? this.f38821a.a(g9Var) : new ho2((Map) null, 3);
        g9 g9Var2 = d4Var.f37617e;
        if (g9Var2 != null) {
            io2.a(ho2VarA, this.f38821a.a(g9Var2));
        }
        ho2VarA.b(d4Var.f37615c.f39118a, "ad_unit_id");
        za2 za2Var = this.f38823c;
        int i = d4Var.f37625n;
        za2Var.getClass();
        ho2VarA.b(i != 1 ? i != 2 ? StringUtils.UNDEFINED : "landscape" : "portrait", Device.JsonKeys.ORIENTATION);
        d03 d03Var = d4Var.f37616d.f37951a;
        ho2VarA.a((d03Var == null || (c03VarB = d03Var.b()) == null) ? null : c03VarB.f37246b, "size_type");
        d03 d03Var2 = d4Var.f37616d.f37951a;
        ho2VarA.a(d03Var2 != null ? Integer.valueOf(d03Var2.getWidth()) : null, "size_info_width");
        d03 d03Var3 = d4Var.f37616d.f37951a;
        ho2VarA.a(d03Var3 != null ? Integer.valueOf(d03Var3.getHeight()) : null, "size_info_height");
        ho2VarA.b(Integer.valueOf(el3Var.f38173a.f37823a), "view_width");
        ho2VarA.b(Integer.valueOf(el3Var.f38173a.f37824b), "view_height");
        ho2VarA.a(el3Var.f38174b.f37363a, "layout_width");
        ho2VarA.a(el3Var.f38174b.f37364b, "layout_height");
        ho2VarA.b(Integer.valueOf(el3Var.f38175c.f40561a.f40931a), "measured_width");
        String strName = el3Var.f38175c.f40561a.f40932b.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        ho2VarA.b(lowerCase, "measured_width_mode");
        ho2VarA.b(Integer.valueOf(el3Var.f38175c.f40562b.f40931a), "measured_height");
        String lowerCase2 = el3Var.f38175c.f40562b.f40932b.name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        ho2VarA.b(lowerCase2, "measured_height_mode");
        eo2 eo2Var = eo2.f38194c;
        this.f38822b.a(new go2("ad_view_size_info", kotlin.collections.j0.m(ho2VarA.f39286a), ho2VarA.f39287b));
    }

    public gl3(n9 n9Var, ko2 ko2Var, za2 za2Var) {
        this.f38821a = n9Var;
        this.f38822b = ko2Var;
        this.f38823c = za2Var;
    }
}
