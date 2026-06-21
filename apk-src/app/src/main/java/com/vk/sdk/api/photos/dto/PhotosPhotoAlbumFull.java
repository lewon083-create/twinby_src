package com.vk.sdk.api.photos.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import io.sentry.rrweb.RRWebVideoEvent;
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
public final class PhotosPhotoAlbumFull {

    @b("can_delete")
    @Nullable
    private final Boolean canDelete;

    @b("can_upload")
    @Nullable
    private final BaseBoolInt canUpload;

    @b("comments_disabled")
    @Nullable
    private final BaseBoolInt commentsDisabled;

    @b("created")
    private final int created;

    @b("description")
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15217id;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b(RRWebVideoEvent.JsonKeys.SIZE)
    private final int size;

    @b("sizes")
    @Nullable
    private final List<PhotosPhotoSizes> sizes;

    @b("thumb_id")
    @Nullable
    private final Integer thumbId;

    @b("thumb_is_last")
    @Nullable
    private final BaseBoolInt thumbIsLast;

    @b("thumb_src")
    @Nullable
    private final String thumbSrc;

    @b("title")
    @NotNull
    private final String title;

    @b("updated")
    private final int updated;

    @b("upload_by_admins_only")
    @Nullable
    private final BaseBoolInt uploadByAdminsOnly;

