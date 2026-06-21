package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFh1zSDK extends AFh1ySDK {
    private final AFd1zSDK getMonetizationNetwork;

    public AFh1zSDK(AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getMonetizationNetwork = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th2, boolean z5, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z11) {
            if (StringsKt.D(str)) {
                str = "missing label";
            }
            this.getMonetizationNetwork.afErrorLogForExcManagerOnly().getMonetizationNetwork(th2, withTag$SDK_prodRelease(str, aFg1cSDK));
        }
    }
}
