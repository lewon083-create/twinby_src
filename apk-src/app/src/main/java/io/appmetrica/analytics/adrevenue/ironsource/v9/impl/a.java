package io.appmetrica.analytics.adrevenue.ironsource.v9.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends HashMap {
    public a(String str) {
        put(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-ironsource-v9");
        put(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str == null ? "null" : str);
        put("source", "ironsource");
    }
}
