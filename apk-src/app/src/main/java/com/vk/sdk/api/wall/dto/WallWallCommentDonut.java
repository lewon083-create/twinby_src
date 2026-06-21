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
public final class WallWallCommentDonut {

    @b("is_don")
    @Nullable
    private final Boolean isDon;

    @b("placeholder")
    @Nullable
    private final WallWallCommentDonutPlaceholder placeholder;

    public WallWallCommentDonut() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WallWallCommentDonut copy$default(WallWallCommentDonut wallWallCommentDonut, Boolean bool, WallWallCommentDonutPlaceholder wallWallCommentDonutPlaceholder, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = wallWallCommentDonut.isDon;
        }
        if ((i & 2) != 0) {
            wallWallCommentDonutPlaceholder = wallWallCommentDonut.placeholder;
        }
        return wallWallCommentDonut.copy(bool, wallWallCommentDonutPlaceholder);
    }

    @Nullable
    public final Boolean component1() {
        return this.isDon;
    }

    @Nullable
    public final WallWallCommentDonutPlaceholder component2() {
        return this.placeholder;
    }

    @NotNull
    public final WallWallCommentDonut copy(@Nullable Boolean bool, @Nullable WallWallCommentDonutPlaceholder wallWallCommentDonutPlaceholder) {
        return new WallWallCommentDonut(bool, wallWallCommentDonutPlaceholder);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallCommentDonut)) {
            return false;
        }
        WallWallCommentDonut wallWallCommentDonut = (WallWallCommentDonut) obj;
        return Intrinsics.a(this.isDon, wallWallCommentDonut.isDon) && Intrinsics.a(this.placeholder, wallWallCommentDonut.placeholder);
    }

    @Nullable
    public final WallWallCommentDonutPlaceholder getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        Boolean bool = this.isDon;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        WallWallCommentDonutPlaceholder wallWallCommentDonutPlaceholder = this.placeholder;
        return iHashCode + (wallWallCommentDonutPlaceholder != null ? wallWallCommentDonutPlaceholder.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDon() {
        return this.isDon;
    }

    @NotNull
    public String toString() {
        return "WallWallCommentDonut(isDon=" + this.isDon + ", placeholder=" + this.placeholder + ")";
    }

    public WallWallCommentDonut(@Nullable Boolean bool, @Nullable WallWallCommentDonutPlaceholder wallWallCommentDonutPlaceholder) {
        this.isDon = bool;
        this.placeholder = wallWallCommentDonutPlaceholder;
    }

    public /* synthetic */ WallWallCommentDonut(Boolean bool, WallWallCommentDonutPlaceholder wallWallCommentDonutPlaceholder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : wallWallCommentDonutPlaceholder);
    }
}
