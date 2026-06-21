package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class px implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx f9200e;

    public /* synthetic */ px(sx sxVar, int i, int i10, int i11) {
        this.f9197b = i11;
        this.f9198c = i;
        this.f9199d = i10;
        this.f9200e = sxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9197b) {
            case 0:
                vx vxVar = ((qx) this.f9200e).f9633r;
                if (vxVar != null) {
                    vxVar.j(this.f9198c, this.f9199d);
                }
                break;
            default:
                vx vxVar2 = ((jy) this.f9200e).f6993h;
                if (vxVar2 != null) {
                    vxVar2.j(this.f9198c, this.f9199d);
                }
                break;
        }
    }
}
