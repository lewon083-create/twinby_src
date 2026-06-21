package com.vk.sdk.api.market.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import io.sentry.clientreport.DiscardedEvent;
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
public final class MarketOrderItem {

    @b("item")
    @NotNull
    private final MarketMarketItem item;

    @b("item_id")
    private final int itemId;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("price")
    @NotNull
    private final MarketPrice price;

    @b(DiscardedEvent.JsonKeys.QUANTITY)
    private final int quantity;

    @b("title")
    @Nullable
    private final String title;

    @b("variants")
    @Nullable
    private final List<String> variants;

    public MarketOrderItem(@NotNull UserId ownerId, int i, @NotNull MarketPrice price, int i10, @NotNull MarketMarketItem item, @Nullable String str, @Nullable PhotosPhoto photosPhoto, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(item, "item");
        this.ownerId = ownerId;
        this.itemId = i;
        this.price = price;
        this.quantity = i10;
        this.item = item;
        this.title = str;
        this.photo = photosPhoto;
        this.variants = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketOrderItem copy$default(MarketOrderItem marketOrderItem, UserId userId, int i, MarketPrice marketPrice, int i10, MarketMarketItem marketMarketItem, String str, PhotosPhoto photosPhoto, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            userId = marketOrderItem.ownerId;
        }
        if ((i11 & 2) != 0) {
            i = marketOrderItem.itemId;
        }
        if ((i11 & 4) != 0) {
            marketPrice = marketOrderItem.price;
        }
        if ((i11 & 8) != 0) {
            i10 = marketOrderItem.quantity;
        }
        if ((i11 & 16) != 0) {
            marketMarketItem = marketOrderItem.item;
        }
        if ((i11 & 32) != 0) {
            str = marketOrderItem.title;
        }
        if ((i11 & 64) != 0) {
            photosPhoto = marketOrderItem.photo;
        }
        if ((i11 & 128) != 0) {
            list = marketOrderItem.variants;
        }
        PhotosPhoto photosPhoto2 = photosPhoto;
        List list2 = list;
        MarketMarketItem marketMarketItem2 = marketMarketItem;
        String str2 = str;
        return marketOrderItem.copy(userId, i, marketPrice, i10, marketMarketItem2, str2, photosPhoto2, list2);
    }

    @NotNull
    public final UserId component1() {
        return this.ownerId;
    }

    public final int component2() {
        return this.itemId;
    }

    @NotNull
    public final MarketPrice component3() {
        return this.price;
    }

    public final int component4() {
        return this.quantity;
    }

    @NotNull
    public final MarketMarketItem component5() {
        return this.item;
    }

    @Nullable
    public final String component6() {
        return this.title;
    }

    @Nullable
    public final PhotosPhoto component7() {
        return this.photo;
    }

    @Nullable
    public final List<String> component8() {
        return this.variants;
    }

    @NotNull
    public final MarketOrderItem copy(@NotNull UserId ownerId, int i, @NotNull MarketPrice price, int i10, @NotNull MarketMarketItem item, @Nullable String str, @Nullable PhotosPhoto photosPhoto, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(item, "item");
        return new MarketOrderItem(ownerId, i, price, i10, item, str, photosPhoto, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOrderItem)) {
            return false;
        }
        MarketOrderItem marketOrderItem = (MarketOrderItem) obj;
        return Intrinsics.a(this.ownerId, marketOrderItem.ownerId) && this.itemId == marketOrderItem.itemId && Intrinsics.a(this.price, marketOrderItem.price) && this.quantity == marketOrderItem.quantity && Intrinsics.a(this.item, marketOrderItem.item) && Intrinsics.a(this.title, marketOrderItem.title) && Intrinsics.a(this.photo, marketOrderItem.photo) && Intrinsics.a(this.variants, marketOrderItem.variants);
    }

    @NotNull
    public final MarketMarketItem getItem() {
        return this.item;
    }

    public final int getItemId() {
        return this.itemId;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @NotNull
    public final MarketPrice getPrice() {
        return this.price;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final List<String> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        int iHashCode = (this.item.hashCode() + u.g(this.quantity, (this.price.hashCode() + u.g(this.itemId, this.ownerId.hashCode() * 31, 31)) * 31, 31)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photo;
        int iHashCode3 = (iHashCode2 + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        List<String> list = this.variants;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketOrderItem(ownerId=" + this.ownerId + ", itemId=" + this.itemId + ", price=" + this.price + ", quantity=" + this.quantity + ", item=" + this.item + ", title=" + this.title + ", photo=" + this.photo + ", variants=" + this.variants + ")";
    }

    public /* synthetic */ MarketOrderItem(UserId userId, int i, MarketPrice marketPrice, int i10, MarketMarketItem marketMarketItem, String str, PhotosPhoto photosPhoto, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, i, marketPrice, i10, marketMarketItem, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : photosPhoto, (i11 & 128) != 0 ? null : list);
    }
}
