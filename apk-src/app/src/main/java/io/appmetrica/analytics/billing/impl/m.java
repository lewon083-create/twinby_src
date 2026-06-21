package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements ServiceModuleReporterComponentLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f21525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f21526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BillingMonitor f21527c;

    public m(@NotNull ServiceContext serviceContext, @Nullable B b2) {
        this.f21525a = serviceContext;
        this.f21526b = b2;
    }

    public final void a(@Nullable B b2) {
        BillingConfig billingConfig;
        BillingMonitor billingMonitor = this.f21527c;
        if (billingMonitor != null) {
            if (b2 != null) {
                A a10 = b2.f21502b;
                billingConfig = new BillingConfig(a10.f21499a, a10.f21500b);
            } else {
                billingConfig = null;
            }
            billingMonitor.onBillingConfigChanged(billingConfig);
        }
        this.f21526b = b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMainReporterCreated(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext r18) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.billing.impl.m.onMainReporterCreated(io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext):void");
    }

    public static final void a(m mVar, ApplicationState applicationState) {
        mVar.getClass();
        if (applicationState == ApplicationState.VISIBLE) {
            try {
                BillingMonitor billingMonitor = mVar.f21527c;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
