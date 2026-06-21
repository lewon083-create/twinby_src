package com.vk.sdk.api.base.dto;

import com.vk.sdk.api.wall.dto.WallWallpostCommentsDonut;
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
public final class BaseCommentsInfo {

    @b("can_close")
    @Nullable
    private final BaseBoolInt canClose;

    @b("can_open")
    @Nullable
    private final BaseBoolInt canOpen;

    @b("can_post")
    @Nullable
    private final BaseBoolInt canPost;

    @b("count")
    @Nullable
    private final Integer count;

    @b("donut")
    @Nullable
    private final WallWallpostCommentsDonut donut;

    @b("groups_can_post")
    @Nullable
    private final Boolean groupsCanPost;

    public BaseCommentsInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ BaseCommentsInfo copy$default(BaseCommentsInfo baseCommentsInfo, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, Integer num, Boolean bool, WallWallpostCommentsDonut wallWallpostCommentsDonut, int i, Object obj) {
        if ((i & 1) != 0) {
            baseBoolInt = baseCommentsInfo.canPost;
        }
        if ((i & 2) != 0) {
            baseBoolInt2 = baseCommentsInfo.canOpen;
        }
        if ((i & 4) != 0) {
            baseBoolInt3 = baseCommentsInfo.canClose;
        }
        if ((i & 8) != 0) {
            num = baseCommentsInfo.count;
        }
        if ((i & 16) != 0) {
            bool = baseCommentsInfo.groupsCanPost;
        }
        if ((i & 32) != 0) {
            wallWallpostCommentsDonut = baseCommentsInfo.donut;
        }
        Boolean bool2 = bool;
        WallWallpostCommentsDonut wallWallpostCommentsDonut2 = wallWallpostCommentsDonut;
        return baseCommentsInfo.copy(baseBoolInt, baseBoolInt2, baseBoolInt3, num, bool2, wallWallpostCommentsDonut2);
    }

    @Nullable
    public final BaseBoolInt component1() {
        return this.canPost;
    }

    @Nullable
    public final BaseBoolInt component2() {
        return this.canOpen;
    }

    @Nullable
    public final BaseBoolInt component3() {
        return this.canClose;
    }

    @Nullable
    public final Integer component4() {
        return this.count;
    }

    @Nullable
    public final Boolean component5() {
        return this.groupsCanPost;
    }

    @Nullable
    public final WallWallpostCommentsDonut component6() {
        return this.donut;
    }

    @NotNull
    public final BaseCommentsInfo copy(@Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable Integer num, @Nullable Boolean bool, @Nullable WallWallpostCommentsDonut wallWallpostCommentsDonut) {
        return new BaseCommentsInfo(baseBoolInt, baseBoolInt2, baseBoolInt3, num, bool, wallWallpostCommentsDonut);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCommentsInfo)) {
            return false;
        }
        BaseCommentsInfo baseCommentsInfo = (BaseCommentsInfo) obj;
        return this.canPost == baseCommentsInfo.canPost && this.canOpen == baseCommentsInfo.canOpen && this.canClose == baseCommentsInfo.canClose && Intrinsics.a(this.count, baseCommentsInfo.count) && Intrinsics.a(this.groupsCanPost, baseCommentsInfo.groupsCanPost) && Intrinsics.a(this.donut, baseCommentsInfo.donut);
    }

    @Nullable
    public final BaseBoolInt getCanClose() {
        return this.canClose;
    }

    @Nullable
    public final BaseBoolInt getCanOpen() {
        return this.canOpen;
    }

    @Nullable
    public final BaseBoolInt getCanPost() {
        return this.canPost;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final WallWallpostCommentsDonut getDonut() {
        return this.donut;
    }

    @Nullable
    public final Boolean getGroupsCanPost() {
        return this.groupsCanPost;
    }

    public int hashCode() {
        BaseBoolInt baseBoolInt = this.canPost;
        int iHashCode = (baseBoolInt == null ? 0 : baseBoolInt.hashCode()) * 31;
        BaseBoolInt baseBoolInt2 = this.canOpen;
        int iHashCode2 = (iHashCode + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.canClose;
        int iHashCode3 = (iHashCode2 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        Integer num = this.count;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.groupsCanPost;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        WallWallpostCommentsDonut wallWallpostCommentsDonut = this.donut;
        return iHashCode5 + (wallWallpostCommentsDonut != null ? wallWallpostCommentsDonut.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BaseCommentsInfo(canPost=" + this.canPost + ", canOpen=" + this.canOpen + ", canClose=" + this.canClose + ", count=" + this.count + ", groupsCanPost=" + this.groupsCanPost + ", donut=" + this.donut + ")";
    }

    public BaseCommentsInfo(@Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable Integer num, @Nullable Boolean bool, @Nullable WallWallpostCommentsDonut wallWallpostCommentsDonut) {
        this.canPost = baseBoolInt;
        this.canOpen = baseBoolInt2;
        this.canClose = baseBoolInt3;
        this.count = num;
        this.groupsCanPost = bool;
        this.donut = wallWallpostCommentsDonut;
    }

    public /* synthetic */ BaseCommentsInfo(BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, Integer num, Boolean bool, WallWallpostCommentsDonut wallWallpostCommentsDonut, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseBoolInt, (i & 2) != 0 ? null : baseBoolInt2, (i & 4) != 0 ? null : baseBoolInt3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : wallWallpostCommentsDonut);
    }
}
