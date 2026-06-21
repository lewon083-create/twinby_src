package com.vk.sdk.api.aliexpress.dto;

import com.vk.sdk.api.base.dto.BaseLinkButton;
import com.vk.sdk.api.market.dto.MarketPrice;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class AliexpressCarouselItem {

    @b("action_button")
    @Nullable
    private final BaseLinkButton actionButton;

    @b("delivery_date_text")
    @Nullable
    private final String deliveryDateText;

    @b("details_button")
    @NotNull
    private final BaseLinkButton detailsButton;

    @b("discount_text")
    @Nullable
    private final String discountText;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final String f15126id;

    @b("is_favorite")
    private final boolean isFavorite;

    @b("label")
    @Nullable
    private final String label;

    @b("orders_count")
    @Nullable
    private final Integer ordersCount;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("price")
    @Nullable
    private final MarketPrice price;

    @b("rating")
    @Nullable
    private final Float rating;

    @b("title")
    @NotNull
    private final String title;

    @b("url")
    @NotNull
    private final String url;

    public AliexpressCarouselItem(@NotNull String id2, @NotNull String title, boolean z5, @NotNull String url, @NotNull BaseLinkButton detailsButton, @Nullable MarketPrice marketPrice, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Float f10, @Nullable Integer num, @Nullable BaseLinkButton baseLinkButton, @Nullable PhotosPhoto photosPhoto) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(detailsButton, "detailsButton");
        this.f15126id = id2;
        this.title = title;
        this.isFavorite = z5;
        this.url = url;
        this.detailsButton = detailsButton;
        this.price = marketPrice;
        this.discountText = str;
        this.deliveryDateText = str2;
        this.label = str3;
        this.rating = f10;
        this.ordersCount = num;
        this.actionButton = baseLinkButton;
        this.photo = photosPhoto;
    }

    public static /* synthetic */ AliexpressCarouselItem copy$default(AliexpressCarouselItem aliexpressCarouselItem, String str, String str2, boolean z5, String str3, BaseLinkButton baseLinkButton, MarketPrice marketPrice, String str4, String str5, String str6, Float f10, Integer num, BaseLinkButton baseLinkButton2, PhotosPhoto photosPhoto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aliexpressCarouselItem.f15126id;
        }
        return aliexpressCarouselItem.copy(str, (i & 2) != 0 ? aliexpressCarouselItem.title : str2, (i & 4) != 0 ? aliexpressCarouselItem.isFavorite : z5, (i & 8) != 0 ? aliexpressCarouselItem.url : str3, (i & 16) != 0 ? aliexpressCarouselItem.detailsButton : baseLinkButton, (i & 32) != 0 ? aliexpressCarouselItem.price : marketPrice, (i & 64) != 0 ? aliexpressCarouselItem.discountText : str4, (i & 128) != 0 ? aliexpressCarouselItem.deliveryDateText : str5, (i & 256) != 0 ? aliexpressCarouselItem.label : str6, (i & 512) != 0 ? aliexpressCarouselItem.rating : f10, (i & 1024) != 0 ? aliexpressCarouselItem.ordersCount : num, (i & 2048) != 0 ? aliexpressCarouselItem.actionButton : baseLinkButton2, (i & 4096) != 0 ? aliexpressCarouselItem.photo : photosPhoto);
    }

    @NotNull
    public final String component1() {
        return this.f15126id;
    }

    @Nullable
    public final Float component10() {
        return this.rating;
    }

    @Nullable
    public final Integer component11() {
        return this.ordersCount;
    }

    @Nullable
    public final BaseLinkButton component12() {
        return this.actionButton;
    }

    @Nullable
    public final PhotosPhoto component13() {
        return this.photo;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    public final boolean component3() {
        return this.isFavorite;
    }

    @NotNull
    public final String component4() {
        return this.url;
    }

    @NotNull
    public final BaseLinkButton component5() {
        return this.detailsButton;
    }

    @Nullable
    public final MarketPrice component6() {
        return this.price;
    }

    @Nullable
    public final String component7() {
        return this.discountText;
    }

    @Nullable
    public final String component8() {
        return this.deliveryDateText;
    }

    @Nullable
    public final String component9() {
        return this.label;
    }

    @NotNull
    public final AliexpressCarouselItem copy(@NotNull String id2, @NotNull String title, boolean z5, @NotNull String url, @NotNull BaseLinkButton detailsButton, @Nullable MarketPrice marketPrice, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Float f10, @Nullable Integer num, @Nullable BaseLinkButton baseLinkButton, @Nullable PhotosPhoto photosPhoto) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(detailsButton, "detailsButton");
        return new AliexpressCarouselItem(id2, title, z5, url, detailsButton, marketPrice, str, str2, str3, f10, num, baseLinkButton, photosPhoto);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliexpressCarouselItem)) {
            return false;
        }
        AliexpressCarouselItem aliexpressCarouselItem = (AliexpressCarouselItem) obj;
        return Intrinsics.a(this.f15126id, aliexpressCarouselItem.f15126id) && Intrinsics.a(this.title, aliexpressCarouselItem.title) && this.isFavorite == aliexpressCarouselItem.isFavorite && Intrinsics.a(this.url, aliexpressCarouselItem.url) && Intrinsics.a(this.detailsButton, aliexpressCarouselItem.detailsButton) && Intrinsics.a(this.price, aliexpressCarouselItem.price) && Intrinsics.a(this.discountText, aliexpressCarouselItem.discountText) && Intrinsics.a(this.deliveryDateText, aliexpressCarouselItem.deliveryDateText) && Intrinsics.a(this.label, aliexpressCarouselItem.label) && Intrinsics.a(this.rating, aliexpressCarouselItem.rating) && Intrinsics.a(this.ordersCount, aliexpressCarouselItem.ordersCount) && Intrinsics.a(this.actionButton, aliexpressCarouselItem.actionButton) && Intrinsics.a(this.photo, aliexpressCarouselItem.photo);
    }

    @Nullable
    public final BaseLinkButton getActionButton() {
        return this.actionButton;
    }

    @Nullable
    public final String getDeliveryDateText() {
        return this.deliveryDateText;
    }

    @NotNull
    public final BaseLinkButton getDetailsButton() {
        return this.detailsButton;
    }

    @Nullable
    public final String getDiscountText() {
        return this.discountText;
    }

    @NotNull
    public final String getId() {
        return this.f15126id;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final Integer getOrdersCount() {
        return this.ordersCount;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final MarketPrice getPrice() {
        return this.price;
    }

    @Nullable
    public final Float getRating() {
        return this.rating;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    public int hashCode() {
        int iE = a.e(this.f15126id.hashCode() * 31, 31, this.title);
        boolean z5 = this.isFavorite;
        ?? r22 = z5;
        if (z5) {
            r22 = 1;
        }
        int iHashCode = (this.detailsButton.hashCode() + a.e((iE + r22) * 31, 31, this.url)) * 31;
        MarketPrice marketPrice = this.price;
        int iHashCode2 = (iHashCode + (marketPrice == null ? 0 : marketPrice.hashCode())) * 31;
        String str = this.discountText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deliveryDateText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.rating;
        int iHashCode6 = (iHashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Integer num = this.ordersCount;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        BaseLinkButton baseLinkButton = this.actionButton;
        int iHashCode8 = (iHashCode7 + (baseLinkButton == null ? 0 : baseLinkButton.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photo;
        return iHashCode8 + (photosPhoto != null ? photosPhoto.hashCode() : 0);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        String str = this.f15126id;
        String str2 = this.title;
        boolean z5 = this.isFavorite;
        String str3 = this.url;
        BaseLinkButton baseLinkButton = this.detailsButton;
        MarketPrice marketPrice = this.price;
        String str4 = this.discountText;
        String str5 = this.deliveryDateText;
        String str6 = this.label;
        Float f10 = this.rating;
        Integer num = this.ordersCount;
        BaseLinkButton baseLinkButton2 = this.actionButton;
        PhotosPhoto photosPhoto = this.photo;
        StringBuilder sbJ = z.j("AliexpressCarouselItem(id=", str, ", title=", str2, ", isFavorite=");
        sbJ.append(z5);
        sbJ.append(", url=");
        sbJ.append(str3);
        sbJ.append(", detailsButton=");
        sbJ.append(baseLinkButton);
        sbJ.append(", price=");
        sbJ.append(marketPrice);
        sbJ.append(", discountText=");
        o.t(sbJ, str4, ", deliveryDateText=", str5, ", label=");
        sbJ.append(str6);
        sbJ.append(", rating=");
        sbJ.append(f10);
        sbJ.append(", ordersCount=");
        sbJ.append(num);
        sbJ.append(", actionButton=");
        sbJ.append(baseLinkButton2);
        sbJ.append(", photo=");
        sbJ.append(photosPhoto);
        sbJ.append(")");
        return sbJ.toString();
    }

    public /* synthetic */ AliexpressCarouselItem(String str, String str2, boolean z5, String str3, BaseLinkButton baseLinkButton, MarketPrice marketPrice, String str4, String str5, String str6, Float f10, Integer num, BaseLinkButton baseLinkButton2, PhotosPhoto photosPhoto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z5, str3, baseLinkButton, (i & 32) != 0 ? null : marketPrice, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : f10, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : baseLinkButton2, (i & 4096) != 0 ? null : photosPhoto);
    }
}
