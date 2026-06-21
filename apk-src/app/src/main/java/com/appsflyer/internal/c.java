package com.appsflyer.internal;

import com.appsflyer.internal.AFd1xSDK;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements AFd1xSDK.AFa1vSDK, AFf1mSDK, sb.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2460b;

    public /* synthetic */ c(Object obj) {
        this.f2460b = obj;
    }

    @Override // com.appsflyer.internal.AFd1xSDK.AFa1vSDK
    public void onConfigurationChanged(boolean z5) {
        ((AFa1ySDK) this.f2460b).getMediationNetwork(z5);
    }

    @Override // com.appsflyer.internal.AFf1mSDK
    public void onRemoteConfigUpdateFinished(AFf1pSDK aFf1pSDK) {
        ((AFa1ySDK) this.f2460b).AFAdRevenueData(aFf1pSDK);
    }

    @Override // sb.d
    public void onSuccess(Object obj) {
        AFb1cSDK.getMonetizationNetwork((AFb1cSDK) this.f2460b, (ga.b) obj);
    }
}
