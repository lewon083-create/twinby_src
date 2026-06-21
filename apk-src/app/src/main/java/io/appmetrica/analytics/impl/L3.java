package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class L3 implements I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L5 f22592b = new L5(new C0252j5());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0122e4 f22593c = new C0122e4(C0071c4.l().b(getContext()));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0052bb f22594d = new C0052bb();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0371o f22595e = C0071c4.l().a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J3 f22596f = new J3();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rc f22597g = new Rc();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final K3 f22598h = new K3();

    public L3(@NotNull Context context) {
        this.f22591a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f22595e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ModuleClientActivator getClientActivator() {
        return this.f22596f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f22597g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f22593c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final Context getContext() {
        return this.f22591a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f22594d;
    }

    @Override // io.appmetrica.analytics.impl.I5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final K5 getModuleAdRevenueContext() {
        return this.f22592b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ProcessDetector getProcessDetector() {
        return this.f22598h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f22592b;
    }
}
