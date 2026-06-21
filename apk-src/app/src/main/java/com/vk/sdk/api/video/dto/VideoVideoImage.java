package com.vk.sdk.api.video.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BasePropertyExists;
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
public final class VideoVideoImage {

    @b("height")
    private final int height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final String f15253id;

    @b("url")
    @NotNull
    private final String url;

    @b("width")
    private final int width;

    @b("with_padding")
    @Nullable
    private final BasePropertyExists withPadding;

    public VideoVideoImage(@NotNull String url, int i, int i10, @Nullable BasePropertyExists basePropertyExists, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.width = i;
        this.height = i10;
        this.withPadding = basePropertyExists;
        this.f15253id = str;
    }

    public static /* synthetic */ VideoVideoImage copy$default(VideoVideoImage videoVideoImage, String str, int i, int i10, BasePropertyExists basePropertyExists, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = videoVideoImage.url;
        }
        if ((i11 & 2) != 0) {
            i = videoVideoImage.width;
        }
        if ((i11 & 4) != 0) {
            i10 = videoVideoImage.height;
        }
        if ((i11 & 8) != 0) {
            basePropertyExists = videoVideoImage.withPadding;
        }
        if ((i11 & 16) != 0) {
            str2 = videoVideoImage.f15253id;
        }
        String str3 = str2;
        int i12 = i10;
        return videoVideoImage.copy(str, i, i12, basePropertyExists, str3);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    @Nullable
    public final BasePropertyExists component4() {
        return this.withPadding;
    }

    @Nullable
    public final String component5() {
        return this.f15253id;
    }

    @NotNull
    public final VideoVideoImage copy(@NotNull String url, int i, int i10, @Nullable BasePropertyExists basePropertyExists, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new VideoVideoImage(url, i, i10, basePropertyExists, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoImage)) {
            return false;
        }
        VideoVideoImage videoVideoImage = (VideoVideoImage) obj;
        return Intrinsics.a(this.url, videoVideoImage.url) && this.width == videoVideoImage.width && this.height == videoVideoImage.height && this.withPadding == videoVideoImage.withPadding && Intrinsics.a(this.f15253id, videoVideoImage.f15253id);
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getId() {
        return this.f15253id;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    @Nullable
    public final BasePropertyExists getWithPadding() {
        return this.withPadding;
    }

    public int hashCode() {
        int iG = u.g(this.height, u.g(this.width, this.url.hashCode() * 31, 31), 31);
        BasePropertyExists basePropertyExists = this.withPadding;
        int iHashCode = (iG + (basePropertyExists == null ? 0 : basePropertyExists.hashCode())) * 31;
        String str = this.f15253id;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        int i = this.width;
        int i10 = this.height;
        BasePropertyExists basePropertyExists = this.withPadding;
        String str2 = this.f15253id;
        StringBuilder sb2 = new StringBuilder("VideoVideoImage(url=");
        sb2.append(str);
        sb2.append(", width=");
        sb2.append(i);
        sb2.append(", height=");
        sb2.append(i10);
        sb2.append(", withPadding=");
        sb2.append(basePropertyExists);
        sb2.append(", id=");
        return u.o(sb2, str2, ")");
    }

    public /* synthetic */ VideoVideoImage(String str, int i, int i10, BasePropertyExists basePropertyExists, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i10, (i11 & 8) != 0 ? null : basePropertyExists, (i11 & 16) != 0 ? null : str2);
    }
}
