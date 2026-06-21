package com.vk.sdk.api.utils.dto;

import gf.a;
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
public final class UtilsGetLastShortenedLinksResponse {

    @b("count")
    @Nullable
    private final Integer count;

    @b("items")
    @Nullable
    private final List<UtilsLastShortenedLink> items;

    public UtilsGetLastShortenedLinksResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UtilsGetLastShortenedLinksResponse copy$default(UtilsGetLastShortenedLinksResponse utilsGetLastShortenedLinksResponse, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = utilsGetLastShortenedLinksResponse.count;
        }
        if ((i & 2) != 0) {
            list = utilsGetLastShortenedLinksResponse.items;
        }
        return utilsGetLastShortenedLinksResponse.copy(num, list);
    }

    @Nullable
    public final Integer component1() {
        return this.count;
    }

    @Nullable
    public final List<UtilsLastShortenedLink> component2() {
        return this.items;
    }

    @NotNull
    public final UtilsGetLastShortenedLinksResponse copy(@Nullable Integer num, @Nullable List<UtilsLastShortenedLink> list) {
        return new UtilsGetLastShortenedLinksResponse(num, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsGetLastShortenedLinksResponse)) {
            return false;
        }
        UtilsGetLastShortenedLinksResponse utilsGetLastShortenedLinksResponse = (UtilsGetLastShortenedLinksResponse) obj;
        return Intrinsics.a(this.count, utilsGetLastShortenedLinksResponse.count) && Intrinsics.a(this.items, utilsGetLastShortenedLinksResponse.items);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final List<UtilsLastShortenedLink> getItems() {
        return this.items;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<UtilsLastShortenedLink> list = this.items;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a.j("UtilsGetLastShortenedLinksResponse(count=", this.count, ", items=", this.items, ")");
    }

    public UtilsGetLastShortenedLinksResponse(@Nullable Integer num, @Nullable List<UtilsLastShortenedLink> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ UtilsGetLastShortenedLinksResponse(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
