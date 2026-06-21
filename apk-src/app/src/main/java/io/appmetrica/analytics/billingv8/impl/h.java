package io.appmetrica.analytics.billingv8.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f21678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f21679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f21680c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f21678a = linkedHashMap;
        this.f21679b = map;
        this.f21680c = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f21678a;
        Map map2 = this.f21679b;
        i iVar = this.f21680c;
        m.a(map, map2, iVar.f21684d, iVar.f21683c.getBillingInfoManager());
        return Unit.f27471a;
    }
}
