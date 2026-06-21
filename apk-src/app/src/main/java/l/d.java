package l;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import g2.n0;
import java.lang.reflect.Field;
import ni.x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27594c;

    public /* synthetic */ d(int i, Object obj) {
        this.f27593b = i;
        this.f27594c = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f27593b;
        Object obj = this.f27594c;
        switch (i) {
            case 0:
            case 1:
                break;
            case 2:
                qc.m mVar = (qc.m) obj;
                AccessibilityManager accessibilityManager = mVar.f32049u;
                if (mVar.f32050v != null && accessibilityManager != null) {
                    Field field = n0.f19900a;
                    if (mVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new h2.b(mVar.f32050v));
                    }
                    break;
                }
                break;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                Field field2 = n0.f19900a;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f27593b) {
            case 0:
                f fVar = (f) this.f27594c;
                ViewTreeObserver viewTreeObserver = fVar.f27619y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f27619y = view.getViewTreeObserver();
                    }
                    fVar.f27619y.removeGlobalOnLayoutListener(fVar.f27604j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                s sVar = (s) this.f27594c;
                ViewTreeObserver viewTreeObserver2 = sVar.f27697p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f27697p = view.getViewTreeObserver();
                    }
                    sVar.f27697p.removeGlobalOnLayoutListener(sVar.f27691j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                qc.m mVar = (qc.m) this.f27594c;
                x0 x0Var = mVar.f32050v;
                if (x0Var != null && (accessibilityManager = mVar.f32049u) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new h2.b(x0Var));
                    break;
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
