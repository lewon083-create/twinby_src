package com.vk.sdk.api.groups.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.market.dto.MarketCurrency;
import com.vk.sdk.api.market.dto.MarketPrice;
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
public final class GroupsMarketInfo {

    @b("contact_id")
    @Nullable
    private final Integer contactId;

    @b("currency")
    @Nullable
    private final MarketCurrency currency;

    @b("currency_text")
    @Nullable
    private final String currencyText;

    @b("enabled")
    @Nullable
    private final BaseBoolInt enabled;

    @b("main_album_id")
    @Nullable
    private final Integer mainAlbumId;

    @b("min_order_price")
    @Nullable
    private final MarketPrice minOrderPrice;

    @b("price_max")
    @Nullable
    private final String priceMax;

    @b("price_min")
    @Nullable
    private final String priceMin;

    @b("type")
    @Nullable
    private final String type;

    public GroupsMarketInfo() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ GroupsMarketInfo copy$default(GroupsMarketInfo groupsMarketInfo, String str, Integer num, MarketCurrency marketCurrency, String str2, BaseBoolInt baseBoolInt, Integer num2, String str3, String str4, MarketPrice marketPrice, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupsMarketInfo.type;
        }
        if ((i & 2) != 0) {
            num = groupsMarketInfo.contactId;
        }
        if ((i & 4) != 0) {
            marketCurrency = groupsMarketInfo.currency;
        }
        if ((i & 8) != 0) {
            str2 = groupsMarketInfo.currencyText;
        }
        if ((i & 16) != 0) {
            baseBoolInt = groupsMarketInfo.enabled;
        }
        if ((i & 32) != 0) {
            num2 = groupsMarketInfo.mainAlbumId;
        }
        if ((i & 64) != 0) {
            str3 = groupsMarketInfo.priceMax;
        }
        if ((i & 128) != 0) {
            str4 = groupsMarketInfo.priceMin;
        }
        if ((i & 256) != 0) {
            marketPrice = groupsMarketInfo.minOrderPrice;
        }
        String str5 = str4;
        MarketPrice marketPrice2 = marketPrice;
        Integer num3 = num2;
        String str6 = str3;
        BaseBoolInt baseBoolInt2 = baseBoolInt;
        MarketCurrency marketCurrency2 = marketCurrency;
        return groupsMarketInfo.copy(str, num, marketCurrency2, str2, baseBoolInt2, num3, str6, str5, marketPrice2);
    }

    @Nullable
    public final String component1() {
        return this.type;
    }

    @Nullable
    public final Integer component2() {
        return this.contactId;
    }

    @Nullable
    public final MarketCurrency component3() {
        return this.currency;
    }

    @Nullable
    public final String component4() {
        return this.currencyText;
    }

    @Nullable
    public final BaseBoolInt component5() {
        return this.enabled;
    }

    @Nullable
    public final Integer component6() {
        return this.mainAlbumId;
    }

    @Nullable
    public final String component7() {
        return this.priceMax;
    }

    @Nullable
    public final String component8() {
        return this.priceMin;
    }

    @Nullable
    public final MarketPrice component9() {
        return this.minOrderPrice;
    }

    @NotNull
    public final GroupsMarketInfo copy(@Nullable String str, @Nullable Integer num, @Nullable MarketCurrency marketCurrency, @Nullable String str2, @Nullable BaseBoolInt baseBoolInt, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable MarketPrice marketPrice) {
        return new GroupsMarketInfo(str, num, marketCurrency, str2, baseBoolInt, num2, str3, str4, marketPrice);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsMarketInfo)) {
            return false;
        }
        GroupsMarketInfo groupsMarketInfo = (GroupsMarketInfo) obj;
        return Intrinsics.a(this.type, groupsMarketInfo.type) && Intrinsics.a(this.contactId, groupsMarketInfo.contactId) && Intrinsics.a(this.currency, groupsMarketInfo.currency) && Intrinsics.a(this.currencyText, groupsMarketInfo.currencyText) && this.enabled == groupsMarketInfo.enabled && Intrinsics.a(this.mainAlbumId, groupsMarketInfo.mainAlbumId) && Intrinsics.a(this.priceMax, groupsMarketInfo.priceMax) && Intrinsics.a(this.priceMin, groupsMarketInfo.priceMin) && Intrinsics.a(this.minOrderPrice, groupsMarketInfo.minOrderPrice);
    }

    @Nullable
    public final Integer getContactId() {
        return this.contactId;
    }

    @Nullable
    public final MarketCurrency getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyText() {
        return this.currencyText;
    }

    @Nullable
    public final BaseBoolInt getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final Integer getMainAlbumId() {
        return this.mainAlbumId;
    }

    @Nullable
    public final MarketPrice getMinOrderPrice() {
        return this.minOrderPrice;
    }

    @Nullable
    public final String getPriceMax() {
        return this.priceMax;
    }

    @Nullable
    public final String getPriceMin() {
        return this.priceMin;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.contactId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        MarketCurrency marketCurrency = this.currency;
        int iHashCode3 = (iHashCode2 + (marketCurrency == null ? 0 : marketCurrency.hashCode())) * 31;
        String str2 = this.currencyText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.enabled;
        int iHashCode5 = (iHashCode4 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        Integer num2 = this.mainAlbumId;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.priceMax;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceMin;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MarketPrice marketPrice = this.minOrderPrice;
        return iHashCode8 + (marketPrice != null ? marketPrice.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        Integer num = this.contactId;
        MarketCurrency marketCurrency = this.currency;
        String str2 = this.currencyText;
        BaseBoolInt baseBoolInt = this.enabled;
        Integer num2 = this.mainAlbumId;
        String str3 = this.priceMax;
        String str4 = this.priceMin;
        MarketPrice marketPrice = this.minOrderPrice;
        StringBuilder sb2 = new StringBuilder("GroupsMarketInfo(type=");
        sb2.append(str);
        sb2.append(", contactId=");
        sb2.append(num);
        sb2.append(", currency=");
        sb2.append(marketCurrency);
        sb2.append(", currencyText=");
        sb2.append(str2);
        sb2.append(", enabled=");
        sb2.append(baseBoolInt);
        sb2.append(", mainAlbumId=");
        sb2.append(num2);
        sb2.append(", priceMax=");
        o.t(sb2, str3, ", priceMin=", str4, ", minOrderPrice=");
        sb2.append(marketPrice);
        sb2.append(")");
        return sb2.toString();
    }

    public GroupsMarketInfo(@Nullable String str, @Nullable Integer num, @Nullable MarketCurrency marketCurrency, @Nullable String str2, @Nullable BaseBoolInt baseBoolInt, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable MarketPrice marketPrice) {
        this.type = str;
        this.contactId = num;
        this.currency = marketCurrency;
        this.currencyText = str2;
        this.enabled = baseBoolInt;
        this.mainAlbumId = num2;
        this.priceMax = str3;
        this.priceMin = str4;
        this.minOrderPrice = marketPrice;
    }

    public /* synthetic */ GroupsMarketInfo(String str, Integer num, MarketCurrency marketCurrency, String str2, BaseBoolInt baseBoolInt, Integer num2, String str3, String str4, MarketPrice marketPrice, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : marketCurrency, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : baseBoolInt, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : marketPrice);
    }
}
