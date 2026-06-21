package com.vk.sdk.api.link.dto;

import a0.u;
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
public final class LinkTargetObject {

    @b("item_id")
    @Nullable
    private final Integer itemId;

    @b("owner_id")
    @Nullable
    private final UserId ownerId;

    @b("type")
    @Nullable
    private final String type;

    public LinkTargetObject() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ LinkTargetObject copy$default(LinkTargetObject linkTargetObject, String str, UserId userId, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkTargetObject.type;
        }
        if ((i & 2) != 0) {
            userId = linkTargetObject.ownerId;
        }
        if ((i & 4) != 0) {
            num = linkTargetObject.itemId;
        }
        return linkTargetObject.copy(str, userId, num);
    }

    @Nullable
    public final String component1() {
        return this.type;
    }

    @Nullable
    public final UserId component2() {
        return this.ownerId;
    }

    @Nullable
    public final Integer component3() {
        return this.itemId;
    }

    @NotNull
    public final LinkTargetObject copy(@Nullable String str, @Nullable UserId userId, @Nullable Integer num) {
        return new LinkTargetObject(str, userId, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkTargetObject)) {
            return false;
        }
        LinkTargetObject linkTargetObject = (LinkTargetObject) obj;
        return Intrinsics.a(this.type, linkTargetObject.type) && Intrinsics.a(this.ownerId, linkTargetObject.ownerId) && Intrinsics.a(this.itemId, linkTargetObject.itemId);
    }

    @Nullable
    public final Integer getItemId() {
        return this.itemId;
    }

    @Nullable
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserId userId = this.ownerId;
        int iHashCode2 = (iHashCode + (userId == null ? 0 : userId.hashCode())) * 31;
        Integer num = this.itemId;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        UserId userId = this.ownerId;
        Integer num = this.itemId;
        StringBuilder sb2 = new StringBuilder("LinkTargetObject(type=");
        sb2.append(str);
        sb2.append(", ownerId=");
        sb2.append(userId);
        sb2.append(", itemId=");
        return u.m(sb2, num, ")");
    }

    public LinkTargetObject(@Nullable String str, @Nullable UserId userId, @Nullable Integer num) {
        this.type = str;
        this.ownerId = userId;
        this.itemId = num;
    }

    public /* synthetic */ LinkTargetObject(String str, UserId userId, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : num);
    }
}
