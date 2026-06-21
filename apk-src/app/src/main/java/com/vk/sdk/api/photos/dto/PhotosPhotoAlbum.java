package com.vk.sdk.api.photos.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import gf.a;
import io.sentry.rrweb.RRWebVideoEvent;
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
public final class PhotosPhotoAlbum {

    @b("created")
    private final int created;

    @b("description")
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15216id;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b(RRWebVideoEvent.JsonKeys.SIZE)
    private final int size;

    @b("thumb")
    @Nullable
    private final PhotosPhoto thumb;

    @b("title")
    @NotNull
    private final String title;

    @b("updated")
    private final int updated;

    public PhotosPhotoAlbum(int i, int i10, @NotNull UserId ownerId, int i11, @NotNull String title, int i12, @Nullable String str, @Nullable PhotosPhoto photosPhoto) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.created = i;
        this.f15216id = i10;
        this.ownerId = ownerId;
        this.size = i11;
        this.title = title;
        this.updated = i12;
        this.description = str;
        this.thumb = photosPhoto;
    }

    public static /* synthetic */ PhotosPhotoAlbum copy$default(PhotosPhotoAlbum photosPhotoAlbum, int i, int i10, UserId userId, int i11, String str, int i12, String str2, PhotosPhoto photosPhoto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = photosPhotoAlbum.created;
        }
        if ((i13 & 2) != 0) {
            i10 = photosPhotoAlbum.f15216id;
        }
        if ((i13 & 4) != 0) {
            userId = photosPhotoAlbum.ownerId;
        }
        if ((i13 & 8) != 0) {
            i11 = photosPhotoAlbum.size;
        }
        if ((i13 & 16) != 0) {
            str = photosPhotoAlbum.title;
        }
        if ((i13 & 32) != 0) {
            i12 = photosPhotoAlbum.updated;
        }
        if ((i13 & 64) != 0) {
            str2 = photosPhotoAlbum.description;
        }
        if ((i13 & 128) != 0) {
            photosPhoto = photosPhotoAlbum.thumb;
        }
        String str3 = str2;
        PhotosPhoto photosPhoto2 = photosPhoto;
        String str4 = str;
        int i14 = i12;
        return photosPhotoAlbum.copy(i, i10, userId, i11, str4, i14, str3, photosPhoto2);
    }

    public final int component1() {
        return this.created;
    }

    public final int component2() {
        return this.f15216id;
    }

    @NotNull
    public final UserId component3() {
        return this.ownerId;
    }

    public final int component4() {
        return this.size;
    }

    @NotNull
    public final String component5() {
        return this.title;
    }

    public final int component6() {
        return this.updated;
    }

    @Nullable
    public final String component7() {
        return this.description;
    }

    @Nullable
    public final PhotosPhoto component8() {
        return this.thumb;
    }

    @NotNull
    public final PhotosPhotoAlbum copy(int i, int i10, @NotNull UserId ownerId, int i11, @NotNull String title, int i12, @Nullable String str, @Nullable PhotosPhoto photosPhoto) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new PhotosPhotoAlbum(i, i10, ownerId, i11, title, i12, str, photosPhoto);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoAlbum)) {
            return false;
        }
        PhotosPhotoAlbum photosPhotoAlbum = (PhotosPhotoAlbum) obj;
        return this.created == photosPhotoAlbum.created && this.f15216id == photosPhotoAlbum.f15216id && Intrinsics.a(this.ownerId, photosPhotoAlbum.ownerId) && this.size == photosPhotoAlbum.size && Intrinsics.a(this.title, photosPhotoAlbum.title) && this.updated == photosPhotoAlbum.updated && Intrinsics.a(this.description, photosPhotoAlbum.description) && Intrinsics.a(this.thumb, photosPhotoAlbum.thumb);
    }

    public final int getCreated() {
        return this.created;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.f15216id;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    public final int getSize() {
        return this.size;
    }

    @Nullable
    public final PhotosPhoto getThumb() {
        return this.thumb;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        int iG = u.g(this.updated, a.e(u.g(this.size, o.e(this.ownerId, u.g(this.f15216id, Integer.hashCode(this.created) * 31, 31), 31), 31), 31, this.title), 31);
        String str = this.description;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.thumb;
        return iHashCode + (photosPhoto != null ? photosPhoto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.created;
        int i10 = this.f15216id;
        UserId userId = this.ownerId;
        int i11 = this.size;
        String str = this.title;
        int i12 = this.updated;
        String str2 = this.description;
        PhotosPhoto photosPhoto = this.thumb;
        StringBuilder sbI = z.i("PhotosPhotoAlbum(created=", i, ", id=", i10, ", ownerId=");
        sbI.append(userId);
        sbI.append(", size=");
        sbI.append(i11);
        sbI.append(", title=");
        o.p(i12, str, ", updated=", ", description=", sbI);
        sbI.append(str2);
        sbI.append(", thumb=");
        sbI.append(photosPhoto);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ PhotosPhotoAlbum(int i, int i10, UserId userId, int i11, String str, int i12, String str2, PhotosPhoto photosPhoto, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, userId, i11, str, i12, (i13 & 64) != 0 ? null : str2, (i13 & 128) != 0 ? null : photosPhoto);
    }
}
