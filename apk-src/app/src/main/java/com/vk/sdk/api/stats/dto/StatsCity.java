package com.vk.sdk.api.stats.dto;

import a0.u;
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
public final class StatsCity {

    @b("count")
    @Nullable
    private final Integer count;

    @b("name")
    @Nullable
    private final String name;

    @b("value")
    @Nullable
    private final Integer value;

    public StatsCity() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ StatsCity copy$default(StatsCity statsCity, Integer num, String str, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = statsCity.count;
        }
        if ((i & 2) != 0) {
            str = statsCity.name;
        }
        if ((i & 4) != 0) {
            num2 = statsCity.value;
        }
        return statsCity.copy(num, str, num2);
    }

    @Nullable
    public final Integer component1() {
        return this.count;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final Integer component3() {
        return this.value;
    }

    @NotNull
    public final StatsCity copy(@Nullable Integer num, @Nullable String str, @Nullable Integer num2) {
        return new StatsCity(num, str, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCity)) {
            return false;
        }
        StatsCity statsCity = (StatsCity) obj;
        return Intrinsics.a(this.count, statsCity.count) && Intrinsics.a(this.name, statsCity.name) && Intrinsics.a(this.value, statsCity.value);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.value;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.count;
        String str = this.name;
        Integer num2 = this.value;
        StringBuilder sb2 = new StringBuilder("StatsCity(count=");
        sb2.append(num);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", value=");
        return u.m(sb2, num2, ")");
    }

    public StatsCity(@Nullable Integer num, @Nullable String str, @Nullable Integer num2) {
        this.count = num;
        this.name = str;
        this.value = num2;
    }

    public /* synthetic */ StatsCity(Integer num, String str, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2);
    }
}
