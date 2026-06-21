package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFe1ySDK {
    final String getCurrencyIso4217Code;
    final String getMonetizationNetwork;

    public AFe1ySDK(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1ySDK)) {
            return false;
        }
        AFe1ySDK aFe1ySDK = (AFe1ySDK) obj;
        return Intrinsics.a(this.getMonetizationNetwork, aFe1ySDK.getMonetizationNetwork) && Intrinsics.a(this.getCurrencyIso4217Code, aFe1ySDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode() + (this.getMonetizationNetwork.hashCode() * 31);
    }

    public final String toString() {
        return z.f("HostConfig(prefix=", this.getMonetizationNetwork, ", host=", this.getCurrencyIso4217Code, ")");
    }
}
