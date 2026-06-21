package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c00 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sz f3985c;

    public /* synthetic */ c00(sz szVar, int i) {
        this.f3984b = i;
        this.f3985c = szVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3984b) {
            case 0:
                this.f3985c.destroy();
                break;
            case 1:
                this.f3985c.destroy();
                break;
            case 2:
                this.f3985c.onPause();
                break;
            case 3:
                this.f3985c.onResume();
                break;
            case 4:
                this.f3985c.destroy();
                break;
            case 5:
                this.f3985c.c("onSdkImpression", new h1.e(0));
                break;
            case 6:
                this.f3985c.destroy();
                break;
            default:
                this.f3985c.J0();
                break;
        }
    }
}
