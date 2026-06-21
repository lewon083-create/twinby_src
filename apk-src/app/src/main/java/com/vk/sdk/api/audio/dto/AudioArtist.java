package com.vk.sdk.api.audio.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseImage;
import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import com.vk.sdk.api.users.dto.UsersUser;
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
public final class AudioArtist {

    @b("bio")
    @Nullable
    private final String bio;

    @b("can_follow")
    @Nullable
    private final Boolean canFollow;

    @b("can_play")
    @Nullable
    private final Boolean canPlay;

    @b("domain")
    @Nullable
    private final String domain;

    @b("genres")
    @Nullable
    private final List<AudioGenre> genres;

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final String f15130id;

    @b("is_album_cover")
    @Nullable
    private final Boolean isAlbumCover;

    @b("is_followed")
    @Nullable
    private final Boolean isFollowed;

    @b("name")
    @NotNull
    private final String name;

    @b("pages")
    @Nullable
    private final List<Integer> pages;

    @b("photo")
    @Nullable
    private final List<BaseImage> photo;

    @b("photos")
    @Nullable
    private final List<AudioPhotosByType> photos;

    @b("profiles")
    @Nullable
    private final List<UsersUser> profiles;

    public AudioArtist(@NotNull String name, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable List<BaseImage> list, @Nullable List<AudioPhotosByType> list2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable List<AudioGenre> list3, @Nullable String str3, @Nullable List<Integer> list4, @Nullable List<UsersUser> list5, @Nullable List<GroupsGroupFull> list6) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.domain = str;
        this.f15130id = str2;
        this.isAlbumCover = bool;
        this.photo = list;
        this.photos = list2;
        this.isFollowed = bool2;
        this.canFollow = bool3;
        this.canPlay = bool4;
        this.genres = list3;
        this.bio = str3;
        this.pages = list4;
        this.profiles = list5;
        this.groups = list6;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final List<AudioGenre> component10() {
        return this.genres;
    }

    @Nullable
    public final String component11() {
        return this.bio;
    }

    @Nullable
    public final List<Integer> component12() {
        return this.pages;
    }

    @Nullable
    public final List<UsersUser> component13() {
        return this.profiles;
    }

    @Nullable
    public final List<GroupsGroupFull> component14() {
        return this.groups;
    }

    @Nullable
    public final String component2() {
        return this.domain;
    }

    @Nullable
    public final String component3() {
        return this.f15130id;
    }

    @Nullable
    public final Boolean component4() {
        return this.isAlbumCover;
    }

    @Nullable
    public final List<BaseImage> component5() {
        return this.photo;
    }

    @Nullable
    public final List<AudioPhotosByType> component6() {
        return this.photos;
    }

    @Nullable
    public final Boolean component7() {
        return this.isFollowed;
    }

    @Nullable
    public final Boolean component8() {
        return this.canFollow;
    }

    @Nullable
    public final Boolean component9() {
        return this.canPlay;
    }

    @NotNull
    public final AudioArtist copy(@NotNull String name, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable List<BaseImage> list, @Nullable List<AudioPhotosByType> list2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable List<AudioGenre> list3, @Nullable String str3, @Nullable List<Integer> list4, @Nullable List<UsersUser> list5, @Nullable List<GroupsGroupFull> list6) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new AudioArtist(name, str, str2, bool, list, list2, bool2, bool3, bool4, list3, str3, list4, list5, list6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioArtist)) {
            return false;
        }
        AudioArtist audioArtist = (AudioArtist) obj;
        return Intrinsics.a(this.name, audioArtist.name) && Intrinsics.a(this.domain, audioArtist.domain) && Intrinsics.a(this.f15130id, audioArtist.f15130id) && Intrinsics.a(this.isAlbumCover, audioArtist.isAlbumCover) && Intrinsics.a(this.photo, audioArtist.photo) && Intrinsics.a(this.photos, audioArtist.photos) && Intrinsics.a(this.isFollowed, audioArtist.isFollowed) && Intrinsics.a(this.canFollow, audioArtist.canFollow) && Intrinsics.a(this.canPlay, audioArtist.canPlay) && Intrinsics.a(this.genres, audioArtist.genres) && Intrinsics.a(this.bio, audioArtist.bio) && Intrinsics.a(this.pages, audioArtist.pages) && Intrinsics.a(this.profiles, audioArtist.profiles) && Intrinsics.a(this.groups, audioArtist.groups);
    }

    @Nullable
    public final String getBio() {
        return this.bio;
    }

    @Nullable
    public final Boolean getCanFollow() {
        return this.canFollow;
    }

    @Nullable
    public final Boolean getCanPlay() {
        return this.canPlay;
    }

    @Nullable
    public final String getDomain() {
        return this.domain;
    }

    @Nullable
    public final List<AudioGenre> getGenres() {
        return this.genres;
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @Nullable
    public final String getId() {
        return this.f15130id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<Integer> getPages() {
        return this.pages;
    }

    @Nullable
    public final List<BaseImage> getPhoto() {
        return this.photo;
    }

    @Nullable
    public final List<AudioPhotosByType> getPhotos() {
        return this.photos;
    }

    @Nullable
    public final List<UsersUser> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.domain;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15130id;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAlbumCover;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BaseImage> list = this.photo;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<AudioPhotosByType> list2 = this.photos;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.isFollowed;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canFollow;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canPlay;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<AudioGenre> list3 = this.genres;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.bio;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Integer> list4 = this.pages;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<UsersUser> list5 = this.profiles;
        int iHashCode13 = (iHashCode12 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<GroupsGroupFull> list6 = this.groups;
        return iHashCode13 + (list6 != null ? list6.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAlbumCover() {
        return this.isAlbumCover;
    }

    @Nullable
    public final Boolean isFollowed() {
        return this.isFollowed;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.domain;
        String str3 = this.f15130id;
        Boolean bool = this.isAlbumCover;
        List<BaseImage> list = this.photo;
        List<AudioPhotosByType> list2 = this.photos;
        Boolean bool2 = this.isFollowed;
        Boolean bool3 = this.canFollow;
        Boolean bool4 = this.canPlay;
        List<AudioGenre> list3 = this.genres;
        String str4 = this.bio;
        List<Integer> list4 = this.pages;
        List<UsersUser> list5 = this.profiles;
        List<GroupsGroupFull> list6 = this.groups;
        StringBuilder sbJ = z.j("AudioArtist(name=", str, ", domain=", str2, ", id=");
        sbJ.append(str3);
        sbJ.append(", isAlbumCover=");
        sbJ.append(bool);
        sbJ.append(", photo=");
        a.u(sbJ, list, ", photos=", list2, ", isFollowed=");
        u.s(sbJ, bool2, ", canFollow=", bool3, ", canPlay=");
        sbJ.append(bool4);
        sbJ.append(", genres=");
        sbJ.append(list3);
        sbJ.append(", bio=");
        sbJ.append(str4);
        sbJ.append(", pages=");
        sbJ.append(list4);
        sbJ.append(", profiles=");
        return a.l(sbJ, list5, ", groups=", list6, ")");
    }

    public /* synthetic */ AudioArtist(String str, String str2, String str3, Boolean bool, List list, List list2, Boolean bool2, Boolean bool3, Boolean bool4, List list3, String str4, List list4, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : bool3, (i & 256) != 0 ? null : bool4, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : list4, (i & 4096) != 0 ? null : list5, (i & 8192) != 0 ? null : list6);
    }
}
