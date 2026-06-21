package com.vk.sdk.api.photos.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import io.sentry.TraceContext;
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
public final class PhotosPhotoTag {

    @b("date")
    private final int date;

    @b("description")
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15220id;

    @b("placer_id")
    private final int placerId;

    @b("tagged_name")
    @NotNull
    private final String taggedName;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final UserId userId;

    @b("viewed")
    @NotNull
    private final BaseBoolInt viewed;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @b("x")
    private final float f15221x;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @b("x2")
    private final float f15222x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @b("y")
    private final float f15223y;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @b("y2")
    private final float f15224y2;

    public PhotosPhotoTag(int i, int i10, int i11, @NotNull String taggedName, @NotNull UserId userId, @NotNull BaseBoolInt viewed, float f10, float f11, float f12, float f13, @Nullable String str) {
        Intrinsics.checkNotNullParameter(taggedName, "taggedName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(viewed, "viewed");
        this.date = i;
        this.f15220id = i10;
        this.placerId = i11;
        this.taggedName = taggedName;
        this.userId = userId;
        this.viewed = viewed;
        this.f15221x = f10;
        this.f15222x2 = f11;
        this.f15223y = f12;
        this.f15224y2 = f13;
        this.description = str;
    }

    public static /* synthetic */ PhotosPhotoTag copy$default(PhotosPhotoTag photosPhotoTag, int i, int i10, int i11, String str, UserId userId, BaseBoolInt baseBoolInt, float f10, float f11, float f12, float f13, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = photosPhotoTag.date;
        }
        if ((i12 & 2) != 0) {
            i10 = photosPhotoTag.f15220id;
        }
        if ((i12 & 4) != 0) {
            i11 = photosPhotoTag.placerId;
        }
        if ((i12 & 8) != 0) {
            str = photosPhotoTag.taggedName;
        }
        if ((i12 & 16) != 0) {
            userId = photosPhotoTag.userId;
        }
        if ((i12 & 32) != 0) {
            baseBoolInt = photosPhotoTag.viewed;
        }
        if ((i12 & 64) != 0) {
            f10 = photosPhotoTag.f15221x;
        }
        if ((i12 & 128) != 0) {
            f11 = photosPhotoTag.f15222x2;
        }
        if ((i12 & 256) != 0) {
            f12 = photosPhotoTag.f15223y;
        }
        if ((i12 & 512) != 0) {
            f13 = photosPhotoTag.f15224y2;
        }
        if ((i12 & 1024) != 0) {
            str2 = photosPhotoTag.description;
        }
        float f14 = f13;
        String str3 = str2;
        float f15 = f11;
        float f16 = f12;
        BaseBoolInt baseBoolInt2 = baseBoolInt;
        float f17 = f10;
        UserId userId2 = userId;
        int i13 = i11;
        return photosPhotoTag.copy(i, i10, i13, str, userId2, baseBoolInt2, f17, f15, f16, f14, str3);
    }

    public final int component1() {
        return this.date;
    }

    public final float component10() {
        return this.f15224y2;
    }

    @Nullable
    public final String component11() {
        return this.description;
    }

    public final int component2() {
        return this.f15220id;
    }

    public final int component3() {
        return this.placerId;
    }

    @NotNull
    public final String component4() {
        return this.taggedName;
    }

    @NotNull
    public final UserId component5() {
        return this.userId;
    }

    @NotNull
    public final BaseBoolInt component6() {
        return this.viewed;
    }

    public final float component7() {
        return this.f15221x;
    }

    public final float component8() {
        return this.f15222x2;
    }

    public final float component9() {
        return this.f15223y;
    }

    @NotNull
    public final PhotosPhotoTag copy(int i, int i10, int i11, @NotNull String taggedName, @NotNull UserId userId, @NotNull BaseBoolInt viewed, float f10, float f11, float f12, float f13, @Nullable String str) {
        Intrinsics.checkNotNullParameter(taggedName, "taggedName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(viewed, "viewed");
        return new PhotosPhotoTag(i, i10, i11, taggedName, userId, viewed, f10, f11, f12, f13, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoTag)) {
            return false;
        }
        PhotosPhotoTag photosPhotoTag = (PhotosPhotoTag) obj;
        return this.date == photosPhotoTag.date && this.f15220id == photosPhotoTag.f15220id && this.placerId == photosPhotoTag.placerId && Intrinsics.a(this.taggedName, photosPhotoTag.taggedName) && Intrinsics.a(this.userId, photosPhotoTag.userId) && this.viewed == photosPhotoTag.viewed && Float.valueOf(this.f15221x).equals(Float.valueOf(photosPhotoTag.f15221x)) && Float.valueOf(this.f15222x2).equals(Float.valueOf(photosPhotoTag.f15222x2)) && Float.valueOf(this.f15223y).equals(Float.valueOf(photosPhotoTag.f15223y)) && Float.valueOf(this.f15224y2).equals(Float.valueOf(photosPhotoTag.f15224y2)) && Intrinsics.a(this.description, photosPhotoTag.description);
    }

    public final int getDate() {
        return this.date;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.f15220id;
    }

    public final int getPlacerId() {
        return this.placerId;
    }

    @NotNull
    public final String getTaggedName() {
        return this.taggedName;
    }

    @NotNull
    public final UserId getUserId() {
        return this.userId;
    }

    @NotNull
    public final BaseBoolInt getViewed() {
        return this.viewed;
    }

    public final float getX() {
        return this.f15221x;
    }

    public final float getX2() {
        return this.f15222x2;
    }

    public final float getY() {
        return this.f15223y;
    }

    public final float getY2() {
        return this.f15224y2;
    }

    public int hashCode() {
        int iB = o.b(this.f15224y2, o.b(this.f15223y, o.b(this.f15222x2, o.b(this.f15221x, a.f(this.viewed, o.e(this.userId, a.e(u.g(this.placerId, u.g(this.f15220id, Integer.hashCode(this.date) * 31, 31), 31), 31, this.taggedName), 31), 31), 31), 31), 31), 31);
        String str = this.description;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.date;
        int i10 = this.f15220id;
        int i11 = this.placerId;
        String str = this.taggedName;
        UserId userId = this.userId;
        BaseBoolInt baseBoolInt = this.viewed;
        float f10 = this.f15221x;
        float f11 = this.f15222x2;
        float f12 = this.f15223y;
        float f13 = this.f15224y2;
        String str2 = this.description;
        StringBuilder sbI = z.i("PhotosPhotoTag(date=", i, ", id=", i10, ", placerId=");
        a.q(i11, ", taggedName=", str, ", userId=", sbI);
        sbI.append(userId);
        sbI.append(", viewed=");
        sbI.append(baseBoolInt);
        sbI.append(", x=");
        sbI.append(f10);
        sbI.append(", x2=");
        sbI.append(f11);
        sbI.append(", y=");
        sbI.append(f12);
        sbI.append(", y2=");
        sbI.append(f13);
        sbI.append(", description=");
        return u.o(sbI, str2, ")");
    }

    public /* synthetic */ PhotosPhotoTag(int i, int i10, int i11, String str, UserId userId, BaseBoolInt baseBoolInt, float f10, float f11, float f12, float f13, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, str, userId, baseBoolInt, f10, f11, f12, f13, (i12 & 1024) != 0 ? null : str2);
    }
}
