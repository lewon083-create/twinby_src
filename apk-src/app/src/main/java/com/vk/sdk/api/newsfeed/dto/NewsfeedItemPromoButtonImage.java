package com.vk.sdk.api.newsfeed.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
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
public final class NewsfeedItemPromoButtonImage {

    @b("height")
    @Nullable
    private final Integer height;

    @b("url")
    @Nullable
    private final String url;

    @b("width")
    @Nullable
    private final Integer width;

    public NewsfeedItemPromoButtonImage() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ NewsfeedItemPromoButtonImage copy$default(NewsfeedItemPromoButtonImage newsfeedItemPromoButtonImage, Integer num, Integer num2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = newsfeedItemPromoButtonImage.width;
        }
        if ((i & 2) != 0) {
            num2 = newsfeedItemPromoButtonImage.height;
        }
        if ((i & 4) != 0) {
            str = newsfeedItemPromoButtonImage.url;
        }
        return newsfeedItemPromoButtonImage.copy(num, num2, str);
    }

    @Nullable
    public final Integer component1() {
        return this.width;
    }

    @Nullable
    public final Integer component2() {
        return this.height;
    }

    @Nullable
    public final String component3() {
        return this.url;
    }

    @NotNull
    public final NewsfeedItemPromoButtonImage copy(@Nullable Integer num, @Nullable Integer num2, @Nullable String str) {
        return new NewsfeedItemPromoButtonImage(num, num2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemPromoButtonImage)) {
            return false;
        }
        NewsfeedItemPromoButtonImage newsfeedItemPromoButtonImage = (NewsfeedItemPromoButtonImage) obj;
        return Intrinsics.a(this.width, newsfeedItemPromoButtonImage.width) && Intrinsics.a(this.height, newsfeedItemPromoButtonImage.height) && Intrinsics.a(this.url, newsfeedItemPromoButtonImage.url);
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.url;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.width;
        Integer num2 = this.height;
        return u.o(om1.o("NewsfeedItemPromoButtonImage(width=", ", height=", num, num2, ", url="), this.url, ")");
    }

    public NewsfeedItemPromoButtonImage(@Nullable Integer num, @Nullable Integer num2, @Nullable String str) {
        this.width = num;
        this.height = num2;
        this.url = str;
    }

    public /* synthetic */ NewsfeedItemPromoButtonImage(Integer num, Integer num2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str);
    }
}
