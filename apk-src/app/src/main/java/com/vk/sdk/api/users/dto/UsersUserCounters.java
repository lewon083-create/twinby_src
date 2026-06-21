package com.vk.sdk.api.users.dto;

import com.google.android.gms.internal.ads.om1;
import gf.a;
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
public final class UsersUserCounters {

    @b("albums")
    @Nullable
    private final Integer albums;

    @b("articles")
    @Nullable
    private final Integer articles;

    @b("audios")
    @Nullable
    private final Integer audios;

    @b("badges")
    @Nullable
    private final Integer badges;

    @b("clips")
    @Nullable
    private final Integer clips;

    @b("clips_followers")
    @Nullable
    private final Integer clipsFollowers;

    @b("followers")
    @Nullable
    private final Integer followers;

    @b("friends")
    @Nullable
    private final Integer friends;

    @b("gifts")
    @Nullable
    private final Integer gifts;

    @b("groups")
    @Nullable
    private final Integer groups;

    @b("mutual_friends")
    @Nullable
    private final Integer mutualFriends;

    @b("new_photo_tags")
    @Nullable
    private final Integer newPhotoTags;

    @b("new_recognition_tags")
    @Nullable
    private final Integer newRecognitionTags;

    @b("notes")
    @Nullable
    private final Integer notes;

    @b("online_friends")
    @Nullable
    private final Integer onlineFriends;

    @b("pages")
    @Nullable
    private final Integer pages;

    @b("photos")
    @Nullable
    private final Integer photos;

    @b("podcasts")
    @Nullable
    private final Integer podcasts;

    @b("posts")
    @Nullable
    private final Integer posts;

    @b("subscriptions")
    @Nullable
    private final Integer subscriptions;

    @b("user_photos")
    @Nullable
    private final Integer userPhotos;

    @b("user_videos")
    @Nullable
    private final Integer userVideos;

    @b("videos")
    @Nullable
    private final Integer videos;

    @b("wishes")
    @Nullable
    private final Integer wishes;

    public UsersUserCounters() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    public static /* synthetic */ UsersUserCounters copy$default(UsersUserCounters usersUserCounters, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, int i, Object obj) {
        Integer num25;
        Integer num26;
        Integer num27 = (i & 1) != 0 ? usersUserCounters.albums : num;
        Integer num28 = (i & 2) != 0 ? usersUserCounters.badges : num2;
        Integer num29 = (i & 4) != 0 ? usersUserCounters.audios : num3;
        Integer num30 = (i & 8) != 0 ? usersUserCounters.followers : num4;
        Integer num31 = (i & 16) != 0 ? usersUserCounters.friends : num5;
        Integer num32 = (i & 32) != 0 ? usersUserCounters.gifts : num6;
        Integer num33 = (i & 64) != 0 ? usersUserCounters.groups : num7;
        Integer num34 = (i & 128) != 0 ? usersUserCounters.notes : num8;
        Integer num35 = (i & 256) != 0 ? usersUserCounters.onlineFriends : num9;
        Integer num36 = (i & 512) != 0 ? usersUserCounters.pages : num10;
        Integer num37 = (i & 1024) != 0 ? usersUserCounters.photos : num11;
        Integer num38 = (i & 2048) != 0 ? usersUserCounters.subscriptions : num12;
        Integer num39 = (i & 4096) != 0 ? usersUserCounters.userPhotos : num13;
        Integer num40 = (i & 8192) != 0 ? usersUserCounters.userVideos : num14;
        Integer num41 = num27;
        Integer num42 = (i & 16384) != 0 ? usersUserCounters.videos : num15;
        Integer num43 = (i & 32768) != 0 ? usersUserCounters.newPhotoTags : num16;
        Integer num44 = (i & 65536) != 0 ? usersUserCounters.newRecognitionTags : num17;
        Integer num45 = (i & 131072) != 0 ? usersUserCounters.mutualFriends : num18;
        Integer num46 = (i & 262144) != 0 ? usersUserCounters.posts : num19;
        Integer num47 = (i & 524288) != 0 ? usersUserCounters.articles : num20;
        Integer num48 = (i & 1048576) != 0 ? usersUserCounters.wishes : num21;
        Integer num49 = (i & 2097152) != 0 ? usersUserCounters.podcasts : num22;
        Integer num50 = (i & 4194304) != 0 ? usersUserCounters.clips : num23;
        if ((i & 8388608) != 0) {
            num26 = num50;
            num25 = usersUserCounters.clipsFollowers;
        } else {
            num25 = num24;
            num26 = num50;
        }
        return usersUserCounters.copy(num41, num28, num29, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39, num40, num42, num43, num44, num45, num46, num47, num48, num49, num26, num25);
    }

    @Nullable
    public final Integer component1() {
        return this.albums;
    }

    @Nullable
    public final Integer component10() {
        return this.pages;
    }

    @Nullable
    public final Integer component11() {
        return this.photos;
    }

    @Nullable
    public final Integer component12() {
        return this.subscriptions;
    }

