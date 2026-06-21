package yads;

import com.appsflyer.AdRevenueScheme;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f39554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f39556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y9 f39557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k22 f39558e;

    public /* synthetic */ ij(o5 o5Var, e00 e00Var, String str) {
        this(e00Var, str, o5Var.a(), o5Var.b());
    }

    public final ho2 a() {
        ho2 ho2VarA = this.f39557d.a();
        ho2VarA.b(this.f39554a.f37950b, AdRevenueScheme.AD_TYPE);
        ho2VarA.a(this.f39555b, "ad_id");
        ho2VarA.f39286a.putAll(this.f39556c.a());
        k22 k22Var = this.f39558e;
        return k22Var != null ? io2.a(ho2VarA, k22Var.a()) : ho2VarA;
    }

    public ij(e00 e00Var, String str, r2 r2Var, y9 y9Var) {
        this.f39554a = e00Var;
        this.f39555b = str;
        this.f39556c = r2Var;
        this.f39557d = y9Var;
    }
}
