package com.vk.sdk.api.utils.dto;

import gf.a;
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
public final class UtilsLastShortenedLink {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("key")
    @Nullable
    private final String key;

    @b("short_url")
    @Nullable
    private final String shortUrl;

    @b("timestamp")
    @Nullable
    private final Integer timestamp;

    @b("url")
    @Nullable
    private final String url;

    @b("views")
    @Nullable
    private final Integer views;

    public UtilsLastShortenedLink() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ UtilsLastShortenedLink copy$default(UtilsLastShortenedLink utilsLastShortenedLink, String str, String str2, String str3, Integer num, String str4, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = utilsLastShortenedLink.accessKey;
        }
        if ((i & 2) != 0) {
            str2 = utilsLastShortenedLink.key;
        }
        if ((i & 4) != 0) {
            str3 = utilsLastShortenedLink.shortUrl;
        }
        if ((i & 8) != 0) {
            num = utilsLastShortenedLink.timestamp;
        }
        if ((i & 16) != 0) {
            str4 = utilsLastShortenedLink.url;
        }
        if ((i & 32) != 0) {
            num2 = utilsLastShortenedLink.views;
        }
        String str5 = str4;
        Integer num3 = num2;
        return utilsLastShortenedLink.copy(str, str2, str3, num, str5, num3);
    }

    @Nullable
    public final String component1() {
        return this.accessKey;
    }

    @Nullable
    public final String component2() {
        return this.key;
    }

    @Nullable
    public final String component3() {
        return this.shortUrl;
    }

    @Nullable
    public final Integer component4() {
        return this.timestamp;
    }

    @Nullable
    public final String component5() {
        return this.url;
    }

    @Nullable
    public final Integer component6() {
        return this.views;
    }

    @NotNull
    public final UtilsLastShortenedLink copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable Integer num2) {
        return new UtilsLastShortenedLink(str, str2, str3, num, str4, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsLastShortenedLink)) {
            return false;
        }
        UtilsLastShortenedLink utilsLastShortenedLink = (UtilsLastShortenedLink) obj;
        return Intrinsics.a(this.accessKey, utilsLastShortenedLink.accessKey) && Intrinsics.a(this.key, utilsLastShortenedLink.key) && Intrinsics.a(this.shortUrl, utilsLastShortenedLink.shortUrl) && Intrinsics.a(this.timestamp, utilsLastShortenedLink.timestamp) && Intrinsics.a(this.url, utilsLastShortenedLink.url) && Intrinsics.a(this.views, utilsLastShortenedLink.views);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getShortUrl() {
        return this.shortUrl;
    }

    @Nullable
    public final Integer getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getViews() {
        return this.views;
    }

    public int hashCode() {
        String str = this.accessKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.timestamp;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.views;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.accessKey;
        String str2 = this.key;
        String str3 = this.shortUrl;
        Integer num = this.timestamp;
        String str4 = this.url;
        Integer num2 = this.views;
        StringBuilder sbJ = z.j("UtilsLastShortenedLink(accessKey=", str, ", key=", str2, ", shortUrl=");
        a.r(num, str3, ", timestamp=", ", url=", sbJ);
        sbJ.append(str4);
        sbJ.append(", views=");
        sbJ.append(num2);
        sbJ.append(")");
        return sbJ.toString();
    }

    public UtilsLastShortenedLink(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable Integer num2) {
        this.accessKey = str;
        this.key = str2;
        this.shortUrl = str3;
        this.timestamp = num;
        this.url = str4;
        this.views = num2;
    }

    public /* synthetic */ UtilsLastShortenedLink(String str, String str2, String str3, Integer num, String str4, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2);
    }
}
