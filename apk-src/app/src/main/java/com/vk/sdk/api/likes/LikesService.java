package com.vk.sdk.api.likes;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.likes.dto.LikesAddResponse;
import com.vk.sdk.api.likes.dto.LikesDeleteResponse;
import com.vk.sdk.api.likes.dto.LikesGetListExtendedFilter;
import com.vk.sdk.api.likes.dto.LikesGetListExtendedFriendsOnly;
import com.vk.sdk.api.likes.dto.LikesGetListExtendedResponse;
import com.vk.sdk.api.likes.dto.LikesGetListFilter;
import com.vk.sdk.api.likes.dto.LikesGetListFriendsOnly;
import com.vk.sdk.api.likes.dto.LikesGetListResponse;
import com.vk.sdk.api.likes.dto.LikesIsLikedResponse;
import io.sentry.TraceContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.a;

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
public final class LikesService {
    public static /* synthetic */ VKRequest likesAdd$default(LikesService likesService, String str, int i, UserId userId, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return likesService.likesAdd(str, i, userId, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: likesAdd$lambda-0, reason: not valid java name */
    public static final LikesAddResponse m272likesAdd$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (LikesAddResponse) GsonHolder.INSTANCE.getGson().b(it, LikesAddResponse.class);
    }

    public static /* synthetic */ VKRequest likesDelete$default(LikesService likesService, String str, int i, UserId userId, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return likesService.likesDelete(str, i, userId, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: likesDelete$lambda-4, reason: not valid java name */
    public static final LikesDeleteResponse m273likesDelete$lambda4(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (LikesDeleteResponse) GsonHolder.INSTANCE.getGson().b(it, LikesDeleteResponse.class);
    }

    public static /* synthetic */ VKRequest likesGetList$default(LikesService likesService, String str, UserId userId, Integer num, String str2, LikesGetListFilter likesGetListFilter, LikesGetListFriendsOnly likesGetListFriendsOnly, Integer num2, Integer num3, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            likesGetListFilter = null;
        }
        if ((i & 32) != 0) {
            likesGetListFriendsOnly = null;
        }
        if ((i & 64) != 0) {
            num2 = null;
        }
        if ((i & 128) != 0) {
            num3 = null;
        }
        if ((i & 256) != 0) {
            bool = null;
        }
        return likesService.likesGetList(str, userId, num, str2, likesGetListFilter, likesGetListFriendsOnly, num2, num3, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: likesGetList$lambda-8, reason: not valid java name */
    public static final LikesGetListResponse m274likesGetList$lambda8(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (LikesGetListResponse) GsonHolder.INSTANCE.getGson().b(it, LikesGetListResponse.class);
    }

    public static /* synthetic */ VKRequest likesGetListExtended$default(LikesService likesService, String str, UserId userId, Integer num, String str2, LikesGetListExtendedFilter likesGetListExtendedFilter, LikesGetListExtendedFriendsOnly likesGetListExtendedFriendsOnly, Integer num2, Integer num3, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            likesGetListExtendedFilter = null;
        }
        if ((i & 32) != 0) {
            likesGetListExtendedFriendsOnly = null;
        }
        if ((i & 64) != 0) {
            num2 = null;
        }
        if ((i & 128) != 0) {
            num3 = null;
        }
        if ((i & 256) != 0) {
            bool = null;
        }
        return likesService.likesGetListExtended(str, userId, num, str2, likesGetListExtendedFilter, likesGetListExtendedFriendsOnly, num2, num3, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: likesGetListExtended$lambda-18, reason: not valid java name */
    public static final LikesGetListExtendedResponse m275likesGetListExtended$lambda18(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (LikesGetListExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, LikesGetListExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest likesIsLiked$default(LikesService likesService, String str, int i, UserId userId, UserId userId2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId = null;
        }
        if ((i10 & 8) != 0) {
            userId2 = null;
        }
        return likesService.likesIsLiked(str, i, userId, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: likesIsLiked$lambda-28, reason: not valid java name */
    public static final LikesIsLikedResponse m276likesIsLiked$lambda28(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (LikesIsLikedResponse) GsonHolder.INSTANCE.getGson().b(it, LikesIsLikedResponse.class);
    }

    @NotNull
    public final VKRequest<LikesAddResponse> likesAdd(@NotNull String type, int i, @Nullable UserId userId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        NewApiRequest newApiRequest = new NewApiRequest("likes.add", new a(3));
        newApiRequest.addParam("type", type);
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("access_key", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<LikesDeleteResponse> likesDelete(@NotNull String type, int i, @Nullable UserId userId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        NewApiRequest newApiRequest = new NewApiRequest("likes.delete", new a(2));
        newApiRequest.addParam("type", type);
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("access_key", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<LikesGetListResponse> likesGetList(@NotNull String type, @Nullable UserId userId, @Nullable Integer num, @Nullable String str, @Nullable LikesGetListFilter likesGetListFilter, @Nullable LikesGetListFriendsOnly likesGetListFriendsOnly, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(type, "type");
        NewApiRequest newApiRequest = new NewApiRequest("likes.getList", new a(1));
        newApiRequest.addParam("type", type);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            newApiRequest.addParam("item_id", num.intValue());
        }
        if (str != null) {
            newApiRequest.addParam("page_url", str);
        }
        if (likesGetListFilter != null) {
            newApiRequest.addParam("filter", likesGetListFilter.getValue());
        }
        if (likesGetListFriendsOnly != null) {
            newApiRequest.addParam("friends_only", likesGetListFriendsOnly.getValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            newApiRequest.addParam("count", num3.intValue(), 0, 1000);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("skip_own", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<LikesGetListExtendedResponse> likesGetListExtended(@NotNull String type, @Nullable UserId userId, @Nullable Integer num, @Nullable String str, @Nullable LikesGetListExtendedFilter likesGetListExtendedFilter, @Nullable LikesGetListExtendedFriendsOnly likesGetListExtendedFriendsOnly, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(type, "type");
        NewApiRequest newApiRequest = new NewApiRequest("likes.getList", new a(0));
        newApiRequest.addParam("type", type);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            newApiRequest.addParam("item_id", num.intValue());
        }
        if (str != null) {
            newApiRequest.addParam("page_url", str);
        }
        if (likesGetListExtendedFilter != null) {
            newApiRequest.addParam("filter", likesGetListExtendedFilter.getValue());
        }
        if (likesGetListExtendedFriendsOnly != null) {
            newApiRequest.addParam("friends_only", likesGetListExtendedFriendsOnly.getValue());
        }
        newApiRequest.addParam("extended", true);
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            newApiRequest.addParam("count", num3.intValue(), 0, 1000);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("skip_own", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<LikesIsLikedResponse> likesIsLiked(@NotNull String type, int i, @Nullable UserId userId, @Nullable UserId userId2) {
        Intrinsics.checkNotNullParameter(type, "type");
        NewApiRequest newApiRequest = new NewApiRequest("likes.isLiked", new a(4));
        newApiRequest.addParam("type", type);
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (userId2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId2);
        return newApiRequest;
    }
}
