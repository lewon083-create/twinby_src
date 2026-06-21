package com.vk.sdk.api.orders.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import gf.a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class OrdersSubscription {

    @b(CommonUrlParts.APP_ID)
    @Nullable
    private final Integer appId;

    @b("application_name")
    @Nullable
    private final String applicationName;

    @b("cancel_reason")
    @Nullable
    private final String cancelReason;

    @b("create_time")
    private final int createTime;

    @b("expire_time")
    @Nullable
    private final Integer expireTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15211id;

    @b("item_id")
    @NotNull
    private final String itemId;

    @b("next_bill_time")
    @Nullable
    private final Integer nextBillTime;

    @b("pending_cancel")
    @Nullable
    private final Boolean pendingCancel;

    @b("period")
    private final int period;

    @b("period_start_time")
    private final int periodStartTime;

    @b("photo_url")
    @Nullable
    private final String photoUrl;

    @b("price")
    private final int price;

    @b("status")
    @NotNull
    private final String status;

    @b("test_mode")
    @Nullable
    private final Boolean testMode;

    @b("title")
    @Nullable
    private final String title;

    @b("trial_expire_time")
    @Nullable
    private final Integer trialExpireTime;

    @b("update_time")
    private final int updateTime;

    public OrdersSubscription(int i, int i10, @NotNull String itemId, int i11, int i12, int i13, @NotNull String status, int i14, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num3, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool2, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.createTime = i;
        this.f15211id = i10;
        this.itemId = itemId;
        this.period = i11;
        this.periodStartTime = i12;
        this.price = i13;
        this.status = status;
        this.updateTime = i14;
        this.cancelReason = str;
        this.nextBillTime = num;
        this.expireTime = num2;
        this.pendingCancel = bool;
        this.title = str2;
        this.appId = num3;
        this.applicationName = str3;
        this.photoUrl = str4;
        this.testMode = bool2;
        this.trialExpireTime = num4;
    }

    public static /* synthetic */ OrdersSubscription copy$default(OrdersSubscription ordersSubscription, int i, int i10, String str, int i11, int i12, int i13, String str2, int i14, String str3, Integer num, Integer num2, Boolean bool, String str4, Integer num3, String str5, String str6, Boolean bool2, Integer num4, int i15, Object obj) {
        Integer num5;
        Boolean bool3;
        int i16 = (i15 & 1) != 0 ? ordersSubscription.createTime : i;
        int i17 = (i15 & 2) != 0 ? ordersSubscription.f15211id : i10;
        String str7 = (i15 & 4) != 0 ? ordersSubscription.itemId : str;
        int i18 = (i15 & 8) != 0 ? ordersSubscription.period : i11;
        int i19 = (i15 & 16) != 0 ? ordersSubscription.periodStartTime : i12;
        int i20 = (i15 & 32) != 0 ? ordersSubscription.price : i13;
        String str8 = (i15 & 64) != 0 ? ordersSubscription.status : str2;
        int i21 = (i15 & 128) != 0 ? ordersSubscription.updateTime : i14;
        String str9 = (i15 & 256) != 0 ? ordersSubscription.cancelReason : str3;
        Integer num6 = (i15 & 512) != 0 ? ordersSubscription.nextBillTime : num;
        Integer num7 = (i15 & 1024) != 0 ? ordersSubscription.expireTime : num2;
        Boolean bool4 = (i15 & 2048) != 0 ? ordersSubscription.pendingCancel : bool;
        String str10 = (i15 & 4096) != 0 ? ordersSubscription.title : str4;
        Integer num8 = (i15 & 8192) != 0 ? ordersSubscription.appId : num3;
        int i22 = i16;
        String str11 = (i15 & 16384) != 0 ? ordersSubscription.applicationName : str5;
        String str12 = (i15 & 32768) != 0 ? ordersSubscription.photoUrl : str6;
        Boolean bool5 = (i15 & 65536) != 0 ? ordersSubscription.testMode : bool2;
        if ((i15 & 131072) != 0) {
            bool3 = bool5;
            num5 = ordersSubscription.trialExpireTime;
        } else {
            num5 = num4;
            bool3 = bool5;
        }
        return ordersSubscription.copy(i22, i17, str7, i18, i19, i20, str8, i21, str9, num6, num7, bool4, str10, num8, str11, str12, bool3, num5);
    }

    public final int component1() {
        return this.createTime;
    }

    @Nullable
    public final Integer component10() {
        return this.nextBillTime;
    }

    @Nullable
    public final Integer component11() {
        return this.expireTime;
    }

    @Nullable
    public final Boolean component12() {
        return this.pendingCancel;
    }

    @Nullable
    public final String component13() {
        return this.title;
    }

    @Nullable
    public final Integer component14() {
        return this.appId;
    }

    @Nullable
    public final String component15() {
        return this.applicationName;
    }

    @Nullable
    public final String component16() {
        return this.photoUrl;
    }

    @Nullable
    public final Boolean component17() {
        return this.testMode;
    }

    @Nullable
    public final Integer component18() {
        return this.trialExpireTime;
    }

    public final int component2() {
        return this.f15211id;
    }

    @NotNull
    public final String component3() {
        return this.itemId;
    }

    public final int component4() {
        return this.period;
    }

    public final int component5() {
        return this.periodStartTime;
    }

    public final int component6() {
        return this.price;
    }

    @NotNull
    public final String component7() {
        return this.status;
    }

    public final int component8() {
        return this.updateTime;
    }

    @Nullable
    public final String component9() {
        return this.cancelReason;
    }

    @NotNull
    public final OrdersSubscription copy(int i, int i10, @NotNull String itemId, int i11, int i12, int i13, @NotNull String status, int i14, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num3, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool2, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(status, "status");
        return new OrdersSubscription(i, i10, itemId, i11, i12, i13, status, i14, str, num, num2, bool, str2, num3, str3, str4, bool2, num4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersSubscription)) {
            return false;
        }
        OrdersSubscription ordersSubscription = (OrdersSubscription) obj;
        return this.createTime == ordersSubscription.createTime && this.f15211id == ordersSubscription.f15211id && Intrinsics.a(this.itemId, ordersSubscription.itemId) && this.period == ordersSubscription.period && this.periodStartTime == ordersSubscription.periodStartTime && this.price == ordersSubscription.price && Intrinsics.a(this.status, ordersSubscription.status) && this.updateTime == ordersSubscription.updateTime && Intrinsics.a(this.cancelReason, ordersSubscription.cancelReason) && Intrinsics.a(this.nextBillTime, ordersSubscription.nextBillTime) && Intrinsics.a(this.expireTime, ordersSubscription.expireTime) && Intrinsics.a(this.pendingCancel, ordersSubscription.pendingCancel) && Intrinsics.a(this.title, ordersSubscription.title) && Intrinsics.a(this.appId, ordersSubscription.appId) && Intrinsics.a(this.applicationName, ordersSubscription.applicationName) && Intrinsics.a(this.photoUrl, ordersSubscription.photoUrl) && Intrinsics.a(this.testMode, ordersSubscription.testMode) && Intrinsics.a(this.trialExpireTime, ordersSubscription.trialExpireTime);
    }

    @Nullable
    public final Integer getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getApplicationName() {
        return this.applicationName;
    }

    @Nullable
    public final String getCancelReason() {
        return this.cancelReason;
    }

    public final int getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final Integer getExpireTime() {
        return this.expireTime;
    }

    public final int getId() {
        return this.f15211id;
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final Integer getNextBillTime() {
        return this.nextBillTime;
    }

    @Nullable
    public final Boolean getPendingCancel() {
        return this.pendingCancel;
    }

    public final int getPeriod() {
        return this.period;
    }

    public final int getPeriodStartTime() {
        return this.periodStartTime;
    }

    @Nullable
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getPrice() {
        return this.price;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Boolean getTestMode() {
        return this.testMode;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getTrialExpireTime() {
        return this.trialExpireTime;
    }

    public final int getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iG = u.g(this.updateTime, a.e(u.g(this.price, u.g(this.periodStartTime, u.g(this.period, a.e(u.g(this.f15211id, Integer.hashCode(this.createTime) * 31, 31), 31, this.itemId), 31), 31), 31), 31, this.status), 31);
        String str = this.cancelReason;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.nextBillTime;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expireTime;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.pendingCancel;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.appId;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.applicationName;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoUrl;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.testMode;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.trialExpireTime;
        return iHashCode9 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.createTime;
        int i10 = this.f15211id;
        String str = this.itemId;
        int i11 = this.period;
        int i12 = this.periodStartTime;
        int i13 = this.price;
        String str2 = this.status;
        int i14 = this.updateTime;
        String str3 = this.cancelReason;
        Integer num = this.nextBillTime;
        Integer num2 = this.expireTime;
        Boolean bool = this.pendingCancel;
        String str4 = this.title;
        Integer num3 = this.appId;
        String str5 = this.applicationName;
        String str6 = this.photoUrl;
        Boolean bool2 = this.testMode;
        Integer num4 = this.trialExpireTime;
        StringBuilder sbI = z.i("OrdersSubscription(createTime=", i, ", id=", i10, ", itemId=");
        o.p(i11, str, ", period=", ", periodStartTime=", sbI);
        om1.t(sbI, i12, ", price=", i13, ", status=");
        o.p(i14, str2, ", updateTime=", ", cancelReason=", sbI);
        a.r(num, str3, ", nextBillTime=", ", expireTime=", sbI);
        sbI.append(num2);
        sbI.append(", pendingCancel=");
        sbI.append(bool);
        sbI.append(", title=");
        a.r(num3, str4, ", appId=", ", applicationName=", sbI);
        o.t(sbI, str5, ", photoUrl=", str6, ", testMode=");
        sbI.append(bool2);
        sbI.append(", trialExpireTime=");
        sbI.append(num4);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ OrdersSubscription(int i, int i10, String str, int i11, int i12, int i13, String str2, int i14, String str3, Integer num, Integer num2, Boolean bool, String str4, Integer num3, String str5, String str6, Boolean bool2, Integer num4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, str, i11, i12, i13, str2, i14, (i15 & 256) != 0 ? null : str3, (i15 & 512) != 0 ? null : num, (i15 & 1024) != 0 ? null : num2, (i15 & 2048) != 0 ? null : bool, (i15 & 4096) != 0 ? null : str4, (i15 & 8192) != 0 ? null : num3, (i15 & 16384) != 0 ? null : str5, (32768 & i15) != 0 ? null : str6, (65536 & i15) != 0 ? null : bool2, (i15 & 131072) != 0 ? null : num4);
    }
}
