package io.appmetrica.analytics.adrevenue.ironsource.v9.impl;

import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements LevelPlayImpressionDataListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f21490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f21491b = new b();

    public c(ClientContext clientContext) {
        this.f21490a = clientContext;
    }

    public final void onImpressionSuccess(LevelPlayImpressionData levelPlayImpressionData) {
        ModuleAdType moduleAdType;
        if (levelPlayImpressionData != null) {
            InternalClientModuleFacade internalClientModuleFacade = this.f21490a.getInternalClientModuleFacade();
            this.f21491b.getClass();
            String adFormat = levelPlayImpressionData.getAdFormat();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefaultNullable(levelPlayImpressionData.getRevenue(), ConfigValue.DOUBLE_DEFAULT_VALUE));
            Currency currency = Currency.getInstance("USD");
            if (adFormat != null) {
                switch (adFormat) {
                    case "banner":
                        moduleAdType = ModuleAdType.BANNER;
                        break;
                    case "rewarded_video":
                        moduleAdType = ModuleAdType.REWARDED;
                        break;
                    case "interstitial":
                        moduleAdType = ModuleAdType.INTERSTITIAL;
                        break;
                    default:
                        moduleAdType = ModuleAdType.OTHER;
                        break;
                }
            } else {
                moduleAdType = null;
            }
            internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(bigDecimalValueOf, currency, moduleAdType, levelPlayImpressionData.getAdNetwork(), levelPlayImpressionData.getMediationAdUnitId(), levelPlayImpressionData.getMediationAdUnitName(), null, levelPlayImpressionData.getPlacement(), levelPlayImpressionData.getPrecision(), new a(adFormat), true));
        }
    }
}
