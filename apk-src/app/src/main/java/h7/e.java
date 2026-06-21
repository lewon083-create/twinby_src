package h7;

import a0.u;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import f7.k;
import f7.l;
import f7.n;
import g2.c1;
import g2.d1;
import g2.e1;
import g2.f1;
import g2.g1;
import g2.h1;
import g2.i1;
import g2.x1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static f7.c a(l windowMetrics, FoldingFeature oemFeature) {
        f7.b bVar;
        f7.b bVar2;
        Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
        Intrinsics.checkNotNullParameter(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            bVar = f7.b.f16670h;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = f7.b.i;
        }
        int state = oemFeature.getState();
        if (state == 1) {
            bVar2 = f7.b.f16668f;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = f7.b.f16669g;
        }
        Rect rect = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(rect, "oemFeature.bounds");
        Intrinsics.checkNotNullParameter(rect, "rect");
        int i = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        if (i > i11) {
            throw new IllegalArgumentException(u.j(i, i11, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i10 > i12) {
            throw new IllegalArgumentException(u.j(i10, i12, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
        Rect rectA = windowMetrics.f16691a.a();
        int i13 = i12 - i10;
        if (i13 == 0 && i11 - i == 0) {
            return null;
        }
        int i14 = i11 - i;
        if (i14 != rectA.width() && i13 != rectA.height()) {
            return null;
        }
        if (i14 < rectA.width() && i13 < rectA.height()) {
            return null;
        }
        if (i14 == rectA.width() && i13 == rectA.height()) {
            return null;
        }
        Rect bounds = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "oemFeature.bounds");
        return new f7.c(new c7.b(bounds), bVar, bVar2);
    }

    public static k b(Context context, WindowLayoutInfo info) throws Exception {
        l lVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            if (i < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            n nVar = n.f16694b;
            return c(n.a((Activity) context), info);
        }
        n nVar2 = n.f16694b;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i < 30) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context baseContext = context;
            while (baseContext instanceof ContextWrapper) {
                boolean z5 = baseContext instanceof Activity;
                if (!z5 && !(baseContext instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                    if (contextWrapper.getBaseContext() != null) {
                        baseContext = contextWrapper.getBaseContext();
                        Intrinsics.checkNotNullExpressionValue(baseContext, "iterator.baseContext");
                    }
                }
                if (z5) {
                    lVar = n.a((Activity) context);
                } else {
                    if (!(baseContext instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    Intrinsics.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    Intrinsics.checkNotNullExpressionValue(defaultDisplay, "wm.defaultDisplay");
                    Point pointC = n.c(defaultDisplay);
                    Rect rect = new Rect(0, 0, pointC.x, pointC.y);
                    int i10 = Build.VERSION.SDK_INT;
                    x1 x1VarB = (i10 >= 36 ? new i1() : i10 >= 35 ? new h1() : i10 >= 34 ? new g1() : i10 >= 31 ? new f1() : i10 >= 30 ? new e1() : i10 >= 29 ? new d1() : new c1()).b();
                    Intrinsics.checkNotNullExpressionValue(x1VarB, "Builder().build()");
                    lVar = new l(rect, x1VarB);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        Intrinsics.checkNotNullParameter(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        x1 x1VarG = x1.g(null, windowManager.getCurrentWindowMetrics().getWindowInsets());
        Intrinsics.checkNotNullExpressionValue(x1VarG, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "wm.currentWindowMetrics.bounds");
        lVar = new l(bounds, x1VarG);
        return c(lVar, info);
    }

    public static k c(l windowMetrics, WindowLayoutInfo info) {
        f7.c cVarA;
        Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
        Intrinsics.checkNotNullParameter(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                Intrinsics.checkNotNullExpressionValue(feature, "feature");
                cVarA = a(windowMetrics, feature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new k(arrayList);
    }
}
