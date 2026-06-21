package com.vk.sdk.api.audio.dto;

import com.vk.sdk.api.base.dto.BaseImage;
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
public final class AudioPhotosByType {

    @b("photo")
    @NotNull
    private final List<BaseImage> photo;

    @b("type")
    @NotNull
    private final String type;

    public AudioPhotosByType(@NotNull String type, @NotNull List<BaseImage> photo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(photo, "photo");
        this.type = type;
        this.photo = photo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioPhotosByType copy$default(AudioPhotosByType audioPhotosByType, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioPhotosByType.type;
        }
        if ((i & 2) != 0) {
            list = audioPhotosByType.photo;
        }
        return audioPhotosByType.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    @NotNull
    public final List<BaseImage> component2() {
        return this.photo;
    }

    @NotNull
    public final AudioPhotosByType copy(@NotNull String type, @NotNull List<BaseImage> photo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(photo, "photo");
        return new AudioPhotosByType(type, photo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPhotosByType)) {
            return false;
        }
        AudioPhotosByType audioPhotosByType = (AudioPhotosByType) obj;
        return Intrinsics.a(this.type, audioPhotosByType.type) && Intrinsics.a(this.photo, audioPhotosByType.photo);
    }

    @NotNull
    public final List<BaseImage> getPhoto() {
        return this.photo;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.photo.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AudioPhotosByType(type=" + this.type + ", photo=" + this.photo + ")";
    }
}
