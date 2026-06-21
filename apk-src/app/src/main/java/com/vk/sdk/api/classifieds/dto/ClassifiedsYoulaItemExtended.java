package com.vk.sdk.api.classifieds.dto;

import a0.u;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseGeoCoordinates;
import com.vk.sdk.api.base.dto.BaseImage;
import com.vk.sdk.api.base.dto.BaseLinkButton;
import com.vk.sdk.api.base.dto.BaseLinkProductStatus;
import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import com.vk.sdk.api.market.dto.MarketPrice;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import gf.a;
import io.sentry.SentryLockReason;
import io.sentry.protocol.Geo;
import io.sentry.protocol.User;
import java.util.List;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class ClassifiedsYoulaItemExtended {

    @b("action_properties")
    @Nullable
    private final ClassifiedsYoulaItemActionProperties actionProperties;

    @b("action_url")
    @Nullable
    private final String actionUrl;

    @b(SentryLockReason.JsonKeys.ADDRESS)
    @Nullable
    private final String address;

    @b("attributes")
    @Nullable
    private final List<ClassifiedsYoulaItemAttribute> attributes;

    @b("author")
    @Nullable
    private final ClassifiedsYoulaItemVkAuthor author;

    @b("block_mode")
    @Nullable
    private final BlockMode blockMode;

    @b("block_type_text")
    @Nullable
    private final String blockTypeText;

    @b("button_actions")
    @Nullable
    private final List<ClassifiedsYoulaItemActionButton> buttonActions;

    @b("category")
    @Nullable
    private final String category;

    @b(Geo.JsonKeys.CITY)
    @Nullable
    private final String city;

    @b("commercial_profile_button")
    @Nullable
    private final BaseLinkButton commercialProfileButton;

    @b("description")
    @Nullable
    private final String description;

    @b("details_url")
    @Nullable
    private final String detailsUrl;

    @b("distance")
    @Nullable
    private final Integer distance;

    @b("distance_text")
    @Nullable
    private final String distanceText;

    @b("favorite_counter")
    @Nullable
    private final Integer favoriteCounter;

    @b(User.JsonKeys.GEO)
    @Nullable
    private final BaseGeoCoordinates geo;

    @b("group")
    @Nullable
    private final GroupsGroupFull group;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final String f15154id;

    @b("internal_id")
    private final int internalId;

    @b("internal_owner_id")
    private final int internalOwnerId;

    @b("is_favorite")
    @Nullable
    private final Boolean isFavorite;

    @b("is_owner")
    @Nullable
    private final Boolean isOwner;

    @b("is_user_blacklisted")
    @Nullable
    private final Boolean isUserBlacklisted;

    @b("location_text")
    @Nullable
    private final String locationText;

    @b("menu_actions")
    @Nullable
    private final List<ClassifiedsYoulaItemActionButton> menuActions;

    @b("on_click_options")
    @Nullable
    private final ClassifiedsYoulaItemOnClickOptions onClickOptions;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("photo_total_count_description")
    @Nullable
    private final String photoTotalCountDescription;

    @b("photos")
    @Nullable
    private final List<ClassifiedsYoulaItemPhoto> photos;

    @b("price")
    @NotNull
    private final MarketPrice price;

    @b("published_date")
    @Nullable
    private final Integer publishedDate;

    @b("radius_meters")
    @Nullable
    private final Integer radiusMeters;

    @b("root_category")
    @Nullable
    private final String rootCategory;

    @b("share_url")
    @Nullable
    private final String shareUrl;

    @b("status")
    @Nullable
    private final BaseLinkProductStatus status;

    @b("status_info")
    @Nullable
    private final ClassifiedsYoulaItemStatusInfo statusInfo;

    @b("sub_category")
    @Nullable
    private final String subCategory;

    @b("thumb")
    @Nullable
    private final List<BaseImage> thumb;

    @b("title")
    @Nullable
    private final String title;

    @b("views")
    @Nullable
    private final Integer views;

    @b("youla_owner_name")
    @Nullable
    private final String youlaOwnerName;

    @b("youla_user_id")
    @Nullable
    private final String youlaUserId;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum BlockMode {
        NO_BLOCK(0),
        BLOCKED(1),
        REJECTED(2),
        VK_BLOCKED(3);

        private final int value;

        BlockMode(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public ClassifiedsYoulaItemExtended(int i, int i10, @NotNull String id2, @NotNull UserId ownerId, @NotNull MarketPrice price, @Nullable Boolean bool, @Nullable String str, @Nullable BaseGeoCoordinates baseGeoCoordinates, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable BaseLinkProductStatus baseLinkProductStatus, @Nullable BlockMode blockMode, @Nullable String str4, @Nullable String str5, @Nullable List<ClassifiedsYoulaItemPhoto> list, @Nullable String str6, @Nullable BaseLinkButton baseLinkButton, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num2, @Nullable GroupsGroupFull groupsGroupFull, @Nullable List<ClassifiedsYoulaItemAttribute> list2, @Nullable ClassifiedsYoulaItemActionProperties classifiedsYoulaItemActionProperties, @Nullable String str10, @Nullable Integer num3, @Nullable String str11, @Nullable ClassifiedsYoulaItemStatusInfo classifiedsYoulaItemStatusInfo, @Nullable List<ClassifiedsYoulaItemActionButton> list3, @Nullable List<ClassifiedsYoulaItemActionButton> list4, @Nullable Boolean bool2, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str12, @Nullable String str13, @Nullable ClassifiedsYoulaItemVkAuthor classifiedsYoulaItemVkAuthor, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable ClassifiedsYoulaItemOnClickOptions classifiedsYoulaItemOnClickOptions, @Nullable Boolean bool3, @Nullable List<BaseImage> list5, @Nullable PhotosPhoto photosPhoto) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(price, "price");
        this.internalOwnerId = i;
        this.internalId = i10;
        this.f15154id = id2;
        this.ownerId = ownerId;
        this.price = price;
        this.isOwner = bool;
        this.description = str;
        this.geo = baseGeoCoordinates;
        this.locationText = str2;
        this.distance = num;
        this.city = str3;
        this.status = baseLinkProductStatus;
        this.blockMode = blockMode;
        this.detailsUrl = str4;
        this.actionUrl = str5;
        this.photos = list;
        this.photoTotalCountDescription = str6;
        this.commercialProfileButton = baseLinkButton;
        this.rootCategory = str7;
        this.category = str8;
        this.subCategory = str9;
        this.publishedDate = num2;
        this.group = groupsGroupFull;
        this.attributes = list2;
        this.actionProperties = classifiedsYoulaItemActionProperties;
        this.address = str10;
        this.radiusMeters = num3;
        this.distanceText = str11;
        this.statusInfo = classifiedsYoulaItemStatusInfo;
        this.menuActions = list3;
        this.buttonActions = list4;
        this.isUserBlacklisted = bool2;
        this.favoriteCounter = num4;
        this.views = num5;
        this.blockTypeText = str12;
        this.shareUrl = str13;
        this.author = classifiedsYoulaItemVkAuthor;
        this.youlaOwnerName = str14;
        this.youlaUserId = str15;
        this.title = str16;
        this.onClickOptions = classifiedsYoulaItemOnClickOptions;
        this.isFavorite = bool3;
        this.thumb = list5;
        this.photo = photosPhoto;
    }

    public final int component1() {
        return this.internalOwnerId;
    }

    @Nullable
    public final Integer component10() {
        return this.distance;
    }

    @Nullable
    public final String component11() {
        return this.city;
    }

    @Nullable
    public final BaseLinkProductStatus component12() {
        return this.status;
    }

    @Nullable
    public final BlockMode component13() {
        return this.blockMode;
    }

    @Nullable
    public final String component14() {
        return this.detailsUrl;
    }

    @Nullable
    public final String component15() {
        return this.actionUrl;
    }

    @Nullable
    public final List<ClassifiedsYoulaItemPhoto> component16() {
        return this.photos;
    }

    @Nullable
    public final String component17() {
        return this.photoTotalCountDescription;
    }

    @Nullable
    public final BaseLinkButton component18() {
        return this.commercialProfileButton;
    }

    @Nullable
    public final String component19() {
        return this.rootCategory;
    }

    public final int component2() {
        return this.internalId;
    }

    @Nullable
    public final String component20() {
        return this.category;
    }

    @Nullable
    public final String component21() {
        return this.subCategory;
    }

    @Nullable
    public final Integer component22() {
        return this.publishedDate;
    }

    @Nullable
    public final GroupsGroupFull component23() {
        return this.group;
    }

    @Nullable
    public final List<ClassifiedsYoulaItemAttribute> component24() {
        return this.attributes;
    }

    @Nullable
    public final ClassifiedsYoulaItemActionProperties component25() {
        return this.actionProperties;
    }

    @Nullable
    public final String component26() {
        return this.address;
    }

    @Nullable
    public final Integer component27() {
        return this.radiusMeters;
    }

    @Nullable
    public final String component28() {
        return this.distanceText;
    }

    @Nullable
    public final ClassifiedsYoulaItemStatusInfo component29() {
        return this.statusInfo;
    }

    @NotNull
    public final String component3() {
        return this.f15154id;
    }

    @Nullable
    public final List<ClassifiedsYoulaItemActionButton> component30() {
        return this.menuActions;
    }

    @Nullable
    public final List<ClassifiedsYoulaItemActionButton> component31() {
        return this.buttonActions;
    }

    @Nullable
    public final Boolean component32() {
        return this.isUserBlacklisted;
    }

    @Nullable
    public final Integer component33() {
        return this.favoriteCounter;
    }

    @Nullable
    public final Integer component34() {
        return this.views;
    }

    @Nullable
    public final String component35() {
        return this.blockTypeText;
    }

    @Nullable
    public final String component36() {
        return this.shareUrl;
    }

    @Nullable
    public final ClassifiedsYoulaItemVkAuthor component37() {
        return this.author;
    }

    @Nullable
    public final String component38() {
        return this.youlaOwnerName;
    }

    @Nullable
    public final String component39() {
        return this.youlaUserId;
    }

    @NotNull
    public final UserId component4() {
        return this.ownerId;
    }

    @Nullable
    public final String component40() {
        return this.title;
    }

    @Nullable
    public final ClassifiedsYoulaItemOnClickOptions component41() {
        return this.onClickOptions;
    }

    @Nullable
    public final Boolean component42() {
        return this.isFavorite;
    }

    @Nullable
    public final List<BaseImage> component43() {
        return this.thumb;
    }

    @Nullable
    public final PhotosPhoto component44() {
        return this.photo;
    }

    @NotNull
    public final MarketPrice component5() {
        return this.price;
    }

    @Nullable
    public final Boolean component6() {
        return this.isOwner;
    }

    @Nullable
    public final String component7() {
        return this.description;
    }

    @Nullable
    public final BaseGeoCoordinates component8() {
        return this.geo;
    }

    @Nullable
    public final String component9() {
        return this.locationText;
    }

    @NotNull
    public final ClassifiedsYoulaItemExtended copy(int i, int i10, @NotNull String id2, @NotNull UserId ownerId, @NotNull MarketPrice price, @Nullable Boolean bool, @Nullable String str, @Nullable BaseGeoCoordinates baseGeoCoordinates, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable BaseLinkProductStatus baseLinkProductStatus, @Nullable BlockMode blockMode, @Nullable String str4, @Nullable String str5, @Nullable List<ClassifiedsYoulaItemPhoto> list, @Nullable String str6, @Nullable BaseLinkButton baseLinkButton, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num2, @Nullable GroupsGroupFull groupsGroupFull, @Nullable List<ClassifiedsYoulaItemAttribute> list2, @Nullable ClassifiedsYoulaItemActionProperties classifiedsYoulaItemActionProperties, @Nullable String str10, @Nullable Integer num3, @Nullable String str11, @Nullable ClassifiedsYoulaItemStatusInfo classifiedsYoulaItemStatusInfo, @Nullable List<ClassifiedsYoulaItemActionButton> list3, @Nullable List<ClassifiedsYoulaItemActionButton> list4, @Nullable Boolean bool2, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str12, @Nullable String str13, @Nullable ClassifiedsYoulaItemVkAuthor classifiedsYoulaItemVkAuthor, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable ClassifiedsYoulaItemOnClickOptions classifiedsYoulaItemOnClickOptions, @Nullable Boolean bool3, @Nullable List<BaseImage> list5, @Nullable PhotosPhoto photosPhoto) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(price, "price");
        return new ClassifiedsYoulaItemExtended(i, i10, id2, ownerId, price, bool, str, baseGeoCoordinates, str2, num, str3, baseLinkProductStatus, blockMode, str4, str5, list, str6, baseLinkButton, str7, str8, str9, num2, groupsGroupFull, list2, classifiedsYoulaItemActionProperties, str10, num3, str11, classifiedsYoulaItemStatusInfo, list3, list4, bool2, num4, num5, str12, str13, classifiedsYoulaItemVkAuthor, str14, str15, str16, classifiedsYoulaItemOnClickOptions, bool3, list5, photosPhoto);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemExtended)) {
            return false;
        }
        ClassifiedsYoulaItemExtended classifiedsYoulaItemExtended = (ClassifiedsYoulaItemExtended) obj;
        return this.internalOwnerId == classifiedsYoulaItemExtended.internalOwnerId && this.internalId == classifiedsYoulaItemExtended.internalId && Intrinsics.a(this.f15154id, classifiedsYoulaItemExtended.f15154id) && Intrinsics.a(this.ownerId, classifiedsYoulaItemExtended.ownerId) && Intrinsics.a(this.price, classifiedsYoulaItemExtended.price) && Intrinsics.a(this.isOwner, classifiedsYoulaItemExtended.isOwner) && Intrinsics.a(this.description, classifiedsYoulaItemExtended.description) && Intrinsics.a(this.geo, classifiedsYoulaItemExtended.geo) && Intrinsics.a(this.locationText, classifiedsYoulaItemExtended.locationText) && Intrinsics.a(this.distance, classifiedsYoulaItemExtended.distance) && Intrinsics.a(this.city, classifiedsYoulaItemExtended.city) && this.status == classifiedsYoulaItemExtended.status && this.blockMode == classifiedsYoulaItemExtended.blockMode && Intrinsics.a(this.detailsUrl, classifiedsYoulaItemExtended.detailsUrl) && Intrinsics.a(this.actionUrl, classifiedsYoulaItemExtended.actionUrl) && Intrinsics.a(this.photos, classifiedsYoulaItemExtended.photos) && Intrinsics.a(this.photoTotalCountDescription, classifiedsYoulaItemExtended.photoTotalCountDescription) && Intrinsics.a(this.commercialProfileButton, classifiedsYoulaItemExtended.commercialProfileButton) && Intrinsics.a(this.rootCategory, classifiedsYoulaItemExtended.rootCategory) && Intrinsics.a(this.category, classifiedsYoulaItemExtended.category) && Intrinsics.a(this.subCategory, classifiedsYoulaItemExtended.subCategory) && Intrinsics.a(this.publishedDate, classifiedsYoulaItemExtended.publishedDate) && Intrinsics.a(this.group, classifiedsYoulaItemExtended.group) && Intrinsics.a(this.attributes, classifiedsYoulaItemExtended.attributes) && Intrinsics.a(this.actionProperties, classifiedsYoulaItemExtended.actionProperties) && Intrinsics.a(this.address, classifiedsYoulaItemExtended.address) && Intrinsics.a(this.radiusMeters, classifiedsYoulaItemExtended.radiusMeters) && Intrinsics.a(this.distanceText, classifiedsYoulaItemExtended.distanceText) && Intrinsics.a(this.statusInfo, classifiedsYoulaItemExtended.statusInfo) && Intrinsics.a(this.menuActions, classifiedsYoulaItemExtended.menuActions) && Intrinsics.a(this.buttonActions, classifiedsYoulaItemExtended.buttonActions) && Intrinsics.a(this.isUserBlacklisted, classifiedsYoulaItemExtended.isUserBlacklisted) && Intrinsics.a(this.favoriteCounter, classifiedsYoulaItemExtended.favoriteCounter) && Intrinsics.a(this.views, classifiedsYoulaItemExtended.views) && Intrinsics.a(this.blockTypeText, classifiedsYoulaItemExtended.blockTypeText) && Intrinsics.a(this.shareUrl, classifiedsYoulaItemExtended.shareUrl) && Intrinsics.a(this.author, classifiedsYoulaItemExtended.author) && Intrinsics.a(this.youlaOwnerName, classifiedsYoulaItemExtended.youlaOwnerName) && Intrinsics.a(this.youlaUserId, classifiedsYoulaItemExtended.youlaUserId) && Intrinsics.a(this.title, classifiedsYoulaItemExtended.title) && Intrinsics.a(this.onClickOptions, classifiedsYoulaItemExtended.onClickOptions) && Intrinsics.a(this.isFavorite, classifiedsYoulaItemExtended.isFavorite) && Intrinsics.a(this.thumb, classifiedsYoulaItemExtended.thumb) && Intrinsics.a(this.photo, classifiedsYoulaItemExtended.photo);
    }

    @Nullable
    public final ClassifiedsYoulaItemActionProperties getActionProperties() {
        return this.actionProperties;
    }

    @Nullable
    public final String getActionUrl() {
        return this.actionUrl;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final List<ClassifiedsYoulaItemAttribute> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public final ClassifiedsYoulaItemVkAuthor getAuthor() {
        return this.author;
    }

    @Nullable
    public final BlockMode getBlockMode() {
        return this.blockMode;
    }

    @Nullable
    public final String getBlockTypeText() {
        return this.blockTypeText;
    }

    @Nullable
    public final List<ClassifiedsYoulaItemActionButton> getButtonActions() {
        return this.buttonActions;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final BaseLinkButton getCommercialProfileButton() {
        return this.commercialProfileButton;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDetailsUrl() {
        return this.detailsUrl;
    }

    @Nullable
    public final Integer getDistance() {
        return this.distance;
    }

    @Nullable
    public final String getDistanceText() {
        return this.distanceText;
    }

    @Nullable
    public final Integer getFavoriteCounter() {
        return this.favoriteCounter;
    }

    @Nullable
    public final BaseGeoCoordinates getGeo() {
        return this.geo;
    }

    @Nullable
    public final GroupsGroupFull getGroup() {
        return this.group;
    }

    @NotNull
    public final String getId() {
        return this.f15154id;
    }

    public final int getInternalId() {
        return this.internalId;
    }

    public final int getInternalOwnerId() {
        return this.internalOwnerId;
    }

    @Nullable
    public final String getLocationText() {
        return this.locationText;
    }

    @Nullable
    public final List<ClassifiedsYoulaItemActionButton> getMenuActions() {
        return this.menuActions;
    }

    @Nullable
    public final ClassifiedsYoulaItemOnClickOptions getOnClickOptions() {
        return this.onClickOptions;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final String getPhotoTotalCountDescription() {
        return this.photoTotalCountDescription;
    }

    @Nullable
    public final List<ClassifiedsYoulaItemPhoto> getPhotos() {
        return this.photos;
    }

    @NotNull
    public final MarketPrice getPrice() {
        return this.price;
    }

    @Nullable
    public final Integer getPublishedDate() {
        return this.publishedDate;
    }

    @Nullable
    public final Integer getRadiusMeters() {
        return this.radiusMeters;
    }

    @Nullable
    public final String getRootCategory() {
        return this.rootCategory;
    }

    @Nullable
    public final String getShareUrl() {
        return this.shareUrl;
    }

    @Nullable
    public final BaseLinkProductStatus getStatus() {
        return this.status;
    }

    @Nullable
    public final ClassifiedsYoulaItemStatusInfo getStatusInfo() {
        return this.statusInfo;
    }

    @Nullable
    public final String getSubCategory() {
        return this.subCategory;
    }

    @Nullable
    public final List<BaseImage> getThumb() {
        return this.thumb;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getViews() {
        return this.views;
    }

    @Nullable
    public final String getYoulaOwnerName() {
        return this.youlaOwnerName;
    }

    @Nullable
    public final String getYoulaUserId() {
        return this.youlaUserId;
    }

    public int hashCode() {
        int iHashCode = (this.price.hashCode() + o.e(this.ownerId, a.e(u.g(this.internalId, Integer.hashCode(this.internalOwnerId) * 31, 31), 31, this.f15154id), 31)) * 31;
        Boolean bool = this.isOwner;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.description;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BaseGeoCoordinates baseGeoCoordinates = this.geo;
        int iHashCode4 = (iHashCode3 + (baseGeoCoordinates == null ? 0 : baseGeoCoordinates.hashCode())) * 31;
        String str2 = this.locationText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.distance;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BaseLinkProductStatus baseLinkProductStatus = this.status;
        int iHashCode8 = (iHashCode7 + (baseLinkProductStatus == null ? 0 : baseLinkProductStatus.hashCode())) * 31;
        BlockMode blockMode = this.blockMode;
        int iHashCode9 = (iHashCode8 + (blockMode == null ? 0 : blockMode.hashCode())) * 31;
        String str4 = this.detailsUrl;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actionUrl;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<ClassifiedsYoulaItemPhoto> list = this.photos;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.photoTotalCountDescription;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BaseLinkButton baseLinkButton = this.commercialProfileButton;
        int iHashCode14 = (iHashCode13 + (baseLinkButton == null ? 0 : baseLinkButton.hashCode())) * 31;
        String str7 = this.rootCategory;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.category;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.subCategory;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num2 = this.publishedDate;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        GroupsGroupFull groupsGroupFull = this.group;
        int iHashCode19 = (iHashCode18 + (groupsGroupFull == null ? 0 : groupsGroupFull.hashCode())) * 31;
        List<ClassifiedsYoulaItemAttribute> list2 = this.attributes;
        int iHashCode20 = (iHashCode19 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ClassifiedsYoulaItemActionProperties classifiedsYoulaItemActionProperties = this.actionProperties;
        int iHashCode21 = (iHashCode20 + (classifiedsYoulaItemActionProperties == null ? 0 : classifiedsYoulaItemActionProperties.hashCode())) * 31;
        String str10 = this.address;
        int iHashCode22 = (iHashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num3 = this.radiusMeters;
        int iHashCode23 = (iHashCode22 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str11 = this.distanceText;
        int iHashCode24 = (iHashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        ClassifiedsYoulaItemStatusInfo classifiedsYoulaItemStatusInfo = this.statusInfo;
        int iHashCode25 = (iHashCode24 + (classifiedsYoulaItemStatusInfo == null ? 0 : classifiedsYoulaItemStatusInfo.hashCode())) * 31;
        List<ClassifiedsYoulaItemActionButton> list3 = this.menuActions;
        int iHashCode26 = (iHashCode25 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ClassifiedsYoulaItemActionButton> list4 = this.buttonActions;
        int iHashCode27 = (iHashCode26 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool2 = this.isUserBlacklisted;
        int iHashCode28 = (iHashCode27 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.favoriteCounter;
        int iHashCode29 = (iHashCode28 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.views;
        int iHashCode30 = (iHashCode29 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str12 = this.blockTypeText;
        int iHashCode31 = (iHashCode30 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.shareUrl;
        int iHashCode32 = (iHashCode31 + (str13 == null ? 0 : str13.hashCode())) * 31;
        ClassifiedsYoulaItemVkAuthor classifiedsYoulaItemVkAuthor = this.author;
        int iHashCode33 = (iHashCode32 + (classifiedsYoulaItemVkAuthor == null ? 0 : classifiedsYoulaItemVkAuthor.hashCode())) * 31;
        String str14 = this.youlaOwnerName;
        int iHashCode34 = (iHashCode33 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.youlaUserId;
        int iHashCode35 = (iHashCode34 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.title;
        int iHashCode36 = (iHashCode35 + (str16 == null ? 0 : str16.hashCode())) * 31;
        ClassifiedsYoulaItemOnClickOptions classifiedsYoulaItemOnClickOptions = this.onClickOptions;
        int iHashCode37 = (iHashCode36 + (classifiedsYoulaItemOnClickOptions == null ? 0 : classifiedsYoulaItemOnClickOptions.hashCode())) * 31;
        Boolean bool3 = this.isFavorite;
        int iHashCode38 = (iHashCode37 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<BaseImage> list5 = this.thumb;
        int iHashCode39 = (iHashCode38 + (list5 == null ? 0 : list5.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photo;
        return iHashCode39 + (photosPhoto != null ? photosPhoto.hashCode() : 0);
    }

    @Nullable
    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    @Nullable
    public final Boolean isOwner() {
        return this.isOwner;
    }

    @Nullable
    public final Boolean isUserBlacklisted() {
        return this.isUserBlacklisted;
    }

    @NotNull
    public String toString() {
        int i = this.internalOwnerId;
        int i10 = this.internalId;
        String str = this.f15154id;
        UserId userId = this.ownerId;
        MarketPrice marketPrice = this.price;
        Boolean bool = this.isOwner;
        String str2 = this.description;
        BaseGeoCoordinates baseGeoCoordinates = this.geo;
        String str3 = this.locationText;
        Integer num = this.distance;
        String str4 = this.city;
        BaseLinkProductStatus baseLinkProductStatus = this.status;
        BlockMode blockMode = this.blockMode;
        String str5 = this.detailsUrl;
        String str6 = this.actionUrl;
        List<ClassifiedsYoulaItemPhoto> list = this.photos;
        String str7 = this.photoTotalCountDescription;
        BaseLinkButton baseLinkButton = this.commercialProfileButton;
        String str8 = this.rootCategory;
        String str9 = this.category;
        String str10 = this.subCategory;
        Integer num2 = this.publishedDate;
        GroupsGroupFull groupsGroupFull = this.group;
        List<ClassifiedsYoulaItemAttribute> list2 = this.attributes;
        ClassifiedsYoulaItemActionProperties classifiedsYoulaItemActionProperties = this.actionProperties;
        String str11 = this.address;
        Integer num3 = this.radiusMeters;
        String str12 = this.distanceText;
        ClassifiedsYoulaItemStatusInfo classifiedsYoulaItemStatusInfo = this.statusInfo;
        List<ClassifiedsYoulaItemActionButton> list3 = this.menuActions;
        List<ClassifiedsYoulaItemActionButton> list4 = this.buttonActions;
        Boolean bool2 = this.isUserBlacklisted;
        Integer num4 = this.favoriteCounter;
        Integer num5 = this.views;
        String str13 = this.blockTypeText;
        String str14 = this.shareUrl;
        ClassifiedsYoulaItemVkAuthor classifiedsYoulaItemVkAuthor = this.author;
        String str15 = this.youlaOwnerName;
        String str16 = this.youlaUserId;
        String str17 = this.title;
        ClassifiedsYoulaItemOnClickOptions classifiedsYoulaItemOnClickOptions = this.onClickOptions;
        Boolean bool3 = this.isFavorite;
        List<BaseImage> list5 = this.thumb;
        PhotosPhoto photosPhoto = this.photo;
        StringBuilder sbI = z.i("ClassifiedsYoulaItemExtended(internalOwnerId=", i, ", internalId=", i10, ", id=");
        sbI.append(str);
        sbI.append(", ownerId=");
        sbI.append(userId);
        sbI.append(", price=");
        sbI.append(marketPrice);
        sbI.append(", isOwner=");
        sbI.append(bool);
        sbI.append(", description=");
        sbI.append(str2);
        sbI.append(", geo=");
        sbI.append(baseGeoCoordinates);
        sbI.append(", locationText=");
        a.r(num, str3, ", distance=", ", city=", sbI);
        sbI.append(str4);
        sbI.append(", status=");
        sbI.append(baseLinkProductStatus);
        sbI.append(", blockMode=");
        sbI.append(blockMode);
        sbI.append(", detailsUrl=");
        sbI.append(str5);
        sbI.append(", actionUrl=");
        sbI.append(str6);
        sbI.append(", photos=");
        sbI.append(list);
        sbI.append(", photoTotalCountDescription=");
        sbI.append(str7);
        sbI.append(", commercialProfileButton=");
        sbI.append(baseLinkButton);
        sbI.append(", rootCategory=");
        o.t(sbI, str8, ", category=", str9, ", subCategory=");
        a.r(num2, str10, ", publishedDate=", ", group=", sbI);
        sbI.append(groupsGroupFull);
        sbI.append(", attributes=");
        sbI.append(list2);
        sbI.append(", actionProperties=");
        sbI.append(classifiedsYoulaItemActionProperties);
        sbI.append(", address=");
        sbI.append(str11);
        sbI.append(", radiusMeters=");
        pe.a.r(num3, ", distanceText=", str12, ", statusInfo=", sbI);
        sbI.append(classifiedsYoulaItemStatusInfo);
        sbI.append(", menuActions=");
        sbI.append(list3);
        sbI.append(", buttonActions=");
        sbI.append(list4);
        sbI.append(", isUserBlacklisted=");
        sbI.append(bool2);
        sbI.append(", favoriteCounter=");
        a.t(sbI, num4, ", views=", num5, ", blockTypeText=");
        o.t(sbI, str13, ", shareUrl=", str14, ", author=");
        sbI.append(classifiedsYoulaItemVkAuthor);
        sbI.append(", youlaOwnerName=");
        sbI.append(str15);
        sbI.append(", youlaUserId=");
        o.t(sbI, str16, ", title=", str17, ", onClickOptions=");
        sbI.append(classifiedsYoulaItemOnClickOptions);
        sbI.append(", isFavorite=");
        sbI.append(bool3);
        sbI.append(", thumb=");
        sbI.append(list5);
        sbI.append(", photo=");
        sbI.append(photosPhoto);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ ClassifiedsYoulaItemExtended(int i, int i10, String str, UserId userId, MarketPrice marketPrice, Boolean bool, String str2, BaseGeoCoordinates baseGeoCoordinates, String str3, Integer num, String str4, BaseLinkProductStatus baseLinkProductStatus, BlockMode blockMode, String str5, String str6, List list, String str7, BaseLinkButton baseLinkButton, String str8, String str9, String str10, Integer num2, GroupsGroupFull groupsGroupFull, List list2, ClassifiedsYoulaItemActionProperties classifiedsYoulaItemActionProperties, String str11, Integer num3, String str12, ClassifiedsYoulaItemStatusInfo classifiedsYoulaItemStatusInfo, List list3, List list4, Boolean bool2, Integer num4, Integer num5, String str13, String str14, ClassifiedsYoulaItemVkAuthor classifiedsYoulaItemVkAuthor, String str15, String str16, String str17, ClassifiedsYoulaItemOnClickOptions classifiedsYoulaItemOnClickOptions, Boolean bool3, List list5, PhotosPhoto photosPhoto, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, str, userId, marketPrice, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : baseGeoCoordinates, (i11 & 256) != 0 ? null : str3, (i11 & 512) != 0 ? null : num, (i11 & 1024) != 0 ? null : str4, (i11 & 2048) != 0 ? null : baseLinkProductStatus, (i11 & 4096) != 0 ? null : blockMode, (i11 & 8192) != 0 ? null : str5, (i11 & 16384) != 0 ? null : str6, (32768 & i11) != 0 ? null : list, (65536 & i11) != 0 ? null : str7, (131072 & i11) != 0 ? null : baseLinkButton, (262144 & i11) != 0 ? null : str8, (524288 & i11) != 0 ? null : str9, (1048576 & i11) != 0 ? null : str10, (2097152 & i11) != 0 ? null : num2, (4194304 & i11) != 0 ? null : groupsGroupFull, (8388608 & i11) != 0 ? null : list2, (16777216 & i11) != 0 ? null : classifiedsYoulaItemActionProperties, (33554432 & i11) != 0 ? null : str11, (67108864 & i11) != 0 ? null : num3, (134217728 & i11) != 0 ? null : str12, (268435456 & i11) != 0 ? null : classifiedsYoulaItemStatusInfo, (536870912 & i11) != 0 ? null : list3, (1073741824 & i11) != 0 ? null : list4, (i11 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : bool2, (i12 & 1) != 0 ? null : num4, (i12 & 2) != 0 ? null : num5, (i12 & 4) != 0 ? null : str13, (i12 & 8) != 0 ? null : str14, (i12 & 16) != 0 ? null : classifiedsYoulaItemVkAuthor, (i12 & 32) != 0 ? null : str15, (i12 & 64) != 0 ? null : str16, (i12 & 128) != 0 ? null : str17, (i12 & 256) != 0 ? null : classifiedsYoulaItemOnClickOptions, (i12 & 512) != 0 ? null : bool3, (i12 & 1024) != 0 ? null : list5, (i12 & 2048) != 0 ? null : photosPhoto);
    }
}
