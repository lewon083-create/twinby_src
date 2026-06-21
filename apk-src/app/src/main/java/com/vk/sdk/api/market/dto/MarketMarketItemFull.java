package com.vk.sdk.api.market.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseLikes;
import com.vk.sdk.api.base.dto.BaseLink;
import com.vk.sdk.api.base.dto.BaseRepostsInfo;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import gf.a;
import java.util.List;
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
public final class MarketMarketItemFull {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("ad_id")
    @Nullable
    private final Integer adId;

    @b("albums_ids")
    @Nullable
    private final List<Integer> albumsIds;

    @b("availability")
    @NotNull
    private final MarketMarketItemAvailability availability;

    @b("button_title")
    @Nullable
    private final String buttonTitle;

    @b("can_comment")
    @Nullable
    private final BaseBoolInt canComment;

    @b("can_repost")
    @Nullable
    private final BaseBoolInt canRepost;

    @b("cancel_info")
    @Nullable
    private final BaseLink cancelInfo;

    @b("category")
    @NotNull
    private final MarketMarketCategory category;

    @b("date")
    @Nullable
    private final Integer date;

    @b("description")
    @NotNull
    private final String description;

    @b("external_id")
    @Nullable
    private final String externalId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15189id;

    @b("is_favorite")
    @Nullable
    private final Boolean isFavorite;

    @b("is_main_variant")
    @Nullable
    private final Boolean isMainVariant;

    @b("likes")
    @Nullable
    private final BaseLikes likes;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("photos")
    @Nullable
    private final List<PhotosPhoto> photos;

    @b("price")
    @NotNull
    private final MarketPrice price;

    @b("reposts")
    @Nullable
    private final BaseRepostsInfo reposts;

    @b("sku")
    @Nullable
    private final String sku;

    @b("thumb_photo")
    @Nullable
    private final String thumbPhoto;

    @b("title")
    @NotNull
    private final String title;

    @b("url")
    @Nullable
    private final String url;

    @b("user_agreement_info")
    @Nullable
    private final String userAgreementInfo;

    @b("variants_grouping_id")
    @Nullable
    private final Integer variantsGroupingId;

    @b("views_count")
    @Nullable
    private final Integer viewsCount;

    @b("wishlist_item_id")
    @Nullable
    private final Integer wishlistItemId;

