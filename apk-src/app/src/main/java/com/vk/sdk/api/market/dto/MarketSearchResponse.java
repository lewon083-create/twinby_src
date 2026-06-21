package com.vk.sdk.api.market.dto;

import a0.u;
import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import gf.a;
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
public final class MarketSearchResponse {

    @b("count")
    private final int count;

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("items")
    @NotNull
    private final List<MarketMarketItem> items;

    @b("variants")
    @Nullable
    private final List<MarketMarketItem> variants;

    @b("view_type")
    @NotNull
    private final MarketServicesViewType viewType;

    public MarketSearchResponse(int i, @NotNull MarketServicesViewType viewType, @NotNull List<MarketMarketItem> items, @Nullable List<MarketMarketItem> list, @Nullable List<GroupsGroupFull> list2) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.count = i;
        this.viewType = viewType;
        this.items = items;
        this.variants = list;
        this.groups = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketSearchResponse copy$default(MarketSearchResponse marketSearchResponse, int i, MarketServicesViewType marketServicesViewType, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = marketSearchResponse.count;
        }
        if ((i10 & 2) != 0) {
            marketServicesViewType = marketSearchResponse.viewType;
        }
        if ((i10 & 4) != 0) {
            list = marketSearchResponse.items;
        }
        if ((i10 & 8) != 0) {
            list2 = marketSearchResponse.variants;
        }
        if ((i10 & 16) != 0) {
            list3 = marketSearchResponse.groups;
        }
        List list4 = list3;
        List list5 = list;
        return marketSearchResponse.copy(i, marketServicesViewType, list5, list2, list4);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final MarketServicesViewType component2() {
        return this.viewType;
    }

    @NotNull
    public final List<MarketMarketItem> component3() {
        return this.items;
    }

    @Nullable
    public final List<MarketMarketItem> component4() {
        return this.variants;
    }

    @Nullable
    public final List<GroupsGroupFull> component5() {
        return this.groups;
    }

    @NotNull
    public final MarketSearchResponse copy(int i, @NotNull MarketServicesViewType viewType, @NotNull List<MarketMarketItem> items, @Nullable List<MarketMarketItem> list, @Nullable List<GroupsGroupFull> list2) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(items, "items");
        return new MarketSearchResponse(i, viewType, items, list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSearchResponse)) {
            return false;
        }
        MarketSearchResponse marketSearchResponse = (MarketSearchResponse) obj;
        return this.count == marketSearchResponse.count && this.viewType == marketSearchResponse.viewType && Intrinsics.a(this.items, marketSearchResponse.items) && Intrinsics.a(this.variants, marketSearchResponse.variants) && Intrinsics.a(this.groups, marketSearchResponse.groups);
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @NotNull
    public final List<MarketMarketItem> getItems() {
        return this.items;
    }

    @Nullable
    public final List<MarketMarketItem> getVariants() {
        return this.variants;
    }

    @NotNull
    public final MarketServicesViewType getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int i = u.i(this.items, (this.viewType.hashCode() + (Integer.hashCode(this.count) * 31)) * 31, 31);
        List<MarketMarketItem> list = this.variants;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFull> list2 = this.groups;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.count;
        MarketServicesViewType marketServicesViewType = this.viewType;
        List<MarketMarketItem> list = this.items;
        List<MarketMarketItem> list2 = this.variants;
        List<GroupsGroupFull> list3 = this.groups;
        StringBuilder sb2 = new StringBuilder("MarketSearchResponse(count=");
        sb2.append(i);
        sb2.append(", viewType=");
        sb2.append(marketServicesViewType);
        sb2.append(", items=");
        a.u(sb2, list, ", variants=", list2, ", groups=");
        return z.h(sb2, list3, ")");
    }

    public /* synthetic */ MarketSearchResponse(int i, MarketServicesViewType marketServicesViewType, List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, marketServicesViewType, list, (i10 & 8) != 0 ? null : list2, (i10 & 16) != 0 ? null : list3);
    }
}
