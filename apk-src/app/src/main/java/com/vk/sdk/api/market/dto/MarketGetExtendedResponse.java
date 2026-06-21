package com.vk.sdk.api.market.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public final class MarketGetExtendedResponse {

    @b("count")
    @Nullable
    private final Integer count;

    @b("items")
    @Nullable
    private final List<MarketMarketItemFull> items;

    @b("variants")
    @Nullable
    private final List<MarketMarketItemFull> variants;

    public MarketGetExtendedResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketGetExtendedResponse copy$default(MarketGetExtendedResponse marketGetExtendedResponse, Integer num, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = marketGetExtendedResponse.count;
        }
        if ((i & 2) != 0) {
            list = marketGetExtendedResponse.items;
        }
        if ((i & 4) != 0) {
            list2 = marketGetExtendedResponse.variants;
        }
        return marketGetExtendedResponse.copy(num, list, list2);
    }

    @Nullable
    public final Integer component1() {
        return this.count;
    }

    @Nullable
    public final List<MarketMarketItemFull> component2() {
        return this.items;
    }

    @Nullable
    public final List<MarketMarketItemFull> component3() {
        return this.variants;
    }

    @NotNull
    public final MarketGetExtendedResponse copy(@Nullable Integer num, @Nullable List<MarketMarketItemFull> list, @Nullable List<MarketMarketItemFull> list2) {
        return new MarketGetExtendedResponse(num, list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetExtendedResponse)) {
            return false;
        }
        MarketGetExtendedResponse marketGetExtendedResponse = (MarketGetExtendedResponse) obj;
        return Intrinsics.a(this.count, marketGetExtendedResponse.count) && Intrinsics.a(this.items, marketGetExtendedResponse.items) && Intrinsics.a(this.variants, marketGetExtendedResponse.variants);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final List<MarketMarketItemFull> getItems() {
        return this.items;
    }

    @Nullable
    public final List<MarketMarketItemFull> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<MarketMarketItemFull> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MarketMarketItemFull> list2 = this.variants;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.count;
        List<MarketMarketItemFull> list = this.items;
        List<MarketMarketItemFull> list2 = this.variants;
        StringBuilder sb2 = new StringBuilder("MarketGetExtendedResponse(count=");
        sb2.append(num);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", variants=");
        return z.h(sb2, list2, ")");
    }

    public MarketGetExtendedResponse(@Nullable Integer num, @Nullable List<MarketMarketItemFull> list, @Nullable List<MarketMarketItemFull> list2) {
        this.count = num;
        this.items = list;
        this.variants = list2;
    }

    public /* synthetic */ MarketGetExtendedResponse(Integer num, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
