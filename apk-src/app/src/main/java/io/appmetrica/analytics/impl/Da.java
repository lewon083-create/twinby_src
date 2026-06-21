package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface Da extends Ic, B6, Ua {
    @NonNull
    /* synthetic */ Ta a();

    /* synthetic */ void a(int i, @NonNull Bundle bundle);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(Location location);

    void a(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig);

    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    void a(@NonNull ReporterConfig reporterConfig);

    void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(boolean z5);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(boolean z5, boolean z10);

    void b(@NonNull AppMetricaConfig appMetricaConfig);

    @NonNull
    Sa c(@NonNull ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void clearAppEnvironment();

    @NonNull
    Y9 d();

    String e();

    Map<String, String> g();

    @NonNull
    AdvIdentifiersResult h();

    C0284kc i();

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void putAppEnvironmentValue(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void setDataSendingEnabled(boolean z5);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void setUserProfileID(String str);
}
