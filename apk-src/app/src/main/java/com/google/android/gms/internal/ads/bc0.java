package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bc0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y40 f3757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wm0 f3758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p20 f3759d;

    public /* synthetic */ bc0(y40 y40Var, wm0 wm0Var, p20 p20Var, int i) {
        this.f3756a = i;
        this.f3757b = y40Var;
        this.f3758c = wm0Var;
        this.f3759d = p20Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f3756a) {
            case 0:
                return new ac0((String) this.f3757b.f12492b.f8764e, (fa0) this.f3758c.j(), this.f3759d.a());
            default:
                return new cc0((String) this.f3757b.f12492b.f8764e, (fa0) this.f3758c.j(), this.f3759d.a());
        }
    }
}
