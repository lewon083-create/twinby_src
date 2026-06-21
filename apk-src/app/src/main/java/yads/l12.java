package yads;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l12 implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ou f40411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f02 f40412b;

    public l12(ou ouVar, f02 f02Var) {
        this.f40411a = ouVar;
        this.f40412b = f02Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f40411a.f41724a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        f02 f02Var = this.f40412b;
        f02Var.getClass();
        if ((view instanceof TextView) || (view instanceof vl2)) {
            f02Var.a(view, motionEvent);
        }
        return this.f40411a.onTouch(view, motionEvent);
    }
}
