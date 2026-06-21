package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q12 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f42134d = {wb.a(q12.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q32 f42135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nm2 f42136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f42137c;

    public q12(View view, q32 q32Var) {
        this.f42135a = q32Var;
        this.f42136b = om2.a(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        nm2 nm2Var = this.f42136b;
        dk.i iVar = f42134d[0];
        View view = (View) nm2Var.f41294a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        nm2 nm2Var = this.f42136b;
        dk.i iVar = f42134d[0];
        View view = (View) nm2Var.f41294a.get();
        if (view != null) {
            int visibility = view.getVisibility();
            Integer num = this.f42137c;
            if (num != null && visibility == num.intValue()) {
                return;
            }
            this.f42137c = Integer.valueOf(visibility);
            if (visibility == 0) {
                this.f42135a.f42161a.g();
            } else {
                this.f42135a.f42161a.h();
            }
        }
    }
}
