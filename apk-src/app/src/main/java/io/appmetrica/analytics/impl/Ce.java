package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ce extends Ec {
    public Ce(NetworkType networkType) {
        super(networkType);
        a(1, NetworkType.WIFI);
        a(0, NetworkType.CELL);
        a(7, NetworkType.BLUETOOTH);
        a(9, NetworkType.ETHERNET);
        a(4, NetworkType.MOBILE_DUN);
        a(5, NetworkType.MOBILE_HIPRI);
        a(2, NetworkType.MOBILE_MMS);
        a(3, NetworkType.MOBILE_SUPL);
        a(6, NetworkType.WIMAX);
        a(17, NetworkType.VPN);
    }
}
