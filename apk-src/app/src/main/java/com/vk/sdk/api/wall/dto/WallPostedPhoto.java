package com.vk.sdk.api.wall.dto;

import com.google.android.gms.internal.ads.om1;
import com.vk.dto.common.id.UserId;
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
public final class WallPostedPhoto {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15258id;

    @b("owner_id")
    @Nullable
    private final UserId ownerId;

    @b("photo_130")
    @Nullable
    private final String photo130;

    @b("photo_604")
    @Nullable
    private final String photo604;

    public WallPostedPhoto() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WallPostedPhoto copy$default(WallPostedPhoto wallPostedPhoto, Integer num, UserId userId, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = wallPostedPhoto.f15258id;
        }
        if ((i & 2) != 0) {
            userId = wallPostedPhoto.ownerId;
        }
        if ((i & 4) != 0) {
            str = wallPostedPhoto.photo130;
        }
        if ((i & 8) != 0) {
            str2 = wallPostedPhoto.photo604;
        }
        return wallPostedPhoto.copy(num, userId, str, str2);
    }

    @Nullable
    public final Integer component1() {
        return this.f15258id;
    }

    @Nullable
    public final UserId component2() {
        return this.ownerId;
    }

    @Nullable
    public final String component3() {
        return this.photo130;
    }

    @Nullable
    public final String component4() {
        return this.photo604;
    }

    @NotNull
    public final WallPostedPhoto copy(@Nullable Integer num, @Nullable UserId userId, @Nullable String str, @Nullable String str2) {
        return new WallPostedPhoto(num, userId, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostedPhoto)) {
            return false;
        }
        WallPostedPhoto wallPostedPhoto = (WallPostedPhoto) obj;
        return Intrinsics.a(this.f15258id, wallPostedPhoto.f15258id) && Intrinsics.a(this.ownerId, wallPostedPhoto.ownerId) && Intrinsics.a(this.photo130, wallPostedPhoto.photo130) && Intrinsics.a(this.photo604, wallPostedPhoto.photo604);
    }

    @Nullable
    public final Integer getId() {
        return this.f15258id;
    }

    @Nullable
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getPhoto130() {
        return this.photo130;
    }

    @Nullable
    public final String getPhoto604() {
        return this.photo604;
    }

    public int hashCode() {
        Integer num = this.f15258id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.ownerId;
        int iHashCode2 = (iHashCode + (userId == null ? 0 : userId.hashCode())) * 31;
        String str = this.photo130;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo604;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.f15258id;
        UserId userId = this.ownerId;
        String str = this.photo130;
        String str2 = this.photo604;
        StringBuilder sb2 = new StringBuilder("WallPostedPhoto(id=");
        sb2.append(num);
        sb2.append(", ownerId=");
        sb2.append(userId);
        sb2.append(", photo130=");
        return om1.n(sb2, str, ", photo604=", str2, ")");
    }

    public WallPostedPhoto(@Nullable Integer num, @Nullable UserId userId, @Nullable String str, @Nullable String str2) {
        this.f15258id = num;
        this.ownerId = userId;
        this.photo130 = str;
        this.photo604 = str2;
    }

    public /* synthetic */ WallPostedPhoto(Integer num, UserId userId, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
