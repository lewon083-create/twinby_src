package com.vk.sdk.api.wall.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public final class WallRepostResponse {

    @b("likes_count")
    private final int likesCount;

    @b("mail_repost_count")
    @Nullable
    private final Integer mailRepostCount;

    @b("post_id")
    private final int postId;

    @b("reposts_count")
    private final int repostsCount;

    @b("success")
    private final int success;

    @b("wall_repost_count")
    @Nullable
    private final Integer wallRepostCount;

    public WallRepostResponse(int i, int i10, int i11, int i12, @Nullable Integer num, @Nullable Integer num2) {
        this.success = i;
        this.postId = i10;
        this.repostsCount = i11;
        this.likesCount = i12;
        this.wallRepostCount = num;
        this.mailRepostCount = num2;
    }

    public static /* synthetic */ WallRepostResponse copy$default(WallRepostResponse wallRepostResponse, int i, int i10, int i11, int i12, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = wallRepostResponse.success;
        }
        if ((i13 & 2) != 0) {
            i10 = wallRepostResponse.postId;
        }
        if ((i13 & 4) != 0) {
            i11 = wallRepostResponse.repostsCount;
        }
        if ((i13 & 8) != 0) {
            i12 = wallRepostResponse.likesCount;
        }
        if ((i13 & 16) != 0) {
            num = wallRepostResponse.wallRepostCount;
        }
        if ((i13 & 32) != 0) {
            num2 = wallRepostResponse.mailRepostCount;
        }
        Integer num3 = num;
        Integer num4 = num2;
        return wallRepostResponse.copy(i, i10, i11, i12, num3, num4);
    }

    public final int component1() {
        return this.success;
    }

    public final int component2() {
        return this.postId;
    }

    public final int component3() {
        return this.repostsCount;
    }

    public final int component4() {
        return this.likesCount;
    }

    @Nullable
    public final Integer component5() {
        return this.wallRepostCount;
    }

    @Nullable
    public final Integer component6() {
        return this.mailRepostCount;
    }

    @NotNull
    public final WallRepostResponse copy(int i, int i10, int i11, int i12, @Nullable Integer num, @Nullable Integer num2) {
        return new WallRepostResponse(i, i10, i11, i12, num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallRepostResponse)) {
            return false;
        }
        WallRepostResponse wallRepostResponse = (WallRepostResponse) obj;
        return this.success == wallRepostResponse.success && this.postId == wallRepostResponse.postId && this.repostsCount == wallRepostResponse.repostsCount && this.likesCount == wallRepostResponse.likesCount && Intrinsics.a(this.wallRepostCount, wallRepostResponse.wallRepostCount) && Intrinsics.a(this.mailRepostCount, wallRepostResponse.mailRepostCount);
    }

    public final int getLikesCount() {
        return this.likesCount;
    }

    @Nullable
    public final Integer getMailRepostCount() {
        return this.mailRepostCount;
    }

    public final int getPostId() {
        return this.postId;
    }

    public final int getRepostsCount() {
        return this.repostsCount;
    }

    public final int getSuccess() {
        return this.success;
    }

    @Nullable
    public final Integer getWallRepostCount() {
        return this.wallRepostCount;
    }

    public int hashCode() {
        int iG = u.g(this.likesCount, u.g(this.repostsCount, u.g(this.postId, Integer.hashCode(this.success) * 31, 31), 31), 31);
        Integer num = this.wallRepostCount;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.mailRepostCount;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.success;
        int i10 = this.postId;
        int i11 = this.repostsCount;
        int i12 = this.likesCount;
        Integer num = this.wallRepostCount;
        Integer num2 = this.mailRepostCount;
        StringBuilder sbI = z.i("WallRepostResponse(success=", i, ", postId=", i10, ", repostsCount=");
        om1.t(sbI, i11, ", likesCount=", i12, ", wallRepostCount=");
        sbI.append(num);
        sbI.append(", mailRepostCount=");
        sbI.append(num2);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ WallRepostResponse(int i, int i10, int i11, int i12, Integer num, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, i12, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : num2);
    }
}
