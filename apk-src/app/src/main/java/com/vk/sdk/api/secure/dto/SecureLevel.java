package com.vk.sdk.api.secure.dto;

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
public final class SecureLevel {

    @b("level")
    @Nullable
    private final Integer level;

    @b("uid")
    @Nullable
    private final Integer uid;

    public SecureLevel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SecureLevel copy$default(SecureLevel secureLevel, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = secureLevel.level;
        }
        if ((i & 2) != 0) {
            num2 = secureLevel.uid;
        }
        return secureLevel.copy(num, num2);
    }

    @Nullable
    public final Integer component1() {
        return this.level;
    }

    @Nullable
    public final Integer component2() {
        return this.uid;
    }

    @NotNull
    public final SecureLevel copy(@Nullable Integer num, @Nullable Integer num2) {
        return new SecureLevel(num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureLevel)) {
            return false;
        }
        SecureLevel secureLevel = (SecureLevel) obj;
        return Intrinsics.a(this.level, secureLevel.level) && Intrinsics.a(this.uid, secureLevel.uid);
    }

    @Nullable
    public final Integer getLevel() {
        return this.level;
    }

    @Nullable
    public final Integer getUid() {
        return this.uid;
    }

    public int hashCode() {
        Integer num = this.level;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.uid;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SecureLevel(level=" + this.level + ", uid=" + this.uid + ")";
    }

    public SecureLevel(@Nullable Integer num, @Nullable Integer num2) {
        this.level = num;
        this.uid = num2;
    }

    public /* synthetic */ SecureLevel(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
