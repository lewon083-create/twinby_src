package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0172g2 {
    public static final boolean a(Throwable th2) {
        return true;
    }

    @NotNull
    public final Ga a(@NotNull Context context, @NotNull AppMetricaConfig appMetricaConfig, @NotNull Ua ua2) {
        return new Ah(new C0182gc(ua2, appMetricaConfig), new ig.a(13), appMetricaConfig.crashTransformer, new N9(context));
    }
}
