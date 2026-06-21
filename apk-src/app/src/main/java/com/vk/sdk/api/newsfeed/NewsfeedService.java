package com.vk.sdk.api.newsfeed;

import ag.a;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.base.dto.BaseUserGroupFields;
import com.vk.sdk.api.newsfeed.dto.NewsfeedCommentsFilters;
import com.vk.sdk.api.newsfeed.dto.NewsfeedGetBannedExtendedNameCase;
import com.vk.sdk.api.newsfeed.dto.NewsfeedGetBannedExtendedResponse;
import com.vk.sdk.api.newsfeed.dto.NewsfeedGetBannedNameCase;
import com.vk.sdk.api.newsfeed.dto.NewsfeedGetBannedResponse;
import com.vk.sdk.api.newsfeed.dto.NewsfeedGetCommentsResponse;
import com.vk.sdk.api.newsfeed.dto.NewsfeedGetListsExtendedResponse;
import com.vk.sdk.api.newsfeed.dto.NewsfeedGetListsResponse;
import com.vk.sdk.api.newsfeed.dto.NewsfeedGetMentionsResponse;
import com.vk.sdk.api.newsfeed.dto.NewsfeedGetRecommendedResponse;
import com.vk.sdk.api.newsfeed.dto.NewsfeedGetResponse;
import com.vk.sdk.api.newsfeed.dto.NewsfeedGetSuggestedSourcesResponse;
import com.vk.sdk.api.newsfeed.dto.NewsfeedNewsfeedItemType;
import com.vk.sdk.api.newsfeed.dto.NewsfeedSearchExtendedResponse;
import com.vk.sdk.api.newsfeed.dto.NewsfeedSearchResponse;
import com.vk.sdk.api.newsfeed.dto.NewsfeedUnsubscribeType;
import com.vk.sdk.api.users.dto.UsersFields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import me.p;
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
public final class NewsfeedService {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedAddBan$default(NewsfeedService newsfeedService, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        return newsfeedService.newsfeedAddBan(list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedAddBan$lambda-0, reason: not valid java name */
    public static final BaseOkResponse m357newsfeedAddBan$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedDeleteBan$default(NewsfeedService newsfeedService, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        return newsfeedService.newsfeedDeleteBan(list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedDeleteBan$lambda-4, reason: not valid java name */
    public static final BaseOkResponse m358newsfeedDeleteBan$lambda4(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedDeleteList$lambda-8, reason: not valid java name */
    public static final BaseOkResponse m359newsfeedDeleteList$lambda8(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedGet$default(NewsfeedService newsfeedService, List list, Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, List list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        if ((i & 32) != 0) {
            str = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            num4 = null;
        }
        if ((i & 256) != 0) {
            list2 = null;
        }
        if ((i & 512) != 0) {
            str3 = null;
        }
        return newsfeedService.newsfeedGet(list, bool, num, num2, num3, str, str2, num4, list2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedGet$lambda-10, reason: not valid java name */
    public static final NewsfeedGetResponse m360newsfeedGet$lambda10(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NewsfeedGetResponse) GsonHolder.INSTANCE.getGson().b(it, NewsfeedGetResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedGetBanned$default(NewsfeedService newsfeedService, List list, NewsfeedGetBannedNameCase newsfeedGetBannedNameCase, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            newsfeedGetBannedNameCase = null;
        }
        return newsfeedService.newsfeedGetBanned(list, newsfeedGetBannedNameCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedGetBanned$lambda-24, reason: not valid java name */
    public static final NewsfeedGetBannedResponse m361newsfeedGetBanned$lambda24(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NewsfeedGetBannedResponse) GsonHolder.INSTANCE.getGson().b(it, NewsfeedGetBannedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedGetBannedExtended$default(NewsfeedService newsfeedService, List list, NewsfeedGetBannedExtendedNameCase newsfeedGetBannedExtendedNameCase, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            newsfeedGetBannedExtendedNameCase = null;
        }
        return newsfeedService.newsfeedGetBannedExtended(list, newsfeedGetBannedExtendedNameCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedGetBannedExtended$lambda-29, reason: not valid java name */
    public static final NewsfeedGetBannedExtendedResponse m362newsfeedGetBannedExtended$lambda29(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NewsfeedGetBannedExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, NewsfeedGetBannedExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedGetComments$default(NewsfeedService newsfeedService, Integer num, List list, String str, Integer num2, Integer num3, Integer num4, String str2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        if ((i & 32) != 0) {
            num4 = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            list2 = null;
        }
        return newsfeedService.newsfeedGetComments(num, list, str, num2, num3, num4, str2, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedGetComments$lambda-34, reason: not valid java name */
    public static final NewsfeedGetCommentsResponse m363newsfeedGetComments$lambda34(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NewsfeedGetCommentsResponse) GsonHolder.INSTANCE.getGson().b(it, NewsfeedGetCommentsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedGetLists$default(NewsfeedService newsfeedService, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return newsfeedService.newsfeedGetLists(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedGetLists$lambda-46, reason: not valid java name */
    public static final NewsfeedGetListsResponse m364newsfeedGetLists$lambda46(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NewsfeedGetListsResponse) GsonHolder.INSTANCE.getGson().b(it, NewsfeedGetListsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedGetListsExtended$default(NewsfeedService newsfeedService, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return newsfeedService.newsfeedGetListsExtended(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedGetListsExtended$lambda-49, reason: not valid java name */
    public static final NewsfeedGetListsExtendedResponse m365newsfeedGetListsExtended$lambda49(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NewsfeedGetListsExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, NewsfeedGetListsExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest newsfeedGetMentions$default(NewsfeedService newsfeedService, UserId userId, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        if ((i & 16) != 0) {
            num4 = null;
        }
        return newsfeedService.newsfeedGetMentions(userId, num, num2, num3, num4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedGetMentions$lambda-52, reason: not valid java name */
    public static final NewsfeedGetMentionsResponse m366newsfeedGetMentions$lambda52(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NewsfeedGetMentionsResponse) GsonHolder.INSTANCE.getGson().b(it, NewsfeedGetMentionsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedGetRecommended$default(NewsfeedService newsfeedService, Integer num, Integer num2, Integer num3, String str, Integer num4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            num4 = null;
        }
        if ((i & 32) != 0) {
            list = null;
        }
        return newsfeedService.newsfeedGetRecommended(num, num2, num3, str, num4, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedGetRecommended$lambda-59, reason: not valid java name */
    public static final NewsfeedGetRecommendedResponse m367newsfeedGetRecommended$lambda59(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NewsfeedGetRecommendedResponse) GsonHolder.INSTANCE.getGson().b(it, NewsfeedGetRecommendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedGetSuggestedSources$default(NewsfeedService newsfeedService, Integer num, Integer num2, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        return newsfeedService.newsfeedGetSuggestedSources(num, num2, bool, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedGetSuggestedSources$lambda-68, reason: not valid java name */
    public static final NewsfeedGetSuggestedSourcesResponse m368newsfeedGetSuggestedSources$lambda68(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NewsfeedGetSuggestedSourcesResponse) GsonHolder.INSTANCE.getGson().b(it, NewsfeedGetSuggestedSourcesResponse.class);
    }

    public static /* synthetic */ VKRequest newsfeedIgnoreItem$default(NewsfeedService newsfeedService, String str, UserId userId, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return newsfeedService.newsfeedIgnoreItem(str, userId, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedIgnoreItem$lambda-75, reason: not valid java name */
    public static final BaseOkResponse m369newsfeedIgnoreItem$lambda75(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedSaveList$default(NewsfeedService newsfeedService, String str, Integer num, List list, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        return newsfeedService.newsfeedSaveList(str, num, list, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedSaveList$lambda-79, reason: not valid java name */
    public static final Integer m370newsfeedSaveList$lambda79(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedSearch$default(NewsfeedService newsfeedService, String str, Integer num, Float f10, Float f11, Integer num2, Integer num3, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            f10 = null;
        }
        if ((i & 8) != 0) {
            f11 = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            num3 = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            list = null;
        }
        return newsfeedService.newsfeedSearch(str, num, f10, f11, num2, num3, str2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedSearch$lambda-84, reason: not valid java name */
    public static final NewsfeedSearchResponse m371newsfeedSearch$lambda84(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NewsfeedSearchResponse) GsonHolder.INSTANCE.getGson().b(it, NewsfeedSearchResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest newsfeedSearchExtended$default(NewsfeedService newsfeedService, String str, Integer num, Float f10, Float f11, Integer num2, Integer num3, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            f10 = null;
        }
        if ((i & 8) != 0) {
            f11 = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            num3 = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            list = null;
        }
        return newsfeedService.newsfeedSearchExtended(str, num, f10, f11, num2, num3, str2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedSearchExtended$lambda-95, reason: not valid java name */
    public static final NewsfeedSearchExtendedResponse m372newsfeedSearchExtended$lambda95(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NewsfeedSearchExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, NewsfeedSearchExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest newsfeedUnignoreItem$default(NewsfeedService newsfeedService, String str, UserId userId, int i, String str2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return newsfeedService.newsfeedUnignoreItem(str, userId, i, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedUnignoreItem$lambda-106, reason: not valid java name */
    public static final BaseOkResponse m373newsfeedUnignoreItem$lambda106(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest newsfeedUnsubscribe$default(NewsfeedService newsfeedService, NewsfeedUnsubscribeType newsfeedUnsubscribeType, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId = null;
        }
        return newsfeedService.newsfeedUnsubscribe(newsfeedUnsubscribeType, i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newsfeedUnsubscribe$lambda-109, reason: not valid java name */
    public static final BaseOkResponse m374newsfeedUnsubscribe$lambda109(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<BaseOkResponse> newsfeedAddBan(@Nullable List<Integer> list, @Nullable List<Integer> list2) {
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.addBan", new a(26));
        if (list != null) {
            newApiRequest.addParam("user_ids", list);
        }
        if (list2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("group_ids", list2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> newsfeedDeleteBan(@Nullable List<Integer> list, @Nullable List<Integer> list2) {
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.deleteBan", new a(23));
        if (list != null) {
            newApiRequest.addParam("user_ids", list);
        }
        if (list2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("group_ids", list2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> newsfeedDeleteList(int i) {
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.deleteList", new bg.a(2));
        NewApiRequest.addParam$default(newApiRequest, "list_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NewsfeedGetResponse> newsfeedGet(@Nullable List<? extends NewsfeedNewsfeedItemType> list, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable String str2, @Nullable Integer num4, @Nullable List<? extends BaseUserGroupFields> list2, @Nullable String str3) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.get", new bg.a(0));
        ArrayList arrayList2 = null;
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends NewsfeedNewsfeedItemType> list3 = list;
            arrayList = new ArrayList(t.j(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((NewsfeedNewsfeedItemType) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("filters", (Iterable<?>) arrayList);
        }
        if (bool != null) {
            newApiRequest.addParam("return_banned", bool.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_time", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "end_time", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "max_photos", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("source_ids", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("start_from", str2);
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (list2 != null) {
            List<? extends BaseUserGroupFields> list4 = list2;
            arrayList2 = new ArrayList(t.j(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((BaseUserGroupFields) it2.next()).getValue());
            }
        }
        if (arrayList2 != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList2);
        }
        if (str3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("section", str3);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NewsfeedGetBannedResponse> newsfeedGetBanned(@Nullable List<? extends UsersFields> list, @Nullable NewsfeedGetBannedNameCase newsfeedGetBannedNameCase) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.getBanned", new a(29));
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list2 = list;
            ArrayList arrayList2 = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UsersFields) it.next()).getValue());
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (newsfeedGetBannedNameCase == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("name_case", newsfeedGetBannedNameCase.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NewsfeedGetBannedExtendedResponse> newsfeedGetBannedExtended(@Nullable List<? extends UsersFields> list, @Nullable NewsfeedGetBannedExtendedNameCase newsfeedGetBannedExtendedNameCase) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.getBanned", new a(27));
        newApiRequest.addParam("extended", true);
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list2 = list;
            ArrayList arrayList2 = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UsersFields) it.next()).getValue());
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (newsfeedGetBannedExtendedNameCase == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("name_case", newsfeedGetBannedExtendedNameCase.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NewsfeedGetCommentsResponse> newsfeedGetComments(@Nullable Integer num, @Nullable List<? extends NewsfeedCommentsFilters> list, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str2, @Nullable List<? extends BaseUserGroupFields> list2) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.getComments", new bg.a(4));
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 0, 100);
        }
        ArrayList arrayList2 = null;
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends NewsfeedCommentsFilters> list3 = list;
            arrayList = new ArrayList(t.j(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((NewsfeedCommentsFilters) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("filters", (Iterable<?>) arrayList);
        }
        if (str != null) {
            newApiRequest.addParam("reposts", str);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_time", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "end_time", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 != null) {
            newApiRequest.addParam("last_comments_count", num4.intValue(), 0, 10);
        }
        if (str2 != null) {
            newApiRequest.addParam("start_from", str2);
        }
        if (list2 != null) {
            List<? extends BaseUserGroupFields> list4 = list2;
            ArrayList arrayList3 = new ArrayList(t.j(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((BaseUserGroupFields) it2.next()).getValue());
            }
            arrayList2 = arrayList3;
        }
        if (arrayList2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NewsfeedGetListsResponse> newsfeedGetLists(@Nullable List<Integer> list) {
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.getLists", new bg.a(6));
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("list_ids", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NewsfeedGetListsExtendedResponse> newsfeedGetListsExtended(@Nullable List<Integer> list) {
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.getLists", new a(19));
        if (list != null) {
            newApiRequest.addParam("list_ids", list);
        }
        newApiRequest.addParam("extended", true);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NewsfeedGetMentionsResponse> newsfeedGetMentions(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.getMentions", new a(20));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_time", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "end_time", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num4.intValue(), 0, 50);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NewsfeedGetRecommendedResponse> newsfeedGetRecommended(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable Integer num4, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.getRecommended", new a(21));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_time", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "end_time", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "max_photos", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("start_from", str);
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NewsfeedGetSuggestedSourcesResponse> newsfeedGetSuggestedSources(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.getSuggestedSources", new a(28));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 1000);
        }
        if (bool != null) {
            newApiRequest.addParam("shuffle", bool.booleanValue());
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> newsfeedIgnoreItem(@NotNull String type, @Nullable UserId userId, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.ignoreItem", new a(24));
        newApiRequest.addParam("type", type);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "item_id", num.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> newsfeedSaveList(@NotNull String title, @Nullable Integer num, @Nullable List<UserId> list, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(title, "title");
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.saveList", new a(25));
        newApiRequest.addParam("title", title);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "list_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (list != null) {
            NewApiRequest.addParam$default(newApiRequest, "source_ids", list, 0L, 0L, 12, (Object) null);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("no_reposts", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NewsfeedSearchResponse> newsfeedSearch(@Nullable String str, @Nullable Integer num, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.search", new bg.a(1));
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (f10 != null) {
            newApiRequest.addParam("latitude", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("longitude", f11.floatValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_time", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "end_time", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (str2 != null) {
            newApiRequest.addParam("start_from", str2);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NewsfeedSearchExtendedResponse> newsfeedSearchExtended(@Nullable String str, @Nullable Integer num, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.search", new bg.a(3));
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        newApiRequest.addParam("extended", true);
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (f10 != null) {
            newApiRequest.addParam("latitude", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("longitude", f11.floatValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_time", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "end_time", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (str2 != null) {
            newApiRequest.addParam("start_from", str2);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> newsfeedUnignoreItem(@NotNull String type, @NotNull UserId ownerId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.unignoreItem", new a(22));
        newApiRequest.addParam("type", type);
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("track_code", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> newsfeedUnsubscribe(@NotNull NewsfeedUnsubscribeType type, int i, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(type, "type");
        NewApiRequest newApiRequest = new NewApiRequest("newsfeed.unsubscribe", new bg.a(5));
        newApiRequest.addParam("type", type.getValue());
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }
}
