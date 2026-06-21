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
public final class MarketGetOrdersExtendedResponse {

    @b("count")
    private final int count;

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("items")
    @NotNull
    private final List<MarketOrder> items;

    public MarketGetOrdersExtendedResponse(int i, @NotNull List<MarketOrder> items, @Nullable List<GroupsGroupFull> list) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.count = i;
        this.items = items;
        this.groups = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketGetOrdersExtendedResponse copy$default(MarketGetOrdersExtendedResponse marketGetOrdersExtendedResponse, int i, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = marketGetOrdersExtendedResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = marketGetOrdersExtendedResponse.items;
        }
        if ((i10 & 4) != 0) {
            list2 = marketGetOrdersExtendedResponse.groups;
        }
        return marketGetOrdersExtendedResponse.copy(i, list, list2);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<MarketOrder> component2() {
        return this.items;
    }

    @Nullable
    public final List<GroupsGroupFull> component3() {
        return this.groups;
    }

    @NotNull
    public final MarketGetOrdersExtendedResponse copy(int i, @NotNull List<MarketOrder> items, @Nullable List<GroupsGroupFull> list) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new MarketGetOrdersExtendedResponse(i, items, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetOrdersExtendedResponse)) {
            return false;
        }
        MarketGetOrdersExtendedResponse marketGetOrdersExtendedResponse = (MarketGetOrdersExtendedResponse) obj;
        return this.count == marketGetOrdersExtendedResponse.count && Intrinsics.a(this.items, marketGetOrdersExtendedResponse.items) && Intrinsics.a(this.groups, marketGetOrdersExtendedResponse.groups);
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @NotNull
    public final List<MarketOrder> getItems() {
        return this.items;
    }

    public int hashCode() {
        int i = u.i(this.items, Integer.hashCode(this.count) * 31, 31);
        List<GroupsGroupFull> list = this.groups;
        return i + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<MarketOrder> list = this.items;
        return z.h(a.m(i, "MarketGetOrdersExtendedResponse(count=", ", items=", ", groups=", list), this.groups, ")");
    }

    public /* synthetic */ MarketGetOrdersExtendedResponse(int i, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i10 & 4) != 0 ? null : list2);
    }
}
