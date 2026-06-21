package com.vk.sdk.api.base.dto;

import a0.u;
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
public final class BaseLikesInfo {

    @b("can_like")
    @NotNull
    private final BaseBoolInt canLike;

    @b("can_publish")
    @Nullable
    private final BaseBoolInt canPublish;

    @b("count")
    private final int count;

    @b("user_likes")
    private final int userLikes;

    public BaseLikesInfo(@NotNull BaseBoolInt canLike, int i, int i10, @Nullable BaseBoolInt baseBoolInt) {
        Intrinsics.checkNotNullParameter(canLike, "canLike");
        this.canLike = canLike;
        this.count = i;
        this.userLikes = i10;
        this.canPublish = baseBoolInt;
    }

    public static /* synthetic */ BaseLikesInfo copy$default(BaseLikesInfo baseLikesInfo, BaseBoolInt baseBoolInt, int i, int i10, BaseBoolInt baseBoolInt2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            baseBoolInt = baseLikesInfo.canLike;
        }
        if ((i11 & 2) != 0) {
            i = baseLikesInfo.count;
        }
        if ((i11 & 4) != 0) {
            i10 = baseLikesInfo.userLikes;
        }
        if ((i11 & 8) != 0) {
            baseBoolInt2 = baseLikesInfo.canPublish;
        }
        return baseLikesInfo.copy(baseBoolInt, i, i10, baseBoolInt2);
    }

    @NotNull
    public final BaseBoolInt component1() {
        return this.canLike;
    }

    public final int component2() {
        return this.count;
    }

    public final int component3() {
        return this.userLikes;
    }

    @Nullable
    public final BaseBoolInt component4() {
        return this.canPublish;
    }

    @NotNull
    public final BaseLikesInfo copy(@NotNull BaseBoolInt canLike, int i, int i10, @Nullable BaseBoolInt baseBoolInt) {
        Intrinsics.checkNotNullParameter(canLike, "canLike");
        return new BaseLikesInfo(canLike, i, i10, baseBoolInt);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLikesInfo)) {
            return false;
        }
        BaseLikesInfo baseLikesInfo = (BaseLikesInfo) obj;
        return this.canLike == baseLikesInfo.canLike && this.count == baseLikesInfo.count && this.userLikes == baseLikesInfo.userLikes && this.canPublish == baseLikesInfo.canPublish;
    }

    @NotNull
    public final BaseBoolInt getCanLike() {
        return this.canLike;
    }

    @Nullable
    public final BaseBoolInt getCanPublish() {
        return this.canPublish;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getUserLikes() {
        return this.userLikes;
    }

    public int hashCode() {
        int iG = u.g(this.userLikes, u.g(this.count, this.canLike.hashCode() * 31, 31), 31);
        BaseBoolInt baseBoolInt = this.canPublish;
        return iG + (baseBoolInt == null ? 0 : baseBoolInt.hashCode());
    }

    @NotNull
    public String toString() {
        return "BaseLikesInfo(canLike=" + this.canLike + ", count=" + this.count + ", userLikes=" + this.userLikes + ", canPublish=" + this.canPublish + ")";
    }

    public /* synthetic */ BaseLikesInfo(BaseBoolInt baseBoolInt, int i, int i10, BaseBoolInt baseBoolInt2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseBoolInt, i, i10, (i11 & 8) != 0 ? null : baseBoolInt2);
    }
}
