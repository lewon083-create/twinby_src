package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z30 implements u70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12859c;

    public /* synthetic */ z30(int i, Object obj) {
        this.f12858b = i;
        this.f12859c = obj;
    }

    @Override // com.google.android.gms.internal.ads.u70
    public final /* synthetic */ void a() {
        s9.d dVarG0;
        switch (this.f12858b) {
            case 0:
                ((n70) this.f12859c).h();
                break;
            default:
                sz szVar = (sz) this.f12859c;
                if (szVar != null && (dVarG0 = szVar.G0()) != null) {
                    dVarG0.z();
                    break;
                }
                break;
        }
    }
}
