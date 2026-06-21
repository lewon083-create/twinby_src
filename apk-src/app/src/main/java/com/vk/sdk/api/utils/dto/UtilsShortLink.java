package com.vk.sdk.api.utils.dto;

import com.google.android.gms.internal.ads.om1;
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
public final class UtilsShortLink {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("key")
    @Nullable
    private final String key;

    @b("short_url")
    @Nullable
    private final String shortUrl;

    @b("url")
    @Nullable
    private final String url;

    public UtilsShortLink() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ UtilsShortLink copy$default(UtilsShortLink utilsShortLink, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = utilsShortLink.accessKey;
        }
        if ((i & 2) != 0) {
            str2 = utilsShortLink.key;
        }
        if ((i & 4) != 0) {
            str3 = utilsShortLink.shortUrl;
        }
        if ((i & 8) != 0) {
            str4 = utilsShortLink.url;
        }
        return utilsShortLink.copy(str, str2, str3, str4);
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
    public final String component4() {
        return this.url;
    }

    @NotNull
    public final UtilsShortLink copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new UtilsShortLink(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsShortLink)) {
            return false;
        }
        UtilsShortLink utilsShortLink = (UtilsShortLink) obj;
        return Intrinsics.a(this.accessKey, utilsShortLink.accessKey) && Intrinsics.a(this.key, utilsShortLink.key) && Intrinsics.a(this.shortUrl, utilsShortLink.shortUrl) && Intrinsics.a(this.url, utilsShortLink.url);
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
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.accessKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.accessKey;
        String str2 = this.key;
        return om1.n(z.j("UtilsShortLink(accessKey=", str, ", key=", str2, ", shortUrl="), this.shortUrl, ", url=", this.url, ")");
    }

    public UtilsShortLink(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.accessKey = str;
        this.key = str2;
        this.shortUrl = str3;
        this.url = str4;
    }

    public /* synthetic */ UtilsShortLink(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
