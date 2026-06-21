package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Uj extends Y4 {
    public Uj(@NonNull Context context, @NonNull C0140em c0140em, @NonNull R4 r42, @NonNull C0401p4 c0401p4, @NonNull InterfaceC0187gh interfaceC0187gh, @NonNull W4 w42, @NonNull Q4 q42) {
        this(context, r42, new C0272k0(), new TimePassedChecker(), new C0098d5(context, r42, c0401p4, w42, c0140em, interfaceC0187gh, C0382oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0382oa.k().l(), q42), c0401p4);
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Fa
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public Uj(Context context, R4 r42, C0272k0 c0272k0, TimePassedChecker timePassedChecker, C0098d5 c0098d5, C0401p4 c0401p4) {
        super(context, r42, c0272k0, timePassedChecker, c0098d5, c0401p4);
    }
}
