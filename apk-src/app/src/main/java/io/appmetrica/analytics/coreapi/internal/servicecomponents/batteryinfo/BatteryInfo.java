package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class BatteryInfo {
    public final Integer batteryLevel;

    @NonNull
    public final ChargeType chargeType;

    public BatteryInfo(Integer num, @NonNull ChargeType chargeType) {
        this.batteryLevel = num;
        this.chargeType = chargeType;
    }
}
