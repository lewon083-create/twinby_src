package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements BillingInfoSender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceComponentModuleReporter f21519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f21520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f21521c;

    public j(@NotNull ServiceComponentModuleReporter serviceComponentModuleReporter, @NotNull Executor executor, @NotNull o oVar) {
        this.f21519a = serviceComponentModuleReporter;
        this.f21520b = executor;
        this.f21521c = oVar;
    }

    public static final void a(j jVar, ProductInfo productInfo) {
        ServiceComponentModuleReporter serviceComponentModuleReporter = jVar.f21519a;
        ServiceModuleCounterReport.Builder builderWithType = ServiceModuleCounterReport.Companion.newBuilder().withType(40976);
        jVar.f21521c.getClass();
        serviceComponentModuleReporter.handleReport(builderWithType.withValueBytes(o.a(productInfo)).build());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(@NotNull List<? extends ProductInfo> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f21520b.execute(new c0(24, this, (ProductInfo) it.next()));
        }
    }

    public /* synthetic */ j(ServiceComponentModuleReporter serviceComponentModuleReporter, Executor executor, o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serviceComponentModuleReporter, executor, (i & 4) != 0 ? new o() : oVar);
    }
}
