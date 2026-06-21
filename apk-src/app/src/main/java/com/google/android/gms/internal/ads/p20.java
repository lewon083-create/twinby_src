package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p20 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8890b;

    public /* synthetic */ p20(int i, Object obj) {
        this.f8889a = i;
        this.f8890b = obj;
    }

    public ja0 a() {
        ja0 ja0Var = (ja0) ((gk0) this.f8890b).f5837c;
        gr.G(ja0Var);
        return ja0Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        Object e51Var;
        int i = this.f8889a;
        int i10 = 0;
        int i11 = 5;
        int i12 = 11;
        int i13 = 10;
        int i14 = 8;
        int i15 = 6;
        Object obj = this.f8890b;
        switch (i) {
            case 0:
                return new o20(i10, new yh0(((d10) ((i20) obj).f6343b).a()));
            case 1:
                return (ViewGroup) ((cf) obj).f4193c;
            case 2:
                return ((y30) obj).a();
            case 3:
                aw awVar = (aw) obj;
                return new s80(new e40((sz) ((b40) awVar.f3440b).f3578b.f4350f, (sd0) awVar.f3441c.j(), ((y40) awVar.f3442d).a()), hx.f6279a);
            case 4:
                jw jwVar = (jw) obj;
                g40 g40Var = new g40((sz) ((b40) jwVar.f6949b).f3578b.f4350f, (Executor) jwVar.f6950c.j());
                if (((Boolean) q9.s.f31967e.f31970c.a(al.Pd)).booleanValue()) {
                    s80 s80Var = new s80(g40Var, hx.f6279a);
                    int i16 = d51.f4468d;
                    e51Var = new e51(s80Var);
                } else {
                    int i17 = d51.f4468d;
                    e51Var = x51.f12049k;
                }
                gr.G(e51Var);
                return e51Var;
            case 5:
                return ((n50) obj).a();
            case 6:
                d40 d40Var = (d40) obj;
                return new p40(new dw(((d10) d40Var.f4452b).a(), ((d60) d40Var.f4453c).a().f6575g));
            case 7:
                return new s40(((os1) obj).j());
            case 8:
                return new r50(((y40) obj).b());
            case 9:
                return (n90) obj;
            case 10:
                na0 na0Var = (na0) ((p90) obj).f8994a.f8248c;
                gr.G(na0Var);
                Set setSingleton = na0Var.f8254d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
                gr.G(setSingleton);
                return setSingleton;
            case 11:
                ka0 ka0Var = (ka0) ((k50) obj).f7123b.j();
                gr.G(ka0Var);
                JSONObject jSONObject = ka0Var.f7159b;
                if (jSONObject != null) {
                    return jSONObject;
                }
                try {
                    return new JSONObject(ka0Var.f7468a.f12274z);
                } catch (JSONException unused) {
                    return null;
                }
            case 12:
                y90 y90Var = new y90(((z90) obj).f12920b.a());
                ha0 ha0Var = new ha0();
                ha0Var.f6082a = y90Var;
                return ha0Var;
            case 13:
                ja0 ja0Var = (ja0) ((gk0) obj).f5837c;
                gr.G(ja0Var);
                return ja0Var;
            case 14:
                return new u20(1, (sz) ((ms1) obj).j());
            case 15:
                return new s80(new u20(1, (sz) ((ms1) ((p20) obj).f8890b).j()), hx.f6284f);
            case 16:
                v00 v00Var = (v00) obj;
                p2.h hVar = (p2.h) v00Var.f11172b.j();
                gx executorService = hx.f6279a;
                gr.G(executorService);
                Intrinsics.checkNotNullParameter(executorService, "executorService");
                return new cd0(new yf0(hVar, new xo0(4, executorService), (dd0) v00Var.f11173c.j(), new mp0(4, (byte) 0)));
            case 17:
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                jw jwVar2 = (jw) obj;
                Set setSingleton2 = ((Boolean) q9.s.f31967e.f31970c.a(al.U5)).booleanValue() ? Collections.singleton(new s80(new ld0((si) ((ls1) jwVar2.f6949b).j(), ((os1) jwVar2.f6950c).j()), gxVar)) : Collections.EMPTY_SET;
                gr.G(setSingleton2);
                return setSingleton2;
            case 18:
                d40 d40Var2 = (d40) obj;
                kg0 kg0Var = new kg0(((d10) d40Var2.f4452b).a(), (fw) d40Var2.f4453c.j());
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                return new s80(kg0Var, gxVar2);
            case 19:
                jw jwVar3 = (jw) obj;
                eh0 eh0Var = (eh0) ((ls1) jwVar3.f6949b).j();
                jw jwVar4 = (jw) jwVar3.f6950c;
                ld0 ld0Var = new ld0(eh0Var, new fh0(((jw) jwVar4.f6949b).a(), ((a10) jwVar4.f6950c).j()));
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                return new s80(ld0Var, gxVar3);
            case 20:
                return new dl0(5, ((b60) obj).f3656b.f2788c);
            case 21:
                gr.G(hx.f6279a);
                gr.G(((ku) ((ho0) obj).f6205b.f15621d).f7300e);
                return new eo0();
            case 22:
                final Context context = ((b10) obj).f3555b.f12809b;
                gr.G(context);
                gx executorService2 = hx.f6279a;
                gr.G(executorService2);
                Intrinsics.checkNotNullParameter(executorService2, "executorService");
                xo0 coroutineScopeProvider = new xo0(4, executorService2);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
                return p2.i.a(sw0.f10416a, hk.c0.a(new hk.w0(executorService2)), new Function0() { // from class: com.google.android.gms.internal.ads.tw0
                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Object invoke() {
                        return k3.f.i(context, "ad_quality_data.pb");
                    }
                }, 6);
            case 23:
                cz0 cz0Var = (cz0) ((ls1) new cw((f80) ((in0) ((vx0) obj).j()).f6553c).f4349e).j();
                gr.G(cz0Var);
                return cz0Var;
            case 24:
                f80 f80Var = (f80) ((nu0) ((vx0) obj).j()).f8456c;
                ns1 ns1Var = (ns1) f80Var.f5259b;
                ns1 ns1Var2 = (ns1) f80Var.f5261d;
                int i18 = 7;
                ls1 ls1VarA = ls1.a(new qj0(ns1Var, ns1Var2, (ls1) f80Var.f5265h, i18));
                int i19 = 13;
                ls1 ls1VarA2 = ls1.a(new k30(ns1Var, ls1VarA, i19));
                ls1 ls1Var = (ls1) f80Var.i;
                ls1 ls1Var2 = (ls1) f80Var.f5260c;
                ns1 ns1Var3 = (ns1) f80Var.f5262e;
                ls1 ls1VarA3 = ls1.a(new x90(ls1VarA2, ls1Var, ls1Var2, ns1Var3, 1));
                ls1 ls1Var3 = (ls1) f80Var.f5270n;
                ls1 ls1VarA4 = ls1.a(new wm0(ls1Var3, i19));
                ls1 ls1Var4 = (ls1) f80Var.f5271o;
                ls1 ls1VarA5 = ls1.a(new od0(2, ls1.a(new aa.q(ls1.a(new ol(i11, ls1VarA4, ls1Var, ls1Var4)), ls1.a(new ol(i15, ls1.a(new wm0(ls1Var3, 15)), ls1Var, ls1Var4)), ls1.a(new ol(i18, ls1.a(new wm0(ls1Var3, 17)), ls1Var, ls1Var4)), ls1.a(new ol(2, ls1.a(new wm0(ls1Var3, i13)), ls1Var, ls1Var4)), ls1.a(new ol(3, ls1.a(new wm0(ls1Var3, 11)), ls1Var, ls1Var4)), ls1.a(new ol(4, ls1.a(new wm0(ls1Var3, 12)), ls1Var, ls1Var4)), ls1.a(new wm0(ls1Var3, 14)), ns1Var2, ls1Var)), ls1.a(new ol(8, ls1.a(new ol(ns1Var, ls1VarA2, ls1Var)), ls1Var, ns1Var2)), ns1Var3));
                ls1 ls1VarA6 = ls1.a(new wm0(ls1Var3, 16));
                ls1 ls1VarA7 = ls1.a(c80.M);
                cz0 cz0Var2 = (cz0) ls1.a(new hj0(ls1.a(new l90(ls1VarA3, ls1.a(new n50(ns1Var, ls1VarA2, ls1VarA5, ls1Var, ns1Var2, ls1.a(new od0(1, ls1VarA6, ls1VarA7, ls1Var)), ls1VarA)), ls1VarA5, ls1Var, (ls1) f80Var.f5263f, ns1Var3)), ls1.a(new o30(ls1.a(new o30(ns1Var, ls1.a(new qj0(ns1Var, ns1Var3, (ls1) f80Var.f5267k, 6)), ls1VarA, ns1Var3, ls1VarA7)), ls1VarA5, ls1VarA3, ls1Var, ns1Var2)), ls1VarA5, ns1Var3, 1)).j();
                gr.G(cz0Var2);
                return cz0Var2;
            default:
                f80 f80Var2 = (f80) ((xo0) ((vx0) obj).j()).f12221c;
                ls1 ls1Var5 = (ls1) f80Var2.f5260c;
                ls1 ls1Var6 = (ls1) f80Var2.i;
                ns1 ns1Var4 = (ns1) f80Var2.f5262e;
                ls1 ls1VarA8 = ls1.a(new qj0(ls1Var5, ls1Var6, ns1Var4, i14));
                ls1 ls1VarA9 = ls1.a(pn1.B);
                ns1 ns1Var5 = (ns1) f80Var2.f5259b;
                ns1 ns1Var6 = (ns1) f80Var2.f5261d;
                ls1 ls1VarA10 = ls1.a(new l90((qs1) ns1Var5, (qs1) ns1Var6, (qs1) ns1Var4, (qs1) f80Var2.f5264g, (qs1) ls1Var6, (qs1) ls1VarA9, 14));
                ls1 ls1Var7 = (ls1) f80Var2.f5270n;
                ls1 ls1VarA11 = ls1.a(new wm0(ls1Var7, 18));
                ls1 ls1Var8 = (ls1) f80Var2.f5271o;
                ls1 ls1VarA12 = ls1.a(new hj0(ls1.a(new ol(9, ls1VarA11, ls1Var6, ls1Var8)), ls1.a(new ol(i13, ls1.a(new wm0(ls1Var7, 19)), ls1Var6, ls1Var8)), ls1.a(new ol(i12, ls1.a(new wm0(ls1Var7, 20)), ls1Var6, ls1Var8)), ls1Var6, 2));
                cz0 cz0Var3 = (cz0) ls1.a(new hj0(ls1.a(new l90(ls1VarA8, ls1VarA10, ls1VarA12, ls1Var6, (ls1) f80Var2.f5263f, ns1Var4)), ls1.a(new x20(ls1VarA8, ls1VarA12, (ls1) f80Var2.f5267k, ls1Var6, ns1Var4, ns1Var6)), ls1VarA12, ns1Var4, 1)).j();
                gr.G(cz0Var3);
                return cz0Var3;
        }
    }
}
