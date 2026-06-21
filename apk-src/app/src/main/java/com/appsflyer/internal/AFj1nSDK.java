package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFj1nSDK implements SensorEventListener {
    private final String AFAdRevenueData;
    private long component1;
    private final Executor component3;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final String getMonetizationNetwork;
    private double getRevenue;
    private final float[][] areAllFieldsValid = new float[2][];
    private final long[] component4 = new long[2];

    public AFj1nSDK(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.getMediationNetwork = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFAdRevenueData = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
        this.component3 = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F_, reason: merged with bridge method [inline-methods] */
    public void G_(SensorEvent sensorEvent) {
        long j10 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.areAllFieldsValid;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.component4[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.areAllFieldsValid[1] = fArrCopyOf;
            this.component4[1] = jCurrentTimeMillis;
            this.getRevenue = getRevenue(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j10 - this.component1) {
            this.component1 = j10;
            if (Arrays.equals(fArr4, fArr)) {
                this.component4[1] = jCurrentTimeMillis;
                return;
            }
            double revenue = getRevenue(fArr3, fArr);
            if (revenue > this.getRevenue) {
                this.areAllFieldsValid[1] = Arrays.copyOf(fArr, fArr.length);
                this.component4[1] = jCurrentTimeMillis;
                this.getRevenue = revenue;
            }
        }
    }

    private boolean getCurrencyIso4217Code(int i, String str, String str2) {
        return this.getMediationNetwork == i && this.AFAdRevenueData.equals(str) && this.getMonetizationNetwork.equals(str2);
    }

    private Map<String, Object> getMediationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getMediationNetwork));
        concurrentHashMap.put("sN", this.AFAdRevenueData);
        concurrentHashMap.put("sV", this.getMonetizationNetwork);
        float[] fArr = this.areAllFieldsValid[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getRevenue(fArr));
        }
        float[] fArr2 = this.areAllFieldsValid[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getRevenue(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean getMonetizationNetwork() {
        return this.areAllFieldsValid[0] != null;
    }

    private static double getRevenue(float[] fArr, float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = ConfigValue.DOUBLE_DEFAULT_VALUE;
        for (int i = 0; i < iMin; i++) {
            dPow += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    public final void AFAdRevenueData(Map<AFj1nSDK, Map<String, Object>> map, boolean z5) {
        if (!getMonetizationNetwork()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, getMediationNetwork());
            return;
        }
        map.put(this, getMediationNetwork());
        if (z5) {
            int length = this.areAllFieldsValid.length;
            for (int i = 0; i < length; i++) {
                this.areAllFieldsValid[i] = null;
            }
            int length2 = this.component4.length;
            for (int i10 = 0; i10 < length2; i10++) {
                this.component4[i10] = 0;
            }
            this.getRevenue = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.component1 = 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1nSDK)) {
            return false;
        }
        AFj1nSDK aFj1nSDK = (AFj1nSDK) obj;
        return getCurrencyIso4217Code(aFj1nSDK.getMediationNetwork, aFj1nSDK.AFAdRevenueData, aFj1nSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component3.execute(new f(2, this, sensorEvent));
        } else {
            G_(sensorEvent);
        }
    }

    private static List<Float> getRevenue(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
