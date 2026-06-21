package com.vk.sdk.api.docs;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.base.dto.BaseUploadServer;
import com.vk.sdk.api.docs.dto.DocsDoc;
import com.vk.sdk.api.docs.dto.DocsGetMessagesUploadServerType;
import com.vk.sdk.api.docs.dto.DocsGetResponse;
import com.vk.sdk.api.docs.dto.DocsGetType;
import com.vk.sdk.api.docs.dto.DocsGetTypesResponse;
import com.vk.sdk.api.docs.dto.DocsSaveResponse;
import com.vk.sdk.api.docs.dto.DocsSearchResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import ni.v0;
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
public final class DocsService {
    public static /* synthetic */ VKRequest docsAdd$default(DocsService docsService, UserId userId, int i, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return docsService.docsAdd(userId, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: docsAdd$lambda-0, reason: not valid java name */
    public static final Integer m149docsAdd$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: docsDelete$lambda-3, reason: not valid java name */
    public static final BaseOkResponse m150docsDelete$lambda3(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest docsEdit$default(DocsService docsService, UserId userId, int i, String str, List list, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            list = null;
        }
        return docsService.docsEdit(userId, i, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: docsEdit$lambda-5, reason: not valid java name */
    public static final BaseOkResponse m151docsEdit$lambda5(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest docsGet$default(DocsService docsService, Integer num, Integer num2, DocsGetType docsGetType, UserId userId, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            docsGetType = null;
        }
        if ((i & 8) != 0) {
            userId = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        return docsService.docsGet(num, num2, docsGetType, userId, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: docsGet$lambda-8, reason: not valid java name */
    public static final DocsGetResponse m152docsGet$lambda8(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DocsGetResponse) GsonHolder.INSTANCE.getGson().b(it, DocsGetResponse.class);
    }

    public static /* synthetic */ VKRequest docsGetById$default(DocsService docsService, List list, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return docsService.docsGetById(list, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: docsGetById$lambda-15, reason: not valid java name */
    public static final List m153docsGetById$lambda15(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends DocsDoc>>() { // from class: com.vk.sdk.api.docs.DocsService$docsGetById$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest docsGetMessagesUploadServer$default(DocsService docsService, DocsGetMessagesUploadServerType docsGetMessagesUploadServerType, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            docsGetMessagesUploadServerType = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return docsService.docsGetMessagesUploadServer(docsGetMessagesUploadServerType, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: docsGetMessagesUploadServer$lambda-18, reason: not valid java name */
    public static final BaseUploadServer m154docsGetMessagesUploadServer$lambda18(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseUploadServer) GsonHolder.INSTANCE.getGson().b(it, BaseUploadServer.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: docsGetTypes$lambda-22, reason: not valid java name */
    public static final DocsGetTypesResponse m155docsGetTypes$lambda22(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DocsGetTypesResponse) GsonHolder.INSTANCE.getGson().b(it, DocsGetTypesResponse.class);
    }

    public static /* synthetic */ VKRequest docsGetUploadServer$default(DocsService docsService, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        return docsService.docsGetUploadServer(userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: docsGetUploadServer$lambda-24, reason: not valid java name */
    public static final BaseUploadServer m156docsGetUploadServer$lambda24(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseUploadServer) GsonHolder.INSTANCE.getGson().b(it, BaseUploadServer.class);
    }

    public static /* synthetic */ VKRequest docsGetWallUploadServer$default(DocsService docsService, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        return docsService.docsGetWallUploadServer(userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: docsGetWallUploadServer$lambda-27, reason: not valid java name */
    public static final BaseUploadServer m157docsGetWallUploadServer$lambda27(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseUploadServer) GsonHolder.INSTANCE.getGson().b(it, BaseUploadServer.class);
    }

    public static /* synthetic */ VKRequest docsSave$default(DocsService docsService, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        return docsService.docsSave(str, str2, str3, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: docsSave$lambda-30, reason: not valid java name */
    public static final DocsSaveResponse m158docsSave$lambda30(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DocsSaveResponse) GsonHolder.INSTANCE.getGson().b(it, DocsSaveResponse.class);
    }

    public static /* synthetic */ VKRequest docsSearch$default(DocsService docsService, String str, Boolean bool, Integer num, Integer num2, Boolean bool2, int i, Object obj) {
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
            bool2 = null;
        }
        return docsService.docsSearch(str, bool, num, num2, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: docsSearch$lambda-35, reason: not valid java name */
    public static final DocsSearchResponse m159docsSearch$lambda35(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DocsSearchResponse) GsonHolder.INSTANCE.getGson().b(it, DocsSearchResponse.class);
    }

    @NotNull
    public final VKRequest<Integer> docsAdd(@NotNull UserId ownerId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("docs.add", new pf.a(0));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "doc_id", i, 0, 0, 8, (Object) null);
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("access_key", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> docsDelete(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("docs.delete", new v0(22));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "doc_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> docsEdit(@NotNull UserId ownerId, int i, @NotNull String title, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        NewApiRequest newApiRequest = new NewApiRequest("docs.edit", new v0(21));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "doc_id", i, 0, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "title", title, 0, 128, 4, (Object) null);
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("tags", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DocsGetResponse> docsGet(@Nullable Integer num, @Nullable Integer num2, @Nullable DocsGetType docsGetType, @Nullable UserId userId, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("docs.get", new pf.a(1));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (docsGetType != null) {
            newApiRequest.addParam("type", docsGetType.getValue());
        }
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("return_tags", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<DocsDoc>> docsGetById(@NotNull List<String> docs, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(docs, "docs");
        NewApiRequest newApiRequest = new NewApiRequest("docs.getById", new v0(27));
        newApiRequest.addParam("docs", docs);
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("return_tags", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseUploadServer> docsGetMessagesUploadServer(@Nullable DocsGetMessagesUploadServerType docsGetMessagesUploadServerType, @Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("docs.getMessagesUploadServer", new v0(24));
        if (docsGetMessagesUploadServerType != null) {
            newApiRequest.addParam("type", docsGetMessagesUploadServerType.getValue());
        }
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("peer_id", num.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DocsGetTypesResponse> docsGetTypes(@NotNull UserId ownerId) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("docs.getTypes", new v0(26));
        newApiRequest.addParam("owner_id", ownerId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseUploadServer> docsGetUploadServer(@Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("docs.getUploadServer", new v0(25));
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseUploadServer> docsGetWallUploadServer(@Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("docs.getWallUploadServer", new v0(23));
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DocsSaveResponse> docsSave(@NotNull String file, @Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(file, "file");
        NewApiRequest newApiRequest = new NewApiRequest("docs.save", new v0(29));
        newApiRequest.addParam("file", file);
        if (str != null) {
            newApiRequest.addParam("title", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("tags", str2);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("return_tags", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DocsSearchResponse> docsSearch(@NotNull String q2, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(q2, "q");
        NewApiRequest newApiRequest = new NewApiRequest("docs.search", new v0(28));
        NewApiRequest.addParam$default(newApiRequest, "q", q2, 0, 512, 4, (Object) null);
        if (bool != null) {
            newApiRequest.addParam("search_own", bool.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (bool2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("return_tags", bool2.booleanValue());
        return newApiRequest;
    }
}
