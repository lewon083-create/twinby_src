package com.vk.sdk.api.board.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseLikesInfo;
import com.vk.sdk.api.wall.dto.WallCommentAttachment;
import gf.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public final class BoardTopicComment {

    @b("attachments")
    @Nullable
    private final List<WallCommentAttachment> attachments;

    @b("can_edit")
    @Nullable
    private final BaseBoolInt canEdit;

    @b("date")
    private final int date;

    @b("from_id")
    private final int fromId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15150id;

    @b("likes")
    @Nullable
    private final BaseLikesInfo likes;

    @b("real_offset")
    @Nullable
    private final Integer realOffset;

    @b("text")
    @NotNull
    private final String text;

    public BoardTopicComment(int i, int i10, int i11, @NotNull String text, @Nullable List<WallCommentAttachment> list, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseLikesInfo baseLikesInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.date = i;
        this.fromId = i10;
        this.f15150id = i11;
        this.text = text;
        this.attachments = list;
        this.realOffset = num;
        this.canEdit = baseBoolInt;
        this.likes = baseLikesInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoardTopicComment copy$default(BoardTopicComment boardTopicComment, int i, int i10, int i11, String str, List list, Integer num, BaseBoolInt baseBoolInt, BaseLikesInfo baseLikesInfo, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = boardTopicComment.date;
        }
        if ((i12 & 2) != 0) {
            i10 = boardTopicComment.fromId;
        }
        if ((i12 & 4) != 0) {
            i11 = boardTopicComment.f15150id;
        }
        if ((i12 & 8) != 0) {
            str = boardTopicComment.text;
        }
        if ((i12 & 16) != 0) {
            list = boardTopicComment.attachments;
        }
        if ((i12 & 32) != 0) {
            num = boardTopicComment.realOffset;
        }
        if ((i12 & 64) != 0) {
            baseBoolInt = boardTopicComment.canEdit;
        }
        if ((i12 & 128) != 0) {
            baseLikesInfo = boardTopicComment.likes;
        }
        BaseBoolInt baseBoolInt2 = baseBoolInt;
        BaseLikesInfo baseLikesInfo2 = baseLikesInfo;
        List list2 = list;
        Integer num2 = num;
        return boardTopicComment.copy(i, i10, i11, str, list2, num2, baseBoolInt2, baseLikesInfo2);
    }

    public final int component1() {
        return this.date;
    }

    public final int component2() {
        return this.fromId;
    }

    public final int component3() {
        return this.f15150id;
    }

    @NotNull
    public final String component4() {
        return this.text;
    }

    @Nullable
    public final List<WallCommentAttachment> component5() {
        return this.attachments;
    }

    @Nullable
    public final Integer component6() {
        return this.realOffset;
    }

    @Nullable
    public final BaseBoolInt component7() {
        return this.canEdit;
    }

    @Nullable
    public final BaseLikesInfo component8() {
        return this.likes;
    }

    @NotNull
    public final BoardTopicComment copy(int i, int i10, int i11, @NotNull String text, @Nullable List<WallCommentAttachment> list, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseLikesInfo baseLikesInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new BoardTopicComment(i, i10, i11, text, list, num, baseBoolInt, baseLikesInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardTopicComment)) {
            return false;
        }
        BoardTopicComment boardTopicComment = (BoardTopicComment) obj;
        return this.date == boardTopicComment.date && this.fromId == boardTopicComment.fromId && this.f15150id == boardTopicComment.f15150id && Intrinsics.a(this.text, boardTopicComment.text) && Intrinsics.a(this.attachments, boardTopicComment.attachments) && Intrinsics.a(this.realOffset, boardTopicComment.realOffset) && this.canEdit == boardTopicComment.canEdit && Intrinsics.a(this.likes, boardTopicComment.likes);
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

    public final int getFromId() {
        return this.fromId;
    }

    public final int getId() {
        return this.f15150id;
    }

    @Nullable
    public final BaseLikesInfo getLikes() {
        return this.likes;
    }

    @Nullable
    public final Integer getRealOffset() {
        return this.realOffset;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iE = a.e(u.g(this.f15150id, u.g(this.fromId, Integer.hashCode(this.date) * 31, 31), 31), 31, this.text);
        List<WallCommentAttachment> list = this.attachments;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.realOffset;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.canEdit;
        int iHashCode3 = (iHashCode2 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseLikesInfo baseLikesInfo = this.likes;
        return iHashCode3 + (baseLikesInfo != null ? baseLikesInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.date;
        int i10 = this.fromId;
        int i11 = this.f15150id;
        String str = this.text;
        List<WallCommentAttachment> list = this.attachments;
        Integer num = this.realOffset;
        BaseBoolInt baseBoolInt = this.canEdit;
        BaseLikesInfo baseLikesInfo = this.likes;
        StringBuilder sbI = z.i("BoardTopicComment(date=", i, ", fromId=", i10, ", id=");
        a.q(i11, ", text=", str, ", attachments=", sbI);
        sbI.append(list);
        sbI.append(", realOffset=");
        sbI.append(num);
        sbI.append(", canEdit=");
        sbI.append(baseBoolInt);
        sbI.append(", likes=");
        sbI.append(baseLikesInfo);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ BoardTopicComment(int i, int i10, int i11, String str, List list, Integer num, BaseBoolInt baseBoolInt, BaseLikesInfo baseLikesInfo, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, str, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : baseBoolInt, (i12 & 128) != 0 ? null : baseLikesInfo);
    }
}
