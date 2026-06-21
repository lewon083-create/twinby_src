package com.vk.sdk.api.wall.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseLikesInfo;
import com.vk.sdk.api.comment.dto.CommentThread;
import gf.a;
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
public final class WallWallComment {

    @b("attachments")
    @Nullable
    private final List<WallCommentAttachment> attachments;

    @b("can_edit")
    @Nullable
    private final BaseBoolInt canEdit;

    @b("date")
    private final int date;

    @b("deleted")
    @Nullable
    private final Boolean deleted;

    @b("donut")
    @Nullable
    private final WallWallCommentDonut donut;

    @b("from_id")
    @NotNull
    private final UserId fromId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15259id;

    @b("likes")
    @Nullable
    private final BaseLikesInfo likes;

    @b("owner_id")
    @Nullable
    private final UserId ownerId;

    @b("parents_stack")
    @Nullable
    private final List<Integer> parentsStack;

    @b("photo_id")
    @Nullable
    private final Integer photoId;

    @b("pid")
    @Nullable
    private final Integer pid;

    @b("post_id")
    @Nullable
    private final Integer postId;

    @b("real_offset")
    @Nullable
    private final Integer realOffset;

    @b("reply_to_comment")
    @Nullable
    private final Integer replyToComment;

    @b("reply_to_user")
    @Nullable
    private final UserId replyToUser;

    @b("text")
    @NotNull
    private final String text;

    @b("thread")
    @Nullable
    private final CommentThread thread;

    @b("video_id")
    @Nullable
    private final Integer videoId;

