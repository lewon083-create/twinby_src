package io.sentry.android.replay.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.compose.runtime.internal.StabilityInferred;
import ij.g;
import ij.h;
import ij.i;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
@TargetApi(26)
public final class SimpleVideoEncoder {
    public static final int $stable = 8;

    @NotNull
    private final MediaCodec.BufferInfo bufferInfo;

    @NotNull
    private final SimpleMp4FrameMuxer frameMuxer;

    @NotNull
    private final g hasExynosCodec$delegate;

    @NotNull
    private final MediaCodec mediaCodec;

    @NotNull
    private final g mediaFormat$delegate;

    @NotNull
    private final MuxerConfig muxerConfig;

    @Nullable
    private final Function0<Unit> onClose;

    @NotNull
    private final SentryOptions options;

    @Nullable
    private Surface surface;

    public SimpleVideoEncoder(@NotNull SentryOptions options, @NotNull MuxerConfig muxerConfig, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(muxerConfig, "muxerConfig");
        this.options = options;
        this.muxerConfig = muxerConfig;
        this.onClose = function0;
        i iVar = i.f21338c;
        this.hasExynosCodec$delegate = h.a(iVar, SimpleVideoEncoder$hasExynosCodec$2.INSTANCE);
        MediaCodec mediaCodecCreateByCodecName = getHasExynosCodec() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(muxerConfig.getMimeType());
        Intrinsics.b(mediaCodecCreateByCodecName);
        this.mediaCodec = mediaCodecCreateByCodecName;
        this.mediaFormat$delegate = h.a(iVar, new SimpleVideoEncoder$mediaFormat$2(this));
        this.bufferInfo = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.getFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this.frameMuxer = new SimpleMp4FrameMuxer(absolutePath, muxerConfig.getFrameRate());
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b8, code lost:
    
        throw new java.lang.RuntimeException(a0.u.k(r2, "encoderOutputBuffer ", " was null"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void drainCodec(boolean r9) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.SimpleVideoEncoder.drainCodec(boolean):void");
    }

    private final boolean getHasExynosCodec() {
        return ((Boolean) this.hasExynosCodec$delegate.getValue()).booleanValue();
    }

    private final MediaFormat getMediaFormat() {
        return (MediaFormat) this.mediaFormat$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void encode(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r7) {
        /*
            r6 = this;
            java.lang.String r0 = "image"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r2 = "xiaomi"
            r3 = 1
            boolean r2 = kotlin.text.StringsKt.y(r0, r2, r3)
            r4 = 0
            if (r2 != 0) goto L4a
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "motorola"
            boolean r0 = kotlin.text.StringsKt.y(r0, r1, r3)
            if (r0 != 0) goto L4a
            io.sentry.android.replay.util.SystemProperties r0 = io.sentry.android.replay.util.SystemProperties.INSTANCE
            io.sentry.android.replay.util.SystemProperties$Property r1 = io.sentry.android.replay.util.SystemProperties.Property.SOC_MANUFACTURER
            r2 = 2
            java.lang.String r3 = io.sentry.android.replay.util.SystemProperties.get$default(r0, r1, r4, r2, r4)
            java.lang.String r5 = "spreadtrum"
            boolean r3 = kotlin.text.a0.i(r3, r5)
            if (r3 != 0) goto L4a
            java.lang.String r0 = io.sentry.android.replay.util.SystemProperties.get$default(r0, r1, r4, r2, r4)
            java.lang.String r1 = "unisoc"
            boolean r0 = kotlin.text.a0.i(r0, r1)
            if (r0 == 0) goto L3f
            goto L4a
        L3f:
            android.view.Surface r0 = r6.surface
            if (r0 == 0) goto L48
            android.graphics.Canvas r0 = r0.lockHardwareCanvas()
            goto L52
        L48:
            r0 = r4
            goto L52
        L4a:
            android.view.Surface r0 = r6.surface
            if (r0 == 0) goto L48
            android.graphics.Canvas r0 = r0.lockCanvas(r4)
        L52:
            if (r0 == 0) goto L58
            r1 = 0
            r0.drawBitmap(r7, r1, r1, r4)
        L58:
            android.view.Surface r7 = r6.surface
            if (r7 == 0) goto L5f
            r7.unlockCanvasAndPost(r0)
        L5f:
            r7 = 0
            r6.drainCodec(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.SimpleVideoEncoder.encode(android.graphics.Bitmap):void");
    }

    public final long getDuration() {
        return this.frameMuxer.getVideoTime();
    }

    @NotNull
    public final MediaCodec getMediaCodec$sentry_android_replay_release() {
        return this.mediaCodec;
    }

    @NotNull
    public final MuxerConfig getMuxerConfig() {
        return this.muxerConfig;
    }

    @Nullable
    public final Function0<Unit> getOnClose() {
        return this.onClose;
    }

    @NotNull
    public final SentryOptions getOptions() {
        return this.options;
    }

    public final void release() {
        try {
            Function0<Unit> function0 = this.onClose;
            if (function0 != null) {
                function0.invoke();
            }
            drainCodec(true);
            this.mediaCodec.stop();
            this.mediaCodec.release();
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.frameMuxer.release();
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Failed to properly release video encoder", th2);
        }
    }

    public final void start() {
        this.mediaCodec.configure(getMediaFormat(), (Surface) null, (MediaCrypto) null, 1);
        this.surface = this.mediaCodec.createInputSurface();
        this.mediaCodec.start();
        drainCodec(false);
    }

    public /* synthetic */ SimpleVideoEncoder(SentryOptions sentryOptions, MuxerConfig muxerConfig, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, muxerConfig, (i & 4) != 0 ? null : function0);
    }
}
