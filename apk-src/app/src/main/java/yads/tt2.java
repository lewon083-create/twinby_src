package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.sentry.util.StringUtils;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd f43430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mm0 f43431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f43432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eu2 f43433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zt2 f43434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zo2 f43435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bu2 f43436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t33 f43437h;
    public final Context i;

    public tt2(Context context, rd rdVar, mm0 mm0Var, w5 w5Var, eu2 eu2Var, zt2 zt2Var, zo2 zo2Var, bu2 bu2Var, t33 t33Var) {
        this.f43430a = rdVar;
        this.f43431b = mm0Var;
        this.f43432c = w5Var;
        this.f43433d = eu2Var;
        this.f43434e = zt2Var;
        this.f43435f = zo2Var;
        this.f43436g = bu2Var;
        this.f43437h = t33Var;
        this.i = context.getApplicationContext();
    }

    public final void a(rx2 rx2Var, s61 s61Var, vt2 vt2Var) {
        String str;
        String libraryVersion;
        pt2 pt2VarA = fw2.a().a(this.i);
        if (pt2VarA != null && !this.f43433d.a()) {
            xy xyVar = xy.f44840d;
            if (vt2Var.f44123a.isActive()) {
                hk.j jVar = vt2Var.f44123a;
                ij.k kVar = ij.m.f21341c;
                jVar.resumeWith(new ju2(pt2VarA, xyVar));
                return;
            }
            return;
        }
        fu2 fu2Var = new fu2(this.i, this.f43434e, vt2Var, this.f43432c);
        ko2 ko2Var = this.f43437h.f43177a;
        eo2 eo2Var = eo2.f38194c;
        ko2Var.a(new go2("sdk_configuration_request", kotlin.collections.j0.m(kotlin.collections.i0.c(new Pair("call_source", s61Var.f42821b))), null));
        km0 km0Var = this.f43431b.f40960a;
        Context context = this.i;
        String str2 = km0Var.f40249e;
        if (str2 == null || str2.length() == 0) {
            str = null;
        } else {
            bu2 bu2Var = this.f43436g;
            rd rdVar = this.f43430a;
            bu2Var.getClass();
            boolean zB = rx2Var.b(context);
            vu0 vu0Var = new vu0(zB);
            vu0Var.f44162u = km0Var.b();
            vu0Var.f44147m = km0Var.f40248d;
            td tdVar = rdVar.f42549a;
            boolean z5 = rdVar.f42551c;
            if (tdVar != null) {
                vu0Var.N = Boolean.valueOf(tdVar.f43274b);
                vu0Var.O = Boolean.valueOf(z5);
                String str3 = tdVar.f43273a;
                vu0Var.f44133e.getClass();
                boolean z10 = (str3 == null || str3.length() == 0 || StringUtils.PROPER_NIL_UUID.equals(str3)) ? false : true;
                if (!zB && Intrinsics.a(vu0Var.N, Boolean.FALSE) && z10) {
                    vu0Var.P = str3;
                }
            }
            td tdVar2 = rdVar.f42550b;
            if (tdVar2 != null) {
                vu0Var.Q = Boolean.valueOf(tdVar2.f43274b);
                String str4 = tdVar2.f43273a;
                vu0Var.f44133e.getClass();
                boolean z11 = (str4 == null || str4.length() == 0 || StringUtils.PROPER_NIL_UUID.equals(str4)) ? false : true;
                if (!zB && Intrinsics.a(vu0Var.Q, Boolean.FALSE) && z11) {
                    vu0Var.R = str4;
                }
            }
            vu0Var.f44129c.getClass();
            pg.a(context);
            try {
                libraryVersion = AppMetrica.getLibraryVersion();
            } catch (Throwable unused) {
                libraryVersion = null;
            }
            vu0Var.C0 = libraryVersion;
            vu0Var.C = Integer.valueOf(nl3.d(context));
            vu0Var.D = Integer.valueOf(nl3.b(context));
            vu0Var.E = Float.valueOf(context.getResources().getDisplayMetrics().density);
            vu0Var.f44157r0 = nl3.a(context);
            wg0 wg0VarB = yo3.b(context);
            vu0Var.f44159s0 = wg0VarB.f44387a;
            vu0Var.f44161t0 = wg0VarB.f44388b;
            vu0Var.f44163u0 = wg0VarB.f44389c;
            vu0Var.f44165v0 = wg0VarB.f44390d;
            vu0Var.f44167w0 = wg0VarB.f44391e;
            vu0Var.f44169x0 = wg0VarB.f44392f;
            vu0Var.f44143k = fw2.a().b();
            vu0Var.f44137g = rx2.a(context);
            vu0 vu0VarA = vu0Var.a(context, km0Var.f40245a);
            vu0VarA.f44150n0 = context.getPackageName();
            vu0VarA.o0 = og.a(context);
            vu0VarA.f44153p0 = og.b(context);
            vu0VarA.A0 = vu0VarA.f44131d.a("%d.%d%d");
            vu0VarA.B0 = vu0VarA.f44131d.a("%d.%d.%d");
            vu0VarA.f44141j = fw2.a().d();
            vu0VarA.f44135f = true;
            String[] strArr = {new zu0(vu0VarA).toString(), CollectionsKt.I(km0Var.f40246b, "&", null, null, au2.f36863b, 30)};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str5 = strArr[i];
                if (!StringsKt.D(str5)) {
                    arrayList.add(str5);
                }
            }
            String strA = bu2Var.f37149a.a(context, CollectionsKt.I(arrayList, "&", null, null, null, 62));
            StringBuilder sbJ = pe.a.j(str2);
            if (!Intrinsics.a(String.valueOf(kotlin.text.e0.w(sbJ)), "/")) {
                sbJ.append("/");
            }
            sbJ.append("v1/startup");
            sbJ.append("?");
            sbJ.append(strA);
            String string = sbJ.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            str = string;
        }
        if (str == null || str.length() == 0) {
            fu2Var.a((lm3) new h4(m4.f40777j, null));
            return;
        }
        du2 du2Var = new du2(this.i, str, this.f43433d, km0Var.f40247c, fu2Var, fu2Var);
        du2Var.f42672q = this;
        this.f43432c.a(v5.f43880l, null);
        zo2 zo2Var = this.f43435f;
        Context context2 = this.i;
        synchronized (zo2Var) {
            u82.a(context2).a(du2Var);
        }
    }

    public /* synthetic */ tt2(Context context, ct1 ct1Var, rd rdVar, mm0 mm0Var, w5 w5Var) {
        this(context, rdVar, mm0Var, w5Var, new eu2(context, ct1Var), yt2.a(), yo2.a(), new bu2(), new t33(ct1Var));
    }
}
