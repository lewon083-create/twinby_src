package com.vk.sdk.api.market.dto;

import a0.u;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class MarketSearchExtendedResponse {

    @b("count")
    private final int count;

    @b("items")
    @NotNull
    private final List<MarketMarketItemFull> items;

    @b("variants")
    @Nullable
    private final List<MarketMarketItemFull> variants;

    @b("view_type")
    @NotNull
    private final MarketServicesViewType viewType;

    public MarketSearchExtendedResponse(int i, @NotNull MarketServicesViewType viewType, @NotNull List<MarketMarketItemFull> items, @Nullable List<MarketMarketItemFull> list) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.count = i;
        this.viewType = viewType;
        this.items = items;
        this.variants = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketSearchExtendedResponse copy$default(MarketSearchExtendedResponse marketSearchExtendedResponse, int i, MarketServicesViewType marketServicesViewType, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = marketSearchExtendedResponse.count;
        }
        if ((i10 & 2) != 0) {
            marketServicesViewType = marketSearchExtendedResponse.viewType;
        }
        if ((i10 & 4) != 0) {
            list = marketSearchExtendedResponse.items;
        }
        if ((i10 & 8) != 0) {
            list2 = marketSearchExtendedResponse.variants;
        }
        return marketSearchExtendedResponse.copy(i, marketServicesViewType, list, list2);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final MarketServicesViewType component2() {
        return this.viewType;
    }

    @NotNull
    public final List<MarketMarketItemFull> component3() {
        return this.items;
    }

    @Nullable
    public final List<MarketMarketItemFull> component4() {
        return this.variants;
    }

    @NotNull
    public final MarketSearchExtendedResponse copy(int i, @NotNull MarketServicesViewType viewType, @NotNull List<MarketMarketItemFull> items, @Nullable List<MarketMarketItemFull> list) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(items, "items");
        return new MarketSearchExtendedResponse(i, viewType, items, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSearchExtendedResponse)) {
            return false;
        }
        MarketSearchExtendedResponse marketSearchExtendedResponse = (MarketSearchExtendedResponse) obj;
        return this.count == marketSearchExtendedResponse.count && this.viewType == marketSearchExtendedResponse.viewType && Intrinsics.a(this.items, marketSearchExtendedResponse.items) && Intrinsics.a(this.variants, marketSearchExtendedResponse.variants);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<MarketMarketItemFull> getItems() {
        return this.items;
    }

    @Nullable
    public final List<MarketMarketItemFull> getVariants() {
        return this.variants;
    }

    @NotNull
    public final MarketServicesViewType getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int i = u.i(this.items, (this.viewType.hashCode() + (Integer.hashCode(this.count) * 31)) * 31, 31);
        List<MarketMarketItemFull> list = this.variants;
        return i + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.count;
        MarketServicesViewType marketServicesViewType = this.viewType;
        List<MarketMarketItemFull> list = this.items;
        List<MarketMarketItemFull> list2 = this.variants;
        StringBuilder sb2 = new StringBuilder("MarketSearchExtendedResponse(count=");
        sb2.append(i);
        sb2.append(", viewType=");
        sb2.append(marketServicesViewType);
        sb2.append(", items=");
        return a.l(sb2, list, ", variants=", list2, ")");
    }

    public /* synthetic */ MarketSearchExtendedResponse(int i, MarketServicesViewType marketServicesViewType, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, marketServicesViewType, list, (i10 & 8) != 0 ? null : list2);
    }
}
