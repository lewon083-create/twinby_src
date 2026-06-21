package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Me implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f22687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Oe f22689c;

    public Me(Oe oe2, PluginErrorDetails pluginErrorDetails, String str) {
        this.f22689c = oe2;
        this.f22687a = pluginErrorDetails;
        this.f22688b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Sa) this.f22689c.f22800d.get()).getPluginExtension().reportError(this.f22687a, this.f22688b);
    }
}
