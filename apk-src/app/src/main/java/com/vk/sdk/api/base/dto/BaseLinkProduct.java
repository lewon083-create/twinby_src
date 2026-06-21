package com.vk.sdk.api.base.dto;

import a0.u;
import com.vk.sdk.api.market.dto.MarketPrice;
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
public final class BaseLinkProduct {

    @b("merchant")
    @Nullable
    private final String merchant;

    @b("orders_count")
    @Nullable
    private final Integer ordersCount;

    @b("price")
    @NotNull
    private final MarketPrice price;

    public BaseLinkProduct(@NotNull MarketPrice price, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.price = price;
        this.merchant = str;
        this.ordersCount = num;
    }

    public static /* synthetic */ BaseLinkProduct copy$default(BaseLinkProduct baseLinkProduct, MarketPrice marketPrice, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            marketPrice = baseLinkProduct.price;
        }
        if ((i & 2) != 0) {
            str = baseLinkProduct.merchant;
        }
        if ((i & 4) != 0) {
            num = baseLinkProduct.ordersCount;
        }
        return baseLinkProduct.copy(marketPrice, str, num);
    }

    @NotNull
    public final MarketPrice component1() {
        return this.price;
    }

    @Nullable
    public final String component2() {
        return this.merchant;
    }

    @Nullable
    public final Integer component3() {
        return this.ordersCount;
    }

    @NotNull
    public final BaseLinkProduct copy(@NotNull MarketPrice price, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(price, "price");
        return new BaseLinkProduct(price, str, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkProduct)) {
            return false;
        }
        BaseLinkProduct baseLinkProduct = (BaseLinkProduct) obj;
        return Intrinsics.a(this.price, baseLinkProduct.price) && Intrinsics.a(this.merchant, baseLinkProduct.merchant) && Intrinsics.a(this.ordersCount, baseLinkProduct.ordersCount);
    }

    @Nullable
    public final String getMerchant() {
        return this.merchant;
    }

    @Nullable
    public final Integer getOrdersCount() {
        return this.ordersCount;
    }

    @NotNull
    public final MarketPrice getPrice() {
        return this.price;
    }

    public int hashCode() {
        int iHashCode = this.price.hashCode() * 31;
        String str = this.merchant;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.ordersCount;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        MarketPrice marketPrice = this.price;
        String str = this.merchant;
        Integer num = this.ordersCount;
        StringBuilder sb2 = new StringBuilder("BaseLinkProduct(price=");
        sb2.append(marketPrice);
        sb2.append(", merchant=");
        sb2.append(str);
        sb2.append(", ordersCount=");
        return u.m(sb2, num, ")");
    }

    public /* synthetic */ BaseLinkProduct(MarketPrice marketPrice, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(marketPrice, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
