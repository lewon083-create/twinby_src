package com.vk.sdk.api.stories.dto;

import a0.u;
import java.util.List;
import kotlin.Metadata;
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
public final class StoriesClickableStickers {

    @b("clickable_stickers")
    @NotNull
    private final List<StoriesClickableSticker> clickableStickers;

    @b("original_height")
    private final int originalHeight;

    @b("original_width")
    private final int originalWidth;

    public StoriesClickableStickers(@NotNull List<StoriesClickableSticker> clickableStickers, int i, int i10) {
        Intrinsics.checkNotNullParameter(clickableStickers, "clickableStickers");
        this.clickableStickers = clickableStickers;
        this.originalHeight = i;
        this.originalWidth = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoriesClickableStickers copy$default(StoriesClickableStickers storiesClickableStickers, List list, int i, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = storiesClickableStickers.clickableStickers;
        }
        if ((i11 & 2) != 0) {
            i = storiesClickableStickers.originalHeight;
        }
        if ((i11 & 4) != 0) {
            i10 = storiesClickableStickers.originalWidth;
        }
        return storiesClickableStickers.copy(list, i, i10);
    }

    @NotNull
    public final List<StoriesClickableSticker> component1() {
        return this.clickableStickers;
    }

    public final int component2() {
        return this.originalHeight;
    }

    public final int component3() {
        return this.originalWidth;
    }

    @NotNull
    public final StoriesClickableStickers copy(@NotNull List<StoriesClickableSticker> clickableStickers, int i, int i10) {
        Intrinsics.checkNotNullParameter(clickableStickers, "clickableStickers");
        return new StoriesClickableStickers(clickableStickers, i, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesClickableStickers)) {
            return false;
        }
        StoriesClickableStickers storiesClickableStickers = (StoriesClickableStickers) obj;
        return Intrinsics.a(this.clickableStickers, storiesClickableStickers.clickableStickers) && this.originalHeight == storiesClickableStickers.originalHeight && this.originalWidth == storiesClickableStickers.originalWidth;
    }

    @NotNull
    public final List<StoriesClickableSticker> getClickableStickers() {
        return this.clickableStickers;
    }

    public final int getOriginalHeight() {
        return this.originalHeight;
    }

    public final int getOriginalWidth() {
        return this.originalWidth;
    }

    public int hashCode() {
        return Integer.hashCode(this.originalWidth) + u.g(this.originalHeight, this.clickableStickers.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        List<StoriesClickableSticker> list = this.clickableStickers;
        int i = this.originalHeight;
        int i10 = this.originalWidth;
        StringBuilder sb2 = new StringBuilder("StoriesClickableStickers(clickableStickers=");
        sb2.append(list);
        sb2.append(", originalHeight=");
        sb2.append(i);
        sb2.append(", originalWidth=");
        return z.d(i10, ")", sb2);
    }
}
