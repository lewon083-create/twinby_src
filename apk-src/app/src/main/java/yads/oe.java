package yads;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class oe extends ImageSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f41522b;

    public oe(Drawable drawable) {
        super(drawable);
        this.f41521a = -1;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        if (this.f41521a != -1) {
            super.draw(canvas, charSequence, i, i10, f10, i11, i12, i13, paint);
            return;
        }
        WeakReference weakReference = this.f41522b;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f41522b = new WeakReference(drawable);
        }
        canvas.save();
        canvas.translate(f10, yj.b.b(((i11 + i13) / 2.0f) - (drawable.getBounds().height() / 2.0f)));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i10, Paint.FontMetricsInt fontMetricsInt) {
        WeakReference weakReference = this.f41522b;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f41522b = new WeakReference(drawable);
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
