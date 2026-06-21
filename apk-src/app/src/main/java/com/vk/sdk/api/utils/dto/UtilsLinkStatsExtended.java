package com.vk.sdk.api.utils.dto;

import java.util.List;
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
public final class UtilsLinkStatsExtended {

    @b("key")
    @Nullable
    private final String key;

    @b("stats")
    @Nullable
    private final List<UtilsStatsExtended> stats;

    public UtilsLinkStatsExtended() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UtilsLinkStatsExtended copy$default(UtilsLinkStatsExtended utilsLinkStatsExtended, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = utilsLinkStatsExtended.key;
        }
        if ((i & 2) != 0) {
            list = utilsLinkStatsExtended.stats;
        }
        return utilsLinkStatsExtended.copy(str, list);
    }

    @Nullable
    public final String component1() {
        return this.key;
    }

    @Nullable
    public final List<UtilsStatsExtended> component2() {
        return this.stats;
    }

    @NotNull
    public final UtilsLinkStatsExtended copy(@Nullable String str, @Nullable List<UtilsStatsExtended> list) {
        return new UtilsLinkStatsExtended(str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsLinkStatsExtended)) {
            return false;
        }
        UtilsLinkStatsExtended utilsLinkStatsExtended = (UtilsLinkStatsExtended) obj;
        return Intrinsics.a(this.key, utilsLinkStatsExtended.key) && Intrinsics.a(this.stats, utilsLinkStatsExtended.stats);
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final List<UtilsStatsExtended> getStats() {
        return this.stats;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UtilsStatsExtended> list = this.stats;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UtilsLinkStatsExtended(key=" + this.key + ", stats=" + this.stats + ")";
    }

    public UtilsLinkStatsExtended(@Nullable String str, @Nullable List<UtilsStatsExtended> list) {
        this.key = str;
        this.stats = list;
    }

    public /* synthetic */ UtilsLinkStatsExtended(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
