package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import l7.o;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFi1jSDK {
    public final String AFAdRevenueData;
    public final long getCurrencyIso4217Code;
    public final long getMediationNetwork;
    public final String getRevenue;

    public AFi1jSDK(long j10, long j11, String str, String str2) {
        this.getMediationNetwork = j10;
        this.getCurrencyIso4217Code = j11;
        this.getRevenue = str;
        this.AFAdRevenueData = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1jSDK)) {
            return false;
        }
        AFi1jSDK aFi1jSDK = (AFi1jSDK) obj;
        return this.getMediationNetwork == aFi1jSDK.getMediationNetwork && this.getCurrencyIso4217Code == aFi1jSDK.getCurrencyIso4217Code && Intrinsics.a(this.getRevenue, aFi1jSDK.getRevenue) && Intrinsics.a(this.AFAdRevenueData, aFi1jSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        int iD = o.d(this.getCurrencyIso4217Code, Long.hashCode(this.getMediationNetwork) * 31, 31);
        String str = this.getRevenue;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.AFAdRevenueData;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        long j10 = this.getMediationNetwork;
        long j11 = this.getCurrencyIso4217Code;
        String str = this.getRevenue;
        String str2 = this.AFAdRevenueData;
        StringBuilder sbN = gf.a.n("PlayIntegrityApiData(piaTimestamp=", ", ttrMillis=", j10);
        sbN.append(j11);
        sbN.append(", piaToken=");
        sbN.append(str);
        return z.g(sbN, ", errorCode=", str2, ")");
    }
}
