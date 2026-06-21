package yads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class yo3 {
    public static wg0 a(Context context) {
        if (ub.a(30)) {
            Object systemService = context.getSystemService("window");
            Intrinsics.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            WindowInsets windowInsets = ((WindowManager) systemService).getCurrentWindowMetrics().getWindowInsets();
            Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            Insets insetsIgnoringVisibility2 = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.displayCutout());
            zl3 zl3Var = nl3.f41290a;
            float f10 = context.getResources().getDisplayMetrics().density;
            return new wg0(nl3.b(insetsIgnoringVisibility.left, f10), nl3.b(insetsIgnoringVisibility.top, f10), nl3.b(insetsIgnoringVisibility.right, f10), nl3.b(insetsIgnoringVisibility.bottom, f10), nl3.b(insetsIgnoringVisibility2.top, f10), nl3.b(insetsIgnoringVisibility2.bottom, f10));
        }
        if (!ub.a(28)) {
            return wg0.f44386g;
        }
        Activity activityA = j1.a();
        if (activityA == null) {
            return wg0.f44386g;
        }
        WindowInsets rootWindowInsets = activityA.getWindow().getDecorView().getRootWindowInsets();
        if (rootWindowInsets == null) {
            return wg0.f44386g;
        }
        zl3 zl3Var2 = nl3.f41290a;
        float f11 = context.getResources().getDisplayMetrics().density;
        DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
        return new wg0(nl3.b(rootWindowInsets.getSystemWindowInsetLeft(), f11), nl3.b(rootWindowInsets.getSystemWindowInsetTop(), f11), nl3.b(rootWindowInsets.getSystemWindowInsetRight(), f11), nl3.b(rootWindowInsets.getSystemWindowInsetBottom(), f11), nl3.b(displayCutout != null ? displayCutout.getSafeInsetTop() : 0, f11), nl3.b(displayCutout != null ? displayCutout.getSafeInsetBottom() : 0, f11));
    }

    public static final wg0 b(Context context) {
        try {
            return a(context);
        } catch (Throwable unused) {
            return wg0.f44386g;
        }
    }
}
