package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.t;
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
public final class RemoteBillingConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BillingConfig f21595b;

    public RemoteBillingConfig(boolean z5, @NotNull BillingConfig billingConfig) {
        this.f21594a = z5;
        this.f21595b = billingConfig;
    }

    @NotNull
    public final BillingConfig getConfig() {
        return this.f21595b;
    }

    public final boolean getEnabled() {
        return this.f21594a;
    }

    @NotNull
    public String toString() {
        return "RemoteBillingConfig(enabled=" + this.f21594a + ", config=" + this.f21595b + ')';
    }

    public RemoteBillingConfig() {
        this(new t().f21538a, new BillingConfig());
    }
}
