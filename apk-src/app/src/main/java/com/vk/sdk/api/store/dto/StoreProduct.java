package com.vk.sdk.api.store.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseImage;
import com.vk.sdk.api.base.dto.BaseStickerNew;
import gf.a;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class StoreProduct {

    @b("active")
    @Nullable
    private final BaseBoolInt active;

    @b("has_animation")
    @Nullable
    private final Boolean hasAnimation;

    @b("icon")
    @Nullable
    private final List<BaseImage> icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15233id;

    @b("is_new")
    @Nullable
    private final Boolean isNew;

    @b("payment_region")
    @Nullable
    private final String paymentRegion;

    @b("previews")
    @Nullable
    private final List<BaseImage> previews;

    @b("promoted")
    @Nullable
    private final BaseBoolInt promoted;

    @b("purchase_date")
    @Nullable
    private final Integer purchaseDate;

    @b("purchased")
    @Nullable
    private final BaseBoolInt purchased;

    @b("stickers")
    @Nullable
    private final List<BaseStickerNew> stickers;

    @b("style_sticker_ids")
    @Nullable
    private final List<Integer> styleStickerIds;

    @b("subtitle")
    @Nullable
    private final String subtitle;

    @b("title")
    @Nullable
    private final String title;

    @b("type")
    @NotNull
    private final Type type;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        STICKERS("stickers"),
        VOTES("votes"),
        SUBSCRIPRIONS("subscriprions");


        @NotNull
        private final String value;

        Type(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public StoreProduct(int i, @NotNull Type type, @Nullable Boolean bool, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable Integer num, @Nullable String str, @Nullable List<BaseStickerNew> list, @Nullable List<Integer> list2, @Nullable List<BaseImage> list3, @Nullable List<BaseImage> list4, @Nullable Boolean bool2, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f15233id = i;
        this.type = type;
        this.isNew = bool;
        this.purchased = baseBoolInt;
        this.active = baseBoolInt2;
        this.promoted = baseBoolInt3;
        this.purchaseDate = num;
        this.title = str;
        this.stickers = list;
        this.styleStickerIds = list2;
        this.icon = list3;
        this.previews = list4;
        this.hasAnimation = bool2;
        this.subtitle = str2;
        this.paymentRegion = str3;
    }

    public final int component1() {
        return this.f15233id;
    }

    @Nullable
    public final List<Integer> component10() {
        return this.styleStickerIds;
    }

    @Nullable
    public final List<BaseImage> component11() {
        return this.icon;
    }

    @Nullable
    public final List<BaseImage> component12() {
        return this.previews;
    }

    @Nullable
    public final Boolean component13() {
        return this.hasAnimation;
    }

    @Nullable
    public final String component14() {
        return this.subtitle;
    }

    @Nullable
    public final String component15() {
        return this.paymentRegion;
    }

    @NotNull
    public final Type component2() {
        return this.type;
    }

    @Nullable
    public final Boolean component3() {
        return this.isNew;
    }

    @Nullable
    public final BaseBoolInt component4() {
        return this.purchased;
    }

    @Nullable
    public final BaseBoolInt component5() {
        return this.active;
    }

    @Nullable
    public final BaseBoolInt component6() {
        return this.promoted;
    }

    @Nullable
    public final Integer component7() {
        return this.purchaseDate;
    }

    @Nullable
    public final String component8() {
        return this.title;
    }

    @Nullable
    public final List<BaseStickerNew> component9() {
        return this.stickers;
    }

    @NotNull
    public final StoreProduct copy(int i, @NotNull Type type, @Nullable Boolean bool, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable Integer num, @Nullable String str, @Nullable List<BaseStickerNew> list, @Nullable List<Integer> list2, @Nullable List<BaseImage> list3, @Nullable List<BaseImage> list4, @Nullable Boolean bool2, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new StoreProduct(i, type, bool, baseBoolInt, baseBoolInt2, baseBoolInt3, num, str, list, list2, list3, list4, bool2, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreProduct)) {
            return false;
        }
        StoreProduct storeProduct = (StoreProduct) obj;
        return this.f15233id == storeProduct.f15233id && this.type == storeProduct.type && Intrinsics.a(this.isNew, storeProduct.isNew) && this.purchased == storeProduct.purchased && this.active == storeProduct.active && this.promoted == storeProduct.promoted && Intrinsics.a(this.purchaseDate, storeProduct.purchaseDate) && Intrinsics.a(this.title, storeProduct.title) && Intrinsics.a(this.stickers, storeProduct.stickers) && Intrinsics.a(this.styleStickerIds, storeProduct.styleStickerIds) && Intrinsics.a(this.icon, storeProduct.icon) && Intrinsics.a(this.previews, storeProduct.previews) && Intrinsics.a(this.hasAnimation, storeProduct.hasAnimation) && Intrinsics.a(this.subtitle, storeProduct.subtitle) && Intrinsics.a(this.paymentRegion, storeProduct.paymentRegion);
    }

    @Nullable
    public final BaseBoolInt getActive() {
        return this.active;
    }

    @Nullable
    public final Boolean getHasAnimation() {
        return this.hasAnimation;
    }

    @Nullable
    public final List<BaseImage> getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.f15233id;
    }

    @Nullable
    public final String getPaymentRegion() {
        return this.paymentRegion;
    }

    @Nullable
    public final List<BaseImage> getPreviews() {
        return this.previews;
    }

    @Nullable
    public final BaseBoolInt getPromoted() {
        return this.promoted;
    }

    @Nullable
    public final Integer getPurchaseDate() {
        return this.purchaseDate;
    }

    @Nullable
    public final BaseBoolInt getPurchased() {
        return this.purchased;
    }

    @Nullable
    public final List<BaseStickerNew> getStickers() {
        return this.stickers;
    }

    @Nullable
    public final List<Integer> getStyleStickerIds() {
        return this.styleStickerIds;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (Integer.hashCode(this.f15233id) * 31)) * 31;
        Boolean bool = this.isNew;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.purchased;
        int iHashCode3 = (iHashCode2 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.active;
        int iHashCode4 = (iHashCode3 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.promoted;
        int iHashCode5 = (iHashCode4 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        Integer num = this.purchaseDate;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.title;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseStickerNew> list = this.stickers;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.styleStickerIds;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BaseImage> list3 = this.icon;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BaseImage> list4 = this.previews;
        int iHashCode11 = (iHashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool2 = this.hasAnimation;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentRegion;
        return iHashCode13 + (str3 != null ? str3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isNew() {
        return this.isNew;
    }

    @NotNull
    public String toString() {
        int i = this.f15233id;
        Type type = this.type;
        Boolean bool = this.isNew;
        BaseBoolInt baseBoolInt = this.purchased;
        BaseBoolInt baseBoolInt2 = this.active;
        BaseBoolInt baseBoolInt3 = this.promoted;
        Integer num = this.purchaseDate;
        String str = this.title;
        List<BaseStickerNew> list = this.stickers;
        List<Integer> list2 = this.styleStickerIds;
        List<BaseImage> list3 = this.icon;
        List<BaseImage> list4 = this.previews;
        Boolean bool2 = this.hasAnimation;
        String str2 = this.subtitle;
        String str3 = this.paymentRegion;
        StringBuilder sb2 = new StringBuilder("StoreProduct(id=");
        sb2.append(i);
        sb2.append(", type=");
        sb2.append(type);
        sb2.append(", isNew=");
        sb2.append(bool);
        sb2.append(", purchased=");
        sb2.append(baseBoolInt);
        sb2.append(", active=");
        a.s(sb2, baseBoolInt2, ", promoted=", baseBoolInt3, ", purchaseDate=");
        pe.a.r(num, ", title=", str, ", stickers=", sb2);
        a.u(sb2, list, ", styleStickerIds=", list2, ", icon=");
        a.u(sb2, list3, ", previews=", list4, ", hasAnimation=");
        sb2.append(bool2);
        sb2.append(", subtitle=");
        sb2.append(str2);
        sb2.append(", paymentRegion=");
        return u.o(sb2, str3, ")");
    }

    public /* synthetic */ StoreProduct(int i, Type type, Boolean bool, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, Integer num, String str, List list, List list2, List list3, List list4, Boolean bool2, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, type, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : baseBoolInt, (i10 & 16) != 0 ? null : baseBoolInt2, (i10 & 32) != 0 ? null : baseBoolInt3, (i10 & 64) != 0 ? null : num, (i10 & 128) != 0 ? null : str, (i10 & 256) != 0 ? null : list, (i10 & 512) != 0 ? null : list2, (i10 & 1024) != 0 ? null : list3, (i10 & 2048) != 0 ? null : list4, (i10 & 4096) != 0 ? null : bool2, (i10 & 8192) != 0 ? null : str2, (i10 & 16384) != 0 ? null : str3);
    }
}
