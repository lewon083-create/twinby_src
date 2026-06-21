package yads;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vv2 implements y22 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f44190f = {wb.a(vv2.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f44191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pv2 f44192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nm2 f44193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bt2 f44194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f22 f44195e;

    public vv2(o02 o02Var, d4 d4Var, pv2 pv2Var) {
        this.f44191a = d4Var;
        this.f44192b = pv2Var;
        this.f44193c = om2.a(o02Var);
        this.f44194d = new bt2(o02Var.e(), o02Var.h());
        this.f44195e = new f22(o02Var.e());
    }

    @Override // yads.y22
    public final void a(Context context, v9 v9Var) {
        nm2 nm2Var = this.f44193c;
        dk.i iVar = f44190f[0];
        o02 o02Var = (o02) nm2Var.f41294a.get();
        if (o02Var != null) {
            o02Var.f45467b.a(v5.f43872c, null);
            f12 f12Var = (f12) v9Var.f43948t;
            d4 d4Var = this.f44191a;
            h22 h22Var = new h22();
            this.f44194d.a(context, v9Var, this.f44195e);
            bt2 bt2Var = this.f44194d;
            bt2Var.getClass();
            kotlin.collections.c0 c0VarD = kotlin.collections.j0.d();
            if (!kotlin.jvm.internal.k0.d(c0VarD)) {
                c0VarD = null;
            }
            if (c0VarD == null) {
                new LinkedHashMap();
            }
            ho2 ho2VarA = h22Var.a(v9Var, d4Var, f12Var);
            fo2 fo2Var = fo2.f38518c;
            ho2VarA.b("success", "status");
            bt2Var.a(context, v9Var, eo2.f38199h, ho2VarA);
            zz1 zz1VarA = this.f44192b.a(v9Var);
            if (o02Var.f45482r == z5.f45250b) {
                return;
            }
            f12 f12Var2 = (f12) v9Var.f43948t;
            oz1 oz1Var = o02Var.B;
            hk.c0.m(oz1Var.f41778d, null, new nz1(oz1Var, v9Var, f12Var2, zz1VarA, o02Var.C, null), 3);
        }
    }
}
