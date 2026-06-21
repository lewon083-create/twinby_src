package com.vk.sdk.api.newsfeed.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseLikesInfo;
import com.vk.sdk.api.base.dto.BaseRepostsInfo;
import com.vk.sdk.api.wall.dto.WallGeo;
import com.vk.sdk.api.wall.dto.WallPostCopyright;
import com.vk.sdk.api.wall.dto.WallPostSource;
import com.vk.sdk.api.wall.dto.WallPostType;
import com.vk.sdk.api.wall.dto.WallViews;
import com.vk.sdk.api.wall.dto.WallWallpostAttachment;
import gf.a;
import io.sentry.protocol.User;
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
public final class NewsfeedItemDigestItem {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("attachments")
    @Nullable
    private final List<WallWallpostAttachment> attachments;

    @b("copyright")
    @Nullable
    private final WallPostCopyright copyright;

    @b("date")
    @Nullable
    private final Integer date;

    @b("edited")
    @Nullable
    private final Integer edited;

    @b("from_id")
    @Nullable
    private final UserId fromId;

    @b(User.JsonKeys.GEO)
    @Nullable
    private final WallGeo geo;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15199id;

    @b("is_archived")
    @Nullable
    private final Boolean isArchived;

    @b("is_deleted")
    @Nullable
    private final Boolean isDeleted;

    @b("is_favorite")
    @Nullable
    private final Boolean isFavorite;

    @b("likes")
    @Nullable
    private final BaseLikesInfo likes;

    @b("owner_id")
    @Nullable
    private final UserId ownerId;

    @b("parents_stack")
    @Nullable
    private final List<Integer> parentsStack;

    @b("post_id")
    @Nullable
    private final Integer postId;

    @b("post_source")
    @Nullable
    private final WallPostSource postSource;

    @b("post_type")
    @Nullable
    private final WallPostType postType;

    @b("reposts")
    @Nullable
    private final BaseRepostsInfo reposts;

    @b("signer_id")
    @Nullable
    private final UserId signerId;

    @b("text")
    @Nullable
    private final String text;

    @b("views")
    @Nullable
    private final WallViews views;

    public NewsfeedItemDigestItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedItemDigestItem copy$default(NewsfeedItemDigestItem newsfeedItemDigestItem, String str, Boolean bool, List list, WallPostCopyright wallPostCopyright, Integer num, Integer num2, UserId userId, WallGeo wallGeo, Integer num3, Boolean bool2, Boolean bool3, BaseLikesInfo baseLikesInfo, UserId userId2, Integer num4, List list2, WallPostSource wallPostSource, WallPostType wallPostType, BaseRepostsInfo baseRepostsInfo, UserId userId3, String str2, WallViews wallViews, int i, Object obj) {
        WallViews wallViews2;
        String str3;
        String str4 = (i & 1) != 0 ? newsfeedItemDigestItem.accessKey : str;
        Boolean bool4 = (i & 2) != 0 ? newsfeedItemDigestItem.isDeleted : bool;
        List list3 = (i & 4) != 0 ? newsfeedItemDigestItem.attachments : list;
        WallPostCopyright wallPostCopyright2 = (i & 8) != 0 ? newsfeedItemDigestItem.copyright : wallPostCopyright;
        Integer num5 = (i & 16) != 0 ? newsfeedItemDigestItem.date : num;
        Integer num6 = (i & 32) != 0 ? newsfeedItemDigestItem.edited : num2;
        UserId userId4 = (i & 64) != 0 ? newsfeedItemDigestItem.fromId : userId;
        WallGeo wallGeo2 = (i & 128) != 0 ? newsfeedItemDigestItem.geo : wallGeo;
        Integer num7 = (i & 256) != 0 ? newsfeedItemDigestItem.f15199id : num3;
        Boolean bool5 = (i & 512) != 0 ? newsfeedItemDigestItem.isArchived : bool2;
        Boolean bool6 = (i & 1024) != 0 ? newsfeedItemDigestItem.isFavorite : bool3;
        BaseLikesInfo baseLikesInfo2 = (i & 2048) != 0 ? newsfeedItemDigestItem.likes : baseLikesInfo;
        UserId userId5 = (i & 4096) != 0 ? newsfeedItemDigestItem.ownerId : userId2;
        Integer num8 = (i & 8192) != 0 ? newsfeedItemDigestItem.postId : num4;
        String str5 = str4;
        List list4 = (i & 16384) != 0 ? newsfeedItemDigestItem.parentsStack : list2;
        WallPostSource wallPostSource2 = (i & 32768) != 0 ? newsfeedItemDigestItem.postSource : wallPostSource;
        WallPostType wallPostType2 = (i & 65536) != 0 ? newsfeedItemDigestItem.postType : wallPostType;
        BaseRepostsInfo baseRepostsInfo2 = (i & 131072) != 0 ? newsfeedItemDigestItem.reposts : baseRepostsInfo;
        UserId userId6 = (i & 262144) != 0 ? newsfeedItemDigestItem.signerId : userId3;
        String str6 = (i & 524288) != 0 ? newsfeedItemDigestItem.text : str2;
        if ((i & 1048576) != 0) {
            str3 = str6;
            wallViews2 = newsfeedItemDigestItem.views;
        } else {
            wallViews2 = wallViews;
            str3 = str6;
        }
        return newsfeedItemDigestItem.copy(str5, bool4, list3, wallPostCopyright2, num5, num6, userId4, wallGeo2, num7, bool5, bool6, baseLikesInfo2, userId5, num8, list4, wallPostSource2, wallPostType2, baseRepostsInfo2, userId6, str3, wallViews2);
    }

