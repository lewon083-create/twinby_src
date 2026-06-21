package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.b0;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata
public final class DebugOverlayDrawable extends Drawable {
    private static final float STROKE_WIDTH = 6.0f;
    private static final int TEXT_COLOR = -16777216;
    private static final int TEXT_OUTLINE_COLOR = -1;
    private static final float TEXT_SIZE = 32.0f;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int maskBackgroundColor = Color.argb(32, KotlinVersion.MAX_COMPONENT_VALUE, 20, 20);
    private static final int maskBorderColor = Color.argb(128, KotlinVersion.MAX_COMPONENT_VALUE, 20, 20);

    @NotNull
    private final Paint paint = new Paint(1);
    private final float padding = STROKE_WIDTH;

    @NotNull
    private final Rect tmpRect = new Rect();

    @NotNull
    private List<Rect> masks = b0.f27475b;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void drawTextWithOutline(Canvas canvas, String str, float f10, float f11) {
        this.paint.setColor(-1);
        this.paint.setStyle(Paint.Style.STROKE);
        canvas.drawText(str, f10, f11, this.paint);
        this.paint.setColor(TEXT_COLOR);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawText(str, f10, f11, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.paint.setTextSize(TEXT_SIZE);
        this.paint.setColor(TEXT_COLOR);
        this.paint.setStrokeWidth(STROKE_WIDTH);
        for (Rect rect : this.masks) {
            this.paint.setColor(maskBackgroundColor);
            this.paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, this.paint);
            this.paint.setColor(maskBorderColor);
            this.paint.setStyle(Paint.Style.STROKE);
            canvas.drawRect(rect, this.paint);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.left);
            sb2.append('/');
            sb2.append(rect.top);
            String string = sb2.toString();
            this.paint.getTextBounds(string, 0, string.length(), this.tmpRect);
            drawTextWithOutline(canvas, string, rect.left, rect.top);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(rect.right);
            sb3.append('/');
            sb3.append(rect.bottom);
            String string2 = sb3.toString();
            this.paint.getTextBounds(string2, 0, string2.length(), this.tmpRect);
            drawTextWithOutline(canvas, string2, rect.right - this.tmpRect.width(), rect.bottom + this.tmpRect.height());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void updateMasks(@NotNull List<Rect> masks) {
        Intrinsics.checkNotNullParameter(masks, "masks");
        this.masks = masks;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