    @Nullable
    public final Integer component13() {
        return this.userPhotos;
    }

    @Nullable
    public final Integer component14() {
        return this.userVideos;
    }

    @Nullable
    public final Integer component15() {
        return this.videos;
    }

    @Nullable
    public final Integer component16() {
        return this.newPhotoTags;
    }

    @Nullable
    public final Integer component17() {
        return this.newRecognitionTags;
    }

    @Nullable
    public final Integer component18() {
        return this.mutualFriends;
    }

    @Nullable
    public final Integer component19() {
        return this.posts;
    }

    @Nullable
    public final Integer component2() {
        return this.badges;
    }

    @Nullable
    public final Integer component20() {
        return this.articles;
    }

    @Nullable
    public final Integer component21() {
        return this.wishes;
    }

    @Nullable
    public final Integer component22() {
        return this.podcasts;
    }

    @Nullable
    public final Integer component23() {
        return this.clips;
    }

    @Nullable
    public final Integer component24() {
        return this.clipsFollowers;
    }

    @Nullable
    public final Integer component3() {
        return this.audios;
    }

    @Nullable
    public final Integer component4() {
        return this.followers;
    }

    @Nullable
    public final Integer component5() {
        return this.friends;
    }

    @Nullable
    public final Integer component6() {
        return this.gifts;
    }

    @Nullable
    public final Integer component7() {
        return this.groups;
    }

    @Nullable
    public final Integer component8() {
        return this.notes;
    }

    @Nullable
    public final Integer component9() {
        return this.onlineFriends;
    }

