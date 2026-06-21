package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ne implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f22737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Oe f22738d;

    public Ne(Oe oe2, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f22738d = oe2;
        this.f22735a = str;
        this.f22736b = str2;
        this.f22737c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Sa) this.f22738d.f22800d.get()).getPluginExtension().reportError(this.f22735a, this.f22736b, this.f22737c);
    }
}
