package u6;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import m.o2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f34251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o2 f34252b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f34251a = new d0();
        } else {
            f34251a = new c0();
        }
        f34252b = new o2(6, Float.class, "translationAlpha");
        new o2(7, Rect.class, "clipBounds");
    }

    public static void a(View view, int i, int i10, int i11, int i12) {
        f34251a.R(view, i, i10, i11, i12);
    }

    public static void b(View view, float f10) {
        f34251a.F(view, f10);
    }
}
