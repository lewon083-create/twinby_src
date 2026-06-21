package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o62 implements bf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r52 f41472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yh3 f41473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef3 f41474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dc3 f41475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hf3 f41476e;

    public /* synthetic */ o62(Context context, v9 v9Var, nu2 nu2Var, r52 r52Var, me3 me3Var, l72 l72Var, if3 if3Var, ck3 ck3Var, uf3 uf3Var, yh3 yh3Var) {
        this(context, v9Var, nu2Var, r52Var, me3Var, l72Var, if3Var, ck3Var, uf3Var, yh3Var, new ef3(context, nu2Var, if3Var));
    }

    @Override // yads.bf3
    public final void a(be2 be2Var) {
        this.f41476e = be2Var;
    }

    @Override // yads.bf3
    public final void play() {
        this.f41475d.a();
    }

    @Override // yads.bf3
    public final void stop() {
        dc3 dc3Var = this.f41475d;
        dc3Var.f37725h.a();
        dc3Var.f37718a.pauseAd();
        this.f41472a.a();
    }

    public o62(Context context, v9 v9Var, nu2 nu2Var, r52 r52Var, me3 me3Var, l72 l72Var, if3 if3Var, ck3 ck3Var, uf3 uf3Var, yh3 yh3Var, ef3 ef3Var) {
        this.f41472a = r52Var;
        this.f41473b = yh3Var;
        this.f41474c = ef3Var;
        dc3 dc3Var = new dc3(context, nu2Var, new t52(r52Var), l72Var, me3Var, new x62(l72Var), new mg3(), ck3Var, uf3Var, new n62(this), v9Var, true);
        this.f41475d = dc3Var;
        dc3Var.a(if3Var);
    }
}
