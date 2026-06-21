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
public final class MessagesForeignMessage {

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
    @Nullable
    private final Integer f15195id;

    @b("payload")
    @Nullable
    private final String payload;

    @b("peer_id")
    @Nullable
    private final Integer peerId;

    @b("reply_message")
    @Nullable
    private final MessagesForeignMessage replyMessage;

    @b("text")
    @NotNull
    private final String text;

    @b("update_time")
    @Nullable
    private final Integer updateTime;

    @b("was_listened")
    @Nullable
    private final Boolean wasListened;

    public MessagesForeignMessage(int i, @NotNull UserId fromId, @NotNull String text, @Nullable List<MessagesMessageAttachment> list, @Nullable Integer num, @Nullable List<MessagesForeignMessage> list2, @Nullable BaseGeo baseGeo, @Nullable Integer num2, @Nullable Integer num3, @Nullable MessagesForeignMessage messagesForeignMessage, @Nullable Integer num4, @Nullable Boolean bool, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.date = i;
        this.fromId = fromId;
        this.text = text;
        this.attachments = list;
        this.conversationMessageId = num;
        this.fwdMessages = list2;
        this.geo = baseGeo;
        this.f15195id = num2;
        this.peerId = num3;
        this.replyMessage = messagesForeignMessage;
        this.updateTime = num4;
        this.wasListened = bool;
        this.payload = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesForeignMessage copy$default(MessagesForeignMessage messagesForeignMessage, int i, UserId userId, String str, List list, Integer num, List list2, BaseGeo baseGeo, Integer num2, Integer num3, MessagesForeignMessage messagesForeignMessage2, Integer num4, Boolean bool, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = messagesForeignMessage.date;
        }
        return messagesForeignMessage.copy(i, (i10 & 2) != 0 ? messagesForeignMessage.fromId : userId, (i10 & 4) != 0 ? messagesForeignMessage.text : str, (i10 & 8) != 0 ? messagesForeignMessage.attachments : list, (i10 & 16) != 0 ? messagesForeignMessage.conversationMessageId : num, (i10 & 32) != 0 ? messagesForeignMessage.fwdMessages : list2, (i10 & 64) != 0 ? messagesForeignMessage.geo : baseGeo, (i10 & 128) != 0 ? messagesForeignMessage.f15195id : num2, (i10 & 256) != 0 ? messagesForeignMessage.peerId : num3, (i10 & 512) != 0 ? messagesForeignMessage.replyMessage : messagesForeignMessage2, (i10 & 1024) != 0 ? messagesForeignMessage.updateTime : num4, (i10 & 2048) != 0 ? messagesForeignMessage.wasListened : bool, (i10 & 4096) != 0 ? messagesForeignMessage.payload : str2);
    }

    public final int component1() {
        return this.date;
    }

    @Nullable
    public final MessagesForeignMessage component10() {
        return this.replyMessage;
    }

    @Nullable
    public final Integer component11() {
        return this.updateTime;
    }

    @Nullable
    public final Boolean component12() {
        return this.wasListened;
    }

    @Nullable
    public final String component13() {
        return this.payload;
    }

    @NotNull
    public final UserId component2() {
        return this.fromId;
    }

    @NotNull
    public final String component3() {
        return this.text;
    }

    @Nullable
    public final List<MessagesMessageAttachment> component4() {
        return this.attachments;
    }

    @Nullable
    public final Integer component5() {
        return this.conversationMessageId;
    }

    @Nullable
    public final List<MessagesForeignMessage> component6() {
        return this.fwdMessages;
    }

    @Nullable
    public final BaseGeo component7() {
        return this.geo;
    }

    @Nullable
    public final Integer component8() {
        return this.f15195id;
    }

    @Nullable
    public final Integer component9() {
        return this.peerId;
    }

