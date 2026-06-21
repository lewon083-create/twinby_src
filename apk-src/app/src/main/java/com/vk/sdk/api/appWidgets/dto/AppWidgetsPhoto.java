package com.vk.sdk.api.appWidgets.dto;

import com.vk.sdk.api.base.dto.BaseImage;
import io.sentry.protocol.DebugMeta;
import java.util.List;
import kotlin.Metadata;
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
public final class AppWidgetsPhoto {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final String f15127id;

    @b(DebugMeta.JsonKeys.IMAGES)
    @NotNull
    private final List<BaseImage> images;

    public AppWidgetsPhoto(@NotNull String id2, @NotNull List<BaseImage> images) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(images, "images");
        this.f15127id = id2;
        this.images = images;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppWidgetsPhoto copy$default(AppWidgetsPhoto appWidgetsPhoto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appWidgetsPhoto.f15127id;
        }
        if ((i & 2) != 0) {
            list = appWidgetsPhoto.images;
        }
        return appWidgetsPhoto.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.f15127id;
    }

    @NotNull
    public final List<BaseImage> component2() {
        return this.images;
    }

    @NotNull
    public final AppWidgetsPhoto copy(@NotNull String id2, @NotNull List<BaseImage> images) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(images, "images");
        return new AppWidgetsPhoto(id2, images);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppWidgetsPhoto)) {
            return false;
        }
        AppWidgetsPhoto appWidgetsPhoto = (AppWidgetsPhoto) obj;
        return Intrinsics.a(this.f15127id, appWidgetsPhoto.f15127id) && Intrinsics.a(this.images, appWidgetsPhoto.images);
    }

    @NotNull
    public final String getId() {
        return this.f15127id;
    }

    @NotNull
    public final List<BaseImage> getImages() {
        return this.images;
    }

    public int hashCode() {
        return this.images.hashCode() + (this.f15127id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AppWidgetsPhoto(id=" + this.f15127id + ", images=" + this.images + ")";
    }
}
