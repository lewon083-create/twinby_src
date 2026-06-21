package com.vk.sdk.api.messages.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class MessagesConversation {

    @b("can_receive_money")
    @Nullable
    private final Boolean canReceiveMoney;

    @b("can_send_money")
    @Nullable
    private final Boolean canSendMoney;

    @b("can_write")
    @Nullable
    private final MessagesConversationCanWrite canWrite;

    @b("chat_settings")
    @Nullable
    private final MessagesChatSettings chatSettings;

    @b("current_keyboard")
    @Nullable
    private final MessagesKeyboard currentKeyboard;

    @b("expire_messages")
    @Nullable
    private final List<Integer> expireMessages;

    @b("important")
    @Nullable
    private final Boolean important;

    @b("in_read")
    private final int inRead;

    @b("is_archived")
    @Nullable
    private final Boolean isArchived;

    @b("is_marked_unread")
    @Nullable
    private final Boolean isMarkedUnread;

    @b("is_new")
    @Nullable
    private final Boolean isNew;

    @b("last_conversation_message_id")
    @Nullable
    private final Integer lastConversationMessageId;

    @b("last_message_id")
    private final int lastMessageId;

    @b("mentions")
    @Nullable
    private final List<Integer> mentions;

    @b("message_request_data")
    @Nullable
    private final MessagesMessageRequestData messageRequestData;

    @b("out_read")
    private final int outRead;

    @b("out_read_by")
    @Nullable
    private final MessagesOutReadBy outReadBy;

    @b("peer")
    @NotNull
    private final MessagesConversationPeer peer;

    @b("push_settings")
    @Nullable
    private final MessagesPushSettings pushSettings;

    @b("sort_id")
    @Nullable
    private final MessagesConversationSortId sortId;

    @b("spam_expiration")
    @Nullable
    private final Integer spamExpiration;

    @b("special_service_type")
    @Nullable
    private final SpecialServiceType specialServiceType;

    @b("unanswered")
    @Nullable
    private final Boolean unanswered;

    @b("unread_count")
    @Nullable
    private final Integer unreadCount;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum SpecialServiceType {
        BUSINESS_NOTIFY("business_notify");


        @NotNull
        private final String value;

        SpecialServiceType(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public MessagesConversation(@NotNull MessagesConversationPeer peer, int i, int i10, int i11, @Nullable MessagesConversationSortId messagesConversationSortId, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable MessagesOutReadBy messagesOutReadBy, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable SpecialServiceType specialServiceType, @Nullable MessagesMessageRequestData messagesMessageRequestData, @Nullable List<Integer> list, @Nullable List<Integer> list2, @Nullable MessagesKeyboard messagesKeyboard, @Nullable MessagesPushSettings messagesPushSettings, @Nullable MessagesConversationCanWrite messagesConversationCanWrite, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable MessagesChatSettings messagesChatSettings, @Nullable Integer num3, @Nullable Boolean bool6, @Nullable Boolean bool7) {
        Intrinsics.checkNotNullParameter(peer, "peer");
        this.peer = peer;
        this.lastMessageId = i;
        this.inRead = i10;
        this.outRead = i11;
        this.sortId = messagesConversationSortId;
        this.lastConversationMessageId = num;
        this.unreadCount = num2;
        this.isMarkedUnread = bool;
        this.outReadBy = messagesOutReadBy;
        this.important = bool2;
        this.unanswered = bool3;
        this.specialServiceType = specialServiceType;
        this.messageRequestData = messagesMessageRequestData;
        this.mentions = list;
        this.expireMessages = list2;
        this.currentKeyboard = messagesKeyboard;
        this.pushSettings = messagesPushSettings;
        this.canWrite = messagesConversationCanWrite;
        this.canSendMoney = bool4;
        this.canReceiveMoney = bool5;
        this.chatSettings = messagesChatSettings;
        this.spamExpiration = num3;
        this.isNew = bool6;
        this.isArchived = bool7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesConversation copy$default(MessagesConversation messagesConversation, MessagesConversationPeer messagesConversationPeer, int i, int i10, int i11, MessagesConversationSortId messagesConversationSortId, Integer num, Integer num2, Boolean bool, MessagesOutReadBy messagesOutReadBy, Boolean bool2, Boolean bool3, SpecialServiceType specialServiceType, MessagesMessageRequestData messagesMessageRequestData, List list, List list2, MessagesKeyboard messagesKeyboard, MessagesPushSettings messagesPushSettings, MessagesConversationCanWrite messagesConversationCanWrite, Boolean bool4, Boolean bool5, MessagesChatSettings messagesChatSettings, Integer num3, Boolean bool6, Boolean bool7, int i12, Object obj) {
        Boolean bool8;
        Boolean bool9;
        MessagesConversationPeer messagesConversationPeer2 = (i12 & 1) != 0 ? messagesConversation.peer : messagesConversationPeer;
        int i13 = (i12 & 2) != 0 ? messagesConversation.lastMessageId : i;
        int i14 = (i12 & 4) != 0 ? messagesConversation.inRead : i10;
        int i15 = (i12 & 8) != 0 ? messagesConversation.outRead : i11;
        MessagesConversationSortId messagesConversationSortId2 = (i12 & 16) != 0 ? messagesConversation.sortId : messagesConversationSortId;
        Integer num4 = (i12 & 32) != 0 ? messagesConversation.lastConversationMessageId : num;
        Integer num5 = (i12 & 64) != 0 ? messagesConversation.unreadCount : num2;
        Boolean bool10 = (i12 & 128) != 0 ? messagesConversation.isMarkedUnread : bool;
        MessagesOutReadBy messagesOutReadBy2 = (i12 & 256) != 0 ? messagesConversation.outReadBy : messagesOutReadBy;
        Boolean bool11 = (i12 & 512) != 0 ? messagesConversation.important : bool2;
        Boolean bool12 = (i12 & 1024) != 0 ? messagesConversation.unanswered : bool3;
        SpecialServiceType specialServiceType2 = (i12 & 2048) != 0 ? messagesConversation.specialServiceType : specialServiceType;
        MessagesMessageRequestData messagesMessageRequestData2 = (i12 & 4096) != 0 ? messagesConversation.messageRequestData : messagesMessageRequestData;
        List list3 = (i12 & 8192) != 0 ? messagesConversation.mentions : list;
        MessagesConversationPeer messagesConversationPeer3 = messagesConversationPeer2;
        List list4 = (i12 & 16384) != 0 ? messagesConversation.expireMessages : list2;
        MessagesKeyboard messagesKeyboard2 = (i12 & 32768) != 0 ? messagesConversation.currentKeyboard : messagesKeyboard;
        MessagesPushSettings messagesPushSettings2 = (i12 & 65536) != 0 ? messagesConversation.pushSettings : messagesPushSettings;
        MessagesConversationCanWrite messagesConversationCanWrite2 = (i12 & 131072) != 0 ? messagesConversation.canWrite : messagesConversationCanWrite;
        Boolean bool13 = (i12 & 262144) != 0 ? messagesConversation.canSendMoney : bool4;
        Boolean bool14 = (i12 & 524288) != 0 ? messagesConversation.canReceiveMoney : bool5;
        MessagesChatSettings messagesChatSettings2 = (i12 & 1048576) != 0 ? messagesConversation.chatSettings : messagesChatSettings;
        Integer num6 = (i12 & 2097152) != 0 ? messagesConversation.spamExpiration : num3;
        Boolean bool15 = (i12 & 4194304) != 0 ? messagesConversation.isNew : bool6;
        if ((i12 & 8388608) != 0) {
            bool9 = bool15;
            bool8 = messagesConversation.isArchived;
        } else {
            bool8 = bool7;
            bool9 = bool15;
        }
        return messagesConversation.copy(messagesConversationPeer3, i13, i14, i15, messagesConversationSortId2, num4, num5, bool10, messagesOutReadBy2, bool11, bool12, specialServiceType2, messagesMessageRequestData2, list3, list4, messagesKeyboard2, messagesPushSettings2, messagesConversationCanWrite2, bool13, bool14, messagesChatSettings2, num6, bool9, bool8);
    }

    @NotNull
    public final MessagesConversationPeer component1() {
        return this.peer;
    }

    @Nullable
    public final Boolean component10() {
        return this.important;
    }

    @Nullable
    public final Boolean component11() {
        return this.unanswered;
    }

    @Nullable
    public final SpecialServiceType component12() {
        return this.specialServiceType;
    }

    @Nullable
    public final MessagesMessageRequestData component13() {
        return this.messageRequestData;
    }

    @Nullable
    public final List<Integer> component14() {
        return this.mentions;
    }

    @Nullable
    public final List<Integer> component15() {
        return this.expireMessages;
    }

    @Nullable
    public final MessagesKeyboard component16() {
        return this.currentKeyboard;
    }

    @Nullable
    public final MessagesPushSettings component17() {
        return this.pushSettings;
    }

    @Nullable
    public final MessagesConversationCanWrite component18() {
        return this.canWrite;
    }

    @Nullable
    public final Boolean component19() {
        return this.canSendMoney;
    }

    public final int component2() {
        return this.lastMessageId;
    }

    @Nullable
    public final Boolean component20() {
        return this.canReceiveMoney;
    }

    @Nullable
    public final MessagesChatSettings component21() {
        return this.chatSettings;
    }

    @Nullable
    public final Integer component22() {
        return this.spamExpiration;
    }

    @Nullable
    public final Boolean component23() {
        return this.isNew;
    }

    @Nullable
    public final Boolean component24() {
        return this.isArchived;
    }

    public final int component3() {
        return this.inRead;
    }

    public final int component4() {
        return this.outRead;
    }

    @Nullable
    public final MessagesConversationSortId component5() {
        return this.sortId;
    }

    @Nullable
    public final Integer component6() {
        return this.lastConversationMessageId;
    }

    @Nullable
    public final Integer component7() {
        return this.unreadCount;
    }

    @Nullable
    public final Boolean component8() {
        return this.isMarkedUnread;
    }

    @Nullable
    public final MessagesOutReadBy component9() {
        return this.outReadBy;
    }

    @NotNull
    public final MessagesConversation copy(@NotNull MessagesConversationPeer peer, int i, int i10, int i11, @Nullable MessagesConversationSortId messagesConversationSortId, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable MessagesOutReadBy messagesOutReadBy, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable SpecialServiceType specialServiceType, @Nullable MessagesMessageRequestData messagesMessageRequestData, @Nullable List<Integer> list, @Nullable List<Integer> list2, @Nullable MessagesKeyboard messagesKeyboard, @Nullable MessagesPushSettings messagesPushSettings, @Nullable MessagesConversationCanWrite messagesConversationCanWrite, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable MessagesChatSettings messagesChatSettings, @Nullable Integer num3, @Nullable Boolean bool6, @Nullable Boolean bool7) {
        Intrinsics.checkNotNullParameter(peer, "peer");
        return new MessagesConversation(peer, i, i10, i11, messagesConversationSortId, num, num2, bool, messagesOutReadBy, bool2, bool3, specialServiceType, messagesMessageRequestData, list, list2, messagesKeyboard, messagesPushSettings, messagesConversationCanWrite, bool4, bool5, messagesChatSettings, num3, bool6, bool7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversation)) {
            return false;
        }
        MessagesConversation messagesConversation = (MessagesConversation) obj;
        return Intrinsics.a(this.peer, messagesConversation.peer) && this.lastMessageId == messagesConversation.lastMessageId && this.inRead == messagesConversation.inRead && this.outRead == messagesConversation.outRead && Intrinsics.a(this.sortId, messagesConversation.sortId) && Intrinsics.a(this.lastConversationMessageId, messagesConversation.lastConversationMessageId) && Intrinsics.a(this.unreadCount, messagesConversation.unreadCount) && Intrinsics.a(this.isMarkedUnread, messagesConversation.isMarkedUnread) && Intrinsics.a(this.outReadBy, messagesConversation.outReadBy) && Intrinsics.a(this.important, messagesConversation.important) && Intrinsics.a(this.unanswered, messagesConversation.unanswered) && this.specialServiceType == messagesConversation.specialServiceType && Intrinsics.a(this.messageRequestData, messagesConversation.messageRequestData) && Intrinsics.a(this.mentions, messagesConversation.mentions) && Intrinsics.a(this.expireMessages, messagesConversation.expireMessages) && Intrinsics.a(this.currentKeyboard, messagesConversation.currentKeyboard) && Intrinsics.a(this.pushSettings, messagesConversation.pushSettings) && Intrinsics.a(this.canWrite, messagesConversation.canWrite) && Intrinsics.a(this.canSendMoney, messagesConversation.canSendMoney) && Intrinsics.a(this.canReceiveMoney, messagesConversation.canReceiveMoney) && Intrinsics.a(this.chatSettings, messagesConversation.chatSettings) && Intrinsics.a(this.spamExpiration, messagesConversation.spamExpiration) && Intrinsics.a(this.isNew, messagesConversation.isNew) && Intrinsics.a(this.isArchived, messagesConversation.isArchived);
    }

    @Nullable
    public final Boolean getCanReceiveMoney() {
        return this.canReceiveMoney;
    }

    @Nullable
    public final Boolean getCanSendMoney() {
        return this.canSendMoney;
    }

    @Nullable
    public final MessagesConversationCanWrite getCanWrite() {
        return this.canWrite;
    }

    @Nullable
    public final MessagesChatSettings getChatSettings() {
        return this.chatSettings;
    }

    @Nullable
    public final MessagesKeyboard getCurrentKeyboard() {
        return this.currentKeyboard;
    }

    @Nullable
    public final List<Integer> getExpireMessages() {
        return this.expireMessages;
    }

    @Nullable
    public final Boolean getImportant() {
        return this.important;
    }

    public final int getInRead() {
        return this.inRead;
    }

    @Nullable
    public final Integer getLastConversationMessageId() {
        return this.lastConversationMessageId;
    }

    public final int getLastMessageId() {
        return this.lastMessageId;
    }

    @Nullable
    public final List<Integer> getMentions() {
        return this.mentions;
    }

    @Nullable
    public final MessagesMessageRequestData getMessageRequestData() {
        return this.messageRequestData;
    }

    public final int getOutRead() {
        return this.outRead;
    }

    @Nullable
    public final MessagesOutReadBy getOutReadBy() {
        return this.outReadBy;
    }

    @NotNull
    public final MessagesConversationPeer getPeer() {
        return this.peer;
    }

    @Nullable
    public final MessagesPushSettings getPushSettings() {
        return this.pushSettings;
    }

    @Nullable
    public final MessagesConversationSortId getSortId() {
        return this.sortId;
    }

    @Nullable
    public final Integer getSpamExpiration() {
        return this.spamExpiration;
    }

    @Nullable
    public final SpecialServiceType getSpecialServiceType() {
        return this.specialServiceType;
    }

    @Nullable
    public final Boolean getUnanswered() {
        return this.unanswered;
    }

    @Nullable
    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    public int hashCode() {
        int iG = u.g(this.outRead, u.g(this.inRead, u.g(this.lastMessageId, this.peer.hashCode() * 31, 31), 31), 31);
        MessagesConversationSortId messagesConversationSortId = this.sortId;
        int iHashCode = (iG + (messagesConversationSortId == null ? 0 : messagesConversationSortId.hashCode())) * 31;
        Integer num = this.lastConversationMessageId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unreadCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isMarkedUnread;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        MessagesOutReadBy messagesOutReadBy = this.outReadBy;
        int iHashCode5 = (iHashCode4 + (messagesOutReadBy == null ? 0 : messagesOutReadBy.hashCode())) * 31;
        Boolean bool2 = this.important;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.unanswered;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        SpecialServiceType specialServiceType = this.specialServiceType;
        int iHashCode8 = (iHashCode7 + (specialServiceType == null ? 0 : specialServiceType.hashCode())) * 31;
        MessagesMessageRequestData messagesMessageRequestData = this.messageRequestData;
        int iHashCode9 = (iHashCode8 + (messagesMessageRequestData == null ? 0 : messagesMessageRequestData.hashCode())) * 31;
        List<Integer> list = this.mentions;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.expireMessages;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MessagesKeyboard messagesKeyboard = this.currentKeyboard;
        int iHashCode12 = (iHashCode11 + (messagesKeyboard == null ? 0 : messagesKeyboard.hashCode())) * 31;
        MessagesPushSettings messagesPushSettings = this.pushSettings;
        int iHashCode13 = (iHashCode12 + (messagesPushSettings == null ? 0 : messagesPushSettings.hashCode())) * 31;
        MessagesConversationCanWrite messagesConversationCanWrite = this.canWrite;
        int iHashCode14 = (iHashCode13 + (messagesConversationCanWrite == null ? 0 : messagesConversationCanWrite.hashCode())) * 31;
        Boolean bool4 = this.canSendMoney;
        int iHashCode15 = (iHashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canReceiveMoney;
        int iHashCode16 = (iHashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        MessagesChatSettings messagesChatSettings = this.chatSettings;
        int iHashCode17 = (iHashCode16 + (messagesChatSettings == null ? 0 : messagesChatSettings.hashCode())) * 31;
        Integer num3 = this.spamExpiration;
        int iHashCode18 = (iHashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool6 = this.isNew;
        int iHashCode19 = (iHashCode18 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isArchived;
        return iHashCode19 + (bool7 != null ? bool7.hashCode() : 0);
    }

    @Nullable
    public final Boolean isArchived() {
        return this.isArchived;
    }

    @Nullable
    public final Boolean isMarkedUnread() {
        return this.isMarkedUnread;
    }

    @Nullable
    public final Boolean isNew() {
        return this.isNew;
    }

    @NotNull
    public String toString() {
        MessagesConversationPeer messagesConversationPeer = this.peer;
        int i = this.lastMessageId;
        int i10 = this.inRead;
        int i11 = this.outRead;
        MessagesConversationSortId messagesConversationSortId = this.sortId;
        Integer num = this.lastConversationMessageId;
        Integer num2 = this.unreadCount;
        Boolean bool = this.isMarkedUnread;
        MessagesOutReadBy messagesOutReadBy = this.outReadBy;
        Boolean bool2 = this.important;
        Boolean bool3 = this.unanswered;
        SpecialServiceType specialServiceType = this.specialServiceType;
        MessagesMessageRequestData messagesMessageRequestData = this.messageRequestData;
        List<Integer> list = this.mentions;
        List<Integer> list2 = this.expireMessages;
        MessagesKeyboard messagesKeyboard = this.currentKeyboard;
        MessagesPushSettings messagesPushSettings = this.pushSettings;
        MessagesConversationCanWrite messagesConversationCanWrite = this.canWrite;
        Boolean bool4 = this.canSendMoney;
        Boolean bool5 = this.canReceiveMoney;
        MessagesChatSettings messagesChatSettings = this.chatSettings;
        Integer num3 = this.spamExpiration;
        Boolean bool6 = this.isNew;
        Boolean bool7 = this.isArchived;
        StringBuilder sb2 = new StringBuilder("MessagesConversation(peer=");
        sb2.append(messagesConversationPeer);
        sb2.append(", lastMessageId=");
        sb2.append(i);
        sb2.append(", inRead=");
        om1.t(sb2, i10, ", outRead=", i11, ", sortId=");
        sb2.append(messagesConversationSortId);
        sb2.append(", lastConversationMessageId=");
        sb2.append(num);
        sb2.append(", unreadCount=");
        sb2.append(num2);
        sb2.append(", isMarkedUnread=");
        sb2.append(bool);
        sb2.append(", outReadBy=");
        sb2.append(messagesOutReadBy);
        sb2.append(", important=");
        sb2.append(bool2);
        sb2.append(", unanswered=");
        sb2.append(bool3);
        sb2.append(", specialServiceType=");
        sb2.append(specialServiceType);
        sb2.append(", messageRequestData=");
        sb2.append(messagesMessageRequestData);
        sb2.append(", mentions=");
        sb2.append(list);
        sb2.append(", expireMessages=");
        sb2.append(list2);
        sb2.append(", currentKeyboard=");
        sb2.append(messagesKeyboard);
        sb2.append(", pushSettings=");
        sb2.append(messagesPushSettings);
        sb2.append(", canWrite=");
        sb2.append(messagesConversationCanWrite);
        sb2.append(", canSendMoney=");
        u.s(sb2, bool4, ", canReceiveMoney=", bool5, ", chatSettings=");
        sb2.append(messagesChatSettings);
        sb2.append(", spamExpiration=");
        sb2.append(num3);
        sb2.append(", isNew=");
        sb2.append(bool6);
        sb2.append(", isArchived=");
        sb2.append(bool7);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ MessagesConversation(MessagesConversationPeer messagesConversationPeer, int i, int i10, int i11, MessagesConversationSortId messagesConversationSortId, Integer num, Integer num2, Boolean bool, MessagesOutReadBy messagesOutReadBy, Boolean bool2, Boolean bool3, SpecialServiceType specialServiceType, MessagesMessageRequestData messagesMessageRequestData, List list, List list2, MessagesKeyboard messagesKeyboard, MessagesPushSettings messagesPushSettings, MessagesConversationCanWrite messagesConversationCanWrite, Boolean bool4, Boolean bool5, MessagesChatSettings messagesChatSettings, Integer num3, Boolean bool6, Boolean bool7, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagesConversationPeer, i, i10, i11, (i12 & 16) != 0 ? null : messagesConversationSortId, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : num2, (i12 & 128) != 0 ? null : bool, (i12 & 256) != 0 ? null : messagesOutReadBy, (i12 & 512) != 0 ? null : bool2, (i12 & 1024) != 0 ? null : bool3, (i12 & 2048) != 0 ? null : specialServiceType, (i12 & 4096) != 0 ? null : messagesMessageRequestData, (i12 & 8192) != 0 ? null : list, (i12 & 16384) != 0 ? null : list2, (32768 & i12) != 0 ? null : messagesKeyboard, (65536 & i12) != 0 ? null : messagesPushSettings, (131072 & i12) != 0 ? null : messagesConversationCanWrite, (262144 & i12) != 0 ? null : bool4, (524288 & i12) != 0 ? null : bool5, (1048576 & i12) != 0 ? null : messagesChatSettings, (2097152 & i12) != 0 ? null : num3, (4194304 & i12) != 0 ? null : bool6, (i12 & 8388608) != 0 ? null : bool7);
    }
}
