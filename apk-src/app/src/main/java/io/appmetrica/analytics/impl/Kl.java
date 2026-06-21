package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Kl extends HashMap {
    public Kl() {
        put(Il.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(Il.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(Il.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
