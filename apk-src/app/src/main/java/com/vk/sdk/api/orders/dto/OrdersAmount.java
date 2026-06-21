package com.vk.sdk.api.orders.dto;

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
public final class OrdersAmount {

    @b("amounts")
    @Nullable
    private final List<OrdersAmountItem> amounts;

    @b("currency")
    @Nullable
    private final String currency;

    public OrdersAmount() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrdersAmount copy$default(OrdersAmount ordersAmount, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ordersAmount.amounts;
        }
        if ((i & 2) != 0) {
            str = ordersAmount.currency;
        }
        return ordersAmount.copy(list, str);
    }

    @Nullable
    public final List<OrdersAmountItem> component1() {
        return this.amounts;
    }

    @Nullable
    public final String component2() {
        return this.currency;
    }

    @NotNull
    public final OrdersAmount copy(@Nullable List<OrdersAmountItem> list, @Nullable String str) {
        return new OrdersAmount(list, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersAmount)) {
            return false;
        }
        OrdersAmount ordersAmount = (OrdersAmount) obj;
        return Intrinsics.a(this.amounts, ordersAmount.amounts) && Intrinsics.a(this.currency, ordersAmount.currency);
    }

    @Nullable
    public final List<OrdersAmountItem> getAmounts() {
        return this.amounts;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        List<OrdersAmountItem> list = this.amounts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.currency;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrdersAmount(amounts=" + this.amounts + ", currency=" + this.currency + ")";
    }

    public OrdersAmount(@Nullable List<OrdersAmountItem> list, @Nullable String str) {
        this.amounts = list;
        this.currency = str;
    }

    public /* synthetic */ OrdersAmount(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
