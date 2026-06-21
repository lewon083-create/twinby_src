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
public final class UtilsStatsCity {

    @b("city_id")
    @Nullable
    private final Integer cityId;

    @b("views")
    @Nullable
    private final Integer views;

    public UtilsStatsCity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UtilsStatsCity copy$default(UtilsStatsCity utilsStatsCity, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = utilsStatsCity.cityId;
        }
        if ((i & 2) != 0) {
            num2 = utilsStatsCity.views;
        }
        return utilsStatsCity.copy(num, num2);
    }

    @Nullable
    public final Integer component1() {
        return this.cityId;
    }

    @Nullable
    public final Integer component2() {
        return this.views;
    }

    @NotNull
    public final UtilsStatsCity copy(@Nullable Integer num, @Nullable Integer num2) {
        return new UtilsStatsCity(num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsStatsCity)) {
            return false;
        }
        UtilsStatsCity utilsStatsCity = (UtilsStatsCity) obj;
        return Intrinsics.a(this.cityId, utilsStatsCity.cityId) && Intrinsics.a(this.views, utilsStatsCity.views);
    }

    @Nullable
    public final Integer getCityId() {
        return this.cityId;
    }

    @Nullable
    public final Integer getViews() {
        return this.views;
    }

    public int hashCode() {
        Integer num = this.cityId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.views;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UtilsStatsCity(cityId=" + this.cityId + ", views=" + this.views + ")";
    }

    public UtilsStatsCity(@Nullable Integer num, @Nullable Integer num2) {
        this.cityId = num;
        this.views = num2;
    }

    public /* synthetic */ UtilsStatsCity(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
