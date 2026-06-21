package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFb1gSDK {
    public final String getMediationNetwork;
    public final int getMonetizationNetwork;

    public AFb1gSDK(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork = i;
        this.getMediationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1gSDK)) {
            return false;
        }
        AFb1gSDK aFb1gSDK = (AFb1gSDK) obj;
        return this.getMonetizationNetwork == aFb1gSDK.getMonetizationNetwork && Intrinsics.a(this.getMediationNetwork, aFb1gSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode() + (Integer.hashCode(this.getMonetizationNetwork) * 31);
    }

    public final String toString() {
        return "AppSetIdModel(scope=" + this.getMonetizationNetwork + ", id=" + this.getMediationNetwork + ")";
    }
}
