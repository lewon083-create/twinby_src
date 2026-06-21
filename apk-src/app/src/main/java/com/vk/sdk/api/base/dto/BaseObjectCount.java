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
public final class BaseObjectCount {

    @b("count")
    @Nullable
    private final Integer count;

    public BaseObjectCount() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BaseObjectCount copy$default(BaseObjectCount baseObjectCount, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = baseObjectCount.count;
        }
        return baseObjectCount.copy(num);
    }

    @Nullable
    public final Integer component1() {
        return this.count;
    }

    @NotNull
    public final BaseObjectCount copy(@Nullable Integer num) {
        return new BaseObjectCount(num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseObjectCount) && Intrinsics.a(this.count, ((BaseObjectCount) obj).count);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    public int hashCode() {
        Integer num = this.count;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public String toString() {
        return "BaseObjectCount(count=" + this.count + ")";
    }

    public BaseObjectCount(@Nullable Integer num) {
        this.count = num;
    }

    public /* synthetic */ BaseObjectCount(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
