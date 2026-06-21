package com.vk.sdk.api.newsfeed.dto;

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
public final class NewsfeedItemAnimatedBlockAnimation {

    @b("height")
    @Nullable
    private final Float height;

    @b("play_count")
    @Nullable
    private final Integer playCount;

    @b("url")
    @Nullable
    private final String url;

    @b("width")
    @Nullable
    private final Float width;

    public NewsfeedItemAnimatedBlockAnimation() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ NewsfeedItemAnimatedBlockAnimation copy$default(NewsfeedItemAnimatedBlockAnimation newsfeedItemAnimatedBlockAnimation, String str, Float f10, Float f11, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsfeedItemAnimatedBlockAnimation.url;
        }
        if ((i & 2) != 0) {
            f10 = newsfeedItemAnimatedBlockAnimation.width;
        }
        if ((i & 4) != 0) {
            f11 = newsfeedItemAnimatedBlockAnimation.height;
        }
        if ((i & 8) != 0) {
            num = newsfeedItemAnimatedBlockAnimation.playCount;
        }
        return newsfeedItemAnimatedBlockAnimation.copy(str, f10, f11, num);
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @Nullable
    public final Float component2() {
        return this.width;
    }

    @Nullable
    public final Float component3() {
        return this.height;
    }

    @Nullable
    public final Integer component4() {
        return this.playCount;
    }

    @NotNull
    public final NewsfeedItemAnimatedBlockAnimation copy(@Nullable String str, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num) {
        return new NewsfeedItemAnimatedBlockAnimation(str, f10, f11, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemAnimatedBlockAnimation)) {
            return false;
        }
        NewsfeedItemAnimatedBlockAnimation newsfeedItemAnimatedBlockAnimation = (NewsfeedItemAnimatedBlockAnimation) obj;
        return Intrinsics.a(this.url, newsfeedItemAnimatedBlockAnimation.url) && Intrinsics.a(this.width, newsfeedItemAnimatedBlockAnimation.width) && Intrinsics.a(this.height, newsfeedItemAnimatedBlockAnimation.height) && Intrinsics.a(this.playCount, newsfeedItemAnimatedBlockAnimation.playCount);
    }

    @Nullable
    public final Float getHeight() {
        return this.height;
    }

    @Nullable
    public final Integer getPlayCount() {
        return this.playCount;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Float getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f10 = this.width;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.height;
        int iHashCode3 = (iHashCode2 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Integer num = this.playCount;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NewsfeedItemAnimatedBlockAnimation(url=" + this.url + ", width=" + this.width + ", height=" + this.height + ", playCount=" + this.playCount + ")";
    }

    public NewsfeedItemAnimatedBlockAnimation(@Nullable String str, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num) {
        this.url = str;
        this.width = f10;
        this.height = f11;
        this.playCount = num;
    }

    public /* synthetic */ NewsfeedItemAnimatedBlockAnimation(String str, Float f10, Float f11, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f10, (i & 4) != 0 ? null : f11, (i & 8) != 0 ? null : num);
    }
}
