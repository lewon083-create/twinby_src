package i0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RectF f20812a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(RectF rectF, RectF rectF2, int i, boolean z5) {
        Matrix matrix = new Matrix();
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        RectF rectF3 = f20812a;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i);
        if (z5) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static int b(Matrix matrix) {
        matrix.getValues(new float[9]);
        return k((int) Math.round(Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    public static boolean c(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean d(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException(l7.o.i(i, "Invalid rotation degrees: "));
    }

    public static boolean e(Size size, Size size2) {
        return (((float) size.getWidth()) + 1.0f) / (((float) size.getHeight()) - 1.0f) >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= (((float) size.getWidth()) - 1.0f) / (((float) size.getHeight()) + 1.0f);
    }

    public static boolean f(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = (f11 * f13) + (f10 * f12);
        float f15 = (f10 * f13) - (f11 * f12);
        double dSqrt = Math.sqrt((f11 * f11) + (f10 * f10)) * Math.sqrt((f13 * f13) + (f12 * f12));
        return ((float) Math.toDegrees(Math.atan2(((double) f15) / dSqrt, ((double) f14) / dSqrt))) > 0.0f;
    }

    public static Size g(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static String h(Rect rect) {
        Locale locale = Locale.US;
        return rect + "(" + rect.width() + "x" + rect.height() + ")";
    }

    public static Size i(Size size, int i) {
        f2.g.a("Invalid rotation degrees: " + i, i % 90 == 0);
        return d(k(i)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static RectF j(Size size) {
        float f10 = 0;
        return new RectF(f10, f10, size.getWidth(), size.getHeight());
    }

    public static int k(int i) {
        return ((i % 360) + 360) % 360;
    }
}
