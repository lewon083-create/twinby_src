package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v00 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f11172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f11173c;

    public /* synthetic */ v00(ls1 ls1Var, ls1 ls1Var2, int i) {
        this.f11171a = i;
        this.f11172b = ls1Var;
        this.f11173c = ls1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        gx gxVar;
        switch (this.f11171a) {
            case 0:
                return new u00((q00) this.f11172b.j(), (sd0) this.f11173c.j());
            case 1:
                return new w00((ScheduledExecutorService) this.f11173c.j());
            case 2:
                return ((Boolean) q9.s.f31967e.f31970c.a(al.f3224u3)).booleanValue() ? new xe((ve) this.f11173c.j()) : new xe((ve) this.f11172b.j());
            case 3:
                dh dhVar = (dh) this.f11172b.j();
                br brVar = (br) this.f11173c.j();
                wk wkVar = al.A6;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    gxVar = hx.f6281c;
                } else {
                    gxVar = ((Boolean) sVar.f31970c.a(al.f3299z6)).booleanValue() ? hx.f6279a : hx.f6284f;
                }
                gr.G(gxVar);
                return new i30(dhVar.f4568c, brVar, gxVar);
            case 4:
                n30 n30Var = (n30) this.f11172b.j();
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                Set setSingleton = ((JSONObject) this.f11173c.j()) == null ? Collections.EMPTY_SET : Collections.singleton(new s80(n30Var, gxVar2));
                gr.G(setSingleton);
                return setSingleton;
            case 5:
                n30 n30Var2 = (n30) this.f11172b.j();
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                Set setSingleton2 = ((JSONObject) this.f11173c.j()) == null ? Collections.EMPTY_SET : Collections.singleton(new s80(n30Var2, gxVar3));
                gr.G(setSingleton2);
                return setSingleton2;
            case 6:
                n30 n30Var3 = (n30) this.f11172b.j();
                gx gxVar4 = hx.f6279a;
                gr.G(gxVar4);
                Set setSingleton3 = ((JSONObject) this.f11173c.j()) == null ? Collections.EMPTY_SET : Collections.singleton(new s80(n30Var3, gxVar4));
                gr.G(setSingleton3);
                return setSingleton3;
            case 7:
                n30 n30Var4 = (n30) this.f11172b.j();
                gx gxVar5 = hx.f6279a;
                gr.G(gxVar5);
                Set setSingleton4 = ((JSONObject) this.f11173c.j()) == null ? Collections.EMPTY_SET : Collections.singleton(new s80(n30Var4, gxVar5));
                gr.G(setSingleton4);
                return setSingleton4;
            case 8:
                return new f90((f70) this.f11172b.j(), (p80) this.f11173c.j());
            case 9:
                return new yd0((wd0) this.f11173c.j(), (String) this.f11172b.j());
            case 10:
                return new bf0((se0) this.f11172b.j(), (fd0) this.f11173c.j());
            case 11:
                rr0 rr0Var = (rr0) this.f11172b.j();
                p9.k.C.f31300f.getClass();
                CookieManager cookieManagerI = t9.h0.i();
                Objects.requireNonNull(rr0Var);
                ze zeVar = new ze(4, cookieManagerI);
                r81 r81Var = rr0Var.f10030a;
                n81 n81Var = rr0.f10029d;
                List list = Collections.EMPTY_LIST;
                ed.d dVarB = ((gx) r81Var).b(zeVar);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                hi hiVar = new hi(rr0Var, pr0.WEBVIEW_COOKIE, null, n81Var, list, vv.I(dVarB, 1L, TimeUnit.SECONDS, rr0Var.f10031b));
                n20 n20Var = new n20(14);
                rr0 rr0Var2 = (rr0) hiVar.f6146g;
                return new hi(rr0Var2, hiVar.f6143d, (String) hiVar.f6141b, (ed.d) hiVar.f6142c, (List) hiVar.f6144e, vv.H((ed.d) hiVar.f6145f, Exception.class, n20Var, rr0Var2.f10030a)).r();
            case 12:
                gx gxVar6 = hx.f6279a;
                gr.G(gxVar6);
                jm0 jm0Var = new jm0(gxVar6, 2);
                ua.a aVar = (ua.a) this.f11172b.j();
                gr.G(gxVar6);
                return new im0(jm0Var, ((Long) sl.f10328f.r()).longValue(), aVar, gxVar6, (sd0) this.f11173c.j());
            case 13:
                return new wp0((ua.a) this.f11172b.j(), (sd0) this.f11173c.j());
            case 14:
                return new en0((String) this.f11172b.j(), ((Integer) this.f11173c.j()).intValue());
            case 15:
                return new kt0((lt0) this.f11172b.j(), (ft0) this.f11173c.j());
            case 16:
                p2.h hVar = (p2.h) this.f11172b.j();
                gx executorService = hx.f6279a;
                gr.G(executorService);
                Intrinsics.checkNotNullParameter(executorService, "executorService");
                return new yf0(hVar, new xo0(4, executorService), (dd0) this.f11173c.j(), new mp0(4, (byte) 0));
            case 17:
                Executor executor = (Executor) this.f11172b.j();
                return new gy0(executor);
            default:
                return new j21((px0) this.f11172b.j(), (qy0) this.f11173c.j());
        }
    }
}
