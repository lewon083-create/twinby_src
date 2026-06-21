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
public final class E0 implements Da {
    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.B6
    public final void a(int i, @NonNull Bundle bundle) {
    }

    @Override // io.appmetrica.analytics.impl.Da
    @NonNull
    public final Sa c(@NonNull ReporterConfig reporterConfig) {
        return new C0188gi();
    }

    @Override // io.appmetrica.analytics.impl.Da
    @NonNull
    public final Y9 d() {
        return new Y9();
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final String e() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final Map<String, String> g() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Da
    @NonNull
    public final AdvIdentifiersResult h() {
        AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        return new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"));
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final C0284kc i() {
        C0633yc c0633yc = new C0633yc();
        return new C0284kc(c0633yc, new C0653z7(c0633yc));
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void a(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void a(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z5) {
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z5, boolean z10) {
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        startupParamsCallback.onRequestError(StartupParamsCallback.Reason.UNKNOWN, null);
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ua
    @NonNull
    public final Ta a() {
        return new C0265ji();
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void b(@NonNull AppMetricaConfig appMetricaConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void setDataSendingEnabled(boolean z5) {
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void setUserProfileID(String str) {
    }

    @Override // io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Ic
    public final void putAppEnvironmentValue(String str, String str2) {
    }
}
