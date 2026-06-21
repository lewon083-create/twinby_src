package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z90 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p20 f12920b;

    public /* synthetic */ z90(p20 p20Var, int i) {
        this.f12919a = i;
        this.f12920b = p20Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f12919a) {
            case 0:
                return new y90(this.f12920b.a());
            default:
                return new oc0(this.f12920b.a());
        }
    }
}
