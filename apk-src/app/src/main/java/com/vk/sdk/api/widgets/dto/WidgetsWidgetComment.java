package com.vk.sdk.api.widgets.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseLikesInfo;
import com.vk.sdk.api.base.dto.BaseRepostsInfo;
import com.vk.sdk.api.users.dto.UsersUserFull;
import com.vk.sdk.api.wall.dto.WallCommentAttachment;
import com.vk.sdk.api.wall.dto.WallPostSource;
import gf.a;
import io.sentry.SentryBaseEvent;
import io.sentry.UserFeedback;
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
public final class WidgetsWidgetComment {

    @b("attachments")
    @Nullable
    private final List<WallCommentAttachment> attachments;

    @b("can_delete")
    @Nullable
    private final BaseBoolInt canDelete;

    @b(UserFeedback.JsonKeys.COMMENTS)
    @Nullable
    private final WidgetsCommentReplies comments;

    @b("date")
    private final int date;

    @b("from_id")
    private final int fromId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15262id;

    @b("likes")
    @Nullable
    private final BaseLikesInfo likes;

    @b("media")
    @Nullable
    private final WidgetsCommentMedia media;

    @b("post_source")
    @Nullable
    private final WallPostSource postSource;

    @b("post_type")
    private final int postType;

    @b("reposts")
    @Nullable
    private final BaseRepostsInfo reposts;

    @b("text")
    @NotNull
    private final String text;

    @b("to_id")
    private final int toId;

    @b(SentryBaseEvent.JsonKeys.USER)
    @Nullable
    private final UsersUserFull user;

