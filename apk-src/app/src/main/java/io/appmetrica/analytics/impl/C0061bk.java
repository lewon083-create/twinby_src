package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0061bk implements ServiceContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModuleServiceLifecycleController f23513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sd f23514b = new Sd(getContext());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Zc f23515c = new Zc();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bk f23516d = new Bk(getContext(), new Ak(new N1()));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0641yk f23517e = new C0641yk(getContext(), C0382oa.k().y(), C0382oa.k().B().f(getContext()));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0655z9 f23518f = new C0655z9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0428q6 f23519g = new C0428q6();

    public C0061bk(@NotNull ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.f23513a = moduleServiceLifecycleController;
    }

    @NotNull
    public final Sd a() {
        return this.f23514b;
    }

    @NotNull
    public final Zc b() {
        return this.f23515c;
    }

    @NotNull
    public final C0641yk c() {
        return this.f23517e;
    }

    @NotNull
    public final Bk d() {
        return this.f23516d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ActivationBarrier getActivationBarrier() {
        return C0382oa.I.B.getActivationBarrier();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ActiveNetworkTypeProvider getActiveNetworkTypeProvider() {
        return C0382oa.I.G;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ApplicationStateProvider getApplicationStateProvider() {
        return C0382oa.I.l().f22376b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ChargeTypeProvider getChargeTypeProvider() {
        S2 s22;
        C0382oa c0382oa = C0382oa.I;
        S2 s23 = c0382oa.f24494e;
        if (s23 != null) {
            return s23;
        }
        synchronized (c0382oa) {
            try {
                s22 = c0382oa.f24494e;
                if (s22 == null) {
                    s22 = new S2(c0382oa.f24493d.a(), c0382oa.l().f22375a);
                    c0382oa.f24494e = s22;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s22;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final Context getContext() {
        return C0382oa.I.f24490a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final CryptoProvider getCryptoProvider() {
        return this.f23519g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final DataSendingRestrictionController getDataSendingRestrictionController() {
        return C0382oa.I.h();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ExecutorProvider getExecutorProvider() {
        return this.f23518f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final FirstExecutionConditionService getFirstExecutionConditionService() {
        return C0382oa.I.B.getFirstExecutionService();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final LocationServiceApi getLocationServiceApi() {
        return C0382oa.I.m();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.f23513a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceNetworkContext getNetworkContext() {
        return this.f23514b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final PermissionExtractor getPermissionExtractor() {
        return C0382oa.I.j();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final PlatformIdentifiers getPlatformIdentifiers() {
        return C0382oa.I.s();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return C0382oa.I.v();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleSelfReporter getSelfReporter() {
        return this.f23515c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ServiceModuleReporterComponentLifecycle getServiceModuleReporterComponentLifecycle() {
        return C0382oa.I.F;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceStorageProvider getServiceStorageProvider() {
        return this.f23517e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceWakeLock getServiceWakeLock() {
        return this.f23516d;
    }
}
