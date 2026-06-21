package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFb1rSDK {
    public final Map<String, Object> getCurrencyIso4217Code = new HashMap();
    public Map<String, Object> getMonetizationNetwork = new HashMap();

    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        if (!this.getCurrencyIso4217Code.isEmpty()) {
            map.put("partner_data", this.getCurrencyIso4217Code);
        }
        if (this.getMonetizationNetwork.isEmpty()) {
            return;
        }
        AFa1ySDK.getMediationNetwork(map).put("partner_data", this.getMonetizationNetwork);
        this.getMonetizationNetwork = new HashMap();
    }
}
