package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AdType;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0052bb implements InternalClientModuleFacade {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pc f23498a = new Pc();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade
    public final void reportAdRevenue(@NotNull ModuleAdRevenue moduleAdRevenue) {
        AdType adType;
        Pc pc2 = this.f23498a;
        pc2.getClass();
        AdRevenue.Builder builderNewBuilder = AdRevenue.newBuilder(moduleAdRevenue.getAdRevenue(), moduleAdRevenue.getCurrency());
        ModuleAdType adType2 = moduleAdRevenue.getAdType();
        ModuleAdType.values();
        switch (adType2 == null ? -1 : Oc.f22794a[adType2.ordinal()]) {
            case -1:
                adType = null;
                break;
            case 0:
            default:
                throw new ij.j();
            case 1:
                adType = AdType.NATIVE;
                break;
            case 2:
                adType = AdType.BANNER;
                break;
            case 3:
                adType = AdType.REWARDED;
                break;
            case 4:
                adType = AdType.INTERSTITIAL;
                break;
            case 5:
                adType = AdType.MREC;
                break;
            case 6:
                adType = AdType.APP_OPEN;
                break;
            case 7:
                adType = AdType.OTHER;
                break;
        }
        AdRevenue.Builder builderWithPrecision = builderNewBuilder.withAdType(adType).withAdNetwork(moduleAdRevenue.getAdNetwork()).withAdUnitId(moduleAdRevenue.getAdUnitId()).withAdUnitName(moduleAdRevenue.getAdUnitName()).withAdPlacementId(moduleAdRevenue.getAdPlacementId()).withAdPlacementName(moduleAdRevenue.getAdPlacementName()).withPrecision(moduleAdRevenue.getPrecision());
        Map<String, String> payload = moduleAdRevenue.getPayload();
        LinkedHashMap linkedHashMapM = payload != null ? kotlin.collections.j0.m(payload) : new LinkedHashMap();
        pc2.f22833a.getClass();
        linkedHashMapM.put(AdRevenueConstants.LAYER_KEY, "native");
        ModulesFacade.reportAdRevenue(builderWithPrecision.withPayload(linkedHashMapM).build(), Boolean.valueOf(moduleAdRevenue.getAutoCollected()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade
    public final void reportEvent(@NotNull InternalModuleEvent internalModuleEvent) {
        ModuleEvent.Builder builderWithValue = ModuleEvent.newBuilder(internalModuleEvent.getType()).withName(internalModuleEvent.getName()).withValue(internalModuleEvent.getValue());
        Integer serviceDataReporterType = internalModuleEvent.getServiceDataReporterType();
        if (serviceDataReporterType != null) {
            builderWithValue.withServiceDataReporterType(serviceDataReporterType.intValue());
        }
        InternalModuleEvent.Category category = internalModuleEvent.getCategory();
        if (category != null) {
            int i = AbstractC0026ab.f23427a[category.ordinal()];
            ModuleEvent.Category category2 = i != 1 ? i != 2 ? null : ModuleEvent.Category.GENERAL : ModuleEvent.Category.SYSTEM;
            if (category2 != null) {
                builderWithValue.withCategory(category2);
            }
        }
        ModulesFacade.reportEvent(builderWithValue.withExtras(internalModuleEvent.getExtras()).withAttributes(internalModuleEvent.getAttributes()).withEnvironment(internalModuleEvent.getEnvironment()).build());
    }
}
