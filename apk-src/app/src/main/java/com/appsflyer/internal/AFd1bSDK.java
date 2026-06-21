package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class AFd1bSDK {
    public final Map<String, String> AFAdRevenueData;
    private final boolean areAllFieldsValid;
    private final boolean component1;
    private boolean component2;
    private final byte[] component3;
    public int component4;
    public boolean getCurrencyIso4217Code;
    public final String getMediationNetwork;
    final String getMonetizationNetwork;
    public boolean getRevenue;

    public AFd1bSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z5) {
        this(str, bArr, str2, map, z5, (byte) 0);
    }

    public final boolean AFAdRevenueData() {
        return this.component2;
    }

    public final boolean component1() {
        return this.getRevenue;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code;
    }

    public final boolean getMediationNetwork() {
        return this.component1;
    }

    public final boolean getMonetizationNetwork() {
        return this.areAllFieldsValid;
    }

    public final byte[] getRevenue() {
        return this.component3;
    }

    private AFd1bSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z5, byte b2) {
        this.component2 = true;
        this.getCurrencyIso4217Code = false;
        this.getRevenue = true;
        this.component4 = -1;
        this.getMediationNetwork = str;
        this.component3 = bArr;
        this.getMonetizationNetwork = str2;
        this.AFAdRevenueData = map;
        this.component1 = z5;
        this.areAllFieldsValid = true;
    }

    public AFd1bSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
