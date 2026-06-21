package yads;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bg3 implements fg3, qf3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f37014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f37015l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f37016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk3 f37017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yb2 f37018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hg3 f37019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sf3 f37020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final eg3 f37021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final li3 f37022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37023h;
    public final zf3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ag3 f37024j;

    static {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u(bg3.class, "adParameterManager", "getAdParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$ResponseReportParameterManager;");
        kotlin.jvm.internal.g0.f27511a.getClass();
        f37014k = new dk.i[]{uVar, new kotlin.jvm.internal.u(bg3.class, "requestParameterManager", "getRequestParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$RequestReportParameterManager;")};
        f37015l = TimeUnit.SECONDS.toMillis(10L);
    }

    public /* synthetic */ bg3(Context context, nu2 nu2Var, v9 v9Var, me3 me3Var, w5 w5Var, mg3 mg3Var, hk3 hk3Var, ej3 ej3Var, ck3 ck3Var) {
        this(context, nu2Var, v9Var, me3Var, w5Var, mg3Var, hk3Var, ej3Var, ck3Var, xb2.a(false));
    }

    public final void a(mf3 mf3Var) {
        b();
        if (this.f37023h) {
            return;
        }
        this.f37023h = true;
        String lowerCase = mf3Var.f40908a.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String message = mf3Var.f40909b.getMessage();
        if (message == null) {
            message = "";
        }
        eg3 eg3Var = this.f37021f;
        eg3Var.getClass();
        eg3Var.a(kotlin.collections.j0.h(new Pair("status", "error"), new Pair("failure_reason", lowerCase), new Pair("error_message", message)));
    }

    public final void b() {
        hg3 hg3Var = this.f37019d;
        hg3Var.f39184c.removeCallbacksAndMessages(null);
        hg3Var.f39186e = false;
        sf3 sf3Var = this.f37020e;
        sf3Var.f42928c.removeCallbacksAndMessages(null);
        sf3Var.f42930e = false;
        ((bc2) this.f37018c).a();
    }

    public bg3(Context context, nu2 nu2Var, v9 v9Var, me3 me3Var, w5 w5Var, mg3 mg3Var, hk3 hk3Var, ej3 ej3Var, ck3 ck3Var, yb2 yb2Var) {
        this.f37016a = w5Var;
        this.f37017b = ck3Var;
        this.f37018c = yb2Var;
        this.f37019d = new hg3(ej3Var, this);
        this.f37020e = new sf3(mg3Var, this);
        this.f37021f = new eg3(context, nu2Var, v9Var, w5Var);
        this.f37022g = new li3(me3Var, hk3Var);
        this.i = new zf3(this);
        this.f37024j = new ag3(this);
    }

    public final void a() {
        hg3 hg3Var = this.f37019d;
        hg3Var.f39184c.removeCallbacksAndMessages(null);
        hg3Var.f39186e = false;
        this.f37016a.a(v5.f43889u, null);
        this.f37017b.i();
        sf3 sf3Var = this.f37020e;
        if (!sf3Var.f42930e && !sf3Var.f42929d) {
            sf3Var.f42930e = true;
            sf3Var.f42928c.post(new rf3(sf3Var));
        }
        ((bc2) this.f37018c).a(f37015l, new yi.f0(5, this));
    }

    public static final void a(bg3 bg3Var) {
        lf0 lf0Var = new lf0();
        lf3 lf3Var = lf3.i;
        bg3Var.b();
        if (bg3Var.f37023h) {
            return;
        }
        bg3Var.f37023h = true;
        String lowerCase = lf3Var.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String message = lf0Var.getMessage();
        if (message == null) {
            message = "";
        }
        eg3 eg3Var = bg3Var.f37021f;
        eg3Var.getClass();
        eg3Var.a(kotlin.collections.j0.h(new Pair("status", "error"), new Pair("failure_reason", lowerCase), new Pair("error_message", message)));
    }
}
