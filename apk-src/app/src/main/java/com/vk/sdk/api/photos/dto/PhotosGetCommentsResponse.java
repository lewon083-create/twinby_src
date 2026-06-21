package com.vk.sdk.api.photos.dto;

import com.google.android.gms.internal.ads.om1;
import com.vk.sdk.api.wall.dto.WallWallComment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class PhotosGetCommentsResponse {

    @b("count")
    @Nullable
    private final Integer count;

    @b("items")
    @Nullable
    private final List<WallWallComment> items;

    @b("real_offset")
    @Nullable
    private final Integer realOffset;

    public PhotosGetCommentsResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotosGetCommentsResponse copy$default(PhotosGetCommentsResponse photosGetCommentsResponse, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = photosGetCommentsResponse.count;
        }
        if ((i & 2) != 0) {
            num2 = photosGetCommentsResponse.realOffset;
        }
        if ((i & 4) != 0) {
            list = photosGetCommentsResponse.items;
        }
        return photosGetCommentsResponse.copy(num, num2, list);
    }

    @Nullable
    public final Integer component1() {
        return this.count;
    }

    @Nullable
    public final Integer component2() {
        return this.realOffset;
    }

    @Nullable
    public final List<WallWallComment> component3() {
        return this.items;
    }

    @NotNull
    public final PhotosGetCommentsResponse copy(@Nullable Integer num, @Nullable Integer num2, @Nullable List<WallWallComment> list) {
        return new PhotosGetCommentsResponse(num, num2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetCommentsResponse)) {
            return false;
        }
        PhotosGetCommentsResponse photosGetCommentsResponse = (PhotosGetCommentsResponse) obj;
        return Intrinsics.a(this.count, photosGetCommentsResponse.count) && Intrinsics.a(this.realOffset, photosGetCommentsResponse.realOffset) && Intrinsics.a(this.items, photosGetCommentsResponse.items);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final List<WallWallComment> getItems() {
        return this.items;
    }

    @Nullable
    public final Integer getRealOffset() {
        return this.realOffset;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.realOffset;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<WallWallComment> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.count;
        Integer num2 = this.realOffset;
        return z.h(om1.o("PhotosGetCommentsResponse(count=", ", realOffset=", num, num2, ", items="), this.items, ")");
    }

    public PhotosGetCommentsResponse(@Nullable Integer num, @Nullable Integer num2, @Nullable List<WallWallComment> list) {
        this.count = num;
        this.realOffset = num2;
        this.items = list;
    }

    public /* synthetic */ PhotosGetCommentsResponse(Integer num, Integer num2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : list);
    }
}
