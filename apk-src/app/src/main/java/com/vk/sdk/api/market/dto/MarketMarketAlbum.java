package com.vk.sdk.api.market.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class MarketMarketAlbum {

    @b("count")
    private final int count;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15186id;

    @b("is_hidden")
    @Nullable
    private final Boolean isHidden;

    @b("is_main")
    @Nullable
    private final Boolean isMain;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("title")
    @NotNull
    private final String title;

    @b("updated_time")
    private final int updatedTime;

    public MarketMarketAlbum(int i, @NotNull UserId ownerId, @NotNull String title, int i10, int i11, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable PhotosPhoto photosPhoto) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f15186id = i;
        this.ownerId = ownerId;
        this.title = title;
        this.count = i10;
        this.updatedTime = i11;
        this.isMain = bool;
        this.isHidden = bool2;
        this.photo = photosPhoto;
    }

    public static /* synthetic */ MarketMarketAlbum copy$default(MarketMarketAlbum marketMarketAlbum, int i, UserId userId, String str, int i10, int i11, Boolean bool, Boolean bool2, PhotosPhoto photosPhoto, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = marketMarketAlbum.f15186id;
        }
        if ((i12 & 2) != 0) {
            userId = marketMarketAlbum.ownerId;
        }
        if ((i12 & 4) != 0) {
            str = marketMarketAlbum.title;
        }
        if ((i12 & 8) != 0) {
            i10 = marketMarketAlbum.count;
        }
        if ((i12 & 16) != 0) {
            i11 = marketMarketAlbum.updatedTime;
        }
        if ((i12 & 32) != 0) {
            bool = marketMarketAlbum.isMain;
        }
        if ((i12 & 64) != 0) {
            bool2 = marketMarketAlbum.isHidden;
        }
        if ((i12 & 128) != 0) {
            photosPhoto = marketMarketAlbum.photo;
        }
        Boolean bool3 = bool2;
        PhotosPhoto photosPhoto2 = photosPhoto;
        int i13 = i11;
        Boolean bool4 = bool;
        return marketMarketAlbum.copy(i, userId, str, i10, i13, bool4, bool3, photosPhoto2);
    }

    public final int component1() {
        return this.f15186id;
    }

    @NotNull
    public final UserId component2() {
        return this.ownerId;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.count;
    }

    public final int component5() {
        return this.updatedTime;
    }

    @Nullable
    public final Boolean component6() {
        return this.isMain;
    }

    @Nullable
    public final Boolean component7() {
        return this.isHidden;
    }

    @Nullable
    public final PhotosPhoto component8() {
        return this.photo;
    }

    @NotNull
    public final MarketMarketAlbum copy(int i, @NotNull UserId ownerId, @NotNull String title, int i10, int i11, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable PhotosPhoto photosPhoto) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new MarketMarketAlbum(i, ownerId, title, i10, i11, bool, bool2, photosPhoto);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketAlbum)) {
            return false;
        }
        MarketMarketAlbum marketMarketAlbum = (MarketMarketAlbum) obj;
        return this.f15186id == marketMarketAlbum.f15186id && Intrinsics.a(this.ownerId, marketMarketAlbum.ownerId) && Intrinsics.a(this.title, marketMarketAlbum.title) && this.count == marketMarketAlbum.count && this.updatedTime == marketMarketAlbum.updatedTime && Intrinsics.a(this.isMain, marketMarketAlbum.isMain) && Intrinsics.a(this.isHidden, marketMarketAlbum.isHidden) && Intrinsics.a(this.photo, marketMarketAlbum.photo);
    }

    public final int getCount() {
        return this.count;
    }

    public final int getId() {
        return this.f15186id;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getUpdatedTime() {
        return this.updatedTime;
    }

    public int hashCode() {
        int iG = u.g(this.updatedTime, u.g(this.count, a.e(o.e(this.ownerId, Integer.hashCode(this.f15186id) * 31, 31), 31, this.title), 31), 31);
        Boolean bool = this.isMain;
        int iHashCode = (iG + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isHidden;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photo;
        return iHashCode2 + (photosPhoto != null ? photosPhoto.hashCode() : 0);
    }

    @Nullable
    public final Boolean isHidden() {
        return this.isHidden;
    }

    @Nullable
    public final Boolean isMain() {
        return this.isMain;
    }

    @NotNull
    public String toString() {
        int i = this.f15186id;
        UserId userId = this.ownerId;
        String str = this.title;
        int i10 = this.count;
        int i11 = this.updatedTime;
        Boolean bool = this.isMain;
        Boolean bool2 = this.isHidden;
        PhotosPhoto photosPhoto = this.photo;
        StringBuilder sb2 = new StringBuilder("MarketMarketAlbum(id=");
        sb2.append(i);
        sb2.append(", ownerId=");
        sb2.append(userId);
        sb2.append(", title=");
        o.p(i10, str, ", count=", ", updatedTime=", sb2);
        sb2.append(i11);
        sb2.append(", isMain=");
        sb2.append(bool);
        sb2.append(", isHidden=");
        sb2.append(bool2);
        sb2.append(", photo=");
        sb2.append(photosPhoto);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ MarketMarketAlbum(int i, UserId userId, String str, int i10, int i11, Boolean bool, Boolean bool2, PhotosPhoto photosPhoto, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, str, i10, i11, (i12 & 32) != 0 ? null : bool, (i12 & 64) != 0 ? null : bool2, (i12 & 128) != 0 ? null : photosPhoto);
    }
}
