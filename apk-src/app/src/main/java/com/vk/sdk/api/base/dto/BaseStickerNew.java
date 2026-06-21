package com.vk.sdk.api.base.dto;

import com.google.android.gms.internal.ads.om1;
import gf.a;
import io.sentry.protocol.DebugMeta;
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
public final class BaseStickerNew {

    @b("animation_url")
    @Nullable
    private final String animationUrl;

    @b("animations")
    @Nullable
    private final List<BaseStickerAnimation> animations;

    @b(DebugMeta.JsonKeys.IMAGES)
    @Nullable
    private final List<BaseImage> images;

    @b("images_with_background")
    @Nullable
    private final List<BaseImage> imagesWithBackground;

    @b("is_allowed")
    @Nullable
    private final Boolean isAllowed;

    @b("product_id")
    @Nullable
    private final Integer productId;

    @b("sticker_id")
    @Nullable
    private final Integer stickerId;

    public BaseStickerNew() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseStickerNew copy$default(BaseStickerNew baseStickerNew, Integer num, Integer num2, List list, List list2, String str, List list3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = baseStickerNew.stickerId;
        }
        if ((i & 2) != 0) {
            num2 = baseStickerNew.productId;
        }
        if ((i & 4) != 0) {
            list = baseStickerNew.images;
        }
        if ((i & 8) != 0) {
            list2 = baseStickerNew.imagesWithBackground;
        }
        if ((i & 16) != 0) {
            str = baseStickerNew.animationUrl;
        }
        if ((i & 32) != 0) {
            list3 = baseStickerNew.animations;
        }
        if ((i & 64) != 0) {
            bool = baseStickerNew.isAllowed;
        }
        List list4 = list3;
        Boolean bool2 = bool;
        String str2 = str;
        List list5 = list;
        return baseStickerNew.copy(num, num2, list5, list2, str2, list4, bool2);
    }

    @Nullable
    public final Integer component1() {
        return this.stickerId;
    }

    @Nullable
    public final Integer component2() {
        return this.productId;
    }

    @Nullable
    public final List<BaseImage> component3() {
        return this.images;
    }

    @Nullable
    public final List<BaseImage> component4() {
        return this.imagesWithBackground;
    }

    @Nullable
    public final String component5() {
        return this.animationUrl;
    }

    @Nullable
    public final List<BaseStickerAnimation> component6() {
        return this.animations;
    }

    @Nullable
    public final Boolean component7() {
        return this.isAllowed;
    }

    @NotNull
    public final BaseStickerNew copy(@Nullable Integer num, @Nullable Integer num2, @Nullable List<BaseImage> list, @Nullable List<BaseImage> list2, @Nullable String str, @Nullable List<BaseStickerAnimation> list3, @Nullable Boolean bool) {
        return new BaseStickerNew(num, num2, list, list2, str, list3, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseStickerNew)) {
            return false;
        }
        BaseStickerNew baseStickerNew = (BaseStickerNew) obj;
        return Intrinsics.a(this.stickerId, baseStickerNew.stickerId) && Intrinsics.a(this.productId, baseStickerNew.productId) && Intrinsics.a(this.images, baseStickerNew.images) && Intrinsics.a(this.imagesWithBackground, baseStickerNew.imagesWithBackground) && Intrinsics.a(this.animationUrl, baseStickerNew.animationUrl) && Intrinsics.a(this.animations, baseStickerNew.animations) && Intrinsics.a(this.isAllowed, baseStickerNew.isAllowed);
    }

    @Nullable
    public final String getAnimationUrl() {
        return this.animationUrl;
    }

    @Nullable
    public final List<BaseStickerAnimation> getAnimations() {
        return this.animations;
    }

    @Nullable
    public final List<BaseImage> getImages() {
        return this.images;
    }

    @Nullable
    public final List<BaseImage> getImagesWithBackground() {
        return this.imagesWithBackground;
    }

    @Nullable
    public final Integer getProductId() {
        return this.productId;
    }

    @Nullable
    public final Integer getStickerId() {
        return this.stickerId;
    }

    public int hashCode() {
        Integer num = this.stickerId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.productId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<BaseImage> list = this.images;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImage> list2 = this.imagesWithBackground;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.animationUrl;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseStickerAnimation> list3 = this.animations;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.isAllowed;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAllowed() {
        return this.isAllowed;
    }

    @NotNull
    public String toString() {
        Integer num = this.stickerId;
        Integer num2 = this.productId;
        List<BaseImage> list = this.images;
        List<BaseImage> list2 = this.imagesWithBackground;
        String str = this.animationUrl;
        List<BaseStickerAnimation> list3 = this.animations;
        Boolean bool = this.isAllowed;
        StringBuilder sbO = om1.o("BaseStickerNew(stickerId=", ", productId=", num, num2, ", images=");
        a.u(sbO, list, ", imagesWithBackground=", list2, ", animationUrl=");
        sbO.append(str);
        sbO.append(", animations=");
        sbO.append(list3);
        sbO.append(", isAllowed=");
        sbO.append(bool);
        sbO.append(")");
        return sbO.toString();
    }

    public BaseStickerNew(@Nullable Integer num, @Nullable Integer num2, @Nullable List<BaseImage> list, @Nullable List<BaseImage> list2, @Nullable String str, @Nullable List<BaseStickerAnimation> list3, @Nullable Boolean bool) {
        this.stickerId = num;
        this.productId = num2;
        this.images = list;
        this.imagesWithBackground = list2;
        this.animationUrl = str;
        this.animations = list3;
        this.isAllowed = bool;
    }

    public /* synthetic */ BaseStickerNew(Integer num, Integer num2, List list, List list2, String str, List list3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : bool);
    }
}
