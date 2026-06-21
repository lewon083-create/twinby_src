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
public final class BaseCropPhotoCrop {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @b("x")
    private final float f15135x;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @b("x2")
    private final float f15136x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @b("y")
    private final float f15137y;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @b("y2")
    private final float f15138y2;

    public BaseCropPhotoCrop(float f10, float f11, float f12, float f13) {
        this.f15135x = f10;
        this.f15137y = f11;
        this.f15136x2 = f12;
        this.f15138y2 = f13;
    }

    public static /* synthetic */ BaseCropPhotoCrop copy$default(BaseCropPhotoCrop baseCropPhotoCrop, float f10, float f11, float f12, float f13, int i, Object obj) {
        if ((i & 1) != 0) {
            f10 = baseCropPhotoCrop.f15135x;
        }
        if ((i & 2) != 0) {
            f11 = baseCropPhotoCrop.f15137y;
        }
        if ((i & 4) != 0) {
            f12 = baseCropPhotoCrop.f15136x2;
        }
        if ((i & 8) != 0) {
            f13 = baseCropPhotoCrop.f15138y2;
        }
        return baseCropPhotoCrop.copy(f10, f11, f12, f13);
    }

    public final float component1() {
        return this.f15135x;
    }

    public final float component2() {
        return this.f15137y;
    }

    public final float component3() {
        return this.f15136x2;
    }

    public final float component4() {
        return this.f15138y2;
    }

    @NotNull
    public final BaseCropPhotoCrop copy(float f10, float f11, float f12, float f13) {
        return new BaseCropPhotoCrop(f10, f11, f12, f13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCropPhotoCrop)) {
            return false;
        }
        BaseCropPhotoCrop baseCropPhotoCrop = (BaseCropPhotoCrop) obj;
        return Float.valueOf(this.f15135x).equals(Float.valueOf(baseCropPhotoCrop.f15135x)) && Float.valueOf(this.f15137y).equals(Float.valueOf(baseCropPhotoCrop.f15137y)) && Float.valueOf(this.f15136x2).equals(Float.valueOf(baseCropPhotoCrop.f15136x2)) && Float.valueOf(this.f15138y2).equals(Float.valueOf(baseCropPhotoCrop.f15138y2));
    }

    public final float getX() {
        return this.f15135x;
    }

    public final float getX2() {
        return this.f15136x2;
    }

    public final float getY() {
        return this.f15137y;
    }

    public final float getY2() {
        return this.f15138y2;
    }

    public int hashCode() {
        return Float.hashCode(this.f15138y2) + o.b(this.f15136x2, o.b(this.f15137y, Float.hashCode(this.f15135x) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "BaseCropPhotoCrop(x=" + this.f15135x + ", y=" + this.f15137y + ", x2=" + this.f15136x2 + ", y2=" + this.f15138y2 + ")";
    }
}
