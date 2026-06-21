package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFc1rSDK {
    final List<AFc1sSDK> getMediationNetwork;

    public AFc1rSDK(List<AFc1sSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.getMediationNetwork = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1rSDK) && Intrinsics.a(this.getMediationNetwork, ((AFc1rSDK) obj).getMediationNetwork);
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode();
    }

    public final String toString() {
        return "StorageConfig(typeEntries=" + this.getMediationNetwork + ")";
    }
}
