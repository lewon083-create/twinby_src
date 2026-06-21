package x1;

import android.graphics.Color;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f35687a = new ThreadLocal();

    public static int a(double d10, double d11, double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        double dPow = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double dPow2 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        double dPow3 = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, KotlinVersion.MAX_COMPONENT_VALUE);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, KotlinVersion.MAX_COMPONENT_VALUE);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, KotlinVersion.MAX_COMPONENT_VALUE) : 0);
    }

    public static int b(float f10, int i, int i10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f10) + (Color.alpha(i) * f11)), (int) ((Color.red(i10) * f10) + (Color.red(i) * f11)), (int) ((Color.green(i10) * f10) + (Color.green(i) * f11)), (int) ((Color.blue(i10) * f10) + (Color.blue(i) * f11)));
    }

    public static int c(int i, int i10) {
        int iAlpha = Color.alpha(i10);
        int iAlpha2 = Color.alpha(i);
        int i11 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / KotlinVersion.MAX_COMPONENT_VALUE);
        return Color.argb(i11, d(Color.red(i), iAlpha2, Color.red(i10), iAlpha, i11), d(Color.green(i), iAlpha2, Color.green(i10), iAlpha, i11), d(Color.blue(i), iAlpha2, Color.blue(i10), iAlpha, i11));
    }

    public static int d(int i, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((255 - i10) * (i11 * i12)) + ((i * KotlinVersion.MAX_COMPONENT_VALUE) * i10)) / (i13 * KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int e(int i, int i10) {
        if (i10 < 0 || i10 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i10 << 24);
    }
}