    public MarketMarketItemFull(@NotNull MarketMarketItemAvailability availability, @NotNull MarketMarketCategory category, @NotNull String description, int i, @NotNull UserId ownerId, @NotNull MarketPrice price, @NotNull String title, @Nullable List<Integer> list, @Nullable List<PhotosPhoto> list2, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseLikes baseLikes, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable Integer num, @Nullable Integer num2, @Nullable BaseLink baseLink, @Nullable String str, @Nullable Integer num3, @Nullable String str2, @Nullable String str3, @Nullable Integer num4, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable Integer num5, @Nullable Boolean bool2, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(availability, "availability");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        this.availability = availability;
        this.category = category;
        this.description = description;
        this.f15189id = i;
        this.ownerId = ownerId;
        this.price = price;
        this.title = title;
        this.albumsIds = list;
        this.photos = list2;
        this.canComment = baseBoolInt;
        this.canRepost = baseBoolInt2;
        this.likes = baseLikes;
        this.reposts = baseRepostsInfo;
        this.viewsCount = num;
        this.wishlistItemId = num2;
        this.cancelInfo = baseLink;
        this.userAgreementInfo = str;
        this.adId = num3;
        this.accessKey = str2;
        this.buttonTitle = str3;
        this.date = num4;
        this.externalId = str4;
        this.isFavorite = bool;
        this.thumbPhoto = str5;
        this.url = str6;
        this.variantsGroupingId = num5;
        this.isMainVariant = bool2;
        this.sku = str7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketMarketItemFull copy$default(MarketMarketItemFull marketMarketItemFull, MarketMarketItemAvailability marketMarketItemAvailability, MarketMarketCategory marketMarketCategory, String str, int i, UserId userId, MarketPrice marketPrice, String str2, List list, List list2, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseLikes baseLikes, BaseRepostsInfo baseRepostsInfo, Integer num, Integer num2, BaseLink baseLink, String str3, Integer num3, String str4, String str5, Integer num4, String str6, Boolean bool, String str7, String str8, Integer num5, Boolean bool2, String str9, int i10, Object obj) {
        String str10;
        Boolean bool3;
        MarketMarketItemAvailability marketMarketItemAvailability2 = (i10 & 1) != 0 ? marketMarketItemFull.availability : marketMarketItemAvailability;
        MarketMarketCategory marketMarketCategory2 = (i10 & 2) != 0 ? marketMarketItemFull.category : marketMarketCategory;
        String str11 = (i10 & 4) != 0 ? marketMarketItemFull.description : str;
        int i11 = (i10 & 8) != 0 ? marketMarketItemFull.f15189id : i;
        UserId userId2 = (i10 & 16) != 0 ? marketMarketItemFull.ownerId : userId;
        MarketPrice marketPrice2 = (i10 & 32) != 0 ? marketMarketItemFull.price : marketPrice;
        String str12 = (i10 & 64) != 0 ? marketMarketItemFull.title : str2;
        List list3 = (i10 & 128) != 0 ? marketMarketItemFull.albumsIds : list;
        List list4 = (i10 & 256) != 0 ? marketMarketItemFull.photos : list2;
        BaseBoolInt baseBoolInt3 = (i10 & 512) != 0 ? marketMarketItemFull.canComment : baseBoolInt;
        BaseBoolInt baseBoolInt4 = (i10 & 1024) != 0 ? marketMarketItemFull.canRepost : baseBoolInt2;
        BaseLikes baseLikes2 = (i10 & 2048) != 0 ? marketMarketItemFull.likes : baseLikes;
        BaseRepostsInfo baseRepostsInfo2 = (i10 & 4096) != 0 ? marketMarketItemFull.reposts : baseRepostsInfo;
        Integer num6 = (i10 & 8192) != 0 ? marketMarketItemFull.viewsCount : num;
        MarketMarketItemAvailability marketMarketItemAvailability3 = marketMarketItemAvailability2;
        Integer num7 = (i10 & 16384) != 0 ? marketMarketItemFull.wishlistItemId : num2;
        BaseLink baseLink2 = (i10 & 32768) != 0 ? marketMarketItemFull.cancelInfo : baseLink;
        String str13 = (i10 & 65536) != 0 ? marketMarketItemFull.userAgreementInfo : str3;
        Integer num8 = (i10 & 131072) != 0 ? marketMarketItemFull.adId : num3;
        String str14 = (i10 & 262144) != 0 ? marketMarketItemFull.accessKey : str4;
        String str15 = (i10 & 524288) != 0 ? marketMarketItemFull.buttonTitle : str5;
        Integer num9 = (i10 & 1048576) != 0 ? marketMarketItemFull.date : num4;
        String str16 = (i10 & 2097152) != 0 ? marketMarketItemFull.externalId : str6;
        Boolean bool4 = (i10 & 4194304) != 0 ? marketMarketItemFull.isFavorite : bool;
        String str17 = (i10 & 8388608) != 0 ? marketMarketItemFull.thumbPhoto : str7;
        String str18 = (i10 & 16777216) != 0 ? marketMarketItemFull.url : str8;
        Integer num10 = (i10 & 33554432) != 0 ? marketMarketItemFull.variantsGroupingId : num5;
        Boolean bool5 = (i10 & 67108864) != 0 ? marketMarketItemFull.isMainVariant : bool2;
        if ((i10 & 134217728) != 0) {
            bool3 = bool5;
            str10 = marketMarketItemFull.sku;
        } else {
            str10 = str9;
            bool3 = bool5;
        }
        return marketMarketItemFull.copy(marketMarketItemAvailability3, marketMarketCategory2, str11, i11, userId2, marketPrice2, str12, list3, list4, baseBoolInt3, baseBoolInt4, baseLikes2, baseRepostsInfo2, num6, num7, baseLink2, str13, num8, str14, str15, num9, str16, bool4, str17, str18, num10, bool3, str10);
    }

    @NotNull
    public final MarketMarketItemAvailability component1() {
        return this.availability;
    }

    @Nullable
    public final BaseBoolInt component10() {
        return this.canComment;
    }

    @Nullable
    public final BaseBoolInt component11() {
        return this.canRepost;
    }

    @Nullable
    public final BaseLikes component12() {
        return this.likes;
    }

    @Nullable
    public final BaseRepostsInfo component13() {
        return this.reposts;
    }

    @Nullable
    public final Integer component14() {
        return this.viewsCount;
    }

    @Nullable
    public final Integer component15() {
        return this.wishlistItemId;
    }

    @Nullable
    public final BaseLink component16() {
        return this.cancelInfo;
    }

    @Nullable
    public final String component17() {
        return this.userAgreementInfo;
    }

    @Nullable
    public final Integer component18() {
        return this.adId;
    }

    @Nullable
    public final String component19() {
        return this.accessKey;
    }

    @NotNull
    public final MarketMarketCategory component2() {
        return this.category;
    }

    @Nullable
    public final String component20() {
        return this.buttonTitle;
    }

    @Nullable
    public final Integer component21() {
        return this.date;
    }

    @Nullable
    public final String component22() {
        return this.externalId;
    }

    @Nullable
    public final Boolean component23() {
        return this.isFavorite;
    }

    @Nullable
    public final String component24() {
        return this.thumbPhoto;
    }

    @Nullable
    public final String component25() {
        return this.url;
    }

    @Nullable
    public final Integer component26() {
        return this.variantsGroupingId;
    }

    @Nullable
    public final Boolean component27() {
        return this.isMainVariant;
    }

    @Nullable
    public final String component28() {
        return this.sku;
    }

    @NotNull
    public final String component3() {
        return this.description;
    }

    public final int component4() {
        return this.f15189id;
    }

    @NotNull
    public final UserId component5() {
        return this.ownerId;
    }

    @NotNull
    public final MarketPrice component6() {
        return this.price;
    }

    @NotNull
    public final String component7() {
        return this.title;
    }

    @Nullable
    public final List<Integer> component8() {
        return this.albumsIds;
    }

    @Nullable
    public final List<PhotosPhoto> component9() {
        return this.photos;
    }

    @NotNull
    public final MarketMarketItemFull copy(@NotNull MarketMarketItemAvailability availability, @NotNull MarketMarketCategory category, @NotNull String description, int i, @NotNull UserId ownerId, @NotNull MarketPrice price, @NotNull String title, @Nullable List<Integer> list, @Nullable List<PhotosPhoto> list2, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseLikes baseLikes, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable Integer num, @Nullable Integer num2, @Nullable BaseLink baseLink, @Nullable String str, @Nullable Integer num3, @Nullable String str2, @Nullable String str3, @Nullable Integer num4, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable Integer num5, @Nullable Boolean bool2, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(availability, "availability");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        return new MarketMarketItemFull(availability, category, description, i, ownerId, price, title, list, list2, baseBoolInt, baseBoolInt2, baseLikes, baseRepostsInfo, num, num2, baseLink, str, num3, str2, str3, num4, str4, bool, str5, str6, num5, bool2, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketItemFull)) {
            return false;
        }
        MarketMarketItemFull marketMarketItemFull = (MarketMarketItemFull) obj;
        return this.availability == marketMarketItemFull.availability && Intrinsics.a(this.category, marketMarketItemFull.category) && Intrinsics.a(this.description, marketMarketItemFull.description) && this.f15189id == marketMarketItemFull.f15189id && Intrinsics.a(this.ownerId, marketMarketItemFull.ownerId) && Intrinsics.a(this.price, marketMarketItemFull.price) && Intrinsics.a(this.title, marketMarketItemFull.title) && Intrinsics.a(this.albumsIds, marketMarketItemFull.albumsIds) && Intrinsics.a(this.photos, marketMarketItemFull.photos) && this.canComment == marketMarketItemFull.canComment && this.canRepost == marketMarketItemFull.canRepost && Intrinsics.a(this.likes, marketMarketItemFull.likes) && Intrinsics.a(this.reposts, marketMarketItemFull.reposts) && Intrinsics.a(this.viewsCount, marketMarketItemFull.viewsCount) && Intrinsics.a(this.wishlistItemId, marketMarketItemFull.wishlistItemId) && Intrinsics.a(this.cancelInfo, marketMarketItemFull.cancelInfo) && Intrinsics.a(this.userAgreementInfo, marketMarketItemFull.userAgreementInfo) && Intrinsics.a(this.adId, marketMarketItemFull.adId) && Intrinsics.a(this.accessKey, marketMarketItemFull.accessKey) && Intrinsics.a(this.buttonTitle, marketMarketItemFull.buttonTitle) && Intrinsics.a(this.date, marketMarketItemFull.date) && Intrinsics.a(this.externalId, marketMarketItemFull.externalId) && Intrinsics.a(this.isFavorite, marketMarketItemFull.isFavorite) && Intrinsics.a(this.thumbPhoto, marketMarketItemFull.thumbPhoto) && Intrinsics.a(this.url, marketMarketItemFull.url) && Intrinsics.a(this.variantsGroupingId, marketMarketItemFull.variantsGroupingId) && Intrinsics.a(this.isMainVariant, marketMarketItemFull.isMainVariant) && Intrinsics.a(this.sku, marketMarketItemFull.sku);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public final Integer getAdId() {
        return this.adId;
    }

    @Nullable
    public final List<Integer> getAlbumsIds() {
        return this.albumsIds;
    }

    @NotNull
    public final MarketMarketItemAvailability getAvailability() {
        return this.availability;
    }

    @Nullable
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @Nullable
    public final BaseBoolInt getCanComment() {
        return this.canComment;
    }

    @Nullable
    public final BaseBoolInt getCanRepost() {
        return this.canRepost;
    }

    @Nullable
    public final BaseLink getCancelInfo() {
        return this.cancelInfo;
    }

    @NotNull
    public final MarketMarketCategory getCategory() {
        return this.category;
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getExternalId() {
        return this.externalId;
    }

    public final int getId() {
        return this.f15189id;
    }

    @Nullable
    public final BaseLikes getLikes() {
        return this.likes;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final List<PhotosPhoto> getPhotos() {
        return this.photos;
    }

    @NotNull
    public final MarketPrice getPrice() {
        return this.price;
    }

    @Nullable
    public final BaseRepostsInfo getReposts() {
        return this.reposts;
    }

    @Nullable
    public final String getSku() {
        return this.sku;
    }

    @Nullable
    public final String getThumbPhoto() {
        return this.thumbPhoto;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getUserAgreementInfo() {
        return this.userAgreementInfo;
    }

    @Nullable
    public final Integer getVariantsGroupingId() {
        return this.variantsGroupingId;
    }

    @Nullable
    public final Integer getViewsCount() {
        return this.viewsCount;
    }

    @Nullable
    public final Integer getWishlistItemId() {
        return this.wishlistItemId;
    }

    public int hashCode() {
        int iE = a.e((this.price.hashCode() + o.e(this.ownerId, u.g(this.f15189id, a.e((this.category.hashCode() + (this.availability.hashCode() * 31)) * 31, 31, this.description), 31), 31)) * 31, 31, this.title);
        List<Integer> list = this.albumsIds;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        List<PhotosPhoto> list2 = this.photos;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.canComment;
        int iHashCode3 = (iHashCode2 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.canRepost;
        int iHashCode4 = (iHashCode3 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        BaseLikes baseLikes = this.likes;
        int iHashCode5 = (iHashCode4 + (baseLikes == null ? 0 : baseLikes.hashCode())) * 31;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        int iHashCode6 = (iHashCode5 + (baseRepostsInfo == null ? 0 : baseRepostsInfo.hashCode())) * 31;
        Integer num = this.viewsCount;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.wishlistItemId;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseLink baseLink = this.cancelInfo;
        int iHashCode9 = (iHashCode8 + (baseLink == null ? 0 : baseLink.hashCode())) * 31;
        String str = this.userAgreementInfo;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.adId;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.accessKey;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonTitle;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.date;
        int iHashCode14 = (iHashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.externalId;
        int iHashCode15 = (iHashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.thumbPhoto;
        int iHashCode17 = (iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.url;
        int iHashCode18 = (iHashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num5 = this.variantsGroupingId;
        int iHashCode19 = (iHashCode18 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool2 = this.isMainVariant;
        int iHashCode20 = (iHashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.sku;
        return iHashCode20 + (str7 != null ? str7.hashCode() : 0);
    }

    @Nullable
    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    @Nullable
    public final Boolean isMainVariant() {
        return this.isMainVariant;
    }

    @NotNull
    public String toString() {
        MarketMarketItemAvailability marketMarketItemAvailability = this.availability;
        MarketMarketCategory marketMarketCategory = this.category;
        String str = this.description;
        int i = this.f15189id;
        UserId userId = this.ownerId;
        MarketPrice marketPrice = this.price;
        String str2 = this.title;
        List<Integer> list = this.albumsIds;
        List<PhotosPhoto> list2 = this.photos;
        BaseBoolInt baseBoolInt = this.canComment;
        BaseBoolInt baseBoolInt2 = this.canRepost;
        BaseLikes baseLikes = this.likes;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        Integer num = this.viewsCount;
        Integer num2 = this.wishlistItemId;
        BaseLink baseLink = this.cancelInfo;
        String str3 = this.userAgreementInfo;
        Integer num3 = this.adId;
        String str4 = this.accessKey;
        String str5 = this.buttonTitle;
        Integer num4 = this.date;
        String str6 = this.externalId;
        Boolean bool = this.isFavorite;
        String str7 = this.thumbPhoto;
        String str8 = this.url;
        Integer num5 = this.variantsGroupingId;
        Boolean bool2 = this.isMainVariant;
        String str9 = this.sku;
        StringBuilder sb2 = new StringBuilder("MarketMarketItemFull(availability=");
        sb2.append(marketMarketItemAvailability);
        sb2.append(", category=");
        sb2.append(marketMarketCategory);
        sb2.append(", description=");
        o.p(i, str, ", id=", ", ownerId=", sb2);
        sb2.append(userId);
        sb2.append(", price=");
        sb2.append(marketPrice);
        sb2.append(", title=");
        sb2.append(str2);
        sb2.append(", albumsIds=");
        sb2.append(list);
        sb2.append(", photos=");
        sb2.append(list2);
        sb2.append(", canComment=");
        sb2.append(baseBoolInt);
        sb2.append(", canRepost=");
        sb2.append(baseBoolInt2);
        sb2.append(", likes=");
        sb2.append(baseLikes);
        sb2.append(", reposts=");
        sb2.append(baseRepostsInfo);
        sb2.append(", viewsCount=");
        sb2.append(num);
        sb2.append(", wishlistItemId=");
        sb2.append(num2);
        sb2.append(", cancelInfo=");
        sb2.append(baseLink);
        sb2.append(", userAgreementInfo=");
        a.r(num3, str3, ", adId=", ", accessKey=", sb2);
        o.t(sb2, str4, ", buttonTitle=", str5, ", date=");
        pe.a.r(num4, ", externalId=", str6, ", isFavorite=", sb2);
        sb2.append(bool);
        sb2.append(", thumbPhoto=");
        sb2.append(str7);
        sb2.append(", url=");
        a.r(num5, str8, ", variantsGroupingId=", ", isMainVariant=", sb2);
        sb2.append(bool2);
        sb2.append(", sku=");
        sb2.append(str9);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ MarketMarketItemFull(MarketMarketItemAvailability marketMarketItemAvailability, MarketMarketCategory marketMarketCategory, String str, int i, UserId userId, MarketPrice marketPrice, String str2, List list, List list2, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseLikes baseLikes, BaseRepostsInfo baseRepostsInfo, Integer num, Integer num2, BaseLink baseLink, String str3, Integer num3, String str4, String str5, Integer num4, String str6, Boolean bool, String str7, String str8, Integer num5, Boolean bool2, String str9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(marketMarketItemAvailability, marketMarketCategory, str, i, userId, marketPrice, str2, (i10 & 128) != 0 ? null : list, (i10 & 256) != 0 ? null : list2, (i10 & 512) != 0 ? null : baseBoolInt, (i10 & 1024) != 0 ? null : baseBoolInt2, (i10 & 2048) != 0 ? null : baseLikes, (i10 & 4096) != 0 ? null : baseRepostsInfo, (i10 & 8192) != 0 ? null : num, (i10 & 16384) != 0 ? null : num2, (32768 & i10) != 0 ? null : baseLink, (65536 & i10) != 0 ? null : str3, (131072 & i10) != 0 ? null : num3, (262144 & i10) != 0 ? null : str4, (524288 & i10) != 0 ? null : str5, (1048576 & i10) != 0 ? null : num4, (2097152 & i10) != 0 ? null : str6, (4194304 & i10) != 0 ? null : bool, (8388608 & i10) != 0 ? null : str7, (16777216 & i10) != 0 ? null : str8, (33554432 & i10) != 0 ? null : num5, (67108864 & i10) != 0 ? null : bool2, (i10 & 134217728) != 0 ? null : str9);
    }
}
