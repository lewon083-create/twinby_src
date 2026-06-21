package io.appmetrica.analytics.impl;

import android.content.Intent;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class S2 implements ChargeTypeProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ChargeType f22936d = ChargeType.UNKNOWN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f22937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile BatteryInfo f22938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f22939c = new ArrayList();

    public S2(@NonNull ICommonExecutor iCommonExecutor, @NonNull P2 p22) {
        R2 r22 = new R2(this);
        this.f22937a = iCommonExecutor;
        this.f22938b = a(p22.a(r22));
    }

    public static BatteryInfo a(Intent intent) {
        ChargeType chargeType = f22936d;
        Integer numValueOf = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                numValueOf = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            chargeType = ChargeType.NONE;
            if (intExtra3 == 1) {
                chargeType = ChargeType.AC;
            } else if (intExtra3 == 2) {
                chargeType = ChargeType.USB;
            } else if (intExtra3 == 4) {
                chargeType = ChargeType.WIRELESS;
            }
        }
        return new BatteryInfo(numValueOf, chargeType);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final Integer getBatteryLevel() {
        BatteryInfo batteryInfo = this.f22938b;
        if (batteryInfo == null) {
            return null;
        }
        return batteryInfo.batteryLevel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    @NonNull
    public final ChargeType getChargeType() {
        BatteryInfo batteryInfo = this.f22938b;
        return batteryInfo == null ? ChargeType.UNKNOWN : batteryInfo.chargeType;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final synchronized void registerChargeTypeListener(@NonNull ChargeTypeChangeListener chargeTypeChangeListener) {
        this.f22939c.add(chargeTypeChangeListener);
        chargeTypeChangeListener.onChargeTypeChanged(getChargeType());
    }
}
