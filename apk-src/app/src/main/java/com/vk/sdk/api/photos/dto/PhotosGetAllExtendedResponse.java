package com.vk.sdk.api.photos.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
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
public final class PhotosGetAllExtendedResponse {

    @b("count")
    @Nullable
    private final Integer count;

    @b("items")
    @Nullable
    private final List<PhotosPhotoFullXtrRealOffset> items;

    @b("more")
    @Nullable
    private final BaseBoolInt more;

    public PhotosGetAllExtendedResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotosGetAllExtendedResponse copy$default(PhotosGetAllExtendedResponse photosGetAllExtendedResponse, Integer num, List list, BaseBoolInt baseBoolInt, int i, Object obj) {
        if ((i & 1) != 0) {
            num = photosGetAllExtendedResponse.count;
        }
        if ((i & 2) != 0) {
            list = photosGetAllExtendedResponse.items;
        }
        if ((i & 4) != 0) {
            baseBoolInt = photosGetAllExtendedResponse.more;
        }
        return photosGetAllExtendedResponse.copy(num, list, baseBoolInt);
    }

    @Nullable
    public final Integer component1() {
        return this.count;
    }

    @Nullable
    public final List<PhotosPhotoFullXtrRealOffset> component2() {
        return this.items;
    }

    @Nullable
    public final BaseBoolInt component3() {
        return this.more;
    }

    @NotNull
    public final PhotosGetAllExtendedResponse copy(@Nullable Integer num, @Nullable List<PhotosPhotoFullXtrRealOffset> list, @Nullable BaseBoolInt baseBoolInt) {
        return new PhotosGetAllExtendedResponse(num, list, baseBoolInt);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetAllExtendedResponse)) {
            return false;
        }
        PhotosGetAllExtendedResponse photosGetAllExtendedResponse = (PhotosGetAllExtendedResponse) obj;
        return Intrinsics.a(this.count, photosGetAllExtendedResponse.count) && Intrinsics.a(this.items, photosGetAllExtendedResponse.items) && this.more == photosGetAllExtendedResponse.more;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final List<PhotosPhotoFullXtrRealOffset> getItems() {
        return this.items;
    }

    @Nullable
    public final BaseBoolInt getMore() {
        return this.more;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<PhotosPhotoFullXtrRealOffset> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.more;
        return iHashCode2 + (baseBoolInt != null ? baseBoolInt.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PhotosGetAllExtendedResponse(count=" + this.count + ", items=" + this.items + ", more=" + this.more + ")";
    }

    public PhotosGetAllExtendedResponse(@Nullable Integer num, @Nullable List<PhotosPhotoFullXtrRealOffset> list, @Nullable BaseBoolInt baseBoolInt) {
        this.count = num;
        this.items = list;
        this.more = baseBoolInt;
    }

    public /* synthetic */ PhotosGetAllExtendedResponse(Integer num, List list, BaseBoolInt baseBoolInt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : baseBoolInt);
    }
}
