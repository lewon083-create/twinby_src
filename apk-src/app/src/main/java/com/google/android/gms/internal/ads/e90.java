package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e90 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ut f4889b;

    public /* synthetic */ e90(ut utVar, int i) {
        this.f4888a = i;
        this.f4889b = utVar;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f4888a) {
            case 0:
                sz szVar = (sz) this.f4889b.f11062d;
                if (szVar == null) {
                    return null;
                }
                return szVar.u();
            case 1:
                sz szVar2 = (sz) this.f4889b.f11062d;
                if (szVar2 != null) {
                    return szVar2.u();
                }
                return null;
            default:
                return (sz) this.f4889b.f11062d;
        }
    }
}
