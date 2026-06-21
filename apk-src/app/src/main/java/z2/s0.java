package z2;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f45963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s0 f45964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s0 f45965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s0 f45966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ s0[] f45967f;

    static {
        s0 s0Var = new s0("REMOVED", 0);
        f45963b = s0Var;
        s0 s0Var2 = new s0("VISIBLE", 1);
        f45964c = s0Var2;
        s0 s0Var3 = new s0("GONE", 2);
        f45965d = s0Var3;
        s0 s0Var4 = new s0("INVISIBLE", 3);
        f45966e = s0Var4;
        f45967f = new s0[]{s0Var, s0Var2, s0Var3, s0Var4};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f45967f.clone();
    }

    public final void a(View view, ViewGroup container) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (h0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (h0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (h0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iOrdinal == 2) {
            if (h0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iOrdinal != 3) {
            return;
        }
        if (h0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}
