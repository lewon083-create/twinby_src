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
public final class BaseLikes {

    @b("count")
    @Nullable
    private final Integer count;

    @b("user_likes")
    @Nullable
    private final BaseBoolInt userLikes;

    public BaseLikes() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BaseLikes copy$default(BaseLikes baseLikes, Integer num, BaseBoolInt baseBoolInt, int i, Object obj) {
        if ((i & 1) != 0) {
            num = baseLikes.count;
        }
        if ((i & 2) != 0) {
            baseBoolInt = baseLikes.userLikes;
        }
        return baseLikes.copy(num, baseBoolInt);
    }

    @Nullable
    public final Integer component1() {
        return this.count;
    }

    @Nullable
    public final BaseBoolInt component2() {
        return this.userLikes;
    }

    @NotNull
    public final BaseLikes copy(@Nullable Integer num, @Nullable BaseBoolInt baseBoolInt) {
        return new BaseLikes(num, baseBoolInt);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLikes)) {
            return false;
        }
        BaseLikes baseLikes = (BaseLikes) obj;
        return Intrinsics.a(this.count, baseLikes.count) && this.userLikes == baseLikes.userLikes;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final BaseBoolInt getUserLikes() {
        return this.userLikes;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        BaseBoolInt baseBoolInt = this.userLikes;
        return iHashCode + (baseBoolInt != null ? baseBoolInt.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BaseLikes(count=" + this.count + ", userLikes=" + this.userLikes + ")";
    }

    public BaseLikes(@Nullable Integer num, @Nullable BaseBoolInt baseBoolInt) {
        this.count = num;
        this.userLikes = baseBoolInt;
    }

    public /* synthetic */ BaseLikes(Integer num, BaseBoolInt baseBoolInt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : baseBoolInt);
    }
}
