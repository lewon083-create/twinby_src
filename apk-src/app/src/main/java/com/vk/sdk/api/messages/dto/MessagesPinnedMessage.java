package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseGeo;
import gf.a;
import io.sentry.protocol.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class MessagesPinnedMessage {

    @b("attachments")
    @Nullable
    private final List<MessagesMessageAttachment> attachments;

    @b("conversation_message_id")
    @Nullable
    private final Integer conversationMessageId;

    @b("date")
    private final int date;

    @b("from_id")
    @NotNull
    private final UserId fromId;

    @b("fwd_messages")
    @Nullable
    private final List<MessagesForeignMessage> fwdMessages;

    @b(User.JsonKeys.GEO)
    @Nullable
    private final BaseGeo geo;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15198id;

    @b("keyboard")
    @Nullable
    private final MessagesKeyboard keyboard;

    @b("peer_id")
    private final int peerId;

    @b("reply_message")
    @Nullable
    private final MessagesForeignMessage replyMessage;

    @b("text")
    @NotNull
    private final String text;

    public MessagesPinnedMessage(int i, int i10, @NotNull UserId fromId, int i11, @NotNull String text, @Nullable List<MessagesMessageAttachment> list, @Nullable Integer num, @Nullable List<MessagesForeignMessage> list2, @Nullable BaseGeo baseGeo, @Nullable MessagesForeignMessage messagesForeignMessage, @Nullable MessagesKeyboard messagesKeyboard) {
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f15198id = i;
        this.date = i10;
        this.fromId = fromId;
        this.peerId = i11;
        this.text = text;
        this.attachments = list;
        this.conversationMessageId = num;
        this.fwdMessages = list2;
        this.geo = baseGeo;
        this.replyMessage = messagesForeignMessage;
        this.keyboard = messagesKeyboard;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesPinnedMessage copy$default(MessagesPinnedMessage messagesPinnedMessage, int i, int i10, UserId userId, int i11, String str, List list, Integer num, List list2, BaseGeo baseGeo, MessagesForeignMessage messagesForeignMessage, MessagesKeyboard messagesKeyboard, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = messagesPinnedMessage.f15198id;
        }
        if ((i12 & 2) != 0) {
            i10 = messagesPinnedMessage.date;
        }
        if ((i12 & 4) != 0) {
            userId = messagesPinnedMessage.fromId;
        }
        if ((i12 & 8) != 0) {
            i11 = messagesPinnedMessage.peerId;
        }
        if ((i12 & 16) != 0) {
            str = messagesPinnedMessage.text;
        }
        if ((i12 & 32) != 0) {
            list = messagesPinnedMessage.attachments;
        }
        if ((i12 & 64) != 0) {
            num = messagesPinnedMessage.conversationMessageId;
        }
        if ((i12 & 128) != 0) {
            list2 = messagesPinnedMessage.fwdMessages;
        }
        if ((i12 & 256) != 0) {
            baseGeo = messagesPinnedMessage.geo;
        }
        if ((i12 & 512) != 0) {
            messagesForeignMessage = messagesPinnedMessage.replyMessage;
        }
        if ((i12 & 1024) != 0) {
            messagesKeyboard = messagesPinnedMessage.keyboard;
        }
        MessagesForeignMessage messagesForeignMessage2 = messagesForeignMessage;
        MessagesKeyboard messagesKeyboard2 = messagesKeyboard;
        List list3 = list2;
        BaseGeo baseGeo2 = baseGeo;
        List list4 = list;
        Integer num2 = num;
        String str2 = str;
        UserId userId2 = userId;
        return messagesPinnedMessage.copy(i, i10, userId2, i11, str2, list4, num2, list3, baseGeo2, messagesForeignMessage2, messagesKeyboard2);
    }

    public final int component1() {
        return this.f15198id;
    }

    @Nullable
    public final MessagesForeignMessage component10() {
        return this.replyMessage;
    }

    @Nullable
    public final MessagesKeyboard component11() {
        return this.keyboard;
    }

    public final int component2() {
        return this.date;
    }

    @NotNull
    public final UserId component3() {
        return this.fromId;
    }

    public final int component4() {
        return this.peerId;
    }

    @NotNull
    public final String component5() {
        return this.text;
    }

    @Nullable
    public final List<MessagesMessageAttachment> component6() {
        return this.attachments;
    }

    @Nullable
    public final Integer component7() {
        return this.conversationMessageId;
    }

    @Nullable
    public final List<MessagesForeignMessage> component8() {
        return this.fwdMessages;
    }

    @Nullable
    public final BaseGeo component9() {
        return this.geo;
    }

    @NotNull
    public final MessagesPinnedMessage copy(int i, int i10, @NotNull UserId fromId, int i11, @NotNull String text, @Nullable List<MessagesMessageAttachment> list, @Nullable Integer num, @Nullable List<MessagesForeignMessage> list2, @Nullable BaseGeo baseGeo, @Nullable MessagesForeignMessage messagesForeignMessage, @Nullable MessagesKeyboard messagesKeyboard) {
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        Intrinsics.checkNotNullParameter(text, "text");
        return new MessagesPinnedMessage(i, i10, fromId, i11, text, list, num, list2, baseGeo, messagesForeignMessage, messagesKeyboard);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesPinnedMessage)) {
            return false;
        }
        MessagesPinnedMessage messagesPinnedMessage = (MessagesPinnedMessage) obj;
        return this.f15198id == messagesPinnedMessage.f15198id && this.date == messagesPinnedMessage.date && Intrinsics.a(this.fromId, messagesPinnedMessage.fromId) && this.peerId == messagesPinnedMessage.peerId && Intrinsics.a(this.text, messagesPinnedMessage.text) && Intrinsics.a(this.attachments, messagesPinnedMessage.attachments) && Intrinsics.a(this.conversationMessageId, messagesPinnedMessage.conversationMessageId) && Intrinsics.a(this.fwdMessages, messagesPinnedMessage.fwdMessages) && Intrinsics.a(this.geo, messagesPinnedMessage.geo) && Intrinsics.a(this.replyMessage, messagesPinnedMessage.replyMessage) && Intrinsics.a(this.keyboard, messagesPinnedMessage.keyboard);
    }

    @Nullable
    public final List<MessagesMessageAttachment> getAttachments() {
        return this.attachments;
    }

    @Nullable
    public final Integer getConversationMessageId() {
        return this.conversationMessageId;
    }

    public final int getDate() {
        return this.date;
    }

    @NotNull
    public final UserId getFromId() {
        return this.fromId;
    }

    @Nullable
    public final List<MessagesForeignMessage> getFwdMessages() {
        return this.fwdMessages;
    }

    @Nullable
    public final BaseGeo getGeo() {
        return this.geo;
    }

    public final int getId() {
        return this.f15198id;
    }

    @Nullable
    public final MessagesKeyboard getKeyboard() {
        return this.keyboard;
    }

    public final int getPeerId() {
        return this.peerId;
    }

    @Nullable
    public final MessagesForeignMessage getReplyMessage() {
        return this.replyMessage;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iE = a.e(u.g(this.peerId, o.e(this.fromId, u.g(this.date, Integer.hashCode(this.f15198id) * 31, 31), 31), 31), 31, this.text);
        List<MessagesMessageAttachment> list = this.attachments;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.conversationMessageId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<MessagesForeignMessage> list2 = this.fwdMessages;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseGeo baseGeo = this.geo;
        int iHashCode4 = (iHashCode3 + (baseGeo == null ? 0 : baseGeo.hashCode())) * 31;
        MessagesForeignMessage messagesForeignMessage = this.replyMessage;
        int iHashCode5 = (iHashCode4 + (messagesForeignMessage == null ? 0 : messagesForeignMessage.hashCode())) * 31;
        MessagesKeyboard messagesKeyboard = this.keyboard;
        return iHashCode5 + (messagesKeyboard != null ? messagesKeyboard.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.f15198id;
        int i10 = this.date;
        UserId userId = this.fromId;
        int i11 = this.peerId;
        String str = this.text;
        List<MessagesMessageAttachment> list = this.attachments;
        Integer num = this.conversationMessageId;
        List<MessagesForeignMessage> list2 = this.fwdMessages;
        BaseGeo baseGeo = this.geo;
        MessagesForeignMessage messagesForeignMessage = this.replyMessage;
        MessagesKeyboard messagesKeyboard = this.keyboard;
        StringBuilder sbI = z.i("MessagesPinnedMessage(id=", i, ", date=", i10, ", fromId=");
        sbI.append(userId);
        sbI.append(", peerId=");
        sbI.append(i11);
        sbI.append(", text=");
        sbI.append(str);
        sbI.append(", attachments=");
        sbI.append(list);
        sbI.append(", conversationMessageId=");
        sbI.append(num);
        sbI.append(", fwdMessages=");
        sbI.append(list2);
        sbI.append(", geo=");
        sbI.append(baseGeo);
        sbI.append(", replyMessage=");
        sbI.append(messagesForeignMessage);
        sbI.append(", keyboard=");
        sbI.append(messagesKeyboard);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ MessagesPinnedMessage(int i, int i10, UserId userId, int i11, String str, List list, Integer num, List list2, BaseGeo baseGeo, MessagesForeignMessage messagesForeignMessage, MessagesKeyboard messagesKeyboard, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, userId, i11, str, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : num, (i12 & 128) != 0 ? null : list2, (i12 & 256) != 0 ? null : baseGeo, (i12 & 512) != 0 ? null : messagesForeignMessage, (i12 & 1024) != 0 ? null : messagesKeyboard);
    }
}
