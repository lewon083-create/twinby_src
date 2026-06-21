package io.sentry.android.replay.video;

import a0.u;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@StabilityInferred(parameters = 0)
@Metadata
@SuppressLint({"UseRequiresApi"})
@TargetApi(24)
public final class MuxerConfig {
    public static final int $stable = 8;
    private final int bitRate;

    @NotNull
    private final File file;
    private final int frameRate;

    @NotNull
    private final String mimeType;
    private int recordingHeight;
    private int recordingWidth;

    public MuxerConfig(@NotNull File file, int i, int i10, int i11, int i12, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.file = file;
        this.recordingWidth = i;
        this.recordingHeight = i10;
        this.frameRate = i11;
        this.bitRate = i12;
        this.mimeType = mimeType;
    }

    public static /* synthetic */ MuxerConfig copy$default(MuxerConfig muxerConfig, File file, int i, int i10, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            file = muxerConfig.file;
        }
        if ((i13 & 2) != 0) {
            i = muxerConfig.recordingWidth;
        }
        if ((i13 & 4) != 0) {
            i10 = muxerConfig.recordingHeight;
        }
        if ((i13 & 8) != 0) {
            i11 = muxerConfig.frameRate;
        }
        if ((i13 & 16) != 0) {
            i12 = muxerConfig.bitRate;
        }
        if ((i13 & 32) != 0) {
            str = muxerConfig.mimeType;
        }
        int i14 = i12;
        String str2 = str;
        return muxerConfig.copy(file, i, i10, i11, i14, str2);
    }

    @NotNull
    public final File component1() {
        return this.file;
    }

    public final int component2() {
        return this.recordingWidth;
    }

    public final int component3() {
        return this.recordingHeight;
    }

    public final int component4() {
        return this.frameRate;
    }

    public final int component5() {
        return this.bitRate;
    }

    @NotNull
    public final String component6() {
        return this.mimeType;
    }

    @NotNull
    public final MuxerConfig copy(@NotNull File file, int i, int i10, int i11, int i12, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new MuxerConfig(file, i, i10, i11, i12, mimeType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MuxerConfig)) {
            return false;
        }
        MuxerConfig muxerConfig = (MuxerConfig) obj;
        return Intrinsics.a(this.file, muxerConfig.file) && this.recordingWidth == muxerConfig.recordingWidth && this.recordingHeight == muxerConfig.recordingHeight && this.frameRate == muxerConfig.frameRate && this.bitRate == muxerConfig.bitRate && Intrinsics.a(this.mimeType, muxerConfig.mimeType);
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public int hashCode() {
        return this.mimeType.hashCode() + u.g(this.bitRate, u.g(this.frameRate, u.g(this.recordingHeight, u.g(this.recordingWidth, this.file.hashCode() * 31, 31), 31), 31), 31);
    }

    public final void setRecordingHeight(int i) {
        this.recordingHeight = i;
    }

    public final void setRecordingWidth(int i) {
        this.recordingWidth = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MuxerConfig(file=");
        sb2.append(this.file);
        sb2.append(", recordingWidth=");
        sb2.append(this.recordingWidth);
        sb2.append(", recordingHeight=");
        sb2.append(this.recordingHeight);
        sb2.append(", frameRate=");
        sb2.append(this.frameRate);
        sb2.append(", bitRate=");
        sb2.append(this.bitRate);
        sb2.append(", mimeType=");
        return u.n(sb2, this.mimeType, ')');
    }

    public /* synthetic */ MuxerConfig(File file, int i, int i10, int i11, int i12, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i, i10, i11, i12, (i13 & 32) != 0 ? "video/avc" : str);
    }
}
