package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lq implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hq f7591c;

    public /* synthetic */ lq(hq hqVar, int i) {
        this.f7590b = i;
        this.f7591c = hqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7590b) {
            case 0:
                hq hqVar = this.f7591c;
                sz szVar = hqVar.f6211b;
                if (szVar != null) {
                    szVar.destroy();
                    hqVar.f6211b = null;
                }
                break;
            case 1:
                hq hqVar2 = this.f7591c;
                sz szVar2 = hqVar2.f6211b;
                if (szVar2 != null) {
                    szVar2.destroy();
                    hqVar2.f6211b = null;
                }
                break;
            default:
                t9.c0.m("maybeDestroy > Destroying engine.");
                so soVar = uo.f11019j;
                hq hqVar3 = this.f7591c;
                hqVar3.i("/result", soVar);
                sz szVar3 = hqVar3.f6211b;
                if (szVar3 != null) {
                    szVar3.destroy();
                    hqVar3.f6211b = null;
                }
                break;
        }
    }
}
