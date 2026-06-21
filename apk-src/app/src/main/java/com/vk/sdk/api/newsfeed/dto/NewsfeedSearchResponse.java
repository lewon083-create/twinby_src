package com.vk.sdk.api.newsfeed.dto;

import a0.u;
import com.vk.sdk.api.wall.dto.WallWallpostFull;
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
public final class NewsfeedSearchResponse {

    @b("count")
    @Nullable
    private final Integer count;

    @b("items")
    @Nullable
    private final List<WallWallpostFull> items;

    @b("next_from")
    @Nullable
    private final String nextFrom;

    @b("suggested_queries")
    @Nullable
    private final List<String> suggestedQueries;

    @b("total_count")
    @Nullable
    private final Integer totalCount;

    public NewsfeedSearchResponse() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedSearchResponse copy$default(NewsfeedSearchResponse newsfeedSearchResponse, List list, List list2, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsfeedSearchResponse.items;
        }
        if ((i & 2) != 0) {
            list2 = newsfeedSearchResponse.suggestedQueries;
        }
        if ((i & 4) != 0) {
            str = newsfeedSearchResponse.nextFrom;
        }
        if ((i & 8) != 0) {
            num = newsfeedSearchResponse.count;
        }
        if ((i & 16) != 0) {
            num2 = newsfeedSearchResponse.totalCount;
        }
        Integer num3 = num2;
        String str2 = str;
        return newsfeedSearchResponse.copy(list, list2, str2, num, num3);
    }

    @Nullable
    public final List<WallWallpostFull> component1() {
        return this.items;
    }

    @Nullable
    public final List<String> component2() {
        return this.suggestedQueries;
    }

    @Nullable
    public final String component3() {
        return this.nextFrom;
    }

    @Nullable
    public final Integer component4() {
        return this.count;
    }

    @Nullable
    public final Integer component5() {
        return this.totalCount;
    }

    @NotNull
    public final NewsfeedSearchResponse copy(@Nullable List<WallWallpostFull> list, @Nullable List<String> list2, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        return new NewsfeedSearchResponse(list, list2, str, num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedSearchResponse)) {
            return false;
        }
        NewsfeedSearchResponse newsfeedSearchResponse = (NewsfeedSearchResponse) obj;
        return Intrinsics.a(this.items, newsfeedSearchResponse.items) && Intrinsics.a(this.suggestedQueries, newsfeedSearchResponse.suggestedQueries) && Intrinsics.a(this.nextFrom, newsfeedSearchResponse.nextFrom) && Intrinsics.a(this.count, newsfeedSearchResponse.count) && Intrinsics.a(this.totalCount, newsfeedSearchResponse.totalCount);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final List<WallWallpostFull> getItems() {
        return this.items;
    }

    @Nullable
    public final String getNextFrom() {
        return this.nextFrom;
    }

    @Nullable
    public final List<String> getSuggestedQueries() {
        return this.suggestedQueries;
    }

    @Nullable
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        List<WallWallpostFull> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.suggestedQueries;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.nextFrom;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.count;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCount;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<WallWallpostFull> list = this.items;
        List<String> list2 = this.suggestedQueries;
        String str = this.nextFrom;
        Integer num = this.count;
        Integer num2 = this.totalCount;
        StringBuilder sb2 = new StringBuilder("NewsfeedSearchResponse(items=");
        sb2.append(list);
        sb2.append(", suggestedQueries=");
        sb2.append(list2);
        sb2.append(", nextFrom=");
        a.r(num, str, ", count=", ", totalCount=", sb2);
        return u.m(sb2, num2, ")");
    }

    public NewsfeedSearchResponse(@Nullable List<WallWallpostFull> list, @Nullable List<String> list2, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        this.items = list;
        this.suggestedQueries = list2;
        this.nextFrom = str;
        this.count = num;
        this.totalCount = num2;
    }

    public /* synthetic */ NewsfeedSearchResponse(List list, List list2, String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
