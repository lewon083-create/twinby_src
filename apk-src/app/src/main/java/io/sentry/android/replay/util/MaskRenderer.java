package io.sentry.android.replay.util;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.runtime.internal.StabilityInferred;
import ij.g;
import ij.h;
import ij.i;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
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
@SuppressLint({"UseKtx"})
public final class MaskRenderer implements Closeable {
    private static final float MASK_CORNER_RADIUS = 10.0f;

    @NotNull
    private final g lazySinglePixelBitmap;

    @NotNull
    private final g maskingPaint$delegate;

    @NotNull
    private final g singlePixelBitmapCanvas$delegate;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.util.MaskRenderer$renderMasks$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass2 extends r implements Function1<ViewHierarchyNode, Boolean> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ Canvas $canvas;
        final /* synthetic */ List<Rect> $maskedRects;
        final /* synthetic */ Matrix $scaleMatrix;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Bitmap bitmap, Matrix matrix, List<Rect> list, Canvas canvas) {
            super(1);
            this.$bitmap = bitmap;
            this.$scaleMatrix = matrix;
            this.$maskedRects = list;
            this.$canvas = canvas;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ViewHierarchyNode node) {
            Pair pair;
            Integer dominantColor;
            Intrinsics.checkNotNullParameter(node, "node");
            if (node.getShouldMask() && node.getWidth() > 0 && node.getHeight() > 0) {
                if (node.getVisibleRect() == null) {
                    return Boolean.FALSE;
                }
                if (node instanceof ViewHierarchyNode.ImageViewHierarchyNode) {
                    pair = new Pair(kotlin.collections.r.c(node.getVisibleRect()), Integer.valueOf(MaskRenderer.this.dominantColorForRect(this.$bitmap, node.getVisibleRect(), this.$scaleMatrix)));
                } else {
                    if (node instanceof ViewHierarchyNode.TextViewHierarchyNode) {
                        ViewHierarchyNode.TextViewHierarchyNode textViewHierarchyNode = (ViewHierarchyNode.TextViewHierarchyNode) node;
                        TextLayout layout = textViewHierarchyNode.getLayout();
                        pair = new Pair(ViewsKt.getVisibleRects(textViewHierarchyNode.getLayout(), node.getVisibleRect(), textViewHierarchyNode.getPaddingLeft(), textViewHierarchyNode.getPaddingTop()), Integer.valueOf(((layout == null || (dominantColor = layout.getDominantTextColor()) == null) && (dominantColor = textViewHierarchyNode.getDominantColor()) == null) ? -16777216 : dominantColor.intValue()));
                    } else {
                        pair = new Pair(kotlin.collections.r.c(node.getVisibleRect()), -16777216);
                    }
                }
                List list = (List) pair.f27469b;
                MaskRenderer.this.getMaskingPaint().setColor(((Number) pair.f27470c).intValue());
                Canvas canvas = this.$canvas;
                MaskRenderer maskRenderer = MaskRenderer.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    canvas.drawRoundRect(new RectF((Rect) it.next()), MaskRenderer.MASK_CORNER_RADIUS, MaskRenderer.MASK_CORNER_RADIUS, maskRenderer.getMaskingPaint());
                }
                this.$maskedRects.addAll(list);
            }
            return Boolean.TRUE;
        }
    }

    public MaskRenderer() {
        i iVar = i.f21338c;
        this.lazySinglePixelBitmap = h.a(iVar, MaskRenderer$lazySinglePixelBitmap$1.INSTANCE);
        this.singlePixelBitmapCanvas$delegate = h.a(iVar, new MaskRenderer$singlePixelBitmapCanvas$2(this));
        this.maskingPaint$delegate = h.a(iVar, MaskRenderer$maskingPaint$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dominantColorForRect(Bitmap bitmap, Rect rect, Matrix matrix) {
        if (bitmap.isRecycled() || getSinglePixelBitmap$sentry_android_replay_release().isRecycled()) {
            return -16777216;
        }
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        rectF.round(rect2);
        getSinglePixelBitmapCanvas().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return getSinglePixelBitmap$sentry_android_replay_release().getPixel(0, 0);
    }

    public static /* synthetic */ int dominantColorForRect$default(MaskRenderer maskRenderer, Bitmap bitmap, Rect rect, Matrix matrix, int i, Object obj) {
        if ((i & 4) != 0) {
            matrix = null;
        }
        return maskRenderer.dominantColorForRect(bitmap, rect, matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint getMaskingPaint() {
        return (Paint) this.maskingPaint$delegate.getValue();
    }

    private final Canvas getSinglePixelBitmapCanvas() {
        return (Canvas) this.singlePixelBitmapCanvas$delegate.getValue();
    }

    public static /* synthetic */ List renderMasks$default(MaskRenderer maskRenderer, Bitmap bitmap, ViewHierarchyNode viewHierarchyNode, Matrix matrix, int i, Object obj) {
        if ((i & 4) != 0) {
            matrix = null;
        }
        return maskRenderer.renderMasks(bitmap, viewHierarchyNode, matrix);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.lazySinglePixelBitmap.a() || getSinglePixelBitmap$sentry_android_replay_release().isRecycled()) {
            return;
        }
        getSinglePixelBitmap$sentry_android_replay_release().recycle();
    }

    @NotNull
    public final Bitmap getSinglePixelBitmap$sentry_android_replay_release() {
        return (Bitmap) this.lazySinglePixelBitmap.getValue();
    }

    @NotNull
    public final List<Rect> renderMasks(@NotNull Bitmap bitmap, @NotNull ViewHierarchyNode viewHierarchy, @Nullable Matrix matrix) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
        if (bitmap.isRecycled()) {
            return b0.f27475b;
        }
        ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(bitmap);
        if (matrix != null) {
            canvas.setMatrix(matrix);
        }
        viewHierarchy.traverse(new AnonymousClass2(bitmap, matrix, arrayList, canvas));
        return arrayList;
    }
}
