package com.vk.sdk.api.polls.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import gf.a;
import io.appmetrica.analytics.impl.A2;
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
public final class PollsPoll {

    @b("anonymous")
    @Nullable
    private final Boolean anonymous;

    @b("answer_id")
    @Nullable
    private final Integer answerId;

    @b("answer_ids")
    @Nullable
    private final List<Integer> answerIds;

    @b("answers")
    @NotNull
    private final List<PollsAnswer> answers;

    @b("author_id")
    @Nullable
    private final Integer authorId;

    @b(A2.f22054g)
    @Nullable
    private final PollsBackground background;

    @b("can_edit")
    private final boolean canEdit;

    @b("can_report")
    private final boolean canReport;

    @b("can_share")
    private final boolean canShare;

    @b("can_vote")
    private final boolean canVote;

    @b("closed")
    private final boolean closed;

    @b("created")
    private final int created;

    @b("disable_unvote")
    private final boolean disableUnvote;

    @b("embed_hash")
    @Nullable
    private final String embedHash;

    @b("end_date")
    private final int endDate;

    @b("friends")
    @Nullable
    private final List<PollsFriend> friends;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15230id;

    @b("is_board")
    private final boolean isBoard;

    @b("multiple")
    private final boolean multiple;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("photo")
    @Nullable
    private final PollsBackground photo;

    @b("question")
    @NotNull
    private final String question;

    @b("votes")
    private final int votes;

    public PollsPoll(boolean z5, int i, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull List<PollsAnswer> answers, int i10, int i11, @NotNull UserId ownerId, @NotNull String question, int i12, boolean z16, @Nullable Boolean bool, @Nullable List<PollsFriend> list, @Nullable Integer num, @Nullable List<Integer> list2, @Nullable String str, @Nullable PollsBackground pollsBackground, @Nullable Integer num2, @Nullable PollsBackground pollsBackground2) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(question, "question");
        this.multiple = z5;
        this.endDate = i;
        this.closed = z10;
        this.isBoard = z11;
        this.canEdit = z12;
        this.canVote = z13;
        this.canReport = z14;
        this.canShare = z15;
        this.answers = answers;
        this.created = i10;
        this.f15230id = i11;
        this.ownerId = ownerId;
        this.question = question;
        this.votes = i12;
        this.disableUnvote = z16;
        this.anonymous = bool;
        this.friends = list;
        this.answerId = num;
        this.answerIds = list2;
        this.embedHash = str;
        this.photo = pollsBackground;
        this.authorId = num2;
        this.background = pollsBackground2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollsPoll copy$default(PollsPoll pollsPoll, boolean z5, int i, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List list, int i10, int i11, UserId userId, String str, int i12, boolean z16, Boolean bool, List list2, Integer num, List list3, String str2, PollsBackground pollsBackground, Integer num2, PollsBackground pollsBackground2, int i13, Object obj) {
        PollsBackground pollsBackground3;
        Integer num3;
        boolean z17 = (i13 & 1) != 0 ? pollsPoll.multiple : z5;
        int i14 = (i13 & 2) != 0 ? pollsPoll.endDate : i;
        boolean z18 = (i13 & 4) != 0 ? pollsPoll.closed : z10;
        boolean z19 = (i13 & 8) != 0 ? pollsPoll.isBoard : z11;
        boolean z20 = (i13 & 16) != 0 ? pollsPoll.canEdit : z12;
        boolean z21 = (i13 & 32) != 0 ? pollsPoll.canVote : z13;
        boolean z22 = (i13 & 64) != 0 ? pollsPoll.canReport : z14;
        boolean z23 = (i13 & 128) != 0 ? pollsPoll.canShare : z15;
        List list4 = (i13 & 256) != 0 ? pollsPoll.answers : list;
        int i15 = (i13 & 512) != 0 ? pollsPoll.created : i10;
        int i16 = (i13 & 1024) != 0 ? pollsPoll.f15230id : i11;
        UserId userId2 = (i13 & 2048) != 0 ? pollsPoll.ownerId : userId;
        String str3 = (i13 & 4096) != 0 ? pollsPoll.question : str;
        int i17 = (i13 & 8192) != 0 ? pollsPoll.votes : i12;
        boolean z24 = z17;
        boolean z25 = (i13 & 16384) != 0 ? pollsPoll.disableUnvote : z16;
        Boolean bool2 = (i13 & 32768) != 0 ? pollsPoll.anonymous : bool;
        List list5 = (i13 & 65536) != 0 ? pollsPoll.friends : list2;
        Integer num4 = (i13 & 131072) != 0 ? pollsPoll.answerId : num;
        List list6 = (i13 & 262144) != 0 ? pollsPoll.answerIds : list3;
        String str4 = (i13 & 524288) != 0 ? pollsPoll.embedHash : str2;
        PollsBackground pollsBackground4 = (i13 & 1048576) != 0 ? pollsPoll.photo : pollsBackground;
        Integer num5 = (i13 & 2097152) != 0 ? pollsPoll.authorId : num2;
        if ((i13 & 4194304) != 0) {
            num3 = num5;
            pollsBackground3 = pollsPoll.background;
        } else {
            pollsBackground3 = pollsBackground2;
            num3 = num5;
        }
        return pollsPoll.copy(z24, i14, z18, z19, z20, z21, z22, z23, list4, i15, i16, userId2, str3, i17, z25, bool2, list5, num4, list6, str4, pollsBackground4, num3, pollsBackground3);
    }

