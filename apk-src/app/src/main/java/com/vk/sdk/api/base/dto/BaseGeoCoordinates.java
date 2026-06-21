package com.vk.sdk.api.base.dto;

import kotlin.Metadata;
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
public final class BaseGeoCoordinates {

    @b("latitude")
    private final float latitude;

    @b("longitude")
    private final float longitude;

    public BaseGeoCoordinates(float f10, float f11) {
        this.latitude = f10;
        this.longitude = f11;
    }

    public static /* synthetic */ BaseGeoCoordinates copy$default(BaseGeoCoordinates baseGeoCoordinates, float f10, float f11, int i, Object obj) {
        if ((i & 1) != 0) {
            f10 = baseGeoCoordinates.latitude;
        }
        if ((i & 2) != 0) {
            f11 = baseGeoCoordinates.longitude;
        }
        return baseGeoCoordinates.copy(f10, f11);
    }

    public final float component1() {
        return this.latitude;
    }

    public final float component2() {
        return this.longitude;
    }

    @NotNull
    public final BaseGeoCoordinates copy(float f10, float f11) {
        return new BaseGeoCoordinates(f10, f11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseGeoCoordinates)) {
            return false;
        }
        BaseGeoCoordinates baseGeoCoordinates = (BaseGeoCoordinates) obj;
        return Float.valueOf(this.latitude).equals(Float.valueOf(baseGeoCoordinates.latitude)) && Float.valueOf(this.longitude).equals(Float.valueOf(baseGeoCoordinates.longitude));
    }

    public final float getLatitude() {
        return this.latitude;
    }

    public final float getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return Float.hashCode(this.longitude) + (Float.hashCode(this.latitude) * 31);
    }

    @NotNull
    public String toString() {
        return "BaseGeoCoordinates(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