    @NotNull
    public final UsersUserCounters copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24) {
        return new UsersUserCounters(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, num15, num16, num17, num18, num19, num20, num21, num22, num23, num24);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserCounters)) {
            return false;
        }
        UsersUserCounters usersUserCounters = (UsersUserCounters) obj;
        return Intrinsics.a(this.albums, usersUserCounters.albums) && Intrinsics.a(this.badges, usersUserCounters.badges) && Intrinsics.a(this.audios, usersUserCounters.audios) && Intrinsics.a(this.followers, usersUserCounters.followers) && Intrinsics.a(this.friends, usersUserCounters.friends) && Intrinsics.a(this.gifts, usersUserCounters.gifts) && Intrinsics.a(this.groups, usersUserCounters.groups) && Intrinsics.a(this.notes, usersUserCounters.notes) && Intrinsics.a(this.onlineFriends, usersUserCounters.onlineFriends) && Intrinsics.a(this.pages, usersUserCounters.pages) && Intrinsics.a(this.photos, usersUserCounters.photos) && Intrinsics.a(this.subscriptions, usersUserCounters.subscriptions) && Intrinsics.a(this.userPhotos, usersUserCounters.userPhotos) && Intrinsics.a(this.userVideos, usersUserCounters.userVideos) && Intrinsics.a(this.videos, usersUserCounters.videos) && Intrinsics.a(this.newPhotoTags, usersUserCounters.newPhotoTags) && Intrinsics.a(this.newRecognitionTags, usersUserCounters.newRecognitionTags) && Intrinsics.a(this.mutualFriends, usersUserCounters.mutualFriends) && Intrinsics.a(this.posts, usersUserCounters.posts) && Intrinsics.a(this.articles, usersUserCounters.articles) && Intrinsics.a(this.wishes, usersUserCounters.wishes) && Intrinsics.a(this.podcasts, usersUserCounters.podcasts) && Intrinsics.a(this.clips, usersUserCounters.clips) && Intrinsics.a(this.clipsFollowers, usersUserCounters.clipsFollowers);
    }

    @Nullable
    public final Integer getAlbums() {
        return this.albums;
    }

    @Nullable
    public final Integer getArticles() {
        return this.articles;
    }

    @Nullable
    public final Integer getAudios() {
        return this.audios;
    }

    @Nullable
    public final Integer getBadges() {
        return this.badges;
    }

    @Nullable
    public final Integer getClips() {
        return this.clips;
    }

    @Nullable
    public final Integer getClipsFollowers() {
        return this.clipsFollowers;
    }

    @Nullable
    public final Integer getFollowers() {
        return this.followers;
    }

    @Nullable
    public final Integer getFriends() {
        return this.friends;
    }

    @Nullable
    public final Integer getGifts() {
        return this.gifts;
    }

    @Nullable
    public final Integer getGroups() {
        return this.groups;
    }

    @Nullable
    public final Integer getMutualFriends() {
        return this.mutualFriends;
    }

    @Nullable
    public final Integer getNewPhotoTags() {
        return this.newPhotoTags;
    }

    @Nullable
    public final Integer getNewRecognitionTags() {
        return this.newRecognitionTags;
    }

    @Nullable
    public final Integer getNotes() {
        return this.notes;
    }

    @Nullable
    public final Integer getOnlineFriends() {
        return this.onlineFriends;
    }

    @Nullable
    public final Integer getPages() {
        return this.pages;
    }

    @Nullable
    public final Integer getPhotos() {
        return this.photos;
    }

    @Nullable
    public final Integer getPodcasts() {
        return this.podcasts;
    }

    @Nullable
    public final Integer getPosts() {
        return this.posts;
    }

    @Nullable
    public final Integer getSubscriptions() {
        return this.subscriptions;
    }

    @Nullable
    public final Integer getUserPhotos() {
        return this.userPhotos;
    }

    @Nullable
    public final Integer getUserVideos() {
        return this.userVideos;
    }

    @Nullable
    public final Integer getVideos() {
        return this.videos;
    }

    @Nullable
    public final Integer getWishes() {
        return this.wishes;
    }

    public int hashCode() {
        Integer num = this.albums;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.badges;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.audios;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.followers;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.friends;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.gifts;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.groups;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.notes;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.onlineFriends;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.pages;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.photos;
        int iHashCode11 = (iHashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.subscriptions;
        int iHashCode12 = (iHashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.userPhotos;
        int iHashCode13 = (iHashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.userVideos;
        int iHashCode14 = (iHashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.videos;
        int iHashCode15 = (iHashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.newPhotoTags;
        int iHashCode16 = (iHashCode15 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.newRecognitionTags;
        int iHashCode17 = (iHashCode16 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.mutualFriends;
        int iHashCode18 = (iHashCode17 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.posts;
        int iHashCode19 = (iHashCode18 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.articles;
        int iHashCode20 = (iHashCode19 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.wishes;
        int iHashCode21 = (iHashCode20 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.podcasts;
        int iHashCode22 = (iHashCode21 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.clips;
        int iHashCode23 = (iHashCode22 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.clipsFollowers;
        return iHashCode23 + (num24 != null ? num24.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.albums;
        Integer num2 = this.badges;
        Integer num3 = this.audios;
        Integer num4 = this.followers;
        Integer num5 = this.friends;
        Integer num6 = this.gifts;
        Integer num7 = this.groups;
        Integer num8 = this.notes;
        Integer num9 = this.onlineFriends;
        Integer num10 = this.pages;
        Integer num11 = this.photos;
        Integer num12 = this.subscriptions;
        Integer num13 = this.userPhotos;
        Integer num14 = this.userVideos;
        Integer num15 = this.videos;
        Integer num16 = this.newPhotoTags;
        Integer num17 = this.newRecognitionTags;
        Integer num18 = this.mutualFriends;
        Integer num19 = this.posts;
        Integer num20 = this.articles;
        Integer num21 = this.wishes;
        Integer num22 = this.podcasts;
        Integer num23 = this.clips;
        Integer num24 = this.clipsFollowers;
        StringBuilder sbO = om1.o("UsersUserCounters(albums=", ", badges=", num, num2, ", audios=");
        a.t(sbO, num3, ", followers=", num4, ", friends=");
        a.t(sbO, num5, ", gifts=", num6, ", groups=");
        a.t(sbO, num7, ", notes=", num8, ", onlineFriends=");
        a.t(sbO, num9, ", pages=", num10, ", photos=");
        a.t(sbO, num11, ", subscriptions=", num12, ", userPhotos=");
        a.t(sbO, num13, ", userVideos=", num14, ", videos=");
        a.t(sbO, num15, ", newPhotoTags=", num16, ", newRecognitionTags=");
        a.t(sbO, num17, ", mutualFriends=", num18, ", posts=");
        a.t(sbO, num19, ", articles=", num20, ", wishes=");
        a.t(sbO, num21, ", podcasts=", num22, ", clips=");
        sbO.append(num23);
        sbO.append(", clipsFollowers=");
        sbO.append(num24);
        sbO.append(")");
        return sbO.toString();
    }

    public UsersUserCounters(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24) {
        this.albums = num;
        this.badges = num2;
        this.audios = num3;
        this.followers = num4;
        this.friends = num5;
        this.gifts = num6;
        this.groups = num7;
        this.notes = num8;
        this.onlineFriends = num9;
        this.pages = num10;
        this.photos = num11;
        this.subscriptions = num12;
        this.userPhotos = num13;
        this.userVideos = num14;
        this.videos = num15;
        this.newPhotoTags = num16;
        this.newRecognitionTags = num17;
        this.mutualFriends = num18;
        this.posts = num19;
        this.articles = num20;
        this.wishes = num21;
        this.podcasts = num22;
        this.clips = num23;
        this.clipsFollowers = num24;
    }

    public /* synthetic */ UsersUserCounters(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12, (i & 4096) != 0 ? null : num13, (i & 8192) != 0 ? null : num14, (i & 16384) != 0 ? null : num15, (i & 32768) != 0 ? null : num16, (i & 65536) != 0 ? null : num17, (i & 131072) != 0 ? null : num18, (i & 262144) != 0 ? null : num19, (i & 524288) != 0 ? null : num20, (i & 1048576) != 0 ? null : num21, (i & 2097152) != 0 ? null : num22, (i & 4194304) != 0 ? null : num23, (i & 8388608) != 0 ? null : num24);
    }
}
