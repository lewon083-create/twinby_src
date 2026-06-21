package com.vk.sdk.api.gifts.dto;

import a0.u;
import gf.a;
import io.sentry.ProfilingTraceData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class GiftsLayout {

    @b(ProfilingTraceData.JsonKeys.BUILD_ID)
    @Nullable
    private final String buildId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15171id;

    @b("is_stickers_style")
    @Nullable
    private final Boolean isStickersStyle;

    @b("keywords")
    @Nullable
    private final String keywords;

    @b("stickers_product_id")
    @Nullable
    private final Integer stickersProductId;

    @b("thumb_256")
    @Nullable
    private final String thumb256;

    @b("thumb_48")
    @Nullable
    private final String thumb48;

    @b("thumb_512")
    @Nullable
    private final String thumb512;

    @b("thumb_96")
    @Nullable
    private final String thumb96;

    public GiftsLayout() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ GiftsLayout copy$default(GiftsLayout giftsLayout, Integer num, String str, String str2, String str3, String str4, Integer num2, Boolean bool, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            num = giftsLayout.f15171id;
        }
        if ((i & 2) != 0) {
            str = giftsLayout.thumb512;
        }
        if ((i & 4) != 0) {
            str2 = giftsLayout.thumb256;
        }
        if ((i & 8) != 0) {
            str3 = giftsLayout.thumb48;
        }
        if ((i & 16) != 0) {
            str4 = giftsLayout.thumb96;
        }
        if ((i & 32) != 0) {
            num2 = giftsLayout.stickersProductId;
        }
        if ((i & 64) != 0) {
            bool = giftsLayout.isStickersStyle;
        }
        if ((i & 128) != 0) {
            str5 = giftsLayout.buildId;
        }
        if ((i & 256) != 0) {
            str6 = giftsLayout.keywords;
        }
        String str7 = str5;
        String str8 = str6;
        Integer num3 = num2;
        Boolean bool2 = bool;
        String str9 = str4;
        String str10 = str2;
        return giftsLayout.copy(num, str, str10, str3, str9, num3, bool2, str7, str8);
    }

    @Nullable
    public final Integer component1() {
        return this.f15171id;
    }

    @Nullable
    public final String component2() {
        return this.thumb512;
    }

    @Nullable
    public final String component3() {
        return this.thumb256;
    }

    @Nullable
    public final String component4() {
        return this.thumb48;
    }

    @Nullable
    public final String component5() {
        return this.thumb96;
    }

    @Nullable
    public final Integer component6() {
        return this.stickersProductId;
    }

    @Nullable
    public final Boolean component7() {
        return this.isStickersStyle;
    }

    @Nullable
    public final String component8() {
        return this.buildId;
    }

    @Nullable
    public final String component9() {
        return this.keywords;
    }

    @NotNull
    public final GiftsLayout copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num2, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6) {
        return new GiftsLayout(num, str, str2, str3, str4, num2, bool, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsLayout)) {
            return false;
        }
        GiftsLayout giftsLayout = (GiftsLayout) obj;
        return Intrinsics.a(this.f15171id, giftsLayout.f15171id) && Intrinsics.a(this.thumb512, giftsLayout.thumb512) && Intrinsics.a(this.thumb256, giftsLayout.thumb256) && Intrinsics.a(this.thumb48, giftsLayout.thumb48) && Intrinsics.a(this.thumb96, giftsLayout.thumb96) && Intrinsics.a(this.stickersProductId, giftsLayout.stickersProductId) && Intrinsics.a(this.isStickersStyle, giftsLayout.isStickersStyle) && Intrinsics.a(this.buildId, giftsLayout.buildId) && Intrinsics.a(this.keywords, giftsLayout.keywords);
    }

    @Nullable
    public final String getBuildId() {
        return this.buildId;
    }

    @Nullable
    public final Integer getId() {
        return this.f15171id;
    }

    @Nullable
    public final String getKeywords() {
        return this.keywords;
    }

    @Nullable
    public final Integer getStickersProductId() {
        return this.stickersProductId;
    }

    @Nullable
    public final String getThumb256() {
        return this.thumb256;
    }

    @Nullable
    public final String getThumb48() {
        return this.thumb48;
    }

    @Nullable
    public final String getThumb512() {
        return this.thumb512;
    }

    @Nullable
    public final String getThumb96() {
        return this.thumb96;
    }

    public int hashCode() {
        Integer num = this.f15171id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.thumb512;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.thumb256;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumb48;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thumb96;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.stickersProductId;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isStickersStyle;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.buildId;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.keywords;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    @Nullable
    public final Boolean isStickersStyle() {
        return this.isStickersStyle;
    }

    @NotNull
    public String toString() {
        Integer num = this.f15171id;
        String str = this.thumb512;
        String str2 = this.thumb256;
        String str3 = this.thumb48;
        String str4 = this.thumb96;
        Integer num2 = this.stickersProductId;
        Boolean bool = this.isStickersStyle;
        String str5 = this.buildId;
        String str6 = this.keywords;
        StringBuilder sb2 = new StringBuilder("GiftsLayout(id=");
        sb2.append(num);
        sb2.append(", thumb512=");
        sb2.append(str);
        sb2.append(", thumb256=");
        o.t(sb2, str2, ", thumb48=", str3, ", thumb96=");
        a.r(num2, str4, ", stickersProductId=", ", isStickersStyle=", sb2);
        sb2.append(bool);
        sb2.append(", buildId=");
        sb2.append(str5);
        sb2.append(", keywords=");
        return u.o(sb2, str6, ")");
    }

    public GiftsLayout(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num2, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6) {
        this.f15171id = num;
        this.thumb512 = str;
        this.thumb256 = str2;
        this.thumb48 = str3;
        this.thumb96 = str4;
        this.stickersProductId = num2;
        this.isStickersStyle = bool;
        this.buildId = str5;
        this.keywords = str6;
    }

    public /* synthetic */ GiftsLayout(Integer num, String str, String str2, String str3, String str4, Integer num2, Boolean bool, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6);
    }
}
