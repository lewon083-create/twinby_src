package com.vk.sdk.api.messages;

import a0.h1;
import com.google.gson.reflect.a;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.base.dto.BaseUserGroupFields;
import com.vk.sdk.api.messages.dto.MessagesDeleteChatPhotoResponse;
import com.vk.sdk.api.messages.dto.MessagesDeleteConversationResponse;
import com.vk.sdk.api.messages.dto.MessagesGetByConversationMessageIdExtendedResponse;
import com.vk.sdk.api.messages.dto.MessagesGetByConversationMessageIdResponse;
import com.vk.sdk.api.messages.dto.MessagesGetByIdExtendedResponse;
import com.vk.sdk.api.messages.dto.MessagesGetByIdResponse;
import com.vk.sdk.api.messages.dto.MessagesGetChatPreviewResponse;
import com.vk.sdk.api.messages.dto.MessagesGetConversationById;
import com.vk.sdk.api.messages.dto.MessagesGetConversationByIdExtended;
import com.vk.sdk.api.messages.dto.MessagesGetConversationMembers;
import com.vk.sdk.api.messages.dto.MessagesGetConversationsFilter;
import com.vk.sdk.api.messages.dto.MessagesGetConversationsResponse;
import com.vk.sdk.api.messages.dto.MessagesGetHistoryAttachmentsMediaType;
import com.vk.sdk.api.messages.dto.MessagesGetHistoryAttachmentsResponse;
import com.vk.sdk.api.messages.dto.MessagesGetHistoryExtendedResponse;
import com.vk.sdk.api.messages.dto.MessagesGetHistoryExtendedRev;
import com.vk.sdk.api.messages.dto.MessagesGetHistoryResponse;
import com.vk.sdk.api.messages.dto.MessagesGetHistoryRev;
import com.vk.sdk.api.messages.dto.MessagesGetImportantMessagesExtendedResponse;
import com.vk.sdk.api.messages.dto.MessagesGetImportantMessagesResponse;
import com.vk.sdk.api.messages.dto.MessagesGetIntentUsersIntent;
import com.vk.sdk.api.messages.dto.MessagesGetIntentUsersResponse;
import com.vk.sdk.api.messages.dto.MessagesGetInviteLinkResponse;
import com.vk.sdk.api.messages.dto.MessagesGetLongPollHistoryResponse;
import com.vk.sdk.api.messages.dto.MessagesIsMessagesFromGroupAllowedResponse;
import com.vk.sdk.api.messages.dto.MessagesJoinChatByInviteLinkResponse;
import com.vk.sdk.api.messages.dto.MessagesLastActivity;
import com.vk.sdk.api.messages.dto.MessagesLongpollParams;
import com.vk.sdk.api.messages.dto.MessagesPinnedMessage;
import com.vk.sdk.api.messages.dto.MessagesSearchConversationsExtendedResponse;
import com.vk.sdk.api.messages.dto.MessagesSearchConversationsResponse;
import com.vk.sdk.api.messages.dto.MessagesSearchExtendedResponse;
import com.vk.sdk.api.messages.dto.MessagesSearchResponse;
import com.vk.sdk.api.messages.dto.MessagesSendIntent;
import com.vk.sdk.api.messages.dto.MessagesSetActivityType;
import com.vk.sdk.api.messages.dto.MessagesSetChatPhotoResponse;
import com.vk.sdk.api.users.dto.UsersFields;
import io.sentry.TraceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
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
public final class MessagesService {
    public static /* synthetic */ VKRequest messagesAddChatUser$default(MessagesService messagesService, int i, UserId userId, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        return messagesService.messagesAddChatUser(i, userId, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesAddChatUser$lambda-0, reason: not valid java name */
    public static final BaseOkResponse m311messagesAddChatUser$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest messagesAllowMessagesFromGroup$default(MessagesService messagesService, UserId userId, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return messagesService.messagesAllowMessagesFromGroup(userId, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesAllowMessagesFromGroup$lambda-4, reason: not valid java name */
    public static final BaseOkResponse m312messagesAllowMessagesFromGroup$lambda4(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesCreateChat$default(MessagesService messagesService, List list, String str, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            userId = null;
        }
        return messagesService.messagesCreateChat(list, str, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesCreateChat$lambda-7, reason: not valid java name */
    public static final Integer m313messagesCreateChat$lambda7(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesDelete$default(MessagesService messagesService, List list, Boolean bool, UserId userId, Boolean bool2, Integer num, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            userId = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            list2 = null;
        }
        return messagesService.messagesDelete(list, bool, userId, bool2, num, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesDelete$lambda-12, reason: not valid java name */
    public static final Object m314messagesDelete$lambda12(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return GsonHolder.INSTANCE.getGson().b(it, Object.class);
    }

    public static /* synthetic */ VKRequest messagesDeleteChatPhoto$default(MessagesService messagesService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return messagesService.messagesDeleteChatPhoto(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesDeleteChatPhoto$lambda-20, reason: not valid java name */
    public static final MessagesDeleteChatPhotoResponse m315messagesDeleteChatPhoto$lambda20(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesDeleteChatPhotoResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesDeleteChatPhotoResponse.class);
    }

    public static /* synthetic */ VKRequest messagesDeleteConversation$default(MessagesService messagesService, Integer num, Integer num2, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            userId = null;
        }
        return messagesService.messagesDeleteConversation(num, num2, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesDeleteConversation$lambda-23, reason: not valid java name */
    public static final MessagesDeleteConversationResponse m316messagesDeleteConversation$lambda23(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesDeleteConversationResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesDeleteConversationResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesDenyMessagesFromGroup$lambda-28, reason: not valid java name */
    public static final BaseOkResponse m317messagesDenyMessagesFromGroup$lambda28(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesEdit$lambda-30, reason: not valid java name */
    public static final BaseBoolInt m318messagesEdit$lambda30(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest messagesEditChat$default(MessagesService messagesService, int i, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return messagesService.messagesEditChat(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesEditChat$lambda-45, reason: not valid java name */
    public static final BaseOkResponse m319messagesEditChat$lambda45(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetByConversationMessageId$default(MessagesService messagesService, int i, List list, List list2, UserId userId, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list2 = null;
        }
        if ((i10 & 8) != 0) {
            userId = null;
        }
        return messagesService.messagesGetByConversationMessageId(i, list, list2, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetByConversationMessageId$lambda-48, reason: not valid java name */
    public static final MessagesGetByConversationMessageIdResponse m320messagesGetByConversationMessageId$lambda48(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetByConversationMessageIdResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetByConversationMessageIdResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetByConversationMessageIdExtended$default(MessagesService messagesService, int i, List list, List list2, UserId userId, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list2 = null;
        }
        if ((i10 & 8) != 0) {
            userId = null;
        }
        return messagesService.messagesGetByConversationMessageIdExtended(i, list, list2, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetByConversationMessageIdExtended$lambda-53, reason: not valid java name */
    public static final MessagesGetByConversationMessageIdExtendedResponse m321messagesGetByConversationMessageIdExtended$lambda53(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetByConversationMessageIdExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetByConversationMessageIdExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetById$default(MessagesService messagesService, List list, Integer num, List list2, UserId userId, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        if ((i & 8) != 0) {
            userId = null;
        }
        return messagesService.messagesGetById(list, num, list2, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetById$lambda-58, reason: not valid java name */
    public static final MessagesGetByIdResponse m322messagesGetById$lambda58(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetByIdResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetByIdResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetByIdExtended$default(MessagesService messagesService, List list, Integer num, List list2, UserId userId, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        if ((i & 8) != 0) {
            userId = null;
        }
        return messagesService.messagesGetByIdExtended(list, num, list2, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetByIdExtended$lambda-64, reason: not valid java name */
    public static final MessagesGetByIdExtendedResponse m323messagesGetByIdExtended$lambda64(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetByIdExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetByIdExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetChatPreview$default(MessagesService messagesService, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return messagesService.messagesGetChatPreview(num, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetChatPreview$lambda-70, reason: not valid java name */
    public static final MessagesGetChatPreviewResponse m324messagesGetChatPreview$lambda70(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetChatPreviewResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetChatPreviewResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetConversationMembers$default(MessagesService messagesService, int i, List list, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        if ((i10 & 4) != 0) {
            userId = null;
        }
        return messagesService.messagesGetConversationMembers(i, list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetConversationMembers$lambda-76, reason: not valid java name */
    public static final MessagesGetConversationMembers m325messagesGetConversationMembers$lambda76(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetConversationMembers) GsonHolder.INSTANCE.getGson().b(it, MessagesGetConversationMembers.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetConversations$default(MessagesService messagesService, Integer num, Integer num2, MessagesGetConversationsFilter messagesGetConversationsFilter, Integer num3, List list, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            messagesGetConversationsFilter = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            userId = null;
        }
        return messagesService.messagesGetConversations(num, num2, messagesGetConversationsFilter, num3, list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetConversations$lambda-81, reason: not valid java name */
    public static final MessagesGetConversationsResponse m326messagesGetConversations$lambda81(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetConversationsResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetConversationsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetConversationsById$default(MessagesService messagesService, List list, List list2, UserId userId, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = null;
        }
        if ((i & 4) != 0) {
            userId = null;
        }
        return messagesService.messagesGetConversationsById(list, list2, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetConversationsById$lambda-90, reason: not valid java name */
    public static final MessagesGetConversationById m327messagesGetConversationsById$lambda90(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetConversationById) GsonHolder.INSTANCE.getGson().b(it, MessagesGetConversationById.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetConversationsByIdExtended$default(MessagesService messagesService, List list, List list2, UserId userId, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = null;
        }
        if ((i & 4) != 0) {
            userId = null;
        }
        return messagesService.messagesGetConversationsByIdExtended(list, list2, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetConversationsByIdExtended$lambda-95, reason: not valid java name */
    public static final MessagesGetConversationByIdExtended m328messagesGetConversationsByIdExtended$lambda95(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetConversationByIdExtended) GsonHolder.INSTANCE.getGson().b(it, MessagesGetConversationByIdExtended.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetHistory$default(MessagesService messagesService, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, MessagesGetHistoryRev messagesGetHistoryRev, List list, UserId userId, int i, Object obj) {
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
            num4 = null;
        }
        if ((i & 16) != 0) {
            num5 = null;
        }
        if ((i & 32) != 0) {
            messagesGetHistoryRev = null;
        }
        if ((i & 64) != 0) {
            list = null;
        }
        if ((i & 128) != 0) {
            userId = null;
        }
        return messagesService.messagesGetHistory(num, num2, num3, num4, num5, messagesGetHistoryRev, list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetHistory$lambda-100, reason: not valid java name */
    public static final MessagesGetHistoryResponse m329messagesGetHistory$lambda100(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetHistoryResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetHistoryResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetHistoryAttachments$default(MessagesService messagesService, int i, MessagesGetHistoryAttachmentsMediaType messagesGetHistoryAttachmentsMediaType, String str, Integer num, Boolean bool, List list, UserId userId, Boolean bool2, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            messagesGetHistoryAttachmentsMediaType = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            list = null;
        }
        if ((i10 & 64) != 0) {
            userId = null;
        }
        if ((i10 & 128) != 0) {
            bool2 = null;
        }
        if ((i10 & 256) != 0) {
            num2 = null;
        }
        return messagesService.messagesGetHistoryAttachments(i, messagesGetHistoryAttachmentsMediaType, str, num, bool, list, userId, bool2, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetHistoryAttachments$lambda-122, reason: not valid java name */
    public static final MessagesGetHistoryAttachmentsResponse m330messagesGetHistoryAttachments$lambda122(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetHistoryAttachmentsResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetHistoryAttachmentsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetHistoryExtended$default(MessagesService messagesService, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, MessagesGetHistoryExtendedRev messagesGetHistoryExtendedRev, List list, UserId userId, int i, Object obj) {
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
            num4 = null;
        }
        if ((i & 16) != 0) {
            num5 = null;
        }
        if ((i & 32) != 0) {
            messagesGetHistoryExtendedRev = null;
        }
        if ((i & 64) != 0) {
            list = null;
        }
        if ((i & 128) != 0) {
            userId = null;
        }
        return messagesService.messagesGetHistoryExtended(num, num2, num3, num4, num5, messagesGetHistoryExtendedRev, list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetHistoryExtended$lambda-111, reason: not valid java name */
    public static final MessagesGetHistoryExtendedResponse m331messagesGetHistoryExtended$lambda111(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetHistoryExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetHistoryExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetImportantMessages$default(MessagesService messagesService, Integer num, Integer num2, Integer num3, Integer num4, List list, UserId userId, int i, Object obj) {
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
            num4 = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            userId = null;
        }
        return messagesService.messagesGetImportantMessages(num, num2, num3, num4, list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetImportantMessages$lambda-133, reason: not valid java name */
    public static final MessagesGetImportantMessagesResponse m332messagesGetImportantMessages$lambda133(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetImportantMessagesResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetImportantMessagesResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetImportantMessagesExtended$default(MessagesService messagesService, Integer num, Integer num2, Integer num3, Integer num4, List list, UserId userId, int i, Object obj) {
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
            num4 = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            userId = null;
        }
        return messagesService.messagesGetImportantMessagesExtended(num, num2, num3, num4, list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetImportantMessagesExtended$lambda-142, reason: not valid java name */
    public static final MessagesGetImportantMessagesExtendedResponse m333messagesGetImportantMessagesExtended$lambda142(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetImportantMessagesExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetImportantMessagesExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetIntentUsers$default(MessagesService messagesService, MessagesGetIntentUsersIntent messagesGetIntentUsersIntent, Integer num, Integer num2, Integer num3, List list, List list2, int i, Object obj) {
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
            list = null;
        }
        if ((i & 32) != 0) {
            list2 = null;
        }
        return messagesService.messagesGetIntentUsers(messagesGetIntentUsersIntent, num, num2, num3, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetIntentUsers$lambda-151, reason: not valid java name */
    public static final MessagesGetIntentUsersResponse m334messagesGetIntentUsers$lambda151(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetIntentUsersResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetIntentUsersResponse.class);
    }

    public static /* synthetic */ VKRequest messagesGetInviteLink$default(MessagesService messagesService, int i, Boolean bool, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        if ((i10 & 4) != 0) {
            userId = null;
        }
        return messagesService.messagesGetInviteLink(i, bool, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetInviteLink$lambda-158, reason: not valid java name */
    public static final MessagesGetInviteLinkResponse m335messagesGetInviteLink$lambda158(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetInviteLinkResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetInviteLinkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetLastActivity$lambda-162, reason: not valid java name */
    public static final MessagesLastActivity m336messagesGetLastActivity$lambda162(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesLastActivity) GsonHolder.INSTANCE.getGson().b(it, MessagesLastActivity.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesGetLongPollHistory$default(MessagesService messagesService, Integer num, Integer num2, Integer num3, Boolean bool, List list, Integer num4, Integer num5, Integer num6, UserId userId, Integer num7, Integer num8, Boolean bool2, int i, Object obj) {
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
            bool = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            num4 = null;
        }
        if ((i & 64) != 0) {
            num5 = null;
        }
        if ((i & 128) != 0) {
            num6 = null;
        }
        if ((i & 256) != 0) {
            userId = null;
        }
        if ((i & 512) != 0) {
            num7 = null;
        }
        if ((i & 1024) != 0) {
            num8 = null;
        }
        if ((i & 2048) != 0) {
            bool2 = null;
        }
        return messagesService.messagesGetLongPollHistory(num, num2, num3, bool, list, num4, num5, num6, userId, num7, num8, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetLongPollHistory$lambda-164, reason: not valid java name */
    public static final MessagesGetLongPollHistoryResponse m337messagesGetLongPollHistory$lambda164(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesGetLongPollHistoryResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesGetLongPollHistoryResponse.class);
    }

    public static /* synthetic */ VKRequest messagesGetLongPollServer$default(MessagesService messagesService, Boolean bool, UserId userId, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return messagesService.messagesGetLongPollServer(bool, userId, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesGetLongPollServer$lambda-179, reason: not valid java name */
    public static final MessagesLongpollParams m338messagesGetLongPollServer$lambda179(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesLongpollParams) GsonHolder.INSTANCE.getGson().b(it, MessagesLongpollParams.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesIsMessagesFromGroupAllowed$lambda-184, reason: not valid java name */
    public static final MessagesIsMessagesFromGroupAllowedResponse m339messagesIsMessagesFromGroupAllowed$lambda184(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesIsMessagesFromGroupAllowedResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesIsMessagesFromGroupAllowedResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesJoinChatByInviteLink$lambda-186, reason: not valid java name */
    public static final MessagesJoinChatByInviteLinkResponse m340messagesJoinChatByInviteLink$lambda186(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesJoinChatByInviteLinkResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesJoinChatByInviteLinkResponse.class);
    }

    public static /* synthetic */ VKRequest messagesMarkAsAnsweredConversation$default(MessagesService messagesService, int i, Boolean bool, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        if ((i10 & 4) != 0) {
            userId = null;
        }
        return messagesService.messagesMarkAsAnsweredConversation(i, bool, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesMarkAsAnsweredConversation$lambda-188, reason: not valid java name */
    public static final BaseOkResponse m341messagesMarkAsAnsweredConversation$lambda188(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesMarkAsImportant$default(MessagesService messagesService, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return messagesService.messagesMarkAsImportant(list, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesMarkAsImportant$lambda-192, reason: not valid java name */
    public static final List m342messagesMarkAsImportant$lambda192(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends Integer>>() { // from class: com.vk.sdk.api.messages.MessagesService$messagesMarkAsImportant$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest messagesMarkAsImportantConversation$default(MessagesService messagesService, int i, Boolean bool, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        if ((i10 & 4) != 0) {
            userId = null;
        }
        return messagesService.messagesMarkAsImportantConversation(i, bool, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesMarkAsImportantConversation$lambda-196, reason: not valid java name */
    public static final BaseOkResponse m343messagesMarkAsImportantConversation$lambda196(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesMarkAsRead$default(MessagesService messagesService, List list, Integer num, Integer num2, UserId userId, Boolean bool, int i, Object obj) {
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
            userId = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        return messagesService.messagesMarkAsRead(list, num, num2, userId, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesMarkAsRead$lambda-200, reason: not valid java name */
    public static final BaseOkResponse m344messagesMarkAsRead$lambda200(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest messagesPin$default(MessagesService messagesService, int i, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        return messagesService.messagesPin(i, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesPin$lambda-207, reason: not valid java name */
    public static final MessagesPinnedMessage m345messagesPin$lambda207(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesPinnedMessage) GsonHolder.INSTANCE.getGson().b(it, MessagesPinnedMessage.class);
    }

    public static /* synthetic */ VKRequest messagesRemoveChatUser$default(MessagesService messagesService, int i, UserId userId, UserId userId2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        return messagesService.messagesRemoveChatUser(i, userId, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesRemoveChatUser$lambda-211, reason: not valid java name */
    public static final BaseOkResponse m346messagesRemoveChatUser$lambda211(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest messagesRestore$default(MessagesService messagesService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return messagesService.messagesRestore(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesRestore$lambda-215, reason: not valid java name */
    public static final BaseOkResponse m347messagesRestore$lambda215(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesSearch$default(MessagesService messagesService, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, List list, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
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
        if ((i & 32) != 0) {
            num5 = null;
        }
        if ((i & 64) != 0) {
            list = null;
        }
        if ((i & 128) != 0) {
            userId = null;
        }
        return messagesService.messagesSearch(str, num, num2, num3, num4, num5, list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesSearch$lambda-218, reason: not valid java name */
    public static final MessagesSearchResponse m348messagesSearch$lambda218(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesSearchResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesSearchResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesSearchConversations$default(MessagesService messagesService, String str, Integer num, List list, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            userId = null;
        }
        return messagesService.messagesSearchConversations(str, num, list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesSearchConversations$lambda-238, reason: not valid java name */
    public static final MessagesSearchConversationsResponse m349messagesSearchConversations$lambda238(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesSearchConversationsResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesSearchConversationsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesSearchConversationsExtended$default(MessagesService messagesService, String str, Integer num, List list, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            userId = null;
        }
        return messagesService.messagesSearchConversationsExtended(str, num, list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesSearchConversationsExtended$lambda-245, reason: not valid java name */
    public static final MessagesSearchConversationsExtendedResponse m350messagesSearchConversationsExtended$lambda245(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesSearchConversationsExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesSearchConversationsExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest messagesSearchExtended$default(MessagesService messagesService, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, List list, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
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
        if ((i & 32) != 0) {
            num5 = null;
        }
        if ((i & 64) != 0) {
            list = null;
        }
        if ((i & 128) != 0) {
            userId = null;
        }
        return messagesService.messagesSearchExtended(str, num, num2, num3, num4, num5, list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesSearchExtended$lambda-228, reason: not valid java name */
    public static final MessagesSearchExtendedResponse m351messagesSearchExtended$lambda228(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesSearchExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesSearchExtendedResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesSend$lambda-252, reason: not valid java name */
    public static final Integer m352messagesSend$lambda252(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    public static /* synthetic */ VKRequest messagesSendMessageEventAnswer$default(MessagesService messagesService, String str, UserId userId, int i, String str2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return messagesService.messagesSendMessageEventAnswer(str, userId, i, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesSendMessageEventAnswer$lambda-278, reason: not valid java name */
    public static final BaseOkResponse m353messagesSendMessageEventAnswer$lambda278(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest messagesSetActivity$default(MessagesService messagesService, Integer num, MessagesSetActivityType messagesSetActivityType, Integer num2, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            messagesSetActivityType = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            userId = null;
        }
        return messagesService.messagesSetActivity(num, messagesSetActivityType, num2, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesSetActivity$lambda-281, reason: not valid java name */
    public static final BaseOkResponse m354messagesSetActivity$lambda281(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesSetChatPhoto$lambda-287, reason: not valid java name */
    public static final MessagesSetChatPhotoResponse m355messagesSetChatPhoto$lambda287(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MessagesSetChatPhotoResponse) GsonHolder.INSTANCE.getGson().b(it, MessagesSetChatPhotoResponse.class);
    }

    public static /* synthetic */ VKRequest messagesUnpin$default(MessagesService messagesService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return messagesService.messagesUnpin(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messagesUnpin$lambda-289, reason: not valid java name */
    public static final BaseOkResponse m356messagesUnpin$lambda289(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<BaseOkResponse> messagesAddChatUser(int i, @Nullable UserId userId, @Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.addChatUser", new h1(9));
        newApiRequest.addParam("chat_id", i, 0, 100000000);
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("visible_messages_count", num.intValue(), 0, 1000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> messagesAllowMessagesFromGroup(@NotNull UserId groupId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("messages.allowMessagesFromGroup", new h1(23));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (str == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "key", str, 0, 256, 4, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> messagesCreateChat(@Nullable List<UserId> list, @Nullable String str, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.createChat", new h1(5));
        if (list != null) {
            NewApiRequest.addParam$default(newApiRequest, "user_ids", list, 0L, 0L, 12, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("title", str);
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Object> messagesDelete(@Nullable List<Integer> list, @Nullable Boolean bool, @Nullable UserId userId, @Nullable Boolean bool2, @Nullable Integer num, @Nullable List<Integer> list2) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.delete", new h1(15));
        if (list != null) {
            newApiRequest.addParam("message_ids", list);
        }
        if (bool != null) {
            newApiRequest.addParam("spam", bool.booleanValue());
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (bool2 != null) {
            newApiRequest.addParam("delete_for_all", bool2.booleanValue());
        }
        if (num != null) {
            newApiRequest.addParam("peer_id", num.intValue());
        }
        if (list2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("cmids", list2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesDeleteChatPhotoResponse> messagesDeleteChatPhoto(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.deleteChatPhoto", new h1(13));
        newApiRequest.addParam("chat_id", i, 0, 100000000);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesDeleteConversationResponse> messagesDeleteConversation(@Nullable Integer num, @Nullable Integer num2, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.deleteConversation", new h1(17));
        if (num != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, num.intValue());
        }
        if (num2 != null) {
            newApiRequest.addParam("peer_id", num2.intValue());
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> messagesDenyMessagesFromGroup(@NotNull UserId groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("messages.denyMessagesFromGroup", new ag.a(10));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> messagesEdit(int i, @Nullable String str, @Nullable Float f10, @Nullable Float f11, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable UserId userId, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable String str4) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.edit", new h1(3));
        newApiRequest.addParam("peer_id", i);
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "message", str, 0, 9000, 4, (Object) null);
        }
        if (f10 != null) {
            newApiRequest.addParam("lat", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("long", f11.floatValue());
        }
        if (str2 != null) {
            newApiRequest.addParam("attachment", str2);
        }
        if (bool != null) {
            newApiRequest.addParam("keep_forward_messages", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("keep_snippets", bool2.booleanValue());
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (bool3 != null) {
            newApiRequest.addParam("dont_parse_links", bool3.booleanValue());
        }
        if (bool4 != null) {
            newApiRequest.addParam("disable_mentions", bool4.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "message_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "conversation_message_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (str3 != null) {
            newApiRequest.addParam("template", str3);
        }
        if (str4 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("keyboard", str4);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> messagesEditChat(int i, @Nullable String str) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.editChat", new h1(1));
        newApiRequest.addParam("chat_id", i, 0, 100000000);
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("title", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetByConversationMessageIdResponse> messagesGetByConversationMessageId(int i, @NotNull List<Integer> conversationMessageIds, @Nullable List<? extends UsersFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(conversationMessageIds, "conversationMessageIds");
        NewApiRequest newApiRequest = new NewApiRequest("messages.getByConversationMessageId", new ag.a(12));
        newApiRequest.addParam("peer_id", i);
        newApiRequest.addParam("conversation_message_ids", conversationMessageIds);
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetByConversationMessageIdExtendedResponse> messagesGetByConversationMessageIdExtended(int i, @NotNull List<Integer> conversationMessageIds, @Nullable List<? extends UsersFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(conversationMessageIds, "conversationMessageIds");
        NewApiRequest newApiRequest = new NewApiRequest("messages.getByConversationMessageId", new ag.a(6));
        newApiRequest.addParam("peer_id", i);
        newApiRequest.addParam("conversation_message_ids", conversationMessageIds);
        newApiRequest.addParam("extended", true);
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetByIdResponse> messagesGetById(@NotNull List<Integer> messageIds, @Nullable Integer num, @Nullable List<? extends UsersFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(messageIds, "messageIds");
        NewApiRequest newApiRequest = new NewApiRequest("messages.getById", new ag.a(9));
        newApiRequest.addParam("message_ids", messageIds);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "preview_length", num.intValue(), 0, 0, 8, (Object) null);
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetByIdExtendedResponse> messagesGetByIdExtended(@NotNull List<Integer> messageIds, @Nullable Integer num, @Nullable List<? extends UsersFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(messageIds, "messageIds");
        NewApiRequest newApiRequest = new NewApiRequest("messages.getById", new ag.a(7));
        newApiRequest.addParam("message_ids", messageIds);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "preview_length", num.intValue(), 0, 0, 8, (Object) null);
        }
        newApiRequest.addParam("extended", true);
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetChatPreviewResponse> messagesGetChatPreview(@Nullable Integer num, @Nullable String str, @Nullable List<? extends UsersFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("messages.getChatPreview", new ag.a(8));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "peer_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("link", str);
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
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetConversationMembers> messagesGetConversationMembers(int i, @Nullable List<? extends UsersFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("messages.getConversationMembers", new ag.a(1));
        newApiRequest.addParam("peer_id", i);
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetConversationsResponse> messagesGetConversations(@Nullable Integer num, @Nullable Integer num2, @Nullable MessagesGetConversationsFilter messagesGetConversationsFilter, @Nullable Integer num3, @Nullable List<? extends BaseUserGroupFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("messages.getConversations", new h1(27));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (messagesGetConversationsFilter != null) {
            newApiRequest.addParam("filter", messagesGetConversationsFilter.getValue());
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_message_id", num3.intValue(), 0, 0, 8, (Object) null);
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetConversationById> messagesGetConversationsById(@NotNull List<Integer> peerIds, @Nullable List<? extends BaseUserGroupFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(peerIds, "peerIds");
        NewApiRequest newApiRequest = new NewApiRequest("messages.getConversationsById", new ag.a(13));
        newApiRequest.addParam("peer_ids", peerIds);
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetConversationByIdExtended> messagesGetConversationsByIdExtended(@NotNull List<Integer> peerIds, @Nullable List<? extends BaseUserGroupFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(peerIds, "peerIds");
        NewApiRequest newApiRequest = new NewApiRequest("messages.getConversationsById", new ag.a(5));
        newApiRequest.addParam("peer_ids", peerIds);
        newApiRequest.addParam("extended", true);
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetHistoryResponse> messagesGetHistory(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable MessagesGetHistoryRev messagesGetHistoryRev, @Nullable List<? extends UsersFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("messages.getHistory", new ag.a(15));
        if (num != null) {
            newApiRequest.addParam("offset", num.intValue());
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (num3 != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, num3.intValue());
        }
        if (num4 != null) {
            newApiRequest.addParam("peer_id", num4.intValue());
        }
        if (num5 != null) {
            newApiRequest.addParam("start_message_id", num5.intValue());
        }
        if (messagesGetHistoryRev != null) {
            newApiRequest.addParam("rev", messagesGetHistoryRev.getValue());
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetHistoryAttachmentsResponse> messagesGetHistoryAttachments(int i, @Nullable MessagesGetHistoryAttachmentsMediaType messagesGetHistoryAttachmentsMediaType, @Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable List<? extends UsersFields> list, @Nullable UserId userId, @Nullable Boolean bool2, @Nullable Integer num2) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("messages.getHistoryAttachments", new h1(26));
        newApiRequest.addParam("peer_id", i);
        if (messagesGetHistoryAttachmentsMediaType != null) {
            newApiRequest.addParam("media_type", messagesGetHistoryAttachmentsMediaType.getValue());
        }
        if (str != null) {
            newApiRequest.addParam("start_from", str);
        }
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (bool != null) {
            newApiRequest.addParam("photo_sizes", bool.booleanValue());
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
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (bool2 != null) {
            newApiRequest.addParam("preserve_order", bool2.booleanValue());
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("max_forwards_level", num2.intValue(), 0, 45);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetHistoryExtendedResponse> messagesGetHistoryExtended(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable MessagesGetHistoryExtendedRev messagesGetHistoryExtendedRev, @Nullable List<? extends UsersFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("messages.getHistory", new h1(19));
        if (num != null) {
            newApiRequest.addParam("offset", num.intValue());
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (num3 != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, num3.intValue());
        }
        if (num4 != null) {
            newApiRequest.addParam("peer_id", num4.intValue());
        }
        if (num5 != null) {
            newApiRequest.addParam("start_message_id", num5.intValue());
        }
        if (messagesGetHistoryExtendedRev != null) {
            newApiRequest.addParam("rev", messagesGetHistoryExtendedRev.getValue());
        }
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetImportantMessagesResponse> messagesGetImportantMessages(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable List<? extends BaseUserGroupFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("messages.getImportantMessages", new h1(2));
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_message_id", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "preview_length", num4.intValue(), 0, 0, 8, (Object) null);
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetImportantMessagesExtendedResponse> messagesGetImportantMessagesExtended(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable List<? extends BaseUserGroupFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("messages.getImportantMessages", new h1(6));
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_message_id", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "preview_length", num4.intValue(), 0, 0, 8, (Object) null);
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
        newApiRequest.addParam("extended", true);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetIntentUsersResponse> messagesGetIntentUsers(@NotNull MessagesGetIntentUsersIntent intent, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<String> list, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        NewApiRequest newApiRequest = new NewApiRequest("messages.getIntentUsers", new ag.a(2));
        newApiRequest.addParam("intent", intent.getValue());
        if (num != null) {
            newApiRequest.addParam("subscribe_id", num.intValue(), 0, 100);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            newApiRequest.addParam("count", num3.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (list != null) {
            newApiRequest.addParam("name_case", list);
        }
        if (list2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", list2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetInviteLinkResponse> messagesGetInviteLink(int i, @Nullable Boolean bool, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.getInviteLink", new h1(20));
        NewApiRequest.addParam$default(newApiRequest, "peer_id", i, 0, 0, 8, (Object) null);
        if (bool != null) {
            newApiRequest.addParam("reset", bool.booleanValue());
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesLastActivity> messagesGetLastActivity(@NotNull UserId userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("messages.getLastActivity", new h1(18));
        newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesGetLongPollHistoryResponse> messagesGetLongPollHistory(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool, @Nullable List<? extends UsersFields> list, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable UserId userId, @Nullable Integer num7, @Nullable Integer num8, @Nullable Boolean bool2) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("messages.getLongPollHistory", new h1(29));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "ts", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "pts", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "preview_length", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("onlines", bool.booleanValue());
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
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "events_limit", num4.intValue(), 1000, 0, 8, (Object) null);
        }
        if (num5 != null) {
            NewApiRequest.addParam$default(newApiRequest, "msgs_limit", num5.intValue(), VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, 0, 8, (Object) null);
        }
        if (num6 != null) {
            NewApiRequest.addParam$default(newApiRequest, "max_msg_id", num6.intValue(), 0, 0, 8, (Object) null);
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (num7 != null) {
            NewApiRequest.addParam$default(newApiRequest, "lp_version", num7.intValue(), 0, 0, 8, (Object) null);
        }
        if (num8 != null) {
            newApiRequest.addParam("last_n", num8.intValue(), 0, 2000);
        }
        if (bool2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("credentials", bool2.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesLongpollParams> messagesGetLongPollServer(@Nullable Boolean bool, @Nullable UserId userId, @Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.getLongPollServer", new h1(28));
        if (bool != null) {
            newApiRequest.addParam("need_pts", bool.booleanValue());
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (num == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "lp_version", num.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesIsMessagesFromGroupAllowedResponse> messagesIsMessagesFromGroupAllowed(@NotNull UserId groupId, @NotNull UserId userId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("messages.isMessagesFromGroupAllowed", new h1(14));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesJoinChatByInviteLinkResponse> messagesJoinChatByInviteLink(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        NewApiRequest newApiRequest = new NewApiRequest("messages.joinChatByInviteLink", new h1(24));
        newApiRequest.addParam("link", link);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> messagesMarkAsAnsweredConversation(int i, @Nullable Boolean bool, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.markAsAnsweredConversation", new h1(4));
        newApiRequest.addParam("peer_id", i);
        if (bool != null) {
            newApiRequest.addParam("answered", bool.booleanValue());
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<Integer>> messagesMarkAsImportant(@Nullable List<Integer> list, @Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.markAsImportant", new ag.a(14));
        if (list != null) {
            newApiRequest.addParam("message_ids", list);
        }
        if (num == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "important", num.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> messagesMarkAsImportantConversation(int i, @Nullable Boolean bool, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.markAsImportantConversation", new h1(10));
        newApiRequest.addParam("peer_id", i);
        if (bool != null) {
            newApiRequest.addParam("important", bool.booleanValue());
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> messagesMarkAsRead(@Nullable List<Integer> list, @Nullable Integer num, @Nullable Integer num2, @Nullable UserId userId, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.markAsRead", new ag.a(11));
        if (list != null) {
            newApiRequest.addParam("message_ids", list);
        }
        if (num != null) {
            newApiRequest.addParam("peer_id", num.intValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_message_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("mark_conversation_as_read", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesPinnedMessage> messagesPin(int i, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.pin", new h1(11));
        newApiRequest.addParam("peer_id", i);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "message_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "conversation_message_id", num2.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> messagesRemoveChatUser(int i, @Nullable UserId userId, @Nullable UserId userId2) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.removeChatUser", new h1(8));
        newApiRequest.addParam("chat_id", i, 0, 100000000);
        if (userId != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId);
        }
        if (userId2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("member_id", userId2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> messagesRestore(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.restore", new h1(12));
        NewApiRequest.addParam$default(newApiRequest, "message_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesSearchResponse> messagesSearch(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable List<String> list, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.search", new h1(22));
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "q", str, 0, 9000, 4, (Object) null);
        }
        if (num != null) {
            newApiRequest.addParam("peer_id", num.intValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "date", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "preview_length", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (num5 != null) {
            newApiRequest.addParam("count", num5.intValue(), 0, 100);
        }
        if (list != null) {
            newApiRequest.addParam("fields", list);
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesSearchConversationsResponse> messagesSearchConversations(@Nullable String str, @Nullable Integer num, @Nullable List<? extends UsersFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("messages.searchConversations", new ag.a(4));
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 1, KotlinVersion.MAX_COMPONENT_VALUE);
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesSearchConversationsExtendedResponse> messagesSearchConversationsExtended(@Nullable String str, @Nullable Integer num, @Nullable List<? extends UsersFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("messages.searchConversations", new ag.a(0));
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 1, KotlinVersion.MAX_COMPONENT_VALUE);
        }
        newApiRequest.addParam("extended", true);
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
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesSearchExtendedResponse> messagesSearchExtended(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable List<String> list, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.search", new ag.a(3));
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "q", str, 0, 9000, 4, (Object) null);
        }
        if (num != null) {
            newApiRequest.addParam("peer_id", num.intValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "date", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "preview_length", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (num5 != null) {
            newApiRequest.addParam("count", num5.intValue(), 0, 100);
        }
        newApiRequest.addParam("extended", true);
        if (list != null) {
            newApiRequest.addParam("fields", list);
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> messagesSend(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable List<Integer> list, @Nullable String str, @Nullable Integer num3, @Nullable List<UserId> list2, @Nullable String str2, @Nullable Float f10, @Nullable Float f11, @Nullable String str3, @Nullable Integer num4, @Nullable List<Integer> list3, @Nullable String str4, @Nullable Integer num5, @Nullable UserId userId2, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable MessagesSendIntent messagesSendIntent, @Nullable Integer num6) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.send", new h1(25));
        if (userId != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId);
        }
        if (num != null) {
            newApiRequest.addParam("random_id", num.intValue());
        }
        if (num2 != null) {
            newApiRequest.addParam("peer_id", num2.intValue());
        }
        if (list != null) {
            newApiRequest.addParam("peer_ids", list);
        }
        if (str != null) {
            newApiRequest.addParam("domain", str);
        }
        if (num3 != null) {
            newApiRequest.addParam("chat_id", num3.intValue(), 0, 100000000);
            Unit unit = Unit.f27471a;
        }
        if (list2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "user_ids", list2, 0L, 0L, 12, (Object) null);
            Unit unit2 = Unit.f27471a;
        }
        if (str2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "message", str2, 0, 9000, 4, (Object) null);
            Unit unit3 = Unit.f27471a;
        }
        if (f10 != null) {
            newApiRequest.addParam("lat", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("long", f11.floatValue());
        }
        if (str3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "attachment", str3, 0, 9000, 4, (Object) null);
            Unit unit4 = Unit.f27471a;
        }
        if (num4 != null) {
            newApiRequest.addParam("reply_to", num4.intValue());
        }
        if (list3 != null) {
            newApiRequest.addParam("forward_messages", list3);
        }
        if (str4 != null) {
            newApiRequest.addParam("forward", str4);
        }
        if (num5 != null) {
            NewApiRequest.addParam$default(newApiRequest, "sticker_id", num5.intValue(), 0, 0, 8, (Object) null);
            Unit unit5 = Unit.f27471a;
        }
        if (userId2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId2, 0L, 0L, 8, (Object) null);
            Unit unit6 = Unit.f27471a;
        }
        if (str5 != null) {
            newApiRequest.addParam("keyboard", str5);
        }
        if (str6 != null) {
            newApiRequest.addParam("template", str6);
        }
        if (str7 != null) {
            NewApiRequest.addParam$default(newApiRequest, "payload", str7, 0, 1000, 4, (Object) null);
            Unit unit7 = Unit.f27471a;
        }
        if (str8 != null) {
            newApiRequest.addParam("content_source", str8);
        }
        if (bool != null) {
            newApiRequest.addParam("dont_parse_links", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("disable_mentions", bool2.booleanValue());
        }
        if (messagesSendIntent != null) {
            newApiRequest.addParam("intent", messagesSendIntent.getValue());
        }
        if (num6 != null) {
            newApiRequest.addParam("subscribe_id", num6.intValue(), 0, 100);
            Unit unit8 = Unit.f27471a;
        }
        Unit unit9 = Unit.f27471a;
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> messagesSendMessageEventAnswer(@NotNull String eventId, @NotNull UserId userId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("messages.sendMessageEventAnswer", new ag.a(16));
        newApiRequest.addParam("event_id", eventId);
        newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId);
        newApiRequest.addParam("peer_id", i);
        if (str == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "event_data", str, 0, 1000, 4, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> messagesSetActivity(@Nullable Integer num, @Nullable MessagesSetActivityType messagesSetActivityType, @Nullable Integer num2, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.setActivity", new h1(21));
        if (num != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, num.intValue());
        }
        if (messagesSetActivityType != null) {
            newApiRequest.addParam("type", messagesSetActivityType.getValue());
        }
        if (num2 != null) {
            newApiRequest.addParam("peer_id", num2.intValue());
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MessagesSetChatPhotoResponse> messagesSetChatPhoto(@NotNull String file) {
        Intrinsics.checkNotNullParameter(file, "file");
        NewApiRequest newApiRequest = new NewApiRequest("messages.setChatPhoto", new h1(16));
        newApiRequest.addParam("file", file);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> messagesUnpin(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("messages.unpin", new h1(7));
        newApiRequest.addParam("peer_id", i);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }
}
