package com.vk.sdk.api.utils.dto;

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
public final class UtilsStatsSexAge {

    @b("age_range")
    @Nullable
    private final String ageRange;

    @b("female")
    @Nullable
    private final Integer female;

    @b("male")
    @Nullable
    private final Integer male;

    public UtilsStatsSexAge() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UtilsStatsSexAge copy$default(UtilsStatsSexAge utilsStatsSexAge, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = utilsStatsSexAge.ageRange;
        }
        if ((i & 2) != 0) {
            num = utilsStatsSexAge.female;
        }
        if ((i & 4) != 0) {
            num2 = utilsStatsSexAge.male;
        }
        return utilsStatsSexAge.copy(str, num, num2);
    }

    @Nullable
    public final String component1() {
        return this.ageRange;
    }

    @Nullable
    public final Integer component2() {
        return this.female;
    }

    @Nullable
    public final Integer component3() {
        return this.male;
    }

    @NotNull
    public final UtilsStatsSexAge copy(@Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        return new UtilsStatsSexAge(str, num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsStatsSexAge)) {
            return false;
        }
        UtilsStatsSexAge utilsStatsSexAge = (UtilsStatsSexAge) obj;
        return Intrinsics.a(this.ageRange, utilsStatsSexAge.ageRange) && Intrinsics.a(this.female, utilsStatsSexAge.female) && Intrinsics.a(this.male, utilsStatsSexAge.male);
    }

    @Nullable
    public final String getAgeRange() {
        return this.ageRange;
    }

    @Nullable
    public final Integer getFemale() {
        return this.female;
    }

    @Nullable
    public final Integer getMale() {
        return this.male;
    }

    public int hashCode() {
        String str = this.ageRange;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.female;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.male;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.ageRange;
        Integer num = this.female;
        Integer num2 = this.male;
        StringBuilder sb2 = new StringBuilder("UtilsStatsSexAge(ageRange=");
        sb2.append(str);
        sb2.append(", female=");
        sb2.append(num);
        sb2.append(", male=");
        return u.m(sb2, num2, ")");
    }

    public UtilsStatsSexAge(@Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        this.ageRange = str;
        this.female = num;
        this.male = num2;
    }

    public /* synthetic */ UtilsStatsSexAge(String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