    public WallWallComment(int i, @NotNull UserId fromId, int i10, @NotNull String text, @Nullable BaseBoolInt baseBoolInt, @Nullable Integer num, @Nullable UserId userId, @Nullable List<Integer> list, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<WallCommentAttachment> list2, @Nullable WallWallCommentDonut wallWallCommentDonut, @Nullable BaseLikesInfo baseLikesInfo, @Nullable Integer num4, @Nullable UserId userId2, @Nullable Integer num5, @Nullable CommentThread commentThread, @Nullable Boolean bool, @Nullable Integer num6) {
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f15259id = i;
        this.fromId = fromId;
        this.date = i10;
        this.text = text;
        this.canEdit = baseBoolInt;
        this.postId = num;
        this.ownerId = userId;
        this.parentsStack = list;
        this.photoId = num2;
        this.videoId = num3;
        this.attachments = list2;
        this.donut = wallWallCommentDonut;
        this.likes = baseLikesInfo;
        this.realOffset = num4;
        this.replyToUser = userId2;
        this.replyToComment = num5;
        this.thread = commentThread;
        this.deleted = bool;
        this.pid = num6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WallWallComment copy$default(WallWallComment wallWallComment, int i, UserId userId, int i10, String str, BaseBoolInt baseBoolInt, Integer num, UserId userId2, List list, Integer num2, Integer num3, List list2, WallWallCommentDonut wallWallCommentDonut, BaseLikesInfo baseLikesInfo, Integer num4, UserId userId3, Integer num5, CommentThread commentThread, Boolean bool, Integer num6, int i11, Object obj) {
        Integer num7;
        Boolean bool2;
        int i12 = (i11 & 1) != 0 ? wallWallComment.f15259id : i;
        UserId userId4 = (i11 & 2) != 0 ? wallWallComment.fromId : userId;
        int i13 = (i11 & 4) != 0 ? wallWallComment.date : i10;
        String str2 = (i11 & 8) != 0 ? wallWallComment.text : str;
        BaseBoolInt baseBoolInt2 = (i11 & 16) != 0 ? wallWallComment.canEdit : baseBoolInt;
        Integer num8 = (i11 & 32) != 0 ? wallWallComment.postId : num;
        UserId userId5 = (i11 & 64) != 0 ? wallWallComment.ownerId : userId2;
        List list3 = (i11 & 128) != 0 ? wallWallComment.parentsStack : list;
        Integer num9 = (i11 & 256) != 0 ? wallWallComment.photoId : num2;
        Integer num10 = (i11 & 512) != 0 ? wallWallComment.videoId : num3;
        List list4 = (i11 & 1024) != 0 ? wallWallComment.attachments : list2;
        WallWallCommentDonut wallWallCommentDonut2 = (i11 & 2048) != 0 ? wallWallComment.donut : wallWallCommentDonut;
        BaseLikesInfo baseLikesInfo2 = (i11 & 4096) != 0 ? wallWallComment.likes : baseLikesInfo;
        Integer num11 = (i11 & 8192) != 0 ? wallWallComment.realOffset : num4;
        int i14 = i12;
        UserId userId6 = (i11 & 16384) != 0 ? wallWallComment.replyToUser : userId3;
        Integer num12 = (i11 & 32768) != 0 ? wallWallComment.replyToComment : num5;
        CommentThread commentThread2 = (i11 & 65536) != 0 ? wallWallComment.thread : commentThread;
        Boolean bool3 = (i11 & 131072) != 0 ? wallWallComment.deleted : bool;
        if ((i11 & 262144) != 0) {
            bool2 = bool3;
            num7 = wallWallComment.pid;
        } else {
            num7 = num6;
            bool2 = bool3;
        }
        return wallWallComment.copy(i14, userId4, i13, str2, baseBoolInt2, num8, userId5, list3, num9, num10, list4, wallWallCommentDonut2, baseLikesInfo2, num11, userId6, num12, commentThread2, bool2, num7);
    }

    public final int component1() {
        return this.f15259id;
    }

    @Nullable
    public final Integer component10() {
        return this.videoId;
    }

    @Nullable
    public final List<WallCommentAttachment> component11() {
        return this.attachments;
    }

    @Nullable
    public final WallWallCommentDonut component12() {
        return this.donut;
    }

    @Nullable
    public final BaseLikesInfo component13() {
        return this.likes;
    }

    @Nullable
    public final Integer component14() {
        return this.realOffset;
    }

    @Nullable
    public final UserId component15() {
        return this.replyToUser;
    }

    @Nullable
    public final Integer component16() {
        return this.replyToComment;
    }

    @Nullable
    public final CommentThread component17() {
        return this.thread;
    }

    @Nullable
    public final Boolean component18() {
        return this.deleted;
    }

    @Nullable
    public final Integer component19() {
        return this.pid;
    }

    @NotNull
    public final UserId component2() {
        return this.fromId;
    }

    public final int component3() {
        return this.date;
    }

    @NotNull
    public final String component4() {
        return this.text;
    }

    @Nullable
    public final BaseBoolInt component5() {
        return this.canEdit;
    }

    @Nullable
    public final Integer component6() {
        return this.postId;
    }

    @Nullable
    public final UserId component7() {
        return this.ownerId;
    }

    @Nullable
    public final List<Integer> component8() {
        return this.parentsStack;
    }

    @Nullable
    public final Integer component9() {
        return this.photoId;
    }

    @NotNull
    public final WallWallComment copy(int i, @NotNull UserId fromId, int i10, @NotNull String text, @Nullable BaseBoolInt baseBoolInt, @Nullable Integer num, @Nullable UserId userId, @Nullable List<Integer> list, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<WallCommentAttachment> list2, @Nullable WallWallCommentDonut wallWallCommentDonut, @Nullable BaseLikesInfo baseLikesInfo, @Nullable Integer num4, @Nullable UserId userId2, @Nullable Integer num5, @Nullable CommentThread commentThread, @Nullable Boolean bool, @Nullable Integer num6) {
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        Intrinsics.checkNotNullParameter(text, "text");
        return new WallWallComment(i, fromId, i10, text, baseBoolInt, num, userId, list, num2, num3, list2, wallWallCommentDonut, baseLikesInfo, num4, userId2, num5, commentThread, bool, num6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallComment)) {
            return false;
        }
        WallWallComment wallWallComment = (WallWallComment) obj;
        return this.f15259id == wallWallComment.f15259id && Intrinsics.a(this.fromId, wallWallComment.fromId) && this.date == wallWallComment.date && Intrinsics.a(this.text, wallWallComment.text) && this.canEdit == wallWallComment.canEdit && Intrinsics.a(this.postId, wallWallComment.postId) && Intrinsics.a(this.ownerId, wallWallComment.ownerId) && Intrinsics.a(this.parentsStack, wallWallComment.parentsStack) && Intrinsics.a(this.photoId, wallWallComment.photoId) && Intrinsics.a(this.videoId, wallWallComment.videoId) && Intrinsics.a(this.attachments, wallWallComment.attachments) && Intrinsics.a(this.donut, wallWallComment.donut) && Intrinsics.a(this.likes, wallWallComment.likes) && Intrinsics.a(this.realOffset, wallWallComment.realOffset) && Intrinsics.a(this.replyToUser, wallWallComment.replyToUser) && Intrinsics.a(this.replyToComment, wallWallComment.replyToComment) && Intrinsics.a(this.thread, wallWallComment.thread) && Intrinsics.a(this.deleted, wallWallComment.deleted) && Intrinsics.a(this.pid, wallWallComment.pid);
    }

    @Nullable
    public final List<WallCommentAttachment> getAttachments() {
        return this.attachments;
    }

    @Nullable
    public final BaseBoolInt getCanEdit() {
        return this.canEdit;
    }

    public final int getDate() {
        return this.date;
    }

    @Nullable
    public final Boolean getDeleted() {
        return this.deleted;
    }

    @Nullable
    public final WallWallCommentDonut getDonut() {
        return this.donut;
    }

    @NotNull
    public final UserId getFromId() {
        return this.fromId;
    }

    public final int getId() {
        return this.f15259id;
    }

    @Nullable
    public final BaseLikesInfo getLikes() {
        return this.likes;
    }

    @Nullable
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final List<Integer> getParentsStack() {
        return this.parentsStack;
    }

    @Nullable
    public final Integer getPhotoId() {
        return this.photoId;
    }

    @Nullable
    public final Integer getPid() {
        return this.pid;
    }

    @Nullable
    public final Integer getPostId() {
        return this.postId;
    }

