package com.vk.sdk.api.wall.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;

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
public final class WallWallpostDonutPlaceholder {

    @b("text")
    @NotNull
    private final String text;

    public WallWallpostDonutPlaceholder(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
    }

    public static /* synthetic */ WallWallpostDonutPlaceholder copy$default(WallWallpostDonutPlaceholder wallWallpostDonutPlaceholder, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wallWallpostDonutPlaceholder.text;
        }
        return wallWallpostDonutPlaceholder.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    @NotNull
    public final WallWallpostDonutPlaceholder copy(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new WallWallpostDonutPlaceholder(text);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallWallpostDonutPlaceholder) && Intrinsics.a(this.text, ((WallWallpostDonutPlaceholder) obj).text);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return a.f("WallWallpostDonutPlaceholder(text=", this.text, ")");
    }
}
