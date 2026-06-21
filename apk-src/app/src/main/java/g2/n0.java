package g2;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.twinby.R;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f19900a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f19901b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f19902c = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f19903d = new z();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f19904e = new b0();

    public static x1 a(View view, x1 x1Var) {
        WindowInsets windowInsetsF = x1Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? k0.a(view, windowInsetsF) : d0.a(view, windowInsetsF);
            if (!windowInsetsA.equals(windowInsetsF)) {
                return x1.g(view, windowInsetsA);
            }
        }
        return x1Var;
    }

    public static View.AccessibilityDelegate b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return j0.a(view);
        }
        if (f19901b) {
            return null;
        }
        if (f19900a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f19900a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f19901b = true;
                return null;
            }
        }
        try {
            Object obj = f19900a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f19901b = true;
            return null;
        }
    }

    public static CharSequence c(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = i0.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] e(m.s sVar) {
        return Build.VERSION.SDK_INT >= 31 ? l0.a(sVar) : (String[]) sVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void f(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z5 = c(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z5) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z5 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z5) {
                    accessibilityEventObtain.getText().add(c(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e3) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e3);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(c(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f g(View view, f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + fVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return l0.b(view, fVar);
        }
        j2.i iVar = (j2.i) view.getTag(R.id.tag_on_receive_content_listener);
        r rVar = f19903d;
        if (iVar == null) {
            if (view instanceof r) {
                rVar = (r) view;
            }
            return rVar.onReceiveContent(fVar);
        }
        f fVarA = j2.i.a(view, fVar);
        if (fVarA == null) {
            return null;
        }
        if (view instanceof r) {
            rVar = (r) view;
        }
        return rVar.onReceiveContent(fVarA);
    }

    public static void h(View view, int i) {
        ArrayList arrayListD = d(view);
        for (int i10 = 0; i10 < arrayListD.size(); i10++) {
            if (((h2.c) arrayListD.get(i10)).a() == i) {
                arrayListD.remove(i10);
                return;
            }
        }
    }

    public static void i(View view, h2.c cVar, h2.q qVar) {
        h2.c cVar2 = new h2.c(null, cVar.f20356b, null, qVar, cVar.f20357c);
        View.AccessibilityDelegate accessibilityDelegateB = b(view);
        b bVar = accessibilityDelegateB == null ? null : accessibilityDelegateB instanceof a ? ((a) accessibilityDelegateB).f19827a : new b(accessibilityDelegateB);
        if (bVar == null) {
            bVar = new b();
        }
        k(view, bVar);
        h(view, cVar2.a());
        d(view).add(cVar2);
        f(view, 0);
    }

    public static void j(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            j0.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void k(View view, b bVar) {
        if (bVar == null && (b(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.getBridge());
    }

    public static void l(View view, CharSequence charSequence) {
        new a0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).f(view, charSequence);
        b0 b0Var = f19904e;
        if (charSequence == null) {
            b0Var.f19834b.remove(view);
            view.removeOnAttachStateChangeListener(b0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(b0Var);
        } else {
            b0Var.f19834b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(b0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(b0Var);
            }
        }
    }
}
