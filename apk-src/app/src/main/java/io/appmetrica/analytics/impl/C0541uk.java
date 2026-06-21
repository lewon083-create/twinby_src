package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0541uk implements ServiceModuleReporterComponentContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zj f24855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Yj f24856b;

    public C0541uk(@NotNull Y4 y42, @NotNull C0401p4 c0401p4) {
        this.f24855a = new Zj(y42, null, 2, 0 == true ? 1 : 0);
        this.f24856b = new Yj(c0401p4);
    }

    @NotNull
    public final Yj a() {
        return this.f24856b;
    }

    @NotNull
    public final Zj b() {
        return this.f24855a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.f24856b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.f24855a;
    }
}
