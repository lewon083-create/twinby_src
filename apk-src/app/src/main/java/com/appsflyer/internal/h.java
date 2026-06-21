package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AFd1wSDK f2470c;

    public /* synthetic */ h(AFd1wSDK aFd1wSDK, int i) {
        this.f2469b = i;
        this.f2470c = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2469b) {
            case 0:
                AFd1wSDK.getMonetizationNetwork(this.f2470c);
                break;
            case 1:
                AFd1wSDK.getMediationNetwork(this.f2470c);
                break;
            default:
                AFd1wSDK.getRevenue(this.f2470c);
                break;
        }
    }
}
