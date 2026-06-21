package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class R2 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S2 f22908a;

    public R2(S2 s22) {
        this.f22908a = s22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f22908a.f22938b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f22908a.getClass();
        BatteryInfo batteryInfoA = S2.a(intent);
        this.f22908a.f22938b = batteryInfoA;
        if (chargeType != batteryInfoA.chargeType) {
            this.f22908a.f22937a.execute(new Q2(this, batteryInfoA));
        }
    }
}
