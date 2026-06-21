package com.vk.sdk.api.video.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
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
public final class VideoLiveInfo {

    @b("enabled")
    @NotNull
    private final BaseBoolInt enabled;

    @b("is_notifications_blocked")
    @Nullable
    private final BaseBoolInt isNotificationsBlocked;

    public VideoLiveInfo(@NotNull BaseBoolInt enabled, @Nullable BaseBoolInt baseBoolInt) {
        Intrinsics.checkNotNullParameter(enabled, "enabled");
        this.enabled = enabled;
        this.isNotificationsBlocked = baseBoolInt;
    }

    public static /* synthetic */ VideoLiveInfo copy$default(VideoLiveInfo videoLiveInfo, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, int i, Object obj) {
        if ((i & 1) != 0) {
            baseBoolInt = videoLiveInfo.enabled;
        }
        if ((i & 2) != 0) {
            baseBoolInt2 = videoLiveInfo.isNotificationsBlocked;
        }
        return videoLiveInfo.copy(baseBoolInt, baseBoolInt2);
    }

    @NotNull
    public final BaseBoolInt component1() {
        return this.enabled;
    }

    @Nullable
    public final BaseBoolInt component2() {
        return this.isNotificationsBlocked;
    }

    @NotNull
    public final VideoLiveInfo copy(@NotNull BaseBoolInt enabled, @Nullable BaseBoolInt baseBoolInt) {
        Intrinsics.checkNotNullParameter(enabled, "enabled");
        return new VideoLiveInfo(enabled, baseBoolInt);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveInfo)) {
            return false;
        }
        VideoLiveInfo videoLiveInfo = (VideoLiveInfo) obj;
        return this.enabled == videoLiveInfo.enabled && this.isNotificationsBlocked == videoLiveInfo.isNotificationsBlocked;
    }

    @NotNull
    public final BaseBoolInt getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        int iHashCode = this.enabled.hashCode() * 31;
        BaseBoolInt baseBoolInt = this.isNotificationsBlocked;
        return iHashCode + (baseBoolInt == null ? 0 : baseBoolInt.hashCode());
    }

    @Nullable
    public final BaseBoolInt isNotificationsBlocked() {
        return this.isNotificationsBlocked;
    }

    @NotNull
    public String toString() {
        return "VideoLiveInfo(enabled=" + this.enabled + ", isNotificationsBlocked=" + this.isNotificationsBlocked + ")";
    }

    public /* synthetic */ VideoLiveInfo(BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseBoolInt, (i & 2) != 0 ? null : baseBoolInt2);
    }
}
