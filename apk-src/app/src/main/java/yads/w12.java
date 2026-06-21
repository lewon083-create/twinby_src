package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w12 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f44252e = {wb.a(w12.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q32 f44253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r12 f44254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q12 f44255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nm2 f44256d;

    public w12(View view, q32 q32Var, r12 r12Var) {
        this.f44253a = q32Var;
        this.f44254b = r12Var;
        this.f44256d = om2.a(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        nm2 nm2Var = this.f44256d;
        dk.i[] iVarArr = f44252e;
        dk.i iVar = iVarArr[0];
        View view = (View) nm2Var.f41294a.get();
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
        nm2 nm2Var2 = this.f44256d;
        dk.i iVar2 = iVarArr[0];
        View view2 = (View) nm2Var2.f41294a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            r12 r12Var = this.f44254b;
            q32 q32Var = this.f44253a;
            r12Var.getClass();
            q12 q12Var = new q12(view2, q32Var);
            this.f44255c = q12Var;
            nm2 nm2Var3 = q12Var.f42136b;
            dk.i iVar3 = q12.f42134d[0];
            View view3 = (View) nm2Var3.f41294a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(q12Var);
        }
    }

    public final void b() {
        q12 q12Var = this.f44255c;
        if (q12Var != null) {
            q12Var.a();
        }
        this.f44255c = null;
        nm2 nm2Var = this.f44256d;
        dk.i iVar = f44252e[0];
        View view = (View) nm2Var.f41294a.get();
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        this.f44253a.f42161a.g();
        nm2 nm2Var = this.f44256d;
        dk.i iVar = f44252e[0];
        View view2 = (View) nm2Var.f41294a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            r12 r12Var = this.f44254b;
            q32 q32Var = this.f44253a;
            r12Var.getClass();
            q12 q12Var = new q12(view2, q32Var);
            this.f44255c = q12Var;
            nm2 nm2Var2 = q12Var.f42136b;
            dk.i iVar2 = q12.f42134d[0];
            View view3 = (View) nm2Var2.f41294a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(q12Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        q12 q12Var = this.f44255c;
        if (q12Var != null) {
            q12Var.a();
        }
        this.f44255c = null;
        this.f44253a.f42161a.h();
    }
}
