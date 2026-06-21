package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AFj1sSDK f2480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f2481d;

    public /* synthetic */ l(AFj1sSDK aFj1sSDK, Runnable runnable, int i) {
        this.f2479b = i;
        this.f2480c = aFj1sSDK;
        this.f2481d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2479b) {
            case 0:
                this.f2480c.AFAdRevenueData(this.f2481d);
                break;
            case 1:
                this.f2480c.getMonetizationNetwork(this.f2481d);
                break;
            case 2:
                this.f2480c.component1(this.f2481d);
                break;
            default:
                this.f2480c.getRevenue(this.f2481d);
                break;
        }
    }
}
