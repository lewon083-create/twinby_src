package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ee extends Ec {
    public Ee(Integer num) {
        super(num);
        a(NetworkType.CELL, 0);
        a(NetworkType.WIFI, 1);
        a(NetworkType.BLUETOOTH, 3);
        a(NetworkType.ETHERNET, 4);
        a(NetworkType.MOBILE_DUN, 5);
        a(NetworkType.MOBILE_HIPRI, 6);
        a(NetworkType.MOBILE_MMS, 7);
        a(NetworkType.MOBILE_SUPL, 8);
        a(NetworkType.VPN, 9);
        a(NetworkType.WIMAX, 10);
        a(NetworkType.LOWPAN, 11);
        a(NetworkType.WIFI_AWARE, 12);
    }
}