    @NotNull
    public final MessagesForeignMessage copy(int i, @NotNull UserId fromId, @NotNull String text, @Nullable List<MessagesMessageAttachment> list, @Nullable Integer num, @Nullable List<MessagesForeignMessage> list2, @Nullable BaseGeo baseGeo, @Nullable Integer num2, @Nullable Integer num3, @Nullable MessagesForeignMessage messagesForeignMessage, @Nullable Integer num4, @Nullable Boolean bool, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        Intrinsics.checkNotNullParameter(text, "text");
        return new MessagesForeignMessage(i, fromId, text, list, num, list2, baseGeo, num2, num3, messagesForeignMessage, num4, bool, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesForeignMessage)) {
            return false;
        }
        MessagesForeignMessage messagesForeignMessage = (MessagesForeignMessage) obj;
        return this.date == messagesForeignMessage.date && Intrinsics.a(this.fromId, messagesForeignMessage.fromId) && Intrinsics.a(this.text, messagesForeignMessage.text) && Intrinsics.a(this.attachments, messagesForeignMessage.attachments) && Intrinsics.a(this.conversationMessageId, messagesForeignMessage.conversationMessageId) && Intrinsics.a(this.fwdMessages, messagesForeignMessage.fwdMessages) && Intrinsics.a(this.geo, messagesForeignMessage.geo) && Intrinsics.a(this.f15195id, messagesForeignMessage.f15195id) && Intrinsics.a(this.peerId, messagesForeignMessage.peerId) && Intrinsics.a(this.replyMessage, messagesForeignMessage.replyMessage) && Intrinsics.a(this.updateTime, messagesForeignMessage.updateTime) && Intrinsics.a(this.wasListened, messagesForeignMessage.wasListened) && Intrinsics.a(this.payload, messagesForeignMessage.payload);
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

    @Nullable
    public final Integer getId() {
        return this.f15195id;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final Integer getPeerId() {
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

    @Nullable
    public final Integer getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final Boolean getWasListened() {
        return this.wasListened;
    }

    public int hashCode() {
        int iE = a.e(o.e(this.fromId, Integer.hashCode(this.date) * 31, 31), 31, this.text);
        List<MessagesMessageAttachment> list = this.attachments;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.conversationMessageId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<MessagesForeignMessage> list2 = this.fwdMessages;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseGeo baseGeo = this.geo;
        int iHashCode4 = (iHashCode3 + (baseGeo == null ? 0 : baseGeo.hashCode())) * 31;
        Integer num2 = this.f15195id;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.peerId;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MessagesForeignMessage messagesForeignMessage = this.replyMessage;
        int iHashCode7 = (iHashCode6 + (messagesForeignMessage == null ? 0 : messagesForeignMessage.hashCode())) * 31;
        Integer num4 = this.updateTime;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.wasListened;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.payload;
        return iHashCode9 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.date;
        UserId userId = this.fromId;
        String str = this.text;
        List<MessagesMessageAttachment> list = this.attachments;
        Integer num = this.conversationMessageId;
        List<MessagesForeignMessage> list2 = this.fwdMessages;
        BaseGeo baseGeo = this.geo;
        Integer num2 = this.f15195id;
        Integer num3 = this.peerId;
        MessagesForeignMessage messagesForeignMessage = this.replyMessage;
        Integer num4 = this.updateTime;
        Boolean bool = this.wasListened;
        String str2 = this.payload;
        StringBuilder sb2 = new StringBuilder("MessagesForeignMessage(date=");
        sb2.append(i);
        sb2.append(", fromId=");
        sb2.append(userId);
        sb2.append(", text=");
        sb2.append(str);
        sb2.append(", attachments=");
        sb2.append(list);
        sb2.append(", conversationMessageId=");
        sb2.append(num);
        sb2.append(", fwdMessages=");
        sb2.append(list2);
        sb2.append(", geo=");
        sb2.append(baseGeo);
        sb2.append(", id=");
        sb2.append(num2);
        sb2.append(", peerId=");
        sb2.append(num3);
        sb2.append(", replyMessage=");
        sb2.append(messagesForeignMessage);
        sb2.append(", updateTime=");
        sb2.append(num4);
        sb2.append(", wasListened=");
        sb2.append(bool);
        sb2.append(", payload=");
        return u.o(sb2, str2, ")");
    }

    public /* synthetic */ MessagesForeignMessage(int i, UserId userId, String str, List list, Integer num, List list2, BaseGeo baseGeo, Integer num2, Integer num3, MessagesForeignMessage messagesForeignMessage, Integer num4, Boolean bool, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, str, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : list2, (i10 & 64) != 0 ? null : baseGeo, (i10 & 128) != 0 ? null : num2, (i10 & 256) != 0 ? null : num3, (i10 & 512) != 0 ? null : messagesForeignMessage, (i10 & 1024) != 0 ? null : num4, (i10 & 2048) != 0 ? null : bool, (i10 & 4096) != 0 ? null : str2);
    }
}
