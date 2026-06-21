package com.vk.sdk.api.polls;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.base.dto.BaseUploadServer;
import com.vk.sdk.api.polls.dto.PollsBackground;
import com.vk.sdk.api.polls.dto.PollsCreateBackgroundId;
import com.vk.sdk.api.polls.dto.PollsEditBackgroundId;
import com.vk.sdk.api.polls.dto.PollsGetByIdNameCase;
import com.vk.sdk.api.polls.dto.PollsGetVotersNameCase;
import com.vk.sdk.api.polls.dto.PollsPoll;
import com.vk.sdk.api.polls.dto.PollsVoters;
import com.vk.sdk.api.users.dto.UsersFields;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
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
public final class PollsService {
    public static /* synthetic */ VKRequest pollsAddVote$default(PollsService pollsService, int i, List list, UserId userId, Boolean bool, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        return pollsService.pollsAddVote(i, list, userId, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pollsAddVote$lambda-0, reason: not valid java name */
    public static final BaseBoolInt m456pollsAddVote$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest pollsCreate$default(PollsService pollsService, String str, Boolean bool, Boolean bool2, Integer num, UserId userId, Integer num2, String str2, Integer num3, PollsCreateBackgroundId pollsCreateBackgroundId, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            userId = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            num3 = null;
        }
        if ((i & 256) != 0) {
            pollsCreateBackgroundId = null;
        }
        if ((i & 512) != 0) {
            bool3 = null;
        }
        return pollsService.pollsCreate(str, bool, bool2, num, userId, num2, str2, num3, pollsCreateBackgroundId, bool3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pollsCreate$lambda-4, reason: not valid java name */
    public static final PollsPoll m457pollsCreate$lambda4(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PollsPoll) GsonHolder.INSTANCE.getGson().b(it, PollsPoll.class);
    }

    public static /* synthetic */ VKRequest pollsDeleteVote$default(PollsService pollsService, int i, int i10, UserId userId, Boolean bool, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            userId = null;
        }
        if ((i11 & 8) != 0) {
            bool = null;
        }
        return pollsService.pollsDeleteVote(i, i10, userId, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pollsDeleteVote$lambda-16, reason: not valid java name */
    public static final BaseBoolInt m458pollsDeleteVote$lambda16(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest pollsEdit$default(PollsService pollsService, int i, UserId userId, String str, String str2, String str3, String str4, Integer num, Integer num2, PollsEditBackgroundId pollsEditBackgroundId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            str3 = null;
        }
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        if ((i10 & 64) != 0) {
            num = null;
        }
        if ((i10 & 128) != 0) {
            num2 = null;
        }
        if ((i10 & 256) != 0) {
            pollsEditBackgroundId = null;
        }
        return pollsService.pollsEdit(i, userId, str, str2, str3, str4, num, num2, pollsEditBackgroundId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pollsEdit$lambda-20, reason: not valid java name */
    public static final BaseOkResponse m459pollsEdit$lambda20(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pollsGetBackgrounds$lambda-30, reason: not valid java name */
    public static final List m460pollsGetBackgrounds$lambda30(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objC = GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PollsBackground>>() { // from class: com.vk.sdk.api.polls.PollsService$pollsGetBackgrounds$1$typeToken$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objC, "GsonHolder.gson.fromJson…ckground>>(it, typeToken)");
        return (List) objC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest pollsGetById$default(PollsService pollsService, int i, UserId userId, Boolean bool, Integer num, List list, PollsGetByIdNameCase pollsGetByIdNameCase, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            list = null;
        }
        if ((i10 & 32) != 0) {
            pollsGetByIdNameCase = null;
        }
        return pollsService.pollsGetById(i, userId, bool, num, list, pollsGetByIdNameCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pollsGetById$lambda-31, reason: not valid java name */
    public static final PollsPoll m461pollsGetById$lambda31(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PollsPoll) GsonHolder.INSTANCE.getGson().b(it, PollsPoll.class);
    }

    public static /* synthetic */ VKRequest pollsGetPhotoUploadServer$default(PollsService pollsService, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        return pollsService.pollsGetPhotoUploadServer(userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pollsGetPhotoUploadServer$lambda-38, reason: not valid java name */
    public static final BaseUploadServer m462pollsGetPhotoUploadServer$lambda38(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseUploadServer) GsonHolder.INSTANCE.getGson().b(it, BaseUploadServer.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest pollsGetVoters$default(PollsService pollsService, int i, List list, UserId userId, Boolean bool, Boolean bool2, Integer num, Integer num2, List list2, PollsGetVotersNameCase pollsGetVotersNameCase, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        if ((i10 & 16) != 0) {
            bool2 = null;
        }
        if ((i10 & 32) != 0) {
            num = null;
        }
        if ((i10 & 64) != 0) {
            num2 = null;
        }
        if ((i10 & 128) != 0) {
            list2 = null;
        }
        if ((i10 & 256) != 0) {
            pollsGetVotersNameCase = null;
        }
        return pollsService.pollsGetVoters(i, list, userId, bool, bool2, num, num2, list2, pollsGetVotersNameCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pollsGetVoters$lambda-41, reason: not valid java name */
    public static final List m463pollsGetVoters$lambda41(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PollsVoters>>() { // from class: com.vk.sdk.api.polls.PollsService$pollsGetVoters$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pollsSavePhoto$lambda-51, reason: not valid java name */
    public static final PollsBackground m464pollsSavePhoto$lambda51(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PollsBackground) GsonHolder.INSTANCE.getGson().b(it, PollsBackground.class);
    }

    @NotNull
    public final VKRequest<BaseBoolInt> pollsAddVote(int i, @NotNull List<Integer> answerIds, @Nullable UserId userId, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(answerIds, "answerIds");
        NewApiRequest newApiRequest = new NewApiRequest("polls.addVote", new ig.a(5));
        NewApiRequest.addParam$default(newApiRequest, "poll_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("answer_ids", answerIds);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("is_board", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PollsPoll> pollsCreate(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable UserId userId, @Nullable Integer num2, @Nullable String str2, @Nullable Integer num3, @Nullable PollsCreateBackgroundId pollsCreateBackgroundId, @Nullable Boolean bool3) {
        NewApiRequest newApiRequest = new NewApiRequest("polls.create", new ig.a(2));
        if (str != null) {
            newApiRequest.addParam("question", str);
        }
        if (bool != null) {
            newApiRequest.addParam("is_anonymous", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("is_multiple", bool2.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "end_date", num.intValue(), 1550700000, 0, 8, (Object) null);
        }
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num2 != null) {
            newApiRequest.addParam(CommonUrlParts.APP_ID, num2.intValue());
        }
        if (str2 != null) {
            newApiRequest.addParam("add_answers", str2);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "photo_id", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (pollsCreateBackgroundId != null) {
            newApiRequest.addParam("background_id", pollsCreateBackgroundId.getValue());
        }
        if (bool3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("disable_unvote", bool3.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> pollsDeleteVote(int i, int i10, @Nullable UserId userId, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("polls.deleteVote", new ig.a(4));
        NewApiRequest.addParam$default(newApiRequest, "poll_id", i, 0, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "answer_id", i10, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("is_board", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> pollsEdit(int i, @Nullable UserId userId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable Integer num2, @Nullable PollsEditBackgroundId pollsEditBackgroundId) {
        NewApiRequest newApiRequest = new NewApiRequest("polls.edit", new ig.a(6));
        NewApiRequest.addParam$default(newApiRequest, "poll_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str != null) {
            newApiRequest.addParam("question", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("add_answers", str2);
        }
        if (str3 != null) {
            newApiRequest.addParam("edit_answers", str3);
        }
        if (str4 != null) {
            newApiRequest.addParam("delete_answers", str4);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "end_date", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "photo_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (pollsEditBackgroundId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("background_id", pollsEditBackgroundId.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PollsBackground>> pollsGetBackgrounds() {
        return new NewApiRequest("polls.getBackgrounds", new ig.a(7));
    }

    @NotNull
    public final VKRequest<PollsPoll> pollsGetById(int i, @Nullable UserId userId, @Nullable Boolean bool, @Nullable Integer num, @Nullable List<String> list, @Nullable PollsGetByIdNameCase pollsGetByIdNameCase) {
        NewApiRequest newApiRequest = new NewApiRequest("polls.getById", new ig.a(3));
        NewApiRequest.addParam$default(newApiRequest, "poll_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (bool != null) {
            newApiRequest.addParam("is_board", bool.booleanValue());
        }
        if (num != null) {
            newApiRequest.addParam("friends_count", num.intValue(), 0, 100);
        }
        if (list != null) {
            newApiRequest.addParam("fields", list);
        }
        if (pollsGetByIdNameCase == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("name_case", pollsGetByIdNameCase.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseUploadServer> pollsGetPhotoUploadServer(@Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("polls.getPhotoUploadServer", new ig.a(0));
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PollsVoters>> pollsGetVoters(int i, @NotNull List<Integer> answerIds, @Nullable UserId userId, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends UsersFields> list, @Nullable PollsGetVotersNameCase pollsGetVotersNameCase) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(answerIds, "answerIds");
        NewApiRequest newApiRequest = new NewApiRequest("polls.getVoters", new ig.a(8));
        NewApiRequest.addParam$default(newApiRequest, "poll_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("answer_ids", answerIds);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (bool != null) {
            newApiRequest.addParam("is_board", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("friends_only", bool2.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num2.intValue(), 0, 0, 8, (Object) null);
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
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (pollsGetVotersNameCase == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("name_case", pollsGetVotersNameCase.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PollsBackground> pollsSavePhoto(@NotNull String photo, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(hash, "hash");
        NewApiRequest newApiRequest = new NewApiRequest("polls.savePhoto", new ig.a(1));
        newApiRequest.addParam("photo", photo);
        newApiRequest.addParam("hash", hash);
        return newApiRequest;
    }
}
