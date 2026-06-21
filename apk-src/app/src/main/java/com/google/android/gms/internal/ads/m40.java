package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m40 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n90 f7764b;

    public /* synthetic */ m40(n90 n90Var, int i) {
        this.f7763a = i;
        this.f7764b = n90Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f7763a) {
            case 0:
                y70 y70Var = (y70) this.f7764b.f8249d;
                return y70Var != null ? new s80(y70Var, hx.f6285g) : new s80(new l40(), hx.f6285g);
            default:
                return (y70) this.f7764b.f8249d;
        }
    }
}
