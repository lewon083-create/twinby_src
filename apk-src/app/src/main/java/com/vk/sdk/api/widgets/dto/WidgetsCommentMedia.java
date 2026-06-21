package com.vk.sdk.api.widgets.dto;

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
public final class WidgetsCommentMedia {

    @b("item_id")
    @Nullable
    private final Integer itemId;

    @b("owner_id")
    @Nullable
    private final UserId ownerId;

    @b("thumb_src")
    @Nullable
    private final String thumbSrc;

    @b("type")
    @Nullable
    private final WidgetsCommentMediaType type;

    public WidgetsCommentMedia() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WidgetsCommentMedia copy$default(WidgetsCommentMedia widgetsCommentMedia, Integer num, UserId userId, String str, WidgetsCommentMediaType widgetsCommentMediaType, int i, Object obj) {
        if ((i & 1) != 0) {
            num = widgetsCommentMedia.itemId;
        }
        if ((i & 2) != 0) {
            userId = widgetsCommentMedia.ownerId;
        }
        if ((i & 4) != 0) {
            str = widgetsCommentMedia.thumbSrc;
        }
        if ((i & 8) != 0) {
            widgetsCommentMediaType = widgetsCommentMedia.type;
        }
        return widgetsCommentMedia.copy(num, userId, str, widgetsCommentMediaType);
    }

    @Nullable
    public final Integer component1() {
        return this.itemId;
    }

    @Nullable
    public final UserId component2() {
        return this.ownerId;
    }

    @Nullable
    public final String component3() {
        return this.thumbSrc;
    }

    @Nullable
    public final WidgetsCommentMediaType component4() {
        return this.type;
    }

    @NotNull
    public final WidgetsCommentMedia copy(@Nullable Integer num, @Nullable UserId userId, @Nullable String str, @Nullable WidgetsCommentMediaType widgetsCommentMediaType) {
        return new WidgetsCommentMedia(num, userId, str, widgetsCommentMediaType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsCommentMedia)) {
            return false;
        }
        WidgetsCommentMedia widgetsCommentMedia = (WidgetsCommentMedia) obj;
        return Intrinsics.a(this.itemId, widgetsCommentMedia.itemId) && Intrinsics.a(this.ownerId, widgetsCommentMedia.ownerId) && Intrinsics.a(this.thumbSrc, widgetsCommentMedia.thumbSrc) && this.type == widgetsCommentMedia.type;
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
    public final String getThumbSrc() {
        return this.thumbSrc;
    }

    @Nullable
    public final WidgetsCommentMediaType getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.itemId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.ownerId;
        int iHashCode2 = (iHashCode + (userId == null ? 0 : userId.hashCode())) * 31;
        String str = this.thumbSrc;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        WidgetsCommentMediaType widgetsCommentMediaType = this.type;
        return iHashCode3 + (widgetsCommentMediaType != null ? widgetsCommentMediaType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WidgetsCommentMedia(itemId=" + this.itemId + ", ownerId=" + this.ownerId + ", thumbSrc=" + this.thumbSrc + ", type=" + this.type + ")";
    }

    public WidgetsCommentMedia(@Nullable Integer num, @Nullable UserId userId, @Nullable String str, @Nullable WidgetsCommentMediaType widgetsCommentMediaType) {
        this.itemId = num;
        this.ownerId = userId;
        this.thumbSrc = str;
        this.type = widgetsCommentMediaType;
    }

    public /* synthetic */ WidgetsCommentMedia(Integer num, UserId userId, String str, WidgetsCommentMediaType widgetsCommentMediaType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : widgetsCommentMediaType);
    }
}
