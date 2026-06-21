package com.appsflyer.internal;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import kotlin.jvm.internal.Intrinsics;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFf1bSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final int getMediationNetwork;
    final String getMonetizationNetwork;
    final int getRevenue;

    public AFf1bSDK(int i, int i10, int i11, int i12, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code = i;
        this.getMediationNetwork = i10;
        this.AFAdRevenueData = i11;
        this.getRevenue = i12;
        this.getMonetizationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1bSDK)) {
            return false;
        }
        AFf1bSDK aFf1bSDK = (AFf1bSDK) obj;
        return this.getCurrencyIso4217Code == aFf1bSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFf1bSDK.getMediationNetwork && this.AFAdRevenueData == aFf1bSDK.AFAdRevenueData && this.getRevenue == aFf1bSDK.getRevenue && Intrinsics.a(this.getMonetizationNetwork, aFf1bSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        return this.getMonetizationNetwork.hashCode() + u.g(this.getRevenue, u.g(this.AFAdRevenueData, u.g(this.getMediationNetwork, Integer.hashCode(this.getCurrencyIso4217Code) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.getCurrencyIso4217Code;
        int i10 = this.getMediationNetwork;
        int i11 = this.AFAdRevenueData;
        int i12 = this.getRevenue;
        String str = this.getMonetizationNetwork;
        StringBuilder sbI = z.i("CmpTcfData(policyVersion=", i, ", gdprApplies=", i10, ", cmpSdkId=");
        om1.t(sbI, i11, ", cmpSdkVersion=", i12, ", tcString=");
        return u.o(sbI, str, ")");
    }
}
