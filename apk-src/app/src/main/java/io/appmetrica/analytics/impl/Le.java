package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Le implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f22610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Oe f22611b;

    public Le(Oe oe2, PluginErrorDetails pluginErrorDetails) {
        this.f22611b = oe2;
        this.f22610a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Sa) this.f22611b.f22800d.get()).getPluginExtension().reportUnhandledException(this.f22610a);
    }
}
