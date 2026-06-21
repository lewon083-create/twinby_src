package com.vk.sdk.api.secure.dto;

import com.vk.dto.common.id.UserId;
import io.sentry.TraceContext;
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
public final class SecureGiveEventStickerItem {

    @b("status")
    @Nullable
    private final String status;

    @b(TraceContext.JsonKeys.USER_ID)
    @Nullable
    private final UserId userId;

    public SecureGiveEventStickerItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SecureGiveEventStickerItem copy$default(SecureGiveEventStickerItem secureGiveEventStickerItem, UserId userId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = secureGiveEventStickerItem.userId;
        }
        if ((i & 2) != 0) {
            str = secureGiveEventStickerItem.status;
        }
        return secureGiveEventStickerItem.copy(userId, str);
    }

    @Nullable
    public final UserId component1() {
        return this.userId;
    }

    @Nullable
    public final String component2() {
        return this.status;
    }

    @NotNull
    public final SecureGiveEventStickerItem copy(@Nullable UserId userId, @Nullable String str) {
        return new SecureGiveEventStickerItem(userId, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureGiveEventStickerItem)) {
            return false;
        }
        SecureGiveEventStickerItem secureGiveEventStickerItem = (SecureGiveEventStickerItem) obj;
        return Intrinsics.a(this.userId, secureGiveEventStickerItem.userId) && Intrinsics.a(this.status, secureGiveEventStickerItem.status);
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final UserId getUserId() {
        return this.userId;
    }

    public int hashCode() {
        UserId userId = this.userId;
        int iHashCode = (userId == null ? 0 : userId.hashCode()) * 31;
        String str = this.status;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SecureGiveEventStickerItem(userId=" + this.userId + ", status=" + this.status + ")";
    }

    public SecureGiveEventStickerItem(@Nullable UserId userId, @Nullable String str) {
        this.userId = userId;
        this.status = str;
    }

    public /* synthetic */ SecureGiveEventStickerItem(UserId userId, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str);
    }
}
