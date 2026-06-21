package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cr implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ed.d f4302b;

    public /* synthetic */ cr(int i, ed.d dVar) {
        this.f4301a = i;
        this.f4302b = dVar;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) {
        switch (this.f4301a) {
            case 0:
                return vv.J(this.f4302b, new zq(1, this, obj), hx.f6285g);
            default:
                return this.f4302b;
        }
    }
}
