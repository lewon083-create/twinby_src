package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class De extends Ec {
    public De(NetworkType networkType) {
        super(networkType);
        a(1, NetworkType.WIFI);
        a(0, NetworkType.CELL);
        a(3, NetworkType.ETHERNET);
        a(2, NetworkType.BLUETOOTH);
        a(4, NetworkType.VPN);
        if (AndroidUtils.isApiAchieved(27)) {
            a(6, NetworkType.LOWPAN);
        }
        if (AndroidUtils.isApiAchieved(26)) {
            a(5, NetworkType.WIFI_AWARE);
        }
    }
}
