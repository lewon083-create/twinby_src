package com.vk.sdk.api.market.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import gf.a;
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
public final class MarketMarketItem {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("availability")
    @NotNull
    private final MarketMarketItemAvailability availability;

    @b("button_title")
    @Nullable
    private final String buttonTitle;

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
    private final int f15188id;

    @b("is_favorite")
    @Nullable
    private final Boolean isFavorite;

    @b("is_main_variant")
    @Nullable
    private final Boolean isMainVariant;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("price")
    @NotNull
    private final MarketPrice price;

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

    @b("variants_grouping_id")
    @Nullable
    private final Integer variantsGroupingId;

    public MarketMarketItem(@NotNull MarketMarketItemAvailability availability, @NotNull MarketMarketCategory category, @NotNull String description, int i, @NotNull UserId ownerId, @NotNull MarketPrice price, @NotNull String title, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(availability, "availability");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        this.availability = availability;
        this.category = category;
        this.description = description;
        this.f15188id = i;
        this.ownerId = ownerId;
        this.price = price;
        this.title = title;
        this.accessKey = str;
        this.buttonTitle = str2;
        this.date = num;
        this.externalId = str3;
        this.isFavorite = bool;
        this.thumbPhoto = str4;
        this.url = str5;
        this.variantsGroupingId = num2;
        this.isMainVariant = bool2;
        this.sku = str6;
    }

    public static /* synthetic */ MarketMarketItem copy$default(MarketMarketItem marketMarketItem, MarketMarketItemAvailability marketMarketItemAvailability, MarketMarketCategory marketMarketCategory, String str, int i, UserId userId, MarketPrice marketPrice, String str2, String str3, String str4, Integer num, String str5, Boolean bool, String str6, String str7, Integer num2, Boolean bool2, String str8, int i10, Object obj) {
        String str9;
        Boolean bool3;
        MarketMarketItemAvailability marketMarketItemAvailability2;
        MarketMarketItem marketMarketItem2;
        Integer num3;
        MarketMarketCategory marketMarketCategory2;
        String str10;
        int i11;
        UserId userId2;
        MarketPrice marketPrice2;
        String str11;
        String str12;
        String str13;
        Integer num4;
        String str14;
        Boolean bool4;
        String str15;
        String str16;
        MarketMarketItemAvailability marketMarketItemAvailability3 = (i10 & 1) != 0 ? marketMarketItem.availability : marketMarketItemAvailability;
        MarketMarketCategory marketMarketCategory3 = (i10 & 2) != 0 ? marketMarketItem.category : marketMarketCategory;
        String str17 = (i10 & 4) != 0 ? marketMarketItem.description : str;
        int i12 = (i10 & 8) != 0 ? marketMarketItem.f15188id : i;
        UserId userId3 = (i10 & 16) != 0 ? marketMarketItem.ownerId : userId;
        MarketPrice marketPrice3 = (i10 & 32) != 0 ? marketMarketItem.price : marketPrice;
        String str18 = (i10 & 64) != 0 ? marketMarketItem.title : str2;
        String str19 = (i10 & 128) != 0 ? marketMarketItem.accessKey : str3;
        String str20 = (i10 & 256) != 0 ? marketMarketItem.buttonTitle : str4;
        Integer num5 = (i10 & 512) != 0 ? marketMarketItem.date : num;
        String str21 = (i10 & 1024) != 0 ? marketMarketItem.externalId : str5;
        Boolean bool5 = (i10 & 2048) != 0 ? marketMarketItem.isFavorite : bool;
        String str22 = (i10 & 4096) != 0 ? marketMarketItem.thumbPhoto : str6;
        String str23 = (i10 & 8192) != 0 ? marketMarketItem.url : str7;
        MarketMarketItemAvailability marketMarketItemAvailability4 = marketMarketItemAvailability3;
        Integer num6 = (i10 & 16384) != 0 ? marketMarketItem.variantsGroupingId : num2;
        Boolean bool6 = (i10 & 32768) != 0 ? marketMarketItem.isMainVariant : bool2;
        if ((i10 & 65536) != 0) {
            bool3 = bool6;
            str9 = marketMarketItem.sku;
            num3 = num6;
            marketMarketCategory2 = marketMarketCategory3;
            str10 = str17;
            i11 = i12;
            userId2 = userId3;
            marketPrice2 = marketPrice3;
            str11 = str18;
            str12 = str19;
            str13 = str20;
            num4 = num5;
            str14 = str21;
            bool4 = bool5;
            str15 = str22;
            str16 = str23;
            marketMarketItemAvailability2 = marketMarketItemAvailability4;
            marketMarketItem2 = marketMarketItem;
        } else {
            str9 = str8;
            bool3 = bool6;
            marketMarketItemAvailability2 = marketMarketItemAvailability4;
            marketMarketItem2 = marketMarketItem;
            num3 = num6;
            marketMarketCategory2 = marketMarketCategory3;
            str10 = str17;
            i11 = i12;
            userId2 = userId3;
            marketPrice2 = marketPrice3;
            str11 = str18;
            str12 = str19;
            str13 = str20;
            num4 = num5;
            str14 = str21;
            bool4 = bool5;
            str15 = str22;
            str16 = str23;
        }
        return marketMarketItem2.copy(marketMarketItemAvailability2, marketMarketCategory2, str10, i11, userId2, marketPrice2, str11, str12, str13, num4, str14, bool4, str15, str16, num3, bool3, str9);
    }

    @NotNull
    public final MarketMarketItemAvailability component1() {
        return this.availability;
    }

    @Nullable
    public final Integer component10() {
        return this.date;
    }

    @Nullable
    public final String component11() {
        return this.externalId;
    }

