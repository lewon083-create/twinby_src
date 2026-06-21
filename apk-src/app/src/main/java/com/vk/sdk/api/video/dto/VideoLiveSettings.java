package com.vk.sdk.api.video.dto;

import a0.u;
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
public final class VideoLiveSettings {

    @b("can_rewind")
    @Nullable
    private final BaseBoolInt canRewind;

    @b("is_endless")
    @Nullable
    private final BaseBoolInt isEndless;

    @b("max_duration")
    @Nullable
    private final Integer maxDuration;

    public VideoLiveSettings() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ VideoLiveSettings copy$default(VideoLiveSettings videoLiveSettings, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            baseBoolInt = videoLiveSettings.canRewind;
        }
        if ((i & 2) != 0) {
            baseBoolInt2 = videoLiveSettings.isEndless;
        }
        if ((i & 4) != 0) {
            num = videoLiveSettings.maxDuration;
        }
        return videoLiveSettings.copy(baseBoolInt, baseBoolInt2, num);
    }

    @Nullable
    public final BaseBoolInt component1() {
        return this.canRewind;
    }

    @Nullable
    public final BaseBoolInt component2() {
        return this.isEndless;
    }

    @Nullable
    public final Integer component3() {
        return this.maxDuration;
    }

    @NotNull
    public final VideoLiveSettings copy(@Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable Integer num) {
        return new VideoLiveSettings(baseBoolInt, baseBoolInt2, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveSettings)) {
            return false;
        }
        VideoLiveSettings videoLiveSettings = (VideoLiveSettings) obj;
        return this.canRewind == videoLiveSettings.canRewind && this.isEndless == videoLiveSettings.isEndless && Intrinsics.a(this.maxDuration, videoLiveSettings.maxDuration);
    }

    @Nullable
    public final BaseBoolInt getCanRewind() {
        return this.canRewind;
    }

    @Nullable
    public final Integer getMaxDuration() {
        return this.maxDuration;
    }

    public int hashCode() {
        BaseBoolInt baseBoolInt = this.canRewind;
        int iHashCode = (baseBoolInt == null ? 0 : baseBoolInt.hashCode()) * 31;
        BaseBoolInt baseBoolInt2 = this.isEndless;
        int iHashCode2 = (iHashCode + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        Integer num = this.maxDuration;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Nullable
    public final BaseBoolInt isEndless() {
        return this.isEndless;
    }

    @NotNull
    public String toString() {
        BaseBoolInt baseBoolInt = this.canRewind;
        BaseBoolInt baseBoolInt2 = this.isEndless;
        Integer num = this.maxDuration;
        StringBuilder sb2 = new StringBuilder("VideoLiveSettings(canRewind=");
        sb2.append(baseBoolInt);
        sb2.append(", isEndless=");
        sb2.append(baseBoolInt2);
        sb2.append(", maxDuration=");
        return u.m(sb2, num, ")");
    }

    public VideoLiveSettings(@Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable Integer num) {
        this.canRewind = baseBoolInt;
        this.isEndless = baseBoolInt2;
        this.maxDuration = num;
    }

    public /* synthetic */ VideoLiveSettings(BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseBoolInt, (i & 2) != 0 ? null : baseBoolInt2, (i & 4) != 0 ? null : num);
    }
}
