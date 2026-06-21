package yads;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap f44060a;

    public /* synthetic */ vi2() {
        this(new ap());
    }

    public final Bitmap a(Bitmap bitmap, w41 w41Var) {
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0 || w41Var.f44273a == 0 || w41Var.f44274b == 0) {
            return bitmap;
        }
        if (bitmap.getWidth() * w41Var.f44274b == bitmap.getHeight() * w41Var.f44273a) {
            return bitmap;
        }
        this.f44060a.getClass();
        b03 b03Var = new b03(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && w41Var.f44273a != 0 && w41Var.f44274b != 0) {
            ck.g it = new IntRange(bitmap.getWidth(), Math.max(bitmap.getWidth(), Math.min(100, (w41Var.f44273a * 100) / w41Var.f44274b)), 1).iterator();
            double d10 = 1.0d;
            while (true) {
                if (!it.f2383d) {
                    break;
                }
                int iNextInt = it.nextInt();
                int i = w41Var.f44274b * iNextInt;
                int i10 = w41Var.f44273a;
                if (i % i10 == 0) {
                    b03Var = new b03(iNextInt, i / i10);
                    break;
                }
                double d11 = ((double) i) / ((double) i10);
                int iA = yj.b.a(d11);
                double dAbs = Math.abs(((double) iA) - d11) / d11;
                if (dAbs < d10) {
                    b03Var = new b03(iNextInt, iA);
                    d10 = dAbs;
                }
            }
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = b03Var.f36892b;
        b03 a10 = new b03(i11, (i11 * height) / width);
        int i12 = b03Var.f36893c;
        b03 b2 = new b03((width * i12) / height, i12);
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        if (a10.compareTo(b2) < 0) {
            a10 = b2;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, a10.f36892b, a10.f36893c, false);
        int width2 = (bitmapCreateScaledBitmap.getWidth() - b03Var.f36892b) / 2;
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int i13 = b03Var.f36893c;
        return Bitmap.createBitmap(bitmapCreateScaledBitmap, width2, (height2 - i13) / 2, b03Var.f36892b, i13, (Matrix) null, false);
    }

    public vi2(ap apVar) {
        this.f44060a = apVar;
    }
}
