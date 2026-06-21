package com.vk.sdk.api.wall.dto;

import com.vk.sdk.api.base.dto.BaseLink;
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
public final class WallPostSource {

    @b("data")
    @Nullable
    private final String data;

    @b("link")
    @Nullable
    private final BaseLink link;

    @b("platform")
    @Nullable
    private final String platform;

    @b("type")
    @Nullable
    private final WallPostSourceType type;

    @b("url")
    @Nullable
    private final String url;

    public WallPostSource() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WallPostSource copy$default(WallPostSource wallPostSource, String str, String str2, WallPostSourceType wallPostSourceType, String str3, BaseLink baseLink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wallPostSource.data;
        }
        if ((i & 2) != 0) {
            str2 = wallPostSource.platform;
        }
        if ((i & 4) != 0) {
            wallPostSourceType = wallPostSource.type;
        }
        if ((i & 8) != 0) {
            str3 = wallPostSource.url;
        }
        if ((i & 16) != 0) {
            baseLink = wallPostSource.link;
        }
        BaseLink baseLink2 = baseLink;
        WallPostSourceType wallPostSourceType2 = wallPostSourceType;
        return wallPostSource.copy(str, str2, wallPostSourceType2, str3, baseLink2);
    }

    @Nullable
    public final String component1() {
        return this.data;
    }

    @Nullable
    public final String component2() {
        return this.platform;
    }

    @Nullable
    public final WallPostSourceType component3() {
        return this.type;
    }

    @Nullable
    public final String component4() {
        return this.url;
    }

    @Nullable
    public final BaseLink component5() {
        return this.link;
    }

    @NotNull
    public final WallPostSource copy(@Nullable String str, @Nullable String str2, @Nullable WallPostSourceType wallPostSourceType, @Nullable String str3, @Nullable BaseLink baseLink) {
        return new WallPostSource(str, str2, wallPostSourceType, str3, baseLink);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostSource)) {
            return false;
        }
        WallPostSource wallPostSource = (WallPostSource) obj;
        return Intrinsics.a(this.data, wallPostSource.data) && Intrinsics.a(this.platform, wallPostSource.platform) && this.type == wallPostSource.type && Intrinsics.a(this.url, wallPostSource.url) && Intrinsics.a(this.link, wallPostSource.link);
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final BaseLink getLink() {
        return this.link;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final WallPostSourceType getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.data;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platform;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        WallPostSourceType wallPostSourceType = this.type;
        int iHashCode3 = (iHashCode2 + (wallPostSourceType == null ? 0 : wallPostSourceType.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BaseLink baseLink = this.link;
        return iHashCode4 + (baseLink != null ? baseLink.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.data;
        String str2 = this.platform;
        WallPostSourceType wallPostSourceType = this.type;
        String str3 = this.url;
        BaseLink baseLink = this.link;
        StringBuilder sbJ = z.j("WallPostSource(data=", str, ", platform=", str2, ", type=");
        sbJ.append(wallPostSourceType);
        sbJ.append(", url=");
        sbJ.append(str3);
        sbJ.append(", link=");
        sbJ.append(baseLink);
        sbJ.append(")");
        return sbJ.toString();
    }

    public WallPostSource(@Nullable String str, @Nullable String str2, @Nullable WallPostSourceType wallPostSourceType, @Nullable String str3, @Nullable BaseLink baseLink) {
        this.data = str;
        this.platform = str2;
        this.type = wallPostSourceType;
        this.url = str3;
        this.link = baseLink;
    }

    public /* synthetic */ WallPostSource(String str, String str2, WallPostSourceType wallPostSourceType, String str3, BaseLink baseLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : wallPostSourceType, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : baseLink);
    }
}
