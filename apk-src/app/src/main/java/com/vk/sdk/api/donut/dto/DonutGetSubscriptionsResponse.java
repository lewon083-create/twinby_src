package com.vk.sdk.api.donut.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import com.vk.sdk.api.users.dto.UsersUserFull;
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
public final class DonutGetSubscriptionsResponse {

    @b("count")
    @Nullable
    private final Integer count;

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    @b("subscriptions")
    @NotNull
    private final List<DonutDonatorSubscriptionInfo> subscriptions;

    public DonutGetSubscriptionsResponse(@NotNull List<DonutDonatorSubscriptionInfo> subscriptions, @Nullable Integer num, @Nullable List<UsersUserFull> list, @Nullable List<GroupsGroupFull> list2) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.subscriptions = subscriptions;
        this.count = num;
        this.profiles = list;
        this.groups = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DonutGetSubscriptionsResponse copy$default(DonutGetSubscriptionsResponse donutGetSubscriptionsResponse, List list, Integer num, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = donutGetSubscriptionsResponse.subscriptions;
        }
        if ((i & 2) != 0) {
            num = donutGetSubscriptionsResponse.count;
        }
        if ((i & 4) != 0) {
            list2 = donutGetSubscriptionsResponse.profiles;
        }
        if ((i & 8) != 0) {
            list3 = donutGetSubscriptionsResponse.groups;
        }
        return donutGetSubscriptionsResponse.copy(list, num, list2, list3);
    }

    @NotNull
    public final List<DonutDonatorSubscriptionInfo> component1() {
        return this.subscriptions;
    }

    @Nullable
    public final Integer component2() {
        return this.count;
    }

    @Nullable
    public final List<UsersUserFull> component3() {
        return this.profiles;
    }

    @Nullable
    public final List<GroupsGroupFull> component4() {
        return this.groups;
    }

    @NotNull
    public final DonutGetSubscriptionsResponse copy(@NotNull List<DonutDonatorSubscriptionInfo> subscriptions, @Nullable Integer num, @Nullable List<UsersUserFull> list, @Nullable List<GroupsGroupFull> list2) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        return new DonutGetSubscriptionsResponse(subscriptions, num, list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGetSubscriptionsResponse)) {
            return false;
        }
        DonutGetSubscriptionsResponse donutGetSubscriptionsResponse = (DonutGetSubscriptionsResponse) obj;
        return Intrinsics.a(this.subscriptions, donutGetSubscriptionsResponse.subscriptions) && Intrinsics.a(this.count, donutGetSubscriptionsResponse.count) && Intrinsics.a(this.profiles, donutGetSubscriptionsResponse.profiles) && Intrinsics.a(this.groups, donutGetSubscriptionsResponse.groups);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @Nullable
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    @NotNull
    public final List<DonutDonatorSubscriptionInfo> getSubscriptions() {
        return this.subscriptions;
    }

    public int hashCode() {
        int iHashCode = this.subscriptions.hashCode() * 31;
        Integer num = this.count;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<UsersUserFull> list = this.profiles;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFull> list2 = this.groups;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<DonutDonatorSubscriptionInfo> list = this.subscriptions;
        Integer num = this.count;
        List<UsersUserFull> list2 = this.profiles;
        List<GroupsGroupFull> list3 = this.groups;
        StringBuilder sb2 = new StringBuilder("DonutGetSubscriptionsResponse(subscriptions=");
        sb2.append(list);
        sb2.append(", count=");
        sb2.append(num);
        sb2.append(", profiles=");
        return a.l(sb2, list2, ", groups=", list3, ")");
    }

    public /* synthetic */ DonutGetSubscriptionsResponse(List list, Integer num, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
