package io.sentry.android.replay;

import a0.u;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.internal.ads.om1;
import io.sentry.SentryReplayOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
@Metadata
public final class ScreenshotRecorderConfig {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int bitRate;
    private final int frameRate;
    private final int recordingHeight;
    private final int recordingWidth;
    private final float scaleFactorX;
    private final float scaleFactorY;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int adjustToBlockSize(int i) {
            int i10 = i % 16;
            return i10 <= 8 ? Math.max(16, i - i10) : (16 - i10) + i;
        }

        @NotNull
        public final ScreenshotRecorderConfig fromSize(@NotNull Context context, @NotNull SentryReplayOptions sessionReplay, int i, int i10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionReplay, "sessionReplay");
            float f10 = i10;
            Integer numValueOf = Integer.valueOf(adjustToBlockSize(yj.b.b((f10 / context.getResources().getDisplayMetrics().density) * sessionReplay.getQuality().sizeScale)));
            float f11 = i;
            Integer numValueOf2 = Integer.valueOf(adjustToBlockSize(yj.b.b((f11 / context.getResources().getDisplayMetrics().density) * sessionReplay.getQuality().sizeScale)));
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            return new ScreenshotRecorderConfig(iIntValue2, iIntValue, iIntValue2 / f11, iIntValue / f10, sessionReplay.getFrameRate(), sessionReplay.getQuality().bitRate);
        }

        private Companion() {
        }
    }

    public ScreenshotRecorderConfig(int i, int i10, float f10, float f11, int i11, int i12) {
        this.recordingWidth = i;
        this.recordingHeight = i10;
        this.scaleFactorX = f10;
        this.scaleFactorY = f11;
        this.frameRate = i11;
        this.bitRate = i12;
    }

    public static /* synthetic */ ScreenshotRecorderConfig copy$default(ScreenshotRecorderConfig screenshotRecorderConfig, int i, int i10, float f10, float f11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = screenshotRecorderConfig.recordingWidth;
        }
        if ((i13 & 2) != 0) {
            i10 = screenshotRecorderConfig.recordingHeight;
        }
        if ((i13 & 4) != 0) {
            f10 = screenshotRecorderConfig.scaleFactorX;
        }
        if ((i13 & 8) != 0) {
            f11 = screenshotRecorderConfig.scaleFactorY;
        }
        if ((i13 & 16) != 0) {
            i11 = screenshotRecorderConfig.frameRate;
        }
        if ((i13 & 32) != 0) {
            i12 = screenshotRecorderConfig.bitRate;
        }
        int i14 = i11;
        int i15 = i12;
        return screenshotRecorderConfig.copy(i, i10, f10, f11, i14, i15);
    }

    public final int component1() {
        return this.recordingWidth;
    }

    public final int component2() {
        return this.recordingHeight;
    }

    public final float component3() {
        return this.scaleFactorX;
    }

    public final float component4() {
        return this.scaleFactorY;
    }

    public final int component5() {
        return this.frameRate;
    }

    public final int component6() {
        return this.bitRate;
    }

    @NotNull
    public final ScreenshotRecorderConfig copy(int i, int i10, float f10, float f11, int i11, int i12) {
        return new ScreenshotRecorderConfig(i, i10, f10, f11, i11, i12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenshotRecorderConfig)) {
            return false;
        }
        ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) obj;
        return this.recordingWidth == screenshotRecorderConfig.recordingWidth && this.recordingHeight == screenshotRecorderConfig.recordingHeight && Float.compare(this.scaleFactorX, screenshotRecorderConfig.scaleFactorX) == 0 && Float.compare(this.scaleFactorY, screenshotRecorderConfig.scaleFactorY) == 0 && this.frameRate == screenshotRecorderConfig.frameRate && this.bitRate == screenshotRecorderConfig.bitRate;
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public final float getScaleFactorX() {
        return this.scaleFactorX;
    }

    public final float getScaleFactorY() {
        return this.scaleFactorY;
    }

    public int hashCode() {
        return Integer.hashCode(this.bitRate) + u.g(this.frameRate, o.b(this.scaleFactorY, o.b(this.scaleFactorX, u.g(this.recordingHeight, Integer.hashCode(this.recordingWidth) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb2.append(this.recordingWidth);
        sb2.append(", recordingHeight=");
        sb2.append(this.recordingHeight);
        sb2.append(", scaleFactorX=");
        sb2.append(this.scaleFactorX);
        sb2.append(", scaleFactorY=");
        sb2.append(this.scaleFactorY);
        sb2.append(", frameRate=");
        sb2.append(this.frameRate);
        sb2.append(", bitRate=");
        return om1.l(sb2, this.bitRate, ')');
    }

    public ScreenshotRecorderConfig(float f10, float f11) {
        this(0, 0, f10, f11, 0, 0);
    }
}