    @Nullable
    public final String component1() {
        return this.accessKey;
    }

    @Nullable
    public final Boolean component10() {
        return this.isArchived;
    }

    @Nullable
    public final Boolean component11() {
        return this.isFavorite;
    }

    @Nullable
    public final BaseLikesInfo component12() {
        return this.likes;
    }

    @Nullable
    public final UserId component13() {
        return this.ownerId;
    }

    @Nullable
    public final Integer component14() {
        return this.postId;
    }

    @Nullable
    public final List<Integer> component15() {
        return this.parentsStack;
    }

    @Nullable
    public final WallPostSource component16() {
        return this.postSource;
    }

    @Nullable
    public final WallPostType component17() {
        return this.postType;
    }

    @Nullable
    public final BaseRepostsInfo component18() {
        return this.reposts;
    }

    @Nullable
    public final UserId component19() {
        return this.signerId;
    }

    @Nullable
    public final Boolean component2() {
        return this.isDeleted;
    }

    @Nullable
    public final String component20() {
        return this.text;
    }

    @Nullable
    public final WallViews component21() {
        return this.views;
    }

    @Nullable
    public final List<WallWallpostAttachment> component3() {
        return this.attachments;
    }

    @Nullable
    public final WallPostCopyright component4() {
        return this.copyright;
    }

    @Nullable
    public final Integer component5() {
        return this.date;
    }

    @Nullable
    public final Integer component6() {
        return this.edited;
    }

    @Nullable
    public final UserId component7() {
        return this.fromId;
    }

    @Nullable
    public final WallGeo component8() {
        return this.geo;
    }

    @Nullable
    public final Integer component9() {
        return this.f15199id;
    }

