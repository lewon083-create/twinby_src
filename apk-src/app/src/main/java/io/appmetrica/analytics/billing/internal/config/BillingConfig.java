package io.appmetrica.analytics.billing.internal.config;

import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.billing.impl.s;
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
public final class BillingConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21593b;

    public BillingConfig(int i, int i10) {
        this.f21592a = i;
        this.f21593b = i10;
    }

    public final int getFirstCollectingInappMaxAgeSeconds() {
        return this.f21593b;
    }

    public final int getSendFrequencySeconds() {
        return this.f21592a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BillingConfig(sendFrequencySeconds=");
        sb2.append(this.f21592a);
        sb2.append(", firstCollectingInappMaxAgeSeconds=");
        return om1.l(sb2, this.f21593b, ')');
    }

    public BillingConfig() {
        this(new s().f21535a, new s().f21536b);
    }
}
