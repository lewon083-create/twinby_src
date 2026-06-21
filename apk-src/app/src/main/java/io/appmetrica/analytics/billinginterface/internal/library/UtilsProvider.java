package io.appmetrica.analytics.billinginterface.internal.library;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface UtilsProvider {
    @NonNull
    BillingInfoManager getBillingInfoManager();

    @NonNull
    BillingInfoSender getBillingInfoSender();

    @NonNull
    Executor getUiExecutor();

    @NonNull
    UpdatePolicy getUpdatePolicy();

    @NonNull
    Executor getWorkerExecutor();
}
