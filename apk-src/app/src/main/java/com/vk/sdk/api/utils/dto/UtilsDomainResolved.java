package com.vk.sdk.api.utils.dto;

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
public final class UtilsDomainResolved {

    @b("group_id")
    @Nullable
    private final UserId groupId;

    @b("object_id")
    @Nullable
    private final Integer objectId;

    @b("type")
    @Nullable
    private final UtilsDomainResolvedType type;

    public UtilsDomainResolved() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UtilsDomainResolved copy$default(UtilsDomainResolved utilsDomainResolved, Integer num, UserId userId, UtilsDomainResolvedType utilsDomainResolvedType, int i, Object obj) {
        if ((i & 1) != 0) {
            num = utilsDomainResolved.objectId;
        }
        if ((i & 2) != 0) {
            userId = utilsDomainResolved.groupId;
        }
        if ((i & 4) != 0) {
            utilsDomainResolvedType = utilsDomainResolved.type;
        }
        return utilsDomainResolved.copy(num, userId, utilsDomainResolvedType);
    }

    @Nullable
    public final Integer component1() {
        return this.objectId;
    }

    @Nullable
    public final UserId component2() {
        return this.groupId;
    }

    @Nullable
    public final UtilsDomainResolvedType component3() {
        return this.type;
    }

    @NotNull
    public final UtilsDomainResolved copy(@Nullable Integer num, @Nullable UserId userId, @Nullable UtilsDomainResolvedType utilsDomainResolvedType) {
        return new UtilsDomainResolved(num, userId, utilsDomainResolvedType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsDomainResolved)) {
            return false;
        }
        UtilsDomainResolved utilsDomainResolved = (UtilsDomainResolved) obj;
        return Intrinsics.a(this.objectId, utilsDomainResolved.objectId) && Intrinsics.a(this.groupId, utilsDomainResolved.groupId) && this.type == utilsDomainResolved.type;
    }

    @Nullable
    public final UserId getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final Integer getObjectId() {
        return this.objectId;
    }

    @Nullable
    public final UtilsDomainResolvedType getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.objectId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.groupId;
        int iHashCode2 = (iHashCode + (userId == null ? 0 : userId.hashCode())) * 31;
        UtilsDomainResolvedType utilsDomainResolvedType = this.type;
        return iHashCode2 + (utilsDomainResolvedType != null ? utilsDomainResolvedType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UtilsDomainResolved(objectId=" + this.objectId + ", groupId=" + this.groupId + ", type=" + this.type + ")";
    }

    public UtilsDomainResolved(@Nullable Integer num, @Nullable UserId userId, @Nullable UtilsDomainResolvedType utilsDomainResolvedType) {
        this.objectId = num;
        this.groupId = userId;
        this.type = utilsDomainResolvedType;
    }

    public /* synthetic */ UtilsDomainResolved(Integer num, UserId userId, UtilsDomainResolvedType utilsDomainResolvedType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : utilsDomainResolvedType);
    }
}
