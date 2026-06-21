package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2464c;

    public /* synthetic */ e(int i, Object obj) {
        this.f2463b = i;
        this.f2464c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2463b) {
            case 0:
                AFb1iSDK.getMediationNetwork((AFb1iSDK) this.f2464c);
                break;
            case 1:
                AFa1ySDK.getMediationNetwork((AFd1zSDK) this.f2464c);
                break;
            default:
                ((AFd1kSDK) this.f2464c).AFAdRevenueData();
                break;
        }
    }
}
