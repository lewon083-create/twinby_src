package g2;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.twinby.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends a1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f19938e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c3.a f19939f = new c3.a(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f19940g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f19941h = new AccelerateInterpolator(1.5f);

    public static void e(View view) {
        ac.i iVarJ = j(view);
        if (iVarJ != null) {
            ((View) iVarJ.f758d).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, x1 x1Var, boolean z5) {
        ac.i iVarJ = j(view);
        if (iVarJ != null) {
            iVarJ.f757c = x1Var;
            if (!z5) {
                View view2 = (View) iVarJ.f758d;
                int[] iArr = (int[]) iVarJ.f759e;
                view2.getLocationOnScreen(iArr);
                z5 = true;
                iVarJ.f755a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), x1Var, z5);
            }
        }
    }

    public static void g(View view, x1 x1Var, List list) {
        ac.i iVarJ = j(view);
        if (iVarJ != null) {
            iVarJ.i(x1Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), x1Var, list);
            }
        }
    }

    public static void h(View view, a1.e eVar) {
        ac.i iVarJ = j(view);
        if (iVarJ != null) {
            View view2 = (View) iVarJ.f758d;
            int[] iArr = (int[]) iVarJ.f759e;
            view2.getLocationOnScreen(iArr);
            int i = iVarJ.f755a - iArr[1];
            iVarJ.f756b = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), eVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static ac.i j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof w0) {
            return ((w0) tag).f19935a;
        }
        return null;
    }
}
