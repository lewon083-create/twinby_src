package yads;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vs2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n53 f44118a;

    public /* synthetic */ vs2() {
        this(new n53());
    }

    public final Point a(Context context) {
        Object systemService = context.getSystemService("window");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        n53 n53Var = this.f44118a;
        a7.h hVar = new a7.h(6, windowManager);
        n53Var.getClass();
        Display display = (Display) n53.a(hVar, windowManager, "getting display", "WindowManager");
        Object point = new Point(0, 0);
        n53 n53Var2 = this.f44118a;
        nd.e eVar = new nd.e(display, point, this, 1);
        n53Var2.getClass();
        Object objA = n53.a(eVar, display, "getting display metrics", "Display");
        if (objA != null) {
            point = objA;
        }
        return (Point) point;
    }

    public vs2(n53 n53Var) {
        this.f44118a = n53Var;
    }

    public static final Display a(WindowManager windowManager) {
        return windowManager.getDefaultDisplay();
    }

    public static final Point a(Display display, Point point, vs2 vs2Var) {
        if (display == null) {
            return point;
        }
        vs2Var.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
