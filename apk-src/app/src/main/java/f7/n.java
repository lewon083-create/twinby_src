package f7;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import g2.c1;
import g2.d1;
import g2.e1;
import g2.f1;
import g2.g1;
import g2.h1;
import g2.i1;
import g2.x1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f16694b = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16695c;

    static {
        String simpleName = n.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f16695c = simpleName;
        Integer[] elements = {1, 2, 4, 8, 16, 32, 64, 128};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        new ArrayList(new kotlin.collections.j(elements, true));
    }

    public static l a(Activity activity) throws Exception {
        Rect rectB;
        x1 x1VarB;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            Intrinsics.checkNotNullParameter(activity, "context");
            rectB = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            Intrinsics.checkNotNullExpressionValue(rectB, "wm.currentWindowMetrics.bounds");
        } else if (i >= 29) {
            String str = f16695c;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                Intrinsics.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rectB = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException e3) {
                Log.w(str, e3);
                rectB = b(activity);
            } catch (NoSuchFieldException e7) {
                Log.w(str, e7);
                rectB = b(activity);
            } catch (NoSuchMethodException e10) {
                Log.w(str, e10);
                rectB = b(activity);
            } catch (InvocationTargetException e11) {
                Log.w(str, e11);
                rectB = b(activity);
            }
        } else if (i >= 28) {
            rectB = b(activity);
        } else {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Rect rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (!activity.isInMultiWindowMode()) {
                Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
                Point pointC = c(defaultDisplay);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i10 = rect.bottom + dimensionPixelSize;
                if (i10 == pointC.y) {
                    rect.bottom = i10;
                } else {
                    int i11 = rect.right + dimensionPixelSize;
                    if (i11 == pointC.x) {
                        rect.right = i11;
                    }
                }
            }
            rectB = rect;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            Intrinsics.checkNotNullParameter(activity, "context");
            if (i12 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            x1VarB = j7.b.f26575a.a(activity);
        } else {
            x1VarB = (i12 >= 36 ? new i1() : i12 >= 35 ? new h1() : i12 >= 34 ? new g1() : i12 >= 31 ? new f1() : i12 >= 30 ? new e1() : i12 >= 29 ? new d1() : new c1()).b();
            Intrinsics.checkNotNullExpressionValue(x1VarB, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new l(new c7.b(rectB), x1VarB);
    }

    public static Rect b(Activity activity) {
        String str = f16695c;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                Intrinsics.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                Intrinsics.c(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e3) {
            Log.w(str, e3);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e7) {
            Log.w(str, e7);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e10) {
            Log.w(str, e10);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e11) {
            Log.w(str, e11);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        Intrinsics.checkNotNullExpressionValue(display, "currentDisplay");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(point, "point");
        display.getRealSize(point);
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i10 = rect.right + dimensionPixelSize;
                if (i10 == point.x) {
                    rect.right = i10;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if (rect.width() < point.x || rect.height() < point.y) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (!activity.isInMultiWindowMode()) {
                try {
                    Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                    constructor.setAccessible(true);
                    Object objNewInstance = constructor.newInstance(null);
                    Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(display, objNewInstance);
                    Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(objNewInstance);
                    if (a7.e.z(obj2)) {
                        displayCutout = a7.e.o(obj2);
                    }
                } catch (ClassNotFoundException e12) {
                    Log.w(str, e12);
                } catch (IllegalAccessException e13) {
                    Log.w(str, e13);
                } catch (InstantiationException e14) {
                    Log.w(str, e14);
                } catch (NoSuchFieldException e15) {
                    Log.w(str, e15);
                } catch (NoSuchMethodException e16) {
                    Log.w(str, e16);
                } catch (InvocationTargetException e17) {
                    Log.w(str, e17);
                }
                if (displayCutout != null) {
                    int i11 = rect.left;
                    Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
                    if (i11 == displayCutout.getSafeInsetLeft()) {
                        rect.left = 0;
                    }
                    int i12 = point.x - rect.right;
                    Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
                    if (i12 == displayCutout.getSafeInsetRight()) {
                        int i13 = rect.right;
                        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
                        rect.right = displayCutout.getSafeInsetRight() + i13;
                    }
                    int i14 = rect.top;
                    Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
                    if (i14 == displayCutout.getSafeInsetTop()) {
                        rect.top = 0;
                    }
                    int i15 = point.y - rect.bottom;
                    Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
                    if (i15 == displayCutout.getSafeInsetBottom()) {
                        int i16 = rect.bottom;
                        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
                        rect.bottom = displayCutout.getSafeInsetBottom() + i16;
                    }
                }
            }
        }
        return rect;
    }

    public static Point c(Display display) {
        Intrinsics.checkNotNullParameter(display, "display");
        Point point = new Point();
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(point, "point");
        display.getRealSize(point);
        return point;
    }
}
