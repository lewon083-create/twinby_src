package com.vk.sdk.api.base.dto;

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
public final class BaseGeo {

    @b("coordinates")
    @Nullable
    private final BaseGeoCoordinates coordinates;

    @b("place")
    @Nullable
    private final BasePlace place;

    @b("showmap")
    @Nullable
    private final Integer showmap;

    @b("type")
    @Nullable
    private final String type;

    public BaseGeo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ BaseGeo copy$default(BaseGeo baseGeo, BaseGeoCoordinates baseGeoCoordinates, BasePlace basePlace, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            baseGeoCoordinates = baseGeo.coordinates;
        }
        if ((i & 2) != 0) {
            basePlace = baseGeo.place;
        }
        if ((i & 4) != 0) {
            num = baseGeo.showmap;
        }
        if ((i & 8) != 0) {
            str = baseGeo.type;
        }
        return baseGeo.copy(baseGeoCoordinates, basePlace, num, str);
    }

    @Nullable
    public final BaseGeoCoordinates component1() {
        return this.coordinates;
    }

    @Nullable
    public final BasePlace component2() {
        return this.place;
    }

    @Nullable
    public final Integer component3() {
        return this.showmap;
    }

    @Nullable
    public final String component4() {
        return this.type;
    }

    @NotNull
    public final BaseGeo copy(@Nullable BaseGeoCoordinates baseGeoCoordinates, @Nullable BasePlace basePlace, @Nullable Integer num, @Nullable String str) {
        return new BaseGeo(baseGeoCoordinates, basePlace, num, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseGeo)) {
            return false;
        }
        BaseGeo baseGeo = (BaseGeo) obj;
        return Intrinsics.a(this.coordinates, baseGeo.coordinates) && Intrinsics.a(this.place, baseGeo.place) && Intrinsics.a(this.showmap, baseGeo.showmap) && Intrinsics.a(this.type, baseGeo.type);
    }

    @Nullable
    public final BaseGeoCoordinates getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    public final BasePlace getPlace() {
        return this.place;
    }

    @Nullable
    public final Integer getShowmap() {
        return this.showmap;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        BaseGeoCoordinates baseGeoCoordinates = this.coordinates;
        int iHashCode = (baseGeoCoordinates == null ? 0 : baseGeoCoordinates.hashCode()) * 31;
        BasePlace basePlace = this.place;
        int iHashCode2 = (iHashCode + (basePlace == null ? 0 : basePlace.hashCode())) * 31;
        Integer num = this.showmap;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.type;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BaseGeo(coordinates=" + this.coordinates + ", place=" + this.place + ", showmap=" + this.showmap + ", type=" + this.type + ")";
    }

    public BaseGeo(@Nullable BaseGeoCoordinates baseGeoCoordinates, @Nullable BasePlace basePlace, @Nullable Integer num, @Nullable String str) {
        this.coordinates = baseGeoCoordinates;
        this.place = basePlace;
        this.showmap = num;
        this.type = str;
    }

    public /* synthetic */ BaseGeo(BaseGeoCoordinates baseGeoCoordinates, BasePlace basePlace, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseGeoCoordinates, (i & 2) != 0 ? null : basePlace, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }
}
