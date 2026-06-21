package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
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
@Metadata
public final class PixelCopyStrategyKt {
    public static final void compositeSurfaceViewInto(@NotNull Canvas destCanvas, @NotNull Paint destPaint, @NotNull Rect tmpSrc, @NotNull RectF tmpDst, @NotNull Bitmap sourceBitmap, int i, int i10, int i11, int i12, float f10, float f11) {
        Intrinsics.checkNotNullParameter(destCanvas, "destCanvas");
        Intrinsics.checkNotNullParameter(destPaint, "destPaint");
        Intrinsics.checkNotNullParameter(tmpSrc, "tmpSrc");
        Intrinsics.checkNotNullParameter(tmpDst, "tmpDst");
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        float f12 = (i - i11) * f10;
        float f13 = (i10 - i12) * f11;
        tmpSrc.set(0, 0, sourceBitmap.getWidth(), sourceBitmap.getHeight());
        tmpDst.set(f12, f13, (sourceBitmap.getWidth() * f10) + f12, (sourceBitmap.getHeight() * f11) + f13);
        destCanvas.drawBitmap(sourceBitmap, tmpSrc, tmpDst, destPaint);
    }
}
