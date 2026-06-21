package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import com.vk.sdk.api.users.dto.UsersUserFull;
import gf.a;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class MessagesGetLongPollHistoryResponse {

    @b("chats")
    @Nullable
    private final List<MessagesChat> chats;

    @b("conversations")
    @Nullable
    private final List<MessagesConversation> conversations;

    @b("credentials")
    @Nullable
    private final MessagesLongpollParams credentials;

    @b("from_pts")
    @Nullable
    private final Integer fromPts;

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("history")
    @Nullable
    private final List<List<Integer>> history;

    @b("messages")
    @Nullable
    private final MessagesLongpollMessages messages;

    @b("more")
    @Nullable
    private final Boolean more;

    @b("new_pts")
    @Nullable
    private final Integer newPts;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    public MessagesGetLongPollHistoryResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesGetLongPollHistoryResponse copy$default(MessagesGetLongPollHistoryResponse messagesGetLongPollHistoryResponse, List list, MessagesLongpollMessages messagesLongpollMessages, MessagesLongpollParams messagesLongpollParams, List list2, List list3, List list4, Integer num, Integer num2, Boolean bool, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = messagesGetLongPollHistoryResponse.history;
        }
        if ((i & 2) != 0) {
            messagesLongpollMessages = messagesGetLongPollHistoryResponse.messages;
        }
        if ((i & 4) != 0) {
            messagesLongpollParams = messagesGetLongPollHistoryResponse.credentials;
        }
        if ((i & 8) != 0) {
            list2 = messagesGetLongPollHistoryResponse.profiles;
        }
        if ((i & 16) != 0) {
            list3 = messagesGetLongPollHistoryResponse.groups;
        }
        if ((i & 32) != 0) {
            list4 = messagesGetLongPollHistoryResponse.chats;
        }
        if ((i & 64) != 0) {
            num = messagesGetLongPollHistoryResponse.newPts;
        }
        if ((i & 128) != 0) {
            num2 = messagesGetLongPollHistoryResponse.fromPts;
        }
        if ((i & 256) != 0) {
            bool = messagesGetLongPollHistoryResponse.more;
        }
        if ((i & 512) != 0) {
            list5 = messagesGetLongPollHistoryResponse.conversations;
        }
        Boolean bool2 = bool;
        List list6 = list5;
        Integer num3 = num;
        Integer num4 = num2;
        List list7 = list3;
        List list8 = list4;
        return messagesGetLongPollHistoryResponse.copy(list, messagesLongpollMessages, messagesLongpollParams, list2, list7, list8, num3, num4, bool2, list6);
    }

    @Nullable
    public final List<List<Integer>> component1() {
        return this.history;
    }

    @Nullable
    public final List<MessagesConversation> component10() {
        return this.conversations;
    }

    @Nullable
    public final MessagesLongpollMessages component2() {
        return this.messages;
    }

    @Nullable
    public final MessagesLongpollParams component3() {
        return this.credentials;
    }

    @Nullable
    public final List<UsersUserFull> component4() {
        return this.profiles;
    }

    @Nullable
    public final List<GroupsGroupFull> component5() {
        return this.groups;
    }

    @Nullable
    public final List<MessagesChat> component6() {
        return this.chats;
    }

    @Nullable
    public final Integer component7() {
        return this.newPts;
    }

    @Nullable
    public final Integer component8() {
        return this.fromPts;
    }

    @Nullable
    public final Boolean component9() {
        return this.more;
    }

    @NotNull
    public final MessagesGetLongPollHistoryResponse copy(@Nullable List<? extends List<Integer>> list, @Nullable MessagesLongpollMessages messagesLongpollMessages, @Nullable MessagesLongpollParams messagesLongpollParams, @Nullable List<UsersUserFull> list2, @Nullable List<GroupsGroupFull> list3, @Nullable List<MessagesChat> list4, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable List<MessagesConversation> list5) {
        return new MessagesGetLongPollHistoryResponse(list, messagesLongpollMessages, messagesLongpollParams, list2, list3, list4, num, num2, bool, list5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetLongPollHistoryResponse)) {
            return false;
        }
        MessagesGetLongPollHistoryResponse messagesGetLongPollHistoryResponse = (MessagesGetLongPollHistoryResponse) obj;
        return Intrinsics.a(this.history, messagesGetLongPollHistoryResponse.history) && Intrinsics.a(this.messages, messagesGetLongPollHistoryResponse.messages) && Intrinsics.a(this.credentials, messagesGetLongPollHistoryResponse.credentials) && Intrinsics.a(this.profiles, messagesGetLongPollHistoryResponse.profiles) && Intrinsics.a(this.groups, messagesGetLongPollHistoryResponse.groups) && Intrinsics.a(this.chats, messagesGetLongPollHistoryResponse.chats) && Intrinsics.a(this.newPts, messagesGetLongPollHistoryResponse.newPts) && Intrinsics.a(this.fromPts, messagesGetLongPollHistoryResponse.fromPts) && Intrinsics.a(this.more, messagesGetLongPollHistoryResponse.more) && Intrinsics.a(this.conversations, messagesGetLongPollHistoryResponse.conversations);
    }

    @Nullable
    public final List<MessagesChat> getChats() {
        return this.chats;
    }

    @Nullable
    public final List<MessagesConversation> getConversations() {
        return this.conversations;
    }

    @Nullable
    public final MessagesLongpollParams getCredentials() {
        return this.credentials;
    }

    @Nullable
    public final Integer getFromPts() {
        return this.fromPts;
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @Nullable
    public final List<List<Integer>> getHistory() {
        return this.history;
    }

    @Nullable
    public final MessagesLongpollMessages getMessages() {
        return this.messages;
    }

    @Nullable
    public final Boolean getMore() {
        return this.more;
    }

    @Nullable
    public final Integer getNewPts() {
        return this.newPts;
    }

    @Nullable
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        List<List<Integer>> list = this.history;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        MessagesLongpollMessages messagesLongpollMessages = this.messages;
        int iHashCode2 = (iHashCode + (messagesLongpollMessages == null ? 0 : messagesLongpollMessages.hashCode())) * 31;
        MessagesLongpollParams messagesLongpollParams = this.credentials;
        int iHashCode3 = (iHashCode2 + (messagesLongpollParams == null ? 0 : messagesLongpollParams.hashCode())) * 31;
        List<UsersUserFull> list2 = this.profiles;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFull> list3 = this.groups;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesChat> list4 = this.chats;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num = this.newPts;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fromPts;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.more;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<MessagesConversation> list5 = this.conversations;
        return iHashCode9 + (list5 != null ? list5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<List<Integer>> list = this.history;
        MessagesLongpollMessages messagesLongpollMessages = this.messages;
        MessagesLongpollParams messagesLongpollParams = this.credentials;
        List<UsersUserFull> list2 = this.profiles;
        List<GroupsGroupFull> list3 = this.groups;
        List<MessagesChat> list4 = this.chats;
        Integer num = this.newPts;
        Integer num2 = this.fromPts;
        Boolean bool = this.more;
        List<MessagesConversation> list5 = this.conversations;
        StringBuilder sb2 = new StringBuilder("MessagesGetLongPollHistoryResponse(history=");
        sb2.append(list);
        sb2.append(", messages=");
        sb2.append(messagesLongpollMessages);
        sb2.append(", credentials=");
        sb2.append(messagesLongpollParams);
        sb2.append(", profiles=");
        sb2.append(list2);
        sb2.append(", groups=");
        a.u(sb2, list3, ", chats=", list4, ", newPts=");
        a.t(sb2, num, ", fromPts=", num2, ", more=");
        sb2.append(bool);
        sb2.append(", conversations=");
        sb2.append(list5);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesGetLongPollHistoryResponse(@Nullable List<? extends List<Integer>> list, @Nullable MessagesLongpollMessages messagesLongpollMessages, @Nullable MessagesLongpollParams messagesLongpollParams, @Nullable List<UsersUserFull> list2, @Nullable List<GroupsGroupFull> list3, @Nullable List<MessagesChat> list4, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable List<MessagesConversation> list5) {
        this.history = list;
        this.messages = messagesLongpollMessages;
        this.credentials = messagesLongpollParams;
        this.profiles = list2;
        this.groups = list3;
        this.chats = list4;
        this.newPts = num;
        this.fromPts = num2;
        this.more = bool;
        this.conversations = list5;
    }

    public /* synthetic */ MessagesGetLongPollHistoryResponse(List list, MessagesLongpollMessages messagesLongpollMessages, MessagesLongpollParams messagesLongpollParams, List list2, List list3, List list4, Integer num, Integer num2, Boolean bool, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : messagesLongpollMessages, (i & 4) != 0 ? null : messagesLongpollParams, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : list5);
    }
}
