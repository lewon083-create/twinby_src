package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AFj1pSDK f2478c;

    public /* synthetic */ k(AFj1pSDK aFj1pSDK, int i) {
        this.f2477b = i;
        this.f2478c = aFj1pSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2477b) {
            case 0:
                this.f2478c.component4();
                break;
            case 1:
                this.f2478c.component3();
                break;
            default:
                this.f2478c.component2();
                break;
        }
    }
}
