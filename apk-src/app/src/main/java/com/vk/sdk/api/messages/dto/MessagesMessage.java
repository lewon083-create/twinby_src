package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
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
public final class MessagesMessage {

    @b("action")
    @Nullable
    private final MessagesMessageAction action;

    @b("admin_author_id")
    @Nullable
    private final UserId adminAuthorId;

    @b("attachments")
    @Nullable
    private final List<MessagesMessageAttachment> attachments;

    @b("conversation_message_id")
    @Nullable
    private final Integer conversationMessageId;

    @b("date")
    private final int date;

    @b("deleted")
    @Nullable
    private final BaseBoolInt deleted;

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
    private final int f15197id;

    @b("important")
    @Nullable
    private final Boolean important;

    @b("is_cropped")
    @Nullable
    private final Boolean isCropped;

    @b("is_hidden")
    @Nullable
    private final Boolean isHidden;

    @b("is_silent")
    @Nullable
    private final Boolean isSilent;

    @b("keyboard")
    @Nullable
    private final MessagesKeyboard keyboard;

    @b("members_count")
    @Nullable
    private final Integer membersCount;

    @b("out")
    @NotNull
    private final BaseBoolInt out;

    @b("payload")
    @Nullable
    private final String payload;

    @b("peer_id")
    private final int peerId;

    @b("pinned_at")
    @Nullable
    private final Integer pinnedAt;

    @b("random_id")
    @Nullable
    private final Integer randomId;

    @b("ref")
    @Nullable
    private final String ref;

    @b("ref_source")
    @Nullable
    private final String refSource;

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

