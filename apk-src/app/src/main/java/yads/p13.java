package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l13 f41803a = new l13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f41804b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f41805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f41806d;

    public p13() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.f41805c = paint;
        this.f41806d = new Rect();
    }

    public final void a(ImageView imageView, Bitmap bitmap, j13 j13Var) {
        float f10;
        float fFloatValue;
        float fFloatValue2;
        float width = imageView.getWidth();
        float height = imageView.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        Float fValueOf = Float.valueOf(0.0f);
        if (height == 0.0f || height2 == 0.0f) {
            return;
        }
        boolean z5 = width / height > width2 / height2;
        float f11 = z5 ? width / width2 : height / height2;
        float f12 = width2 * f11;
        float f13 = height2 * f11;
        if (z5) {
            fFloatValue = 0.0f;
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            fFloatValue = (width / 2) - (((j13Var.f39700c / 2) + j13Var.f39698a) * f11);
            Float fValueOf2 = fFloatValue > 0.0f ? fValueOf : fFloatValue + f12 < width ? Float.valueOf(width - f12) : null;
            if (fValueOf2 != null) {
                fFloatValue = fValueOf2.floatValue();
            }
        }
        if (z5) {
            float f14 = (height / 2) - (((j13Var.f39701d / 2) + j13Var.f39699b) * f11);
            if (f14 <= f10) {
                fValueOf = f14 + f13 < height ? Float.valueOf(height - f13) : null;
            }
            fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : f14;
        } else {
            fFloatValue2 = f10;
        }
        this.f41804b.setScale(f11, f11);
        this.f41804b.postTranslate(fFloatValue, fFloatValue2);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(this.f41804b);
        l13 l13Var = this.f41803a;
        Context context = imageView.getContext();
        l13Var.getClass();
        if (((vg1) wg1.a(context, "YadPreferenceFile")).a("preference_smart_centers_debug_enabled", false)) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(bitmapCopy);
            Rect rect = this.f41806d;
            int i = j13Var.f39698a;
            int i10 = j13Var.f39699b;
            rect.set(i, i10, j13Var.f39700c + i, j13Var.f39701d + i10);
            canvas.drawRect(rect, this.f41805c);
            imageView.setImageBitmap(bitmapCopy);
        }
    }
}
