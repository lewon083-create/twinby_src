package com.vk.sdk.api.board;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.board.dto.BoardGetCommentsExtendedResponse;
import com.vk.sdk.api.board.dto.BoardGetCommentsExtendedSort;
import com.vk.sdk.api.board.dto.BoardGetCommentsResponse;
import com.vk.sdk.api.board.dto.BoardGetCommentsSort;
import com.vk.sdk.api.board.dto.BoardGetTopicsExtendedOrder;
import com.vk.sdk.api.board.dto.BoardGetTopicsExtendedPreview;
import com.vk.sdk.api.board.dto.BoardGetTopicsExtendedResponse;
import com.vk.sdk.api.board.dto.BoardGetTopicsOrder;
import com.vk.sdk.api.board.dto.BoardGetTopicsPreview;
import com.vk.sdk.api.board.dto.BoardGetTopicsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import n5.b;
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
public final class BoardService {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest boardAddTopic$default(BoardService boardService, UserId userId, String str, String str2, Boolean bool, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        return boardService.boardAddTopic(userId, str, str2, bool, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardAddTopic$lambda-0, reason: not valid java name */
    public static final Integer m122boardAddTopic$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardCloseTopic$lambda-5, reason: not valid java name */
    public static final BaseOkResponse m123boardCloseTopic$lambda5(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest boardCreateComment$default(BoardService boardService, UserId userId, int i, String str, List list, Boolean bool, Integer num, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            num = null;
        }
        if ((i10 & 64) != 0) {
            str2 = null;
        }
        return boardService.boardCreateComment(userId, i, str, list, bool, num, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardCreateComment$lambda-7, reason: not valid java name */
    public static final Integer m124boardCreateComment$lambda7(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardDeleteComment$lambda-14, reason: not valid java name */
    public static final BaseOkResponse m125boardDeleteComment$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardDeleteTopic$lambda-16, reason: not valid java name */
    public static final BaseOkResponse m126boardDeleteTopic$lambda16(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest boardEditComment$default(BoardService boardService, UserId userId, int i, int i10, String str, List list, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            list = null;
        }
        return boardService.boardEditComment(userId, i, i10, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardEditComment$lambda-18, reason: not valid java name */
    public static final BaseOkResponse m127boardEditComment$lambda18(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardEditTopic$lambda-22, reason: not valid java name */
    public static final BaseOkResponse m128boardEditTopic$lambda22(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardFixTopic$lambda-24, reason: not valid java name */
    public static final BaseOkResponse m129boardFixTopic$lambda24(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest boardGetComments$default(BoardService boardService, UserId userId, int i, Boolean bool, Integer num, Integer num2, Integer num3, BoardGetCommentsSort boardGetCommentsSort, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            num2 = null;
        }
        if ((i10 & 32) != 0) {
            num3 = null;
        }
        if ((i10 & 64) != 0) {
            boardGetCommentsSort = null;
        }
        return boardService.boardGetComments(userId, i, bool, num, num2, num3, boardGetCommentsSort);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardGetComments$lambda-26, reason: not valid java name */
    public static final BoardGetCommentsResponse m130boardGetComments$lambda26(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BoardGetCommentsResponse) GsonHolder.INSTANCE.getGson().b(it, BoardGetCommentsResponse.class);
    }

    public static /* synthetic */ VKRequest boardGetCommentsExtended$default(BoardService boardService, UserId userId, int i, Boolean bool, Integer num, Integer num2, Integer num3, BoardGetCommentsExtendedSort boardGetCommentsExtendedSort, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            num2 = null;
        }
        if ((i10 & 32) != 0) {
            num3 = null;
        }
        if ((i10 & 64) != 0) {
            boardGetCommentsExtendedSort = null;
        }
        return boardService.boardGetCommentsExtended(userId, i, bool, num, num2, num3, boardGetCommentsExtendedSort);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardGetCommentsExtended$lambda-33, reason: not valid java name */
    public static final BoardGetCommentsExtendedResponse m131boardGetCommentsExtended$lambda33(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BoardGetCommentsExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, BoardGetCommentsExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest boardGetTopics$default(BoardService boardService, UserId userId, List list, BoardGetTopicsOrder boardGetTopicsOrder, Integer num, Integer num2, BoardGetTopicsPreview boardGetTopicsPreview, Integer num3, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            boardGetTopicsOrder = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            boardGetTopicsPreview = null;
        }
        if ((i & 64) != 0) {
            num3 = null;
        }
        return boardService.boardGetTopics(userId, list, boardGetTopicsOrder, num, num2, boardGetTopicsPreview, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardGetTopics$lambda-40, reason: not valid java name */
    public static final BoardGetTopicsResponse m132boardGetTopics$lambda40(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BoardGetTopicsResponse) GsonHolder.INSTANCE.getGson().b(it, BoardGetTopicsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest boardGetTopicsExtended$default(BoardService boardService, UserId userId, List list, BoardGetTopicsExtendedOrder boardGetTopicsExtendedOrder, Integer num, Integer num2, BoardGetTopicsExtendedPreview boardGetTopicsExtendedPreview, Integer num3, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            boardGetTopicsExtendedOrder = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            boardGetTopicsExtendedPreview = null;
        }
        if ((i & 64) != 0) {
            num3 = null;
        }
        return boardService.boardGetTopicsExtended(userId, list, boardGetTopicsExtendedOrder, num, num2, boardGetTopicsExtendedPreview, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardGetTopicsExtended$lambda-48, reason: not valid java name */
    public static final BoardGetTopicsExtendedResponse m133boardGetTopicsExtended$lambda48(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BoardGetTopicsExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, BoardGetTopicsExtendedResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardOpenTopic$lambda-56, reason: not valid java name */
    public static final BaseOkResponse m134boardOpenTopic$lambda56(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardRestoreComment$lambda-58, reason: not valid java name */
    public static final BaseOkResponse m135boardRestoreComment$lambda58(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: boardUnfixTopic$lambda-60, reason: not valid java name */
    public static final BaseOkResponse m136boardUnfixTopic$lambda60(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<Integer> boardAddTopic(@NotNull UserId groupId, @NotNull String title, @Nullable String str, @Nullable Boolean bool, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        NewApiRequest newApiRequest = new NewApiRequest("board.addTopic", new b(18));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        newApiRequest.addParam("title", title);
        if (str != null) {
            newApiRequest.addParam("text", str);
        }
        if (bool != null) {
            newApiRequest.addParam("from_group", bool.booleanValue());
        }
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("attachments", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> boardCloseTopic(int i, int i10) {
        NewApiRequest newApiRequest = new NewApiRequest("board.closeTopic", new b(7));
        NewApiRequest.addParam$default(newApiRequest, "group_id", i, 0, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "topic_id", i10, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> boardCreateComment(@NotNull UserId groupId, int i, @Nullable String str, @Nullable List<String> list, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("board.createComment", new b(17));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "topic_id", i, 0, 0, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("message", str);
        }
        if (list != null) {
            newApiRequest.addParam("attachments", list);
        }
        if (bool != null) {
            newApiRequest.addParam("from_group", bool.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "sticker_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("guid", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> boardDeleteComment(@NotNull UserId groupId, int i, int i10) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("board.deleteComment", new b(5));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "topic_id", i, 1, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i10, 1, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> boardDeleteTopic(@NotNull UserId groupId, int i) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("board.deleteTopic", new b(19));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "topic_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> boardEditComment(@NotNull UserId groupId, int i, int i10, @Nullable String str, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("board.editComment", new b(9));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "topic_id", i, 0, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i10, 0, 0, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("message", str);
        }
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("attachments", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> boardEditTopic(@NotNull UserId groupId, int i, @NotNull String title) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        NewApiRequest newApiRequest = new NewApiRequest("board.editTopic", new b(15));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "topic_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("title", title);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> boardFixTopic(int i, int i10) {
        NewApiRequest newApiRequest = new NewApiRequest("board.fixTopic", new b(16));
        NewApiRequest.addParam$default(newApiRequest, "group_id", i, 0, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "topic_id", i10, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BoardGetCommentsResponse> boardGetComments(@NotNull UserId groupId, int i, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable BoardGetCommentsSort boardGetCommentsSort) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("board.getComments", new b(14));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "topic_id", i, 0, 0, 8, (Object) null);
        if (bool != null) {
            newApiRequest.addParam("need_likes", bool.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_comment_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("offset", num2.intValue());
        }
        if (num3 != null) {
            newApiRequest.addParam("count", num3.intValue(), 0, 100);
        }
        if (boardGetCommentsSort == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("sort", boardGetCommentsSort.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BoardGetCommentsExtendedResponse> boardGetCommentsExtended(@NotNull UserId groupId, int i, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable BoardGetCommentsExtendedSort boardGetCommentsExtendedSort) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("board.getComments", new b(12));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "topic_id", i, 0, 0, 8, (Object) null);
        if (bool != null) {
            newApiRequest.addParam("need_likes", bool.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_comment_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("offset", num2.intValue());
        }
        if (num3 != null) {
            newApiRequest.addParam("count", num3.intValue(), 0, 100);
        }
        newApiRequest.addParam("extended", true);
        if (boardGetCommentsExtendedSort == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("sort", boardGetCommentsExtendedSort.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BoardGetTopicsResponse> boardGetTopics(@NotNull UserId groupId, @Nullable List<Integer> list, @Nullable BoardGetTopicsOrder boardGetTopicsOrder, @Nullable Integer num, @Nullable Integer num2, @Nullable BoardGetTopicsPreview boardGetTopicsPreview, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("board.getTopics", new b(8));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (list != null) {
            newApiRequest.addParam("topic_ids", list);
        }
        if (boardGetTopicsOrder != null) {
            newApiRequest.addParam("order", boardGetTopicsOrder.getValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 100);
        }
        if (boardGetTopicsPreview != null) {
            newApiRequest.addParam("preview", boardGetTopicsPreview.getValue());
        }
        if (num3 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "preview_length", num3.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BoardGetTopicsExtendedResponse> boardGetTopicsExtended(@NotNull UserId groupId, @Nullable List<Integer> list, @Nullable BoardGetTopicsExtendedOrder boardGetTopicsExtendedOrder, @Nullable Integer num, @Nullable Integer num2, @Nullable BoardGetTopicsExtendedPreview boardGetTopicsExtendedPreview, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("board.getTopics", new b(13));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (list != null) {
            newApiRequest.addParam("topic_ids", list);
        }
        if (boardGetTopicsExtendedOrder != null) {
            newApiRequest.addParam("order", boardGetTopicsExtendedOrder.getValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 100);
        }
        newApiRequest.addParam("extended", true);
        if (boardGetTopicsExtendedPreview != null) {
            newApiRequest.addParam("preview", boardGetTopicsExtendedPreview.getValue());
        }
        if (num3 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "preview_length", num3.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> boardOpenTopic(int i, int i10) {
        NewApiRequest newApiRequest = new NewApiRequest("board.openTopic", new b(10));
        NewApiRequest.addParam$default(newApiRequest, "group_id", i, 0, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "topic_id", i10, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> boardRestoreComment(@NotNull UserId groupId, int i, int i10) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("board.restoreComment", new b(6));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "topic_id", i, 0, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i10, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> boardUnfixTopic(int i, int i10) {
        NewApiRequest newApiRequest = new NewApiRequest("board.unfixTopic", new b(11));
        NewApiRequest.addParam$default(newApiRequest, "group_id", i, 0, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "topic_id", i10, 0, 0, 8, (Object) null);
        return newApiRequest;
    }
}
