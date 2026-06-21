package com.vk.sdk.api.ads.dto;

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
public final class AdsCreateTargetGroupResponse {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15116id;

    @b("pixel")
    @Nullable
    private final String pixel;

    public AdsCreateTargetGroupResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdsCreateTargetGroupResponse copy$default(AdsCreateTargetGroupResponse adsCreateTargetGroupResponse, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = adsCreateTargetGroupResponse.f15116id;
        }
        if ((i & 2) != 0) {
            str = adsCreateTargetGroupResponse.pixel;
        }
        return adsCreateTargetGroupResponse.copy(num, str);
    }

    @Nullable
    public final Integer component1() {
        return this.f15116id;
    }

    @Nullable
    public final String component2() {
        return this.pixel;
    }

    @NotNull
    public final AdsCreateTargetGroupResponse copy(@Nullable Integer num, @Nullable String str) {
        return new AdsCreateTargetGroupResponse(num, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsCreateTargetGroupResponse)) {
            return false;
        }
        AdsCreateTargetGroupResponse adsCreateTargetGroupResponse = (AdsCreateTargetGroupResponse) obj;
        return Intrinsics.a(this.f15116id, adsCreateTargetGroupResponse.f15116id) && Intrinsics.a(this.pixel, adsCreateTargetGroupResponse.pixel);
    }

    @Nullable
    public final Integer getId() {
        return this.f15116id;
    }

    @Nullable
    public final String getPixel() {
        return this.pixel;
    }

    public int hashCode() {
        Integer num = this.f15116id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.pixel;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsCreateTargetGroupResponse(id=" + this.f15116id + ", pixel=" + this.pixel + ")";
    }

    public AdsCreateTargetGroupResponse(@Nullable Integer num, @Nullable String str) {
        this.f15116id = num;
        this.pixel = str;
    }

    public /* synthetic */ AdsCreateTargetGroupResponse(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
