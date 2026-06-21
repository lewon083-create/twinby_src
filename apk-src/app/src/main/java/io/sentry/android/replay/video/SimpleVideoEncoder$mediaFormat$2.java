package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import io.sentry.SentryLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;

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
public final class SimpleVideoEncoder$mediaFormat$2 extends r implements Function0<MediaFormat> {
    final /* synthetic */ SimpleVideoEncoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleVideoEncoder$mediaFormat$2(SimpleVideoEncoder simpleVideoEncoder) {
        super(0);
        this.this$0 = simpleVideoEncoder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MediaFormat invoke() {
        int bitRate = this.this$0.getMuxerConfig().getBitRate();
        try {
            MediaCodecInfo.VideoCapabilities videoCapabilities = this.this$0.getMediaCodec$sentry_android_replay_release().getCodecInfo().getCapabilitiesForType(this.this$0.getMuxerConfig().getMimeType()).getVideoCapabilities();
            if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(bitRate))) {
                this.this$0.getOptions().getLogger().log(SentryLevel.DEBUG, "Encoder doesn't support the provided bitRate: " + bitRate + ", the value will be clamped to the closest one", new Object[0]);
                Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(bitRate));
                Intrinsics.checkNotNullExpressionValue(objClamp, "clamp(...)");
                bitRate = ((Number) objClamp).intValue();
            }
        } catch (Throwable th2) {
            this.this$0.getOptions().getLogger().log(SentryLevel.DEBUG, "Could not retrieve MediaCodec info", th2);
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.this$0.getMuxerConfig().getMimeType(), this.this$0.getMuxerConfig().getRecordingWidth(), this.this$0.getMuxerConfig().getRecordingHeight());
        Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", bitRate);
        mediaFormatCreateVideoFormat.setFloat("frame-rate", this.this$0.getMuxerConfig().getFrameRate());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
        return mediaFormatCreateVideoFormat;
    }
}
