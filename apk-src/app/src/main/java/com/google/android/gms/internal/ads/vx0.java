package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vx0 implements qs1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11523b;

    public /* synthetic */ vx0(int i, Object obj) {
        this.f11522a = i;
        this.f11523b = obj;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final /* synthetic */ Object j() {
        switch (this.f11522a) {
            case 0:
                return new in0(7, (f80) ((f80) this.f11523b).f5258a);
            case 1:
                return new nu0(1, (f80) ((f80) this.f11523b).f5258a);
            case 2:
                return new xo0(5, (f80) ((f80) this.f11523b).f5258a);
            default:
                cw cwVar = (cw) this.f11523b;
                f80 f80Var = (f80) cwVar.f4347c;
                cw cwVar2 = (cw) cwVar.f4350f;
                com.google.android.gms.internal.consent_sdk.c cVar = new com.google.android.gms.internal.consent_sdk.c();
                cVar.f13337a = f80Var;
                cVar.f13338b = cwVar2;
                return cVar;
        }
    }
}
