package com.vk.sdk.api.stats.dto;

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
public final class StatsCountry {

    @b("code")
    @Nullable
    private final String code;

    @b("count")
    @Nullable
    private final Integer count;

    @b("name")
    @Nullable
    private final String name;

    @b("value")
    @Nullable
    private final Integer value;

    public StatsCountry() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ StatsCountry copy$default(StatsCountry statsCountry, String str, Integer num, String str2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statsCountry.code;
        }
        if ((i & 2) != 0) {
            num = statsCountry.count;
        }
        if ((i & 4) != 0) {
            str2 = statsCountry.name;
        }
        if ((i & 8) != 0) {
            num2 = statsCountry.value;
        }
        return statsCountry.copy(str, num, str2, num2);
    }

    @Nullable
    public final String component1() {
        return this.code;
    }

    @Nullable
    public final Integer component2() {
        return this.count;
    }

    @Nullable
    public final String component3() {
        return this.name;
    }

    @Nullable
    public final Integer component4() {
        return this.value;
    }

    @NotNull
    public final StatsCountry copy(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2) {
        return new StatsCountry(str, num, str2, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCountry)) {
            return false;
        }
        StatsCountry statsCountry = (StatsCountry) obj;
        return Intrinsics.a(this.code, statsCountry.code) && Intrinsics.a(this.count, statsCountry.count) && Intrinsics.a(this.name, statsCountry.name) && Intrinsics.a(this.value, statsCountry.value);
    }

    @Nullable
    public final String getCode() {
        return this.code;
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
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.count;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.value;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StatsCountry(code=" + this.code + ", count=" + this.count + ", name=" + this.name + ", value=" + this.value + ")";
    }

    public StatsCountry(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2) {
        this.code = str;
        this.count = num;
        this.name = str2;
        this.value = num2;
    }

    public /* synthetic */ StatsCountry(String str, Integer num, String str2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2);
    }
}