    public MessagesMessage(int i, @NotNull UserId fromId, int i10, @NotNull BaseBoolInt out, int i11, @NotNull String text, @Nullable MessagesMessageAction messagesMessageAction, @Nullable UserId userId, @Nullable List<MessagesMessageAttachment> list, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable List<MessagesForeignMessage> list2, @Nullable BaseGeo baseGeo, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable MessagesKeyboard messagesKeyboard, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, @Nullable String str2, @Nullable String str3, @Nullable MessagesForeignMessage messagesForeignMessage, @Nullable Integer num4, @Nullable Boolean bool4, @Nullable Integer num5, @Nullable Boolean bool5) {
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(text, "text");
        this.date = i;
        this.fromId = fromId;
        this.f15197id = i10;
        this.out = out;
        this.peerId = i11;
        this.text = text;
        this.action = messagesMessageAction;
        this.adminAuthorId = userId;
        this.attachments = list;
        this.conversationMessageId = num;
        this.deleted = baseBoolInt;
        this.fwdMessages = list2;
        this.geo = baseGeo;
        this.important = bool;
        this.isHidden = bool2;
        this.isCropped = bool3;
        this.keyboard = messagesKeyboard;
        this.membersCount = num2;
        this.payload = str;
        this.randomId = num3;
        this.ref = str2;
        this.refSource = str3;
        this.replyMessage = messagesForeignMessage;
        this.updateTime = num4;
        this.wasListened = bool4;
        this.pinnedAt = num5;
        this.isSilent = bool5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesMessage copy$default(MessagesMessage messagesMessage, int i, UserId userId, int i10, BaseBoolInt baseBoolInt, int i11, String str, MessagesMessageAction messagesMessageAction, UserId userId2, List list, Integer num, BaseBoolInt baseBoolInt2, List list2, BaseGeo baseGeo, Boolean bool, Boolean bool2, Boolean bool3, MessagesKeyboard messagesKeyboard, Integer num2, String str2, Integer num3, String str3, String str4, MessagesForeignMessage messagesForeignMessage, Integer num4, Boolean bool4, Integer num5, Boolean bool5, int i12, Object obj) {
        Boolean bool6;
        Integer num6;
        int i13 = (i12 & 1) != 0 ? messagesMessage.date : i;
        UserId userId3 = (i12 & 2) != 0 ? messagesMessage.fromId : userId;
        int i14 = (i12 & 4) != 0 ? messagesMessage.f15197id : i10;
        BaseBoolInt baseBoolInt3 = (i12 & 8) != 0 ? messagesMessage.out : baseBoolInt;
        int i15 = (i12 & 16) != 0 ? messagesMessage.peerId : i11;
        String str5 = (i12 & 32) != 0 ? messagesMessage.text : str;
        MessagesMessageAction messagesMessageAction2 = (i12 & 64) != 0 ? messagesMessage.action : messagesMessageAction;
        UserId userId4 = (i12 & 128) != 0 ? messagesMessage.adminAuthorId : userId2;
        List list3 = (i12 & 256) != 0 ? messagesMessage.attachments : list;
        Integer num7 = (i12 & 512) != 0 ? messagesMessage.conversationMessageId : num;
        BaseBoolInt baseBoolInt4 = (i12 & 1024) != 0 ? messagesMessage.deleted : baseBoolInt2;
        List list4 = (i12 & 2048) != 0 ? messagesMessage.fwdMessages : list2;
        BaseGeo baseGeo2 = (i12 & 4096) != 0 ? messagesMessage.geo : baseGeo;
        Boolean bool7 = (i12 & 8192) != 0 ? messagesMessage.important : bool;
        int i16 = i13;
        Boolean bool8 = (i12 & 16384) != 0 ? messagesMessage.isHidden : bool2;
        Boolean bool9 = (i12 & 32768) != 0 ? messagesMessage.isCropped : bool3;
        MessagesKeyboard messagesKeyboard2 = (i12 & 65536) != 0 ? messagesMessage.keyboard : messagesKeyboard;
        Integer num8 = (i12 & 131072) != 0 ? messagesMessage.membersCount : num2;
        String str6 = (i12 & 262144) != 0 ? messagesMessage.payload : str2;
        Integer num9 = (i12 & 524288) != 0 ? messagesMessage.randomId : num3;
        String str7 = (i12 & 1048576) != 0 ? messagesMessage.ref : str3;
        String str8 = (i12 & 2097152) != 0 ? messagesMessage.refSource : str4;
        MessagesForeignMessage messagesForeignMessage2 = (i12 & 4194304) != 0 ? messagesMessage.replyMessage : messagesForeignMessage;
        Integer num10 = (i12 & 8388608) != 0 ? messagesMessage.updateTime : num4;
        Boolean bool10 = (i12 & 16777216) != 0 ? messagesMessage.wasListened : bool4;
        Integer num11 = (i12 & 33554432) != 0 ? messagesMessage.pinnedAt : num5;
        if ((i12 & 67108864) != 0) {
            num6 = num11;
            bool6 = messagesMessage.isSilent;
        } else {
            bool6 = bool5;
            num6 = num11;
        }
        return messagesMessage.copy(i16, userId3, i14, baseBoolInt3, i15, str5, messagesMessageAction2, userId4, list3, num7, baseBoolInt4, list4, baseGeo2, bool7, bool8, bool9, messagesKeyboard2, num8, str6, num9, str7, str8, messagesForeignMessage2, num10, bool10, num6, bool6);
    }

    public final int component1() {
        return this.date;
    }

    @Nullable
    public final Integer component10() {
        return this.conversationMessageId;
    }

    @Nullable
    public final BaseBoolInt component11() {
        return this.deleted;
    }

    @Nullable
    public final List<MessagesForeignMessage> component12() {
        return this.fwdMessages;
    }

    @Nullable
    public final BaseGeo component13() {
        return this.geo;
    }

    @Nullable
    public final Boolean component14() {
        return this.important;
    }

    @Nullable
    public final Boolean component15() {
        return this.isHidden;
    }

    @Nullable
    public final Boolean component16() {
        return this.isCropped;
    }

    @Nullable
    public final MessagesKeyboard component17() {
        return this.keyboard;
    }

    @Nullable
    public final Integer component18() {
        return this.membersCount;
    }

    @Nullable
    public final String component19() {
        return this.payload;
    }

    @NotNull
    public final UserId component2() {
        return this.fromId;
    }

    @Nullable
    public final Integer component20() {
        return this.randomId;
    }

    @Nullable
    public final String component21() {
        return this.ref;
    }

    @Nullable
    public final String component22() {
        return this.refSource;
    }

    @Nullable
    public final MessagesForeignMessage component23() {
        return this.replyMessage;
    }

    @Nullable
    public final Integer component24() {
        return this.updateTime;
    }

    @Nullable
    public final Boolean component25() {
        return this.wasListened;
    }

    @Nullable
    public final Integer component26() {
        return this.pinnedAt;
    }

    @Nullable
    public final Boolean component27() {
        return this.isSilent;
    }

    public final int component3() {
        return this.f15197id;
    }

    @NotNull
    public final BaseBoolInt component4() {
        return this.out;
    }

    public final int component5() {
        return this.peerId;
    }

    @NotNull
    public final String component6() {
        return this.text;
    }

    @Nullable
    public final MessagesMessageAction component7() {
        return this.action;
    }

    @Nullable
    public final UserId component8() {
        return this.adminAuthorId;
    }

    @Nullable
    public final List<MessagesMessageAttachment> component9() {
        return this.attachments;
    }

    @NotNull
    public final MessagesMessage copy(int i, @NotNull UserId fromId, int i10, @NotNull BaseBoolInt out, int i11, @NotNull String text, @Nullable MessagesMessageAction messagesMessageAction, @Nullable UserId userId, @Nullable List<MessagesMessageAttachment> list, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable List<MessagesForeignMessage> list2, @Nullable BaseGeo baseGeo, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable MessagesKeyboard messagesKeyboard, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, @Nullable String str2, @Nullable String str3, @Nullable MessagesForeignMessage messagesForeignMessage, @Nullable Integer num4, @Nullable Boolean bool4, @Nullable Integer num5, @Nullable Boolean bool5) {
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(text, "text");
        return new MessagesMessage(i, fromId, i10, out, i11, text, messagesMessageAction, userId, list, num, baseBoolInt, list2, baseGeo, bool, bool2, bool3, messagesKeyboard, num2, str, num3, str2, str3, messagesForeignMessage, num4, bool4, num5, bool5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessage)) {
            return false;
        }
        MessagesMessage messagesMessage = (MessagesMessage) obj;
        return this.date == messagesMessage.date && Intrinsics.a(this.fromId, messagesMessage.fromId) && this.f15197id == messagesMessage.f15197id && this.out == messagesMessage.out && this.peerId == messagesMessage.peerId && Intrinsics.a(this.text, messagesMessage.text) && Intrinsics.a(this.action, messagesMessage.action) && Intrinsics.a(this.adminAuthorId, messagesMessage.adminAuthorId) && Intrinsics.a(this.attachments, messagesMessage.attachments) && Intrinsics.a(this.conversationMessageId, messagesMessage.conversationMessageId) && this.deleted == messagesMessage.deleted && Intrinsics.a(this.fwdMessages, messagesMessage.fwdMessages) && Intrinsics.a(this.geo, messagesMessage.geo) && Intrinsics.a(this.important, messagesMessage.important) && Intrinsics.a(this.isHidden, messagesMessage.isHidden) && Intrinsics.a(this.isCropped, messagesMessage.isCropped) && Intrinsics.a(this.keyboard, messagesMessage.keyboard) && Intrinsics.a(this.membersCount, messagesMessage.membersCount) && Intrinsics.a(this.payload, messagesMessage.payload) && Intrinsics.a(this.randomId, messagesMessage.randomId) && Intrinsics.a(this.ref, messagesMessage.ref) && Intrinsics.a(this.refSource, messagesMessage.refSource) && Intrinsics.a(this.replyMessage, messagesMessage.replyMessage) && Intrinsics.a(this.updateTime, messagesMessage.updateTime) && Intrinsics.a(this.wasListened, messagesMessage.wasListened) && Intrinsics.a(this.pinnedAt, messagesMessage.pinnedAt) && Intrinsics.a(this.isSilent, messagesMessage.isSilent);
    }

