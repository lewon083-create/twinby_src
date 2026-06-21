package com.vk.sdk.api.utils.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
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
public final class UtilsStats {

    @b("timestamp")
    @Nullable
    private final Integer timestamp;

    @b("views")
    @Nullable
    private final Integer views;

    public UtilsStats() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UtilsStats copy$default(UtilsStats utilsStats, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = utilsStats.timestamp;
        }
        if ((i & 2) != 0) {
            num2 = utilsStats.views;
        }
        return utilsStats.copy(num, num2);
    }

    @Nullable
    public final Integer component1() {
        return this.timestamp;
    }

    @Nullable
    public final Integer component2() {
        return this.views;
    }

    @NotNull
    public final UtilsStats copy(@Nullable Integer num, @Nullable Integer num2) {
        return new UtilsStats(num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsStats)) {
            return false;
        }
        UtilsStats utilsStats = (UtilsStats) obj;
        return Intrinsics.a(this.timestamp, utilsStats.timestamp) && Intrinsics.a(this.views, utilsStats.views);
    }

    @Nullable
    public final Integer getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final Integer getViews() {
        return this.views;
    }

    public int hashCode() {
        Integer num = this.timestamp;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.views;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UtilsStats(timestamp=" + this.timestamp + ", views=" + this.views + ")";
    }

    public UtilsStats(@Nullable Integer num, @Nullable Integer num2) {
        this.timestamp = num;
        this.views = num2;
    }

    public /* synthetic */ UtilsStats(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
