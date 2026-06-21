package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class J0 implements AppMetricaPlugins {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L0 f22476a;

    public J0(@NotNull L0 l02) {
        this.f22476a = l02;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(@NotNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        this.f22476a.a(pluginErrorDetails, str);
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(@NotNull PluginErrorDetails pluginErrorDetails) {
        this.f22476a.a(pluginErrorDetails);
    }

    public J0() {
        this(new L0());
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(@NotNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f22476a.a(str, str2, pluginErrorDetails);
    }
}
