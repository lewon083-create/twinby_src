package com.vk.sdk.api.notes;

import bg.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.notes.dto.NotesGetCommentsResponse;
import com.vk.sdk.api.notes.dto.NotesGetCommentsSort;
import com.vk.sdk.api.notes.dto.NotesGetResponse;
import com.vk.sdk.api.notes.dto.NotesGetSort;
import com.vk.sdk.api.notes.dto.NotesNote;
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
public final class NotesService {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest notesAdd$default(NotesService notesService, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        return notesService.notesAdd(str, str2, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notesAdd$lambda-0, reason: not valid java name */
    public static final Integer m375notesAdd$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    public static /* synthetic */ VKRequest notesCreateComment$default(NotesService notesService, int i, String str, UserId userId, Integer num, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        return notesService.notesCreateComment(i, str, userId, num, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notesCreateComment$lambda-4, reason: not valid java name */
    public static final Integer m376notesCreateComment$lambda4(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notesDelete$lambda-9, reason: not valid java name */
    public static final BaseOkResponse m377notesDelete$lambda9(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest notesDeleteComment$default(NotesService notesService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return notesService.notesDeleteComment(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notesDeleteComment$lambda-11, reason: not valid java name */
    public static final BaseOkResponse m378notesDeleteComment$lambda11(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest notesEdit$default(NotesService notesService, int i, String str, String str2, List list, List list2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            list = null;
        }
        if ((i10 & 16) != 0) {
            list2 = null;
        }
        return notesService.notesEdit(i, str, str2, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notesEdit$lambda-14, reason: not valid java name */
    public static final BaseOkResponse m379notesEdit$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest notesEditComment$default(NotesService notesService, int i, String str, UserId userId, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId = null;
        }
        return notesService.notesEditComment(i, str, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notesEditComment$lambda-18, reason: not valid java name */
    public static final BaseOkResponse m380notesEditComment$lambda18(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest notesGet$default(NotesService notesService, List list, UserId userId, Integer num, Integer num2, NotesGetSort notesGetSort, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            notesGetSort = null;
        }
        return notesService.notesGet(list, userId, num, num2, notesGetSort);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notesGet$lambda-21, reason: not valid java name */
    public static final NotesGetResponse m381notesGet$lambda21(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NotesGetResponse) GsonHolder.INSTANCE.getGson().b(it, NotesGetResponse.class);
    }

    public static /* synthetic */ VKRequest notesGetById$default(NotesService notesService, int i, UserId userId, Boolean bool, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        return notesService.notesGetById(i, userId, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notesGetById$lambda-28, reason: not valid java name */
    public static final NotesNote m382notesGetById$lambda28(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NotesNote) GsonHolder.INSTANCE.getGson().b(it, NotesNote.class);
    }

    public static /* synthetic */ VKRequest notesGetComments$default(NotesService notesService, int i, UserId userId, NotesGetCommentsSort notesGetCommentsSort, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            notesGetCommentsSort = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            num2 = null;
        }
        return notesService.notesGetComments(i, userId, notesGetCommentsSort, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notesGetComments$lambda-32, reason: not valid java name */
    public static final NotesGetCommentsResponse m383notesGetComments$lambda32(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NotesGetCommentsResponse) GsonHolder.INSTANCE.getGson().b(it, NotesGetCommentsResponse.class);
    }

    public static /* synthetic */ VKRequest notesRestoreComment$default(NotesService notesService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return notesService.notesRestoreComment(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notesRestoreComment$lambda-38, reason: not valid java name */
    public static final BaseOkResponse m384notesRestoreComment$lambda38(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<Integer> notesAdd(@NotNull String title, @NotNull String text, @Nullable List<String> list, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        NewApiRequest newApiRequest = new NewApiRequest("notes.add", new a(10));
        newApiRequest.addParam("title", title);
        newApiRequest.addParam("text", text);
        if (list != null) {
            newApiRequest.addParam("privacy_view", list);
        }
        if (list2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("privacy_comment", list2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> notesCreateComment(int i, @NotNull String message, @Nullable UserId userId, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        NewApiRequest newApiRequest = new NewApiRequest("notes.createComment", new a(16));
        NewApiRequest.addParam$default(newApiRequest, "note_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("message", message);
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "owner_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "reply_to", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("guid", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> notesDelete(int i) {
        NewApiRequest newApiRequest = new NewApiRequest("notes.delete", new a(15));
        NewApiRequest.addParam$default(newApiRequest, "note_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> notesDeleteComment(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("notes.deleteComment", new a(13));
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "owner_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> notesEdit(int i, @NotNull String title, @NotNull String text, @Nullable List<String> list, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        NewApiRequest newApiRequest = new NewApiRequest("notes.edit", new a(14));
        NewApiRequest.addParam$default(newApiRequest, "note_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("title", title);
        newApiRequest.addParam("text", text);
        if (list != null) {
            newApiRequest.addParam("privacy_view", list);
        }
        if (list2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("privacy_comment", list2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> notesEditComment(int i, @NotNull String message, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(message, "message");
        NewApiRequest newApiRequest = new NewApiRequest("notes.editComment", new a(12));
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "message", message, 2, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "owner_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NotesGetResponse> notesGet(@Nullable List<Integer> list, @Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable NotesGetSort notesGetSort) {
        NewApiRequest newApiRequest = new NewApiRequest("notes.get", new a(17));
        if (list != null) {
            newApiRequest.addParam("note_ids", list);
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 100);
        }
        if (notesGetSort == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("sort", notesGetSort.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NotesNote> notesGetById(int i, @Nullable UserId userId, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("notes.getById", new a(9));
        NewApiRequest.addParam$default(newApiRequest, "note_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "owner_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("need_wiki", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<NotesGetCommentsResponse> notesGetComments(int i, @Nullable UserId userId, @Nullable NotesGetCommentsSort notesGetCommentsSort, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("notes.getComments", new a(8));
        NewApiRequest.addParam$default(newApiRequest, "note_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "owner_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (notesGetCommentsSort != null) {
            newApiRequest.addParam("sort", notesGetCommentsSort.getValue());
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
    public final VKRequest<BaseOkResponse> notesRestoreComment(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("notes.restoreComment", new a(11));
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "owner_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }
}
