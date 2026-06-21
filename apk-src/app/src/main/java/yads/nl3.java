package yads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class nl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zl3 f41290a = new zl3(new db2(), new bm3());

    public static final int a(int i, float f10) {
        float f11 = 100 - f10;
        int i10 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i11 = (int) ((KotlinVersion.MAX_COMPONENT_VALUE * f11) / 100.0f);
        if (255 > i11) {
            i10 = i11;
        }
        if (i10 <= 0) {
            i10 = 0;
        }
        return Color.argb(i10, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static final float b(int i, float f10) {
        return ((i + 0.0f) / f10) + 0.5f;
    }

    public static final boolean c(View view) {
        Drawable background = view.getBackground();
        return (background == null || ((float) background.getAlpha()) == 0.0f) ? false : true;
    }

    public static final int d(Context context) {
        return (int) b(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().density);
    }

    public static final int a(Context context, int i) {
        return yj.b.b(i / context.getResources().getDisplayMetrics().density);
    }

    public static final boolean b(View view) {
        return !view.isShown() || view.getAlpha() == 0.0f;
    }

    public static final int b(Context context) {
        return (int) b(c(context), context.getResources().getDisplayMetrics().density);
    }

    public static final int c(Context context) {
        Object objS;
        int iHeight;
        pt2 pt2VarA = fw2.a().a(context);
        if (pt2VarA != null && pt2VarA.C0) {
            try {
                ij.k kVar = ij.m.f21341c;
                Object systemService = context.getSystemService("window");
                Intrinsics.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                WindowManager windowManager = (WindowManager) systemService;
                if (Build.VERSION.SDK_INT >= 30) {
                    iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    iHeight = displayMetrics.heightPixels;
                }
                objS = Integer.valueOf(iHeight);
            } catch (Throwable th2) {
                ij.k kVar2 = ij.m.f21341c;
                objS = com.google.android.gms.internal.measurement.h5.s(th2);
            }
            Object objValueOf = Integer.valueOf(context.getResources().getDisplayMetrics().heightPixels);
            if (objS instanceof ij.l) {
                objS = objValueOf;
            }
            return ((Number) objS).intValue();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static final int a(Context context, float f10) {
        return yj.b.b(TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics()));
    }

    public static final int a(View view) {
        int i;
        if (view == null || !view.isShown() || (i = f41290a.a(view).f36778a) <= 0) {
            return 0;
        }
        int width = view.getLayoutParams().width > 0 ? view.getLayoutParams().width : view.getWidth();
        int height = view.getLayoutParams().height > 0 ? view.getLayoutParams().height : view.getHeight();
        if (height <= 0 || width <= 0) {
            return 0;
        }
        return (i * 100) / (height * width);
    }

    public static final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                if (viewGroup.getParent() instanceof ViewGroup) {
                    ViewParent parent = viewGroup.getParent();
                    Intrinsics.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(viewGroup);
                }
            } catch (Exception unused) {
            }
            try {
                viewGroup.removeAllViews();
            } catch (Exception unused2) {
            }
        }
    }

    public static final int a(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }
}
