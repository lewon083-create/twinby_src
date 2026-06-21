package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b60 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a60 f3656b;

    public /* synthetic */ b60(a60 a60Var, int i) {
        this.f3655a = i;
        this.f3656b = a60Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f3655a) {
            case 0:
                return this.f3656b.f2788c;
            case 1:
                return Integer.valueOf(this.f3656b.f2792g);
            case 2:
                return this.f3656b.f2789d;
            default:
                return this.f3656b.a();
        }
    }
}
