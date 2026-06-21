package com.vk.sdk.api.board.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.polls.dto.PollsAnswer;
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
public final class BoardTopicPoll {

    @b("answer_id")
    private final int answerId;

    @b("answers")
    @NotNull
    private final List<PollsAnswer> answers;

    @b("created")
    private final int created;

    @b("is_closed")
    @Nullable
    private final BaseBoolInt isClosed;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("poll_id")
    private final int pollId;

    @b("question")
    @NotNull
    private final String question;

    @b("votes")
    private final int votes;

    public BoardTopicPoll(@NotNull UserId ownerId, int i, int i10, @NotNull String question, int i11, int i12, @NotNull List<PollsAnswer> answers, @Nullable BaseBoolInt baseBoolInt) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.ownerId = ownerId;
        this.pollId = i;
        this.created = i10;
        this.question = question;
        this.votes = i11;
        this.answerId = i12;
        this.answers = answers;
        this.isClosed = baseBoolInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoardTopicPoll copy$default(BoardTopicPoll boardTopicPoll, UserId userId, int i, int i10, String str, int i11, int i12, List list, BaseBoolInt baseBoolInt, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            userId = boardTopicPoll.ownerId;
        }
        if ((i13 & 2) != 0) {
            i = boardTopicPoll.pollId;
        }
        if ((i13 & 4) != 0) {
            i10 = boardTopicPoll.created;
        }
        if ((i13 & 8) != 0) {
            str = boardTopicPoll.question;
        }
        if ((i13 & 16) != 0) {
            i11 = boardTopicPoll.votes;
        }
        if ((i13 & 32) != 0) {
            i12 = boardTopicPoll.answerId;
        }
        if ((i13 & 64) != 0) {
            list = boardTopicPoll.answers;
        }
        if ((i13 & 128) != 0) {
            baseBoolInt = boardTopicPoll.isClosed;
        }
        List list2 = list;
        BaseBoolInt baseBoolInt2 = baseBoolInt;
        int i14 = i11;
        int i15 = i12;
        return boardTopicPoll.copy(userId, i, i10, str, i14, i15, list2, baseBoolInt2);
    }

    @NotNull
    public final UserId component1() {
        return this.ownerId;
    }

    public final int component2() {
        return this.pollId;
    }

    public final int component3() {
        return this.created;
    }

    @NotNull
    public final String component4() {
        return this.question;
    }

    public final int component5() {
        return this.votes;
    }

    public final int component6() {
        return this.answerId;
    }

    @NotNull
    public final List<PollsAnswer> component7() {
        return this.answers;
    }

    @Nullable
    public final BaseBoolInt component8() {
        return this.isClosed;
    }

    @NotNull
    public final BoardTopicPoll copy(@NotNull UserId ownerId, int i, int i10, @NotNull String question, int i11, int i12, @NotNull List<PollsAnswer> answers, @Nullable BaseBoolInt baseBoolInt) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answers, "answers");
        return new BoardTopicPoll(ownerId, i, i10, question, i11, i12, answers, baseBoolInt);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardTopicPoll)) {
            return false;
        }
        BoardTopicPoll boardTopicPoll = (BoardTopicPoll) obj;
        return Intrinsics.a(this.ownerId, boardTopicPoll.ownerId) && this.pollId == boardTopicPoll.pollId && this.created == boardTopicPoll.created && Intrinsics.a(this.question, boardTopicPoll.question) && this.votes == boardTopicPoll.votes && this.answerId == boardTopicPoll.answerId && Intrinsics.a(this.answers, boardTopicPoll.answers) && this.isClosed == boardTopicPoll.isClosed;
    }

    public final int getAnswerId() {
        return this.answerId;
    }

    @NotNull
    public final List<PollsAnswer> getAnswers() {
        return this.answers;
    }

    public final int getCreated() {
        return this.created;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    public final int getPollId() {
        return this.pollId;
    }

    @NotNull
    public final String getQuestion() {
        return this.question;
    }

    public final int getVotes() {
        return this.votes;
    }

    public int hashCode() {
        int i = u.i(this.answers, u.g(this.answerId, u.g(this.votes, a.e(u.g(this.created, u.g(this.pollId, this.ownerId.hashCode() * 31, 31), 31), 31, this.question), 31), 31), 31);
        BaseBoolInt baseBoolInt = this.isClosed;
        return i + (baseBoolInt == null ? 0 : baseBoolInt.hashCode());
    }

    @Nullable
    public final BaseBoolInt isClosed() {
        return this.isClosed;
    }

    @NotNull
    public String toString() {
        UserId userId = this.ownerId;
        int i = this.pollId;
        int i10 = this.created;
        String str = this.question;
        int i11 = this.votes;
        int i12 = this.answerId;
        List<PollsAnswer> list = this.answers;
        BaseBoolInt baseBoolInt = this.isClosed;
        StringBuilder sb2 = new StringBuilder("BoardTopicPoll(ownerId=");
        sb2.append(userId);
        sb2.append(", pollId=");
        sb2.append(i);
        sb2.append(", created=");
        a.q(i10, ", question=", str, ", votes=", sb2);
        om1.t(sb2, i11, ", answerId=", i12, ", answers=");
        sb2.append(list);
        sb2.append(", isClosed=");
        sb2.append(baseBoolInt);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ BoardTopicPoll(UserId userId, int i, int i10, String str, int i11, int i12, List list, BaseBoolInt baseBoolInt, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, i, i10, str, i11, i12, list, (i13 & 128) != 0 ? null : baseBoolInt);
    }
}
