package com.vk.sdk.api.fave;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.base.dto.BaseUserGroupFields;
import com.vk.sdk.api.fave.dto.FaveAddTagPosition;
import com.vk.sdk.api.fave.dto.FaveGetExtendedItemType;
import com.vk.sdk.api.fave.dto.FaveGetExtendedResponse;
import com.vk.sdk.api.fave.dto.FaveGetItemType;
import com.vk.sdk.api.fave.dto.FaveGetPagesResponse;
import com.vk.sdk.api.fave.dto.FaveGetPagesType;
import com.vk.sdk.api.fave.dto.FaveGetResponse;
import com.vk.sdk.api.fave.dto.FaveGetTagsResponse;
import com.vk.sdk.api.fave.dto.FaveSetTagsItemType;
import com.vk.sdk.api.fave.dto.FaveTag;
import io.sentry.TraceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t3.c;
import tf.a;

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
public final class FaveService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveAddArticle$lambda-0, reason: not valid java name */
    public static final BaseOkResponse m166faveAddArticle$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveAddLink$lambda-2, reason: not valid java name */
    public static final BaseOkResponse m167faveAddLink$lambda2(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest faveAddPage$default(FaveService faveService, UserId userId, UserId userId2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            userId2 = null;
        }
        return faveService.faveAddPage(userId, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveAddPage$lambda-4, reason: not valid java name */
    public static final BaseOkResponse m168faveAddPage$lambda4(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest faveAddPost$default(FaveService faveService, UserId userId, int i, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return faveService.faveAddPost(userId, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveAddPost$lambda-8, reason: not valid java name */
    public static final BaseOkResponse m169faveAddPost$lambda8(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest faveAddProduct$default(FaveService faveService, UserId userId, int i, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return faveService.faveAddProduct(userId, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveAddProduct$lambda-11, reason: not valid java name */
    public static final BaseOkResponse m170faveAddProduct$lambda11(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest faveAddTag$default(FaveService faveService, String str, FaveAddTagPosition faveAddTagPosition, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            faveAddTagPosition = null;
        }
        return faveService.faveAddTag(str, faveAddTagPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveAddTag$lambda-14, reason: not valid java name */
    public static final FaveTag m171faveAddTag$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (FaveTag) GsonHolder.INSTANCE.getGson().b(it, FaveTag.class);
    }

    public static /* synthetic */ VKRequest faveAddVideo$default(FaveService faveService, UserId userId, int i, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return faveService.faveAddVideo(userId, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveAddVideo$lambda-18, reason: not valid java name */
    public static final BaseOkResponse m172faveAddVideo$lambda18(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveEditTag$lambda-21, reason: not valid java name */
    public static final BaseOkResponse m173faveEditTag$lambda21(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest faveGet$default(FaveService faveService, FaveGetItemType faveGetItemType, Integer num, Integer num2, Integer num3, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            faveGetItemType = null;
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
            str = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        return faveService.faveGet(faveGetItemType, num, num2, num3, str, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveGet$lambda-23, reason: not valid java name */
    public static final FaveGetResponse m174faveGet$lambda23(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (FaveGetResponse) GsonHolder.INSTANCE.getGson().b(it, FaveGetResponse.class);
    }

    public static /* synthetic */ VKRequest faveGetExtended$default(FaveService faveService, FaveGetExtendedItemType faveGetExtendedItemType, Integer num, Integer num2, Integer num3, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            faveGetExtendedItemType = null;
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
            str = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        return faveService.faveGetExtended(faveGetExtendedItemType, num, num2, num3, str, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveGetExtended$lambda-31, reason: not valid java name */
    public static final FaveGetExtendedResponse m175faveGetExtended$lambda31(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (FaveGetExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, FaveGetExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest faveGetPages$default(FaveService faveService, Integer num, Integer num2, FaveGetPagesType faveGetPagesType, List list, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            faveGetPagesType = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        return faveService.faveGetPages(num, num2, faveGetPagesType, list, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveGetPages$lambda-39, reason: not valid java name */
    public static final FaveGetPagesResponse m176faveGetPages$lambda39(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (FaveGetPagesResponse) GsonHolder.INSTANCE.getGson().b(it, FaveGetPagesResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveGetTags$lambda-47, reason: not valid java name */
    public static final FaveGetTagsResponse m177faveGetTags$lambda47(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, FaveGetTagsResponse.class);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson…TagsResponse::class.java)");
        return (FaveGetTagsResponse) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveMarkSeen$lambda-48, reason: not valid java name */
    public static final BaseBoolInt m178faveMarkSeen$lambda48(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson… BaseBoolInt::class.java)");
        return (BaseBoolInt) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveRemoveArticle$lambda-49, reason: not valid java name */
    public static final BaseBoolInt m179faveRemoveArticle$lambda49(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest faveRemoveLink$default(FaveService faveService, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return faveService.faveRemoveLink(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveRemoveLink$lambda-51, reason: not valid java name */
    public static final BaseOkResponse m180faveRemoveLink$lambda51(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest faveRemovePage$default(FaveService faveService, UserId userId, UserId userId2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            userId2 = null;
        }
        return faveService.faveRemovePage(userId, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveRemovePage$lambda-55, reason: not valid java name */
    public static final BaseOkResponse m181faveRemovePage$lambda55(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveRemovePost$lambda-59, reason: not valid java name */
    public static final BaseOkResponse m182faveRemovePost$lambda59(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveRemoveProduct$lambda-61, reason: not valid java name */
    public static final BaseOkResponse m183faveRemoveProduct$lambda61(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveRemoveTag$lambda-63, reason: not valid java name */
    public static final BaseOkResponse m184faveRemoveTag$lambda63(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveRemoveVideo$lambda-65, reason: not valid java name */
    public static final BaseOkResponse m185faveRemoveVideo$lambda65(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveReorderTags$lambda-67, reason: not valid java name */
    public static final BaseOkResponse m186faveReorderTags$lambda67(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest faveSetPageTags$default(FaveService faveService, UserId userId, UserId userId2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            userId2 = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return faveService.faveSetPageTags(userId, userId2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveSetPageTags$lambda-69, reason: not valid java name */
    public static final BaseOkResponse m187faveSetPageTags$lambda69(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest faveSetTags$default(FaveService faveService, FaveSetTagsItemType faveSetTagsItemType, UserId userId, Integer num, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            faveSetTagsItemType = null;
        }
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        return faveService.faveSetTags(faveSetTagsItemType, userId, num, list, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveSetTags$lambda-74, reason: not valid java name */
    public static final BaseOkResponse m188faveSetTags$lambda74(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest faveTrackPageInteraction$default(FaveService faveService, UserId userId, UserId userId2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            userId2 = null;
        }
        return faveService.faveTrackPageInteraction(userId, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: faveTrackPageInteraction$lambda-82, reason: not valid java name */
    public static final BaseOkResponse m189faveTrackPageInteraction$lambda82(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveAddArticle(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        NewApiRequest newApiRequest = new NewApiRequest("fave.addArticle", new c(20));
        newApiRequest.addParam("url", url);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveAddLink(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        NewApiRequest newApiRequest = new NewApiRequest("fave.addLink", new c(21));
        newApiRequest.addParam("link", link);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveAddPage(@Nullable UserId userId, @Nullable UserId userId2) {
        NewApiRequest newApiRequest = new NewApiRequest("fave.addPage", new a(3));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (userId2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId2, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveAddPost(@NotNull UserId ownerId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("fave.addPost", new c(27));
        newApiRequest.addParam("owner_id", ownerId);
        newApiRequest.addParam("id", i);
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("access_key", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveAddProduct(@NotNull UserId ownerId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("fave.addProduct", new a(8));
        newApiRequest.addParam("owner_id", ownerId);
        newApiRequest.addParam("id", i);
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("access_key", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<FaveTag> faveAddTag(@Nullable String str, @Nullable FaveAddTagPosition faveAddTagPosition) {
        NewApiRequest newApiRequest = new NewApiRequest("fave.addTag", new c(24));
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "name", str, 0, 50, 4, (Object) null);
        }
        if (faveAddTagPosition == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("position", faveAddTagPosition.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveAddVideo(@NotNull UserId ownerId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("fave.addVideo", new a(6));
        newApiRequest.addParam("owner_id", ownerId);
        newApiRequest.addParam("id", i);
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("access_key", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveEditTag(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        NewApiRequest newApiRequest = new NewApiRequest("fave.editTag", new c(18));
        newApiRequest.addParam("id", i);
        NewApiRequest.addParam$default(newApiRequest, "name", name, 0, 50, 4, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<FaveGetResponse> faveGet(@Nullable FaveGetItemType faveGetItemType, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("fave.get", new a(10));
        if (faveGetItemType != null) {
            newApiRequest.addParam("item_type", faveGetItemType.getValue());
        }
        if (num != null) {
            newApiRequest.addParam("tag_id", num.intValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            newApiRequest.addParam("count", num3.intValue(), 1, 100);
        }
        if (str != null) {
            newApiRequest.addParam("fields", str);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("is_from_snackbar", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<FaveGetExtendedResponse> faveGetExtended(@Nullable FaveGetExtendedItemType faveGetExtendedItemType, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("fave.get", new a(2));
        newApiRequest.addParam("extended", true);
        if (faveGetExtendedItemType != null) {
            newApiRequest.addParam("item_type", faveGetExtendedItemType.getValue());
        }
        if (num != null) {
            newApiRequest.addParam("tag_id", num.intValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            newApiRequest.addParam("count", num3.intValue(), 1, 100);
        }
        if (str != null) {
            newApiRequest.addParam("fields", str);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("is_from_snackbar", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<FaveGetPagesResponse> faveGetPages(@Nullable Integer num, @Nullable Integer num2, @Nullable FaveGetPagesType faveGetPagesType, @Nullable List<? extends BaseUserGroupFields> list, @Nullable Integer num3) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("fave.getPages", new a(4));
        if (num != null) {
            newApiRequest.addParam("offset", num.intValue(), 0, 10000);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 1, 500);
        }
        if (faveGetPagesType != null) {
            newApiRequest.addParam("type", faveGetPagesType.getValue());
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
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (num3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("tag_id", num3.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<FaveGetTagsResponse> faveGetTags() {
        return new NewApiRequest("fave.getTags", new c(17));
    }

    @NotNull
    public final VKRequest<BaseBoolInt> faveMarkSeen() {
        return new NewApiRequest("fave.markSeen", new a(7));
    }

    @NotNull
    public final VKRequest<BaseBoolInt> faveRemoveArticle(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("fave.removeArticle", new a(0));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "article_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveRemoveLink(@Nullable String str, @Nullable String str2) {
        NewApiRequest newApiRequest = new NewApiRequest("fave.removeLink", new a(1));
        if (str != null) {
            newApiRequest.addParam("link_id", str);
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("link", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveRemovePage(@Nullable UserId userId, @Nullable UserId userId2) {
        NewApiRequest newApiRequest = new NewApiRequest("fave.removePage", new c(19));
        if (userId != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId);
        }
        if (userId2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("group_id", userId2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveRemovePost(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("fave.removePost", new c(25));
        newApiRequest.addParam("owner_id", ownerId);
        newApiRequest.addParam("id", i);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveRemoveProduct(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("fave.removeProduct", new c(26));
        newApiRequest.addParam("owner_id", ownerId);
        newApiRequest.addParam("id", i);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveRemoveTag(int i) {
        NewApiRequest newApiRequest = new NewApiRequest("fave.removeTag", new a(5));
        newApiRequest.addParam("id", i);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveRemoveVideo(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("fave.removeVideo", new c(28));
        newApiRequest.addParam("owner_id", ownerId);
        newApiRequest.addParam("id", i);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveReorderTags(@NotNull List<Integer> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        NewApiRequest newApiRequest = new NewApiRequest("fave.reorderTags", new c(22));
        newApiRequest.addParam("ids", ids);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveSetPageTags(@Nullable UserId userId, @Nullable UserId userId2, @Nullable List<Integer> list) {
        NewApiRequest newApiRequest = new NewApiRequest("fave.setPageTags", new a(9));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (userId2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId2, 0L, 0L, 8, (Object) null);
        }
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("tag_ids", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveSetTags(@Nullable FaveSetTagsItemType faveSetTagsItemType, @Nullable UserId userId, @Nullable Integer num, @Nullable List<Integer> list, @Nullable String str, @Nullable String str2) {
        NewApiRequest newApiRequest = new NewApiRequest("fave.setTags", new c(23));
        if (faveSetTagsItemType != null) {
            newApiRequest.addParam("item_type", faveSetTagsItemType.getValue());
        }
        if (userId != null) {
            newApiRequest.addParam("item_owner_id", userId);
        }
        if (num != null) {
            newApiRequest.addParam("item_id", num.intValue());
        }
        if (list != null) {
            newApiRequest.addParam("tag_ids", list);
        }
        if (str != null) {
            newApiRequest.addParam("link_id", str);
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("link_url", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> faveTrackPageInteraction(@Nullable UserId userId, @Nullable UserId userId2) {
        NewApiRequest newApiRequest = new NewApiRequest("fave.trackPageInteraction", new c(29));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (userId2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId2, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }
}
