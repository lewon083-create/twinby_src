package com.vk.sdk.api.friends;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.friends.dto.FriendsAddListResponse;
import com.vk.sdk.api.friends.dto.FriendsAddResponse;
import com.vk.sdk.api.friends.dto.FriendsDeleteResponse;
import com.vk.sdk.api.friends.dto.FriendsFriendExtendedStatus;
import com.vk.sdk.api.friends.dto.FriendsFriendStatus;
import com.vk.sdk.api.friends.dto.FriendsGetFieldsResponse;
import com.vk.sdk.api.friends.dto.FriendsGetListsResponse;
import com.vk.sdk.api.friends.dto.FriendsGetNameCase;
import com.vk.sdk.api.friends.dto.FriendsGetOrder;
import com.vk.sdk.api.friends.dto.FriendsGetRequestsResponse;
import com.vk.sdk.api.friends.dto.FriendsGetRequestsSort;
import com.vk.sdk.api.friends.dto.FriendsGetSuggestionsFilter;
import com.vk.sdk.api.friends.dto.FriendsGetSuggestionsNameCase;
import com.vk.sdk.api.friends.dto.FriendsGetSuggestionsResponse;
import com.vk.sdk.api.friends.dto.FriendsSearchNameCase;
import com.vk.sdk.api.friends.dto.FriendsSearchResponse;
import com.vk.sdk.api.friends.dto.FriendsUserXtrPhone;
import com.vk.sdk.api.users.dto.UsersFields;
import io.sentry.TraceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
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
public final class FriendsService {
    public static /* synthetic */ VKRequest friendsAdd$default(FriendsService friendsService, UserId userId, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        return friendsService.friendsAdd(userId, str, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsAdd$lambda-0, reason: not valid java name */
    public static final FriendsAddResponse m190friendsAdd$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (FriendsAddResponse) GsonHolder.INSTANCE.getGson().b(it, FriendsAddResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest friendsAddList$default(FriendsService friendsService, String str, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return friendsService.friendsAddList(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsAddList$lambda-5, reason: not valid java name */
    public static final FriendsAddListResponse m191friendsAddList$lambda5(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (FriendsAddListResponse) GsonHolder.INSTANCE.getGson().b(it, FriendsAddListResponse.class);
    }

    public static /* synthetic */ VKRequest friendsAreFriends$default(FriendsService friendsService, List list, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return friendsService.friendsAreFriends(list, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsAreFriends$lambda-8, reason: not valid java name */
    public static final List m192friendsAreFriends$lambda8(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends FriendsFriendStatus>>() { // from class: com.vk.sdk.api.friends.FriendsService$friendsAreFriends$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest friendsAreFriendsExtended$default(FriendsService friendsService, List list, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return friendsService.friendsAreFriendsExtended(list, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsAreFriendsExtended$lambda-11, reason: not valid java name */
    public static final List m193friendsAreFriendsExtended$lambda11(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends FriendsFriendExtendedStatus>>() { // from class: com.vk.sdk.api.friends.FriendsService$friendsAreFriendsExtended$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest friendsDelete$default(FriendsService friendsService, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        return friendsService.friendsDelete(userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsDelete$lambda-14, reason: not valid java name */
    public static final FriendsDeleteResponse m194friendsDelete$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (FriendsDeleteResponse) GsonHolder.INSTANCE.getGson().b(it, FriendsDeleteResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsDeleteAllRequests$lambda-17, reason: not valid java name */
    public static final BaseOkResponse m195friendsDeleteAllRequests$lambda17(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson…seOkResponse::class.java)");
        return (BaseOkResponse) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsDeleteList$lambda-18, reason: not valid java name */
    public static final BaseOkResponse m196friendsDeleteList$lambda18(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest friendsEdit$default(FriendsService friendsService, UserId userId, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return friendsService.friendsEdit(userId, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsEdit$lambda-20, reason: not valid java name */
    public static final BaseOkResponse m197friendsEdit$lambda20(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest friendsEditList$default(FriendsService friendsService, int i, String str, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            list = null;
        }
        if ((i10 & 8) != 0) {
            list2 = null;
        }
        if ((i10 & 16) != 0) {
            list3 = null;
        }
        return friendsService.friendsEditList(i, str, list, list2, list3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsEditList$lambda-23, reason: not valid java name */
    public static final BaseOkResponse m198friendsEditList$lambda23(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest friendsGet$default(FriendsService friendsService, UserId userId, FriendsGetOrder friendsGetOrder, Integer num, Integer num2, Integer num3, List list, FriendsGetNameCase friendsGetNameCase, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            friendsGetOrder = null;
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
            list = null;
        }
        if ((i & 64) != 0) {
            friendsGetNameCase = null;
        }
        if ((i & 128) != 0) {
            str = null;
        }
        return friendsService.friendsGet(userId, friendsGetOrder, num, num2, num3, list, friendsGetNameCase, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsGet$lambda-29, reason: not valid java name */
    public static final FriendsGetFieldsResponse m199friendsGet$lambda29(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (FriendsGetFieldsResponse) GsonHolder.INSTANCE.getGson().b(it, FriendsGetFieldsResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsGetAppUsers$lambda-40, reason: not valid java name */
    public static final List m200friendsGetAppUsers$lambda40(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objC = GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends UserId>>() { // from class: com.vk.sdk.api.friends.FriendsService$friendsGetAppUsers$1$typeToken$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objC, "GsonHolder.gson.fromJson…t<UserId>>(it, typeToken)");
        return (List) objC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest friendsGetByPhones$default(FriendsService friendsService, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        return friendsService.friendsGetByPhones(list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsGetByPhones$lambda-41, reason: not valid java name */
    public static final List m201friendsGetByPhones$lambda41(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends FriendsUserXtrPhone>>() { // from class: com.vk.sdk.api.friends.FriendsService$friendsGetByPhones$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest friendsGetLists$default(FriendsService friendsService, UserId userId, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return friendsService.friendsGetLists(userId, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsGetLists$lambda-46, reason: not valid java name */
    public static final FriendsGetListsResponse m202friendsGetLists$lambda46(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (FriendsGetListsResponse) GsonHolder.INSTANCE.getGson().b(it, FriendsGetListsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest friendsGetMutual$default(FriendsService friendsService, UserId userId, UserId userId2, List list, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            userId2 = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        return friendsService.friendsGetMutual(userId, userId2, list, str, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsGetMutual$lambda-50, reason: not valid java name */
    public static final List m203friendsGetMutual$lambda50(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends UserId>>() { // from class: com.vk.sdk.api.friends.FriendsService$friendsGetMutual$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest friendsGetOnline$default(FriendsService friendsService, UserId userId, Integer num, Boolean bool, String str, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            num3 = null;
        }
        return friendsService.friendsGetOnline(userId, num, bool, str, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsGetOnline$lambda-58, reason: not valid java name */
    public static final List m204friendsGetOnline$lambda58(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends UserId>>() { // from class: com.vk.sdk.api.friends.FriendsService$friendsGetOnline$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest friendsGetRecent$default(FriendsService friendsService, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return friendsService.friendsGetRecent(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsGetRecent$lambda-66, reason: not valid java name */
    public static final List m205friendsGetRecent$lambda66(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends Integer>>() { // from class: com.vk.sdk.api.friends.FriendsService$friendsGetRecent$1$typeToken$1
        }.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest friendsGetRequests$default(FriendsService friendsService, Integer num, Integer num2, Boolean bool, Boolean bool2, FriendsGetRequestsSort friendsGetRequestsSort, Boolean bool3, Boolean bool4, String str, List list, int i, Object obj) {
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
            bool2 = null;
        }
        if ((i & 16) != 0) {
            friendsGetRequestsSort = null;
        }
        if ((i & 32) != 0) {
            bool3 = null;
        }
        if ((i & 64) != 0) {
            bool4 = null;
        }
        if ((i & 128) != 0) {
            str = null;
        }
        if ((i & 256) != 0) {
            list = null;
        }
        return friendsService.friendsGetRequests(num, num2, bool, bool2, friendsGetRequestsSort, bool3, bool4, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsGetRequests$lambda-69, reason: not valid java name */
    public static final FriendsGetRequestsResponse m206friendsGetRequests$lambda69(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (FriendsGetRequestsResponse) GsonHolder.INSTANCE.getGson().b(it, FriendsGetRequestsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest friendsGetSuggestions$default(FriendsService friendsService, List list, Integer num, Integer num2, List list2, FriendsGetSuggestionsNameCase friendsGetSuggestionsNameCase, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        if ((i & 16) != 0) {
            friendsGetSuggestionsNameCase = null;
        }
        return friendsService.friendsGetSuggestions(list, num, num2, list2, friendsGetSuggestionsNameCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsGetSuggestions$lambda-81, reason: not valid java name */
    public static final FriendsGetSuggestionsResponse m207friendsGetSuggestions$lambda81(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (FriendsGetSuggestionsResponse) GsonHolder.INSTANCE.getGson().b(it, FriendsGetSuggestionsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest friendsSearch$default(FriendsService friendsService, UserId userId, String str, List list, FriendsSearchNameCase friendsSearchNameCase, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            friendsSearchNameCase = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        return friendsService.friendsSearch(userId, str, list, friendsSearchNameCase, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: friendsSearch$lambda-90, reason: not valid java name */
    public static final FriendsSearchResponse m208friendsSearch$lambda90(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (FriendsSearchResponse) GsonHolder.INSTANCE.getGson().b(it, FriendsSearchResponse.class);
    }

    @NotNull
    public final VKRequest<FriendsAddResponse> friendsAdd(@Nullable UserId userId, @Nullable String str, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("friends.add", new tf.a(25));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("text", str);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("follow", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<FriendsAddListResponse> friendsAddList(@NotNull String name, @Nullable List<UserId> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        NewApiRequest newApiRequest = new NewApiRequest("friends.addList", new uf.a(5));
        newApiRequest.addParam("name", name);
        if (list == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "user_ids", list, 0L, 0L, 12, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<FriendsFriendStatus>> friendsAreFriends(@NotNull List<UserId> userIds, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        NewApiRequest newApiRequest = new NewApiRequest("friends.areFriends", new tf.a(28));
        NewApiRequest.addParam$default(newApiRequest, "user_ids", userIds, 0L, 0L, 12, (Object) null);
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("need_sign", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<FriendsFriendExtendedStatus>> friendsAreFriendsExtended(@NotNull List<UserId> userIds, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        NewApiRequest newApiRequest = new NewApiRequest("friends.areFriends", new uf.a(9));
        NewApiRequest.addParam$default(newApiRequest, "user_ids", userIds, 0L, 0L, 12, (Object) null);
        if (bool != null) {
            newApiRequest.addParam("need_sign", bool.booleanValue());
        }
        newApiRequest.addParam("extended", true);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<FriendsDeleteResponse> friendsDelete(@Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("friends.delete", new tf.a(27));
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> friendsDeleteAllRequests() {
        return new NewApiRequest("friends.deleteAllRequests", new uf.a(0));
    }

    @NotNull
    public final VKRequest<BaseOkResponse> friendsDeleteList(int i) {
        NewApiRequest newApiRequest = new NewApiRequest("friends.deleteList", new tf.a(26));
        newApiRequest.addParam("list_id", i, 0, 24);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> friendsEdit(@NotNull UserId userId, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("friends.edit", new uf.a(3));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("list_ids", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> friendsEditList(int i, @Nullable String str, @Nullable List<UserId> list, @Nullable List<UserId> list2, @Nullable List<UserId> list3) {
        NewApiRequest newApiRequest = new NewApiRequest("friends.editList", new tf.a(24));
        NewApiRequest.addParam$default(newApiRequest, "list_id", i, 0, 0, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("name", str);
        }
        if (list != null) {
            NewApiRequest.addParam$default(newApiRequest, "user_ids", list, 0L, 0L, 12, (Object) null);
        }
        if (list2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "add_user_ids", list2, 0L, 0L, 12, (Object) null);
        }
        if (list3 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "delete_user_ids", list3, 0L, 0L, 12, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<FriendsGetFieldsResponse> friendsGet(@Nullable UserId userId, @Nullable FriendsGetOrder friendsGetOrder, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<? extends UsersFields> list, @Nullable FriendsGetNameCase friendsGetNameCase, @Nullable String str) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("friends.get", new tf.a(29));
        if (userId != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId);
        }
        if (friendsGetOrder != null) {
            newApiRequest.addParam("order", friendsGetOrder.getValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "list_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFields) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (friendsGetNameCase != null) {
            newApiRequest.addParam("name_case", friendsGetNameCase.getValue());
        }
        if (str == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "ref", str, 0, KotlinVersion.MAX_COMPONENT_VALUE, 4, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<UserId>> friendsGetAppUsers() {
        return new NewApiRequest("friends.getAppUsers", new uf.a(11));
    }

    @NotNull
    public final VKRequest<List<FriendsUserXtrPhone>> friendsGetByPhones(@Nullable List<String> list, @Nullable List<? extends UsersFields> list2) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("friends.getByPhones", new uf.a(8));
        if (list != null) {
            newApiRequest.addParam("phones", list);
        }
        if (list2 == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list3 = list2;
            arrayList = new ArrayList(t.j(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<FriendsGetListsResponse> friendsGetLists(@Nullable UserId userId, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("friends.getLists", new uf.a(1));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("return_system", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<UserId>> friendsGetMutual(@Nullable UserId userId, @Nullable UserId userId2, @Nullable List<UserId> list, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("friends.getMutual", new uf.a(6));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "source_uid", userId, 0L, 0L, 8, (Object) null);
        }
        if (userId2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "target_uid", userId2, 0L, 0L, 8, (Object) null);
        }
        if (list != null) {
            NewApiRequest.addParam$default(newApiRequest, "target_uids", list, 0L, 0L, 12, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("order", str);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<UserId>> friendsGetOnline(@Nullable UserId userId, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("friends.getOnline", new uf.a(12));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "list_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("online_mobile", bool.booleanValue());
        }
        if (str != null) {
            newApiRequest.addParam("order", str);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "offset", num3.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<Integer>> friendsGetRecent(@Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("friends.getRecent", new uf.a(4));
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num.intValue(), 0, 1000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<FriendsGetRequestsResponse> friendsGetRequests(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable FriendsGetRequestsSort friendsGetRequestsSort, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str, @Nullable List<? extends UsersFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("friends.getRequests", new uf.a(10));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 1000);
        }
        if (bool != null) {
            newApiRequest.addParam("need_mutual", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("out", bool2.booleanValue());
        }
        if (friendsGetRequestsSort != null) {
            newApiRequest.addParam("sort", friendsGetRequestsSort.getValue());
        }
        if (bool3 != null) {
            newApiRequest.addParam("need_viewed", bool3.booleanValue());
        }
        if (bool4 != null) {
            newApiRequest.addParam("suggested", bool4.booleanValue());
        }
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "ref", str, 0, KotlinVersion.MAX_COMPONENT_VALUE, 4, (Object) null);
        }
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
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<FriendsGetSuggestionsResponse> friendsGetSuggestions(@Nullable List<? extends FriendsGetSuggestionsFilter> list, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends UsersFields> list2, @Nullable FriendsGetSuggestionsNameCase friendsGetSuggestionsNameCase) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("friends.getSuggestions", new uf.a(7));
        ArrayList arrayList2 = null;
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends FriendsGetSuggestionsFilter> list3 = list;
            arrayList = new ArrayList(t.j(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((FriendsGetSuggestionsFilter) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("filter", (Iterable<?>) arrayList);
        }
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 0, 500);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (list2 != null) {
            List<? extends UsersFields> list4 = list2;
            arrayList2 = new ArrayList(t.j(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((UsersFields) it2.next()).getValue());
            }
        }
        if (arrayList2 != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList2);
        }
        if (friendsGetSuggestionsNameCase == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("name_case", friendsGetSuggestionsNameCase.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<FriendsSearchResponse> friendsSearch(@Nullable UserId userId, @Nullable String str, @Nullable List<? extends UsersFields> list, @Nullable FriendsSearchNameCase friendsSearchNameCase, @Nullable Integer num, @Nullable Integer num2) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("friends.search", new uf.a(2));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFields) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (friendsSearchNameCase != null) {
            newApiRequest.addParam("name_case", friendsSearchNameCase.getValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 1000);
        return newApiRequest;
    }
}
