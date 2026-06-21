package yads;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class uc {
    public static void a(ViewGroup viewGroup) {
        zl.g0 g0Var = new zl.g0(24);
        Field field = g2.n0.f19900a;
        g2.f0.c(viewGroup, g0Var);
    }

    public static final g2.x1 a(View view, g2.x1 x1Var) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), x1Var.f19943a.h(647).f35692d);
        return g2.x1.f19942b;
    }
}
