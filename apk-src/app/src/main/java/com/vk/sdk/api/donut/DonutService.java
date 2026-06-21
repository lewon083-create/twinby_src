package com.vk.sdk.api.donut;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseUserGroupFields;
import com.vk.sdk.api.donut.dto.DonutDonatorSubscriptionInfo;
import com.vk.sdk.api.donut.dto.DonutGetSubscriptionsResponse;
import com.vk.sdk.api.groups.dto.GroupsGetMembersFieldsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.a;

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
public final class DonutService {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest donutGetFriends$default(DonutService donutService, UserId userId, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        return donutService.donutGetFriends(userId, num, num2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: donutGetFriends$lambda-0, reason: not valid java name */
    public static final GroupsGetMembersFieldsResponse m160donutGetFriends$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetMembersFieldsResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetMembersFieldsResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: donutGetSubscription$lambda-5, reason: not valid java name */
    public static final DonutDonatorSubscriptionInfo m161donutGetSubscription$lambda5(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DonutDonatorSubscriptionInfo) GsonHolder.INSTANCE.getGson().b(it, DonutDonatorSubscriptionInfo.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest donutGetSubscriptions$default(DonutService donutService, List list, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        return donutService.donutGetSubscriptions(list, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: donutGetSubscriptions$lambda-7, reason: not valid java name */
    public static final DonutGetSubscriptionsResponse m162donutGetSubscriptions$lambda7(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DonutGetSubscriptionsResponse) GsonHolder.INSTANCE.getGson().b(it, DonutGetSubscriptionsResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: donutIsDon$lambda-13, reason: not valid java name */
    public static final BaseBoolInt m163donutIsDon$lambda13(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    @NotNull
    public final VKRequest<GroupsGetMembersFieldsResponse> donutGetFriends(@NotNull UserId ownerId, @Nullable Integer num, @Nullable Integer num2, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("donut.getFriends", new a(12));
        newApiRequest.addParam("owner_id", ownerId);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 100);
        }
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DonutDonatorSubscriptionInfo> donutGetSubscription(@NotNull UserId ownerId) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("donut.getSubscription", new a(11));
        newApiRequest.addParam("owner_id", ownerId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DonutGetSubscriptionsResponse> donutGetSubscriptions(@Nullable List<? extends BaseUserGroupFields> list, @Nullable Integer num, @Nullable Integer num2) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("donut.getSubscriptions", new a(13));
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            ArrayList arrayList2 = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((BaseUserGroupFields) it.next()).getValue());
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 100);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> donutIsDon(@NotNull UserId ownerId) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("donut.isDon", new a(10));
        newApiRequest.addParam("owner_id", ownerId);
        return newApiRequest;
    }
}
