package com.vk.sdk.api.groups.dto;

import a0.u;
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
public final class GroupsCountersGroup {

    @b("addresses")
    @Nullable
    private final Integer addresses;

    @b("albums")
    @Nullable
    private final Integer albums;

    @b("articles")
    @Nullable
    private final Integer articles;

    @b("audio_playlists")
    @Nullable
    private final Integer audioPlaylists;

    @b("audios")
    @Nullable
    private final Integer audios;

    @b("clips")
    @Nullable
    private final Integer clips;

    @b("clips_followers")
    @Nullable
    private final Integer clipsFollowers;

    @b("docs")
    @Nullable
    private final Integer docs;

    @b("market")
    @Nullable
    private final Integer market;

    @b("market_services")
    @Nullable
    private final Integer marketServices;

    @b("narratives")
    @Nullable
    private final Integer narratives;

    @b("photos")
    @Nullable
    private final Integer photos;

    @b("podcasts")
    @Nullable
    private final Integer podcasts;

    @b("topics")
    @Nullable
    private final Integer topics;

    @b("videos")
    @Nullable
    private final Integer videos;

    public GroupsCountersGroup() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @Nullable
    public final Integer component1() {
        return this.addresses;
    }

    @Nullable
    public final Integer component10() {
        return this.marketServices;
    }

    @Nullable
    public final Integer component11() {
        return this.podcasts;
    }

    @Nullable
    public final Integer component12() {
        return this.articles;
    }

    @Nullable
    public final Integer component13() {
        return this.narratives;
    }

    @Nullable
    public final Integer component14() {
        return this.clips;
    }

    @Nullable
    public final Integer component15() {
        return this.clipsFollowers;
    }

    @Nullable
    public final Integer component2() {
        return this.albums;
    }

    @Nullable
    public final Integer component3() {
        return this.audios;
    }

    @Nullable
    public final Integer component4() {
        return this.audioPlaylists;
    }

    @Nullable
    public final Integer component5() {
        return this.docs;
    }

    @Nullable
    public final Integer component6() {
        return this.market;
    }

    @Nullable
    public final Integer component7() {
        return this.photos;
    }

    @Nullable
    public final Integer component8() {
        return this.topics;
    }

    @Nullable
    public final Integer component9() {
        return this.videos;
    }

    @NotNull
    public final GroupsCountersGroup copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15) {
        return new GroupsCountersGroup(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, num15);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCountersGroup)) {
            return false;
        }
        GroupsCountersGroup groupsCountersGroup = (GroupsCountersGroup) obj;
        return Intrinsics.a(this.addresses, groupsCountersGroup.addresses) && Intrinsics.a(this.albums, groupsCountersGroup.albums) && Intrinsics.a(this.audios, groupsCountersGroup.audios) && Intrinsics.a(this.audioPlaylists, groupsCountersGroup.audioPlaylists) && Intrinsics.a(this.docs, groupsCountersGroup.docs) && Intrinsics.a(this.market, groupsCountersGroup.market) && Intrinsics.a(this.photos, groupsCountersGroup.photos) && Intrinsics.a(this.topics, groupsCountersGroup.topics) && Intrinsics.a(this.videos, groupsCountersGroup.videos) && Intrinsics.a(this.marketServices, groupsCountersGroup.marketServices) && Intrinsics.a(this.podcasts, groupsCountersGroup.podcasts) && Intrinsics.a(this.articles, groupsCountersGroup.articles) && Intrinsics.a(this.narratives, groupsCountersGroup.narratives) && Intrinsics.a(this.clips, groupsCountersGroup.clips) && Intrinsics.a(this.clipsFollowers, groupsCountersGroup.clipsFollowers);
    }

    @Nullable
    public final Integer getAddresses() {
        return this.addresses;
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
    public final Integer getAudioPlaylists() {
        return this.audioPlaylists;
    }

    @Nullable
    public final Integer getAudios() {
        return this.audios;
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
    public final Integer getDocs() {
        return this.docs;
    }

    @Nullable
    public final Integer getMarket() {
        return this.market;
    }

    @Nullable
    public final Integer getMarketServices() {
        return this.marketServices;
    }

    @Nullable
    public final Integer getNarratives() {
        return this.narratives;
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
    public final Integer getTopics() {
        return this.topics;
    }

    @Nullable
    public final Integer getVideos() {
        return this.videos;
    }

    public int hashCode() {
        Integer num = this.addresses;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.albums;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.audios;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.audioPlaylists;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.docs;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.market;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.photos;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.topics;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.videos;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.marketServices;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.podcasts;
        int iHashCode11 = (iHashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.articles;
        int iHashCode12 = (iHashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.narratives;
        int iHashCode13 = (iHashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.clips;
        int iHashCode14 = (iHashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.clipsFollowers;
        return iHashCode14 + (num15 != null ? num15.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.addresses;
        Integer num2 = this.albums;
        Integer num3 = this.audios;
        Integer num4 = this.audioPlaylists;
        Integer num5 = this.docs;
        Integer num6 = this.market;
        Integer num7 = this.photos;
        Integer num8 = this.topics;
        Integer num9 = this.videos;
        Integer num10 = this.marketServices;
        Integer num11 = this.podcasts;
        Integer num12 = this.articles;
        Integer num13 = this.narratives;
        Integer num14 = this.clips;
        Integer num15 = this.clipsFollowers;
        StringBuilder sbO = om1.o("GroupsCountersGroup(addresses=", ", albums=", num, num2, ", audios=");
        a.t(sbO, num3, ", audioPlaylists=", num4, ", docs=");
        a.t(sbO, num5, ", market=", num6, ", photos=");
        a.t(sbO, num7, ", topics=", num8, ", videos=");
        a.t(sbO, num9, ", marketServices=", num10, ", podcasts=");
        a.t(sbO, num11, ", articles=", num12, ", narratives=");
        a.t(sbO, num13, ", clips=", num14, ", clipsFollowers=");
        return u.m(sbO, num15, ")");
    }

    public GroupsCountersGroup(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15) {
        this.addresses = num;
        this.albums = num2;
        this.audios = num3;
        this.audioPlaylists = num4;
        this.docs = num5;
        this.market = num6;
        this.photos = num7;
        this.topics = num8;
        this.videos = num9;
        this.marketServices = num10;
        this.podcasts = num11;
        this.articles = num12;
        this.narratives = num13;
        this.clips = num14;
        this.clipsFollowers = num15;
    }

    public /* synthetic */ GroupsCountersGroup(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12, (i & 4096) != 0 ? null : num13, (i & 8192) != 0 ? null : num14, (i & 16384) != 0 ? null : num15);
    }
}
