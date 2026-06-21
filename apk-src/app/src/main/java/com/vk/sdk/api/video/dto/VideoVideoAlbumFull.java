package com.vk.sdk.api.video.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BasePropertyExists;
import gf.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class VideoVideoAlbumFull {

    @b("count")
    private final int count;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15251id;

    @b("image")
    @Nullable
    private final List<VideoVideoImage> image;

    @b("image_blur")
    @Nullable
    private final BasePropertyExists imageBlur;

    @b("is_system")
    @Nullable
    private final BasePropertyExists isSystem;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("title")
    @NotNull
    private final String title;

    @b("updated_time")
    private final int updatedTime;

    public VideoVideoAlbumFull(int i, int i10, int i11, @NotNull UserId ownerId, @NotNull String title, @Nullable List<VideoVideoImage> list, @Nullable BasePropertyExists basePropertyExists, @Nullable BasePropertyExists basePropertyExists2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.count = i;
        this.updatedTime = i10;
        this.f15251id = i11;
        this.ownerId = ownerId;
        this.title = title;
        this.image = list;
        this.imageBlur = basePropertyExists;
        this.isSystem = basePropertyExists2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoVideoAlbumFull copy$default(VideoVideoAlbumFull videoVideoAlbumFull, int i, int i10, int i11, UserId userId, String str, List list, BasePropertyExists basePropertyExists, BasePropertyExists basePropertyExists2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = videoVideoAlbumFull.count;
        }
        if ((i12 & 2) != 0) {
            i10 = videoVideoAlbumFull.updatedTime;
        }
        if ((i12 & 4) != 0) {
            i11 = videoVideoAlbumFull.f15251id;
        }
        if ((i12 & 8) != 0) {
            userId = videoVideoAlbumFull.ownerId;
        }
        if ((i12 & 16) != 0) {
            str = videoVideoAlbumFull.title;
        }
        if ((i12 & 32) != 0) {
            list = videoVideoAlbumFull.image;
        }
        if ((i12 & 64) != 0) {
            basePropertyExists = videoVideoAlbumFull.imageBlur;
        }
        if ((i12 & 128) != 0) {
            basePropertyExists2 = videoVideoAlbumFull.isSystem;
        }
        BasePropertyExists basePropertyExists3 = basePropertyExists;
        BasePropertyExists basePropertyExists4 = basePropertyExists2;
        String str2 = str;
        List list2 = list;
        return videoVideoAlbumFull.copy(i, i10, i11, userId, str2, list2, basePropertyExists3, basePropertyExists4);
    }

    public final int component1() {
        return this.count;
    }

    public final int component2() {
        return this.updatedTime;
    }

    public final int component3() {
        return this.f15251id;
    }

    @NotNull
    public final UserId component4() {
        return this.ownerId;
    }

    @NotNull
    public final String component5() {
        return this.title;
    }

    @Nullable
    public final List<VideoVideoImage> component6() {
        return this.image;
    }

    @Nullable
    public final BasePropertyExists component7() {
        return this.imageBlur;
    }

    @Nullable
    public final BasePropertyExists component8() {
        return this.isSystem;
    }

    @NotNull
    public final VideoVideoAlbumFull copy(int i, int i10, int i11, @NotNull UserId ownerId, @NotNull String title, @Nullable List<VideoVideoImage> list, @Nullable BasePropertyExists basePropertyExists, @Nullable BasePropertyExists basePropertyExists2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new VideoVideoAlbumFull(i, i10, i11, ownerId, title, list, basePropertyExists, basePropertyExists2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAlbumFull)) {
            return false;
        }
        VideoVideoAlbumFull videoVideoAlbumFull = (VideoVideoAlbumFull) obj;
        return this.count == videoVideoAlbumFull.count && this.updatedTime == videoVideoAlbumFull.updatedTime && this.f15251id == videoVideoAlbumFull.f15251id && Intrinsics.a(this.ownerId, videoVideoAlbumFull.ownerId) && Intrinsics.a(this.title, videoVideoAlbumFull.title) && Intrinsics.a(this.image, videoVideoAlbumFull.image) && this.imageBlur == videoVideoAlbumFull.imageBlur && this.isSystem == videoVideoAlbumFull.isSystem;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getId() {
        return this.f15251id;
    }

    @Nullable
    public final List<VideoVideoImage> getImage() {
        return this.image;
    }

    @Nullable
    public final BasePropertyExists getImageBlur() {
        return this.imageBlur;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getUpdatedTime() {
        return this.updatedTime;
    }

    public int hashCode() {
        int iE = a.e(o.e(this.ownerId, u.g(this.f15251id, u.g(this.updatedTime, Integer.hashCode(this.count) * 31, 31), 31), 31), 31, this.title);
        List<VideoVideoImage> list = this.image;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        BasePropertyExists basePropertyExists = this.imageBlur;
        int iHashCode2 = (iHashCode + (basePropertyExists == null ? 0 : basePropertyExists.hashCode())) * 31;
        BasePropertyExists basePropertyExists2 = this.isSystem;
        return iHashCode2 + (basePropertyExists2 != null ? basePropertyExists2.hashCode() : 0);
    }

    @Nullable
    public final BasePropertyExists isSystem() {
        return this.isSystem;
    }

    @NotNull
    public String toString() {
        int i = this.count;
        int i10 = this.updatedTime;
        int i11 = this.f15251id;
        UserId userId = this.ownerId;
        String str = this.title;
        List<VideoVideoImage> list = this.image;
        BasePropertyExists basePropertyExists = this.imageBlur;
        BasePropertyExists basePropertyExists2 = this.isSystem;
        StringBuilder sbI = z.i("VideoVideoAlbumFull(count=", i, ", updatedTime=", i10, ", id=");
        sbI.append(i11);
        sbI.append(", ownerId=");
        sbI.append(userId);
        sbI.append(", title=");
        sbI.append(str);
        sbI.append(", image=");
        sbI.append(list);
        sbI.append(", imageBlur=");
        sbI.append(basePropertyExists);
        sbI.append(", isSystem=");
        sbI.append(basePropertyExists2);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ VideoVideoAlbumFull(int i, int i10, int i11, UserId userId, String str, List list, BasePropertyExists basePropertyExists, BasePropertyExists basePropertyExists2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, userId, str, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : basePropertyExists, (i12 & 128) != 0 ? null : basePropertyExists2);
    }
}
