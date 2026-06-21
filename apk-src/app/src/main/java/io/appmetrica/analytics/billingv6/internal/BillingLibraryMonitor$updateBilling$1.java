package io.appmetrica.analytics.billingv6.internal;

import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class BillingLibraryMonitor$updateBilling$1 implements UtilsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BillingLibraryMonitor f21652a;

    public BillingLibraryMonitor$updateBilling$1(BillingLibraryMonitor billingLibraryMonitor) {
        this.f21652a = billingLibraryMonitor;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    @NotNull
    public BillingInfoManager getBillingInfoManager() {
        return this.f21652a.f21648e;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    @NotNull
    public BillingInfoSender getBillingInfoSender() {
        return this.f21652a.f21647d;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    @NotNull
    public Executor getUiExecutor() {
        return this.f21652a.f21646c;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    @NotNull
    public UpdatePolicy getUpdatePolicy() {
        return this.f21652a.f21649f;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    @NotNull
    public Executor getWorkerExecutor() {
        return this.f21652a.f21645b;
    }
}
