package com.vk.sdk.api.base.dto;

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
public final class BaseGradientPoint {

    @b("color")
    @NotNull
    private final String color;

    @b("position")
    private final float position;

    public BaseGradientPoint(@NotNull String color, float f10) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.color = color;
        this.position = f10;
    }

    public static /* synthetic */ BaseGradientPoint copy$default(BaseGradientPoint baseGradientPoint, String str, float f10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baseGradientPoint.color;
        }
        if ((i & 2) != 0) {
            f10 = baseGradientPoint.position;
        }
        return baseGradientPoint.copy(str, f10);
    }

    @NotNull
    public final String component1() {
        return this.color;
    }

    public final float component2() {
        return this.position;
    }

    @NotNull
    public final BaseGradientPoint copy(@NotNull String color, float f10) {
        Intrinsics.checkNotNullParameter(color, "color");
        return new BaseGradientPoint(color, f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseGradientPoint)) {
            return false;
        }
        BaseGradientPoint baseGradientPoint = (BaseGradientPoint) obj;
        return Intrinsics.a(this.color, baseGradientPoint.color) && Float.valueOf(this.position).equals(Float.valueOf(baseGradientPoint.position));
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    public final float getPosition() {
        return this.position;
    }

    public int hashCode() {
        return Float.hashCode(this.position) + (this.color.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BaseGradientPoint(color=" + this.color + ", position=" + this.position + ")";
    }
}
