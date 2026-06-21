package com.vk.sdk.api.orders.dto;

import com.google.android.gms.internal.ads.om1;
import gf.a;
import io.sentry.ProfilingTraceData;
import io.sentry.TraceContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class OrdersOrder {

    @b("amount")
    @NotNull
    private final String amount;

    @b("app_order_id")
    @NotNull
    private final String appOrderId;

    @b("cancel_transaction_id")
    @Nullable
    private final String cancelTransactionId;

    @b("date")
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final String f15210id;

    @b("item")
    @NotNull
    private final String item;

    @b("receiver_id")
    @NotNull
    private final String receiverId;

    @b("status")
    @NotNull
    private final Status status;

    @b(ProfilingTraceData.JsonKeys.TRANSACTION_ID)
    @Nullable
    private final String transactionId;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final String userId;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Status {
        CREATED("created"),
        CHARGED("charged"),
        REFUNDED("refunded"),
        CHARGEABLE("chargeable"),
        CANCELLED("cancelled"),
        DECLINED("declined");


        @NotNull
        private final String value;

        Status(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public OrdersOrder(@NotNull String amount, @NotNull String appOrderId, @NotNull String date, @NotNull String id2, @NotNull String item, @NotNull String receiverId, @NotNull Status status, @NotNull String userId, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(appOrderId, "appOrderId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(receiverId, "receiverId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.amount = amount;
        this.appOrderId = appOrderId;
        this.date = date;
        this.f15210id = id2;
        this.item = item;
        this.receiverId = receiverId;
        this.status = status;
        this.userId = userId;
        this.cancelTransactionId = str;
        this.transactionId = str2;
    }

    public static /* synthetic */ OrdersOrder copy$default(OrdersOrder ordersOrder, String str, String str2, String str3, String str4, String str5, String str6, Status status, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ordersOrder.amount;
        }
        if ((i & 2) != 0) {
            str2 = ordersOrder.appOrderId;
        }
        if ((i & 4) != 0) {
            str3 = ordersOrder.date;
        }
        if ((i & 8) != 0) {
            str4 = ordersOrder.f15210id;
        }
        if ((i & 16) != 0) {
            str5 = ordersOrder.item;
        }
        if ((i & 32) != 0) {
            str6 = ordersOrder.receiverId;
        }
        if ((i & 64) != 0) {
            status = ordersOrder.status;
        }
        if ((i & 128) != 0) {
            str7 = ordersOrder.userId;
        }
        if ((i & 256) != 0) {
            str8 = ordersOrder.cancelTransactionId;
        }
        if ((i & 512) != 0) {
            str9 = ordersOrder.transactionId;
        }
        String str10 = str8;
        String str11 = str9;
        Status status2 = status;
        String str12 = str7;
        String str13 = str5;
        String str14 = str6;
        return ordersOrder.copy(str, str2, str3, str4, str13, str14, status2, str12, str10, str11);
    }

    @NotNull
    public final String component1() {
        return this.amount;
    }

    @Nullable
    public final String component10() {
        return this.transactionId;
    }

    @NotNull
    public final String component2() {
        return this.appOrderId;
    }

    @NotNull
    public final String component3() {
        return this.date;
    }

    @NotNull
    public final String component4() {
        return this.f15210id;
    }

    @NotNull
    public final String component5() {
        return this.item;
    }

    @NotNull
    public final String component6() {
        return this.receiverId;
    }

    @NotNull
    public final Status component7() {
        return this.status;
    }

    @NotNull
    public final String component8() {
        return this.userId;
    }

    @Nullable
    public final String component9() {
        return this.cancelTransactionId;
    }

    @NotNull
    public final OrdersOrder copy(@NotNull String amount, @NotNull String appOrderId, @NotNull String date, @NotNull String id2, @NotNull String item, @NotNull String receiverId, @NotNull Status status, @NotNull String userId, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(appOrderId, "appOrderId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(receiverId, "receiverId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new OrdersOrder(amount, appOrderId, date, id2, item, receiverId, status, userId, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOrder)) {
            return false;
        }
        OrdersOrder ordersOrder = (OrdersOrder) obj;
        return Intrinsics.a(this.amount, ordersOrder.amount) && Intrinsics.a(this.appOrderId, ordersOrder.appOrderId) && Intrinsics.a(this.date, ordersOrder.date) && Intrinsics.a(this.f15210id, ordersOrder.f15210id) && Intrinsics.a(this.item, ordersOrder.item) && Intrinsics.a(this.receiverId, ordersOrder.receiverId) && this.status == ordersOrder.status && Intrinsics.a(this.userId, ordersOrder.userId) && Intrinsics.a(this.cancelTransactionId, ordersOrder.cancelTransactionId) && Intrinsics.a(this.transactionId, ordersOrder.transactionId);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getAppOrderId() {
        return this.appOrderId;
    }

    @Nullable
    public final String getCancelTransactionId() {
        return this.cancelTransactionId;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getId() {
        return this.f15210id;
    }

    @NotNull
    public final String getItem() {
        return this.item;
    }

    @NotNull
    public final String getReceiverId() {
        return this.receiverId;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iE = a.e((this.status.hashCode() + a.e(a.e(a.e(a.e(a.e(this.amount.hashCode() * 31, 31, this.appOrderId), 31, this.date), 31, this.f15210id), 31, this.item), 31, this.receiverId)) * 31, 31, this.userId);
        String str = this.cancelTransactionId;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transactionId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.amount;
        String str2 = this.appOrderId;
        String str3 = this.date;
        String str4 = this.f15210id;
        String str5 = this.item;
        String str6 = this.receiverId;
        Status status = this.status;
        String str7 = this.userId;
        String str8 = this.cancelTransactionId;
        String str9 = this.transactionId;
        StringBuilder sbJ = z.j("OrdersOrder(amount=", str, ", appOrderId=", str2, ", date=");
        o.t(sbJ, str3, ", id=", str4, ", item=");
        o.t(sbJ, str5, ", receiverId=", str6, ", status=");
        sbJ.append(status);
        sbJ.append(", userId=");
        sbJ.append(str7);
        sbJ.append(", cancelTransactionId=");
        return om1.n(sbJ, str8, ", transactionId=", str9, ")");
    }

    public /* synthetic */ OrdersOrder(String str, String str2, String str3, String str4, String str5, String str6, Status status, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, status, str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9);
    }
}
