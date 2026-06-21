package com.vk.sdk.api.pages;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.pages.dto.PagesSaveAccessEdit;
import com.vk.sdk.api.pages.dto.PagesSaveAccessView;
import com.vk.sdk.api.pages.dto.PagesWikipage;
import com.vk.sdk.api.pages.dto.PagesWikipageFull;
import com.vk.sdk.api.pages.dto.PagesWikipageHistory;
import io.sentry.TraceContext;
import java.util.List;
import kotlin.Metadata;
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
public final class PagesService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pagesClearCache$lambda-0, reason: not valid java name */
    public static final BaseOkResponse m396pagesClearCache$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest pagesGet$default(PagesService pagesService, UserId userId, Integer num, Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, int i, Object obj) {
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
            bool2 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            bool3 = null;
        }
        if ((i & 64) != 0) {
            bool4 = null;
        }
        return pagesService.pagesGet(userId, num, bool, bool2, str, bool3, bool4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pagesGet$lambda-2, reason: not valid java name */
    public static final PagesWikipageFull m397pagesGet$lambda2(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PagesWikipageFull) GsonHolder.INSTANCE.getGson().b(it, PagesWikipageFull.class);
    }

    public static /* synthetic */ VKRequest pagesGetHistory$default(PagesService pagesService, int i, UserId userId, UserId userId2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        return pagesService.pagesGetHistory(i, userId, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pagesGetHistory$lambda-11, reason: not valid java name */
    public static final List m398pagesGetHistory$lambda11(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PagesWikipageHistory>>() { // from class: com.vk.sdk.api.pages.PagesService$pagesGetHistory$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest pagesGetTitles$default(PagesService pagesService, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        return pagesService.pagesGetTitles(userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pagesGetTitles$lambda-15, reason: not valid java name */
    public static final List m399pagesGetTitles$lambda15(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PagesWikipage>>() { // from class: com.vk.sdk.api.pages.PagesService$pagesGetTitles$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest pagesGetVersion$default(PagesService pagesService, int i, UserId userId, UserId userId2, Boolean bool, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        return pagesService.pagesGetVersion(i, userId, userId2, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pagesGetVersion$lambda-18, reason: not valid java name */
    public static final PagesWikipageFull m400pagesGetVersion$lambda18(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PagesWikipageFull) GsonHolder.INSTANCE.getGson().b(it, PagesWikipageFull.class);
    }

    public static /* synthetic */ VKRequest pagesParseWiki$default(PagesService pagesService, String str, UserId userId, int i, Object obj) {
        if ((i & 2) != 0) {
            userId = null;
        }
        return pagesService.pagesParseWiki(str, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pagesParseWiki$lambda-23, reason: not valid java name */
    public static final String m401pagesParseWiki$lambda23(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (String) GsonHolder.INSTANCE.getGson().b(it, String.class);
    }

    public static /* synthetic */ VKRequest pagesSave$default(PagesService pagesService, String str, Integer num, UserId userId, UserId userId2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            userId = null;
        }
        if ((i & 8) != 0) {
            userId2 = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        return pagesService.pagesSave(str, num, userId, userId2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pagesSave$lambda-26, reason: not valid java name */
    public static final Integer m402pagesSave$lambda26(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    public static /* synthetic */ VKRequest pagesSaveAccess$default(PagesService pagesService, int i, UserId userId, UserId userId2, PagesSaveAccessView pagesSaveAccessView, PagesSaveAccessEdit pagesSaveAccessEdit, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        if ((i10 & 8) != 0) {
            pagesSaveAccessView = null;
        }
        if ((i10 & 16) != 0) {
            pagesSaveAccessEdit = null;
        }
        return pagesService.pagesSaveAccess(i, userId, userId2, pagesSaveAccessView, pagesSaveAccessEdit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pagesSaveAccess$lambda-33, reason: not valid java name */
    public static final Integer m403pagesSaveAccess$lambda33(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    @NotNull
    public final VKRequest<BaseOkResponse> pagesClearCache(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        NewApiRequest newApiRequest = new NewApiRequest("pages.clearCache", new ff.a(6));
        newApiRequest.addParam("url", url);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PagesWikipageFull> pagesGet(@Nullable UserId userId, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str, @Nullable Boolean bool3, @Nullable Boolean bool4) {
        NewApiRequest newApiRequest = new NewApiRequest("pages.get", new ff.a(7));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            newApiRequest.addParam("page_id", num.intValue());
        }
        if (bool != null) {
            newApiRequest.addParam("global", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("site_preview", bool2.booleanValue());
        }
        if (str != null) {
            newApiRequest.addParam("title", str);
        }
        if (bool3 != null) {
            newApiRequest.addParam("need_source", bool3.booleanValue());
        }
        if (bool4 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("need_html", bool4.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PagesWikipageHistory>> pagesGetHistory(int i, @Nullable UserId userId, @Nullable UserId userId2) {
        NewApiRequest newApiRequest = new NewApiRequest("pages.getHistory", new ff.a(10));
        newApiRequest.addParam("page_id", i);
        if (userId != null) {
            newApiRequest.addParam("group_id", userId);
        }
        if (userId2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PagesWikipage>> pagesGetTitles(@Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("pages.getTitles", new ff.a(11));
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("group_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PagesWikipageFull> pagesGetVersion(int i, @Nullable UserId userId, @Nullable UserId userId2, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("pages.getVersion", new ff.a(8));
        newApiRequest.addParam("version_id", i);
        if (userId != null) {
            newApiRequest.addParam("group_id", userId);
        }
        if (userId2 != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId2);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("need_html", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<String> pagesParseWiki(@NotNull String text, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(text, "text");
        NewApiRequest newApiRequest = new NewApiRequest("pages.parseWiki", new ff.a(4));
        newApiRequest.addParam("text", text);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> pagesSave(@Nullable String str, @Nullable Integer num, @Nullable UserId userId, @Nullable UserId userId2, @Nullable String str2) {
        NewApiRequest newApiRequest = new NewApiRequest("pages.save", new ff.a(5));
        if (str != null) {
            newApiRequest.addParam("text", str);
        }
        if (num != null) {
            newApiRequest.addParam("page_id", num.intValue());
        }
        if (userId != null) {
            newApiRequest.addParam("group_id", userId);
        }
        if (userId2 != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId2);
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("title", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> pagesSaveAccess(int i, @Nullable UserId userId, @Nullable UserId userId2, @Nullable PagesSaveAccessView pagesSaveAccessView, @Nullable PagesSaveAccessEdit pagesSaveAccessEdit) {
        NewApiRequest newApiRequest = new NewApiRequest("pages.saveAccess", new ff.a(9));
        newApiRequest.addParam("page_id", i);
        if (userId != null) {
            newApiRequest.addParam("group_id", userId);
        }
        if (userId2 != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId2);
        }
        if (pagesSaveAccessView != null) {
            newApiRequest.addParam("view", pagesSaveAccessView.getValue());
        }
        if (pagesSaveAccessEdit == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("edit", pagesSaveAccessEdit.getValue());
        return newApiRequest;
    }
}
