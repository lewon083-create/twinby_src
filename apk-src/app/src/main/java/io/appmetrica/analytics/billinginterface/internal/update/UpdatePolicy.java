package io.appmetrica.analytics.billinginterface.internal.update;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface UpdatePolicy {
    @NonNull
    Map<String, BillingInfo> getBillingInfoToUpdate(@NonNull BillingConfig billingConfig, @NonNull Map<String, BillingInfo> map, @NonNull BillingInfoManager billingInfoManager);
}
