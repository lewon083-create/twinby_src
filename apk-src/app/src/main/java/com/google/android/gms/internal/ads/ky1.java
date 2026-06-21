package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ky1 implements mb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n90 f7345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx1 f7346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ey1 f7347e;

    public /* synthetic */ ky1(n90 n90Var, zx1 zx1Var, ey1 ey1Var, int i) {
        this.f7344b = i;
        this.f7345c = n90Var;
        this.f7346d = zx1Var;
        this.f7347e = ey1Var;
    }

    @Override // com.google.android.gms.internal.ads.mb0, com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo0a(Object obj) {
        switch (this.f7344b) {
            case 0:
                ((ny1) obj).f(0, (hy1) this.f7345c.f8248c, this.f7346d, this.f7347e);
                break;
            default:
                ((ny1) obj).a(0, (hy1) this.f7345c.f8248c, this.f7346d, this.f7347e);
                break;
        }
    }
}
