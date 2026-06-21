package com.vk.sdk.api.base.dto;

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
public final class BaseRepostsInfo {

    @b("count")
    private final int count;

    @b("mail_count")
    @Nullable
    private final Integer mailCount;

    @b("user_reposted")
    @Nullable
    private final Integer userReposted;

    @b("wall_count")
    @Nullable
    private final Integer wallCount;

    public BaseRepostsInfo(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.count = i;
        this.wallCount = num;
        this.mailCount = num2;
        this.userReposted = num3;
    }

    public static /* synthetic */ BaseRepostsInfo copy$default(BaseRepostsInfo baseRepostsInfo, int i, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = baseRepostsInfo.count;
        }
        if ((i10 & 2) != 0) {
            num = baseRepostsInfo.wallCount;
        }
        if ((i10 & 4) != 0) {
            num2 = baseRepostsInfo.mailCount;
        }
        if ((i10 & 8) != 0) {
            num3 = baseRepostsInfo.userReposted;
        }
        return baseRepostsInfo.copy(i, num, num2, num3);
    }

    public final int component1() {
        return this.count;
    }

    @Nullable
    public final Integer component2() {
        return this.wallCount;
    }

    @Nullable
    public final Integer component3() {
        return this.mailCount;
    }

    @Nullable
    public final Integer component4() {
        return this.userReposted;
    }

    @NotNull
    public final BaseRepostsInfo copy(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        return new BaseRepostsInfo(i, num, num2, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseRepostsInfo)) {
            return false;
        }
        BaseRepostsInfo baseRepostsInfo = (BaseRepostsInfo) obj;
        return this.count == baseRepostsInfo.count && Intrinsics.a(this.wallCount, baseRepostsInfo.wallCount) && Intrinsics.a(this.mailCount, baseRepostsInfo.mailCount) && Intrinsics.a(this.userReposted, baseRepostsInfo.userReposted);
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final Integer getMailCount() {
        return this.mailCount;
    }

    @Nullable
    public final Integer getUserReposted() {
        return this.userReposted;
    }

    @Nullable
    public final Integer getWallCount() {
        return this.wallCount;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        Integer num = this.wallCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.mailCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.userReposted;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BaseRepostsInfo(count=" + this.count + ", wallCount=" + this.wallCount + ", mailCount=" + this.mailCount + ", userReposted=" + this.userReposted + ")";
    }

    public /* synthetic */ BaseRepostsInfo(int i, Integer num, Integer num2, Integer num3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : num3);
    }
}
