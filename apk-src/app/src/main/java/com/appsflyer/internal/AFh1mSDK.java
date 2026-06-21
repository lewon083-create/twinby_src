package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AFh1mSDK {
    public Map<String, Object> AFAdRevenueData;
    public String areAllFieldsValid;
    public String component1;
    public String component2;
    public String component3;
    public int component4;
    public String copydefault;
    public AppsFlyerRequestListener getCurrencyIso4217Code;
    public final Map<String, String> getMediationNetwork;
    public String getMonetizationNetwork;
    public Map<String, Object> getRevenue;
    private byte[] hashCode;
    private final boolean toString;

    public AFh1mSDK() {
        this(null, null, null);
    }

    public abstract AFe1pSDK AFAdRevenueData();

    public final AFh1mSDK AFAdRevenueData(Map<String, ?> map) {
        synchronized (map) {
            this.AFAdRevenueData.putAll(map);
        }
        return this;
    }

    public boolean areAllFieldsValid() {
        return false;
    }

    public boolean component1() {
        return true;
    }

    public boolean component4() {
        return true;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.toString;
    }

    public boolean getMediationNetwork() {
        return true;
    }

    public final AFh1mSDK getMonetizationNetwork(String str, Object obj) {
        synchronized (this.AFAdRevenueData) {
            this.AFAdRevenueData.put(str, obj);
        }
        return this;
    }

    public final boolean getRevenue() {
        return this.areAllFieldsValid == null && this.component3 == null;
    }

    public AFh1mSDK(String str, String str2, Boolean bool) {
        this.AFAdRevenueData = new HashMap();
        this.getMediationNetwork = new HashMap();
        this.areAllFieldsValid = str;
        this.component2 = str2;
        this.toString = bool != null ? bool.booleanValue() : true;
    }

    public static boolean getRevenue(double d10) {
        if (d10 < ConfigValue.DOUBLE_DEFAULT_VALUE || d10 >= 1.0d) {
            return false;
        }
        if (d10 == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return true;
        }
        int i = (int) (1.0d / d10);
        if (i + 1 > 0) {
            return ((int) ((Math.random() * ((double) i)) + 1.0d)) != i;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public final AFh1mSDK getMediationNetwork(byte[] bArr) {
        this.hashCode = bArr;
        return this;
    }

    public final AFh1mSDK AFAdRevenueData(int i) {
        this.component4 = i;
        synchronized (this.AFAdRevenueData) {
            try {
                if (this.AFAdRevenueData.containsKey("counter")) {
                    this.AFAdRevenueData.put("counter", Integer.toString(i));
                }
                if (this.AFAdRevenueData.containsKey("launch_counter")) {
                    this.AFAdRevenueData.put("launch_counter", Integer.toString(i));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    public final byte[] getMonetizationNetwork() {
        return this.hashCode;
    }
}
