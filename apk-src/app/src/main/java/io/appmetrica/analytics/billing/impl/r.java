package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f21533a;

    public r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t fromModel(@NotNull RemoteBillingConfig remoteBillingConfig) {
        t tVar = new t();
        tVar.f21538a = remoteBillingConfig.getEnabled();
        BillingConfig config = remoteBillingConfig.getConfig();
        tVar.f21539b = config != null ? this.f21533a.fromModel(config) : null;
        return tVar;
    }

    public r(@NotNull g gVar) {
        this.f21533a = gVar;
    }

    public /* synthetic */ r(g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new g() : gVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(@NotNull t tVar) {
        boolean z5 = tVar.f21538a;
        g gVar = this.f21533a;
        s sVar = tVar.f21539b;
        gVar.getClass();
        return new RemoteBillingConfig(z5, new BillingConfig(sVar.f21535a, sVar.f21536b));
    }
}
