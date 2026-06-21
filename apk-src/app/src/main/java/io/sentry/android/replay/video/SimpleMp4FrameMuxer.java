package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

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
public final class SimpleMp4FrameMuxer implements SimpleFrameMuxer {
    public static final int $stable = 8;
    private long finalVideoTime;
    private final long frameDurationUsec;

    @NotNull
    private final MediaMuxer muxer;
    private boolean started;
    private int videoFrames;
    private int videoTrackIndex;

    public SimpleMp4FrameMuxer(@NotNull String path, float f10) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.frameDurationUsec = (long) (TimeUnit.SECONDS.toMicros(1L) / f10);
        this.muxer = new MediaMuxer(path, 0);
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public long getVideoTime() {
        if (this.videoFrames == 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(this.finalVideoTime + this.frameDurationUsec, TimeUnit.MICROSECONDS);
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public boolean isStarted() {
        return this.started;
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public void muxVideoFrame(@NotNull ByteBuffer encodedData, @NotNull MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(encodedData, "encodedData");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        long j10 = this.frameDurationUsec;
        int i = this.videoFrames;
        this.videoFrames = i + 1;
        long j11 = j10 * ((long) i);
        this.finalVideoTime = j11;
        bufferInfo.presentationTimeUs = j11;
        this.muxer.writeSampleData(this.videoTrackIndex, encodedData, bufferInfo);
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public void release() {
        this.muxer.stop();
        this.muxer.release();
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public void start(@NotNull MediaFormat videoFormat) {
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        this.videoTrackIndex = this.muxer.addTrack(videoFormat);
        this.muxer.start();
        this.started = true;
    }
}