    @Nullable
    public final Boolean component12() {
        return this.isFavorite;
    }

    @Nullable
    public final String component13() {
        return this.thumbPhoto;
    }

    @Nullable
    public final String component14() {
        return this.url;
    }

    @Nullable
    public final Integer component15() {
        return this.variantsGroupingId;
    }

    @Nullable
    public final Boolean component16() {
        return this.isMainVariant;
    }

    @Nullable
    public final String component17() {
        return this.sku;
    }

    @NotNull
    public final MarketMarketCategory component2() {
        return this.category;
    }

    @NotNull
    public final String component3() {
        return this.description;
    }

    public final int component4() {
        return this.f15188id;
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
    public final String component8() {
        return this.accessKey;
    }

    @Nullable
    public final String component9() {
        return this.buttonTitle;
    }

    @NotNull
    public final MarketMarketItem copy(@NotNull MarketMarketItemAvailability availability, @NotNull MarketMarketCategory category, @NotNull String description, int i, @NotNull UserId ownerId, @NotNull MarketPrice price, @NotNull String title, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(availability, "availability");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        return new MarketMarketItem(availability, category, description, i, ownerId, price, title, str, str2, num, str3, bool, str4, str5, num2, bool2, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketItem)) {
            return false;
        }
        MarketMarketItem marketMarketItem = (MarketMarketItem) obj;
        return this.availability == marketMarketItem.availability && Intrinsics.a(this.category, marketMarketItem.category) && Intrinsics.a(this.description, marketMarketItem.description) && this.f15188id == marketMarketItem.f15188id && Intrinsics.a(this.ownerId, marketMarketItem.ownerId) && Intrinsics.a(this.price, marketMarketItem.price) && Intrinsics.a(this.title, marketMarketItem.title) && Intrinsics.a(this.accessKey, marketMarketItem.accessKey) && Intrinsics.a(this.buttonTitle, marketMarketItem.buttonTitle) && Intrinsics.a(this.date, marketMarketItem.date) && Intrinsics.a(this.externalId, marketMarketItem.externalId) && Intrinsics.a(this.isFavorite, marketMarketItem.isFavorite) && Intrinsics.a(this.thumbPhoto, marketMarketItem.thumbPhoto) && Intrinsics.a(this.url, marketMarketItem.url) && Intrinsics.a(this.variantsGroupingId, marketMarketItem.variantsGroupingId) && Intrinsics.a(this.isMainVariant, marketMarketItem.isMainVariant) && Intrinsics.a(this.sku, marketMarketItem.sku);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @NotNull
    public final MarketMarketItemAvailability getAvailability() {
        return this.availability;
    }

    @Nullable
    public final String getButtonTitle() {
        return this.buttonTitle;
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
        return this.f15188id;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @NotNull
    public final MarketPrice getPrice() {
        return this.price;
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
    public final Integer getVariantsGroupingId() {
        return this.variantsGroupingId;
    }

    public int hashCode() {
        int iE = a.e((this.price.hashCode() + o.e(this.ownerId, u.g(this.f15188id, a.e((this.category.hashCode() + (this.availability.hashCode() * 31)) * 31, 31, this.description), 31), 31)) * 31, 31, this.title);
        String str = this.accessKey;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.date;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.externalId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.thumbPhoto;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.variantsGroupingId;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isMainVariant;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.sku;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
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
        int i = this.f15188id;
        UserId userId = this.ownerId;
        MarketPrice marketPrice = this.price;
        String str2 = this.title;
        String str3 = this.accessKey;
        String str4 = this.buttonTitle;
        Integer num = this.date;
        String str5 = this.externalId;
        Boolean bool = this.isFavorite;
        String str6 = this.thumbPhoto;
        String str7 = this.url;
        Integer num2 = this.variantsGroupingId;
        Boolean bool2 = this.isMainVariant;
        String str8 = this.sku;
        StringBuilder sb2 = new StringBuilder("MarketMarketItem(availability=");
        sb2.append(marketMarketItemAvailability);
        sb2.append(", category=");
        sb2.append(marketMarketCategory);
        sb2.append(", description=");
        o.p(i, str, ", id=", ", ownerId=", sb2);
        sb2.append(userId);
        sb2.append(", price=");
        sb2.append(marketPrice);
        sb2.append(", title=");
        o.t(sb2, str2, ", accessKey=", str3, ", buttonTitle=");
        a.r(num, str4, ", date=", ", externalId=", sb2);
        sb2.append(str5);
        sb2.append(", isFavorite=");
        sb2.append(bool);
        sb2.append(", thumbPhoto=");
        o.t(sb2, str6, ", url=", str7, ", variantsGroupingId=");
        sb2.append(num2);
        sb2.append(", isMainVariant=");
        sb2.append(bool2);
        sb2.append(", sku=");
        return u.o(sb2, str8, ")");
    }

    public /* synthetic */ MarketMarketItem(MarketMarketItemAvailability marketMarketItemAvailability, MarketMarketCategory marketMarketCategory, String str, int i, UserId userId, MarketPrice marketPrice, String str2, String str3, String str4, Integer num, String str5, Boolean bool, String str6, String str7, Integer num2, Boolean bool2, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(marketMarketItemAvailability, marketMarketCategory, str, i, userId, marketPrice, str2, (i10 & 128) != 0 ? null : str3, (i10 & 256) != 0 ? null : str4, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : str5, (i10 & 2048) != 0 ? null : bool, (i10 & 4096) != 0 ? null : str6, (i10 & 8192) != 0 ? null : str7, (i10 & 16384) != 0 ? null : num2, (32768 & i10) != 0 ? null : bool2, (i10 & 65536) != 0 ? null : str8);
    }
}
