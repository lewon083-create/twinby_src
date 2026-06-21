package com.vk.sdk.api.discover.dto;

import com.vk.sdk.api.base.dto.BaseImage;
import gf.a;
import io.sentry.protocol.DebugMeta;
import java.util.List;
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
public final class DiscoverCarouselItem {

    @b("button")
    @NotNull
    private final DiscoverCarouselButton button;

    @b("description")
    @NotNull
    private final DiscoverCarouselItemDescription description;

    @b(DebugMeta.JsonKeys.IMAGES)
    @Nullable
    private final List<BaseImage> images;

    @b("title")
    @NotNull
    private final String title;

    public DiscoverCarouselItem(@NotNull DiscoverCarouselButton button, @NotNull DiscoverCarouselItemDescription description, @NotNull String title, @Nullable List<BaseImage> list) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(title, "title");
        this.button = button;
        this.description = description;
        this.title = title;
        this.images = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscoverCarouselItem copy$default(DiscoverCarouselItem discoverCarouselItem, DiscoverCarouselButton discoverCarouselButton, DiscoverCarouselItemDescription discoverCarouselItemDescription, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            discoverCarouselButton = discoverCarouselItem.button;
        }
        if ((i & 2) != 0) {
            discoverCarouselItemDescription = discoverCarouselItem.description;
        }
        if ((i & 4) != 0) {
            str = discoverCarouselItem.title;
        }
        if ((i & 8) != 0) {
            list = discoverCarouselItem.images;
        }
        return discoverCarouselItem.copy(discoverCarouselButton, discoverCarouselItemDescription, str, list);
    }

    @NotNull
    public final DiscoverCarouselButton component1() {
        return this.button;
    }

    @NotNull
    public final DiscoverCarouselItemDescription component2() {
        return this.description;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @Nullable
    public final List<BaseImage> component4() {
        return this.images;
    }

    @NotNull
    public final DiscoverCarouselItem copy(@NotNull DiscoverCarouselButton button, @NotNull DiscoverCarouselItemDescription description, @NotNull String title, @Nullable List<BaseImage> list) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(title, "title");
        return new DiscoverCarouselItem(button, description, title, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselItem)) {
            return false;
        }
        DiscoverCarouselItem discoverCarouselItem = (DiscoverCarouselItem) obj;
        return Intrinsics.a(this.button, discoverCarouselItem.button) && Intrinsics.a(this.description, discoverCarouselItem.description) && Intrinsics.a(this.title, discoverCarouselItem.title) && Intrinsics.a(this.images, discoverCarouselItem.images);
    }

    @NotNull
    public final DiscoverCarouselButton getButton() {
        return this.button;
    }

    @NotNull
    public final DiscoverCarouselItemDescription getDescription() {
        return this.description;
    }

    @Nullable
    public final List<BaseImage> getImages() {
        return this.images;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE = a.e((this.description.hashCode() + (this.button.hashCode() * 31)) * 31, 31, this.title);
        List<BaseImage> list = this.images;
        return iE + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "DiscoverCarouselItem(button=" + this.button + ", description=" + this.description + ", title=" + this.title + ", images=" + this.images + ")";
    }

    public /* synthetic */ DiscoverCarouselItem(DiscoverCarouselButton discoverCarouselButton, DiscoverCarouselItemDescription discoverCarouselItemDescription, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(discoverCarouselButton, discoverCarouselItemDescription, str, (i & 8) != 0 ? null : list);
    }
}
