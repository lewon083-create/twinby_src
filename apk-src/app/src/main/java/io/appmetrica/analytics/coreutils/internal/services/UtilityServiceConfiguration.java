package io.appmetrica.analytics.coreutils.internal.services;

import com.google.android.gms.internal.ads.om1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class UtilityServiceConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21825b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j10, long j11, int i, Object obj) {
        if ((i & 1) != 0) {
            j10 = utilityServiceConfiguration.f21824a;
        }
        if ((i & 2) != 0) {
            j11 = utilityServiceConfiguration.f21825b;
        }
        return utilityServiceConfiguration.copy(j10, j11);
    }

    public final long component1() {
        return this.f21824a;
    }

    public final long component2() {
        return this.f21825b;
    }

    @NotNull
    public final UtilityServiceConfiguration copy(long j10, long j11) {
        return new UtilityServiceConfiguration(j10, j11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) obj;
        return this.f21824a == utilityServiceConfiguration.f21824a && this.f21825b == utilityServiceConfiguration.f21825b;
    }

    public final long getInitialConfigTime() {
        return this.f21824a;
    }

    public final long getLastUpdateConfigTime() {
        return this.f21825b;
    }

    public int hashCode() {
        return Long.hashCode(this.f21825b) + (Long.hashCode(this.f21824a) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UtilityServiceConfiguration(initialConfigTime=");
        sb2.append(this.f21824a);
        sb2.append(", lastUpdateConfigTime=");
        return om1.m(sb2, this.f21825b, ')');
    }

    public UtilityServiceConfiguration(long j10, long j11) {
        this.f21824a = j10;
        this.f21825b = j11;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j10, long j11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j10, (i & 2) != 0 ? 0L : j11);
    }
}