    public final boolean component1() {
        return this.multiple;
    }

    public final int component10() {
        return this.created;
    }

    public final int component11() {
        return this.f15230id;
    }

    @NotNull
    public final UserId component12() {
        return this.ownerId;
    }

    @NotNull
    public final String component13() {
        return this.question;
    }

    public final int component14() {
        return this.votes;
    }

    public final boolean component15() {
        return this.disableUnvote;
    }

    @Nullable
    public final Boolean component16() {
        return this.anonymous;
    }

    @Nullable
    public final List<PollsFriend> component17() {
        return this.friends;
    }

    @Nullable
    public final Integer component18() {
        return this.answerId;
    }

    @Nullable
    public final List<Integer> component19() {
        return this.answerIds;
    }

    public final int component2() {
        return this.endDate;
    }

    @Nullable
    public final String component20() {
        return this.embedHash;
    }

    @Nullable
    public final PollsBackground component21() {
        return this.photo;
    }

    @Nullable
    public final Integer component22() {
        return this.authorId;
    }

    @Nullable
    public final PollsBackground component23() {
        return this.background;
    }

    public final boolean component3() {
        return this.closed;
    }

    public final boolean component4() {
        return this.isBoard;
    }

    public final boolean component5() {
        return this.canEdit;
    }

    public final boolean component6() {
        return this.canVote;
    }

    public final boolean component7() {
        return this.canReport;
    }

    public final boolean component8() {
        return this.canShare;
    }

    @NotNull
    public final List<PollsAnswer> component9() {
        return this.answers;
    }

