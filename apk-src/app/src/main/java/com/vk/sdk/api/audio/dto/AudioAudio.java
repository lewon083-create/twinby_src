package com.vk.sdk.api.audio.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import gf.a;
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
public final class AudioAudio {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("album_id")
    @Nullable
    private final Integer albumId;

    @b("artist")
    @NotNull
    private final String artist;

    @b("date")
    @Nullable
    private final Integer date;

    @b("duration")
    private final int duration;

    @b("genre_id")
    @Nullable
    private final Integer genreId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15131id;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("performer")
    @Nullable
    private final String performer;

    @b("title")
    @NotNull
    private final String title;

    @b("url")
    @Nullable
    private final String url;

    public AudioAudio(@NotNull String artist, int i, @NotNull UserId ownerId, @NotNull String title, int i10, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.artist = artist;
        this.f15131id = i;
        this.ownerId = ownerId;
        this.title = title;
        this.duration = i10;
        this.accessKey = str;
        this.url = str2;
        this.date = num;
        this.albumId = num2;
        this.genreId = num3;
        this.performer = str3;
    }

    public static /* synthetic */ AudioAudio copy$default(AudioAudio audioAudio, String str, int i, UserId userId, String str2, int i10, String str3, String str4, Integer num, Integer num2, Integer num3, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = audioAudio.artist;
        }
        if ((i11 & 2) != 0) {
            i = audioAudio.f15131id;
        }
        if ((i11 & 4) != 0) {
            userId = audioAudio.ownerId;
        }
        if ((i11 & 8) != 0) {
            str2 = audioAudio.title;
        }
        if ((i11 & 16) != 0) {
            i10 = audioAudio.duration;
        }
        if ((i11 & 32) != 0) {
            str3 = audioAudio.accessKey;
        }
        if ((i11 & 64) != 0) {
            str4 = audioAudio.url;
        }
        if ((i11 & 128) != 0) {
            num = audioAudio.date;
        }
        if ((i11 & 256) != 0) {
            num2 = audioAudio.albumId;
        }
        if ((i11 & 512) != 0) {
            num3 = audioAudio.genreId;
        }
        if ((i11 & 1024) != 0) {
            str5 = audioAudio.performer;
        }
        Integer num4 = num3;
        String str6 = str5;
        Integer num5 = num;
        Integer num6 = num2;
        String str7 = str3;
        String str8 = str4;
        int i12 = i10;
        UserId userId2 = userId;
        return audioAudio.copy(str, i, userId2, str2, i12, str7, str8, num5, num6, num4, str6);
    }

    @NotNull
    public final String component1() {
        return this.artist;
    }

    @Nullable
    public final Integer component10() {
        return this.genreId;
    }

    @Nullable
    public final String component11() {
        return this.performer;
    }

    public final int component2() {
        return this.f15131id;
    }

    @NotNull
    public final UserId component3() {
        return this.ownerId;
    }

    @NotNull
    public final String component4() {
        return this.title;
    }

    public final int component5() {
        return this.duration;
    }

    @Nullable
    public final String component6() {
        return this.accessKey;
    }

    @Nullable
    public final String component7() {
        return this.url;
    }

    @Nullable
    public final Integer component8() {
        return this.date;
    }

    @Nullable
    public final Integer component9() {
        return this.albumId;
    }

    @NotNull
    public final AudioAudio copy(@NotNull String artist, int i, @NotNull UserId ownerId, @NotNull String title, int i10, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new AudioAudio(artist, i, ownerId, title, i10, str, str2, num, num2, num3, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAudio)) {
            return false;
        }
        AudioAudio audioAudio = (AudioAudio) obj;
        return Intrinsics.a(this.artist, audioAudio.artist) && this.f15131id == audioAudio.f15131id && Intrinsics.a(this.ownerId, audioAudio.ownerId) && Intrinsics.a(this.title, audioAudio.title) && this.duration == audioAudio.duration && Intrinsics.a(this.accessKey, audioAudio.accessKey) && Intrinsics.a(this.url, audioAudio.url) && Intrinsics.a(this.date, audioAudio.date) && Intrinsics.a(this.albumId, audioAudio.albumId) && Intrinsics.a(this.genreId, audioAudio.genreId) && Intrinsics.a(this.performer, audioAudio.performer);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public final Integer getAlbumId() {
        return this.albumId;
    }

    @NotNull
    public final String getArtist() {
        return this.artist;
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final Integer getGenreId() {
        return this.genreId;
    }

    public final int getId() {
        return this.f15131id;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getPerformer() {
        return this.performer;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iG = u.g(this.duration, a.e(o.e(this.ownerId, u.g(this.f15131id, this.artist.hashCode() * 31, 31), 31), 31, this.title), 31);
        String str = this.accessKey;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.date;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.albumId;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.genreId;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.performer;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.artist;
        int i = this.f15131id;
        UserId userId = this.ownerId;
        String str2 = this.title;
        int i10 = this.duration;
        String str3 = this.accessKey;
        String str4 = this.url;
        Integer num = this.date;
        Integer num2 = this.albumId;
        Integer num3 = this.genreId;
        String str5 = this.performer;
        StringBuilder sb2 = new StringBuilder("AudioAudio(artist=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(i);
        sb2.append(", ownerId=");
        sb2.append(userId);
        sb2.append(", title=");
        sb2.append(str2);
        sb2.append(", duration=");
        a.q(i10, ", accessKey=", str3, ", url=", sb2);
        a.r(num, str4, ", date=", ", albumId=", sb2);
        a.t(sb2, num2, ", genreId=", num3, ", performer=");
        return u.o(sb2, str5, ")");
    }

    public /* synthetic */ AudioAudio(String str, int i, UserId userId, String str2, int i10, String str3, String str4, Integer num, Integer num2, Integer num3, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, userId, str2, i10, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : num, (i11 & 256) != 0 ? null : num2, (i11 & 512) != 0 ? null : num3, (i11 & 1024) != 0 ? null : str5);
    }
}
