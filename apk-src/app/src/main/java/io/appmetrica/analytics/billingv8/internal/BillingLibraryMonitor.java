package io.appmetrica.analytics.billingv8.internal;

import android.content.Context;
import d8.c;
import d8.e;
import fd.b;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv8.impl.d;
import io.appmetrica.analytics.billingv8.impl.l;
import io.appmetrica.analytics.billingv8.impl.n;
import io.appmetrica.analytics.billingv8.impl.o;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
public final class BillingLibraryMonitor implements BillingMonitor, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f21698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f21699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f21700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f21701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final UpdatePolicy f21702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BillingConfig f21703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21704h;

    public BillingLibraryMonitor(@NotNull Context context, @NotNull Executor executor, @NotNull Executor executor2, @NotNull BillingInfoStorage billingInfoStorage, @NotNull BillingInfoSender billingInfoSender, @NotNull BillingInfoManager billingInfoManager, @NotNull UpdatePolicy updatePolicy) {
        this.f21697a = context;
        this.f21698b = executor;
        this.f21699c = executor2;
        this.f21700d = billingInfoSender;
        this.f21701e = billingInfoManager;
        this.f21702f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(@Nullable BillingConfig billingConfig) {
        if (Intrinsics.a(this.f21703g, billingConfig)) {
            return;
        }
        this.f21703g = billingConfig;
        if (billingConfig != null && !this.f21704h) {
            this.f21704h = true;
            c cVar = new c(this.f21697a);
            cVar.f15587c = new l();
            cVar.f15585a = new b(false, false);
            e eVarA = cVar.a();
            try {
                eVarA.l(new io.appmetrica.analytics.billingv8.impl.b(billingConfig, eVarA, new BillingLibraryMonitor$updateBilling$1(this), new d(eVarA), this));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            BillingConfig billingConfig = this.f21703g;
            if (billingConfig != null && !this.f21704h) {
                this.f21704h = true;
                c cVar = new c(this.f21697a);
                cVar.f15587c = new l();
                cVar.f15585a = new b(false, false);
                e eVarA = cVar.a();
                eVarA.l(new io.appmetrica.analytics.billingv8.impl.b(billingConfig, eVarA, new BillingLibraryMonitor$updateBilling$1(this), new d(eVarA), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv8.impl.n
    public synchronized void onUpdateFinished() {
        this.f21704h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i & 32) != 0 ? new io.appmetrica.analytics.billingv8.impl.c(billingInfoStorage) : billingInfoManager, (i & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
