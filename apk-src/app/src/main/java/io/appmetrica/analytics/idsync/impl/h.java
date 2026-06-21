package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f21974a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f21976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f21977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile IdSyncConfig f21978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f21979f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21975b = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0012f f21980g = new C0012f(this);

    public h(ServiceContext serviceContext, SdkIdentifiers sdkIdentifiers) {
        this.f21974a = serviceContext;
        this.f21976c = serviceContext.getExecutorProvider().getModuleExecutor();
        this.f21977d = new n(serviceContext, new G(serviceContext.getServiceStorageProvider().modulePreferences("id-sync")), sdkIdentifiers);
    }

    public final synchronized void a(IdSyncConfig idSyncConfig, SdkIdentifiers sdkIdentifiers) {
        try {
            this.f21977d.f22005c = sdkIdentifiers;
            if (!Intrinsics.a(this.f21978e, idSyncConfig)) {
                this.f21978e = idSyncConfig;
                if (a(idSyncConfig) && !this.f21979f) {
                    this.f21974a.getActivationBarrier().subscribe(idSyncConfig.getLaunchDelay(), this.f21976c, new C0013g(this));
                    this.f21979f = true;
                } else if (!a(idSyncConfig) && this.f21979f) {
                    this.f21979f = false;
                    IHandlerExecutor iHandlerExecutor = this.f21976c;
                    C0012f c0012f = this.f21980g;
                    if (c0012f == null) {
                        Intrinsics.g("syncRunnable");
                        throw null;
                    }
                    iHandlerExecutor.remove(c0012f);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean a(IdSyncConfig idSyncConfig) {
        idSyncConfig.getEnabled();
        return idSyncConfig.getEnabled() && !idSyncConfig.getRequests().isEmpty();
    }
}
