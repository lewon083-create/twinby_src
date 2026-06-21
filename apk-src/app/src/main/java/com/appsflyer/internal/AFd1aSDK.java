package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class AFd1aSDK {
    public final long getMediationNetwork;

    public AFd1aSDK(long j10) {
        this.getMediationNetwork = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getMediationNetwork == ((AFd1aSDK) obj).getMediationNetwork;
    }

    public int hashCode() {
        long j10 = this.getMediationNetwork;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
