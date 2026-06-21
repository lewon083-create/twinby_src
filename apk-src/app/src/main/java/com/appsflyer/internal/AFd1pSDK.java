package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFd1pSDK {
    public static boolean getCurrencyIso4217Code(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int mediationNetwork = AFk1xSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1xSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> pairAFAdRevenueData = AFd1rSDK.AFAdRevenueData(str2);
        return (mediationNetwork2 == -1 || monetizationNetwork != null) ? pairAFAdRevenueData != null ? ((Number) pairAFAdRevenueData.f27469b).intValue() <= mediationNetwork && mediationNetwork <= ((Number) pairAFAdRevenueData.f27470c).intValue() : monetizationNetwork != null && ((Number) monetizationNetwork.f27469b).intValue() <= mediationNetwork && mediationNetwork <= ((Number) monetizationNetwork.f27470c).intValue() : mediationNetwork2 == mediationNetwork;
    }
}
