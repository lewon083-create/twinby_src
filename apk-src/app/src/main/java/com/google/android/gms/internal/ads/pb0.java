package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pb0 implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r71 f9004b;

    public /* synthetic */ pb0(r71 r71Var, int i) {
        this.f9003a = i;
        this.f9004b = r71Var;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) throws rj0 {
        sz szVar = (sz) obj;
        switch (this.f9003a) {
            case 0:
                if (szVar != null) {
                    return this.f9004b;
                }
                throw new rj0(1, "Retrieve Web View from image ad response failed.");
            default:
                if (szVar == null || szVar.m() == null) {
                    throw new rj0(1, "Retrieve video view in html5 ad response failed.");
                }
                return this.f9004b;
        }
    }
}
