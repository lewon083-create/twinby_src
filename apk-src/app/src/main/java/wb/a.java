package wb;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f35218a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c3.a f35219b = new c3.a(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c3.a f35220c = new c3.a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c3.a f35221d = new c3.a(c3.a.f2203e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f10, float f11, float f12) {
        return ((f11 - f10) * f12) + f10;
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(float f10, int i, int i10) {
        return Math.round(f10 * (i10 - i)) + i;
    }
}