    @Nullable
    public final Integer getRealOffset() {
        return this.realOffset;
    }

    @Nullable
    public final Integer getReplyToComment() {
        return this.replyToComment;
    }

    @Nullable
    public final UserId getReplyToUser() {
        return this.replyToUser;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final CommentThread getThread() {
        return this.thread;
    }

    @Nullable
    public final Integer getVideoId() {
        return this.videoId;
    }

    public int hashCode() {
        int iE = a.e(u.g(this.date, o.e(this.fromId, Integer.hashCode(this.f15259id) * 31, 31), 31), 31, this.text);
        BaseBoolInt baseBoolInt = this.canEdit;
        int iHashCode = (iE + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        Integer num = this.postId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        UserId userId = this.ownerId;
        int iHashCode3 = (iHashCode2 + (userId == null ? 0 : userId.hashCode())) * 31;
        List<Integer> list = this.parentsStack;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.photoId;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoId;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<WallCommentAttachment> list2 = this.attachments;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        WallWallCommentDonut wallWallCommentDonut = this.donut;
        int iHashCode8 = (iHashCode7 + (wallWallCommentDonut == null ? 0 : wallWallCommentDonut.hashCode())) * 31;
        BaseLikesInfo baseLikesInfo = this.likes;
        int iHashCode9 = (iHashCode8 + (baseLikesInfo == null ? 0 : baseLikesInfo.hashCode())) * 31;
        Integer num4 = this.realOffset;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        UserId userId2 = this.replyToUser;
        int iHashCode11 = (iHashCode10 + (userId2 == null ? 0 : userId2.hashCode())) * 31;
        Integer num5 = this.replyToComment;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        CommentThread commentThread = this.thread;
        int iHashCode13 = (iHashCode12 + (commentThread == null ? 0 : commentThread.hashCode())) * 31;
        Boolean bool = this.deleted;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num6 = this.pid;
        return iHashCode14 + (num6 != null ? num6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.f15259id;
        UserId userId = this.fromId;
        int i10 = this.date;
        String str = this.text;
        BaseBoolInt baseBoolInt = this.canEdit;
        Integer num = this.postId;
        UserId userId2 = this.ownerId;
        List<Integer> list = this.parentsStack;
        Integer num2 = this.photoId;
        Integer num3 = this.videoId;
        List<WallCommentAttachment> list2 = this.attachments;
        WallWallCommentDonut wallWallCommentDonut = this.donut;
        BaseLikesInfo baseLikesInfo = this.likes;
        Integer num4 = this.realOffset;
        UserId userId3 = this.replyToUser;
        Integer num5 = this.replyToComment;
        CommentThread commentThread = this.thread;
        Boolean bool = this.deleted;
        Integer num6 = this.pid;
        StringBuilder sb2 = new StringBuilder("WallWallComment(id=");
        sb2.append(i);
        sb2.append(", fromId=");
        sb2.append(userId);
        sb2.append(", date=");
        a.q(i10, ", text=", str, ", canEdit=", sb2);
        sb2.append(baseBoolInt);
        sb2.append(", postId=");
        sb2.append(num);
        sb2.append(", ownerId=");
        sb2.append(userId2);
        sb2.append(", parentsStack=");
        sb2.append(list);
        sb2.append(", photoId=");
        a.t(sb2, num2, ", videoId=", num3, ", attachments=");
        sb2.append(list2);
        sb2.append(", donut=");
        sb2.append(wallWallCommentDonut);
        sb2.append(", likes=");
        sb2.append(baseLikesInfo);
        sb2.append(", realOffset=");
        sb2.append(num4);
        sb2.append(", replyToUser=");
        sb2.append(userId3);
        sb2.append(", replyToComment=");
        sb2.append(num5);
        sb2.append(", thread=");
        sb2.append(commentThread);
        sb2.append(", deleted=");
        sb2.append(bool);
        sb2.append(", pid=");
        return u.m(sb2, num6, ")");
    }

    public /* synthetic */ WallWallComment(int i, UserId userId, int i10, String str, BaseBoolInt baseBoolInt, Integer num, UserId userId2, List list, Integer num2, Integer num3, List list2, WallWallCommentDonut wallWallCommentDonut, BaseLikesInfo baseLikesInfo, Integer num4, UserId userId3, Integer num5, CommentThread commentThread, Boolean bool, Integer num6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, i10, str, (i11 & 16) != 0 ? null : baseBoolInt, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : userId2, (i11 & 128) != 0 ? null : list, (i11 & 256) != 0 ? null : num2, (i11 & 512) != 0 ? null : num3, (i11 & 1024) != 0 ? null : list2, (i11 & 2048) != 0 ? null : wallWallCommentDonut, (i11 & 4096) != 0 ? null : baseLikesInfo, (i11 & 8192) != 0 ? null : num4, (i11 & 16384) != 0 ? null : userId3, (32768 & i11) != 0 ? null : num5, (65536 & i11) != 0 ? null : commentThread, (131072 & i11) != 0 ? null : bool, (i11 & 262144) != 0 ? null : num6);
    }
}