    @NotNull
    public final NewsfeedItemDigestItem copy(@Nullable String str, @Nullable Boolean bool, @Nullable List<WallWallpostAttachment> list, @Nullable WallPostCopyright wallPostCopyright, @Nullable Integer num, @Nullable Integer num2, @Nullable UserId userId, @Nullable WallGeo wallGeo, @Nullable Integer num3, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable BaseLikesInfo baseLikesInfo, @Nullable UserId userId2, @Nullable Integer num4, @Nullable List<Integer> list2, @Nullable WallPostSource wallPostSource, @Nullable WallPostType wallPostType, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable UserId userId3, @Nullable String str2, @Nullable WallViews wallViews) {
        return new NewsfeedItemDigestItem(str, bool, list, wallPostCopyright, num, num2, userId, wallGeo, num3, bool2, bool3, baseLikesInfo, userId2, num4, list2, wallPostSource, wallPostType, baseRepostsInfo, userId3, str2, wallViews);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDigestItem)) {
            return false;
        }
        NewsfeedItemDigestItem newsfeedItemDigestItem = (NewsfeedItemDigestItem) obj;
        return Intrinsics.a(this.accessKey, newsfeedItemDigestItem.accessKey) && Intrinsics.a(this.isDeleted, newsfeedItemDigestItem.isDeleted) && Intrinsics.a(this.attachments, newsfeedItemDigestItem.attachments) && Intrinsics.a(this.copyright, newsfeedItemDigestItem.copyright) && Intrinsics.a(this.date, newsfeedItemDigestItem.date) && Intrinsics.a(this.edited, newsfeedItemDigestItem.edited) && Intrinsics.a(this.fromId, newsfeedItemDigestItem.fromId) && Intrinsics.a(this.geo, newsfeedItemDigestItem.geo) && Intrinsics.a(this.f15199id, newsfeedItemDigestItem.f15199id) && Intrinsics.a(this.isArchived, newsfeedItemDigestItem.isArchived) && Intrinsics.a(this.isFavorite, newsfeedItemDigestItem.isFavorite) && Intrinsics.a(this.likes, newsfeedItemDigestItem.likes) && Intrinsics.a(this.ownerId, newsfeedItemDigestItem.ownerId) && Intrinsics.a(this.postId, newsfeedItemDigestItem.postId) && Intrinsics.a(this.parentsStack, newsfeedItemDigestItem.parentsStack) && Intrinsics.a(this.postSource, newsfeedItemDigestItem.postSource) && this.postType == newsfeedItemDigestItem.postType && Intrinsics.a(this.reposts, newsfeedItemDigestItem.reposts) && Intrinsics.a(this.signerId, newsfeedItemDigestItem.signerId) && Intrinsics.a(this.text, newsfeedItemDigestItem.text) && Intrinsics.a(this.views, newsfeedItemDigestItem.views);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public final List<WallWallpostAttachment> getAttachments() {
        return this.attachments;
    }

    @Nullable
    public final WallPostCopyright getCopyright() {
        return this.copyright;
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @Nullable
    public final Integer getEdited() {
        return this.edited;
    }

    @Nullable
    public final UserId getFromId() {
        return this.fromId;
    }

    @Nullable
    public final WallGeo getGeo() {
        return this.geo;
    }

    @Nullable
    public final Integer getId() {
        return this.f15199id;
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
    public final Integer getPostId() {
        return this.postId;
    }

    @Nullable
    public final WallPostSource getPostSource() {
        return this.postSource;
    }

    @Nullable
    public final WallPostType getPostType() {
        return this.postType;
    }

    @Nullable
    public final BaseRepostsInfo getReposts() {
        return this.reposts;
    }

    @Nullable
    public final UserId getSignerId() {
        return this.signerId;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final WallViews getViews() {
        return this.views;
    }

    public int hashCode() {
        String str = this.accessKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isDeleted;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<WallWallpostAttachment> list = this.attachments;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        WallPostCopyright wallPostCopyright = this.copyright;
        int iHashCode4 = (iHashCode3 + (wallPostCopyright == null ? 0 : wallPostCopyright.hashCode())) * 31;
        Integer num = this.date;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.edited;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.fromId;
        int iHashCode7 = (iHashCode6 + (userId == null ? 0 : userId.hashCode())) * 31;
        WallGeo wallGeo = this.geo;
        int iHashCode8 = (iHashCode7 + (wallGeo == null ? 0 : wallGeo.hashCode())) * 31;
        Integer num3 = this.f15199id;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.isArchived;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isFavorite;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BaseLikesInfo baseLikesInfo = this.likes;
        int iHashCode12 = (iHashCode11 + (baseLikesInfo == null ? 0 : baseLikesInfo.hashCode())) * 31;
        UserId userId2 = this.ownerId;
        int iHashCode13 = (iHashCode12 + (userId2 == null ? 0 : userId2.hashCode())) * 31;
        Integer num4 = this.postId;
        int iHashCode14 = (iHashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<Integer> list2 = this.parentsStack;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        WallPostSource wallPostSource = this.postSource;
        int iHashCode16 = (iHashCode15 + (wallPostSource == null ? 0 : wallPostSource.hashCode())) * 31;
        WallPostType wallPostType = this.postType;
        int iHashCode17 = (iHashCode16 + (wallPostType == null ? 0 : wallPostType.hashCode())) * 31;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        int iHashCode18 = (iHashCode17 + (baseRepostsInfo == null ? 0 : baseRepostsInfo.hashCode())) * 31;
        UserId userId3 = this.signerId;
        int iHashCode19 = (iHashCode18 + (userId3 == null ? 0 : userId3.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode20 = (iHashCode19 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WallViews wallViews = this.views;
        return iHashCode20 + (wallViews != null ? wallViews.hashCode() : 0);
    }

    @Nullable
    public final Boolean isArchived() {
        return this.isArchived;
    }

    @Nullable
    public final Boolean isDeleted() {
        return this.isDeleted;
    }

    @Nullable
    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        String str = this.accessKey;
        Boolean bool = this.isDeleted;
        List<WallWallpostAttachment> list = this.attachments;
        WallPostCopyright wallPostCopyright = this.copyright;
        Integer num = this.date;
        Integer num2 = this.edited;
        UserId userId = this.fromId;
        WallGeo wallGeo = this.geo;
        Integer num3 = this.f15199id;
        Boolean bool2 = this.isArchived;
        Boolean bool3 = this.isFavorite;
        BaseLikesInfo baseLikesInfo = this.likes;
        UserId userId2 = this.ownerId;
        Integer num4 = this.postId;
        List<Integer> list2 = this.parentsStack;
        WallPostSource wallPostSource = this.postSource;
        WallPostType wallPostType = this.postType;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        UserId userId3 = this.signerId;
        String str2 = this.text;
        WallViews wallViews = this.views;
        StringBuilder sb2 = new StringBuilder("NewsfeedItemDigestItem(accessKey=");
        sb2.append(str);
        sb2.append(", isDeleted=");
        sb2.append(bool);
        sb2.append(", attachments=");
        sb2.append(list);
        sb2.append(", copyright=");
        sb2.append(wallPostCopyright);
        sb2.append(", date=");
        a.t(sb2, num, ", edited=", num2, ", fromId=");
        sb2.append(userId);
        sb2.append(", geo=");
        sb2.append(wallGeo);
        sb2.append(", id=");
        sb2.append(num3);
        sb2.append(", isArchived=");
        sb2.append(bool2);
        sb2.append(", isFavorite=");
        sb2.append(bool3);
        sb2.append(", likes=");
        sb2.append(baseLikesInfo);
        sb2.append(", ownerId=");
        sb2.append(userId2);
        sb2.append(", postId=");
        sb2.append(num4);
        sb2.append(", parentsStack=");
        sb2.append(list2);
        sb2.append(", postSource=");
        sb2.append(wallPostSource);
        sb2.append(", postType=");
        sb2.append(wallPostType);
        sb2.append(", reposts=");
        sb2.append(baseRepostsInfo);
        sb2.append(", signerId=");
        sb2.append(userId3);
        sb2.append(", text=");
        sb2.append(str2);
        sb2.append(", views=");
        sb2.append(wallViews);
        sb2.append(")");
        return sb2.toString();
    }

    public NewsfeedItemDigestItem(@Nullable String str, @Nullable Boolean bool, @Nullable List<WallWallpostAttachment> list, @Nullable WallPostCopyright wallPostCopyright, @Nullable Integer num, @Nullable Integer num2, @Nullable UserId userId, @Nullable WallGeo wallGeo, @Nullable Integer num3, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable BaseLikesInfo baseLikesInfo, @Nullable UserId userId2, @Nullable Integer num4, @Nullable List<Integer> list2, @Nullable WallPostSource wallPostSource, @Nullable WallPostType wallPostType, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable UserId userId3, @Nullable String str2, @Nullable WallViews wallViews) {
        this.accessKey = str;
        this.isDeleted = bool;
        this.attachments = list;
        this.copyright = wallPostCopyright;
        this.date = num;
        this.edited = num2;
        this.fromId = userId;
        this.geo = wallGeo;
        this.f15199id = num3;
        this.isArchived = bool2;
        this.isFavorite = bool3;
        this.likes = baseLikesInfo;
        this.ownerId = userId2;
        this.postId = num4;
        this.parentsStack = list2;
        this.postSource = wallPostSource;
        this.postType = wallPostType;
        this.reposts = baseRepostsInfo;
        this.signerId = userId3;
        this.text = str2;
        this.views = wallViews;
    }

    public /* synthetic */ NewsfeedItemDigestItem(String str, Boolean bool, List list, WallPostCopyright wallPostCopyright, Integer num, Integer num2, UserId userId, WallGeo wallGeo, Integer num3, Boolean bool2, Boolean bool3, BaseLikesInfo baseLikesInfo, UserId userId2, Integer num4, List list2, WallPostSource wallPostSource, WallPostType wallPostType, BaseRepostsInfo baseRepostsInfo, UserId userId3, String str2, WallViews wallViews, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : wallPostCopyright, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : userId, (i & 128) != 0 ? null : wallGeo, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : baseLikesInfo, (i & 4096) != 0 ? null : userId2, (i & 8192) != 0 ? null : num4, (i & 16384) != 0 ? null : list2, (i & 32768) != 0 ? null : wallPostSource, (i & 65536) != 0 ? null : wallPostType, (i & 131072) != 0 ? null : baseRepostsInfo, (i & 262144) != 0 ? null : userId3, (i & 524288) != 0 ? null : str2, (i & 1048576) != 0 ? null : wallViews);
    }
}