    public PhotosPhotoAlbumFull(int i, int i10, @NotNull UserId ownerId, int i11, @NotNull String title, int i12, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable String str, @Nullable Boolean bool, @Nullable List<PhotosPhotoSizes> list, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt3, @Nullable String str2, @Nullable BaseBoolInt baseBoolInt4) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.created = i;
        this.f15217id = i10;
        this.ownerId = ownerId;
        this.size = i11;
        this.title = title;
        this.updated = i12;
        this.canUpload = baseBoolInt;
        this.commentsDisabled = baseBoolInt2;
        this.description = str;
        this.canDelete = bool;
        this.sizes = list;
        this.thumbId = num;
        this.thumbIsLast = baseBoolInt3;
        this.thumbSrc = str2;
        this.uploadByAdminsOnly = baseBoolInt4;
    }

    public final int component1() {
        return this.created;
    }

    @Nullable
    public final Boolean component10() {
        return this.canDelete;
    }

    @Nullable
    public final List<PhotosPhotoSizes> component11() {
        return this.sizes;
    }

    @Nullable
    public final Integer component12() {
        return this.thumbId;
    }

    @Nullable
    public final BaseBoolInt component13() {
        return this.thumbIsLast;
    }

    @Nullable
    public final String component14() {
        return this.thumbSrc;
    }

    @Nullable
    public final BaseBoolInt component15() {
        return this.uploadByAdminsOnly;
    }

    public final int component2() {
        return this.f15217id;
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
    public final BaseBoolInt component7() {
        return this.canUpload;
    }

    @Nullable
    public final BaseBoolInt component8() {
        return this.commentsDisabled;
    }

    @Nullable
    public final String component9() {
        return this.description;
    }

    @NotNull
    public final PhotosPhotoAlbumFull copy(int i, int i10, @NotNull UserId ownerId, int i11, @NotNull String title, int i12, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable String str, @Nullable Boolean bool, @Nullable List<PhotosPhotoSizes> list, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt3, @Nullable String str2, @Nullable BaseBoolInt baseBoolInt4) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new PhotosPhotoAlbumFull(i, i10, ownerId, i11, title, i12, baseBoolInt, baseBoolInt2, str, bool, list, num, baseBoolInt3, str2, baseBoolInt4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoAlbumFull)) {
            return false;
        }
        PhotosPhotoAlbumFull photosPhotoAlbumFull = (PhotosPhotoAlbumFull) obj;
        return this.created == photosPhotoAlbumFull.created && this.f15217id == photosPhotoAlbumFull.f15217id && Intrinsics.a(this.ownerId, photosPhotoAlbumFull.ownerId) && this.size == photosPhotoAlbumFull.size && Intrinsics.a(this.title, photosPhotoAlbumFull.title) && this.updated == photosPhotoAlbumFull.updated && this.canUpload == photosPhotoAlbumFull.canUpload && this.commentsDisabled == photosPhotoAlbumFull.commentsDisabled && Intrinsics.a(this.description, photosPhotoAlbumFull.description) && Intrinsics.a(this.canDelete, photosPhotoAlbumFull.canDelete) && Intrinsics.a(this.sizes, photosPhotoAlbumFull.sizes) && Intrinsics.a(this.thumbId, photosPhotoAlbumFull.thumbId) && this.thumbIsLast == photosPhotoAlbumFull.thumbIsLast && Intrinsics.a(this.thumbSrc, photosPhotoAlbumFull.thumbSrc) && this.uploadByAdminsOnly == photosPhotoAlbumFull.uploadByAdminsOnly;
    }

    @Nullable
    public final Boolean getCanDelete() {
        return this.canDelete;
    }

    @Nullable
    public final BaseBoolInt getCanUpload() {
        return this.canUpload;
    }

    @Nullable
    public final BaseBoolInt getCommentsDisabled() {
        return this.commentsDisabled;
    }

    public final int getCreated() {
        return this.created;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.f15217id;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    public final int getSize() {
        return this.size;
    }

    @Nullable
    public final List<PhotosPhotoSizes> getSizes() {
        return this.sizes;
    }

    @Nullable
    public final Integer getThumbId() {
        return this.thumbId;
    }

    @Nullable
    public final BaseBoolInt getThumbIsLast() {
        return this.thumbIsLast;
    }

    @Nullable
    public final String getThumbSrc() {
        return this.thumbSrc;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getUpdated() {
        return this.updated;
    }

    @Nullable
    public final BaseBoolInt getUploadByAdminsOnly() {
        return this.uploadByAdminsOnly;
    }

    public int hashCode() {
        int iG = u.g(this.updated, a.e(u.g(this.size, o.e(this.ownerId, u.g(this.f15217id, Integer.hashCode(this.created) * 31, 31), 31), 31), 31, this.title), 31);
        BaseBoolInt baseBoolInt = this.canUpload;
        int iHashCode = (iG + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.commentsDisabled;
        int iHashCode2 = (iHashCode + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        String str = this.description;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.canDelete;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<PhotosPhotoSizes> list = this.sizes;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.thumbId;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.thumbIsLast;
        int iHashCode7 = (iHashCode6 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        String str2 = this.thumbSrc;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseBoolInt baseBoolInt4 = this.uploadByAdminsOnly;
        return iHashCode8 + (baseBoolInt4 != null ? baseBoolInt4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.created;
        int i10 = this.f15217id;
        UserId userId = this.ownerId;
        int i11 = this.size;
        String str = this.title;
        int i12 = this.updated;
        BaseBoolInt baseBoolInt = this.canUpload;
        BaseBoolInt baseBoolInt2 = this.commentsDisabled;
        String str2 = this.description;
        Boolean bool = this.canDelete;
        List<PhotosPhotoSizes> list = this.sizes;
        Integer num = this.thumbId;
        BaseBoolInt baseBoolInt3 = this.thumbIsLast;
        String str3 = this.thumbSrc;
        BaseBoolInt baseBoolInt4 = this.uploadByAdminsOnly;
        StringBuilder sbI = z.i("PhotosPhotoAlbumFull(created=", i, ", id=", i10, ", ownerId=");
        sbI.append(userId);
        sbI.append(", size=");
        sbI.append(i11);
        sbI.append(", title=");
        o.p(i12, str, ", updated=", ", canUpload=", sbI);
        a.s(sbI, baseBoolInt, ", commentsDisabled=", baseBoolInt2, ", description=");
        sbI.append(str2);
        sbI.append(", canDelete=");
        sbI.append(bool);
        sbI.append(", sizes=");
        sbI.append(list);
        sbI.append(", thumbId=");
        sbI.append(num);
        sbI.append(", thumbIsLast=");
        sbI.append(baseBoolInt3);
        sbI.append(", thumbSrc=");
        sbI.append(str3);
        sbI.append(", uploadByAdminsOnly=");
        sbI.append(baseBoolInt4);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ PhotosPhotoAlbumFull(int i, int i10, UserId userId, int i11, String str, int i12, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, String str2, Boolean bool, List list, Integer num, BaseBoolInt baseBoolInt3, String str3, BaseBoolInt baseBoolInt4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, userId, i11, str, i12, (i13 & 64) != 0 ? null : baseBoolInt, (i13 & 128) != 0 ? null : baseBoolInt2, (i13 & 256) != 0 ? null : str2, (i13 & 512) != 0 ? null : bool, (i13 & 1024) != 0 ? null : list, (i13 & 2048) != 0 ? null : num, (i13 & 4096) != 0 ? null : baseBoolInt3, (i13 & 8192) != 0 ? null : str3, (i13 & 16384) != 0 ? null : baseBoolInt4);
    }
}
