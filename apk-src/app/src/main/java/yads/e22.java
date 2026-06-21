package yads;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e22 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f37977p = {wb.a(e22.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f37978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nu2 f37979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fo1 f37980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lo1 f37981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jp1 f37982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y51 f37983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f37984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nm2 f37985h;
    public final LinkedHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f37986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e41 f37987k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ip1 f37988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ro1 f37989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sp1 f37990n;

    public /* synthetic */ e22(v9 v9Var, nu2 nu2Var, o02 o02Var, fo1 fo1Var) {
        this(v9Var, nu2Var, o02Var, fo1Var, new lo1(), new jp1(), new y51(fo1Var));
    }

    public e22(v9 v9Var, nu2 nu2Var, o02 o02Var, fo1 fo1Var, lo1 lo1Var, jp1 jp1Var, y51 y51Var) {
        this.f37978a = v9Var;
        this.f37979b = nu2Var;
        this.f37980c = fo1Var;
        this.f37981d = lo1Var;
        this.f37982e = jp1Var;
        this.f37983f = y51Var;
        Context applicationContext = o02Var.g().getApplicationContext();
        this.f37984g = applicationContext;
        this.f37985h = om2.a(o02Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.i = linkedHashMap;
        this.f37986j = new LinkedHashMap();
        e41 e41Var = new e41(o02Var.g());
        this.f37987k = e41Var;
        ip1 ip1Var = new ip1(o02Var.g());
        this.f37988l = ip1Var;
        this.f37989m = new ro1(o02Var.g(), e41Var, ip1Var);
        this.f37990n = new sp1(applicationContext, fo1Var, linkedHashMap);
    }
}
