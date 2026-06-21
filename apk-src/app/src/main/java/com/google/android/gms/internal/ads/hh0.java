package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hh0 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6140b;

    public /* synthetic */ hh0(int i, Object obj) {
        this.f6139a = i;
        this.f6140b = obj;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        switch (this.f6139a) {
            case 0:
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                ((zj0) this.f6140b).c(true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
                break;
            default:
                int overrideNetworkType2 = telephonyDisplayInfo.getOverrideNetworkType();
                ((m3.o) this.f6140b).c(overrideNetworkType2 == 3 || overrideNetworkType2 == 4 || overrideNetworkType2 == 5 ? 10 : 5);
                break;
        }
    }
}
