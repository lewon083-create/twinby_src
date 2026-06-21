package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFi1pSDK {
    public final Context getMediationNetwork;
    public AFi1qSDK getMonetizationNetwork;

    public AFi1pSDK(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.getMediationNetwork = context;
    }
}
