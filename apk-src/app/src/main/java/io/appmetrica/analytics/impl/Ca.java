package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface Ca {
    C0148f4 a();

    void a(AppMetricaConfig appMetricaConfig, Ua ua2);

    Handler b();

    T1 c();

    C0308lb d();

    ICommonExecutor getDefaultExecutor();
}
