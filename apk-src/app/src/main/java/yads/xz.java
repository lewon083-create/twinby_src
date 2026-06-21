package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xz implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx1 f44849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw1 f44850b;

    public xz(dx1 dx1Var, xw1 xw1Var) {
        this.f44849a = dx1Var;
        this.f44850b = xw1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        xw1 xw1Var = this.f44850b;
        if (xw1Var != null) {
            xw1Var.a();
            xw1Var.f44827f = false;
        }
        dx1 dx1Var = this.f44849a;
        if (dx1Var.f37910c) {
            dx1Var.a("first_click_on_controls");
            dx1Var.f37910c = false;
        }
    }

    public /* synthetic */ xz(dx1 dx1Var, xw1 xw1Var, int i) {
        this(dx1Var, xw1Var);
    }
}
