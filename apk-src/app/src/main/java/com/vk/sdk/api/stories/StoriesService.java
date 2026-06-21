package com.vk.sdk.api.stories;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.base.dto.BaseUserGroupFields;
import com.vk.sdk.api.stories.dto.StoriesGetBannedExtendedResponse;
import com.vk.sdk.api.stories.dto.StoriesGetBannedResponse;
import com.vk.sdk.api.stories.dto.StoriesGetByIdExtendedResponse;
import com.vk.sdk.api.stories.dto.StoriesGetPhotoUploadServerResponse;
import com.vk.sdk.api.stories.dto.StoriesGetV5113Response;
import com.vk.sdk.api.stories.dto.StoriesGetVideoUploadServerResponse;
import com.vk.sdk.api.stories.dto.StoriesGetViewersExtendedV5115Response;
import com.vk.sdk.api.stories.dto.StoriesSaveResponse;
import com.vk.sdk.api.stories.dto.StoriesStoryStats;
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
public final class StoriesService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesBanOwner$lambda-0, reason: not valid java name */
    public static final BaseOkResponse m495storiesBanOwner$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storiesDelete$default(StoriesService storiesService, UserId userId, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return storiesService.storiesDelete(userId, num, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesDelete$lambda-2, reason: not valid java name */
    public static final BaseOkResponse m496storiesDelete$lambda2(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storiesGet$default(StoriesService storiesService, UserId userId, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return storiesService.storiesGet(userId, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesGet$lambda-7, reason: not valid java name */
    public static final StoriesGetV5113Response m497storiesGet$lambda7(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoriesGetV5113Response) GsonHolder.INSTANCE.getGson().b(it, StoriesGetV5113Response.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storiesGetBanned$default(StoriesService storiesService, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return storiesService.storiesGetBanned(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesGetBanned$lambda-12, reason: not valid java name */
    public static final StoriesGetBannedResponse m498storiesGetBanned$lambda12(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoriesGetBannedResponse) GsonHolder.INSTANCE.getGson().b(it, StoriesGetBannedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storiesGetBannedExtended$default(StoriesService storiesService, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return storiesService.storiesGetBannedExtended(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesGetBannedExtended$lambda-16, reason: not valid java name */
    public static final StoriesGetBannedExtendedResponse m499storiesGetBannedExtended$lambda16(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoriesGetBannedExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, StoriesGetBannedExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storiesGetById$default(StoriesService storiesService, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = null;
        }
        return storiesService.storiesGetById(list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesGetById$lambda-20, reason: not valid java name */
    public static final StoriesGetByIdExtendedResponse m500storiesGetById$lambda20(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoriesGetByIdExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, StoriesGetByIdExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storiesGetPhotoUploadServer$default(StoriesService storiesService, Boolean bool, List list, String str, String str2, String str3, UserId userId, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            userId = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        return storiesService.storiesGetPhotoUploadServer(bool, list, str, str2, str3, userId, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesGetPhotoUploadServer$lambda-24, reason: not valid java name */
    public static final StoriesGetPhotoUploadServerResponse m501storiesGetPhotoUploadServer$lambda24(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoriesGetPhotoUploadServerResponse) GsonHolder.INSTANCE.getGson().b(it, StoriesGetPhotoUploadServerResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storiesGetReplies$default(StoriesService storiesService, UserId userId, int i, String str, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        return storiesService.storiesGetReplies(userId, i, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesGetReplies$lambda-33, reason: not valid java name */
    public static final StoriesGetV5113Response m502storiesGetReplies$lambda33(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoriesGetV5113Response) GsonHolder.INSTANCE.getGson().b(it, StoriesGetV5113Response.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesGetStats$lambda-38, reason: not valid java name */
    public static final StoriesStoryStats m503storiesGetStats$lambda38(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoriesStoryStats) GsonHolder.INSTANCE.getGson().b(it, StoriesStoryStats.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storiesGetVideoUploadServer$default(StoriesService storiesService, Boolean bool, List list, String str, String str2, String str3, UserId userId, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            userId = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        return storiesService.storiesGetVideoUploadServer(bool, list, str, str2, str3, userId, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesGetVideoUploadServer$lambda-40, reason: not valid java name */
    public static final StoriesGetVideoUploadServerResponse m504storiesGetVideoUploadServer$lambda40(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoriesGetVideoUploadServerResponse) GsonHolder.INSTANCE.getGson().b(it, StoriesGetVideoUploadServerResponse.class);
    }

    public static /* synthetic */ VKRequest storiesGetViewers$default(StoriesService storiesService, UserId userId, int i, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        return storiesService.storiesGetViewers(userId, i, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesGetViewers$lambda-49, reason: not valid java name */
    public static final StoriesGetViewersExtendedV5115Response m505storiesGetViewers$lambda49(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoriesGetViewersExtendedV5115Response) GsonHolder.INSTANCE.getGson().b(it, StoriesGetViewersExtendedV5115Response.class);
    }

    public static /* synthetic */ VKRequest storiesGetViewersExtended$default(StoriesService storiesService, UserId userId, int i, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        return storiesService.storiesGetViewersExtended(userId, i, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesGetViewersExtended$lambda-53, reason: not valid java name */
    public static final StoriesGetViewersExtendedV5115Response m506storiesGetViewersExtended$lambda53(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoriesGetViewersExtendedV5115Response) GsonHolder.INSTANCE.getGson().b(it, StoriesGetViewersExtendedV5115Response.class);
    }

    public static /* synthetic */ VKRequest storiesHideAllReplies$default(StoriesService storiesService, UserId userId, UserId userId2, int i, Object obj) {
        if ((i & 2) != 0) {
            userId2 = null;
        }
        return storiesService.storiesHideAllReplies(userId, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesHideAllReplies$lambda-57, reason: not valid java name */
    public static final BaseOkResponse m507storiesHideAllReplies$lambda57(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesHideReply$lambda-60, reason: not valid java name */
    public static final BaseOkResponse m508storiesHideReply$lambda60(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storiesSave$default(StoriesService storiesService, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = null;
        }
        return storiesService.storiesSave(list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesSave$lambda-62, reason: not valid java name */
    public static final StoriesSaveResponse m509storiesSave$lambda62(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoriesSaveResponse) GsonHolder.INSTANCE.getGson().b(it, StoriesSaveResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storiesSearch$default(StoriesService storiesService, String str, Integer num, Float f10, Float f11, Integer num2, Integer num3, Integer num4, List list, int i, Object obj) {
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
            num4 = null;
        }
        if ((i & 128) != 0) {
            list = null;
        }
        return storiesService.storiesSearch(str, num, f10, f11, num2, num3, num4, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesSearch$lambda-65, reason: not valid java name */
    public static final StoriesGetV5113Response m510storiesSearch$lambda65(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoriesGetV5113Response) GsonHolder.INSTANCE.getGson().b(it, StoriesGetV5113Response.class);
    }

    public static /* synthetic */ VKRequest storiesSendInteraction$default(StoriesService storiesService, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            bool3 = null;
        }
        return storiesService.storiesSendInteraction(str, str2, bool, bool2, bool3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesSendInteraction$lambda-75, reason: not valid java name */
    public static final BaseOkResponse m511storiesSendInteraction$lambda75(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storiesUnbanOwner$lambda-81, reason: not valid java name */
    public static final BaseOkResponse m512storiesUnbanOwner$lambda81(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<BaseOkResponse> storiesBanOwner(@NotNull List<UserId> ownersIds) {
        Intrinsics.checkNotNullParameter(ownersIds, "ownersIds");
        NewApiRequest newApiRequest = new NewApiRequest("stories.banOwner", new a(24));
        NewApiRequest.addParam$default(newApiRequest, "owners_ids", ownersIds, 0L, 0L, 12, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> storiesDelete(@Nullable UserId userId, @Nullable Integer num, @Nullable List<String> list) {
        NewApiRequest newApiRequest = new NewApiRequest("stories.delete", new a(18));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "story_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("stories", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<StoriesGetV5113Response> storiesGet(@Nullable UserId userId, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("stories.get", new a(15));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
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
    public final VKRequest<StoriesGetBannedResponse> storiesGetBanned(@Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("stories.getBanned", new a(19));
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
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<StoriesGetBannedExtendedResponse> storiesGetBannedExtended(@Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("stories.getBanned", new qg.a(1));
        newApiRequest.addParam("extended", true);
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
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<StoriesGetByIdExtendedResponse> storiesGetById(@NotNull List<String> stories, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(stories, "stories");
        NewApiRequest newApiRequest = new NewApiRequest("stories.getById", new a(21));
        newApiRequest.addParam("stories", stories);
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
    public final VKRequest<StoriesGetPhotoUploadServerResponse> storiesGetPhotoUploadServer(@Nullable Boolean bool, @Nullable List<Integer> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable UserId userId, @Nullable String str4) {
        NewApiRequest newApiRequest = new NewApiRequest("stories.getPhotoUploadServer", new qg.a(0));
        if (bool != null) {
            newApiRequest.addParam("add_to_news", bool.booleanValue());
        }
        if (list != null) {
            newApiRequest.addParam("user_ids", list);
        }
        if (str != null) {
            newApiRequest.addParam("reply_to_story", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("link_text", str2);
        }
        if (str3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "link_url", str3, 0, 2048, 4, (Object) null);
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (str4 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("clickable_stickers", str4);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<StoriesGetV5113Response> storiesGetReplies(@NotNull UserId ownerId, int i, @Nullable String str, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("stories.getReplies", new a(28));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "story_id", i, 0, 0, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("access_key", str);
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
    public final VKRequest<StoriesStoryStats> storiesGetStats(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("stories.getStats", new a(25));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "story_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<StoriesGetVideoUploadServerResponse> storiesGetVideoUploadServer(@Nullable Boolean bool, @Nullable List<Integer> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable UserId userId, @Nullable String str4) {
        NewApiRequest newApiRequest = new NewApiRequest("stories.getVideoUploadServer", new a(23));
        if (bool != null) {
            newApiRequest.addParam("add_to_news", bool.booleanValue());
        }
        if (list != null) {
            newApiRequest.addParam("user_ids", list);
        }
        if (str != null) {
            newApiRequest.addParam("reply_to_story", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("link_text", str2);
        }
        if (str3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "link_url", str3, 0, 2048, 4, (Object) null);
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (str4 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("clickable_stickers", str4);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<StoriesGetViewersExtendedV5115Response> storiesGetViewers(@NotNull UserId ownerId, int i, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("stories.getViewers", new a(22));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "story_id", i, 0, 0, 8, (Object) null);
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
    public final VKRequest<StoriesGetViewersExtendedV5115Response> storiesGetViewersExtended(@NotNull UserId ownerId, int i, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("stories.getViewers", new a(27));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "story_id", i, 0, 0, 8, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        newApiRequest.addParam("extended", true);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> storiesHideAllReplies(@NotNull UserId ownerId, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("stories.hideAllReplies", new a(26));
        newApiRequest.addParam("owner_id", ownerId);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> storiesHideReply(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("stories.hideReply", new a(20));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "story_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<StoriesSaveResponse> storiesSave(@NotNull List<String> uploadResults, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(uploadResults, "uploadResults");
        NewApiRequest newApiRequest = new NewApiRequest("stories.save", new a(29));
        newApiRequest.addParam("upload_results", uploadResults);
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<StoriesGetV5113Response> storiesSearch(@Nullable String str, @Nullable Integer num, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable List<String> list) {
        NewApiRequest newApiRequest = new NewApiRequest("stories.search", new a(14));
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "q", str, 0, KotlinVersion.MAX_COMPONENT_VALUE, 4, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "place_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (f10 != null) {
            newApiRequest.addParam("latitude", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("longitude", f11.floatValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "radius", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            newApiRequest.addParam("mentioned_id", num3.intValue());
        }
        if (num4 != null) {
            newApiRequest.addParam("count", num4.intValue(), 1, 1000);
        }
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> storiesSendInteraction(@NotNull String accessKey, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        NewApiRequest newApiRequest = new NewApiRequest("stories.sendInteraction", new a(17));
        newApiRequest.addParam("access_key", accessKey);
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "message", str, 0, 1000, 4, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("is_broadcast", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("is_anonymous", bool2.booleanValue());
        }
        if (bool3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("unseen_marker", bool3.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> storiesUnbanOwner(@NotNull List<UserId> ownersIds) {
        Intrinsics.checkNotNullParameter(ownersIds, "ownersIds");
        NewApiRequest newApiRequest = new NewApiRequest("stories.unbanOwner", new a(16));
        NewApiRequest.addParam$default(newApiRequest, "owners_ids", ownersIds, 0L, 0L, 12, (Object) null);
        return newApiRequest;
    }
}
