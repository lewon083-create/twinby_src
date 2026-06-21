package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
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
@Metadata
@SuppressLint({"UseKtx"})
final class TextIgnoringDelegateCanvas extends Canvas {

    @NotNull
    private final WeakHashMap<Bitmap, Pair<Integer, Integer>> bitmapColorCache;
    public Canvas delegate;

    @NotNull
    private final Bitmap singlePixelBitmap;

    @NotNull
    private final Rect singlePixelBitmapBounds;

    @NotNull
    private final Canvas singlePixelCanvas;

    @NotNull
    private final Paint solidPaint = new Paint();

    @NotNull
    private final Paint textPaint = new Paint();

    @NotNull
    private final Rect tmpRect = new Rect();

    public TextIgnoringDelegateCanvas() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.singlePixelBitmap = bitmapCreateBitmap;
        this.singlePixelCanvas = new Canvas(bitmapCreateBitmap);
        this.singlePixelBitmapBounds = new Rect(0, 0, 1, 1);
        this.bitmapColorCache = new WeakHashMap<>();
    }

    private final void drawMaskedText(Paint paint, float f10, float f11) {
        this.textPaint.setColorFilter(paint.getColorFilter());
        int color = paint.getColor();
        this.textPaint.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        Rect rect = this.tmpRect;
        drawRoundRect(rect.left + f10, rect.top + f11, rect.right + f10, rect.bottom + f11, 10.0f, 10.0f, this.textPaint);
    }

    private final BitmapShader removeBitmapShader(Paint paint) {
        if (paint == null) {
            return null;
        }
        Shader shader = paint.getShader();
        if (!(shader instanceof BitmapShader)) {
            return null;
        }
        paint.setShader(null);
        return (BitmapShader) shader;
    }

    private final int sampleBitmapColor(Bitmap bitmap, Paint paint, Rect rect) {
        int pixel = -16777216;
        if (bitmap.isRecycled()) {
            return -16777216;
        }
        Pair<Integer, Integer> pair = this.bitmapColorCache.get(bitmap);
        if (pair != null && ((Number) pair.f27469b).intValue() == bitmap.getGenerationId()) {
            return ((Number) pair.f27470c).intValue();
        }
        if (bitmap.getConfig() == Bitmap.Config.HARDWARE && Build.VERSION.SDK_INT >= 31) {
            BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
            this.singlePixelCanvas.drawBitmap(bitmap.asShared(), rect, this.singlePixelBitmapBounds, paint);
            if (bitmapShaderRemoveBitmapShader != null && paint != null) {
                paint.setShader(bitmapShaderRemoveBitmapShader);
            }
            pixel = this.singlePixelBitmap.getPixel(0, 0);
        } else if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
            BitmapShader bitmapShaderRemoveBitmapShader2 = removeBitmapShader(paint);
            this.singlePixelCanvas.drawBitmap(bitmap, rect, this.singlePixelBitmapBounds, paint);
            if (bitmapShaderRemoveBitmapShader2 != null && paint != null) {
                paint.setShader(bitmapShaderRemoveBitmapShader2);
            }
            pixel = this.singlePixelBitmap.getPixel(0, 0);
        }
        this.bitmapColorCache.put(bitmap, new Pair<>(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(pixel)));
        return pixel;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return getDelegate().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return getDelegate().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(@NotNull Path path, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(op, "op");
        return getDelegate().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@NotNull RectF rect, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        return getDelegate().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void concat(@Nullable Matrix matrix) {
        getDelegate().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        getDelegate().disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i, int i10, int i11, int i12) {
        getDelegate().drawARGB(i, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public void drawArc(@NotNull RectF oval, float f10, float f11, boolean z5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawArc(oval, f10, f11, z5, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull int[] colors, int i, int i10, float f10, float f11, int i11, int i12, boolean z5, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(@NotNull Bitmap bitmap, int i, int i10, @NotNull float[] verts, int i11, @Nullable int[] iArr, int i12, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(verts, "verts");
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f10, float f11, float f12, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawCircle(f10, f11, f12, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i) {
        getDelegate().drawColor(i);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(@NotNull RectF outer, float f10, float f11, @NotNull RectF inner, float f12, float f13, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawDoubleRoundRect(outer, f10, f11, inner, f12, f13, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(@NotNull int[] glyphIds, int i, @NotNull float[] positions, int i10, int i11, @NotNull Font font, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(glyphIds, "glyphIds");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f10, float f11, float f12, float f13, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawLine(f10, f11, f12, f13, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@NotNull float[] pts, int i, int i10, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawLines(pts, i, i10, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawMesh(@NotNull Mesh mesh, @Nullable BlendMode blendMode, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(mesh, "mesh");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawOval(@NotNull RectF oval, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawOval(oval, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPaint(paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(@NotNull NinePatch patch, @NotNull Rect dst, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPath(path, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(-16777216);
        getDelegate().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f10, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPoint(f10, f11, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@Nullable float[] fArr, int i, int i10, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPoints(fArr, i, i10, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(@NotNull String text, @NotNull float[] pos, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i, int i10, int i11) {
        getDelegate().drawRGB(i, i10, i11);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@NotNull RectF rect, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRect(rect, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(@NotNull RectF rect, float f10, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRoundRect(rect, f10, f11, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull char[] text, int i, int i10, float f10, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, i, i10, this.tmpRect);
        drawMaskedText(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@NotNull String text, @NotNull Path path, float f10, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(@NotNull char[] text, int i, int i10, int i11, int i12, float f10, float f11, boolean z5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, i + i10, this.tmpRect);
        drawMaskedText(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(@NotNull Canvas.VertexMode mode, int i, @NotNull float[] verts, int i10, @Nullable float[] fArr, int i11, @Nullable int[] iArr, int i12, @Nullable short[] sArr, int i13, int i14, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(verts, "verts");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        getDelegate().enableZ();
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return getDelegate().getClipBounds(bounds);
    }

    @NotNull
    public final Canvas getDelegate() {
        Canvas canvas = this.delegate;
        if (canvas != null) {
            return canvas;
        }
        Intrinsics.g("delegate");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        return getDelegate().getDensity();
    }

    @Override // android.graphics.Canvas
    @Nullable
    public DrawFilter getDrawFilter() {
        return getDelegate().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        return getDelegate().getHeight();
    }

    @Override // android.graphics.Canvas
    public void getMatrix(@NotNull Matrix ctm) {
        Intrinsics.checkNotNullParameter(ctm, "ctm");
        getDelegate().getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        return getDelegate().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        return getDelegate().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        return getDelegate().getSaveCount();
    }

    @NotNull
    public final Bitmap getSinglePixelBitmap() {
        return this.singlePixelBitmap;
    }

    @NotNull
    public final Rect getSinglePixelBitmapBounds() {
        return this.singlePixelBitmapBounds;
    }

    @NotNull
    public final Canvas getSinglePixelCanvas() {
        return this.singlePixelCanvas;
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        return getDelegate().getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isHardwareAccelerated() {
        return false;
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        return getDelegate().isOpaque();
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(@NotNull RectF rect, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(type, "type");
        return getDelegate().quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        getDelegate().restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i) {
        getDelegate().restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f10) {
        getDelegate().rotate(f10);
    }

    @Override // android.graphics.Canvas
    public int save() {
        return getDelegate().save();
    }

    @Override // android.graphics.Canvas
    public int saveLayer(@Nullable RectF rectF, @Nullable Paint paint, int i) {
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        int iSaveLayer = getDelegate().saveLayer(rectF, paint, i);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(@Nullable RectF rectF, int i, int i10) {
        return getDelegate().saveLayerAlpha(rectF, i, i10);
    }

    @Override // android.graphics.Canvas
    public void scale(float f10, float f11) {
        getDelegate().scale(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(@Nullable Bitmap bitmap) {
        getDelegate().setBitmap(bitmap);
    }

    public final void setDelegate(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.delegate = canvas;
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i) {
        getDelegate().setDensity(i);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(@Nullable DrawFilter drawFilter) {
        getDelegate().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(@Nullable Matrix matrix) {
        getDelegate().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f10, float f11) {
        getDelegate().skew(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void translate(float f10, float f11) {
        getDelegate().translate(f10, f11);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return getDelegate().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return getDelegate().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@NotNull Rect rect, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        return getDelegate().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull int[] colors, int i, int i10, int i11, int i12, int i13, int i14, boolean z5, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j10) {
        getDelegate().drawColor(j10);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(@NotNull char[] text, int i, int i10, @NotNull float[] pos, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@NotNull char[] text, int i, int i10, @NotNull Path path, float f10, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return getDelegate().quickReject(rect);
    }

    public final int save(int i) {
        return save();
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(@Nullable RectF rectF, int i) {
        return getDelegate().saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float f10, float f11, float f12, float f13) {
        return getDelegate().clipOutRect(f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return getDelegate().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, float f10, float f11, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, null));
        this.solidPaint.setColorFilter(null);
        getDelegate().drawRect(f10, f11, f10 + bitmap.getWidth(), f11 + bitmap.getHeight(), this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i, @NotNull PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        getDelegate().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull String text, float f10, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, text.length(), this.tmpRect);
        drawMaskedText(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(@NotNull CharSequence text, int i, int i10, int i11, int i12, float f10, float f11, boolean z5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), i, i10, this.tmpRect);
        drawMaskedText(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(@NotNull Path path, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(type, "type");
        return getDelegate().quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i, int i10) {
        return getDelegate().saveLayerAlpha(f10, f11, f12, f13, i, i10);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int i, int i10, int i11, int i12) {
        return getDelegate().clipOutRect(i, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return getDelegate().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawArc(f10, f11, f12, f13, f14, f15, z5, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i, @NotNull BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        getDelegate().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(@NotNull RectF outer, @NotNull float[] outerRadii, @NotNull RectF inner, @NotNull float[] innerRadii, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(outerRadii, "outerRadii");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(innerRadii, "innerRadii");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@NotNull float[] pts, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawLines(pts, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f10, float f11, float f12, float f13, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawOval(f10, f11, f12, f13, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(@NotNull NinePatch patch, @NotNull RectF dst, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture, @NotNull RectF dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(-16777216);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@NotNull float[] pts, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPoints(pts, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@NotNull Rect r8, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(r8, "r");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRect(r8, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return getDelegate().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(@Nullable RectF rectF, @Nullable Paint paint) {
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        int iSaveLayer = getDelegate().saveLayer(rectF, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i) {
        return getDelegate().saveLayerAlpha(f10, f11, f12, f13, i);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f10, float f11, float f12, float f13, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(op, "op");
        return getDelegate().clipRect(f10, f11, f12, f13, op);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j10, @NotNull BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        getDelegate().drawColor(j10, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull String text, int i, int i10, float f10, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, i, i10, this.tmpRect);
        drawMaskedText(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(@NotNull MeasuredText text, int i, int i10, int i11, int i12, float f10, float f11, boolean z5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), i, i10, this.tmpRect);
        drawMaskedText(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f10, float f11, float f12, float f13, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return getDelegate().quickReject(f10, f11, f12, f13, type);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f10, float f11, float f12, float f13) {
        return getDelegate().clipRect(f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f10, float f11, float f12, float f13) {
        return getDelegate().quickReject(f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i, int i10, int i11, int i12) {
        return getDelegate().clipRect(i, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @Nullable Rect rect, @NotNull RectF dst, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, rect));
        this.solidPaint.setColorFilter(null);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture, @NotNull Rect dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(-16777216);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f10, float f11, float f12, float f13, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRect(f10, f11, f12, f13, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull CharSequence text, int i, int i10, float f10, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), 0, text.length(), this.tmpRect);
        drawMaskedText(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f10, float f11, float f12, float f13, @Nullable Paint paint, int i) {
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        int iSaveLayer = getDelegate().saveLayer(f10, f11, f12, f13, paint, i);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f10, float f11, float f12, float f13, @Nullable Paint paint) {
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        int iSaveLayer = getDelegate().saveLayer(f10, f11, f12, f13, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @Nullable Rect rect, @NotNull Rect dst, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, rect));
        this.solidPaint.setColorFilter(null);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @NotNull Matrix matrix, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, null));
        this.solidPaint.setColorFilter(null);
        int iSave = getDelegate().save();
        getDelegate().setMatrix(matrix);
        getDelegate().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.solidPaint);
        getDelegate().restoreToCount(iSave);
    }
}
