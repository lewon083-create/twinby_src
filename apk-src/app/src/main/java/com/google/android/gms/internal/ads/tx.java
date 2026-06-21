package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tx implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vx f10746c;

    public /* synthetic */ tx(vx vxVar, int i) {
        this.f10745b = i;
        this.f10746c = vxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10745b) {
            case 0:
                this.f10746c.c("surfaceCreated", new String[0]);
                break;
            case 1:
                this.f10746c.c("surfaceDestroyed", new String[0]);
                break;
            default:
                this.f10746c.c("firstFrameRendered", new String[0]);
                break;
        }
    }
}
