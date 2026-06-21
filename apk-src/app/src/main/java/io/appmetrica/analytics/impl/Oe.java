package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Oe implements IPluginReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Re f22797a = new Re();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Se f22798b = new Se();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f22799c = C0071c4.l().g().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f22800d;

    public Oe(@NonNull Provider<Sa> provider) {
        this.f22800d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, String str) {
        Re re2 = this.f22797a;
        re2.f22912a.a(pluginErrorDetails);
        if (re2.f22914c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f24595a) {
            this.f22798b.getClass();
            this.f22799c.execute(new Me(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        this.f22797a.f22912a.a(pluginErrorDetails);
        this.f22798b.getClass();
        this.f22799c.execute(new Le(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f22797a.f22913b.a(str);
        this.f22798b.getClass();
        this.f22799c.execute(new Ne(this, str, str2, pluginErrorDetails));
    }
}