    public WidgetsWidgetComment(int i, int i10, int i11, int i12, @NotNull String text, int i13, @Nullable List<WallCommentAttachment> list, @Nullable BaseBoolInt baseBoolInt, @Nullable WidgetsCommentReplies widgetsCommentReplies, @Nullable BaseLikesInfo baseLikesInfo, @Nullable WidgetsCommentMedia widgetsCommentMedia, @Nullable WallPostSource wallPostSource, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable UsersUserFull usersUserFull) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.date = i;
        this.fromId = i10;
        this.f15262id = i11;
        this.postType = i12;
        this.text = text;
        this.toId = i13;
        this.attachments = list;
        this.canDelete = baseBoolInt;
        this.comments = widgetsCommentReplies;
        this.likes = baseLikesInfo;
        this.media = widgetsCommentMedia;
        this.postSource = wallPostSource;
        this.reposts = baseRepostsInfo;
        this.user = usersUserFull;
    }

    public final int component1() {
        return this.date;
    }

    @Nullable
    public final BaseLikesInfo component10() {
        return this.likes;
    }

    @Nullable
    public final WidgetsCommentMedia component11() {
        return this.media;
    }

    @Nullable
    public final WallPostSource component12() {
        return this.postSource;
    }

    @Nullable
    public final BaseRepostsInfo component13() {
        return this.reposts;
    }

    @Nullable
    public final UsersUserFull component14() {
        return this.user;
    }

    public final int component2() {
        return this.fromId;
    }

    public final int component3() {
        return this.f15262id;
    }

    public final int component4() {
        return this.postType;
    }

    @NotNull
    public final String component5() {
        return this.text;
    }

    public final int component6() {
        return this.toId;
    }

    @Nullable
    public final List<WallCommentAttachment> component7() {
        return this.attachments;
    }

    @Nullable
    public final BaseBoolInt component8() {
        return this.canDelete;
    }

    @Nullable
    public final WidgetsCommentReplies component9() {
        return this.comments;
    }

    @NotNull
    public final WidgetsWidgetComment copy(int i, int i10, int i11, int i12, @NotNull String text, int i13, @Nullable List<WallCommentAttachment> list, @Nullable BaseBoolInt baseBoolInt, @Nullable WidgetsCommentReplies widgetsCommentReplies, @Nullable BaseLikesInfo baseLikesInfo, @Nullable WidgetsCommentMedia widgetsCommentMedia, @Nullable WallPostSource wallPostSource, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable UsersUserFull usersUserFull) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new WidgetsWidgetComment(i, i10, i11, i12, text, i13, list, baseBoolInt, widgetsCommentReplies, baseLikesInfo, widgetsCommentMedia, wallPostSource, baseRepostsInfo, usersUserFull);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsWidgetComment)) {
            return false;
        }
        WidgetsWidgetComment widgetsWidgetComment = (WidgetsWidgetComment) obj;
        return this.date == widgetsWidgetComment.date && this.fromId == widgetsWidgetComment.fromId && this.f15262id == widgetsWidgetComment.f15262id && this.postType == widgetsWidgetComment.postType && Intrinsics.a(this.text, widgetsWidgetComment.text) && this.toId == widgetsWidgetComment.toId && Intrinsics.a(this.attachments, widgetsWidgetComment.attachments) && this.canDelete == widgetsWidgetComment.canDelete && Intrinsics.a(this.comments, widgetsWidgetComment.comments) && Intrinsics.a(this.likes, widgetsWidgetComment.likes) && Intrinsics.a(this.media, widgetsWidgetComment.media) && Intrinsics.a(this.postSource, widgetsWidgetComment.postSource) && Intrinsics.a(this.reposts, widgetsWidgetComment.reposts) && Intrinsics.a(this.user, widgetsWidgetComment.user);
    }

    @Nullable
    public final List<WallCommentAttachment> getAttachments() {
        return this.attachments;
    }

    @Nullable
    public final BaseBoolInt getCanDelete() {
        return this.canDelete;
    }

    @Nullable
    public final WidgetsCommentReplies getComments() {
        return this.comments;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getFromId() {
        return this.fromId;
    }

    public final int getId() {
        return this.f15262id;
    }

    @Nullable
    public final BaseLikesInfo getLikes() {
        return this.likes;
    }

    @Nullable
    public final WidgetsCommentMedia getMedia() {
        return this.media;
    }

    @Nullable
    public final WallPostSource getPostSource() {
        return this.postSource;
    }

    public final int getPostType() {
        return this.postType;
    }

    @Nullable
    public final BaseRepostsInfo getReposts() {
        return this.reposts;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final int getToId() {
        return this.toId;
    }

    @Nullable
    public final UsersUserFull getUser() {
        return this.user;
    }

    public int hashCode() {
        int iG = u.g(this.toId, a.e(u.g(this.postType, u.g(this.f15262id, u.g(this.fromId, Integer.hashCode(this.date) * 31, 31), 31), 31), 31, this.text), 31);
        List<WallCommentAttachment> list = this.attachments;
        int iHashCode = (iG + (list == null ? 0 : list.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.canDelete;
        int iHashCode2 = (iHashCode + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        WidgetsCommentReplies widgetsCommentReplies = this.comments;
        int iHashCode3 = (iHashCode2 + (widgetsCommentReplies == null ? 0 : widgetsCommentReplies.hashCode())) * 31;
        BaseLikesInfo baseLikesInfo = this.likes;
        int iHashCode4 = (iHashCode3 + (baseLikesInfo == null ? 0 : baseLikesInfo.hashCode())) * 31;
        WidgetsCommentMedia widgetsCommentMedia = this.media;
        int iHashCode5 = (iHashCode4 + (widgetsCommentMedia == null ? 0 : widgetsCommentMedia.hashCode())) * 31;
        WallPostSource wallPostSource = this.postSource;
        int iHashCode6 = (iHashCode5 + (wallPostSource == null ? 0 : wallPostSource.hashCode())) * 31;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        int iHashCode7 = (iHashCode6 + (baseRepostsInfo == null ? 0 : baseRepostsInfo.hashCode())) * 31;
        UsersUserFull usersUserFull = this.user;
        return iHashCode7 + (usersUserFull != null ? usersUserFull.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.date;
        int i10 = this.fromId;
        int i11 = this.f15262id;
        int i12 = this.postType;
        String str = this.text;
        int i13 = this.toId;
        List<WallCommentAttachment> list = this.attachments;
        BaseBoolInt baseBoolInt = this.canDelete;
        WidgetsCommentReplies widgetsCommentReplies = this.comments;
        BaseLikesInfo baseLikesInfo = this.likes;
        WidgetsCommentMedia widgetsCommentMedia = this.media;
        WallPostSource wallPostSource = this.postSource;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        UsersUserFull usersUserFull = this.user;
        StringBuilder sbI = z.i("WidgetsWidgetComment(date=", i, ", fromId=", i10, ", id=");
        om1.t(sbI, i11, ", postType=", i12, ", text=");
        o.p(i13, str, ", toId=", ", attachments=", sbI);
        sbI.append(list);
        sbI.append(", canDelete=");
        sbI.append(baseBoolInt);
        sbI.append(", comments=");
        sbI.append(widgetsCommentReplies);
        sbI.append(", likes=");
        sbI.append(baseLikesInfo);
        sbI.append(", media=");
        sbI.append(widgetsCommentMedia);
        sbI.append(", postSource=");
        sbI.append(wallPostSource);
        sbI.append(", reposts=");
        sbI.append(baseRepostsInfo);
        sbI.append(", user=");
        sbI.append(usersUserFull);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ WidgetsWidgetComment(int i, int i10, int i11, int i12, String str, int i13, List list, BaseBoolInt baseBoolInt, WidgetsCommentReplies widgetsCommentReplies, BaseLikesInfo baseLikesInfo, WidgetsCommentMedia widgetsCommentMedia, WallPostSource wallPostSource, BaseRepostsInfo baseRepostsInfo, UsersUserFull usersUserFull, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, i12, str, i13, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : baseBoolInt, (i14 & 256) != 0 ? null : widgetsCommentReplies, (i14 & 512) != 0 ? null : baseLikesInfo, (i14 & 1024) != 0 ? null : widgetsCommentMedia, (i14 & 2048) != 0 ? null : wallPostSource, (i14 & 4096) != 0 ? null : baseRepostsInfo, (i14 & 8192) != 0 ? null : usersUserFull);
    }
}
