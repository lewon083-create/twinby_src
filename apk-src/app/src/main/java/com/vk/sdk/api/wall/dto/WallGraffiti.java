package com.vk.sdk.api.wall.dto;

import com.vk.dto.common.id.UserId;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;

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
public final class WallGraffiti {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("height")
    @Nullable
    private final Integer height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15256id;

    @b("owner_id")
    @Nullable
    private final UserId ownerId;

    @b("photo_200")
    @Nullable
    private final String photo200;

    @b("photo_586")
    @Nullable
    private final String photo586;

    @b("url")
    @Nullable
    private final String url;

    @b("width")
    @Nullable
    private final Integer width;

    public WallGraffiti() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public static /* synthetic */ WallGraffiti copy$default(WallGraffiti wallGraffiti, Integer num, UserId userId, String str, String str2, Integer num2, String str3, Integer num3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = wallGraffiti.f15256id;
        }
        if ((i & 2) != 0) {
            userId = wallGraffiti.ownerId;
        }
        if ((i & 4) != 0) {
            str = wallGraffiti.photo200;
        }
        if ((i & 8) != 0) {
            str2 = wallGraffiti.photo586;
        }
        if ((i & 16) != 0) {
            num2 = wallGraffiti.height;
        }
        if ((i & 32) != 0) {
            str3 = wallGraffiti.url;
        }
        if ((i & 64) != 0) {
            num3 = wallGraffiti.width;
        }
        if ((i & 128) != 0) {
            str4 = wallGraffiti.accessKey;
        }
        Integer num4 = num3;
        String str5 = str4;
        Integer num5 = num2;
        String str6 = str3;
        return wallGraffiti.copy(num, userId, str, str2, num5, str6, num4, str5);
    }

    @Nullable
    public final Integer component1() {
        return this.f15256id;
    }

    @Nullable
    public final UserId component2() {
        return this.ownerId;
    }

    @Nullable
    public final String component3() {
        return this.photo200;
    }

    @Nullable
    public final String component4() {
        return this.photo586;
    }

    @Nullable
    public final Integer component5() {
        return this.height;
    }

    @Nullable
    public final String component6() {
        return this.url;
    }

    @Nullable
    public final Integer component7() {
        return this.width;
    }

    @Nullable
    public final String component8() {
        return this.accessKey;
    }

    @NotNull
    public final WallGraffiti copy(@Nullable Integer num, @Nullable UserId userId, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable String str3, @Nullable Integer num3, @Nullable String str4) {
        return new WallGraffiti(num, userId, str, str2, num2, str3, num3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGraffiti)) {
            return false;
        }
        WallGraffiti wallGraffiti = (WallGraffiti) obj;
        return Intrinsics.a(this.f15256id, wallGraffiti.f15256id) && Intrinsics.a(this.ownerId, wallGraffiti.ownerId) && Intrinsics.a(this.photo200, wallGraffiti.photo200) && Intrinsics.a(this.photo586, wallGraffiti.photo586) && Intrinsics.a(this.height, wallGraffiti.height) && Intrinsics.a(this.url, wallGraffiti.url) && Intrinsics.a(this.width, wallGraffiti.width) && Intrinsics.a(this.accessKey, wallGraffiti.accessKey);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final Integer getId() {
        return this.f15256id;
    }

    @Nullable
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getPhoto200() {
        return this.photo200;
    }

    @Nullable
    public final String getPhoto586() {
        return this.photo586;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.f15256id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.ownerId;
        int iHashCode2 = (iHashCode + (userId == null ? 0 : userId.hashCode())) * 31;
        String str = this.photo200;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo586;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.width;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.accessKey;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.f15256id;
        UserId userId = this.ownerId;
        String str = this.photo200;
        String str2 = this.photo586;
        Integer num2 = this.height;
        String str3 = this.url;
        Integer num3 = this.width;
        String str4 = this.accessKey;
        StringBuilder sb2 = new StringBuilder("WallGraffiti(id=");
        sb2.append(num);
        sb2.append(", ownerId=");
        sb2.append(userId);
        sb2.append(", photo200=");
        o.t(sb2, str, ", photo586=", str2, ", height=");
        a.r(num2, ", url=", str3, ", width=", sb2);
        sb2.append(num3);
        sb2.append(", accessKey=");
        sb2.append(str4);
        sb2.append(")");
        return sb2.toString();
    }

    public WallGraffiti(@Nullable Integer num, @Nullable UserId userId, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable String str3, @Nullable Integer num3, @Nullable String str4) {
        this.f15256id = num;
        this.ownerId = userId;
        this.photo200 = str;
        this.photo586 = str2;
        this.height = num2;
        this.url = str3;
        this.width = num3;
        this.accessKey = str4;
    }

    public /* synthetic */ WallGraffiti(Integer num, UserId userId, String str, String str2, Integer num2, String str3, Integer num3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : str4);
    }
}
