package com.vk.sdk.api.ads.dto;

import java.util.List;
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
public final class AdsGetCategoriesResponse {

    @b("v1")
    @Nullable
    private final List<AdsCategory> v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    @b("v2")
    @Nullable
    private final List<AdsCategory> f15118v2;

    public AdsGetCategoriesResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdsGetCategoriesResponse copy$default(AdsGetCategoriesResponse adsGetCategoriesResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adsGetCategoriesResponse.v1;
        }
        if ((i & 2) != 0) {
            list2 = adsGetCategoriesResponse.f15118v2;
        }
        return adsGetCategoriesResponse.copy(list, list2);
    }

    @Nullable
    public final List<AdsCategory> component1() {
        return this.v1;
    }

    @Nullable
    public final List<AdsCategory> component2() {
        return this.f15118v2;
    }

    @NotNull
    public final AdsGetCategoriesResponse copy(@Nullable List<AdsCategory> list, @Nullable List<AdsCategory> list2) {
        return new AdsGetCategoriesResponse(list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsGetCategoriesResponse)) {
            return false;
        }
        AdsGetCategoriesResponse adsGetCategoriesResponse = (AdsGetCategoriesResponse) obj;
        return Intrinsics.a(this.v1, adsGetCategoriesResponse.v1) && Intrinsics.a(this.f15118v2, adsGetCategoriesResponse.f15118v2);
    }

    @Nullable
    public final List<AdsCategory> getV1() {
        return this.v1;
    }

    @Nullable
    public final List<AdsCategory> getV2() {
        return this.f15118v2;
    }

    public int hashCode() {
        List<AdsCategory> list = this.v1;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AdsCategory> list2 = this.f15118v2;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsGetCategoriesResponse(v1=" + this.v1 + ", v2=" + this.f15118v2 + ")";
    }

    public AdsGetCategoriesResponse(@Nullable List<AdsCategory> list, @Nullable List<AdsCategory> list2) {
        this.v1 = list;
        this.f15118v2 = list2;
    }

    public /* synthetic */ AdsGetCategoriesResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
