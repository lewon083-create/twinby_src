package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class kk3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f40235b = {wb.a(kk3.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm2 f40236a;

    public kk3(View view) {
        this.f40236a = om2.a(view);
    }

    public void a(View view) {
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public abstract boolean a(View view, Object obj);

    public final View b() {
        nm2 nm2Var = this.f40236a;
        dk.i iVar = f40235b[0];
        return (View) nm2Var.f41294a.get();
    }

    public abstract void b(View view, Object obj);

    public final boolean c() {
        View viewB = b();
        return viewB != null && !nl3.b(viewB) && viewB.getWidth() >= 1 && viewB.getHeight() >= 1;
    }

    public void a(oi oiVar, nk3 nk3Var, Object obj) {
        View viewB = b();
        if (viewB == null) {
            return;
        }
        nk3Var.a(viewB, oiVar);
        nk3Var.a(oiVar, new mk3(viewB));
    }
}
