package g2;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {
    public static x1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        x1 x1VarG = x1.g(null, rootWindowInsets);
        t1 t1Var = x1VarG.f19943a;
        t1Var.v(x1VarG);
        View rootView = view.getRootView();
        t1Var.d(rootView);
        t1Var.n(rootView);
        t1Var.o();
        return x1VarG;
    }
}
