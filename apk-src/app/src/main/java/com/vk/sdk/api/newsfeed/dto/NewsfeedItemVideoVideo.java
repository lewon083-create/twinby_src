package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.video.dto.VideoVideo;
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
public final class NewsfeedItemVideoVideo {

    @b("count")
    @Nullable
    private final Integer count;

    @b("items")
    @Nullable
    private final List<VideoVideo> items;

    public NewsfeedItemVideoVideo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedItemVideoVideo copy$default(NewsfeedItemVideoVideo newsfeedItemVideoVideo, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = newsfeedItemVideoVideo.count;
        }
        if ((i & 2) != 0) {
            list = newsfeedItemVideoVideo.items;
        }
        return newsfeedItemVideoVideo.copy(num, list);
    }

    @Nullable
    public final Integer component1() {
        return this.count;
    }

    @Nullable
    public final List<VideoVideo> component2() {
        return this.items;
    }

    @NotNull
    public final NewsfeedItemVideoVideo copy(@Nullable Integer num, @Nullable List<VideoVideo> list) {
        return new NewsfeedItemVideoVideo(num, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemVideoVideo)) {
            return false;
        }
        NewsfeedItemVideoVideo newsfeedItemVideoVideo = (NewsfeedItemVideoVideo) obj;
        return Intrinsics.a(this.count, newsfeedItemVideoVideo.count) && Intrinsics.a(this.items, newsfeedItemVideoVideo.items);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final List<VideoVideo> getItems() {
        return this.items;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<VideoVideo> list = this.items;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a.j("NewsfeedItemVideoVideo(count=", this.count, ", items=", this.items, ")");
    }

    public NewsfeedItemVideoVideo(@Nullable Integer num, @Nullable List<VideoVideo> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ NewsfeedItemVideoVideo(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
