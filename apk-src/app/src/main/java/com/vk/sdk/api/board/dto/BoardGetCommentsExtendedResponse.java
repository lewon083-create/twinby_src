package com.vk.sdk.api.board.dto;

import a0.u;
import com.vk.sdk.api.groups.dto.GroupsGroup;
import com.vk.sdk.api.users.dto.UsersUser;
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
public final class BoardGetCommentsExtendedResponse {

    @b("count")
    private final int count;

    @b("groups")
    @NotNull
    private final List<GroupsGroup> groups;

    @b("items")
    @NotNull
    private final List<BoardTopicComment> items;

    @b("poll")
    @Nullable
    private final BoardTopicPoll poll;

    @b("profiles")
    @NotNull
    private final List<UsersUser> profiles;

    public BoardGetCommentsExtendedResponse(int i, @NotNull List<BoardTopicComment> items, @NotNull List<UsersUser> profiles, @NotNull List<GroupsGroup> groups, @Nullable BoardTopicPoll boardTopicPoll) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.count = i;
        this.items = items;
        this.profiles = profiles;
        this.groups = groups;
        this.poll = boardTopicPoll;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoardGetCommentsExtendedResponse copy$default(BoardGetCommentsExtendedResponse boardGetCommentsExtendedResponse, int i, List list, List list2, List list3, BoardTopicPoll boardTopicPoll, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = boardGetCommentsExtendedResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = boardGetCommentsExtendedResponse.items;
        }
        if ((i10 & 4) != 0) {
            list2 = boardGetCommentsExtendedResponse.profiles;
        }
        if ((i10 & 8) != 0) {
            list3 = boardGetCommentsExtendedResponse.groups;
        }
        if ((i10 & 16) != 0) {
            boardTopicPoll = boardGetCommentsExtendedResponse.poll;
        }
        BoardTopicPoll boardTopicPoll2 = boardTopicPoll;
        List list4 = list2;
        return boardGetCommentsExtendedResponse.copy(i, list, list4, list3, boardTopicPoll2);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<BoardTopicComment> component2() {
        return this.items;
    }

    @NotNull
    public final List<UsersUser> component3() {
        return this.profiles;
    }

    @NotNull
    public final List<GroupsGroup> component4() {
        return this.groups;
    }

    @Nullable
    public final BoardTopicPoll component5() {
        return this.poll;
    }

    @NotNull
    public final BoardGetCommentsExtendedResponse copy(int i, @NotNull List<BoardTopicComment> items, @NotNull List<UsersUser> profiles, @NotNull List<GroupsGroup> groups, @Nullable BoardTopicPoll boardTopicPoll) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new BoardGetCommentsExtendedResponse(i, items, profiles, groups, boardTopicPoll);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardGetCommentsExtendedResponse)) {
            return false;
        }
        BoardGetCommentsExtendedResponse boardGetCommentsExtendedResponse = (BoardGetCommentsExtendedResponse) obj;
        return this.count == boardGetCommentsExtendedResponse.count && Intrinsics.a(this.items, boardGetCommentsExtendedResponse.items) && Intrinsics.a(this.profiles, boardGetCommentsExtendedResponse.profiles) && Intrinsics.a(this.groups, boardGetCommentsExtendedResponse.groups) && Intrinsics.a(this.poll, boardGetCommentsExtendedResponse.poll);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<GroupsGroup> getGroups() {
        return this.groups;
    }

    @NotNull
    public final List<BoardTopicComment> getItems() {
        return this.items;
    }

    @Nullable
    public final BoardTopicPoll getPoll() {
        return this.poll;
    }

    @NotNull
    public final List<UsersUser> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        int i = u.i(this.groups, u.i(this.profiles, u.i(this.items, Integer.hashCode(this.count) * 31, 31), 31), 31);
        BoardTopicPoll boardTopicPoll = this.poll;
        return i + (boardTopicPoll == null ? 0 : boardTopicPoll.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<BoardTopicComment> list = this.items;
        List<UsersUser> list2 = this.profiles;
        List<GroupsGroup> list3 = this.groups;
        BoardTopicPoll boardTopicPoll = this.poll;
        StringBuilder sbM = a.m(i, "BoardGetCommentsExtendedResponse(count=", ", items=", ", profiles=", list);
        a.u(sbM, list2, ", groups=", list3, ", poll=");
        sbM.append(boardTopicPoll);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ BoardGetCommentsExtendedResponse(int i, List list, List list2, List list3, BoardTopicPoll boardTopicPoll, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, list3, (i10 & 16) != 0 ? null : boardTopicPoll);
    }
}
