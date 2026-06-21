package com.vk.sdk.api.market.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseLink;
import gf.a;
import io.sentry.SentryLockReason;
import io.sentry.TraceContext;
import java.util.List;
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
public final class MarketOrder {

    @b(SentryLockReason.JsonKeys.ADDRESS)
    @Nullable
    private final String address;

    @b("cancel_info")
    @Nullable
    private final BaseLink cancelInfo;

    @b("comment")
    @Nullable
    private final String comment;

    @b("date")
    private final int date;

    @b("display_order_id")
    @Nullable
    private final String displayOrderId;

    @b("group_id")
    @NotNull
    private final UserId groupId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15190id;

    @b("items_count")
    private final int itemsCount;

    @b("merchant_comment")
    @Nullable
    private final String merchantComment;

    @b("preview_order_items")
    @Nullable
    private final List<MarketOrderItem> previewOrderItems;

    @b("status")
    private final int status;

    @b("total_price")
    @NotNull
    private final MarketPrice totalPrice;

    @b("track_link")
    @Nullable
    private final String trackLink;

    @b("track_number")
    @Nullable
    private final String trackNumber;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final UserId userId;

    @b("weight")
    @Nullable
    private final Integer weight;

    public MarketOrder(int i, @NotNull UserId groupId, @NotNull UserId userId, int i10, int i11, int i12, @NotNull MarketPrice totalPrice, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable List<MarketOrderItem> list, @Nullable BaseLink baseLink) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        this.f15190id = i;
        this.groupId = groupId;
        this.userId = userId;
        this.date = i10;
        this.status = i11;
        this.itemsCount = i12;
        this.totalPrice = totalPrice;
        this.displayOrderId = str;
        this.trackNumber = str2;
        this.trackLink = str3;
        this.comment = str4;
        this.address = str5;
        this.merchantComment = str6;
        this.weight = num;
        this.previewOrderItems = list;
        this.cancelInfo = baseLink;
    }

    public final int component1() {
        return this.f15190id;
    }

    @Nullable
    public final String component10() {
        return this.trackLink;
    }

    @Nullable
    public final String component11() {
        return this.comment;
    }

    @Nullable
    public final String component12() {
        return this.address;
    }

    @Nullable
    public final String component13() {
        return this.merchantComment;
    }

    @Nullable
    public final Integer component14() {
        return this.weight;
    }

    @Nullable
    public final List<MarketOrderItem> component15() {
        return this.previewOrderItems;
    }

    @Nullable
    public final BaseLink component16() {
        return this.cancelInfo;
    }

    @NotNull
    public final UserId component2() {
        return this.groupId;
    }

    @NotNull
    public final UserId component3() {
        return this.userId;
    }

    public final int component4() {
        return this.date;
    }

    public final int component5() {
        return this.status;
    }

    public final int component6() {
        return this.itemsCount;
    }

    @NotNull
    public final MarketPrice component7() {
        return this.totalPrice;
    }

    @Nullable
    public final String component8() {
        return this.displayOrderId;
    }

    @Nullable
    public final String component9() {
        return this.trackNumber;
    }

    @NotNull
    public final MarketOrder copy(int i, @NotNull UserId groupId, @NotNull UserId userId, int i10, int i11, int i12, @NotNull MarketPrice totalPrice, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable List<MarketOrderItem> list, @Nullable BaseLink baseLink) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        return new MarketOrder(i, groupId, userId, i10, i11, i12, totalPrice, str, str2, str3, str4, str5, str6, num, list, baseLink);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOrder)) {
            return false;
        }
        MarketOrder marketOrder = (MarketOrder) obj;
        return this.f15190id == marketOrder.f15190id && Intrinsics.a(this.groupId, marketOrder.groupId) && Intrinsics.a(this.userId, marketOrder.userId) && this.date == marketOrder.date && this.status == marketOrder.status && this.itemsCount == marketOrder.itemsCount && Intrinsics.a(this.totalPrice, marketOrder.totalPrice) && Intrinsics.a(this.displayOrderId, marketOrder.displayOrderId) && Intrinsics.a(this.trackNumber, marketOrder.trackNumber) && Intrinsics.a(this.trackLink, marketOrder.trackLink) && Intrinsics.a(this.comment, marketOrder.comment) && Intrinsics.a(this.address, marketOrder.address) && Intrinsics.a(this.merchantComment, marketOrder.merchantComment) && Intrinsics.a(this.weight, marketOrder.weight) && Intrinsics.a(this.previewOrderItems, marketOrder.previewOrderItems) && Intrinsics.a(this.cancelInfo, marketOrder.cancelInfo);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final BaseLink getCancelInfo() {
        return this.cancelInfo;
    }

    @Nullable
    public final String getComment() {
        return this.comment;
    }

    public final int getDate() {
        return this.date;
    }

    @Nullable
    public final String getDisplayOrderId() {
        return this.displayOrderId;
    }

    @NotNull
    public final UserId getGroupId() {
        return this.groupId;
    }

    public final int getId() {
        return this.f15190id;
    }

    public final int getItemsCount() {
        return this.itemsCount;
    }

    @Nullable
    public final String getMerchantComment() {
        return this.merchantComment;
    }

    @Nullable
    public final List<MarketOrderItem> getPreviewOrderItems() {
        return this.previewOrderItems;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final MarketPrice getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    public final String getTrackLink() {
        return this.trackLink;
    }

    @Nullable
    public final String getTrackNumber() {
        return this.trackNumber;
    }

    @NotNull
    public final UserId getUserId() {
        return this.userId;
    }

    @Nullable
    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = (this.totalPrice.hashCode() + u.g(this.itemsCount, u.g(this.status, u.g(this.date, o.e(this.userId, o.e(this.groupId, Integer.hashCode(this.f15190id) * 31, 31), 31), 31), 31), 31)) * 31;
        String str = this.displayOrderId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackLink;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.comment;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.address;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.merchantComment;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.weight;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List<MarketOrderItem> list = this.previewOrderItems;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        BaseLink baseLink = this.cancelInfo;
        return iHashCode9 + (baseLink != null ? baseLink.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.f15190id;
        UserId userId = this.groupId;
        UserId userId2 = this.userId;
        int i10 = this.date;
        int i11 = this.status;
        int i12 = this.itemsCount;
        MarketPrice marketPrice = this.totalPrice;
        String str = this.displayOrderId;
        String str2 = this.trackNumber;
        String str3 = this.trackLink;
        String str4 = this.comment;
        String str5 = this.address;
        String str6 = this.merchantComment;
        Integer num = this.weight;
        List<MarketOrderItem> list = this.previewOrderItems;
        BaseLink baseLink = this.cancelInfo;
        StringBuilder sb2 = new StringBuilder("MarketOrder(id=");
        sb2.append(i);
        sb2.append(", groupId=");
        sb2.append(userId);
        sb2.append(", userId=");
        sb2.append(userId2);
        sb2.append(", date=");
        sb2.append(i10);
        sb2.append(", status=");
        om1.t(sb2, i11, ", itemsCount=", i12, ", totalPrice=");
        sb2.append(marketPrice);
        sb2.append(", displayOrderId=");
        sb2.append(str);
        sb2.append(", trackNumber=");
        o.t(sb2, str2, ", trackLink=", str3, ", comment=");
        o.t(sb2, str4, ", address=", str5, ", merchantComment=");
        a.r(num, str6, ", weight=", ", previewOrderItems=", sb2);
        sb2.append(list);
        sb2.append(", cancelInfo=");
        sb2.append(baseLink);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ MarketOrder(int i, UserId userId, UserId userId2, int i10, int i11, int i12, MarketPrice marketPrice, String str, String str2, String str3, String str4, String str5, String str6, Integer num, List list, BaseLink baseLink, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, userId2, i10, i11, i12, marketPrice, (i13 & 128) != 0 ? null : str, (i13 & 256) != 0 ? null : str2, (i13 & 512) != 0 ? null : str3, (i13 & 1024) != 0 ? null : str4, (i13 & 2048) != 0 ? null : str5, (i13 & 4096) != 0 ? null : str6, (i13 & 8192) != 0 ? null : num, (i13 & 16384) != 0 ? null : list, (i13 & 32768) != 0 ? null : baseLink);
    }
}
