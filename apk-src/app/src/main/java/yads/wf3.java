package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl2 f44374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tj2 f44375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mc3 f44376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xc3 f44377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tl3 f44378e;

    public wf3(Context context, me3 me3Var, hk3 hk3Var, mg3 mg3Var, ck3 ck3Var, kf3 kf3Var, df3 df3Var) {
        this.f44374a = new nl2(ck3Var);
        this.f44375b = new tj2(context, me3Var);
        this.f44376c = new mc3(me3Var, hk3Var, ck3Var, df3Var);
        this.f44377d = new xc3(hk3Var, ck3Var, kf3Var);
        this.f44378e = new tl3(me3Var, hk3Var, mg3Var, ck3Var, df3Var);
    }

    public final void a(uf3 uf3Var, boolean z5) {
        if (!z5) {
            kotlin.collections.x.n(uf3Var.f43641a, new tf3[]{this.f44376c});
        } else {
            kotlin.collections.x.n(uf3Var.f43641a, new tf3[]{this.f44374a, this.f44375b, this.f44377d, this.f44376c, this.f44378e});
            kotlin.collections.x.n(uf3Var.f43642b, new vf3[]{this.f44378e});
        }
    }
}
