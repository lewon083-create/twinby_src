package com.appsflyer;

import com.appsflyer.internal.AFh1ySDK;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AFh1ySDK[] f2432c;

    public /* synthetic */ a(AFh1ySDK[] aFh1ySDKArr, int i) {
        this.f2431b = i;
        this.f2432c = aFh1ySDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2431b) {
            case 0:
                AFLogger.getMediationNetwork(this.f2432c);
                break;
            default:
                AFLogger.getCurrencyIso4217Code(this.f2432c);
                break;
        }
    }
}
