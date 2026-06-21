package com.vk.sdk.api.podcast.dto;

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
public final class PodcastExternalData {

    @b("cover")
    @Nullable
    private final PodcastCover cover;

    @b("owner_name")
    @Nullable
    private final String ownerName;

    @b("owner_url")
    @Nullable
    private final String ownerUrl;

    @b("title")
    @Nullable
    private final String title;

    @b("url")
    @Nullable
    private final String url;

    public PodcastExternalData() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PodcastExternalData copy$default(PodcastExternalData podcastExternalData, String str, String str2, String str3, String str4, PodcastCover podcastCover, int i, Object obj) {
        if ((i & 1) != 0) {
            str = podcastExternalData.url;
        }
        if ((i & 2) != 0) {
            str2 = podcastExternalData.ownerUrl;
        }
        if ((i & 4) != 0) {
            str3 = podcastExternalData.title;
        }
        if ((i & 8) != 0) {
            str4 = podcastExternalData.ownerName;
        }
        if ((i & 16) != 0) {
            podcastCover = podcastExternalData.cover;
        }
        PodcastCover podcastCover2 = podcastCover;
        String str5 = str3;
        return podcastExternalData.copy(str, str2, str5, str4, podcastCover2);
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @Nullable
    public final String component2() {
        return this.ownerUrl;
    }

    @Nullable
    public final String component3() {
        return this.title;
    }

    @Nullable
    public final String component4() {
        return this.ownerName;
    }

    @Nullable
    public final PodcastCover component5() {
        return this.cover;
    }

    @NotNull
    public final PodcastExternalData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable PodcastCover podcastCover) {
        return new PodcastExternalData(str, str2, str3, str4, podcastCover);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastExternalData)) {
            return false;
        }
        PodcastExternalData podcastExternalData = (PodcastExternalData) obj;
        return Intrinsics.a(this.url, podcastExternalData.url) && Intrinsics.a(this.ownerUrl, podcastExternalData.ownerUrl) && Intrinsics.a(this.title, podcastExternalData.title) && Intrinsics.a(this.ownerName, podcastExternalData.ownerName) && Intrinsics.a(this.cover, podcastExternalData.cover);
    }

    @Nullable
    public final PodcastCover getCover() {
        return this.cover;
    }

    @Nullable
    public final String getOwnerName() {
        return this.ownerName;
    }

    @Nullable
    public final String getOwnerUrl() {
        return this.ownerUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ownerUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ownerName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PodcastCover podcastCover = this.cover;
        return iHashCode4 + (podcastCover != null ? podcastCover.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.ownerUrl;
        String str3 = this.title;
        String str4 = this.ownerName;
        PodcastCover podcastCover = this.cover;
        StringBuilder sbJ = z.j("PodcastExternalData(url=", str, ", ownerUrl=", str2, ", title=");
        o.t(sbJ, str3, ", ownerName=", str4, ", cover=");
        sbJ.append(podcastCover);
        sbJ.append(")");
        return sbJ.toString();
    }

    public PodcastExternalData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable PodcastCover podcastCover) {
        this.url = str;
        this.ownerUrl = str2;
        this.title = str3;
        this.ownerName = str4;
        this.cover = podcastCover;
    }

    public /* synthetic */ PodcastExternalData(String str, String str2, String str3, String str4, PodcastCover podcastCover, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : podcastCover);
    }
}
