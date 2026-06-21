package com.appsflyer.internal;

import a0.u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFc1sSDK {
    final String AFAdRevenueData;
    final List<AFe1pSDK> getMediationNetwork;
    final int getMonetizationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1sSDK(String str, List<? extends AFe1pSDK> list, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AFAdRevenueData = str;
        this.getMediationNetwork = list;
        this.getMonetizationNetwork = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1sSDK)) {
            return false;
        }
        AFc1sSDK aFc1sSDK = (AFc1sSDK) obj;
        return Intrinsics.a(this.AFAdRevenueData, aFc1sSDK.AFAdRevenueData) && Intrinsics.a(this.getMediationNetwork, aFc1sSDK.getMediationNetwork) && this.getMonetizationNetwork == aFc1sSDK.getMonetizationNetwork;
    }

    public final int hashCode() {
        return Integer.hashCode(this.getMonetizationNetwork) + u.i(this.getMediationNetwork, this.AFAdRevenueData.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.AFAdRevenueData;
        List<AFe1pSDK> list = this.getMediationNetwork;
        int i = this.getMonetizationNetwork;
        StringBuilder sb2 = new StringBuilder("StorageConfigTypeEntry(cacheDirName=");
        sb2.append(str);
        sb2.append(", eventTypes=");
        sb2.append(list);
        sb2.append(", maxCapacity=");
        return z.d(i, ")", sb2);
    }
}