    @NotNull
    public final PollsPoll copy(boolean z5, int i, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull List<PollsAnswer> answers, int i10, int i11, @NotNull UserId ownerId, @NotNull String question, int i12, boolean z16, @Nullable Boolean bool, @Nullable List<PollsFriend> list, @Nullable Integer num, @Nullable List<Integer> list2, @Nullable String str, @Nullable PollsBackground pollsBackground, @Nullable Integer num2, @Nullable PollsBackground pollsBackground2) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(question, "question");
        return new PollsPoll(z5, i, z10, z11, z12, z13, z14, z15, answers, i10, i11, ownerId, question, i12, z16, bool, list, num, list2, str, pollsBackground, num2, pollsBackground2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsPoll)) {
            return false;
        }
        PollsPoll pollsPoll = (PollsPoll) obj;
        return this.multiple == pollsPoll.multiple && this.endDate == pollsPoll.endDate && this.closed == pollsPoll.closed && this.isBoard == pollsPoll.isBoard && this.canEdit == pollsPoll.canEdit && this.canVote == pollsPoll.canVote && this.canReport == pollsPoll.canReport && this.canShare == pollsPoll.canShare && Intrinsics.a(this.answers, pollsPoll.answers) && this.created == pollsPoll.created && this.f15230id == pollsPoll.f15230id && Intrinsics.a(this.ownerId, pollsPoll.ownerId) && Intrinsics.a(this.question, pollsPoll.question) && this.votes == pollsPoll.votes && this.disableUnvote == pollsPoll.disableUnvote && Intrinsics.a(this.anonymous, pollsPoll.anonymous) && Intrinsics.a(this.friends, pollsPoll.friends) && Intrinsics.a(this.answerId, pollsPoll.answerId) && Intrinsics.a(this.answerIds, pollsPoll.answerIds) && Intrinsics.a(this.embedHash, pollsPoll.embedHash) && Intrinsics.a(this.photo, pollsPoll.photo) && Intrinsics.a(this.authorId, pollsPoll.authorId) && Intrinsics.a(this.background, pollsPoll.background);
    }

    @Nullable
    public final Boolean getAnonymous() {
        return this.anonymous;
    }

    @Nullable
    public final Integer getAnswerId() {
        return this.answerId;
    }

    @Nullable
    public final List<Integer> getAnswerIds() {
        return this.answerIds;
    }

    @NotNull
    public final List<PollsAnswer> getAnswers() {
        return this.answers;
    }

    @Nullable
    public final Integer getAuthorId() {
        return this.authorId;
    }

    @Nullable
    public final PollsBackground getBackground() {
        return this.background;
    }

    public final boolean getCanEdit() {
        return this.canEdit;
    }

    public final boolean getCanReport() {
        return this.canReport;
    }

    public final boolean getCanShare() {
        return this.canShare;
    }

    public final boolean getCanVote() {
        return this.canVote;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCreated() {
        return this.created;
    }

    public final boolean getDisableUnvote() {
        return this.disableUnvote;
    }

    @Nullable
    public final String getEmbedHash() {
        return this.embedHash;
    }

    public final int getEndDate() {
        return this.endDate;
    }

    @Nullable
    public final List<PollsFriend> getFriends() {
        return this.friends;
    }

    public final int getId() {
        return this.f15230id;
    }

    public final boolean getMultiple() {
        return this.multiple;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final PollsBackground getPhoto() {
        return this.photo;
    }

    @NotNull
    public final String getQuestion() {
        return this.question;
    }

    public final int getVotes() {
        return this.votes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    public int hashCode() {
        boolean z5 = this.multiple;
        ?? r02 = z5;
        if (z5) {
            r02 = 1;
        }
        int iG = u.g(this.endDate, r02 * 31, 31);
        boolean z10 = this.closed;
        ?? r32 = z10;
        if (z10) {
            r32 = 1;
        }
        int i = (iG + r32) * 31;
        boolean z11 = this.isBoard;
        ?? r33 = z11;
        if (z11) {
            r33 = 1;
        }
        int i10 = (i + r33) * 31;
        boolean z12 = this.canEdit;
        ?? r34 = z12;
        if (z12) {
            r34 = 1;
        }
        int i11 = (i10 + r34) * 31;
        boolean z13 = this.canVote;
        ?? r35 = z13;
        if (z13) {
            r35 = 1;
        }
        int i12 = (i11 + r35) * 31;
        boolean z14 = this.canReport;
        ?? r36 = z14;
        if (z14) {
            r36 = 1;
        }
        int i13 = (i12 + r36) * 31;
        boolean z15 = this.canShare;
        ?? r37 = z15;
        if (z15) {
            r37 = 1;
        }
        int iG2 = u.g(this.votes, a.e(o.e(this.ownerId, u.g(this.f15230id, u.g(this.created, u.i(this.answers, (i13 + r37) * 31, 31), 31), 31), 31), 31, this.question), 31);
        boolean z16 = this.disableUnvote;
        int i14 = (iG2 + (z16 ? 1 : z16)) * 31;
        Boolean bool = this.anonymous;
        int iHashCode = (i14 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<PollsFriend> list = this.friends;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.answerId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list2 = this.answerIds;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.embedHash;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        PollsBackground pollsBackground = this.photo;
        int iHashCode6 = (iHashCode5 + (pollsBackground == null ? 0 : pollsBackground.hashCode())) * 31;
        Integer num2 = this.authorId;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        PollsBackground pollsBackground2 = this.background;
        return iHashCode7 + (pollsBackground2 != null ? pollsBackground2.hashCode() : 0);
    }

    public final boolean isBoard() {
        return this.isBoard;
    }

    @NotNull
    public String toString() {
        boolean z5 = this.multiple;
        int i = this.endDate;
        boolean z10 = this.closed;
        boolean z11 = this.isBoard;
        boolean z12 = this.canEdit;
        boolean z13 = this.canVote;
        boolean z14 = this.canReport;
        boolean z15 = this.canShare;
        List<PollsAnswer> list = this.answers;
        int i10 = this.created;
        int i11 = this.f15230id;
        UserId userId = this.ownerId;
        String str = this.question;
        int i12 = this.votes;
        boolean z16 = this.disableUnvote;
        Boolean bool = this.anonymous;
        List<PollsFriend> list2 = this.friends;
        Integer num = this.answerId;
        List<Integer> list3 = this.answerIds;
        String str2 = this.embedHash;
        PollsBackground pollsBackground = this.photo;
        Integer num2 = this.authorId;
        PollsBackground pollsBackground2 = this.background;
        StringBuilder sb2 = new StringBuilder("PollsPoll(multiple=");
        sb2.append(z5);
        sb2.append(", endDate=");
        sb2.append(i);
        sb2.append(", closed=");
        sb2.append(z10);
        sb2.append(", isBoard=");
        sb2.append(z11);
        sb2.append(", canEdit=");
        sb2.append(z12);
        sb2.append(", canVote=");
        sb2.append(z13);
        sb2.append(", canReport=");
        sb2.append(z14);
        sb2.append(", canShare=");
        sb2.append(z15);
        sb2.append(", answers=");
        sb2.append(list);
        sb2.append(", created=");
        sb2.append(i10);
        sb2.append(", id=");
        sb2.append(i11);
        sb2.append(", ownerId=");
        sb2.append(userId);
        sb2.append(", question=");
        o.p(i12, str, ", votes=", ", disableUnvote=", sb2);
        sb2.append(z16);
        sb2.append(", anonymous=");
        sb2.append(bool);
        sb2.append(", friends=");
        sb2.append(list2);
        sb2.append(", answerId=");
        sb2.append(num);
        sb2.append(", answerIds=");
        sb2.append(list3);
        sb2.append(", embedHash=");
        sb2.append(str2);
        sb2.append(", photo=");
        sb2.append(pollsBackground);
        sb2.append(", authorId=");
        sb2.append(num2);
        sb2.append(", background=");
        sb2.append(pollsBackground2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ PollsPoll(boolean z5, int i, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List list, int i10, int i11, UserId userId, String str, int i12, boolean z16, Boolean bool, List list2, Integer num, List list3, String str2, PollsBackground pollsBackground, Integer num2, PollsBackground pollsBackground2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5, i, z10, z11, z12, z13, z14, z15, list, i10, i11, userId, str, i12, z16, (i13 & 32768) != 0 ? null : bool, (i13 & 65536) != 0 ? null : list2, (i13 & 131072) != 0 ? null : num, (i13 & 262144) != 0 ? null : list3, (i13 & 524288) != 0 ? null : str2, (i13 & 1048576) != 0 ? null : pollsBackground, (i13 & 2097152) != 0 ? null : num2, (i13 & 4194304) != 0 ? null : pollsBackground2);
    }
}