    @Nullable
    public final MessagesMessageAction getAction() {
        return this.action;
    }

    @Nullable
    public final UserId getAdminAuthorId() {
        return this.adminAuthorId;
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

    @Nullable
    public final BaseBoolInt getDeleted() {
        return this.deleted;
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
        return this.f15197id;
    }

    @Nullable
    public final Boolean getImportant() {
        return this.important;
    }

    @Nullable
    public final MessagesKeyboard getKeyboard() {
        return this.keyboard;
    }

    @Nullable
    public final Integer getMembersCount() {
        return this.membersCount;
    }

    @NotNull
    public final BaseBoolInt getOut() {
        return this.out;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    public final int getPeerId() {
        return this.peerId;
    }

    @Nullable
    public final Integer getPinnedAt() {
        return this.pinnedAt;
    }

    @Nullable
    public final Integer getRandomId() {
        return this.randomId;
    }

    @Nullable
    public final String getRef() {
        return this.ref;
    }

    @Nullable
    public final String getRefSource() {
        return this.refSource;
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
        int iE = a.e(u.g(this.peerId, a.f(this.out, u.g(this.f15197id, o.e(this.fromId, Integer.hashCode(this.date) * 31, 31), 31), 31), 31), 31, this.text);
        MessagesMessageAction messagesMessageAction = this.action;
        int iHashCode = (iE + (messagesMessageAction == null ? 0 : messagesMessageAction.hashCode())) * 31;
        UserId userId = this.adminAuthorId;
        int iHashCode2 = (iHashCode + (userId == null ? 0 : userId.hashCode())) * 31;
        List<MessagesMessageAttachment> list = this.attachments;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.conversationMessageId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.deleted;
        int iHashCode5 = (iHashCode4 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        List<MessagesForeignMessage> list2 = this.fwdMessages;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseGeo baseGeo = this.geo;
        int iHashCode7 = (iHashCode6 + (baseGeo == null ? 0 : baseGeo.hashCode())) * 31;
        Boolean bool = this.important;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isHidden;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCropped;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        MessagesKeyboard messagesKeyboard = this.keyboard;
        int iHashCode11 = (iHashCode10 + (messagesKeyboard == null ? 0 : messagesKeyboard.hashCode())) * 31;
        Integer num2 = this.membersCount;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.payload;
        int iHashCode13 = (iHashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.randomId;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.ref;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refSource;
        int iHashCode16 = (iHashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MessagesForeignMessage messagesForeignMessage = this.replyMessage;
        int iHashCode17 = (iHashCode16 + (messagesForeignMessage == null ? 0 : messagesForeignMessage.hashCode())) * 31;
        Integer num4 = this.updateTime;
        int iHashCode18 = (iHashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool4 = this.wasListened;
        int iHashCode19 = (iHashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num5 = this.pinnedAt;
        int iHashCode20 = (iHashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool5 = this.isSilent;
        return iHashCode20 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @Nullable
    public final Boolean isCropped() {
        return this.isCropped;
    }

    @Nullable
    public final Boolean isHidden() {
        return this.isHidden;
    }

    @Nullable
    public final Boolean isSilent() {
        return this.isSilent;
    }

    @NotNull
    public String toString() {
        int i = this.date;
        UserId userId = this.fromId;
        int i10 = this.f15197id;
        BaseBoolInt baseBoolInt = this.out;
        int i11 = this.peerId;
        String str = this.text;
        MessagesMessageAction messagesMessageAction = this.action;
        UserId userId2 = this.adminAuthorId;
        List<MessagesMessageAttachment> list = this.attachments;
        Integer num = this.conversationMessageId;
        BaseBoolInt baseBoolInt2 = this.deleted;
        List<MessagesForeignMessage> list2 = this.fwdMessages;
        BaseGeo baseGeo = this.geo;
        Boolean bool = this.important;
        Boolean bool2 = this.isHidden;
        Boolean bool3 = this.isCropped;
        MessagesKeyboard messagesKeyboard = this.keyboard;
        Integer num2 = this.membersCount;
        String str2 = this.payload;
        Integer num3 = this.randomId;
        String str3 = this.ref;
        String str4 = this.refSource;
        MessagesForeignMessage messagesForeignMessage = this.replyMessage;
        Integer num4 = this.updateTime;
        Boolean bool4 = this.wasListened;
        Integer num5 = this.pinnedAt;
        Boolean bool5 = this.isSilent;
        StringBuilder sb2 = new StringBuilder("MessagesMessage(date=");
        sb2.append(i);
        sb2.append(", fromId=");
        sb2.append(userId);
        sb2.append(", id=");
        sb2.append(i10);
        sb2.append(", out=");
        sb2.append(baseBoolInt);
        sb2.append(", peerId=");
        a.q(i11, ", text=", str, ", action=", sb2);
        sb2.append(messagesMessageAction);
        sb2.append(", adminAuthorId=");
        sb2.append(userId2);
        sb2.append(", attachments=");
        sb2.append(list);
        sb2.append(", conversationMessageId=");
        sb2.append(num);
        sb2.append(", deleted=");
        sb2.append(baseBoolInt2);
        sb2.append(", fwdMessages=");
        sb2.append(list2);
        sb2.append(", geo=");
        sb2.append(baseGeo);
        sb2.append(", important=");
        sb2.append(bool);
        sb2.append(", isHidden=");
        u.s(sb2, bool2, ", isCropped=", bool3, ", keyboard=");
        sb2.append(messagesKeyboard);
        sb2.append(", membersCount=");
        sb2.append(num2);
        sb2.append(", payload=");
        a.r(num3, str2, ", randomId=", ", ref=", sb2);
        o.t(sb2, str3, ", refSource=", str4, ", replyMessage=");
        sb2.append(messagesForeignMessage);
        sb2.append(", updateTime=");
        sb2.append(num4);
        sb2.append(", wasListened=");
        sb2.append(bool4);
        sb2.append(", pinnedAt=");
        sb2.append(num5);
        sb2.append(", isSilent=");
        sb2.append(bool5);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ MessagesMessage(int i, UserId userId, int i10, BaseBoolInt baseBoolInt, int i11, String str, MessagesMessageAction messagesMessageAction, UserId userId2, List list, Integer num, BaseBoolInt baseBoolInt2, List list2, BaseGeo baseGeo, Boolean bool, Boolean bool2, Boolean bool3, MessagesKeyboard messagesKeyboard, Integer num2, String str2, Integer num3, String str3, String str4, MessagesForeignMessage messagesForeignMessage, Integer num4, Boolean bool4, Integer num5, Boolean bool5, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, i10, baseBoolInt, i11, str, (i12 & 64) != 0 ? null : messagesMessageAction, (i12 & 128) != 0 ? null : userId2, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? null : num, (i12 & 1024) != 0 ? null : baseBoolInt2, (i12 & 2048) != 0 ? null : list2, (i12 & 4096) != 0 ? null : baseGeo, (i12 & 8192) != 0 ? null : bool, (i12 & 16384) != 0 ? null : bool2, (32768 & i12) != 0 ? null : bool3, (65536 & i12) != 0 ? null : messagesKeyboard, (131072 & i12) != 0 ? null : num2, (262144 & i12) != 0 ? null : str2, (524288 & i12) != 0 ? null : num3, (1048576 & i12) != 0 ? null : str3, (2097152 & i12) != 0 ? null : str4, (4194304 & i12) != 0 ? null : messagesForeignMessage, (8388608 & i12) != 0 ? null : num4, (16777216 & i12) != 0 ? null : bool4, (33554432 & i12) != 0 ? null : num5, (i12 & 67108864) != 0 ? null : bool5);
    }
}
