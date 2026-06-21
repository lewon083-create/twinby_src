package com.vk.sdk.api.orders.dto;

import a0.u;
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
public final class OrdersAmountItem {

    @b("amount")
    @Nullable
    private final Float amount;

    @b("description")
    @Nullable
    private final String description;

    @b("votes")
    @Nullable
    private final String votes;

    public OrdersAmountItem() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OrdersAmountItem copy$default(OrdersAmountItem ordersAmountItem, Float f10, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            f10 = ordersAmountItem.amount;
        }
        if ((i & 2) != 0) {
            str = ordersAmountItem.description;
        }
        if ((i & 4) != 0) {
            str2 = ordersAmountItem.votes;
        }
        return ordersAmountItem.copy(f10, str, str2);
    }

    @Nullable
    public final Float component1() {
        return this.amount;
    }

    @Nullable
    public final String component2() {
        return this.description;
    }

    @Nullable
    public final String component3() {
        return this.votes;
    }

    @NotNull
    public final OrdersAmountItem copy(@Nullable Float f10, @Nullable String str, @Nullable String str2) {
        return new OrdersAmountItem(f10, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersAmountItem)) {
            return false;
        }
        OrdersAmountItem ordersAmountItem = (OrdersAmountItem) obj;
        return Intrinsics.a(this.amount, ordersAmountItem.amount) && Intrinsics.a(this.description, ordersAmountItem.description) && Intrinsics.a(this.votes, ordersAmountItem.votes);
    }

    @Nullable
    public final Float getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getVotes() {
        return this.votes;
    }

    public int hashCode() {
        Float f10 = this.amount;
        int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.votes;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Float f10 = this.amount;
        String str = this.description;
        String str2 = this.votes;
        StringBuilder sb2 = new StringBuilder("OrdersAmountItem(amount=");
        sb2.append(f10);
        sb2.append(", description=");
        sb2.append(str);
        sb2.append(", votes=");
        return u.o(sb2, str2, ")");
    }

    public OrdersAmountItem(@Nullable Float f10, @Nullable String str, @Nullable String str2) {
        this.amount = f10;
        this.description = str;
        this.votes = str2;
    }

    public /* synthetic */ OrdersAmountItem(Float f10, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f10, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
