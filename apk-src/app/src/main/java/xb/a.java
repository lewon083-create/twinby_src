package xb;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.n;
import g2.n0;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends r1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f36054a;

    @Override // r1.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f36054a == null) {
            this.f36054a = new n(view);
        }
        n nVar = this.f36054a;
        View view2 = nVar.f14595b;
        nVar.f14596c = view2.getTop();
        nVar.f14597d = view2.getLeft();
        n nVar2 = this.f36054a;
        View view3 = nVar2.f14595b;
        int top = 0 - (view3.getTop() - nVar2.f14596c);
        Field field = n0.f19900a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - nVar2.f14597d));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
