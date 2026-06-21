package com.vk.sdk.api.wall.dto;

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
public final class WallWallpostCommentsDonut {

    @b("placeholder")
    @Nullable
    private final WallWallpostCommentsDonutPlaceholder placeholder;

    public WallWallpostCommentsDonut() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WallWallpostCommentsDonut copy$default(WallWallpostCommentsDonut wallWallpostCommentsDonut, WallWallpostCommentsDonutPlaceholder wallWallpostCommentsDonutPlaceholder, int i, Object obj) {
        if ((i & 1) != 0) {
            wallWallpostCommentsDonutPlaceholder = wallWallpostCommentsDonut.placeholder;
        }
        return wallWallpostCommentsDonut.copy(wallWallpostCommentsDonutPlaceholder);
    }

    @Nullable
    public final WallWallpostCommentsDonutPlaceholder component1() {
        return this.placeholder;
    }

    @NotNull
    public final WallWallpostCommentsDonut copy(@Nullable WallWallpostCommentsDonutPlaceholder wallWallpostCommentsDonutPlaceholder) {
        return new WallWallpostCommentsDonut(wallWallpostCommentsDonutPlaceholder);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallWallpostCommentsDonut) && Intrinsics.a(this.placeholder, ((WallWallpostCommentsDonut) obj).placeholder);
    }

    @Nullable
    public final WallWallpostCommentsDonutPlaceholder getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        WallWallpostCommentsDonutPlaceholder wallWallpostCommentsDonutPlaceholder = this.placeholder;
        if (wallWallpostCommentsDonutPlaceholder == null) {
            return 0;
        }
        return wallWallpostCommentsDonutPlaceholder.hashCode();
    }

    @NotNull
    public String toString() {
        return "WallWallpostCommentsDonut(placeholder=" + this.placeholder + ")";
    }

    public WallWallpostCommentsDonut(@Nullable WallWallpostCommentsDonutPlaceholder wallWallpostCommentsDonutPlaceholder) {
        this.placeholder = wallWallpostCommentsDonutPlaceholder;
    }

    public /* synthetic */ WallWallpostCommentsDonut(WallWallpostCommentsDonutPlaceholder wallWallpostCommentsDonutPlaceholder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wallWallpostCommentsDonutPlaceholder);
    }
}
