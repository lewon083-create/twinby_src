package com.vk.sdk.api.base.dto;

import kotlin.Metadata;
import l7.o;
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
public final class BaseCropPhotoRect {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @b("x")
    private final float f15139x;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @b("x2")
    private final float f15140x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @b("y")
    private final float f15141y;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @b("y2")
    private final float f15142y2;

    public BaseCropPhotoRect(float f10, float f11, float f12, float f13) {
        this.f15139x = f10;
        this.f15141y = f11;
        this.f15140x2 = f12;
        this.f15142y2 = f13;
    }

    public static /* synthetic */ BaseCropPhotoRect copy$default(BaseCropPhotoRect baseCropPhotoRect, float f10, float f11, float f12, float f13, int i, Object obj) {
        if ((i & 1) != 0) {
            f10 = baseCropPhotoRect.f15139x;
        }
        if ((i & 2) != 0) {
            f11 = baseCropPhotoRect.f15141y;
        }
        if ((i & 4) != 0) {
            f12 = baseCropPhotoRect.f15140x2;
        }
        if ((i & 8) != 0) {
            f13 = baseCropPhotoRect.f15142y2;
        }
        return baseCropPhotoRect.copy(f10, f11, f12, f13);
    }

    public final float component1() {
        return this.f15139x;
    }

    public final float component2() {
        return this.f15141y;
    }

    public final float component3() {
        return this.f15140x2;
    }

    public final float component4() {
        return this.f15142y2;
    }

    @NotNull
    public final BaseCropPhotoRect copy(float f10, float f11, float f12, float f13) {
        return new BaseCropPhotoRect(f10, f11, f12, f13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCropPhotoRect)) {
            return false;
        }
        BaseCropPhotoRect baseCropPhotoRect = (BaseCropPhotoRect) obj;
        return Float.valueOf(this.f15139x).equals(Float.valueOf(baseCropPhotoRect.f15139x)) && Float.valueOf(this.f15141y).equals(Float.valueOf(baseCropPhotoRect.f15141y)) && Float.valueOf(this.f15140x2).equals(Float.valueOf(baseCropPhotoRect.f15140x2)) && Float.valueOf(this.f15142y2).equals(Float.valueOf(baseCropPhotoRect.f15142y2));
    }

    public final float getX() {
        return this.f15139x;
    }

    public final float getX2() {
        return this.f15140x2;
    }

    public final float getY() {
        return this.f15141y;
    }

    public final float getY2() {
        return this.f15142y2;
    }

    public int hashCode() {
        return Float.hashCode(this.f15142y2) + o.b(this.f15140x2, o.b(this.f15141y, Float.hashCode(this.f15139x) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "BaseCropPhotoRect(x=" + this.f15139x + ", y=" + this.f15141y + ", x2=" + this.f15140x2 + ", y2=" + this.f15142y2 + ")";
    }
}
